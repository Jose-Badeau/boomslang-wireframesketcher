package com.wireframesketcher.model.xtext

import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy
import org.eclipse.xtext.resource.IResourceFactory
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule

class ScreenRuntimeModule extends AbstractGenericResourceRuntimeModule {
	
	override protected getFileExtensions() {
		"screen"
	}
	
	override protected getLanguageName() {
		"com.wireframesketcher.ui.editors.ScreenEditor"
	}
	
	def public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return ScreenResourceDescriptionStrategy
	}

	override public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return ScreenQualifiedNameProvider
	}
	
	def public Class<? extends IResourceFactory> bindResourceFactory() {
		return BoomslangWFSModelResourceFactory
	}
	
	
}