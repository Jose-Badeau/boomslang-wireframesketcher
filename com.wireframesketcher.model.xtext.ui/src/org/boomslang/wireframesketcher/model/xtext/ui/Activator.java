package org.boomslang.wireframesketcher.model.xtext.ui;

import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.util.Modules;
import org.boomslang.wireframesketcher.model.xtext.ScreenRuntimeModule;
import org.boomslang.wireframesketcher.model.xtext.ui.ScreenUiModule;

/**
 * The activator class controls the plug-in life cycle
 * 
 * This activator was generated with the Eclipse plug-in project wizard
 * (selecting Activator) and extended with glue code
 * 
 * Don't forget to add the following to the plugin.xml, with the
 * customized executable extension factory and the correct file extension
 * 
 * <pre>{@code 
 * <?xml version="1.0" encoding="UTF-8"?>
 * <?eclipse version="3.4"?>
 * <plugin>
 *	<!-- EMF ext glue code -->
 *	    <extension
 *	          point="org.eclipse.xtext.extension_resourceServiceProvider">
 *	        <resourceServiceProvider
 *	              class="org.xtext.example.extemf.ui.ExtEmfExecutableExtensionFactory:org.eclipse.xtext.ui.resource.generic.EmfResourceUIServiceProvider"
 *	              uriExtension="extemf">
 *	        </resourceServiceProvider>
 *	</extension>
 *	</plugin>}
 *</pre 
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.boomslang.wireframesketcher.model.xtext.ui"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	/** EMF ext glue code */
	private static final Logger logger = Logger.getLogger(Activator.class);

	/** EMF ext glue code */
	private Injector injector;

	/** EMF ext glue code */
	public Injector getInjector() {
		return injector;
	}

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/** EMF ext glue code */
	private void initializeEcoreInjector() {
		injector = Guice.createInjector(Modules.override(
				Modules.override(new ScreenRuntimeModule()).with(
						new ScreenUiModule(plugin))).with(
				new SharedStateModule()));
	}

	/** EMF ext glue code */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		try {
			initializeEcoreInjector();
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}

	/** EMF ext glue code */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		injector = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
