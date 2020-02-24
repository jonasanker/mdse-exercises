/**
 */
package org.mdse.minisql.query;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order By Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.minisql.query.OrderByDirective#getColumnReference <em>Column Reference</em>}</li>
 *   <li>{@link org.mdse.minisql.query.OrderByDirective#isAscending <em>Ascending</em>}</li>
 * </ul>
 *
 * @see org.mdse.minisql.query.QueryPackage#getOrderByDirective()
 * @model
 * @generated
 */
public interface OrderByDirective extends EObject {
	/**
	 * Returns the value of the '<em><b>Column Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.minisql.query.ColumnReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Reference</em>' containment reference list.
	 * @see org.mdse.minisql.query.QueryPackage#getOrderByDirective_ColumnReference()
	 * @model containment="true"
	 * @generated
	 */
	EList<ColumnReference> getColumnReference();

	/**
	 * Returns the value of the '<em><b>Ascending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ascending</em>' attribute.
	 * @see #setAscending(boolean)
	 * @see org.mdse.minisql.query.QueryPackage#getOrderByDirective_Ascending()
	 * @model
	 * @generated
	 */
	boolean isAscending();

	/**
	 * Sets the value of the '{@link org.mdse.minisql.query.OrderByDirective#isAscending <em>Ascending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ascending</em>' attribute.
	 * @see #isAscending()
	 * @generated
	 */
	void setAscending(boolean value);

} // OrderByDirective
