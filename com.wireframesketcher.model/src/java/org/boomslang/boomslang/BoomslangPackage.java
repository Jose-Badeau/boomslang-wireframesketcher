/**
 */
package org.boomslang.boomslang;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.boomslang.boomslang.BoomslangFactory
 * @model kind="package"
 * @generated
 */
public interface BoomslangPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "boomslang";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://boomslang.org/1.0/boomslang.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "boomslang";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BoomslangPackage eINSTANCE = org.boomslang.boomslang.impl.BoomslangPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.boomslang.boomslang.Clickable <em>Clickable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.boomslang.boomslang.Clickable
	 * @see org.boomslang.boomslang.impl.BoomslangPackageImpl#getClickable()
	 * @generated
	 */
	int CLICKABLE = 0;

	/**
	 * The number of structural features of the '<em>Clickable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICKABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.boomslang.boomslang.Selectable <em>Selectable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.boomslang.boomslang.Selectable
	 * @see org.boomslang.boomslang.impl.BoomslangPackageImpl#getSelectable()
	 * @generated
	 */
	int SELECTABLE = 1;

	/**
	 * The number of structural features of the '<em>Selectable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.boomslang.boomslang.Clickable <em>Clickable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clickable</em>'.
	 * @see org.boomslang.boomslang.Clickable
	 * @generated
	 */
	EClass getClickable();

	/**
	 * Returns the meta object for class '{@link org.boomslang.boomslang.Selectable <em>Selectable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selectable</em>'.
	 * @see org.boomslang.boomslang.Selectable
	 * @generated
	 */
	EClass getSelectable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BoomslangFactory getBoomslangFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.boomslang.boomslang.Clickable <em>Clickable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.boomslang.boomslang.Clickable
		 * @see org.boomslang.boomslang.impl.BoomslangPackageImpl#getClickable()
		 * @generated
		 */
		EClass CLICKABLE = eINSTANCE.getClickable();

		/**
		 * The meta object literal for the '{@link org.boomslang.boomslang.Selectable <em>Selectable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.boomslang.boomslang.Selectable
		 * @see org.boomslang.boomslang.impl.BoomslangPackageImpl#getSelectable()
		 * @generated
		 */
		EClass SELECTABLE = eINSTANCE.getSelectable();

	}

} //BoomslangPackage
