/*
 * generated by Xtext 2.20.0
 */
grammar InternalMSQLSchema;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.mdse.minisql.schema.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.mdse.minisql.schema.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.mdse.minisql.schema.services.MSQLSchemaGrammarAccess;

}

@parser::members {

 	private MSQLSchemaGrammarAccess grammarAccess;

    public InternalMSQLSchemaParser(TokenStream input, MSQLSchemaGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Table";
   	}

   	@Override
   	protected MSQLSchemaGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleTable
entryRuleTable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTableRule()); }
	iv_ruleTable=ruleTable
	{ $current=$iv_ruleTable.current; }
	EOF;

// Rule Table
ruleTable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TABLE'
		{
			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTABLEKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTableAccess().getColumnColumnParserRuleCall_3_0());
				}
				lv_column_3_0=ruleColumn
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTableRule());
					}
					add(
						$current,
						"column",
						lv_column_3_0,
						"org.mdse.minisql.schema.MSQLSchema.Column");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getTableAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTableAccess().getColumnColumnParserRuleCall_4_1_0());
					}
					lv_column_5_0=ruleColumn
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTableRule());
						}
						add(
							$current,
							"column",
							lv_column_5_0,
							"org.mdse.minisql.schema.MSQLSchema.Column");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleColumn
entryRuleColumn returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getColumnRule()); }
	iv_ruleColumn=ruleColumn
	{ $current=$iv_ruleColumn.current; }
	EOF;

// Rule Column
ruleColumn returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getColumnRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
