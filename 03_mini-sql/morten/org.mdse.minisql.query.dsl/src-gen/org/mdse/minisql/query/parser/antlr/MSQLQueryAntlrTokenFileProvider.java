/*
 * generated by Xtext 2.20.0
 */
package org.mdse.minisql.query.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MSQLQueryAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/mdse/minisql/query/parser/antlr/internal/InternalMSQLQuery.tokens");
	}
}
