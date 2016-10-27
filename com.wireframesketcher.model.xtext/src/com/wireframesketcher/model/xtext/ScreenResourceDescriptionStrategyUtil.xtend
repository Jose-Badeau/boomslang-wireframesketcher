package com.wireframesketcher.model.xtext

import com.wireframesketcher.model.Master
import com.wireframesketcher.model.Screen
import com.wireframesketcher.model.WidgetGroup
import org.eclipse.emf.ecore.EObject
import com.wireframesketcher.model.TabbedPane
import org.eclipse.emf.common.util.EList
import com.wireframesketcher.model.Widget

class ScreenResourceDescriptionStrategyUtil {
	
	/**
	 * A screen is a component if it contains a tabbed pane, either directly or within a widget group.
	 */
	def isComponent(EObject candidate) {
		switch (candidate) {
			Screen: {
				val widgets = candidate.widgets;
				(!widgets.nullOrEmpty && 
					(widgets.containsTabbedPane || 
						widgets.filter(WidgetGroup).exists[grp|grp.widgets.containsTabbedPane()]					
					)
				)
			}
		}
	}
	
 	/**
 	 * A screen is a component part, if it represents a tab of a tabbed pane, i.e. if it contains
 	 * a master widget that is a component (has a tabbed pane).
 	 */
	def isComponentPart(EObject candidate) {
		switch (candidate) {
			Screen: {
				val widgets = candidate.widgets;
				if (!widgets.nullOrEmpty && widgets.filter(Master).size > 0) {
					val masters = widgets.filter(Master)
					masters.exists[m| 
						val masterScreen = m.screen
						masterScreen != null && masterScreen.component
					]
				} else {
					false
				}
			}
		}
	}
	
	def boolean containsTabbedPane(EList<Widget> widgets) {
		val res = !widgets.nullOrEmpty && 
			widgets.filter(TabbedPane).size > 0
		return res
	} 
	
}
