package me.zehua.customvars.resolver;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateVariableResolver;

public class IsoDatetimeResolver extends TemplateVariableResolver {
	public IsoDatetimeResolver() {
		super("isodatetime", "ISO Datetime");
	}

	@Override
	protected String resolve(TemplateContext context) {
		return DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(ZonedDateTime.now());
	}
}
