/**
 */
package org.mdse.minisql.query;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Where Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.minisql.query.WhereClause#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.mdse.minisql.query.QueryPackage#getWhereClause()
 * @model
 * @generated
 */
public interface WhereClause extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.minisql.query.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see org.mdse.minisql.query.QueryPackage#getWhereClause_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getExpression();

} // WhereClause
