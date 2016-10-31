package org.boomslang.wireframesketcher.model.xtext;

import com.wireframesketcher.model.impl.ModelXMLResourceFactoryImpl;
import com.wireframesketcher.model.xtext.BoomslangWFSModelXMLResourceImpl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * ResourceFactory is needed to register own BoomslangModelXMLResourceImpl to be able to handle all changes
 * made in the wireframsketcher model.
 */
public class BoomslangWFSModelResourceFactory extends ModelXMLResourceFactoryImpl implements IResourceFactory {
    
	@Override
    public Resource createResource (URI uri){
        return new BoomslangWFSModelXMLResourceImpl(uri) ;
	}
}