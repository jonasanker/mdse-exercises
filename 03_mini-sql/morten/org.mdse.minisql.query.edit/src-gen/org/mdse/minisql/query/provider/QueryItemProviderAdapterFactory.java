/**
 */
package org.mdse.minisql.query.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.mdse.minisql.query.util.QueryAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryItemProviderAdapterFactory extends QueryAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.minisql.query.SelectQuery} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectQueryItemProvider selectQueryItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.minisql.query.SelectQuery}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSelectQueryAdapter() {
		if (selectQueryItemProvider == null) {
			selectQueryItemProvider = new SelectQueryItemProvider(this);
		}

		return selectQueryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.minisql.query.OrderByClause} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderByClauseItemProvider orderByClauseItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.minisql.query.OrderByClause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrderByClauseAdapter() {
		if (orderByClauseItemProvider == null) {
			orderByClauseItemProvider = new OrderByClauseItemProvider(this);
		}

		return orderByClauseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.minisql.query.OrderByDirective} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderByDirectiveItemProvider orderByDirectiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.minisql.query.OrderByDirective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrderByDirectiveAdapter() {
		if (orderByDirectiveItemProvider == null) {
			orderByDirectiveItemProvider = new OrderByDirectiveItemProvider(this);
		}

		return orderByDirectiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.minisql.query.ColumnReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnReferenceItemProvider columnReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.minisql.query.ColumnReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createColumnReferenceAdapter() {
		if (columnReferenceItemProvider == null) {
			columnReferenceItemProvider = new ColumnReferenceItemProvider(this);
		}

		return columnReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.minisql.query.AllColumnsWhatDirective} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllColumnsWhatDirectiveItemProvider allColumnsWhatDirectiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.minisql.query.AllColumnsWhatDirective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAllColumnsWhatDirectiveAdapter() {
		if (allColumnsWhatDirectiveItemProvider == null) {
			allColumnsWhatDirectiveItemProvider = new AllColumnsWhatDirectiveItemProvider(this);
		}

		return allColumnsWhatDirectiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.minisql.query.SingleColumnWhatDirective} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleColumnWhatDirectiveItemProvider singleColumnWhatDirectiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.minisql.query.SingleColumnWhatDirective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSingleColumnWhatDirectiveAdapter() {
		if (singleColumnWhatDirectiveItemProvider == null) {
			singleColumnWhatDirectiveItemProvider = new SingleColumnWhatDirectiveItemProvider(this);
		}

		return singleColumnWhatDirectiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.minisql.query.WhatDirective} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhatDirectiveItemProvider whatDirectiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.minisql.query.WhatDirective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWhatDirectiveAdapter() {
		if (whatDirectiveItemProvider == null) {
			whatDirectiveItemProvider = new WhatDirectiveItemProvider(this);
		}

		return whatDirectiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.minisql.query.WhatClause} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhatClauseItemProvider whatClauseItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.minisql.query.WhatClause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWhatClauseAdapter() {
		if (whatClauseItemProvider == null) {
			whatClauseItemProvider = new WhatClauseItemProvider(this);
		}

		return whatClauseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.minisql.query.FromClause} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FromClauseItemProvider fromClauseItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.minisql.query.FromClause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFromClauseAdapter() {
		if (fromClauseItemProvider == null) {
			fromClauseItemProvider = new FromClauseItemProvider(this);
		}

		return fromClauseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.minisql.query.WhereClause} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhereClauseItemProvider whereClauseItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.minisql.query.WhereClause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWhereClauseAdapter() {
		if (whereClauseItemProvider == null) {
			whereClauseItemProvider = new WhereClauseItemProvider(this);
		}

		return whereClauseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.minisql.query.Expression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionItemProvider expressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.minisql.query.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExpressionAdapter() {
		if (expressionItemProvider == null) {
			expressionItemProvider = new ExpressionItemProvider(this);
		}

		return expressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.minisql.query.IntegerLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerLiteralItemProvider integerLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.minisql.query.IntegerLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegerLiteralAdapter() {
		if (integerLiteralItemProvider == null) {
			integerLiteralItemProvider = new IntegerLiteralItemProvider(this);
		}

		return integerLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.minisql.query.ComparativeExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparativeExpressionItemProvider comparativeExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.minisql.query.ComparativeExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComparativeExpressionAdapter() {
		if (comparativeExpressionItemProvider == null) {
			comparativeExpressionItemProvider = new ComparativeExpressionItemProvider(this);
		}

		return comparativeExpressionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (selectQueryItemProvider != null)
			selectQueryItemProvider.dispose();
		if (orderByClauseItemProvider != null)
			orderByClauseItemProvider.dispose();
		if (orderByDirectiveItemProvider != null)
			orderByDirectiveItemProvider.dispose();
		if (columnReferenceItemProvider != null)
			columnReferenceItemProvider.dispose();
		if (allColumnsWhatDirectiveItemProvider != null)
			allColumnsWhatDirectiveItemProvider.dispose();
		if (singleColumnWhatDirectiveItemProvider != null)
			singleColumnWhatDirectiveItemProvider.dispose();
		if (whatDirectiveItemProvider != null)
			whatDirectiveItemProvider.dispose();
		if (whatClauseItemProvider != null)
			whatClauseItemProvider.dispose();
		if (fromClauseItemProvider != null)
			fromClauseItemProvider.dispose();
		if (whereClauseItemProvider != null)
			whereClauseItemProvider.dispose();
		if (expressionItemProvider != null)
			expressionItemProvider.dispose();
		if (integerLiteralItemProvider != null)
			integerLiteralItemProvider.dispose();
		if (comparativeExpressionItemProvider != null)
			comparativeExpressionItemProvider.dispose();
	}

}
