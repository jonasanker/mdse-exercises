/**
 */
package org.mdse.FSM.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mdse.FSM.FSMModel;
import org.mdse.FSM.FSMPackage;
import org.mdse.FSM.StateMachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.FSM.impl.FSMModelImpl#getStatemachines <em>Statemachines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FSMModelImpl extends NamedElementImpl implements FSMModel {
	/**
	 * The cached value of the '{@link #getStatemachines() <em>Statemachines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatemachines()
	 * @generated
	 * @ordered
	 */
	protected StateMachine statemachines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FSMModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FSMPackage.Literals.FSM_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateMachine getStatemachines() {
		return statemachines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatemachines(StateMachine newStatemachines, NotificationChain msgs) {
		StateMachine oldStatemachines = statemachines;
		statemachines = newStatemachines;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FSMPackage.FSM_MODEL__STATEMACHINES, oldStatemachines, newStatemachines);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatemachines(StateMachine newStatemachines) {
		if (newStatemachines != statemachines) {
			NotificationChain msgs = null;
			if (statemachines != null)
				msgs = ((InternalEObject)statemachines).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FSMPackage.FSM_MODEL__STATEMACHINES, null, msgs);
			if (newStatemachines != null)
				msgs = ((InternalEObject)newStatemachines).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FSMPackage.FSM_MODEL__STATEMACHINES, null, msgs);
			msgs = basicSetStatemachines(newStatemachines, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FSMPackage.FSM_MODEL__STATEMACHINES, newStatemachines, newStatemachines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FSMPackage.FSM_MODEL__STATEMACHINES:
				return basicSetStatemachines(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FSMPackage.FSM_MODEL__STATEMACHINES:
				return getStatemachines();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FSMPackage.FSM_MODEL__STATEMACHINES:
				setStatemachines((StateMachine)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FSMPackage.FSM_MODEL__STATEMACHINES:
				setStatemachines((StateMachine)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FSMPackage.FSM_MODEL__STATEMACHINES:
				return statemachines != null;
		}
		return super.eIsSet(featureID);
	}

} //FSMModelImpl
