/**
 */
package org.mdse.minisql.query;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import schema.Column;
import schema.Table;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.minisql.query.SelectQuery#getFrom <em>From</em>}</li>
 *   <li>{@link org.mdse.minisql.query.SelectQuery#getWhat <em>What</em>}</li>
 * </ul>
 *
 * @see org.mdse.minisql.query.QueryPackage#getSelectQuery()
 * @model
 * @generated
 */
public interface SelectQuery extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Table)
	 * @see org.mdse.minisql.query.QueryPackage#getSelectQuery_From()
	 * @model required="true"
	 * @generated
	 */
	Table getFrom();

	/**
	 * Sets the value of the '{@link org.mdse.minisql.query.SelectQuery#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Table value);

	/**
	 * Returns the value of the '<em><b>What</b></em>' reference list.
	 * The list contents are of type {@link schema.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>What</em>' reference list.
	 * @see org.mdse.minisql.query.QueryPackage#getSelectQuery_What()
	 * @model required="true"
	 * @generated
	 */
	EList<Column> getWhat();

} // SelectQuery
