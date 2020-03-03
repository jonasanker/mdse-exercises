/**
 */
package org.mdse.minisql.query;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.minisql.query.IntegerLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.mdse.minisql.query.QueryPackage#getIntegerLiteral()
 * @model
 * @generated
 */
public interface IntegerLiteral extends Expression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.mdse.minisql.query.QueryPackage#getIntegerLiteral_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.mdse.minisql.query.IntegerLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // IntegerLiteral
