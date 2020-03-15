/**
 */
package org.mdse.genealogy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.genealogy.Person#getName <em>Name</em>}</li>
 *   <li>{@link org.mdse.genealogy.Person#getAge <em>Age</em>}</li>
 *   <li>{@link org.mdse.genealogy.Person#isAlive <em>Alive</em>}</li>
 *   <li>{@link org.mdse.genealogy.Person#getParents <em>Parents</em>}</li>
 *   <li>{@link org.mdse.genealogy.Person#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.mdse.genealogy.GenealogyPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mdse.genealogy.GenealogyPackage#getPerson_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mdse.genealogy.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see org.mdse.genealogy.GenealogyPackage#getPerson_Age()
	 * @model required="true"
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link org.mdse.genealogy.Person#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Alive</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alive</em>' attribute.
	 * @see #setAlive(boolean)
	 * @see org.mdse.genealogy.GenealogyPackage#getPerson_Alive()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isAlive();

	/**
	 * Sets the value of the '{@link org.mdse.genealogy.Person#isAlive <em>Alive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alive</em>' attribute.
	 * @see #isAlive()
	 * @generated
	 */
	void setAlive(boolean value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.mdse.genealogy.Person}.
	 * It is bidirectional and its opposite is '{@link org.mdse.genealogy.Person#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.mdse.genealogy.GenealogyPackage#getPerson_Children()
	 * @see org.mdse.genealogy.Person#getParents
	 * @model opposite="parents"
	 * @generated
	 */
	EList<Person> getChildren();

	/**
	 * Returns the value of the '<em><b>Parents</b></em>' reference list.
	 * The list contents are of type {@link org.mdse.genealogy.Person}.
	 * It is bidirectional and its opposite is '{@link org.mdse.genealogy.Person#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parents</em>' reference list.
	 * @see org.mdse.genealogy.GenealogyPackage#getPerson_Parents()
	 * @see org.mdse.genealogy.Person#getChildren
	 * @model opposite="children" upper="2"
	 * @generated
	 */
	EList<Person> getParents();

} // Person
