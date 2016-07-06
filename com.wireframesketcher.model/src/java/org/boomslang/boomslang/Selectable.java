/**
 */
package org.boomslang.boomslang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selectable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.boomslang.boomslang.BoomslangPackage#getSelectable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Selectable extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model paramMany="true"
	 * @generated
	 */
	void doSelect(EList<String> param);

} // Selectable
