package com.wireframesketcher.model.xtext;

import org.eclipse.emf.ecore.EObject;

import com.wireframesketcher.model.NameSupport;
import com.wireframesketcher.model.Widget;
import com.wireframesketcher.model.WidgetGroup;
import com.wireframesketcher.model.impl.ModelXMLResourceImpl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

public class BoomslangWFSModelXMLResourceImpl extends ModelXMLResourceImpl {

	@Override
	public EObject getEObject(String uriFragment) {
		//First enhancement to handle screens with name support
		EList<EObject> contents = getContents();
		String name = URI.decode(uriFragment);
		for (int i = 0; i < contents.size(); i++) {
			EObject root = contents.get(i);
			if (root instanceof NameSupport
					&& name.equals(((NameSupport) root).getName())){
				return root;
			}
			//Handle nested WigdetGroups that can contain widgetgroups or widgets 
			EList<EObject> children = root.eContents();
			for (int j = 0; j < children.size(); j++) {
				EObject child = children.get(j);
				if(child instanceof WidgetGroup){
					EObject obj = analyzeNestedWidgets(((WidgetGroup)child).getWidgets(), name);
					if(obj!=null){
						return obj;
					}
				} 
				if (child instanceof Widget){
					if(name.equals(((Widget) child).getName())){
						return child;
					}
				}
			}
		}
		return super.getEObject(uriFragment);
	}
	
	/**
	 * Handles widget groups recursively and searches for the widget with the given name
	 * @param children
	 * @param name
	 * @return
	 */
	private EObject analyzeNestedWidgets(EList<Widget> children, String name){
		for(Widget child : children){
			if (child instanceof WidgetGroup){
				EObject obj  = analyzeNestedWidgets(((WidgetGroup) child).getWidgets(), name);
				if(obj!=null){
					return obj;
				}
			}
			if(child instanceof Widget){
				if(name.equals(((Widget) child).getName())){
					return child;
				}
			}
		}
		return null;
	}

	public BoomslangWFSModelXMLResourceImpl(URI uri) {
		super(uri);
	}

	public BoomslangWFSModelXMLResourceImpl() {
	  super();
	}

}
