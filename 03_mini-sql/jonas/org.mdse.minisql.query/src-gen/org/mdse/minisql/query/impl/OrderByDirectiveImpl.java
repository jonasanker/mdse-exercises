/**
 */
package org.mdse.minisql.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.mdse.minisql.query.ColumnReference;
import org.mdse.minisql.query.OrderByDirective;
import org.mdse.minisql.query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order By Directive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.minisql.query.impl.OrderByDirectiveImpl#isAscending <em>Ascending</em>}</li>
 *   <li>{@link org.mdse.minisql.query.impl.OrderByDirectiveImpl#getColumnReference <em>Column Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderByDirectiveImpl extends MinimalEObjectImpl.Container implements OrderByDirective {
	/**
	 * The default value of the '{@link #isAscending() <em>Ascending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAscending()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASCENDING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAscending() <em>Ascending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAscending()
	 * @generated
	 * @ordered
	 */
	protected boolean ascending = ASCENDING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumnReference() <em>Column Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnReference()
	 * @generated
	 * @ordered
	 */
	protected ColumnReference columnReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderByDirectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.ORDER_BY_DIRECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAscending() {
		return ascending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAscending(boolean newAscending) {
		boolean oldAscending = ascending;
		ascending = newAscending;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ORDER_BY_DIRECTIVE__ASCENDING,
					oldAscending, ascending));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColumnReference getColumnReference() {
		return columnReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumnReference(ColumnReference newColumnReference, NotificationChain msgs) {
		ColumnReference oldColumnReference = columnReference;
		columnReference = newColumnReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					QueryPackage.ORDER_BY_DIRECTIVE__COLUMN_REFERENCE, oldColumnReference, newColumnReference);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnReference(ColumnReference newColumnReference) {
		if (newColumnReference != columnReference) {
			NotificationChain msgs = null;
			if (columnReference != null)
				msgs = ((InternalEObject) columnReference).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - QueryPackage.ORDER_BY_DIRECTIVE__COLUMN_REFERENCE, null, msgs);
			if (newColumnReference != null)
				msgs = ((InternalEObject) newColumnReference).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - QueryPackage.ORDER_BY_DIRECTIVE__COLUMN_REFERENCE, null, msgs);
			msgs = basicSetColumnReference(newColumnReference, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ORDER_BY_DIRECTIVE__COLUMN_REFERENCE,
					newColumnReference, newColumnReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QueryPackage.ORDER_BY_DIRECTIVE__COLUMN_REFERENCE:
			return basicSetColumnReference(null, msgs);
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
		case QueryPackage.ORDER_BY_DIRECTIVE__ASCENDING:
			return isAscending();
		case QueryPackage.ORDER_BY_DIRECTIVE__COLUMN_REFERENCE:
			return getColumnReference();
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
		case QueryPackage.ORDER_BY_DIRECTIVE__ASCENDING:
			setAscending((Boolean) newValue);
			return;
		case QueryPackage.ORDER_BY_DIRECTIVE__COLUMN_REFERENCE:
			setColumnReference((ColumnReference) newValue);
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
		case QueryPackage.ORDER_BY_DIRECTIVE__ASCENDING:
			setAscending(ASCENDING_EDEFAULT);
			return;
		case QueryPackage.ORDER_BY_DIRECTIVE__COLUMN_REFERENCE:
			setColumnReference((ColumnReference) null);
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
		case QueryPackage.ORDER_BY_DIRECTIVE__ASCENDING:
			return ascending != ASCENDING_EDEFAULT;
		case QueryPackage.ORDER_BY_DIRECTIVE__COLUMN_REFERENCE:
			return columnReference != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ascending: ");
		result.append(ascending);
		result.append(')');
		return result.toString();
	}

} //OrderByDirectiveImpl
