/**
 */
package org.mdse.minisql.query;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.mdse.minisql.query.QueryFactory
 * @model kind="package"
 * @generated
 */
public interface QueryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "query";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mdse.org/minisql/query";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "minisqlquery";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QueryPackage eINSTANCE = org.mdse.minisql.query.impl.QueryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.SelectQueryImpl <em>Select Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.SelectQueryImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getSelectQuery()
	 * @generated
	 */
	int SELECT_QUERY = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_QUERY__FROM = 0;

	/**
	 * The feature id for the '<em><b>What</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_QUERY__WHAT = 1;

	/**
	 * The number of structural features of the '<em>Select Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_QUERY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Select Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_QUERY_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.SelectQuery <em>Select Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Query</em>'.
	 * @see org.mdse.minisql.query.SelectQuery
	 * @generated
	 */
	EClass getSelectQuery();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.minisql.query.SelectQuery#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.mdse.minisql.query.SelectQuery#getFrom()
	 * @see #getSelectQuery()
	 * @generated
	 */
	EReference getSelectQuery_From();

	/**
	 * Returns the meta object for the reference list '{@link org.mdse.minisql.query.SelectQuery#getWhat <em>What</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>What</em>'.
	 * @see org.mdse.minisql.query.SelectQuery#getWhat()
	 * @see #getSelectQuery()
	 * @generated
	 */
	EReference getSelectQuery_What();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QueryFactory getQueryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.SelectQueryImpl <em>Select Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.SelectQueryImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getSelectQuery()
		 * @generated
		 */
		EClass SELECT_QUERY = eINSTANCE.getSelectQuery();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_QUERY__FROM = eINSTANCE.getSelectQuery_From();

		/**
		 * The meta object literal for the '<em><b>What</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_QUERY__WHAT = eINSTANCE.getSelectQuery_What();

	}

} //QueryPackage
