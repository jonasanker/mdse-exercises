/**
 */
package org.mdse.minisql.query.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.mdse.minisql.query.QueryPackage;
import org.mdse.minisql.query.SelectQuery;

import schema.Column;
import schema.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.minisql.query.impl.SelectQueryImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.mdse.minisql.query.impl.SelectQueryImpl#getWhat <em>What</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectQueryImpl extends MinimalEObjectImpl.Container implements SelectQuery {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Table from;

	/**
	 * The cached value of the '{@link #getWhat() <em>What</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhat()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> what;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.SELECT_QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject) from;
			from = (Table) eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QueryPackage.SELECT_QUERY__FROM, oldFrom,
							from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrom(Table newFrom) {
		Table oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SELECT_QUERY__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Column> getWhat() {
		if (what == null) {
			what = new EObjectResolvingEList<Column>(Column.class, this, QueryPackage.SELECT_QUERY__WHAT);
		}
		return what;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QueryPackage.SELECT_QUERY__FROM:
			if (resolve)
				return getFrom();
			return basicGetFrom();
		case QueryPackage.SELECT_QUERY__WHAT:
			return getWhat();
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
		case QueryPackage.SELECT_QUERY__FROM:
			setFrom((Table) newValue);
			return;
		case QueryPackage.SELECT_QUERY__WHAT:
			getWhat().clear();
			getWhat().addAll((Collection<? extends Column>) newValue);
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
		case QueryPackage.SELECT_QUERY__FROM:
			setFrom((Table) null);
			return;
		case QueryPackage.SELECT_QUERY__WHAT:
			getWhat().clear();
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
		case QueryPackage.SELECT_QUERY__FROM:
			return from != null;
		case QueryPackage.SELECT_QUERY__WHAT:
			return what != null && !what.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SelectQueryImpl
