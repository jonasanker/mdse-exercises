/*
 * generated by Xtext 2.20.0
 */
package org.mdse.minisql.schema;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class MSQLSchemaStandaloneSetup extends MSQLSchemaStandaloneSetupGenerated {

	public static void doSetup() {
		new MSQLSchemaStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
