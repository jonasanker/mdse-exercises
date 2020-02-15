/**
 */
package org.mdse.minisql.query;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.mdse.minisql.query.QueryPackage
 * @generated
 */
public interface QueryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QueryFactory eINSTANCE = org.mdse.minisql.query.impl.QueryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Select Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Query</em>'.
	 * @generated
	 */
	SelectQuery createSelectQuery();

	/**
	 * Returns a new object of class '<em>From Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>From Clause</em>'.
	 * @generated
	 */
	FromClause createFromClause();

	/**
	 * Returns a new object of class '<em>What Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>What Clause</em>'.
	 * @generated
	 */
	WhatClause createWhatClause();

	/**
	 * Returns a new object of class '<em>What Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>What Directive</em>'.
	 * @generated
	 */
	WhatDirective createWhatDirective();

	/**
	 * Returns a new object of class '<em>Column Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column Reference</em>'.
	 * @generated
	 */
	ColumnReference createColumnReference();

	/**
	 * Returns a new object of class '<em>Single Column What Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Column What Directive</em>'.
	 * @generated
	 */
	SingleColumnWhatDirective createSingleColumnWhatDirective();

	/**
	 * Returns a new object of class '<em>All Columns What Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Columns What Directive</em>'.
	 * @generated
	 */
	AllColumnsWhatDirective createAllColumnsWhatDirective();

	/**
	 * Returns a new object of class '<em>Order By Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order By Clause</em>'.
	 * @generated
	 */
	OrderByClause createOrderByClause();

	/**
	 * Returns a new object of class '<em>Order By Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order By Directive</em>'.
	 * @generated
	 */
	OrderByDirective createOrderByDirective();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QueryPackage getQueryPackage();

} //QueryFactory
