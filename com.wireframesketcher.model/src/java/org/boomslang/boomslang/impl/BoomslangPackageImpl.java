/**
 */
package org.boomslang.boomslang.impl;

import com.wireframesketcher.model.ModelPackage;

import com.wireframesketcher.model.impl.ModelPackageImpl;

import com.wireframesketcher.model.overrides.OverridesPackage;

import com.wireframesketcher.model.overrides.impl.OverridesPackageImpl;

import com.wireframesketcher.model.story.StoryPackage;

import com.wireframesketcher.model.story.impl.StoryPackageImpl;

import org.boomslang.boomslang.BoomslangFactory;
import org.boomslang.boomslang.BoomslangPackage;
import org.boomslang.boomslang.Clickable;
import org.boomslang.boomslang.Selectable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BoomslangPackageImpl extends EPackageImpl implements BoomslangPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clickableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectableEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.boomslang.boomslang.BoomslangPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BoomslangPackageImpl() {
		super(eNS_URI, BoomslangFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BoomslangPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BoomslangPackage init() {
		if (isInited) return (BoomslangPackage)EPackage.Registry.INSTANCE.getEPackage(BoomslangPackage.eNS_URI);

		// Obtain or create and register package
		BoomslangPackageImpl theBoomslangPackage = (BoomslangPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BoomslangPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BoomslangPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		StoryPackageImpl theStoryPackage = (StoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StoryPackage.eNS_URI) instanceof StoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StoryPackage.eNS_URI) : StoryPackage.eINSTANCE);
		OverridesPackageImpl theOverridesPackage = (OverridesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OverridesPackage.eNS_URI) instanceof OverridesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OverridesPackage.eNS_URI) : OverridesPackage.eINSTANCE);

		// Create package meta-data objects
		theBoomslangPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theStoryPackage.createPackageContents();
		theOverridesPackage.createPackageContents();

		// Initialize created meta-data
		theBoomslangPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theStoryPackage.initializePackageContents();
		theOverridesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBoomslangPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BoomslangPackage.eNS_URI, theBoomslangPackage);
		return theBoomslangPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClickable() {
		return clickableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectable() {
		return selectableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoomslangFactory getBoomslangFactory() {
		return (BoomslangFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		clickableEClass = createEClass(CLICKABLE);

		selectableEClass = createEClass(SELECTABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(clickableEClass, Clickable.class, "Clickable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(clickableEClass, null, "doClick", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(selectableEClass, Selectable.class, "Selectable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(selectableEClass, null, "doSelect", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "param", 0, -1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BoomslangPackageImpl
