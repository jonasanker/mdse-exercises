/**
 */
package org.mdse.minisql.schema;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.minisql.schema.Table#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @see org.mdse.minisql.schema.SchemaPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.minisql.schema.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference list.
	 * @see org.mdse.minisql.schema.SchemaPackage#getTable_Column()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Column> getColumn();

} // Table
