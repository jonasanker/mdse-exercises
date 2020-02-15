/**
 */
package org.mdse.fsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FSM Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.fsm.FSMModel#getStateMachines <em>State Machines</em>}</li>
 * </ul>
 *
 * @see org.mdse.fsm.FsmPackage#getFSMModel()
 * @model
 * @generated
 */
public interface FSMModel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>State Machines</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.fsm.StateMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machines</em>' containment reference list.
	 * @see org.mdse.fsm.FsmPackage#getFSMModel_StateMachines()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateMachine> getStateMachines();

} // FSMModel
