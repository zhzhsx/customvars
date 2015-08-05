package me.zehua.customvars;

import java.util.Iterator;

import org.eclipse.jdt.internal.ui.JavaPlugin;
import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.TemplateContextType;
import org.eclipse.ui.IStartup;

import me.zehua.customvars.resolver.IsoDatetimeResolver;

@SuppressWarnings("restriction")
public class Startup implements IStartup {

	@Override
	public void earlyStartup() {
		registerResolvers();
	}

	private void registerResolvers() {
		ContextTypeRegistry codeTemplateContextRegistry = JavaPlugin.getDefault().getCodeTemplateContextRegistry();

		final Iterator<?> ctIter = codeTemplateContextRegistry.contextTypes();
		while (ctIter.hasNext()) {
			final TemplateContextType contextType = (TemplateContextType) ctIter.next();
			contextType.addResolver(new IsoDatetimeResolver());
		}
	}

}