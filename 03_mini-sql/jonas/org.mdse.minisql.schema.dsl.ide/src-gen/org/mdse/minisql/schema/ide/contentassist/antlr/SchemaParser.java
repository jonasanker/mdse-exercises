/*
 * generated by Xtext 2.20.0
 */
package org.mdse.minisql.schema.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.mdse.minisql.schema.ide.contentassist.antlr.internal.InternalSchemaParser;
import org.mdse.minisql.schema.services.SchemaGrammarAccess;

public class SchemaParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SchemaGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SchemaGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getTableAccess().getGroup(), "rule__Table__Group__0");
			builder.put(grammarAccess.getTableAccess().getGroup_4(), "rule__Table__Group_4__0");
			builder.put(grammarAccess.getTableAccess().getNameAssignment_1(), "rule__Table__NameAssignment_1");
			builder.put(grammarAccess.getTableAccess().getColumnsAssignment_3(), "rule__Table__ColumnsAssignment_3");
			builder.put(grammarAccess.getTableAccess().getColumnsAssignment_4_1(), "rule__Table__ColumnsAssignment_4_1");
			builder.put(grammarAccess.getColumnAccess().getNameAssignment(), "rule__Column__NameAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SchemaGrammarAccess grammarAccess;

	@Override
	protected InternalSchemaParser createParser() {
		InternalSchemaParser result = new InternalSchemaParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SchemaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SchemaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
