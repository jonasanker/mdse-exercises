/*
 * generated by Xtext 2.20.0
 */
grammar InternalSchema;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.mdse.minisql.schema.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.mdse.minisql.schema.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.mdse.minisql.schema.services.SchemaGrammarAccess;

}
@parser::members {
	private SchemaGrammarAccess grammarAccess;

	public void setGrammarAccess(SchemaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleTable
entryRuleTable
:
{ before(grammarAccess.getTableRule()); }
	 ruleTable
{ after(grammarAccess.getTableRule()); } 
	 EOF 
;

// Rule Table
ruleTable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTableAccess().getGroup()); }
		(rule__Table__Group__0)
		{ after(grammarAccess.getTableAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleColumn
entryRuleColumn
:
{ before(grammarAccess.getColumnRule()); }
	 ruleColumn
{ after(grammarAccess.getColumnRule()); } 
	 EOF 
;

// Rule Column
ruleColumn 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getColumnAccess().getNameAssignment()); }
		(rule__Column__NameAssignment)
		{ after(grammarAccess.getColumnAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Table__Group__0__Impl
	rule__Table__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableAccess().getTABLEKeyword_0()); }
	'TABLE'
	{ after(grammarAccess.getTableAccess().getTABLEKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Table__Group__1__Impl
	rule__Table__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableAccess().getNameAssignment_1()); }
	(rule__Table__NameAssignment_1)
	{ after(grammarAccess.getTableAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Table__Group__2__Impl
	rule__Table__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Table__Group__3__Impl
	rule__Table__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableAccess().getColumnsAssignment_3()); }
	(rule__Table__ColumnsAssignment_3)
	{ after(grammarAccess.getTableAccess().getColumnsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Table__Group__4__Impl
	rule__Table__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableAccess().getGroup_4()); }
	(rule__Table__Group_4__0)*
	{ after(grammarAccess.getTableAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Table__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Table__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Table__Group_4__0__Impl
	rule__Table__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableAccess().getCommaKeyword_4_0()); }
	','
	{ after(grammarAccess.getTableAccess().getCommaKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Table__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableAccess().getColumnsAssignment_4_1()); }
	(rule__Table__ColumnsAssignment_4_1)
	{ after(grammarAccess.getTableAccess().getColumnsAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Table__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__ColumnsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_3_0()); }
		ruleColumn
		{ after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__ColumnsAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_1_0()); }
		ruleColumn
		{ after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Column__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;