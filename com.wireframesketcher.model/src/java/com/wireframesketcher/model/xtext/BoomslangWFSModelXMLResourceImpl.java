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
			//Second enhancement to handle Widgets in WidgetGroups
			//TODO Consider WidgetGroups in WidgetGroups
			EList<EObject> children = root.eContents();
			for (int j = 0; j < children.size(); j++) {
				EObject child = children.get(j);
				if(child instanceof WidgetGroup){
					EList<Widget> widgets = ((WidgetGroup)child).getWidgets();
					for(Widget widget : widgets){
						if(name.equals(widget.getName())){
							return widget;
						}
					}
				}
			}
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
