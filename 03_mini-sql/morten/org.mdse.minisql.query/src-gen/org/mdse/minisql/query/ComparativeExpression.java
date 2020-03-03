/**
 */
package org.mdse.minisql.query;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparative Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.minisql.query.ComparativeExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.mdse.minisql.query.ComparativeExpression#getExpression1 <em>Expression1</em>}</li>
 *   <li>{@link org.mdse.minisql.query.ComparativeExpression#getExpression2 <em>Expression2</em>}</li>
 * </ul>
 *
 * @see org.mdse.minisql.query.QueryPackage#getComparativeExpression()
 * @model
 * @generated
 */
public interface ComparativeExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The default value is <code>"LESS_THAN"</code>.
	 * The literals are from the enumeration {@link org.mdse.minisql.query.ComparativeOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.mdse.minisql.query.ComparativeOperator
	 * @see #setOperator(ComparativeOperator)
	 * @see org.mdse.minisql.query.QueryPackage#getComparativeExpression_Operator()
	 * @model default="LESS_THAN" required="true"
	 * @generated
	 */
	ComparativeOperator getOperator();

	/**
	 * Sets the value of the '{@link org.mdse.minisql.query.ComparativeExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.mdse.minisql.query.ComparativeOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparativeOperator value);

	/**
	 * Returns the value of the '<em><b>Expression1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression1</em>' containment reference.
	 * @see #setExpression1(Expression)
	 * @see org.mdse.minisql.query.QueryPackage#getComparativeExpression_Expression1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression1();

	/**
	 * Sets the value of the '{@link org.mdse.minisql.query.ComparativeExpression#getExpression1 <em>Expression1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression1</em>' containment reference.
	 * @see #getExpression1()
	 * @generated
	 */
	void setExpression1(Expression value);

	/**
	 * Returns the value of the '<em><b>Expression2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression2</em>' containment reference.
	 * @see #setExpression2(Expression)
	 * @see org.mdse.minisql.query.QueryPackage#getComparativeExpression_Expression2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression2();

	/**
	 * Sets the value of the '{@link org.mdse.minisql.query.ComparativeExpression#getExpression2 <em>Expression2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression2</em>' containment reference.
	 * @see #getExpression2()
	 * @generated
	 */
	void setExpression2(Expression value);

} // ComparativeExpression
