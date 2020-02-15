/**
 */
package org.mdse.FSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.FSM.Transition#getInput <em>Input</em>}</li>
 *   <li>{@link org.mdse.FSM.Transition#getOutput <em>Output</em>}</li>
 *   <li>{@link org.mdse.FSM.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link org.mdse.FSM.Transition#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.mdse.FSM.FSMPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see #setInput(String)
	 * @see org.mdse.FSM.FSMPackage#getTransition_Input()
	 * @model
	 * @generated
	 */
	String getInput();

	/**
	 * Sets the value of the '{@link org.mdse.FSM.Transition#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(String value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' attribute.
	 * @see #setOutput(String)
	 * @see org.mdse.FSM.FSMPackage#getTransition_Output()
	 * @model
	 * @generated
	 */
	String getOutput();

	/**
	 * Sets the value of the '{@link org.mdse.FSM.Transition#getOutput <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' attribute.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see org.mdse.FSM.FSMPackage#getTransition_Target()
	 * @model required="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link org.mdse.FSM.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mdse.FSM.State#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see org.mdse.FSM.FSMPackage#getTransition_Source()
	 * @see org.mdse.FSM.State#getTransitions
	 * @model opposite="transitions" required="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link org.mdse.FSM.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

} // Transition
