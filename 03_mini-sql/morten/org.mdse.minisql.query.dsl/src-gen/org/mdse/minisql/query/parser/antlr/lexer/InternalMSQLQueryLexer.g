/*
 * generated by Xtext 2.20.0
 */
lexer grammar InternalMSQLQueryLexer;

@header {
package org.mdse.minisql.query.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

SELECT : ('S'|'s')('E'|'e')('L'|'l')('E'|'e')('C'|'c')('T'|'t');

ORDER : ('O'|'o')('R'|'r')('D'|'d')('E'|'e')('R'|'r');

WHERE : ('W'|'w')('H'|'h')('E'|'e')('R'|'r')('E'|'e');

DESC : ('D'|'d')('E'|'e')('S'|'s')('C'|'c');

FROM : ('F'|'f')('R'|'r')('O'|'o')('M'|'m');

ASC : ('A'|'a')('S'|'s')('C'|'c');

ExclamationMarkEqualsSign : '!''=';

LessThanSignEqualsSign : '<''=';

GreaterThanSignEqualsSign : '>''=';

BY : ('B'|'b')('Y'|'y');

Asterisk : '*';

Comma : ',';

Semicolon : ';';

LessThanSign : '<';

EqualsSign : '=';

GreaterThanSign : '>';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
