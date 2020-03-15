/**
 */
package org.mdse.minisql.query;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.minisql.query.OrderDirective#getColumnReference <em>Column Reference</em>}</li>
 *   <li>{@link org.mdse.minisql.query.OrderDirective#getAscending <em>Ascending</em>}</li>
 * </ul>
 *
 * @see org.mdse.minisql.query.QueryPackage#getOrderDirective()
 * @model
 * @generated
 */
public interface OrderDirective extends EObject {
	/**
	 * Returns the value of the '<em><b>Column Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Reference</em>' containment reference.
	 * @see #setColumnReference(ColumnReference)
	 * @see org.mdse.minisql.query.QueryPackage#getOrderDirective_ColumnReference()
	 * @model containment="true"
	 * @generated
	 */
	ColumnReference getColumnReference();

	/**
	 * Sets the value of the '{@link org.mdse.minisql.query.OrderDirective#getColumnReference <em>Column Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Reference</em>' containment reference.
	 * @see #getColumnReference()
	 * @generated
	 */
	void setColumnReference(ColumnReference value);

	/**
	 * Returns the value of the '<em><b>Ascending</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ascending</em>' attribute.
	 * @see #setAscending(Boolean)
	 * @see org.mdse.minisql.query.QueryPackage#getOrderDirective_Ascending()
	 * @model default="true"
	 * @generated
	 */
	Boolean getAscending();

	/**
	 * Sets the value of the '{@link org.mdse.minisql.query.OrderDirective#getAscending <em>Ascending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ascending</em>' attribute.
	 * @see #getAscending()
	 * @generated
	 */
	void setAscending(Boolean value);

} // OrderDirective
