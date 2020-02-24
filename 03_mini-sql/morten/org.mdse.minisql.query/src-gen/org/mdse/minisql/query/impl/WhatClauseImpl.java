/**
 */
package org.mdse.minisql.query.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mdse.minisql.query.QueryPackage;
import org.mdse.minisql.query.WhatClause;
import org.mdse.minisql.query.WhatDirective;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>What Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.minisql.query.impl.WhatClauseImpl#getWhatDirective <em>What Directive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhatClauseImpl extends MinimalEObjectImpl.Container implements WhatClause {
	/**
	 * The cached value of the '{@link #getWhatDirective() <em>What Directive</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhatDirective()
	 * @generated
	 * @ordered
	 */
	protected EList<WhatDirective> whatDirective;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhatClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.WHAT_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WhatDirective> getWhatDirective() {
		if (whatDirective == null) {
			whatDirective = new EObjectContainmentEList<WhatDirective>(WhatDirective.class, this,
					QueryPackage.WHAT_CLAUSE__WHAT_DIRECTIVE);
		}
		return whatDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QueryPackage.WHAT_CLAUSE__WHAT_DIRECTIVE:
			return ((InternalEList<?>) getWhatDirective()).basicRemove(otherEnd, msgs);
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
		case QueryPackage.WHAT_CLAUSE__WHAT_DIRECTIVE:
			return getWhatDirective();
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
		case QueryPackage.WHAT_CLAUSE__WHAT_DIRECTIVE:
			getWhatDirective().clear();
			getWhatDirective().addAll((Collection<? extends WhatDirective>) newValue);
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
		case QueryPackage.WHAT_CLAUSE__WHAT_DIRECTIVE:
			getWhatDirective().clear();
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
		case QueryPackage.WHAT_CLAUSE__WHAT_DIRECTIVE:
			return whatDirective != null && !whatDirective.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WhatClauseImpl
