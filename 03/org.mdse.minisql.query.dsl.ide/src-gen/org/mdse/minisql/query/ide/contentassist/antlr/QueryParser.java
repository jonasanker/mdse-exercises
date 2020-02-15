/*
 * generated by Xtext 2.20.0
 */
package org.mdse.minisql.query.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.mdse.minisql.query.ide.contentassist.antlr.internal.InternalQueryParser;
import org.mdse.minisql.query.services.QueryGrammarAccess;

public class QueryParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(QueryGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, QueryGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getSelectQueryAccess().getGroup(), "rule__SelectQuery__Group__0");
			builder.put(grammarAccess.getSelectQueryAccess().getGroup_2(), "rule__SelectQuery__Group_2__0");
			builder.put(grammarAccess.getSelectQueryAccess().getWhatAssignment_1(), "rule__SelectQuery__WhatAssignment_1");
			builder.put(grammarAccess.getSelectQueryAccess().getWhatAssignment_2_1(), "rule__SelectQuery__WhatAssignment_2_1");
			builder.put(grammarAccess.getSelectQueryAccess().getFromAssignment_4(), "rule__SelectQuery__FromAssignment_4");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private QueryGrammarAccess grammarAccess;

	@Override
	protected InternalQueryParser createParser() {
		InternalQueryParser result = new InternalQueryParser(null);
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

	public QueryGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(QueryGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
