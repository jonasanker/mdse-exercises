/**
 */
package org.mdse.minisql.query.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.mdse.minisql.query.ComparativeExpression;
import org.mdse.minisql.query.ComparativeOperator;
import org.mdse.minisql.query.QueryFactory;
import org.mdse.minisql.query.QueryPackage;

/**
 * This is the item provider adapter for a {@link org.mdse.minisql.query.ComparativeExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComparativeExpressionItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparativeExpressionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOperatorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComparativeExpression_operator_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComparativeExpression_operator_feature",
						"_UI_ComparativeExpression_type"),
				QueryPackage.Literals.COMPARATIVE_EXPRESSION__OPERATOR, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(QueryPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION1);
			childrenFeatures.add(QueryPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION2);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ComparativeExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComparativeExpression"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ComparativeOperator labelValue = ((ComparativeExpression) object).getOperator();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_ComparativeExpression_type")
				: getString("_UI_ComparativeExpression_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ComparativeExpression.class)) {
		case QueryPackage.COMPARATIVE_EXPRESSION__OPERATOR:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case QueryPackage.COMPARATIVE_EXPRESSION__EXPRESSION1:
		case QueryPackage.COMPARATIVE_EXPRESSION__EXPRESSION2:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(QueryPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION1,
				QueryFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(QueryPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION1,
				QueryFactory.eINSTANCE.createColumnReference()));

		newChildDescriptors.add(createChildParameter(QueryPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION1,
				QueryFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(QueryPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION1,
				QueryFactory.eINSTANCE.createComparativeExpression()));

		newChildDescriptors.add(createChildParameter(QueryPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION1,
				QueryFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add(createChildParameter(QueryPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION2,
				QueryFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(QueryPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION2,
				QueryFactory.eINSTANCE.createColumnReference()));

		newChildDescriptors.add(createChildParameter(QueryPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION2,
				QueryFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(QueryPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION2,
				QueryFactory.eINSTANCE.createComparativeExpression()));

		newChildDescriptors.add(createChildParameter(QueryPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION2,
				QueryFactory.eINSTANCE.createArithmeticExpression()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == QueryPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION1
				|| childFeature == QueryPackage.Literals.COMPARATIVE_EXPRESSION__EXPRESSION2;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
