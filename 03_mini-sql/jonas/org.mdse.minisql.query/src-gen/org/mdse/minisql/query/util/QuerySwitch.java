/**
 */
package org.mdse.minisql.query.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.mdse.minisql.query.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.mdse.minisql.query.QueryPackage
 * @generated
 */
public class QuerySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QueryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuerySwitch() {
		if (modelPackage == null) {
			modelPackage = QueryPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case QueryPackage.SELECT_QUERY: {
			SelectQuery selectQuery = (SelectQuery) theEObject;
			T result = caseSelectQuery(selectQuery);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QueryPackage.FROM_CLAUSE: {
			FromClause fromClause = (FromClause) theEObject;
			T result = caseFromClause(fromClause);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QueryPackage.WHAT_CLAUSE: {
			WhatClause whatClause = (WhatClause) theEObject;
			T result = caseWhatClause(whatClause);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QueryPackage.WHAT_DIRECTIVE: {
			WhatDirective whatDirective = (WhatDirective) theEObject;
			T result = caseWhatDirective(whatDirective);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QueryPackage.COLUMN_REFERENCE: {
			ColumnReference columnReference = (ColumnReference) theEObject;
			T result = caseColumnReference(columnReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QueryPackage.SINGLE_COLUMN_WHAT_DIRECTIVE: {
			SingleColumnWhatDirective singleColumnWhatDirective = (SingleColumnWhatDirective) theEObject;
			T result = caseSingleColumnWhatDirective(singleColumnWhatDirective);
			if (result == null)
				result = caseWhatDirective(singleColumnWhatDirective);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QueryPackage.ALL_COLUMNS_WHAT_DIRECTIVE: {
			AllColumnsWhatDirective allColumnsWhatDirective = (AllColumnsWhatDirective) theEObject;
			T result = caseAllColumnsWhatDirective(allColumnsWhatDirective);
			if (result == null)
				result = caseWhatDirective(allColumnsWhatDirective);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QueryPackage.ORDER_BY_CLAUSE: {
			OrderByClause orderByClause = (OrderByClause) theEObject;
			T result = caseOrderByClause(orderByClause);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QueryPackage.ORDER_BY_DIRECTIVE: {
			OrderByDirective orderByDirective = (OrderByDirective) theEObject;
			T result = caseOrderByDirective(orderByDirective);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectQuery(SelectQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFromClause(FromClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>What Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>What Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhatClause(WhatClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>What Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>What Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhatDirective(WhatDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnReference(ColumnReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Column What Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Column What Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleColumnWhatDirective(SingleColumnWhatDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Columns What Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Columns What Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllColumnsWhatDirective(AllColumnsWhatDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order By Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order By Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderByClause(OrderByClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order By Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order By Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderByDirective(OrderByDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //QuerySwitch
