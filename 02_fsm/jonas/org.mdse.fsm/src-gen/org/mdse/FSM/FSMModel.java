/**
 */
package org.mdse.FSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.FSM.FSMModel#getStatemachines <em>Statemachines</em>}</li>
 * </ul>
 *
 * @see org.mdse.FSM.FSMPackage#getFSMModel()
 * @model
 * @generated
 */
public interface FSMModel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Statemachines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statemachines</em>' containment reference.
	 * @see #setStatemachines(StateMachine)
	 * @see org.mdse.FSM.FSMPackage#getFSMModel_Statemachines()
	 * @model containment="true"
	 * @generated
	 */
	StateMachine getStatemachines();

	/**
	 * Sets the value of the '{@link org.mdse.FSM.FSMModel#getStatemachines <em>Statemachines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statemachines</em>' containment reference.
	 * @see #getStatemachines()
	 * @generated
	 */
	void setStatemachines(StateMachine value);

} // FSMModel
