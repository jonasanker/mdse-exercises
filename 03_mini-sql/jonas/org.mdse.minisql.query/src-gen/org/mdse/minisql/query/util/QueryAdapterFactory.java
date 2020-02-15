/**
 */
package org.mdse.minisql.query.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.mdse.minisql.query.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.mdse.minisql.query.QueryPackage
 * @generated
 */
public class QueryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QueryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QueryPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuerySwitch<Adapter> modelSwitch = new QuerySwitch<Adapter>() {
		@Override
		public Adapter caseSelectQuery(SelectQuery object) {
			return createSelectQueryAdapter();
		}

		@Override
		public Adapter caseFromClause(FromClause object) {
			return createFromClauseAdapter();
		}

		@Override
		public Adapter caseWhatClause(WhatClause object) {
			return createWhatClauseAdapter();
		}

		@Override
		public Adapter caseWhatDirective(WhatDirective object) {
			return createWhatDirectiveAdapter();
		}

		@Override
		public Adapter caseColumnReference(ColumnReference object) {
			return createColumnReferenceAdapter();
		}

		@Override
		public Adapter caseSingleColumnWhatDirective(SingleColumnWhatDirective object) {
			return createSingleColumnWhatDirectiveAdapter();
		}

		@Override
		public Adapter caseAllColumnsWhatDirective(AllColumnsWhatDirective object) {
			return createAllColumnsWhatDirectiveAdapter();
		}

		@Override
		public Adapter caseOrderByClause(OrderByClause object) {
			return createOrderByClauseAdapter();
		}

		@Override
		public Adapter caseOrderByDirective(OrderByDirective object) {
			return createOrderByDirectiveAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mdse.minisql.query.SelectQuery <em>Select Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mdse.minisql.query.SelectQuery
	 * @generated
	 */
	public Adapter createSelectQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mdse.minisql.query.FromClause <em>From Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mdse.minisql.query.FromClause
	 * @generated
	 */
	public Adapter createFromClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mdse.minisql.query.WhatClause <em>What Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mdse.minisql.query.WhatClause
	 * @generated
	 */
	public Adapter createWhatClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mdse.minisql.query.WhatDirective <em>What Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mdse.minisql.query.WhatDirective
	 * @generated
	 */
	public Adapter createWhatDirectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mdse.minisql.query.ColumnReference <em>Column Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mdse.minisql.query.ColumnReference
	 * @generated
	 */
	public Adapter createColumnReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mdse.minisql.query.SingleColumnWhatDirective <em>Single Column What Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mdse.minisql.query.SingleColumnWhatDirective
	 * @generated
	 */
	public Adapter createSingleColumnWhatDirectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mdse.minisql.query.AllColumnsWhatDirective <em>All Columns What Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mdse.minisql.query.AllColumnsWhatDirective
	 * @generated
	 */
	public Adapter createAllColumnsWhatDirectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mdse.minisql.query.OrderByClause <em>Order By Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mdse.minisql.query.OrderByClause
	 * @generated
	 */
	public Adapter createOrderByClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mdse.minisql.query.OrderByDirective <em>Order By Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mdse.minisql.query.OrderByDirective
	 * @generated
	 */
	public Adapter createOrderByDirectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //QueryAdapterFactory
