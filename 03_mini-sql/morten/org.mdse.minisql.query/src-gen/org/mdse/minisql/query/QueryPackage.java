/**
 */
package org.mdse.minisql.query;

import org.eclipse.emf.ecore.EAttribute;
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
	 * The feature id for the '<em><b>Order By Clause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_QUERY__ORDER_BY_CLAUSE = 0;

	/**
	 * The feature id for the '<em><b>What Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_QUERY__WHAT_CLAUSE = 1;

	/**
	 * The feature id for the '<em><b>From Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_QUERY__FROM_CLAUSE = 2;

	/**
	 * The number of structural features of the '<em>Select Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_QUERY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Select Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.OrderByClauseImpl <em>Order By Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.OrderByClauseImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getOrderByClause()
	 * @generated
	 */
	int ORDER_BY_CLAUSE = 1;

	/**
	 * The feature id for the '<em><b>Order By Directive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY_CLAUSE__ORDER_BY_DIRECTIVE = 0;

	/**
	 * The number of structural features of the '<em>Order By Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY_CLAUSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Order By Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY_CLAUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.OrderByDirectiveImpl <em>Order By Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.OrderByDirectiveImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getOrderByDirective()
	 * @generated
	 */
	int ORDER_BY_DIRECTIVE = 2;

	/**
	 * The feature id for the '<em><b>Column Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY_DIRECTIVE__COLUMN_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Ascending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY_DIRECTIVE__ASCENDING = 1;

	/**
	 * The number of structural features of the '<em>Order By Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY_DIRECTIVE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Order By Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY_DIRECTIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.ColumnReferenceImpl <em>Column Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.ColumnReferenceImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getColumnReference()
	 * @generated
	 */
	int COLUMN_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE__COLUMN = 0;

	/**
	 * The number of structural features of the '<em>Column Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Column Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.WhatDirectiveImpl <em>What Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.WhatDirectiveImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getWhatDirective()
	 * @generated
	 */
	int WHAT_DIRECTIVE = 6;

	/**
	 * The number of structural features of the '<em>What Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT_DIRECTIVE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>What Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT_DIRECTIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.AllColumnsWhatDirectiveImpl <em>All Columns What Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.AllColumnsWhatDirectiveImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getAllColumnsWhatDirective()
	 * @generated
	 */
	int ALL_COLUMNS_WHAT_DIRECTIVE = 4;

	/**
	 * The number of structural features of the '<em>All Columns What Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_COLUMNS_WHAT_DIRECTIVE_FEATURE_COUNT = WHAT_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>All Columns What Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_COLUMNS_WHAT_DIRECTIVE_OPERATION_COUNT = WHAT_DIRECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.SingleColumnWhatDirectiveImpl <em>Single Column What Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.SingleColumnWhatDirectiveImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getSingleColumnWhatDirective()
	 * @generated
	 */
	int SINGLE_COLUMN_WHAT_DIRECTIVE = 5;

	/**
	 * The feature id for the '<em><b>Column Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_COLUMN_WHAT_DIRECTIVE__COLUMN_REFERENCE = WHAT_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Column What Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_COLUMN_WHAT_DIRECTIVE_FEATURE_COUNT = WHAT_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Single Column What Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_COLUMN_WHAT_DIRECTIVE_OPERATION_COUNT = WHAT_DIRECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.WhatClauseImpl <em>What Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.WhatClauseImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getWhatClause()
	 * @generated
	 */
	int WHAT_CLAUSE = 7;

	/**
	 * The feature id for the '<em><b>What Directive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT_CLAUSE__WHAT_DIRECTIVE = 0;

	/**
	 * The number of structural features of the '<em>What Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT_CLAUSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>What Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT_CLAUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.FromClauseImpl <em>From Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.FromClauseImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getFromClause()
	 * @generated
	 */
	int FROM_CLAUSE = 8;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_CLAUSE__TABLE = 0;

	/**
	 * The number of structural features of the '<em>From Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_CLAUSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>From Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_CLAUSE_OPERATION_COUNT = 0;

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
	 * Returns the meta object for the containment reference '{@link org.mdse.minisql.query.SelectQuery#getFromClause <em>From Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Clause</em>'.
	 * @see org.mdse.minisql.query.SelectQuery#getFromClause()
	 * @see #getSelectQuery()
	 * @generated
	 */
	EReference getSelectQuery_FromClause();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.minisql.query.SelectQuery#getOrderByClause <em>Order By Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order By Clause</em>'.
	 * @see org.mdse.minisql.query.SelectQuery#getOrderByClause()
	 * @see #getSelectQuery()
	 * @generated
	 */
	EReference getSelectQuery_OrderByClause();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.minisql.query.SelectQuery#getWhatClause <em>What Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>What Clause</em>'.
	 * @see org.mdse.minisql.query.SelectQuery#getWhatClause()
	 * @see #getSelectQuery()
	 * @generated
	 */
	EReference getSelectQuery_WhatClause();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.OrderByClause <em>Order By Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order By Clause</em>'.
	 * @see org.mdse.minisql.query.OrderByClause
	 * @generated
	 */
	EClass getOrderByClause();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.minisql.query.OrderByClause#getOrderByDirective <em>Order By Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Order By Directive</em>'.
	 * @see org.mdse.minisql.query.OrderByClause#getOrderByDirective()
	 * @see #getOrderByClause()
	 * @generated
	 */
	EReference getOrderByClause_OrderByDirective();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.OrderByDirective <em>Order By Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order By Directive</em>'.
	 * @see org.mdse.minisql.query.OrderByDirective
	 * @generated
	 */
	EClass getOrderByDirective();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.minisql.query.OrderByDirective#getColumnReference <em>Column Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column Reference</em>'.
	 * @see org.mdse.minisql.query.OrderByDirective#getColumnReference()
	 * @see #getOrderByDirective()
	 * @generated
	 */
	EReference getOrderByDirective_ColumnReference();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.minisql.query.OrderByDirective#isAscending <em>Ascending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ascending</em>'.
	 * @see org.mdse.minisql.query.OrderByDirective#isAscending()
	 * @see #getOrderByDirective()
	 * @generated
	 */
	EAttribute getOrderByDirective_Ascending();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.ColumnReference <em>Column Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Reference</em>'.
	 * @see org.mdse.minisql.query.ColumnReference
	 * @generated
	 */
	EClass getColumnReference();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.minisql.query.ColumnReference#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column</em>'.
	 * @see org.mdse.minisql.query.ColumnReference#getColumn()
	 * @see #getColumnReference()
	 * @generated
	 */
	EReference getColumnReference_Column();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.AllColumnsWhatDirective <em>All Columns What Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Columns What Directive</em>'.
	 * @see org.mdse.minisql.query.AllColumnsWhatDirective
	 * @generated
	 */
	EClass getAllColumnsWhatDirective();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.SingleColumnWhatDirective <em>Single Column What Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Column What Directive</em>'.
	 * @see org.mdse.minisql.query.SingleColumnWhatDirective
	 * @generated
	 */
	EClass getSingleColumnWhatDirective();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.minisql.query.SingleColumnWhatDirective#getColumnReference <em>Column Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column Reference</em>'.
	 * @see org.mdse.minisql.query.SingleColumnWhatDirective#getColumnReference()
	 * @see #getSingleColumnWhatDirective()
	 * @generated
	 */
	EReference getSingleColumnWhatDirective_ColumnReference();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.WhatDirective <em>What Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>What Directive</em>'.
	 * @see org.mdse.minisql.query.WhatDirective
	 * @generated
	 */
	EClass getWhatDirective();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.WhatClause <em>What Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>What Clause</em>'.
	 * @see org.mdse.minisql.query.WhatClause
	 * @generated
	 */
	EClass getWhatClause();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.minisql.query.WhatClause#getWhatDirective <em>What Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>What Directive</em>'.
	 * @see org.mdse.minisql.query.WhatClause#getWhatDirective()
	 * @see #getWhatClause()
	 * @generated
	 */
	EReference getWhatClause_WhatDirective();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.FromClause <em>From Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Clause</em>'.
	 * @see org.mdse.minisql.query.FromClause
	 * @generated
	 */
	EClass getFromClause();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.minisql.query.FromClause#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see org.mdse.minisql.query.FromClause#getTable()
	 * @see #getFromClause()
	 * @generated
	 */
	EReference getFromClause_Table();

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
		 * The meta object literal for the '<em><b>From Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_QUERY__FROM_CLAUSE = eINSTANCE.getSelectQuery_FromClause();

		/**
		 * The meta object literal for the '<em><b>Order By Clause</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_QUERY__ORDER_BY_CLAUSE = eINSTANCE.getSelectQuery_OrderByClause();

		/**
		 * The meta object literal for the '<em><b>What Clause</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_QUERY__WHAT_CLAUSE = eINSTANCE.getSelectQuery_WhatClause();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.OrderByClauseImpl <em>Order By Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.OrderByClauseImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getOrderByClause()
		 * @generated
		 */
		EClass ORDER_BY_CLAUSE = eINSTANCE.getOrderByClause();

		/**
		 * The meta object literal for the '<em><b>Order By Directive</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_BY_CLAUSE__ORDER_BY_DIRECTIVE = eINSTANCE.getOrderByClause_OrderByDirective();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.OrderByDirectiveImpl <em>Order By Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.OrderByDirectiveImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getOrderByDirective()
		 * @generated
		 */
		EClass ORDER_BY_DIRECTIVE = eINSTANCE.getOrderByDirective();

		/**
		 * The meta object literal for the '<em><b>Column Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_BY_DIRECTIVE__COLUMN_REFERENCE = eINSTANCE.getOrderByDirective_ColumnReference();

		/**
		 * The meta object literal for the '<em><b>Ascending</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_BY_DIRECTIVE__ASCENDING = eINSTANCE.getOrderByDirective_Ascending();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.ColumnReferenceImpl <em>Column Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.ColumnReferenceImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getColumnReference()
		 * @generated
		 */
		EClass COLUMN_REFERENCE = eINSTANCE.getColumnReference();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN_REFERENCE__COLUMN = eINSTANCE.getColumnReference_Column();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.AllColumnsWhatDirectiveImpl <em>All Columns What Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.AllColumnsWhatDirectiveImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getAllColumnsWhatDirective()
		 * @generated
		 */
		EClass ALL_COLUMNS_WHAT_DIRECTIVE = eINSTANCE.getAllColumnsWhatDirective();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.SingleColumnWhatDirectiveImpl <em>Single Column What Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.SingleColumnWhatDirectiveImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getSingleColumnWhatDirective()
		 * @generated
		 */
		EClass SINGLE_COLUMN_WHAT_DIRECTIVE = eINSTANCE.getSingleColumnWhatDirective();

		/**
		 * The meta object literal for the '<em><b>Column Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_COLUMN_WHAT_DIRECTIVE__COLUMN_REFERENCE = eINSTANCE
				.getSingleColumnWhatDirective_ColumnReference();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.WhatDirectiveImpl <em>What Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.WhatDirectiveImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getWhatDirective()
		 * @generated
		 */
		EClass WHAT_DIRECTIVE = eINSTANCE.getWhatDirective();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.WhatClauseImpl <em>What Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.WhatClauseImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getWhatClause()
		 * @generated
		 */
		EClass WHAT_CLAUSE = eINSTANCE.getWhatClause();

		/**
		 * The meta object literal for the '<em><b>What Directive</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHAT_CLAUSE__WHAT_DIRECTIVE = eINSTANCE.getWhatClause_WhatDirective();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.FromClauseImpl <em>From Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.FromClauseImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getFromClause()
		 * @generated
		 */
		EClass FROM_CLAUSE = eINSTANCE.getFromClause();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_CLAUSE__TABLE = eINSTANCE.getFromClause_Table();

	}

} //QueryPackage
