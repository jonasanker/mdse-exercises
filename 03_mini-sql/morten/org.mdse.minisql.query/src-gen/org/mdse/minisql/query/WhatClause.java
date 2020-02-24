/**
 */
package org.mdse.minisql.query;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>What Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.minisql.query.WhatClause#getWhatDirective <em>What Directive</em>}</li>
 * </ul>
 *
 * @see org.mdse.minisql.query.QueryPackage#getWhatClause()
 * @model
 * @generated
 */
public interface WhatClause extends EObject {
	/**
	 * Returns the value of the '<em><b>What Directive</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.minisql.query.WhatDirective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>What Directive</em>' containment reference list.
	 * @see org.mdse.minisql.query.QueryPackage#getWhatClause_WhatDirective()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<WhatDirective> getWhatDirective();

} // WhatClause
