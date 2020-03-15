/**
 */
package org.mdse.genealogy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Genealogy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.genealogy.Genealogy#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @see org.mdse.genealogy.GenealogyPackage#getGenealogy()
 * @model
 * @generated
 */
public interface Genealogy extends EObject {
	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.genealogy.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see org.mdse.genealogy.GenealogyPackage#getGenealogy_Persons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPersons();

} // Genealogy
