package org.boomslang.wireframesketcher.model.xtext

import org.eclipse.xtext.resource.IEObjectDescription

/**
 * This class offers util functions to query the UserData of the IEObjectDescription
 */
class IEObjectDescriptionUtil {
	
	/**
	 * Returns true if the user data of the given IEObjectDescription contains the key {@link ScreenResourceDescriptionStrategy#IS_COMPONENT}
	 * with a value equals "true" 
	 */
	def isComponent(IEObjectDescription description) {
        "true".equals(description.getUserData(ScreenResourceDescriptionStrategy.IS_COMPONENT))
    }

	/**
	 * Returns true if the user data of the given IEObjectDescription contains the key {@link ScreenResourceDescriptionStrategy#IS_COMPONENT_PART}
	 * with a value equals "true" 
	 */
    def isComponentPart(IEObjectDescription description) {
        "true".equals(description.getUserData(ScreenResourceDescriptionStrategy.IS_COMPONENT_PART))
    }
}