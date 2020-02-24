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
import org.mdse.minisql.query.FromClause;
import org.mdse.minisql.query.OrderByClause;
import org.mdse.minisql.query.QueryPackage;
import org.mdse.minisql.query.SelectQuery;

import org.mdse.minisql.query.WhatClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.minisql.query.impl.SelectQueryImpl#getFromClause <em>From Clause</em>}</li>
 *   <li>{@link org.mdse.minisql.query.impl.SelectQueryImpl#getOrderByClause <em>Order By Clause</em>}</li>
 *   <li>{@link org.mdse.minisql.query.impl.SelectQueryImpl#getWhatClause <em>What Clause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectQueryImpl extends MinimalEObjectImpl.Container implements SelectQuery {
	/**
	 * The cached value of the '{@link #getFromClause() <em>From Clause</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromClause()
	 * @generated
	 * @ordered
	 */
	protected FromClause fromClause;

	/**
	 * The cached value of the '{@link #getOrderByClause() <em>Order By Clause</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderByClause()
	 * @generated
	 * @ordered
	 */
	protected OrderByClause orderByClause;

	/**
	 * The cached value of the '{@link #getWhatClause() <em>What Clause</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhatClause()
	 * @generated
	 * @ordered
	 */
	protected EList<WhatClause> whatClause;

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
	public FromClause getFromClause() {
		if (fromClause != null && fromClause.eIsProxy()) {
			InternalEObject oldFromClause = (InternalEObject) fromClause;
			fromClause = (FromClause) eResolveProxy(oldFromClause);
			if (fromClause != oldFromClause) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QueryPackage.SELECT_QUERY__FROM_CLAUSE,
							oldFromClause, fromClause));
			}
		}
		return fromClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FromClause basicGetFromClause() {
		return fromClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromClause(FromClause newFromClause) {
		FromClause oldFromClause = fromClause;
		fromClause = newFromClause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SELECT_QUERY__FROM_CLAUSE, oldFromClause,
					fromClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderByClause getOrderByClause() {
		if (orderByClause != null && orderByClause.eIsProxy()) {
			InternalEObject oldOrderByClause = (InternalEObject) orderByClause;
			orderByClause = (OrderByClause) eResolveProxy(oldOrderByClause);
			if (orderByClause != oldOrderByClause) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							QueryPackage.SELECT_QUERY__ORDER_BY_CLAUSE, oldOrderByClause, orderByClause));
			}
		}
		return orderByClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderByClause basicGetOrderByClause() {
		return orderByClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderByClause(OrderByClause newOrderByClause) {
		OrderByClause oldOrderByClause = orderByClause;
		orderByClause = newOrderByClause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SELECT_QUERY__ORDER_BY_CLAUSE,
					oldOrderByClause, orderByClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WhatClause> getWhatClause() {
		if (whatClause == null) {
			whatClause = new EObjectResolvingEList<WhatClause>(WhatClause.class, this,
					QueryPackage.SELECT_QUERY__WHAT_CLAUSE);
		}
		return whatClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QueryPackage.SELECT_QUERY__FROM_CLAUSE:
			if (resolve)
				return getFromClause();
			return basicGetFromClause();
		case QueryPackage.SELECT_QUERY__ORDER_BY_CLAUSE:
			if (resolve)
				return getOrderByClause();
			return basicGetOrderByClause();
		case QueryPackage.SELECT_QUERY__WHAT_CLAUSE:
			return getWhatClause();
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
		case QueryPackage.SELECT_QUERY__FROM_CLAUSE:
			setFromClause((FromClause) newValue);
			return;
		case QueryPackage.SELECT_QUERY__ORDER_BY_CLAUSE:
			setOrderByClause((OrderByClause) newValue);
			return;
		case QueryPackage.SELECT_QUERY__WHAT_CLAUSE:
			getWhatClause().clear();
			getWhatClause().addAll((Collection<? extends WhatClause>) newValue);
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
		case QueryPackage.SELECT_QUERY__FROM_CLAUSE:
			setFromClause((FromClause) null);
			return;
		case QueryPackage.SELECT_QUERY__ORDER_BY_CLAUSE:
			setOrderByClause((OrderByClause) null);
			return;
		case QueryPackage.SELECT_QUERY__WHAT_CLAUSE:
			getWhatClause().clear();
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
		case QueryPackage.SELECT_QUERY__FROM_CLAUSE:
			return fromClause != null;
		case QueryPackage.SELECT_QUERY__ORDER_BY_CLAUSE:
			return orderByClause != null;
		case QueryPackage.SELECT_QUERY__WHAT_CLAUSE:
			return whatClause != null && !whatClause.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SelectQueryImpl
