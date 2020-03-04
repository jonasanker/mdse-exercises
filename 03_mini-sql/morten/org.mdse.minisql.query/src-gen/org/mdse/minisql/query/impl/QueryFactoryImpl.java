/**
 */
package org.mdse.minisql.query.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mdse.minisql.query.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryFactoryImpl extends EFactoryImpl implements QueryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QueryFactory init() {
		try {
			QueryFactory theQueryFactory = (QueryFactory) EPackage.Registry.INSTANCE.getEFactory(QueryPackage.eNS_URI);
			if (theQueryFactory != null) {
				return theQueryFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QueryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case QueryPackage.SELECT_QUERY:
			return createSelectQuery();
		case QueryPackage.ORDER_BY_CLAUSE:
			return createOrderByClause();
		case QueryPackage.ORDER_BY_DIRECTIVE:
			return createOrderByDirective();
		case QueryPackage.COLUMN_REFERENCE:
			return createColumnReference();
		case QueryPackage.ALL_COLUMNS_WHAT_DIRECTIVE:
			return createAllColumnsWhatDirective();
		case QueryPackage.SINGLE_COLUMN_WHAT_DIRECTIVE:
			return createSingleColumnWhatDirective();
		case QueryPackage.WHAT_DIRECTIVE:
			return createWhatDirective();
		case QueryPackage.WHAT_CLAUSE:
			return createWhatClause();
		case QueryPackage.FROM_CLAUSE:
			return createFromClause();
		case QueryPackage.WHERE_CLAUSE:
			return createWhereClause();
		case QueryPackage.EXPRESSION:
			return createExpression();
		case QueryPackage.INTEGER_LITERAL:
			return createIntegerLiteral();
		case QueryPackage.COMPARATIVE_EXPRESSION:
			return createComparativeExpression();
		case QueryPackage.ARITHMETIC_EXPRESSION:
			return createArithmeticExpression();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case QueryPackage.COMPARATIVE_OPERATOR:
			return createComparativeOperatorFromString(eDataType, initialValue);
		case QueryPackage.ARITHMETIC_OPERATOR:
			return createArithmeticOperatorFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case QueryPackage.COMPARATIVE_OPERATOR:
			return convertComparativeOperatorToString(eDataType, instanceValue);
		case QueryPackage.ARITHMETIC_OPERATOR:
			return convertArithmeticOperatorToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectQuery createSelectQuery() {
		SelectQueryImpl selectQuery = new SelectQueryImpl();
		return selectQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderByClause createOrderByClause() {
		OrderByClauseImpl orderByClause = new OrderByClauseImpl();
		return orderByClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderByDirective createOrderByDirective() {
		OrderByDirectiveImpl orderByDirective = new OrderByDirectiveImpl();
		return orderByDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColumnReference createColumnReference() {
		ColumnReferenceImpl columnReference = new ColumnReferenceImpl();
		return columnReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllColumnsWhatDirective createAllColumnsWhatDirective() {
		AllColumnsWhatDirectiveImpl allColumnsWhatDirective = new AllColumnsWhatDirectiveImpl();
		return allColumnsWhatDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleColumnWhatDirective createSingleColumnWhatDirective() {
		SingleColumnWhatDirectiveImpl singleColumnWhatDirective = new SingleColumnWhatDirectiveImpl();
		return singleColumnWhatDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhatDirective createWhatDirective() {
		WhatDirectiveImpl whatDirective = new WhatDirectiveImpl();
		return whatDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhatClause createWhatClause() {
		WhatClauseImpl whatClause = new WhatClauseImpl();
		return whatClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FromClause createFromClause() {
		FromClauseImpl fromClause = new FromClauseImpl();
		return fromClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhereClause createWhereClause() {
		WhereClauseImpl whereClause = new WhereClauseImpl();
		return whereClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerLiteral createIntegerLiteral() {
		IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
		return integerLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComparativeExpression createComparativeExpression() {
		ComparativeExpressionImpl comparativeExpression = new ComparativeExpressionImpl();
		return comparativeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArithmeticExpression createArithmeticExpression() {
		ArithmeticExpressionImpl arithmeticExpression = new ArithmeticExpressionImpl();
		return arithmeticExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparativeOperator createComparativeOperatorFromString(EDataType eDataType, String initialValue) {
		ComparativeOperator result = ComparativeOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparativeOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticOperator createArithmeticOperatorFromString(EDataType eDataType, String initialValue) {
		ArithmeticOperator result = ArithmeticOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArithmeticOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryPackage getQueryPackage() {
		return (QueryPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QueryPackage getPackage() {
		return QueryPackage.eINSTANCE;
	}

} //QueryFactoryImpl
