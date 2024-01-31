/*
 * generated by Xtext 2.33.0
 */
package arg.ui;

import alterar.editor.ui.internal.EditorActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ArgExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(EditorActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		EditorActivator activator = EditorActivator.getInstance();
		return activator != null ? activator.getInjector(EditorActivator.ARG_ARG) : null;
	}

}
