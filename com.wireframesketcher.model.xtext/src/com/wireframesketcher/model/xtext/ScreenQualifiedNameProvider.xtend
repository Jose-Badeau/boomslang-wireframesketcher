package com.wireframesketcher.model.xtext

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import com.wireframesketcher.model.Item

class ScreenQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
//	override getFullyQualifiedName(EObject obj) {
//		super.getFullyQualifiedName(obj)
//	}
	
	
	/**
	 * if the tab item name property is not set, take the 'text' property instead for the qualified name
	 */
	def QualifiedName qualifiedName(Item tabItem) {
		var itemName = tabItem.name
		if (itemName == null) {
			itemName = tabItem.text.replaceAll("\\s", "_").replaceAll('''^"''', "").replaceAll('''"$''',"")
		}
		val parentQN = tabItem.eContainer.fullyQualifiedName
		val QualifiedName qualifiedNameFromConverter = converter.toQualifiedName(itemName);
		val itemQN = parentQN.append(qualifiedNameFromConverter)
		println("Tab item's qualified name: " + itemQN + "  " + tabItem)
		itemQN
	}
	
}