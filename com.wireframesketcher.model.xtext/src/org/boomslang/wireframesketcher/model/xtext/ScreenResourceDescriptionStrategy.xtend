package org.boomslang.wireframesketcher.model.xtext

import com.google.inject.Inject
// import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import org.eclipse.xtext.util.IAcceptor

class ScreenResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {

    // private final static val LOG = Logger::getLogger(ScreenResourceDescriptionStrategy)

	@Inject extension ScreenResourceDescriptionStrategyUtil
	/**
	 * Key in the User Data of an IEObjectDescription that says if the widget/screen is a component. 
	 */
    public final static val IS_COMPONENT = "IS_COMPONENT"
    
    
    /**
	 * Key in the User Data of an IEObjectDescription that says if the widget/screen is a component part which is by
	 * by definition always a part of a component. 
	 */
    public final static val IS_COMPONENT_PART = "IS_COMPONENT_PART"

    override createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
        if (getQualifiedNameProvider() == null)
            return false;
        try {
            val qualifiedName = getQualifiedNameProvider().getFullyQualifiedName(eObject);
            val userData = newHashMap(IS_COMPONENT -> ""+eObject.isComponent,IS_COMPONENT_PART->""+eObject.isComponentPart)
            if (qualifiedName != null) {
                acceptor.accept(EObjectDescription.create(qualifiedName, eObject, userData));
            }
        } catch (Exception exc) {
            // LOG.error(exc.getMessage(), exc);
            println(exc.class.name + ": " + exc.message)
        }
        return true;
    }



}