package org.mdse.minisql.query.scoping;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.mdse.minisql.query.ColumnReference;
import org.mdse.minisql.query.FromClause;
import org.mdse.minisql.query.SelectQuery;

import schema.Column;
import schema.Table;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class QueryScopeProvider extends AbstractQueryScopeProvider {
	private static final String WHAT_REFERENCE = "what";
	
	@Override
	public IScope getScope(EObject context, EReference reference) {
		if (context instanceof ColumnReference) {
			ColumnReference colRef = (ColumnReference) context;
			
			return getColumnReferenceScope(colRef);
		}
		
		return super.getScope(context, reference);
	}

	private IScope getColumnReferenceScope(ColumnReference colRef) {
		EObject rootModelElement = EcoreUtil.getRootContainer(colRef);
		
		if (rootModelElement instanceof SelectQuery) {
			SelectQuery query = (SelectQuery) rootModelElement;
			FromClause from = query.getFromClause();
			
			Table table = from.getTable();
			List<Column> columns = table.getColumns();
			
			return Scopes.scopeFor(columns);
		}
		
		return null;
	}

//	private IScope getWhatScope(SelectQuery query) {
//		Table table = query.getFrom();
//		List<Column> columns = table.getColumns();
//		
//		return Scopes.scopeFor(columns);
//	}
}
