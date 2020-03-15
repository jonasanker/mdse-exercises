/**
 */
package org.mdse.genealogy.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mdse.genealogy.GenealogyPackage;
import org.mdse.genealogy.Person;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.genealogy.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mdse.genealogy.impl.PersonImpl#getAge <em>Age</em>}</li>
 *   <li>{@link org.mdse.genealogy.impl.PersonImpl#isAlive <em>Alive</em>}</li>
 *   <li>{@link org.mdse.genealogy.impl.PersonImpl#getParents <em>Parents</em>}</li>
 *   <li>{@link org.mdse.genealogy.impl.PersonImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAlive() <em>Alive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAlive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAlive() <em>Alive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAlive()
	 * @generated
	 * @ordered
	 */
	protected boolean alive = ALIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParents() <em>Parents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParents()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> parents;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenealogyPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenealogyPackage.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenealogyPackage.PERSON__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAlive() {
		return alive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlive(boolean newAlive) {
		boolean oldAlive = alive;
		alive = newAlive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenealogyPackage.PERSON__ALIVE, oldAlive, alive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Person> getChildren() {
		if (children == null) {
			children = new EObjectWithInverseResolvingEList.ManyInverse<Person>(Person.class, this, GenealogyPackage.PERSON__CHILDREN, GenealogyPackage.PERSON__PARENTS);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Person> getParents() {
		if (parents == null) {
			parents = new EObjectWithInverseResolvingEList.ManyInverse<Person>(Person.class, this, GenealogyPackage.PERSON__PARENTS, GenealogyPackage.PERSON__CHILDREN);
		}
		return parents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenealogyPackage.PERSON__PARENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParents()).basicAdd(otherEnd, msgs);
			case GenealogyPackage.PERSON__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenealogyPackage.PERSON__PARENTS:
				return ((InternalEList<?>)getParents()).basicRemove(otherEnd, msgs);
			case GenealogyPackage.PERSON__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case GenealogyPackage.PERSON__NAME:
				return getName();
			case GenealogyPackage.PERSON__AGE:
				return getAge();
			case GenealogyPackage.PERSON__ALIVE:
				return isAlive();
			case GenealogyPackage.PERSON__PARENTS:
				return getParents();
			case GenealogyPackage.PERSON__CHILDREN:
				return getChildren();
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
			case GenealogyPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case GenealogyPackage.PERSON__AGE:
				setAge((Integer)newValue);
				return;
			case GenealogyPackage.PERSON__ALIVE:
				setAlive((Boolean)newValue);
				return;
			case GenealogyPackage.PERSON__PARENTS:
				getParents().clear();
				getParents().addAll((Collection<? extends Person>)newValue);
				return;
			case GenealogyPackage.PERSON__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Person>)newValue);
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
			case GenealogyPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GenealogyPackage.PERSON__AGE:
				setAge(AGE_EDEFAULT);
				return;
			case GenealogyPackage.PERSON__ALIVE:
				setAlive(ALIVE_EDEFAULT);
				return;
			case GenealogyPackage.PERSON__PARENTS:
				getParents().clear();
				return;
			case GenealogyPackage.PERSON__CHILDREN:
				getChildren().clear();
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
			case GenealogyPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GenealogyPackage.PERSON__AGE:
				return age != AGE_EDEFAULT;
			case GenealogyPackage.PERSON__ALIVE:
				return alive != ALIVE_EDEFAULT;
			case GenealogyPackage.PERSON__PARENTS:
				return parents != null && !parents.isEmpty();
			case GenealogyPackage.PERSON__CHILDREN:
				return children != null && !children.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", age: ");
		result.append(age);
		result.append(", alive: ");
		result.append(alive);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
