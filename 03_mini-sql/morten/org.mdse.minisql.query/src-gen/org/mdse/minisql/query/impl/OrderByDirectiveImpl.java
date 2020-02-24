/**
 */
package org.mdse.minisql.query.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link org.mdse.minisql.query.impl.OrderByDirectiveImpl#getColumnReference <em>Column Reference</em>}</li>
 *   <li>{@link org.mdse.minisql.query.impl.OrderByDirectiveImpl#isAscending <em>Ascending</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderByDirectiveImpl extends MinimalEObjectImpl.Container implements OrderByDirective {
	/**
	 * The cached value of the '{@link #getColumnReference() <em>Column Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnReference()
	 * @generated
	 * @ordered
	 */
	protected EList<ColumnReference> columnReference;

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
	public EList<ColumnReference> getColumnReference() {
		if (columnReference == null) {
			columnReference = new EObjectContainmentEList<ColumnReference>(ColumnReference.class, this,
					QueryPackage.ORDER_BY_DIRECTIVE__COLUMN_REFERENCE);
		}
		return columnReference;
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QueryPackage.ORDER_BY_DIRECTIVE__COLUMN_REFERENCE:
			return ((InternalEList<?>) getColumnReference()).basicRemove(otherEnd, msgs);
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
		case QueryPackage.ORDER_BY_DIRECTIVE__COLUMN_REFERENCE:
			return getColumnReference();
		case QueryPackage.ORDER_BY_DIRECTIVE__ASCENDING:
			return isAscending();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case QueryPackage.ORDER_BY_DIRECTIVE__COLUMN_REFERENCE:
			getColumnReference().clear();
			getColumnReference().addAll((Collection<? extends ColumnReference>) newValue);
			return;
		case QueryPackage.ORDER_BY_DIRECTIVE__ASCENDING:
			setAscending((Boolean) newValue);
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
		case QueryPackage.ORDER_BY_DIRECTIVE__COLUMN_REFERENCE:
			getColumnReference().clear();
			return;
		case QueryPackage.ORDER_BY_DIRECTIVE__ASCENDING:
			setAscending(ASCENDING_EDEFAULT);
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
		case QueryPackage.ORDER_BY_DIRECTIVE__COLUMN_REFERENCE:
			return columnReference != null && !columnReference.isEmpty();
		case QueryPackage.ORDER_BY_DIRECTIVE__ASCENDING:
			return ascending != ASCENDING_EDEFAULT;
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
