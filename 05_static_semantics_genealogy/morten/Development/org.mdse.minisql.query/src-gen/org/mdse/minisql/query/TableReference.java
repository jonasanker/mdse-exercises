/**
 */
package org.mdse.minisql.query;

import org.eclipse.emf.ecore.EObject;

import org.mdse.minisql.schema.Table;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.minisql.query.TableReference#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see org.mdse.minisql.query.QueryPackage#getTableReference()
 * @model
 * @generated
 */
public interface TableReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' reference.
	 * @see #setTable(Table)
	 * @see org.mdse.minisql.query.QueryPackage#getTableReference_Table()
	 * @model required="true"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link org.mdse.minisql.query.TableReference#getTable <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

} // TableReference
