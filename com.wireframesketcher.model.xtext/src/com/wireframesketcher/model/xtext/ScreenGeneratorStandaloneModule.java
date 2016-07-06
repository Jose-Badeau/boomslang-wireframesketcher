package com.wireframesketcher.model.xtext;

import org.eclipse.xtext.service.AbstractGenericModule;

public class ScreenGeneratorStandaloneModule extends AbstractGenericModule{
	
	public Class<? extends org.eclipse.xtext.generator.IGenerator> bindIGenerator() {
		// screens do not generate anything - just the model of the screens is used
		// however, in order to avoid a NPE during the mvn build, provide a dummy generator
		return org.eclipse.xtext.generator.IGenerator.NullGenerator.class;
	}

}
