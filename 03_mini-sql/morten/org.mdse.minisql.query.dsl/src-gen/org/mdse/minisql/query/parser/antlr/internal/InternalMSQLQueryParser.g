/*
 * generated by Xtext 2.20.0
 */
parser grammar InternalMSQLQueryParser;

options {
	tokenVocab=InternalMSQLQueryLexer;
	superClass=AbstractInternalAntlrParser;
}

@header {
package org.mdse.minisql.query.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.mdse.minisql.query.services.MSQLQueryGrammarAccess;

}

@members {

 	private MSQLQueryGrammarAccess grammarAccess;

    public InternalMSQLQueryParser(TokenStream input, MSQLQueryGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "SelectQuery";
   	}

   	@Override
   	protected MSQLQueryGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleSelectQuery
entryRuleSelectQuery returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSelectQueryRule()); }
	iv_ruleSelectQuery=ruleSelectQuery
	{ $current=$iv_ruleSelectQuery.current; }
	EOF;

// Rule SelectQuery
ruleSelectQuery returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=SELECT
		{
			newLeafNode(otherlv_0, grammarAccess.getSelectQueryAccess().getSELECTKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSelectQueryAccess().getWhatClauseWhatClauseParserRuleCall_1_0());
				}
				lv_whatClause_1_0=ruleWhatClause
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSelectQueryRule());
					}
					add(
						$current,
						"whatClause",
						lv_whatClause_1_0,
						"org.mdse.minisql.query.MSQLQuery.WhatClause");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSelectQueryAccess().getFromClauseFromClauseParserRuleCall_2_0());
				}
				lv_fromClause_2_0=ruleFromClause
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSelectQueryRule());
					}
					set(
						$current,
						"fromClause",
						lv_fromClause_2_0,
						"org.mdse.minisql.query.MSQLQuery.FromClause");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSelectQueryAccess().getWhereClauseWhereClauseParserRuleCall_3_0());
				}
				lv_whereClause_3_0=ruleWhereClause
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSelectQueryRule());
					}
					set(
						$current,
						"whereClause",
						lv_whereClause_3_0,
						"org.mdse.minisql.query.MSQLQuery.WhereClause");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSelectQueryAccess().getOrderByClauseOrderByClauseParserRuleCall_4_0());
				}
				lv_orderByClause_4_0=ruleOrderByClause
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSelectQueryRule());
					}
					set(
						$current,
						"orderByClause",
						lv_orderByClause_4_0,
						"org.mdse.minisql.query.MSQLQuery.OrderByClause");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_5=Semicolon
		{
			newLeafNode(otherlv_5, grammarAccess.getSelectQueryAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleWhatClause
entryRuleWhatClause returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWhatClauseRule()); }
	iv_ruleWhatClause=ruleWhatClause
	{ $current=$iv_ruleWhatClause.current; }
	EOF;

// Rule WhatClause
ruleWhatClause returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getWhatClauseAccess().getWhatDirectiveWhatDirectiveParserRuleCall_0_0());
				}
				lv_whatDirective_0_0=ruleWhatDirective
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWhatClauseRule());
					}
					add(
						$current,
						"whatDirective",
						lv_whatDirective_0_0,
						"org.mdse.minisql.query.MSQLQuery.WhatDirective");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=Comma
			{
				newLeafNode(otherlv_1, grammarAccess.getWhatClauseAccess().getCommaKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getWhatClauseAccess().getWhatDirectiveWhatDirectiveParserRuleCall_1_1_0());
					}
					lv_whatDirective_2_0=ruleWhatDirective
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getWhatClauseRule());
						}
						add(
							$current,
							"whatDirective",
							lv_whatDirective_2_0,
							"org.mdse.minisql.query.MSQLQuery.WhatDirective");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleWhatDirective
entryRuleWhatDirective returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWhatDirectiveRule()); }
	iv_ruleWhatDirective=ruleWhatDirective
	{ $current=$iv_ruleWhatDirective.current; }
	EOF;

// Rule WhatDirective
ruleWhatDirective returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getWhatDirectiveAccess().getAllColumnsWhatDirectiveParserRuleCall_0());
		}
		this_AllColumnsWhatDirective_0=ruleAllColumnsWhatDirective
		{
			$current = $this_AllColumnsWhatDirective_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getWhatDirectiveAccess().getSingleColumnWhatDirectiveParserRuleCall_1());
		}
		this_SingleColumnWhatDirective_1=ruleSingleColumnWhatDirective
		{
			$current = $this_SingleColumnWhatDirective_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAllColumnsWhatDirective
entryRuleAllColumnsWhatDirective returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAllColumnsWhatDirectiveRule()); }
	iv_ruleAllColumnsWhatDirective=ruleAllColumnsWhatDirective
	{ $current=$iv_ruleAllColumnsWhatDirective.current; }
	EOF;

// Rule AllColumnsWhatDirective
ruleAllColumnsWhatDirective returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Asterisk
		{
			newLeafNode(otherlv_0, grammarAccess.getAllColumnsWhatDirectiveAccess().getAsteriskKeyword_0());
		}
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getAllColumnsWhatDirectiveAccess().getAllColumnsWhatDirectiveAction_1(),
					$current);
			}
		)
	)
;

// Entry rule entryRuleSingleColumnWhatDirective
entryRuleSingleColumnWhatDirective returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSingleColumnWhatDirectiveRule()); }
	iv_ruleSingleColumnWhatDirective=ruleSingleColumnWhatDirective
	{ $current=$iv_ruleSingleColumnWhatDirective.current; }
	EOF;

// Rule SingleColumnWhatDirective
ruleSingleColumnWhatDirective returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getSingleColumnWhatDirectiveAccess().getColumnReferenceColumnReferenceParserRuleCall_0());
			}
			lv_columnReference_0_0=ruleColumnReference
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getSingleColumnWhatDirectiveRule());
				}
				set(
					$current,
					"columnReference",
					lv_columnReference_0_0,
					"org.mdse.minisql.query.MSQLQuery.ColumnReference");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleFromClause
entryRuleFromClause returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFromClauseRule()); }
	iv_ruleFromClause=ruleFromClause
	{ $current=$iv_ruleFromClause.current; }
	EOF;

// Rule FromClause
ruleFromClause returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=FROM
		{
			newLeafNode(otherlv_0, grammarAccess.getFromClauseAccess().getFROMKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFromClauseRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getFromClauseAccess().getTableTableCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRuleWhereClause
entryRuleWhereClause returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWhereClauseRule()); }
	iv_ruleWhereClause=ruleWhereClause
	{ $current=$iv_ruleWhereClause.current; }
	EOF;

// Rule WhereClause
ruleWhereClause returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=WHERE
		{
			newLeafNode(otherlv_0, grammarAccess.getWhereClauseAccess().getWHEREKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWhereClauseAccess().getExpressionExpressionParserRuleCall_1_0());
				}
				lv_expression_1_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWhereClauseRule());
					}
					add(
						$current,
						"expression",
						lv_expression_1_0,
						"org.mdse.minisql.query.MSQLQuery.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getExpressionAccess().getComparativeExpressionParserRuleCall());
	}
	this_ComparativeExpression_0=ruleComparativeExpression
	{
		$current = $this_ComparativeExpression_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleAdditiveExpression
entryRuleAdditiveExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAdditiveExpressionRule()); }
	iv_ruleAdditiveExpression=ruleAdditiveExpression
	{ $current=$iv_ruleAdditiveExpression.current; }
	EOF;

// Rule AdditiveExpression
ruleAdditiveExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
		}
		this_MultiplicativeExpression_0=ruleMultiplicativeExpression
		{
			$current = $this_MultiplicativeExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAdditiveExpressionAccess().getArithmeticExpressionExpression1Action_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0());
					}
					lv_operator_2_0=ruleAdditiveOperator
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
						}
						set(
							$current,
							"operator",
							lv_operator_2_0,
							"org.mdse.minisql.query.MSQLQuery.AdditiveOperator");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getExpression2MultiplicativeExpressionParserRuleCall_1_2_0());
					}
					lv_expression2_3_0=ruleMultiplicativeExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
						}
						set(
							$current,
							"expression2",
							lv_expression2_3_0,
							"org.mdse.minisql.query.MSQLQuery.MultiplicativeExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMultiplicativeExpression
entryRuleMultiplicativeExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); }
	iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression
	{ $current=$iv_ruleMultiplicativeExpression.current; }
	EOF;

// Rule MultiplicativeExpression
ruleMultiplicativeExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getAtomicExpressionParserRuleCall_0());
		}
		this_AtomicExpression_0=ruleAtomicExpression
		{
			$current = $this_AtomicExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getMultiplicativeExpressionAccess().getArithmeticExpressionExpression1Action_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0());
					}
					lv_operator_2_0=ruleMultiplicativeOperator
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
						}
						set(
							$current,
							"operator",
							lv_operator_2_0,
							"org.mdse.minisql.query.MSQLQuery.MultiplicativeOperator");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getExpression2AtomicExpressionParserRuleCall_1_2_0());
					}
					lv_expression2_3_0=ruleAtomicExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
						}
						set(
							$current,
							"expression2",
							lv_expression2_3_0,
							"org.mdse.minisql.query.MSQLQuery.AtomicExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleComparativeExpression
entryRuleComparativeExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComparativeExpressionRule()); }
	iv_ruleComparativeExpression=ruleComparativeExpression
	{ $current=$iv_ruleComparativeExpression.current; }
	EOF;

// Rule ComparativeExpression
ruleComparativeExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getComparativeExpressionAccess().getAdditiveExpressionParserRuleCall_0());
		}
		this_AdditiveExpression_0=ruleAdditiveExpression
		{
			$current = $this_AdditiveExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getComparativeExpressionAccess().getComparativeExpressionExpression1Action_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getComparativeExpressionAccess().getOperatorComparativeOperatorEnumRuleCall_1_1_0());
					}
					lv_operator_2_0=ruleComparativeOperator
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getComparativeExpressionRule());
						}
						set(
							$current,
							"operator",
							lv_operator_2_0,
							"org.mdse.minisql.query.MSQLQuery.ComparativeOperator");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getComparativeExpressionAccess().getExpression2AdditiveExpressionParserRuleCall_1_2_0());
					}
					lv_expression2_3_0=ruleAdditiveExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getComparativeExpressionRule());
						}
						set(
							$current,
							"expression2",
							lv_expression2_3_0,
							"org.mdse.minisql.query.MSQLQuery.AdditiveExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAtomicExpression
entryRuleAtomicExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAtomicExpressionRule()); }
	iv_ruleAtomicExpression=ruleAtomicExpression
	{ $current=$iv_ruleAtomicExpression.current; }
	EOF;

// Rule AtomicExpression
ruleAtomicExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0=LeftParenthesis
			{
				newLeafNode(otherlv_0, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_0_0());
			}
			{
				newCompositeNode(grammarAccess.getAtomicExpressionAccess().getExpressionParserRuleCall_0_1());
			}
			this_Expression_1=ruleExpression
			{
				$current = $this_Expression_1.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_2=RightParenthesis
			{
				newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_0_2());
			}
		)
		    |
		{
			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getIntegerLiteralParserRuleCall_1());
		}
		this_IntegerLiteral_3=ruleIntegerLiteral
		{
			$current = $this_IntegerLiteral_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getColumnReferenceParserRuleCall_2());
		}
		this_ColumnReference_4=ruleColumnReference
		{
			$current = $this_ColumnReference_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleIntegerLiteral
entryRuleIntegerLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntegerLiteralRule()); }
	iv_ruleIntegerLiteral=ruleIntegerLiteral
	{ $current=$iv_ruleIntegerLiteral.current; }
	EOF;

// Rule IntegerLiteral
ruleIntegerLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_INT
			{
				newLeafNode(lv_value_0_0, grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getIntegerLiteralRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

// Entry rule entryRuleOrderByClause
entryRuleOrderByClause returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOrderByClauseRule()); }
	iv_ruleOrderByClause=ruleOrderByClause
	{ $current=$iv_ruleOrderByClause.current; }
	EOF;

// Rule OrderByClause
ruleOrderByClause returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=ORDER
		{
			newLeafNode(otherlv_0, grammarAccess.getOrderByClauseAccess().getORDERKeyword_0());
		}
		otherlv_1=BY
		{
			newLeafNode(otherlv_1, grammarAccess.getOrderByClauseAccess().getBYKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOrderByClauseAccess().getOrderDirectivesOrderByDirectiveParserRuleCall_2_0());
				}
				lv_orderDirectives_2_0=ruleOrderByDirective
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOrderByClauseRule());
					}
					add(
						$current,
						"orderDirectives",
						lv_orderDirectives_2_0,
						"org.mdse.minisql.query.MSQLQuery.OrderByDirective");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=Comma
			{
				newLeafNode(otherlv_3, grammarAccess.getOrderByClauseAccess().getCommaKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOrderByClauseAccess().getOrderDirectivesOrderByDirectiveParserRuleCall_3_1_0());
					}
					lv_orderDirectives_4_0=ruleOrderByDirective
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOrderByClauseRule());
						}
						add(
							$current,
							"orderDirectives",
							lv_orderDirectives_4_0,
							"org.mdse.minisql.query.MSQLQuery.OrderByDirective");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleOrderByDirective
entryRuleOrderByDirective returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOrderByDirectiveRule()); }
	iv_ruleOrderByDirective=ruleOrderByDirective
	{ $current=$iv_ruleOrderByDirective.current; }
	EOF;

// Rule OrderByDirective
ruleOrderByDirective returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getOrderByDirectiveAccess().getColumnReferenceColumnReferenceParserRuleCall_0_0());
				}
				lv_columnReference_0_0=ruleColumnReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOrderByDirectiveRule());
					}
					add(
						$current,
						"columnReference",
						lv_columnReference_0_0,
						"org.mdse.minisql.query.MSQLQuery.ColumnReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					lv_ascending_1_1=ASC
					{
						newLeafNode(lv_ascending_1_1, grammarAccess.getOrderByDirectiveAccess().getAscendingASCKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getOrderByDirectiveRule());
						}
						setWithLastConsumed($current, "ascending", true, null);
					}
					    |
					lv_ascending_1_2=DESC
					{
						newLeafNode(lv_ascending_1_2, grammarAccess.getOrderByDirectiveAccess().getAscendingDESCKeyword_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getOrderByDirectiveRule());
						}
						setWithLastConsumed($current, "ascending", true, null);
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleColumnReference
entryRuleColumnReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getColumnReferenceRule()); }
	iv_ruleColumnReference=ruleColumnReference
	{ $current=$iv_ruleColumnReference.current; }
	EOF;

// Rule ColumnReference
ruleColumnReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getColumnReferenceRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getColumnReferenceAccess().getColumnColumnCrossReference_0());
			}
		)
	)
;

// Rule AdditiveOperator
ruleAdditiveOperator returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0=PlusSign
			{
				$current = grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1=HyphenMinus
			{
				$current = grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule MultiplicativeOperator
ruleMultiplicativeOperator returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0=Asterisk
			{
				$current = grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1=Solidus
			{
				$current = grammarAccess.getMultiplicativeOperatorAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDIVIDEEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule ComparativeOperator
ruleComparativeOperator returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0=LessThanSign
			{
				$current = grammarAccess.getComparativeOperatorAccess().getLESS_THANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getComparativeOperatorAccess().getLESS_THANEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1=LessThanSignEqualsSign
			{
				$current = grammarAccess.getComparativeOperatorAccess().getLESS_THAN_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getComparativeOperatorAccess().getLESS_THAN_OR_EQUALEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2=EqualsSign
			{
				$current = grammarAccess.getComparativeOperatorAccess().getEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getComparativeOperatorAccess().getEQUALEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3=ExclamationMarkEqualsSign
			{
				$current = grammarAccess.getComparativeOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getComparativeOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4=GreaterThanSign
			{
				$current = grammarAccess.getComparativeOperatorAccess().getGREATER_THANEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getComparativeOperatorAccess().getGREATER_THANEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5=GreaterThanSignEqualsSign
			{
				$current = grammarAccess.getComparativeOperatorAccess().getGREATER_THAN_OR_EQUALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getComparativeOperatorAccess().getGREATER_THAN_OR_EQUALEnumLiteralDeclaration_5());
			}
		)
	)
;
