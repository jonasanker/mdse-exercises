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
import org.mdse.minisql.query.ide.contentassist.antlr.internal.InternalMSQLQueryParser;
import org.mdse.minisql.query.services.MSQLQueryGrammarAccess;

public class MSQLQueryParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MSQLQueryGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MSQLQueryGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getWhatDirectiveAccess().getAlternatives(), "rule__WhatDirective__Alternatives");
			builder.put(grammarAccess.getAtomicExpressionAccess().getAlternatives(), "rule__AtomicExpression__Alternatives");
			builder.put(grammarAccess.getOrderByDirectiveAccess().getAscendingAlternatives_1_0(), "rule__OrderByDirective__AscendingAlternatives_1_0");
			builder.put(grammarAccess.getAdditiveOperatorAccess().getAlternatives(), "rule__AdditiveOperator__Alternatives");
			builder.put(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives(), "rule__MultiplicativeOperator__Alternatives");
			builder.put(grammarAccess.getComparativeOperatorAccess().getAlternatives(), "rule__ComparativeOperator__Alternatives");
			builder.put(grammarAccess.getSelectQueryAccess().getGroup(), "rule__SelectQuery__Group__0");
			builder.put(grammarAccess.getWhatClauseAccess().getGroup(), "rule__WhatClause__Group__0");
			builder.put(grammarAccess.getWhatClauseAccess().getGroup_1(), "rule__WhatClause__Group_1__0");
			builder.put(grammarAccess.getAllColumnsWhatDirectiveAccess().getGroup(), "rule__AllColumnsWhatDirective__Group__0");
			builder.put(grammarAccess.getFromClauseAccess().getGroup(), "rule__FromClause__Group__0");
			builder.put(grammarAccess.getWhereClauseAccess().getGroup(), "rule__WhereClause__Group__0");
			builder.put(grammarAccess.getAdditiveExpressionAccess().getGroup(), "rule__AdditiveExpression__Group__0");
			builder.put(grammarAccess.getAdditiveExpressionAccess().getGroup_1(), "rule__AdditiveExpression__Group_1__0");
			builder.put(grammarAccess.getMultiplicativeExpressionAccess().getGroup(), "rule__MultiplicativeExpression__Group__0");
			builder.put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1(), "rule__MultiplicativeExpression__Group_1__0");
			builder.put(grammarAccess.getComparativeExpressionAccess().getGroup(), "rule__ComparativeExpression__Group__0");
			builder.put(grammarAccess.getComparativeExpressionAccess().getGroup_1(), "rule__ComparativeExpression__Group_1__0");
			builder.put(grammarAccess.getAtomicExpressionAccess().getGroup_0(), "rule__AtomicExpression__Group_0__0");
			builder.put(grammarAccess.getOrderByClauseAccess().getGroup(), "rule__OrderByClause__Group__0");
			builder.put(grammarAccess.getOrderByClauseAccess().getGroup_3(), "rule__OrderByClause__Group_3__0");
			builder.put(grammarAccess.getOrderByDirectiveAccess().getGroup(), "rule__OrderByDirective__Group__0");
			builder.put(grammarAccess.getSelectQueryAccess().getWhatClauseAssignment_1(), "rule__SelectQuery__WhatClauseAssignment_1");
			builder.put(grammarAccess.getSelectQueryAccess().getFromClauseAssignment_2(), "rule__SelectQuery__FromClauseAssignment_2");
			builder.put(grammarAccess.getSelectQueryAccess().getWhereClauseAssignment_3(), "rule__SelectQuery__WhereClauseAssignment_3");
			builder.put(grammarAccess.getSelectQueryAccess().getOrderByClauseAssignment_4(), "rule__SelectQuery__OrderByClauseAssignment_4");
			builder.put(grammarAccess.getWhatClauseAccess().getWhatDirectiveAssignment_0(), "rule__WhatClause__WhatDirectiveAssignment_0");
			builder.put(grammarAccess.getWhatClauseAccess().getWhatDirectiveAssignment_1_1(), "rule__WhatClause__WhatDirectiveAssignment_1_1");
			builder.put(grammarAccess.getSingleColumnWhatDirectiveAccess().getColumnReferenceAssignment(), "rule__SingleColumnWhatDirective__ColumnReferenceAssignment");
			builder.put(grammarAccess.getFromClauseAccess().getTableAssignment_1(), "rule__FromClause__TableAssignment_1");
			builder.put(grammarAccess.getWhereClauseAccess().getExpressionAssignment_1(), "rule__WhereClause__ExpressionAssignment_1");
			builder.put(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_1(), "rule__AdditiveExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getAdditiveExpressionAccess().getExpression2Assignment_1_2(), "rule__AdditiveExpression__Expression2Assignment_1_2");
			builder.put(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_1(), "rule__MultiplicativeExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getMultiplicativeExpressionAccess().getExpression2Assignment_1_2(), "rule__MultiplicativeExpression__Expression2Assignment_1_2");
			builder.put(grammarAccess.getComparativeExpressionAccess().getOperatorAssignment_1_1(), "rule__ComparativeExpression__OperatorAssignment_1_1");
			builder.put(grammarAccess.getComparativeExpressionAccess().getExpression2Assignment_1_2(), "rule__ComparativeExpression__Expression2Assignment_1_2");
			builder.put(grammarAccess.getIntegerLiteralAccess().getValueAssignment(), "rule__IntegerLiteral__ValueAssignment");
			builder.put(grammarAccess.getOrderByClauseAccess().getOrderDirectivesAssignment_2(), "rule__OrderByClause__OrderDirectivesAssignment_2");
			builder.put(grammarAccess.getOrderByClauseAccess().getOrderDirectivesAssignment_3_1(), "rule__OrderByClause__OrderDirectivesAssignment_3_1");
			builder.put(grammarAccess.getOrderByDirectiveAccess().getColumnReferenceAssignment_0(), "rule__OrderByDirective__ColumnReferenceAssignment_0");
			builder.put(grammarAccess.getOrderByDirectiveAccess().getAscendingAssignment_1(), "rule__OrderByDirective__AscendingAssignment_1");
			builder.put(grammarAccess.getColumnReferenceAccess().getColumnAssignment(), "rule__ColumnReference__ColumnAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MSQLQueryGrammarAccess grammarAccess;

	@Override
	protected InternalMSQLQueryParser createParser() {
		InternalMSQLQueryParser result = new InternalMSQLQueryParser(null);
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

	public MSQLQueryGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MSQLQueryGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
