package com.wireframesketcher.model.xtext;

import org.eclipse.emf.ecore.EObject;

import com.wireframesketcher.model.NameSupport;
import com.wireframesketcher.model.impl.ModelXMLResourceImpl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

public class BoomslangWFSModelXMLResourceImpl extends ModelXMLResourceImpl {

	@Override
	public EObject getEObject(String uriFragment) {
		EList<EObject> contents = getContents();
		String name = URI.decode(uriFragment);
		for (int i = 0; i < contents.size(); i++) {
			EObject root = contents.get(i);
			if (root instanceof NameSupport
					&& name.equals(((NameSupport) root).getName()))
				return root;
		}

		return super.getEObject(uriFragment);
	}

	public BoomslangWFSModelXMLResourceImpl(URI uri) {
		super(uri);
	}

	public BoomslangWFSModelXMLResourceImpl() {
	  super();
	}

}
