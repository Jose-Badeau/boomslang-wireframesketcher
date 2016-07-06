package com.wireframesketcher.model.xtext

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport

/**
 * If we want to use the external model from an MWE workflow
 */
class ScreenEmfSupport extends AbstractGenericResourceSupport {
	
	override protected createGuiceModule() {
		return new ScreenRuntimeModule()
	}
	
}