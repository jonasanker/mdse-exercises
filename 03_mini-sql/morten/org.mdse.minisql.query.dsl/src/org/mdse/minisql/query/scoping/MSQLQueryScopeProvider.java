/*
 * generated by Xtext 2.20.0
 */
package org.mdse.minisql.query.scoping;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.mdse.minisql.query.SelectQuery;
import schema.Column;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class MSQLQueryScopeProvider extends AbstractMSQLQueryScopeProvider {

	@Override
	public IScope getScope(EObject context, EReference reference) {

		// If 'what' reference of the SelectQuery
		if (context instanceof SelectQuery && reference.getName().contentEquals("what")) {

			// Provide custom scope
			SelectQuery selectQuery = (SelectQuery)context;
			return getScope(selectQuery);
		}

		return super.delegateGetScope(context, reference);
	}
	
	protected IScope getScope(SelectQuery selectQuery) {
		schema.Table table = selectQuery.getFrom();
		EList<Column> columns = table.getColumn();
		return Scopes.scopeFor(columns);
	}
}
