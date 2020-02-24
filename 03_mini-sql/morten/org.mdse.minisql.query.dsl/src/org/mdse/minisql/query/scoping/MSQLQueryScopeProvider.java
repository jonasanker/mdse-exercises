/*
 * generated by Xtext 2.20.0
 */
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
public class MSQLQueryScopeProvider extends AbstractMSQLQueryScopeProvider {

	@Override
	public IScope getScope(EObject context, EReference reference) {

		// If column reference
		if (context instanceof ColumnReference) {

			// Provide custom scope
			ColumnReference columnReference = (ColumnReference)context;
			return getScope(columnReference);
		}

		return super.delegateGetScope(context, reference);
	}
	
	protected IScope getScope(ColumnReference columnReference) {
		// Get the root model element via reflection on the model
		EObject rootModelElement = EcoreUtil.getRootContainer(columnReference);
		
		if (rootModelElement instanceof SelectQuery) {
			SelectQuery selectQuery = (SelectQuery) rootModelElement;
			FromClause fromClause = selectQuery.getFromClause();
			
			Table table = fromClause.getTable();
			List<Column> columns = table.getColumn();
			
			return Scopes.scopeFor(columns);
		}

		return null;
	}
}
