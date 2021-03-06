/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import com.wireframesketcher.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.wireframesketcher.model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModelPackage.SCREEN: {
				Screen screen = (Screen)theEObject;
				T result = caseScreen(screen);
				if (result == null) result = caseWidgetContainer(screen);
				if (result == null) result = caseNoteSupport(screen);
				if (result == null) result = caseNameSupport(screen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SCREEN_RULER: {
				ScreenRuler screenRuler = (ScreenRuler)theEObject;
				T result = caseScreenRuler(screenRuler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RULER_GUIDE: {
				RulerGuide rulerGuide = (RulerGuide)theEObject;
				T result = caseRulerGuide(rulerGuide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.WIDGET: {
				Widget widget = (Widget)theEObject;
				T result = caseWidget(widget);
				if (result == null) result = caseNoteSupport(widget);
				if (result == null) result = caseNameSupport(widget);
				if (result == null) result = caseVisibleSupport(widget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BUTTON: {
				Button button = (Button)theEObject;
				T result = caseButton(button);
				if (result == null) result = caseWidget(button);
				if (result == null) result = caseStateSupport(button);
				if (result == null) result = caseColorBackgroundSupport(button);
				if (result == null) result = caseFontSupport(button);
				if (result == null) result = caseIconSupport(button);
				if (result == null) result = caseLinkSupport(button);
				if (result == null) result = caseTextAlignmentSupport(button);
				if (result == null) result = caseSkinSupport(button);
				if (result == null) result = caseClickSupport(button);
				if (result == null) result = caseNoteSupport(button);
				if (result == null) result = caseNameSupport(button);
				if (result == null) result = caseVisibleSupport(button);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CHECKBOX: {
				Checkbox checkbox = (Checkbox)theEObject;
				T result = caseCheckbox(checkbox);
				if (result == null) result = caseWidget(checkbox);
				if (result == null) result = caseBooleanSelectionSupport(checkbox);
				if (result == null) result = caseStateSupport(checkbox);
				if (result == null) result = caseLinkSupport(checkbox);
				if (result == null) result = caseFontSupport(checkbox);
				if (result == null) result = caseSkinSupport(checkbox);
				if (result == null) result = caseNoteSupport(checkbox);
				if (result == null) result = caseNameSupport(checkbox);
				if (result == null) result = caseVisibleSupport(checkbox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COMBO: {
				Combo combo = (Combo)theEObject;
				T result = caseCombo(combo);
				if (result == null) result = caseWidget(combo);
				if (result == null) result = caseStateSupport(combo);
				if (result == null) result = caseFontSupport(combo);
				if (result == null) result = caseColorBorderSupport(combo);
				if (result == null) result = caseColorBackgroundSupport(combo);
				if (result == null) result = caseColorAlphaSupport(combo);
				if (result == null) result = caseLinkSupport(combo);
				if (result == null) result = caseSkinSupport(combo);
				if (result == null) result = caseSelectionSupport(combo);
				if (result == null) result = caseNoteSupport(combo);
				if (result == null) result = caseNameSupport(combo);
				if (result == null) result = caseVisibleSupport(combo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = caseWidget(label);
				if (result == null) result = caseFontSupport(label);
				if (result == null) result = caseTextAlignmentSupport(label);
				if (result == null) result = caseColorForegroundSupport(label);
				if (result == null) result = caseStateSupport(label);
				if (result == null) result = caseIconPositionSupport(label);
				if (result == null) result = caseLinkSupport(label);
				if (result == null) result = caseRotationSupport(label);
				if (result == null) result = caseTextLinksSupport(label);
				if (result == null) result = caseNoteSupport(label);
				if (result == null) result = caseNameSupport(label);
				if (result == null) result = caseVisibleSupport(label);
				if (result == null) result = caseIconSupport(label);
				if (result == null) result = caseItemSupport(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseWidget(link);
				if (result == null) result = caseFontSupport(link);
				if (result == null) result = caseStateSupport(link);
				if (result == null) result = caseLinkSupport(link);
				if (result == null) result = caseSkinSupport(link);
				if (result == null) result = caseNoteSupport(link);
				if (result == null) result = caseNameSupport(link);
				if (result == null) result = caseVisibleSupport(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PLACEHOLDER: {
				Placeholder placeholder = (Placeholder)theEObject;
				T result = casePlaceholder(placeholder);
				if (result == null) result = caseWidget(placeholder);
				if (result == null) result = caseLinkSupport(placeholder);
				if (result == null) result = caseSkinSupport(placeholder);
				if (result == null) result = caseNoteSupport(placeholder);
				if (result == null) result = caseNameSupport(placeholder);
				if (result == null) result = caseVisibleSupport(placeholder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RADIO_BUTTON: {
				RadioButton radioButton = (RadioButton)theEObject;
				T result = caseRadioButton(radioButton);
				if (result == null) result = caseWidget(radioButton);
				if (result == null) result = caseBooleanSelectionSupport(radioButton);
				if (result == null) result = caseStateSupport(radioButton);
				if (result == null) result = caseLinkSupport(radioButton);
				if (result == null) result = caseFontSupport(radioButton);
				if (result == null) result = caseSkinSupport(radioButton);
				if (result == null) result = caseNoteSupport(radioButton);
				if (result == null) result = caseNameSupport(radioButton);
				if (result == null) result = caseVisibleSupport(radioButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TEXT_FIELD: {
				TextField textField = (TextField)theEObject;
				T result = caseTextField(textField);
				if (result == null) result = caseWidget(textField);
				if (result == null) result = caseStateSupport(textField);
				if (result == null) result = caseFontSupport(textField);
				if (result == null) result = caseTextAlignmentSupport(textField);
				if (result == null) result = caseColorBackgroundSupport(textField);
				if (result == null) result = caseColorAlphaSupport(textField);
				if (result == null) result = caseColorBorderSupport(textField);
				if (result == null) result = caseSkinSupport(textField);
				if (result == null) result = caseTextInputSupport(textField);
				if (result == null) result = caseNoteSupport(textField);
				if (result == null) result = caseNameSupport(textField);
				if (result == null) result = caseVisibleSupport(textField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SPINNER: {
				Spinner spinner = (Spinner)theEObject;
				T result = caseSpinner(spinner);
				if (result == null) result = caseWidget(spinner);
				if (result == null) result = caseStateSupport(spinner);
				if (result == null) result = caseFontSupport(spinner);
				if (result == null) result = caseColorBorderSupport(spinner);
				if (result == null) result = caseColorBackgroundSupport(spinner);
				if (result == null) result = caseColorAlphaSupport(spinner);
				if (result == null) result = caseSkinSupport(spinner);
				if (result == null) result = caseNoteSupport(spinner);
				if (result == null) result = caseNameSupport(spinner);
				if (result == null) result = caseVisibleSupport(spinner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.WINDOW: {
				Window window = (Window)theEObject;
				T result = caseWindow(window);
				if (result == null) result = caseWidget(window);
				if (result == null) result = caseVerticalScrollbarSupport(window);
				if (result == null) result = caseSkinSupport(window);
				if (result == null) result = caseColorBackgroundSupport(window);
				if (result == null) result = caseColorAlphaSupport(window);
				if (result == null) result = caseNoteSupport(window);
				if (result == null) result = caseNameSupport(window);
				if (result == null) result = caseVisibleSupport(window);
				if (result == null) result = caseValueSupport(window);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BROWSER: {
				Browser browser = (Browser)theEObject;
				T result = caseBrowser(browser);
				if (result == null) result = caseWidget(browser);
				if (result == null) result = caseVerticalScrollbarSupport(browser);
				if (result == null) result = caseColorBackgroundSupport(browser);
				if (result == null) result = caseSkinSupport(browser);
				if (result == null) result = caseColorAlphaSupport(browser);
				if (result == null) result = caseFontSupport(browser);
				if (result == null) result = caseNoteSupport(browser);
				if (result == null) result = caseNameSupport(browser);
				if (result == null) result = caseVisibleSupport(browser);
				if (result == null) result = caseValueSupport(browser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = caseWidget(text);
				if (result == null) result = caseFontSupport(text);
				if (result == null) result = caseTextAlignmentSupport(text);
				if (result == null) result = caseColorForegroundSupport(text);
				if (result == null) result = caseLinkSupport(text);
				if (result == null) result = caseLineHeightSupport(text);
				if (result == null) result = caseTextLinksSupport(text);
				if (result == null) result = caseNoteSupport(text);
				if (result == null) result = caseNameSupport(text);
				if (result == null) result = caseVisibleSupport(text);
				if (result == null) result = caseItemSupport(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.AREA: {
				Area area = (Area)theEObject;
				T result = caseArea(area);
				if (result == null) result = caseWidget(area);
				if (result == null) result = caseNoteSupport(area);
				if (result == null) result = caseNameSupport(area);
				if (result == null) result = caseVisibleSupport(area);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PANEL: {
				Panel panel = (Panel)theEObject;
				T result = casePanel(panel);
				if (result == null) result = caseWidget(panel);
				if (result == null) result = caseColorBackgroundSupport(panel);
				if (result == null) result = caseColorAlphaSupport(panel);
				if (result == null) result = caseVerticalScrollbarSupport(panel);
				if (result == null) result = caseColorForegroundSupport(panel);
				if (result == null) result = caseBorderStyleSupport(panel);
				if (result == null) result = caseLinkSupport(panel);
				if (result == null) result = caseSkinSupport(panel);
				if (result == null) result = caseNoteSupport(panel);
				if (result == null) result = caseNameSupport(panel);
				if (result == null) result = caseVisibleSupport(panel);
				if (result == null) result = caseValueSupport(panel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GROUP: {
				Group group = (Group)theEObject;
				T result = caseGroup(group);
				if (result == null) result = caseWidget(group);
				if (result == null) result = caseVerticalScrollbarSupport(group);
				if (result == null) result = caseColorBackgroundSupport(group);
				if (result == null) result = caseColorAlphaSupport(group);
				if (result == null) result = caseFontSupport(group);
				if (result == null) result = caseSkinSupport(group);
				if (result == null) result = caseNoteSupport(group);
				if (result == null) result = caseNameSupport(group);
				if (result == null) result = caseVisibleSupport(group);
				if (result == null) result = caseValueSupport(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LIST: {
				List list = (List)theEObject;
				T result = caseList(list);
				if (result == null) result = caseWidget(list);
				if (result == null) result = caseSelectionSupport(list);
				if (result == null) result = caseBorderSupport(list);
				if (result == null) result = caseVerticalScrollbarSupport(list);
				if (result == null) result = caseColorBackgroundSupport(list);
				if (result == null) result = caseColorAlphaSupport(list);
				if (result == null) result = caseListSupport(list);
				if (result == null) result = caseFontSupport(list);
				if (result == null) result = caseItemSupport(list);
				if (result == null) result = caseColorAlternativeSupport(list);
				if (result == null) result = caseNoteSupport(list);
				if (result == null) result = caseNameSupport(list);
				if (result == null) result = caseVisibleSupport(list);
				if (result == null) result = caseValueSupport(list);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.POPUP: {
				Popup popup = (Popup)theEObject;
				T result = casePopup(popup);
				if (result == null) result = caseWidget(popup);
				if (result == null) result = caseSelectionSupport(popup);
				if (result == null) result = caseItemSupport(popup);
				if (result == null) result = caseNoteSupport(popup);
				if (result == null) result = caseNameSupport(popup);
				if (result == null) result = caseVisibleSupport(popup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MENU: {
				Menu menu = (Menu)theEObject;
				T result = caseMenu(menu);
				if (result == null) result = caseWidget(menu);
				if (result == null) result = caseSelectionSupport(menu);
				if (result == null) result = caseIconSupport(menu);
				if (result == null) result = caseItemSupport(menu);
				if (result == null) result = caseSkinSupport(menu);
				if (result == null) result = caseNoteSupport(menu);
				if (result == null) result = caseNameSupport(menu);
				if (result == null) result = caseVisibleSupport(menu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = caseWidget(table);
				if (result == null) result = caseSelectionSupport(table);
				if (result == null) result = caseBorderSupport(table);
				if (result == null) result = caseVerticalScrollbarSupport(table);
				if (result == null) result = caseColorBackgroundSupport(table);
				if (result == null) result = caseColorAlphaSupport(table);
				if (result == null) result = caseListSupport(table);
				if (result == null) result = caseFontSupport(table);
				if (result == null) result = caseTextAlignmentSupport(table);
				if (result == null) result = caseColorAlternativeSupport(table);
				if (result == null) result = caseTextLinksSupport(table);
				if (result == null) result = caseClickSupport(table);
				if (result == null) result = caseDoubleClickSupport(table);
				if (result == null) result = caseTextInputSupport(table);
				if (result == null) result = caseNoteSupport(table);
				if (result == null) result = caseNameSupport(table);
				if (result == null) result = caseVisibleSupport(table);
				if (result == null) result = caseValueSupport(table);
				if (result == null) result = caseItemSupport(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TREE: {
				Tree tree = (Tree)theEObject;
				T result = caseTree(tree);
				if (result == null) result = caseWidget(tree);
				if (result == null) result = caseBorderSupport(tree);
				if (result == null) result = caseVerticalScrollbarSupport(tree);
				if (result == null) result = caseColorBackgroundSupport(tree);
				if (result == null) result = caseColorAlphaSupport(tree);
				if (result == null) result = caseSelectionSupport(tree);
				if (result == null) result = caseItemSupport(tree);
				if (result == null) result = caseFontSupport(tree);
				if (result == null) result = caseNoteSupport(tree);
				if (result == null) result = caseNameSupport(tree);
				if (result == null) result = caseVisibleSupport(tree);
				if (result == null) result = caseValueSupport(tree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ICON: {
				Icon icon = (Icon)theEObject;
				T result = caseIcon(icon);
				if (result == null) result = caseWidget(icon);
				if (result == null) result = caseColorForegroundSupport(icon);
				if (result == null) result = caseIconSupport(icon);
				if (result == null) result = caseLinkSupport(icon);
				if (result == null) result = caseNoteSupport(icon);
				if (result == null) result = caseNameSupport(icon);
				if (result == null) result = caseVisibleSupport(icon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TEXT_AREA: {
				TextArea textArea = (TextArea)theEObject;
				T result = caseTextArea(textArea);
				if (result == null) result = caseWidget(textArea);
				if (result == null) result = caseStateSupport(textArea);
				if (result == null) result = caseVerticalScrollbarSupport(textArea);
				if (result == null) result = caseFontSupport(textArea);
				if (result == null) result = caseTextAlignmentSupport(textArea);
				if (result == null) result = caseColorBackgroundSupport(textArea);
				if (result == null) result = caseColorAlphaSupport(textArea);
				if (result == null) result = caseColorBorderSupport(textArea);
				if (result == null) result = caseSkinSupport(textArea);
				if (result == null) result = caseLineHeightSupport(textArea);
				if (result == null) result = caseTextLinksSupport(textArea);
				if (result == null) result = caseNoteSupport(textArea);
				if (result == null) result = caseNameSupport(textArea);
				if (result == null) result = caseVisibleSupport(textArea);
				if (result == null) result = caseValueSupport(textArea);
				if (result == null) result = caseItemSupport(textArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.HSCROLLBAR: {
				HScrollbar hScrollbar = (HScrollbar)theEObject;
				T result = caseHScrollbar(hScrollbar);
				if (result == null) result = caseWidget(hScrollbar);
				if (result == null) result = caseValueSupport(hScrollbar);
				if (result == null) result = caseSkinSupport(hScrollbar);
				if (result == null) result = caseNoteSupport(hScrollbar);
				if (result == null) result = caseNameSupport(hScrollbar);
				if (result == null) result = caseVisibleSupport(hScrollbar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.VSCROLLBAR: {
				VScrollbar vScrollbar = (VScrollbar)theEObject;
				T result = caseVScrollbar(vScrollbar);
				if (result == null) result = caseWidget(vScrollbar);
				if (result == null) result = caseValueSupport(vScrollbar);
				if (result == null) result = caseSkinSupport(vScrollbar);
				if (result == null) result = caseNoteSupport(vScrollbar);
				if (result == null) result = caseNameSupport(vScrollbar);
				if (result == null) result = caseVisibleSupport(vScrollbar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.HLINE: {
				HLine hLine = (HLine)theEObject;
				T result = caseHLine(hLine);
				if (result == null) result = caseWidget(hLine);
				if (result == null) result = caseColorForegroundSupport(hLine);
				if (result == null) result = caseLineStyleSupport(hLine);
				if (result == null) result = caseSkinSupport(hLine);
				if (result == null) result = caseNoteSupport(hLine);
				if (result == null) result = caseNameSupport(hLine);
				if (result == null) result = caseVisibleSupport(hLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.VLINE: {
				VLine vLine = (VLine)theEObject;
				T result = caseVLine(vLine);
				if (result == null) result = caseWidget(vLine);
				if (result == null) result = caseColorForegroundSupport(vLine);
				if (result == null) result = caseLineStyleSupport(vLine);
				if (result == null) result = caseSkinSupport(vLine);
				if (result == null) result = caseNoteSupport(vLine);
				if (result == null) result = caseNameSupport(vLine);
				if (result == null) result = caseVisibleSupport(vLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.HSLIDER: {
				HSlider hSlider = (HSlider)theEObject;
				T result = caseHSlider(hSlider);
				if (result == null) result = caseWidget(hSlider);
				if (result == null) result = caseValueSupport(hSlider);
				if (result == null) result = caseStateSupport(hSlider);
				if (result == null) result = caseColorBackgroundSupport(hSlider);
				if (result == null) result = caseSkinSupport(hSlider);
				if (result == null) result = caseNoteSupport(hSlider);
				if (result == null) result = caseNameSupport(hSlider);
				if (result == null) result = caseVisibleSupport(hSlider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.VSLIDER: {
				VSlider vSlider = (VSlider)theEObject;
				T result = caseVSlider(vSlider);
				if (result == null) result = caseWidget(vSlider);
				if (result == null) result = caseValueSupport(vSlider);
				if (result == null) result = caseStateSupport(vSlider);
				if (result == null) result = caseColorBackgroundSupport(vSlider);
				if (result == null) result = caseSkinSupport(vSlider);
				if (result == null) result = caseNoteSupport(vSlider);
				if (result == null) result = caseNameSupport(vSlider);
				if (result == null) result = caseVisibleSupport(vSlider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TABS: {
				Tabs tabs = (Tabs)theEObject;
				T result = caseTabs(tabs);
				if (result == null) result = caseWidget(tabs);
				if (result == null) result = caseSelectionSupport(tabs);
				if (result == null) result = caseItemSupport(tabs);
				if (result == null) result = caseFontSupport(tabs);
				if (result == null) result = caseSkinSupport(tabs);
				if (result == null) result = caseNoteSupport(tabs);
				if (result == null) result = caseNameSupport(tabs);
				if (result == null) result = caseVisibleSupport(tabs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.WIDGET_DESCRIPTOR: {
				WidgetDescriptor widgetDescriptor = (WidgetDescriptor)theEObject;
				T result = caseWidgetDescriptor(widgetDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FONT: {
				Font font = (Font)theEObject;
				T result = caseFont(font);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.WIDGET_CONTAINER: {
				WidgetContainer widgetContainer = (WidgetContainer)theEObject;
				T result = caseWidgetContainer(widgetContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.WIDGET_GROUP: {
				WidgetGroup widgetGroup = (WidgetGroup)theEObject;
				T result = caseWidgetGroup(widgetGroup);
				if (result == null) result = caseWidget(widgetGroup);
				if (result == null) result = caseWidgetContainer(widgetGroup);
				if (result == null) result = caseLinkSupport(widgetGroup);
				if (result == null) result = caseNoteSupport(widgetGroup);
				if (result == null) result = caseNameSupport(widgetGroup);
				if (result == null) result = caseVisibleSupport(widgetGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MASTER: {
				Master master = (Master)theEObject;
				T result = caseMaster(master);
				if (result == null) result = caseWidget(master);
				if (result == null) result = caseLinkSupport(master);
				if (result == null) result = caseNoteSupport(master);
				if (result == null) result = caseNameSupport(master);
				if (result == null) result = caseVisibleSupport(master);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = caseWidget(image);
				if (result == null) result = caseLinkSupport(image);
				if (result == null) result = caseRotationSupport(image);
				if (result == null) result = caseFlipSupport(image);
				if (result == null) result = caseBorderSupport(image);
				if (result == null) result = caseNoteSupport(image);
				if (result == null) result = caseNameSupport(image);
				if (result == null) result = caseVisibleSupport(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SCREEN_FONT: {
				ScreenFont screenFont = (ScreenFont)theEObject;
				T result = caseScreenFont(screenFont);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FONT_SUPPORT: {
				FontSupport fontSupport = (FontSupport)theEObject;
				T result = caseFontSupport(fontSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COLOR_FOREGROUND_SUPPORT: {
				ColorForegroundSupport colorForegroundSupport = (ColorForegroundSupport)theEObject;
				T result = caseColorForegroundSupport(colorForegroundSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COLOR_BACKGROUND_SUPPORT: {
				ColorBackgroundSupport colorBackgroundSupport = (ColorBackgroundSupport)theEObject;
				T result = caseColorBackgroundSupport(colorBackgroundSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COLOR_BORDER_SUPPORT: {
				ColorBorderSupport colorBorderSupport = (ColorBorderSupport)theEObject;
				T result = caseColorBorderSupport(colorBorderSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COLOR_ALPHA_SUPPORT: {
				ColorAlphaSupport colorAlphaSupport = (ColorAlphaSupport)theEObject;
				T result = caseColorAlphaSupport(colorAlphaSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SELECTION_SUPPORT: {
				SelectionSupport selectionSupport = (SelectionSupport)theEObject;
				T result = caseSelectionSupport(selectionSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TEXT_ALIGNMENT_SUPPORT: {
				TextAlignmentSupport textAlignmentSupport = (TextAlignmentSupport)theEObject;
				T result = caseTextAlignmentSupport(textAlignmentSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BOOLEAN_SELECTION_SUPPORT: {
				BooleanSelectionSupport booleanSelectionSupport = (BooleanSelectionSupport)theEObject;
				T result = caseBooleanSelectionSupport(booleanSelectionSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.NOTE: {
				Note note = (Note)theEObject;
				T result = caseNote(note);
				if (result == null) result = caseWidget(note);
				if (result == null) result = caseFontSupport(note);
				if (result == null) result = caseTextAlignmentSupport(note);
				if (result == null) result = caseColorBackgroundSupport(note);
				if (result == null) result = caseColorAlphaSupport(note);
				if (result == null) result = caseLinkSupport(note);
				if (result == null) result = caseSkinSupport(note);
				if (result == null) result = caseAnnotationSupport(note);
				if (result == null) result = caseTextLinksSupport(note);
				if (result == null) result = caseNoteSupport(note);
				if (result == null) result = caseNameSupport(note);
				if (result == null) result = caseVisibleSupport(note);
				if (result == null) result = caseItemSupport(note);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PROGRESS_BAR: {
				ProgressBar progressBar = (ProgressBar)theEObject;
				T result = caseProgressBar(progressBar);
				if (result == null) result = caseWidget(progressBar);
				if (result == null) result = caseValueSupport(progressBar);
				if (result == null) result = caseColorBackgroundSupport(progressBar);
				if (result == null) result = caseSkinSupport(progressBar);
				if (result == null) result = caseNoteSupport(progressBar);
				if (result == null) result = caseNameSupport(progressBar);
				if (result == null) result = caseVisibleSupport(progressBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CALLOUT: {
				Callout callout = (Callout)theEObject;
				T result = caseCallout(callout);
				if (result == null) result = caseWidget(callout);
				if (result == null) result = caseFontSupport(callout);
				if (result == null) result = caseColorBackgroundSupport(callout);
				if (result == null) result = caseColorAlphaSupport(callout);
				if (result == null) result = caseLinkSupport(callout);
				if (result == null) result = caseSkinSupport(callout);
				if (result == null) result = caseAnnotationSupport(callout);
				if (result == null) result = caseNoteSupport(callout);
				if (result == null) result = caseNameSupport(callout);
				if (result == null) result = caseVisibleSupport(callout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SEARCH_FIELD: {
				SearchField searchField = (SearchField)theEObject;
				T result = caseSearchField(searchField);
				if (result == null) result = caseWidget(searchField);
				if (result == null) result = caseFontSupport(searchField);
				if (result == null) result = caseStateSupport(searchField);
				if (result == null) result = caseColorBorderSupport(searchField);
				if (result == null) result = caseLinkSupport(searchField);
				if (result == null) result = caseSkinSupport(searchField);
				if (result == null) result = caseNoteSupport(searchField);
				if (result == null) result = caseNameSupport(searchField);
				if (result == null) result = caseVisibleSupport(searchField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LINK_BAR: {
				LinkBar linkBar = (LinkBar)theEObject;
				T result = caseLinkBar(linkBar);
				if (result == null) result = caseWidget(linkBar);
				if (result == null) result = caseFontSupport(linkBar);
				if (result == null) result = caseSelectionSupport(linkBar);
				if (result == null) result = caseItemSupport(linkBar);
				if (result == null) result = caseSkinSupport(linkBar);
				if (result == null) result = caseNoteSupport(linkBar);
				if (result == null) result = caseNameSupport(linkBar);
				if (result == null) result = caseVisibleSupport(linkBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TOOLTIP: {
				Tooltip tooltip = (Tooltip)theEObject;
				T result = caseTooltip(tooltip);
				if (result == null) result = caseWidget(tooltip);
				if (result == null) result = caseFontSupport(tooltip);
				if (result == null) result = caseTextAlignmentSupport(tooltip);
				if (result == null) result = caseColorBackgroundSupport(tooltip);
				if (result == null) result = caseSkinSupport(tooltip);
				if (result == null) result = caseTextLinksSupport(tooltip);
				if (result == null) result = caseNoteSupport(tooltip);
				if (result == null) result = caseNameSupport(tooltip);
				if (result == null) result = caseVisibleSupport(tooltip);
				if (result == null) result = caseItemSupport(tooltip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SCRATCH_OUT: {
				ScratchOut scratchOut = (ScratchOut)theEObject;
				T result = caseScratchOut(scratchOut);
				if (result == null) result = caseWidget(scratchOut);
				if (result == null) result = caseColorForegroundSupport(scratchOut);
				if (result == null) result = caseColorAlphaSupport(scratchOut);
				if (result == null) result = caseSkinSupport(scratchOut);
				if (result == null) result = caseAnnotationSupport(scratchOut);
				if (result == null) result = caseNoteSupport(scratchOut);
				if (result == null) result = caseNameSupport(scratchOut);
				if (result == null) result = caseVisibleSupport(scratchOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BORDER_SUPPORT: {
				BorderSupport borderSupport = (BorderSupport)theEObject;
				T result = caseBorderSupport(borderSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.STATE_SUPPORT: {
				StateSupport stateSupport = (StateSupport)theEObject;
				T result = caseStateSupport(stateSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BREADCRUMBS: {
				Breadcrumbs breadcrumbs = (Breadcrumbs)theEObject;
				T result = caseBreadcrumbs(breadcrumbs);
				if (result == null) result = caseWidget(breadcrumbs);
				if (result == null) result = caseFontSupport(breadcrumbs);
				if (result == null) result = caseItemSupport(breadcrumbs);
				if (result == null) result = caseSkinSupport(breadcrumbs);
				if (result == null) result = caseNoteSupport(breadcrumbs);
				if (result == null) result = caseNameSupport(breadcrumbs);
				if (result == null) result = caseVisibleSupport(breadcrumbs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ACCORDION: {
				Accordion accordion = (Accordion)theEObject;
				T result = caseAccordion(accordion);
				if (result == null) result = caseWidget(accordion);
				if (result == null) result = caseSelectionSupport(accordion);
				if (result == null) result = caseVerticalScrollbarSupport(accordion);
				if (result == null) result = caseItemSupport(accordion);
				if (result == null) result = caseFontSupport(accordion);
				if (result == null) result = caseNoteSupport(accordion);
				if (result == null) result = caseNameSupport(accordion);
				if (result == null) result = caseVisibleSupport(accordion);
				if (result == null) result = caseValueSupport(accordion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.VERTICAL_SCROLLBAR_SUPPORT: {
				VerticalScrollbarSupport verticalScrollbarSupport = (VerticalScrollbarSupport)theEObject;
				T result = caseVerticalScrollbarSupport(verticalScrollbarSupport);
				if (result == null) result = caseValueSupport(verticalScrollbarSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DATE_FIELD: {
				DateField dateField = (DateField)theEObject;
				T result = caseDateField(dateField);
				if (result == null) result = caseWidget(dateField);
				if (result == null) result = caseStateSupport(dateField);
				if (result == null) result = caseColorBorderSupport(dateField);
				if (result == null) result = caseColorBackgroundSupport(dateField);
				if (result == null) result = caseColorAlphaSupport(dateField);
				if (result == null) result = caseSkinSupport(dateField);
				if (result == null) result = caseNoteSupport(dateField);
				if (result == null) result = caseNameSupport(dateField);
				if (result == null) result = caseVisibleSupport(dateField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.VIDEO_PLAYER: {
				VideoPlayer videoPlayer = (VideoPlayer)theEObject;
				T result = caseVideoPlayer(videoPlayer);
				if (result == null) result = caseWidget(videoPlayer);
				if (result == null) result = caseSkinSupport(videoPlayer);
				if (result == null) result = caseNoteSupport(videoPlayer);
				if (result == null) result = caseNameSupport(videoPlayer);
				if (result == null) result = caseVisibleSupport(videoPlayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MAP: {
				Map map = (Map)theEObject;
				T result = caseMap(map);
				if (result == null) result = caseWidget(map);
				if (result == null) result = caseSkinSupport(map);
				if (result == null) result = caseNoteSupport(map);
				if (result == null) result = caseNameSupport(map);
				if (result == null) result = caseVisibleSupport(map);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COVER_FLOW: {
				CoverFlow coverFlow = (CoverFlow)theEObject;
				T result = caseCoverFlow(coverFlow);
				if (result == null) result = caseWidget(coverFlow);
				if (result == null) result = caseSkinSupport(coverFlow);
				if (result == null) result = caseNoteSupport(coverFlow);
				if (result == null) result = caseNameSupport(coverFlow);
				if (result == null) result = caseVisibleSupport(coverFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TABBED_PANE: {
				TabbedPane tabbedPane = (TabbedPane)theEObject;
				T result = caseTabbedPane(tabbedPane);
				if (result == null) result = caseWidget(tabbedPane);
				if (result == null) result = caseSelectionSupport(tabbedPane);
				if (result == null) result = caseVerticalScrollbarSupport(tabbedPane);
				if (result == null) result = caseColorBackgroundSupport(tabbedPane);
				if (result == null) result = caseColorAlphaSupport(tabbedPane);
				if (result == null) result = caseItemSupport(tabbedPane);
				if (result == null) result = caseFontSupport(tabbedPane);
				if (result == null) result = caseSkinSupport(tabbedPane);
				if (result == null) result = caseNoteSupport(tabbedPane);
				if (result == null) result = caseNameSupport(tabbedPane);
				if (result == null) result = caseVisibleSupport(tabbedPane);
				if (result == null) result = caseValueSupport(tabbedPane);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ICON_SUPPORT: {
				IconSupport iconSupport = (IconSupport)theEObject;
				T result = caseIconSupport(iconSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.HSPLITTER: {
				HSplitter hSplitter = (HSplitter)theEObject;
				T result = caseHSplitter(hSplitter);
				if (result == null) result = caseWidget(hSplitter);
				if (result == null) result = caseSkinSupport(hSplitter);
				if (result == null) result = caseNoteSupport(hSplitter);
				if (result == null) result = caseNameSupport(hSplitter);
				if (result == null) result = caseVisibleSupport(hSplitter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.VSPLITTER: {
				VSplitter vSplitter = (VSplitter)theEObject;
				T result = caseVSplitter(vSplitter);
				if (result == null) result = caseWidget(vSplitter);
				if (result == null) result = caseSkinSupport(vSplitter);
				if (result == null) result = caseNoteSupport(vSplitter);
				if (result == null) result = caseNameSupport(vSplitter);
				if (result == null) result = caseVisibleSupport(vSplitter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.VALUE_SUPPORT: {
				ValueSupport valueSupport = (ValueSupport)theEObject;
				T result = caseValueSupport(valueSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COLOR_PICKER: {
				ColorPicker colorPicker = (ColorPicker)theEObject;
				T result = caseColorPicker(colorPicker);
				if (result == null) result = caseWidget(colorPicker);
				if (result == null) result = caseColorBackgroundSupport(colorPicker);
				if (result == null) result = caseSkinSupport(colorPicker);
				if (result == null) result = caseNoteSupport(colorPicker);
				if (result == null) result = caseNameSupport(colorPicker);
				if (result == null) result = caseVisibleSupport(colorPicker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ARROW: {
				Arrow arrow = (Arrow)theEObject;
				T result = caseArrow(arrow);
				if (result == null) result = caseWidget(arrow);
				if (result == null) result = caseColorForegroundSupport(arrow);
				if (result == null) result = caseLineStyleSupport(arrow);
				if (result == null) result = caseAnnotationSupport(arrow);
				if (result == null) result = caseNoteSupport(arrow);
				if (result == null) result = caseNameSupport(arrow);
				if (result == null) result = caseVisibleSupport(arrow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CURLY_BRACE: {
				CurlyBrace curlyBrace = (CurlyBrace)theEObject;
				T result = caseCurlyBrace(curlyBrace);
				if (result == null) result = caseWidget(curlyBrace);
				if (result == null) result = caseFontSupport(curlyBrace);
				if (result == null) result = caseColorForegroundSupport(curlyBrace);
				if (result == null) result = caseSkinSupport(curlyBrace);
				if (result == null) result = caseAnnotationSupport(curlyBrace);
				if (result == null) result = caseTextLinksSupport(curlyBrace);
				if (result == null) result = caseNoteSupport(curlyBrace);
				if (result == null) result = caseNameSupport(curlyBrace);
				if (result == null) result = caseVisibleSupport(curlyBrace);
				if (result == null) result = caseItemSupport(curlyBrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BUTTON_BAR: {
				ButtonBar buttonBar = (ButtonBar)theEObject;
				T result = caseButtonBar(buttonBar);
				if (result == null) result = caseWidget(buttonBar);
				if (result == null) result = caseSelectionSupport(buttonBar);
				if (result == null) result = caseFontSupport(buttonBar);
				if (result == null) result = caseColorBackgroundSupport(buttonBar);
				if (result == null) result = caseItemSupport(buttonBar);
				if (result == null) result = caseSkinSupport(buttonBar);
				if (result == null) result = caseNoteSupport(buttonBar);
				if (result == null) result = caseNameSupport(buttonBar);
				if (result == null) result = caseVisibleSupport(buttonBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BORDER_STYLE_SUPPORT: {
				BorderStyleSupport borderStyleSupport = (BorderStyleSupport)theEObject;
				T result = caseBorderStyleSupport(borderStyleSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CIRCLE: {
				Circle circle = (Circle)theEObject;
				T result = caseCircle(circle);
				if (result == null) result = caseWidget(circle);
				if (result == null) result = caseColorBackgroundSupport(circle);
				if (result == null) result = caseColorAlphaSupport(circle);
				if (result == null) result = caseColorForegroundSupport(circle);
				if (result == null) result = caseBorderSupport(circle);
				if (result == null) result = caseIconPositionSupport(circle);
				if (result == null) result = caseFontSupport(circle);
				if (result == null) result = caseLinkSupport(circle);
				if (result == null) result = caseTextAlignmentSupport(circle);
				if (result == null) result = caseLineStyleSupport(circle);
				if (result == null) result = caseNoteSupport(circle);
				if (result == null) result = caseNameSupport(circle);
				if (result == null) result = caseVisibleSupport(circle);
				if (result == null) result = caseIconSupport(circle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RECTANGLE: {
				Rectangle rectangle = (Rectangle)theEObject;
				T result = caseRectangle(rectangle);
				if (result == null) result = caseWidget(rectangle);
				if (result == null) result = caseColorBackgroundSupport(rectangle);
				if (result == null) result = caseColorAlphaSupport(rectangle);
				if (result == null) result = caseColorForegroundSupport(rectangle);
				if (result == null) result = caseBorderStyleSupport(rectangle);
				if (result == null) result = caseIconPositionSupport(rectangle);
				if (result == null) result = caseFontSupport(rectangle);
				if (result == null) result = caseLinkSupport(rectangle);
				if (result == null) result = caseTextAlignmentSupport(rectangle);
				if (result == null) result = caseNoteSupport(rectangle);
				if (result == null) result = caseNameSupport(rectangle);
				if (result == null) result = caseVisibleSupport(rectangle);
				if (result == null) result = caseIconSupport(rectangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ICON_POSITION_SUPPORT: {
				IconPositionSupport iconPositionSupport = (IconPositionSupport)theEObject;
				T result = caseIconPositionSupport(iconPositionSupport);
				if (result == null) result = caseIconSupport(iconPositionSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LIST_SUPPORT: {
				ListSupport listSupport = (ListSupport)theEObject;
				T result = caseListSupport(listSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CHART: {
				Chart chart = (Chart)theEObject;
				T result = caseChart(chart);
				if (result == null) result = caseWidget(chart);
				if (result == null) result = caseSkinSupport(chart);
				if (result == null) result = caseNoteSupport(chart);
				if (result == null) result = caseNameSupport(chart);
				if (result == null) result = caseVisibleSupport(chart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CROSS_OUT: {
				CrossOut crossOut = (CrossOut)theEObject;
				T result = caseCrossOut(crossOut);
				if (result == null) result = caseWidget(crossOut);
				if (result == null) result = caseColorForegroundSupport(crossOut);
				if (result == null) result = caseColorAlphaSupport(crossOut);
				if (result == null) result = caseSkinSupport(crossOut);
				if (result == null) result = caseAnnotationSupport(crossOut);
				if (result == null) result = caseNoteSupport(crossOut);
				if (result == null) result = caseNameSupport(crossOut);
				if (result == null) result = caseVisibleSupport(crossOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ITEM: {
				Item item = (Item)theEObject;
				T result = caseItem(item);
				if (result == null) result = caseClickSupport(item);
				if (result == null) result = caseLinkSupport(item);
				if (result == null) result = caseVisibleSupport(item);
				if (result == null) result = caseNameSupport(item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ITEM_SUPPORT: {
				ItemSupport itemSupport = (ItemSupport)theEObject;
				T result = caseItemSupport(itemSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LINK_SUPPORT: {
				LinkSupport linkSupport = (LinkSupport)theEObject;
				T result = caseLinkSupport(linkSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.HOTSPOT: {
				Hotspot hotspot = (Hotspot)theEObject;
				T result = caseHotspot(hotspot);
				if (result == null) result = caseWidget(hotspot);
				if (result == null) result = caseLinkSupport(hotspot);
				if (result == null) result = caseNoteSupport(hotspot);
				if (result == null) result = caseNameSupport(hotspot);
				if (result == null) result = caseVisibleSupport(hotspot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.NAME_SUPPORT: {
				NameSupport nameSupport = (NameSupport)theEObject;
				T result = caseNameSupport(nameSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COLOR_ALTERNATIVE_SUPPORT: {
				ColorAlternativeSupport colorAlternativeSupport = (ColorAlternativeSupport)theEObject;
				T result = caseColorAlternativeSupport(colorAlternativeSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LINE_STYLE_SUPPORT: {
				LineStyleSupport lineStyleSupport = (LineStyleSupport)theEObject;
				T result = caseLineStyleSupport(lineStyleSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ROTATION_SUPPORT: {
				RotationSupport rotationSupport = (RotationSupport)theEObject;
				T result = caseRotationSupport(rotationSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FLIP_SUPPORT: {
				FlipSupport flipSupport = (FlipSupport)theEObject;
				T result = caseFlipSupport(flipSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SVG_IMAGE: {
				SVGImage svgImage = (SVGImage)theEObject;
				T result = caseSVGImage(svgImage);
				if (result == null) result = caseWidget(svgImage);
				if (result == null) result = caseLinkSupport(svgImage);
				if (result == null) result = caseColorBackgroundSupport(svgImage);
				if (result == null) result = caseColorForegroundSupport(svgImage);
				if (result == null) result = caseColorAlphaSupport(svgImage);
				if (result == null) result = caseRotationSupport(svgImage);
				if (result == null) result = caseFlipSupport(svgImage);
				if (result == null) result = caseNoteSupport(svgImage);
				if (result == null) result = caseNameSupport(svgImage);
				if (result == null) result = caseVisibleSupport(svgImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SKIN_SUPPORT: {
				SkinSupport skinSupport = (SkinSupport)theEObject;
				T result = caseSkinSupport(skinSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SHAPE: {
				Shape shape = (Shape)theEObject;
				T result = caseShape(shape);
				if (result == null) result = caseWidget(shape);
				if (result == null) result = caseColorBackgroundSupport(shape);
				if (result == null) result = caseColorAlphaSupport(shape);
				if (result == null) result = caseColorForegroundSupport(shape);
				if (result == null) result = caseBorderSupport(shape);
				if (result == null) result = caseIconPositionSupport(shape);
				if (result == null) result = caseFontSupport(shape);
				if (result == null) result = caseLinkSupport(shape);
				if (result == null) result = caseTextAlignmentSupport(shape);
				if (result == null) result = caseLineStyleSupport(shape);
				if (result == null) result = caseSkinSupport(shape);
				if (result == null) result = caseRotationSupport(shape);
				if (result == null) result = caseNoteSupport(shape);
				if (result == null) result = caseNameSupport(shape);
				if (result == null) result = caseVisibleSupport(shape);
				if (result == null) result = caseIconSupport(shape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ALERT: {
				Alert alert = (Alert)theEObject;
				T result = caseAlert(alert);
				if (result == null) result = caseWidget(alert);
				if (result == null) result = caseIconSupport(alert);
				if (result == null) result = caseItemSupport(alert);
				if (result == null) result = caseFontSupport(alert);
				if (result == null) result = caseSkinSupport(alert);
				if (result == null) result = caseNoteSupport(alert);
				if (result == null) result = caseNameSupport(alert);
				if (result == null) result = caseVisibleSupport(alert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SWITCH: {
				com.wireframesketcher.model.Switch switch_ = (com.wireframesketcher.model.Switch)theEObject;
				T result = caseSwitch(switch_);
				if (result == null) result = caseWidget(switch_);
				if (result == null) result = caseBooleanSelectionSupport(switch_);
				if (result == null) result = caseColorBackgroundSupport(switch_);
				if (result == null) result = caseFontSupport(switch_);
				if (result == null) result = caseLinkSupport(switch_);
				if (result == null) result = caseStateSupport(switch_);
				if (result == null) result = caseSkinSupport(switch_);
				if (result == null) result = caseNoteSupport(switch_);
				if (result == null) result = caseNameSupport(switch_);
				if (result == null) result = caseVisibleSupport(switch_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LINE_HEIGHT_SUPPORT: {
				LineHeightSupport lineHeightSupport = (LineHeightSupport)theEObject;
				T result = caseLineHeightSupport(lineHeightSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CLICK_SUPPORT: {
				ClickSupport clickSupport = (ClickSupport)theEObject;
				T result = caseClickSupport(clickSupport);
				if (result == null) result = caseNameSupport(clickSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TEXT_INPUT_SUPPORT: {
				TextInputSupport textInputSupport = (TextInputSupport)theEObject;
				T result = caseTextInputSupport(textInputSupport);
				if (result == null) result = caseNameSupport(textInputSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DOUBLE_CLICK_SUPPORT: {
				DoubleClickSupport doubleClickSupport = (DoubleClickSupport)theEObject;
				T result = caseDoubleClickSupport(doubleClickSupport);
				if (result == null) result = caseNameSupport(doubleClickSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.VISIBLE_SUPPORT: {
				VisibleSupport visibleSupport = (VisibleSupport)theEObject;
				T result = caseVisibleSupport(visibleSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FRAME: {
				Frame frame = (Frame)theEObject;
				T result = caseFrame(frame);
				if (result == null) result = casePanel(frame);
				if (result == null) result = caseWidget(frame);
				if (result == null) result = caseColorBackgroundSupport(frame);
				if (result == null) result = caseColorAlphaSupport(frame);
				if (result == null) result = caseVerticalScrollbarSupport(frame);
				if (result == null) result = caseColorForegroundSupport(frame);
				if (result == null) result = caseBorderStyleSupport(frame);
				if (result == null) result = caseLinkSupport(frame);
				if (result == null) result = caseSkinSupport(frame);
				if (result == null) result = caseNoteSupport(frame);
				if (result == null) result = caseNameSupport(frame);
				if (result == null) result = caseVisibleSupport(frame);
				if (result == null) result = caseValueSupport(frame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.VBUTTON_BAR: {
				VButtonBar vButtonBar = (VButtonBar)theEObject;
				T result = caseVButtonBar(vButtonBar);
				if (result == null) result = caseWidget(vButtonBar);
				if (result == null) result = caseSelectionSupport(vButtonBar);
				if (result == null) result = caseFontSupport(vButtonBar);
				if (result == null) result = caseTextAlignmentSupport(vButtonBar);
				if (result == null) result = caseColorBackgroundSupport(vButtonBar);
				if (result == null) result = caseItemSupport(vButtonBar);
				if (result == null) result = caseSkinSupport(vButtonBar);
				if (result == null) result = caseNoteSupport(vButtonBar);
				if (result == null) result = caseNameSupport(vButtonBar);
				if (result == null) result = caseVisibleSupport(vButtonBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ANNOTATION_SUPPORT: {
				AnnotationSupport annotationSupport = (AnnotationSupport)theEObject;
				T result = caseAnnotationSupport(annotationSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TEXT_LINKS_SUPPORT: {
				TextLinksSupport textLinksSupport = (TextLinksSupport)theEObject;
				T result = caseTextLinksSupport(textLinksSupport);
				if (result == null) result = caseItemSupport(textLinksSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.NOTE_SUPPORT: {
				NoteSupport noteSupport = (NoteSupport)theEObject;
				T result = caseNoteSupport(noteSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScreen(Screen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screen Ruler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screen Ruler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScreenRuler(ScreenRuler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ruler Guide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ruler Guide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRulerGuide(RulerGuide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidget(Widget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButton(Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Checkbox</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Checkbox</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckbox(Checkbox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombo(Combo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Placeholder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Placeholder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceholder(Placeholder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radio Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radio Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRadioButton(RadioButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextField(TextField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Window</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Window</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindow(Window object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidgetDescriptor(WidgetDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArea(Area object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Popup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Popup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePopup(Popup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenu(Menu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTree(Tree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Icon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Icon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIcon(Icon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextArea(TextArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Browser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Browser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrowser(Browser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFont(Font object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidgetContainer(WidgetContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidgetGroup(WidgetGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Master</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Master</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaster(Master object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screen Font</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screen Font</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScreenFont(ScreenFont object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFontSupport(FontSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Foreground Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Foreground Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorForegroundSupport(ColorForegroundSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Background Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Background Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorBackgroundSupport(ColorBackgroundSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Border Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Border Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorBorderSupport(ColorBorderSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Alpha Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Alpha Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorAlphaSupport(ColorAlphaSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectionSupport(SelectionSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Alignment Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Alignment Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextAlignmentSupport(TextAlignmentSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Selection Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Selection Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanSelectionSupport(BooleanSelectionSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNote(Note object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Progress Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Progress Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgressBar(ProgressBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Callout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Callout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallout(Callout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchField(SearchField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tooltip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tooltip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTooltip(Tooltip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scratch Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scratch Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScratchOut(ScratchOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Border Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Border Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBorderSupport(BorderSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateSupport(StateSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Breadcrumbs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Breadcrumbs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreadcrumbs(Breadcrumbs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkBar(LinkBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accordion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accordion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccordion(Accordion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertical Scrollbar Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertical Scrollbar Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerticalScrollbarSupport(VerticalScrollbarSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateField(DateField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video Player</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Player</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoPlayer(VideoPlayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMap(Map object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cover Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cover Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverFlow(CoverFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tabbed Pane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tabbed Pane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabbedPane(TabbedPane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Icon Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Icon Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIconSupport(IconSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HSplitter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HSplitter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHSplitter(HSplitter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSplitter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSplitter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSplitter(VSplitter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSupport(ValueSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Picker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Picker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorPicker(ColorPicker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arrow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arrow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrow(Arrow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curly Brace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curly Brace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurlyBrace(CurlyBrace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonBar(ButtonBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Border Style Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Border Style Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBorderStyleSupport(BorderStyleSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircle(Circle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectangle(Rectangle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Icon Position Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Icon Position Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIconPositionSupport(IconPositionSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListSupport(ListSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChart(Chart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cross Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cross Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrossOut(CrossOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemSupport(ItemSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkSupport(LinkSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hotspot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hotspot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHotspot(Hotspot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameSupport(NameSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Alternative Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Alternative Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorAlternativeSupport(ColorAlternativeSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Style Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Style Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineStyleSupport(LineStyleSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotation Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotation Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotationSupport(RotationSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flip Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flip Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlipSupport(FlipSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SVG Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SVG Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSVGImage(SVGImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skin Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skin Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkinSupport(SkinSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShape(Shape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlert(Alert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitch(com.wireframesketcher.model.Switch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Height Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Height Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineHeightSupport(LineHeightSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Click Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Click Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClickSupport(ClickSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Input Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Input Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextInputSupport(TextInputSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Click Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Click Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleClickSupport(DoubleClickSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visible Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visible Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisibleSupport(VisibleSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frame</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frame</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrame(Frame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VButton Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VButton Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVButtonBar(VButtonBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationSupport(AnnotationSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Links Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Links Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextLinksSupport(TextLinksSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoteSupport(NoteSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spinner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spinner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpinner(Spinner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HScrollbar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HScrollbar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHScrollbar(HScrollbar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VScrollbar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VScrollbar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVScrollbar(VScrollbar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HLine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HLine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHLine(HLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VLine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VLine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVLine(VLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HSlider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HSlider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHSlider(HSlider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSlider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSlider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSlider(VSlider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tabs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tabs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabs(Tabs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseList(List object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePanel(Panel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
