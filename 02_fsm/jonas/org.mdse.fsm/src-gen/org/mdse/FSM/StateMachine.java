/**
 */
package org.mdse.FSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.FSM.StateMachine#getInitial <em>Initial</em>}</li>
 *   <li>{@link org.mdse.FSM.StateMachine#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see org.mdse.FSM.FSMPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Initial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' reference.
	 * @see #setInitial(State)
	 * @see org.mdse.FSM.FSMPackage#getStateMachine_Initial()
	 * @model required="true"
	 * @generated
	 */
	State getInitial();

	/**
	 * Sets the value of the '{@link org.mdse.FSM.StateMachine#getInitial <em>Initial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' reference.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(State value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.FSM.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see org.mdse.FSM.FSMPackage#getStateMachine_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

} // StateMachine
