/*
 * generated by Xtext 2.20.0
 */
package org.mdse.minisql.query.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.mdse.minisql.query.MSQLQueryRuntimeModule;
import org.mdse.minisql.query.MSQLQueryStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class MSQLQueryIdeSetup extends MSQLQueryStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MSQLQueryRuntimeModule(), new MSQLQueryIdeModule()));
	}
	
}
