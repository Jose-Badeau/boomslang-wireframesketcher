package com.wireframesketcher.model.xtext.ui

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory

class ScreenExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
	
	override protected getBundle() {
		return Activator.getDefault().getBundle()
	}
	
	override protected getInjector() {
		return Activator.getDefault().getInjector()
	}
	
	
}