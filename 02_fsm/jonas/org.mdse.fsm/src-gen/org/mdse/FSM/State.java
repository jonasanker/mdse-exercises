/**
 */
package org.mdse.FSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.FSM.State#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link org.mdse.FSM.State#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see org.mdse.FSM.FSMPackage#getState()
 * @model
 * @generated
 */
public interface State extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Is Final</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Final</em>' attribute.
	 * @see #setIsFinal(boolean)
	 * @see org.mdse.FSM.FSMPackage#getState_IsFinal()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsFinal();

	/**
	 * Sets the value of the '{@link org.mdse.FSM.State#isIsFinal <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Final</em>' attribute.
	 * @see #isIsFinal()
	 * @generated
	 */
	void setIsFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' reference list.
	 * The list contents are of type {@link org.mdse.FSM.Transition}.
	 * It is bidirectional and its opposite is '{@link org.mdse.FSM.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' reference list.
	 * @see org.mdse.FSM.FSMPackage#getState_Transitions()
	 * @see org.mdse.FSM.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getTransitions();

} // State
