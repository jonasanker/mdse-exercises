/**
 */
package org.mdse.minisql.query;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.minisql.query.SelectQuery#getOrderByClause <em>Order By Clause</em>}</li>
 *   <li>{@link org.mdse.minisql.query.SelectQuery#getWhatClause <em>What Clause</em>}</li>
 *   <li>{@link org.mdse.minisql.query.SelectQuery#getFromClause <em>From Clause</em>}</li>
 * </ul>
 *
 * @see org.mdse.minisql.query.QueryPackage#getSelectQuery()
 * @model
 * @generated
 */
public interface SelectQuery extends EObject {
	/**
	 * Returns the value of the '<em><b>From Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Clause</em>' containment reference.
	 * @see #setFromClause(FromClause)
	 * @see org.mdse.minisql.query.QueryPackage#getSelectQuery_FromClause()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FromClause getFromClause();

	/**
	 * Sets the value of the '{@link org.mdse.minisql.query.SelectQuery#getFromClause <em>From Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Clause</em>' containment reference.
	 * @see #getFromClause()
	 * @generated
	 */
	void setFromClause(FromClause value);

	/**
	 * Returns the value of the '<em><b>Order By Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order By Clause</em>' containment reference.
	 * @see #setOrderByClause(OrderByClause)
	 * @see org.mdse.minisql.query.QueryPackage#getSelectQuery_OrderByClause()
	 * @model containment="true"
	 * @generated
	 */
	OrderByClause getOrderByClause();

	/**
	 * Sets the value of the '{@link org.mdse.minisql.query.SelectQuery#getOrderByClause <em>Order By Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order By Clause</em>' containment reference.
	 * @see #getOrderByClause()
	 * @generated
	 */
	void setOrderByClause(OrderByClause value);

	/**
	 * Returns the value of the '<em><b>What Clause</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.minisql.query.WhatClause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>What Clause</em>' containment reference list.
	 * @see org.mdse.minisql.query.QueryPackage#getSelectQuery_WhatClause()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<WhatClause> getWhatClause();

} // SelectQuery
