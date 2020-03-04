package org.mdse.minisql.query.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

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
import org.mdse.minisql.query.services.MSQLQueryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMSQLQueryParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SELECT", "ORDER", "WHERE", "DESC", "FROM", "ASC", "ExclamationMarkEqualsSign", "LessThanSignEqualsSign", "GreaterThanSignEqualsSign", "BY", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "Solidus", "Semicolon", "LessThanSign", "EqualsSign", "GreaterThanSign", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_STRING=27;
    public static final int FROM=8;
    public static final int DESC=7;
    public static final int LessThanSign=22;
    public static final int RULE_SL_COMMENT=29;
    public static final int ORDER=5;
    public static final int ASC=9;
    public static final int Comma=18;
    public static final int EqualsSign=23;
    public static final int HyphenMinus=19;
    public static final int LeftParenthesis=14;
    public static final int BY=13;
    public static final int LessThanSignEqualsSign=11;
    public static final int Solidus=20;
    public static final int EOF=-1;
    public static final int Asterisk=16;
    public static final int GreaterThanSign=24;
    public static final int RULE_ID=25;
    public static final int RULE_WS=30;
    public static final int RightParenthesis=15;
    public static final int RULE_ANY_OTHER=31;
    public static final int WHERE=6;
    public static final int SELECT=4;
    public static final int GreaterThanSignEqualsSign=12;
    public static final int Semicolon=21;
    public static final int PlusSign=17;
    public static final int RULE_INT=26;
    public static final int RULE_ML_COMMENT=28;
    public static final int ExclamationMarkEqualsSign=10;

    // delegates
    // delegators


        public InternalMSQLQueryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMSQLQueryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMSQLQueryParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMSQLQueryParser.g"; }


    	private MSQLQueryGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("LeftParenthesis", "'('");
    		tokenNameToValue.put("RightParenthesis", "')'");
    		tokenNameToValue.put("Asterisk", "'*'");
    		tokenNameToValue.put("PlusSign", "'+'");
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("HyphenMinus", "'-'");
    		tokenNameToValue.put("Solidus", "'/'");
    		tokenNameToValue.put("Semicolon", "';'");
    		tokenNameToValue.put("LessThanSign", "'<'");
    		tokenNameToValue.put("EqualsSign", "'='");
    		tokenNameToValue.put("GreaterThanSign", "'>'");
    		tokenNameToValue.put("ExclamationMarkEqualsSign", "'!='");
    		tokenNameToValue.put("LessThanSignEqualsSign", "'<='");
    		tokenNameToValue.put("GreaterThanSignEqualsSign", "'>='");
    		tokenNameToValue.put("BY", "'BY'");
    		tokenNameToValue.put("ASC", "'ASC'");
    		tokenNameToValue.put("DESC", "'DESC'");
    		tokenNameToValue.put("FROM", "'FROM'");
    		tokenNameToValue.put("ORDER", "'ORDER'");
    		tokenNameToValue.put("WHERE", "'WHERE'");
    		tokenNameToValue.put("SELECT", "'SELECT'");
    	}

    	public void setGrammarAccess(MSQLQueryGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleSelectQuery"
    // InternalMSQLQueryParser.g:76:1: entryRuleSelectQuery : ruleSelectQuery EOF ;
    public final void entryRuleSelectQuery() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:77:1: ( ruleSelectQuery EOF )
            // InternalMSQLQueryParser.g:78:1: ruleSelectQuery EOF
            {
             before(grammarAccess.getSelectQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectQuery();

            state._fsp--;

             after(grammarAccess.getSelectQueryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectQuery"


    // $ANTLR start "ruleSelectQuery"
    // InternalMSQLQueryParser.g:85:1: ruleSelectQuery : ( ( rule__SelectQuery__Group__0 ) ) ;
    public final void ruleSelectQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:89:2: ( ( ( rule__SelectQuery__Group__0 ) ) )
            // InternalMSQLQueryParser.g:90:2: ( ( rule__SelectQuery__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:90:2: ( ( rule__SelectQuery__Group__0 ) )
            // InternalMSQLQueryParser.g:91:3: ( rule__SelectQuery__Group__0 )
            {
             before(grammarAccess.getSelectQueryAccess().getGroup()); 
            // InternalMSQLQueryParser.g:92:3: ( rule__SelectQuery__Group__0 )
            // InternalMSQLQueryParser.g:92:4: rule__SelectQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectQuery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectQueryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectQuery"


    // $ANTLR start "entryRuleWhatClause"
    // InternalMSQLQueryParser.g:101:1: entryRuleWhatClause : ruleWhatClause EOF ;
    public final void entryRuleWhatClause() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:102:1: ( ruleWhatClause EOF )
            // InternalMSQLQueryParser.g:103:1: ruleWhatClause EOF
            {
             before(grammarAccess.getWhatClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleWhatClause();

            state._fsp--;

             after(grammarAccess.getWhatClauseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhatClause"


    // $ANTLR start "ruleWhatClause"
    // InternalMSQLQueryParser.g:110:1: ruleWhatClause : ( ( rule__WhatClause__Group__0 ) ) ;
    public final void ruleWhatClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:114:2: ( ( ( rule__WhatClause__Group__0 ) ) )
            // InternalMSQLQueryParser.g:115:2: ( ( rule__WhatClause__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:115:2: ( ( rule__WhatClause__Group__0 ) )
            // InternalMSQLQueryParser.g:116:3: ( rule__WhatClause__Group__0 )
            {
             before(grammarAccess.getWhatClauseAccess().getGroup()); 
            // InternalMSQLQueryParser.g:117:3: ( rule__WhatClause__Group__0 )
            // InternalMSQLQueryParser.g:117:4: rule__WhatClause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhatClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhatClauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhatClause"


    // $ANTLR start "entryRuleWhatDirective"
    // InternalMSQLQueryParser.g:126:1: entryRuleWhatDirective : ruleWhatDirective EOF ;
    public final void entryRuleWhatDirective() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:127:1: ( ruleWhatDirective EOF )
            // InternalMSQLQueryParser.g:128:1: ruleWhatDirective EOF
            {
             before(grammarAccess.getWhatDirectiveRule()); 
            pushFollow(FOLLOW_1);
            ruleWhatDirective();

            state._fsp--;

             after(grammarAccess.getWhatDirectiveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhatDirective"


    // $ANTLR start "ruleWhatDirective"
    // InternalMSQLQueryParser.g:135:1: ruleWhatDirective : ( ( rule__WhatDirective__Alternatives ) ) ;
    public final void ruleWhatDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:139:2: ( ( ( rule__WhatDirective__Alternatives ) ) )
            // InternalMSQLQueryParser.g:140:2: ( ( rule__WhatDirective__Alternatives ) )
            {
            // InternalMSQLQueryParser.g:140:2: ( ( rule__WhatDirective__Alternatives ) )
            // InternalMSQLQueryParser.g:141:3: ( rule__WhatDirective__Alternatives )
            {
             before(grammarAccess.getWhatDirectiveAccess().getAlternatives()); 
            // InternalMSQLQueryParser.g:142:3: ( rule__WhatDirective__Alternatives )
            // InternalMSQLQueryParser.g:142:4: rule__WhatDirective__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WhatDirective__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWhatDirectiveAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhatDirective"


    // $ANTLR start "entryRuleAllColumnsWhatDirective"
    // InternalMSQLQueryParser.g:151:1: entryRuleAllColumnsWhatDirective : ruleAllColumnsWhatDirective EOF ;
    public final void entryRuleAllColumnsWhatDirective() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:152:1: ( ruleAllColumnsWhatDirective EOF )
            // InternalMSQLQueryParser.g:153:1: ruleAllColumnsWhatDirective EOF
            {
             before(grammarAccess.getAllColumnsWhatDirectiveRule()); 
            pushFollow(FOLLOW_1);
            ruleAllColumnsWhatDirective();

            state._fsp--;

             after(grammarAccess.getAllColumnsWhatDirectiveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAllColumnsWhatDirective"


    // $ANTLR start "ruleAllColumnsWhatDirective"
    // InternalMSQLQueryParser.g:160:1: ruleAllColumnsWhatDirective : ( ( rule__AllColumnsWhatDirective__Group__0 ) ) ;
    public final void ruleAllColumnsWhatDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:164:2: ( ( ( rule__AllColumnsWhatDirective__Group__0 ) ) )
            // InternalMSQLQueryParser.g:165:2: ( ( rule__AllColumnsWhatDirective__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:165:2: ( ( rule__AllColumnsWhatDirective__Group__0 ) )
            // InternalMSQLQueryParser.g:166:3: ( rule__AllColumnsWhatDirective__Group__0 )
            {
             before(grammarAccess.getAllColumnsWhatDirectiveAccess().getGroup()); 
            // InternalMSQLQueryParser.g:167:3: ( rule__AllColumnsWhatDirective__Group__0 )
            // InternalMSQLQueryParser.g:167:4: rule__AllColumnsWhatDirective__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AllColumnsWhatDirective__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllColumnsWhatDirectiveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAllColumnsWhatDirective"


    // $ANTLR start "entryRuleSingleColumnWhatDirective"
    // InternalMSQLQueryParser.g:176:1: entryRuleSingleColumnWhatDirective : ruleSingleColumnWhatDirective EOF ;
    public final void entryRuleSingleColumnWhatDirective() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:177:1: ( ruleSingleColumnWhatDirective EOF )
            // InternalMSQLQueryParser.g:178:1: ruleSingleColumnWhatDirective EOF
            {
             before(grammarAccess.getSingleColumnWhatDirectiveRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleColumnWhatDirective();

            state._fsp--;

             after(grammarAccess.getSingleColumnWhatDirectiveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleColumnWhatDirective"


    // $ANTLR start "ruleSingleColumnWhatDirective"
    // InternalMSQLQueryParser.g:185:1: ruleSingleColumnWhatDirective : ( ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment ) ) ;
    public final void ruleSingleColumnWhatDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:189:2: ( ( ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment ) ) )
            // InternalMSQLQueryParser.g:190:2: ( ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment ) )
            {
            // InternalMSQLQueryParser.g:190:2: ( ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment ) )
            // InternalMSQLQueryParser.g:191:3: ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment )
            {
             before(grammarAccess.getSingleColumnWhatDirectiveAccess().getColumnReferenceAssignment()); 
            // InternalMSQLQueryParser.g:192:3: ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment )
            // InternalMSQLQueryParser.g:192:4: rule__SingleColumnWhatDirective__ColumnReferenceAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SingleColumnWhatDirective__ColumnReferenceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSingleColumnWhatDirectiveAccess().getColumnReferenceAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleColumnWhatDirective"


    // $ANTLR start "entryRuleFromClause"
    // InternalMSQLQueryParser.g:201:1: entryRuleFromClause : ruleFromClause EOF ;
    public final void entryRuleFromClause() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:202:1: ( ruleFromClause EOF )
            // InternalMSQLQueryParser.g:203:1: ruleFromClause EOF
            {
             before(grammarAccess.getFromClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleFromClause();

            state._fsp--;

             after(grammarAccess.getFromClauseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFromClause"


    // $ANTLR start "ruleFromClause"
    // InternalMSQLQueryParser.g:210:1: ruleFromClause : ( ( rule__FromClause__Group__0 ) ) ;
    public final void ruleFromClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:214:2: ( ( ( rule__FromClause__Group__0 ) ) )
            // InternalMSQLQueryParser.g:215:2: ( ( rule__FromClause__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:215:2: ( ( rule__FromClause__Group__0 ) )
            // InternalMSQLQueryParser.g:216:3: ( rule__FromClause__Group__0 )
            {
             before(grammarAccess.getFromClauseAccess().getGroup()); 
            // InternalMSQLQueryParser.g:217:3: ( rule__FromClause__Group__0 )
            // InternalMSQLQueryParser.g:217:4: rule__FromClause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FromClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFromClauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFromClause"


    // $ANTLR start "entryRuleWhereClause"
    // InternalMSQLQueryParser.g:226:1: entryRuleWhereClause : ruleWhereClause EOF ;
    public final void entryRuleWhereClause() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:227:1: ( ruleWhereClause EOF )
            // InternalMSQLQueryParser.g:228:1: ruleWhereClause EOF
            {
             before(grammarAccess.getWhereClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleWhereClause();

            state._fsp--;

             after(grammarAccess.getWhereClauseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhereClause"


    // $ANTLR start "ruleWhereClause"
    // InternalMSQLQueryParser.g:235:1: ruleWhereClause : ( ( rule__WhereClause__Group__0 ) ) ;
    public final void ruleWhereClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:239:2: ( ( ( rule__WhereClause__Group__0 ) ) )
            // InternalMSQLQueryParser.g:240:2: ( ( rule__WhereClause__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:240:2: ( ( rule__WhereClause__Group__0 ) )
            // InternalMSQLQueryParser.g:241:3: ( rule__WhereClause__Group__0 )
            {
             before(grammarAccess.getWhereClauseAccess().getGroup()); 
            // InternalMSQLQueryParser.g:242:3: ( rule__WhereClause__Group__0 )
            // InternalMSQLQueryParser.g:242:4: rule__WhereClause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhereClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhereClauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhereClause"


    // $ANTLR start "entryRuleExpression"
    // InternalMSQLQueryParser.g:251:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:252:1: ( ruleExpression EOF )
            // InternalMSQLQueryParser.g:253:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMSQLQueryParser.g:260:1: ruleExpression : ( ruleComparativeExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:264:2: ( ( ruleComparativeExpression ) )
            // InternalMSQLQueryParser.g:265:2: ( ruleComparativeExpression )
            {
            // InternalMSQLQueryParser.g:265:2: ( ruleComparativeExpression )
            // InternalMSQLQueryParser.g:266:3: ruleComparativeExpression
            {
             before(grammarAccess.getExpressionAccess().getComparativeExpressionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleComparativeExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getComparativeExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalMSQLQueryParser.g:276:1: entryRuleAdditiveExpression : ruleAdditiveExpression EOF ;
    public final void entryRuleAdditiveExpression() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:277:1: ( ruleAdditiveExpression EOF )
            // InternalMSQLQueryParser.g:278:1: ruleAdditiveExpression EOF
            {
             before(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalMSQLQueryParser.g:285:1: ruleAdditiveExpression : ( ( rule__AdditiveExpression__Group__0 ) ) ;
    public final void ruleAdditiveExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:289:2: ( ( ( rule__AdditiveExpression__Group__0 ) ) )
            // InternalMSQLQueryParser.g:290:2: ( ( rule__AdditiveExpression__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:290:2: ( ( rule__AdditiveExpression__Group__0 ) )
            // InternalMSQLQueryParser.g:291:3: ( rule__AdditiveExpression__Group__0 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup()); 
            // InternalMSQLQueryParser.g:292:3: ( rule__AdditiveExpression__Group__0 )
            // InternalMSQLQueryParser.g:292:4: rule__AdditiveExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalMSQLQueryParser.g:301:1: entryRuleMultiplicativeExpression : ruleMultiplicativeExpression EOF ;
    public final void entryRuleMultiplicativeExpression() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:302:1: ( ruleMultiplicativeExpression EOF )
            // InternalMSQLQueryParser.g:303:1: ruleMultiplicativeExpression EOF
            {
             before(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalMSQLQueryParser.g:310:1: ruleMultiplicativeExpression : ( ( rule__MultiplicativeExpression__Group__0 ) ) ;
    public final void ruleMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:314:2: ( ( ( rule__MultiplicativeExpression__Group__0 ) ) )
            // InternalMSQLQueryParser.g:315:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:315:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            // InternalMSQLQueryParser.g:316:3: ( rule__MultiplicativeExpression__Group__0 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            // InternalMSQLQueryParser.g:317:3: ( rule__MultiplicativeExpression__Group__0 )
            // InternalMSQLQueryParser.g:317:4: rule__MultiplicativeExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleComparativeExpression"
    // InternalMSQLQueryParser.g:326:1: entryRuleComparativeExpression : ruleComparativeExpression EOF ;
    public final void entryRuleComparativeExpression() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:327:1: ( ruleComparativeExpression EOF )
            // InternalMSQLQueryParser.g:328:1: ruleComparativeExpression EOF
            {
             before(grammarAccess.getComparativeExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleComparativeExpression();

            state._fsp--;

             after(grammarAccess.getComparativeExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparativeExpression"


    // $ANTLR start "ruleComparativeExpression"
    // InternalMSQLQueryParser.g:335:1: ruleComparativeExpression : ( ( rule__ComparativeExpression__Group__0 ) ) ;
    public final void ruleComparativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:339:2: ( ( ( rule__ComparativeExpression__Group__0 ) ) )
            // InternalMSQLQueryParser.g:340:2: ( ( rule__ComparativeExpression__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:340:2: ( ( rule__ComparativeExpression__Group__0 ) )
            // InternalMSQLQueryParser.g:341:3: ( rule__ComparativeExpression__Group__0 )
            {
             before(grammarAccess.getComparativeExpressionAccess().getGroup()); 
            // InternalMSQLQueryParser.g:342:3: ( rule__ComparativeExpression__Group__0 )
            // InternalMSQLQueryParser.g:342:4: rule__ComparativeExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComparativeExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparativeExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparativeExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalMSQLQueryParser.g:351:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:352:1: ( ruleAtomicExpression EOF )
            // InternalMSQLQueryParser.g:353:1: ruleAtomicExpression EOF
            {
             before(grammarAccess.getAtomicExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomicExpression();

            state._fsp--;

             after(grammarAccess.getAtomicExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // InternalMSQLQueryParser.g:360:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Alternatives ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:364:2: ( ( ( rule__AtomicExpression__Alternatives ) ) )
            // InternalMSQLQueryParser.g:365:2: ( ( rule__AtomicExpression__Alternatives ) )
            {
            // InternalMSQLQueryParser.g:365:2: ( ( rule__AtomicExpression__Alternatives ) )
            // InternalMSQLQueryParser.g:366:3: ( rule__AtomicExpression__Alternatives )
            {
             before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            // InternalMSQLQueryParser.g:367:3: ( rule__AtomicExpression__Alternatives )
            // InternalMSQLQueryParser.g:367:4: rule__AtomicExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AtomicExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleIntegerLiteral"
    // InternalMSQLQueryParser.g:376:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:377:1: ( ruleIntegerLiteral EOF )
            // InternalMSQLQueryParser.g:378:1: ruleIntegerLiteral EOF
            {
             before(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getIntegerLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // InternalMSQLQueryParser.g:385:1: ruleIntegerLiteral : ( ( rule__IntegerLiteral__ValueAssignment ) ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:389:2: ( ( ( rule__IntegerLiteral__ValueAssignment ) ) )
            // InternalMSQLQueryParser.g:390:2: ( ( rule__IntegerLiteral__ValueAssignment ) )
            {
            // InternalMSQLQueryParser.g:390:2: ( ( rule__IntegerLiteral__ValueAssignment ) )
            // InternalMSQLQueryParser.g:391:3: ( rule__IntegerLiteral__ValueAssignment )
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); 
            // InternalMSQLQueryParser.g:392:3: ( rule__IntegerLiteral__ValueAssignment )
            // InternalMSQLQueryParser.g:392:4: rule__IntegerLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntegerLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleOrderByClause"
    // InternalMSQLQueryParser.g:401:1: entryRuleOrderByClause : ruleOrderByClause EOF ;
    public final void entryRuleOrderByClause() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:402:1: ( ruleOrderByClause EOF )
            // InternalMSQLQueryParser.g:403:1: ruleOrderByClause EOF
            {
             before(grammarAccess.getOrderByClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleOrderByClause();

            state._fsp--;

             after(grammarAccess.getOrderByClauseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrderByClause"


    // $ANTLR start "ruleOrderByClause"
    // InternalMSQLQueryParser.g:410:1: ruleOrderByClause : ( ( rule__OrderByClause__Group__0 ) ) ;
    public final void ruleOrderByClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:414:2: ( ( ( rule__OrderByClause__Group__0 ) ) )
            // InternalMSQLQueryParser.g:415:2: ( ( rule__OrderByClause__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:415:2: ( ( rule__OrderByClause__Group__0 ) )
            // InternalMSQLQueryParser.g:416:3: ( rule__OrderByClause__Group__0 )
            {
             before(grammarAccess.getOrderByClauseAccess().getGroup()); 
            // InternalMSQLQueryParser.g:417:3: ( rule__OrderByClause__Group__0 )
            // InternalMSQLQueryParser.g:417:4: rule__OrderByClause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrderByClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderByClauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrderByClause"


    // $ANTLR start "entryRuleOrderByDirective"
    // InternalMSQLQueryParser.g:426:1: entryRuleOrderByDirective : ruleOrderByDirective EOF ;
    public final void entryRuleOrderByDirective() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:427:1: ( ruleOrderByDirective EOF )
            // InternalMSQLQueryParser.g:428:1: ruleOrderByDirective EOF
            {
             before(grammarAccess.getOrderByDirectiveRule()); 
            pushFollow(FOLLOW_1);
            ruleOrderByDirective();

            state._fsp--;

             after(grammarAccess.getOrderByDirectiveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrderByDirective"


    // $ANTLR start "ruleOrderByDirective"
    // InternalMSQLQueryParser.g:435:1: ruleOrderByDirective : ( ( rule__OrderByDirective__Group__0 ) ) ;
    public final void ruleOrderByDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:439:2: ( ( ( rule__OrderByDirective__Group__0 ) ) )
            // InternalMSQLQueryParser.g:440:2: ( ( rule__OrderByDirective__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:440:2: ( ( rule__OrderByDirective__Group__0 ) )
            // InternalMSQLQueryParser.g:441:3: ( rule__OrderByDirective__Group__0 )
            {
             before(grammarAccess.getOrderByDirectiveAccess().getGroup()); 
            // InternalMSQLQueryParser.g:442:3: ( rule__OrderByDirective__Group__0 )
            // InternalMSQLQueryParser.g:442:4: rule__OrderByDirective__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrderByDirective__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderByDirectiveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrderByDirective"


    // $ANTLR start "entryRuleColumnReference"
    // InternalMSQLQueryParser.g:451:1: entryRuleColumnReference : ruleColumnReference EOF ;
    public final void entryRuleColumnReference() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:452:1: ( ruleColumnReference EOF )
            // InternalMSQLQueryParser.g:453:1: ruleColumnReference EOF
            {
             before(grammarAccess.getColumnReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleColumnReference();

            state._fsp--;

             after(grammarAccess.getColumnReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumnReference"


    // $ANTLR start "ruleColumnReference"
    // InternalMSQLQueryParser.g:460:1: ruleColumnReference : ( ( rule__ColumnReference__ColumnAssignment ) ) ;
    public final void ruleColumnReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:464:2: ( ( ( rule__ColumnReference__ColumnAssignment ) ) )
            // InternalMSQLQueryParser.g:465:2: ( ( rule__ColumnReference__ColumnAssignment ) )
            {
            // InternalMSQLQueryParser.g:465:2: ( ( rule__ColumnReference__ColumnAssignment ) )
            // InternalMSQLQueryParser.g:466:3: ( rule__ColumnReference__ColumnAssignment )
            {
             before(grammarAccess.getColumnReferenceAccess().getColumnAssignment()); 
            // InternalMSQLQueryParser.g:467:3: ( rule__ColumnReference__ColumnAssignment )
            // InternalMSQLQueryParser.g:467:4: rule__ColumnReference__ColumnAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ColumnReference__ColumnAssignment();

            state._fsp--;


            }

             after(grammarAccess.getColumnReferenceAccess().getColumnAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnReference"


    // $ANTLR start "ruleAdditiveOperator"
    // InternalMSQLQueryParser.g:476:1: ruleAdditiveOperator : ( ( rule__AdditiveOperator__Alternatives ) ) ;
    public final void ruleAdditiveOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:480:1: ( ( ( rule__AdditiveOperator__Alternatives ) ) )
            // InternalMSQLQueryParser.g:481:2: ( ( rule__AdditiveOperator__Alternatives ) )
            {
            // InternalMSQLQueryParser.g:481:2: ( ( rule__AdditiveOperator__Alternatives ) )
            // InternalMSQLQueryParser.g:482:3: ( rule__AdditiveOperator__Alternatives )
            {
             before(grammarAccess.getAdditiveOperatorAccess().getAlternatives()); 
            // InternalMSQLQueryParser.g:483:3: ( rule__AdditiveOperator__Alternatives )
            // InternalMSQLQueryParser.g:483:4: rule__AdditiveOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditiveOperator"


    // $ANTLR start "ruleMultiplicativeOperator"
    // InternalMSQLQueryParser.g:492:1: ruleMultiplicativeOperator : ( ( rule__MultiplicativeOperator__Alternatives ) ) ;
    public final void ruleMultiplicativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:496:1: ( ( ( rule__MultiplicativeOperator__Alternatives ) ) )
            // InternalMSQLQueryParser.g:497:2: ( ( rule__MultiplicativeOperator__Alternatives ) )
            {
            // InternalMSQLQueryParser.g:497:2: ( ( rule__MultiplicativeOperator__Alternatives ) )
            // InternalMSQLQueryParser.g:498:3: ( rule__MultiplicativeOperator__Alternatives )
            {
             before(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives()); 
            // InternalMSQLQueryParser.g:499:3: ( rule__MultiplicativeOperator__Alternatives )
            // InternalMSQLQueryParser.g:499:4: rule__MultiplicativeOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicativeOperator"


    // $ANTLR start "ruleComparativeOperator"
    // InternalMSQLQueryParser.g:508:1: ruleComparativeOperator : ( ( rule__ComparativeOperator__Alternatives ) ) ;
    public final void ruleComparativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:512:1: ( ( ( rule__ComparativeOperator__Alternatives ) ) )
            // InternalMSQLQueryParser.g:513:2: ( ( rule__ComparativeOperator__Alternatives ) )
            {
            // InternalMSQLQueryParser.g:513:2: ( ( rule__ComparativeOperator__Alternatives ) )
            // InternalMSQLQueryParser.g:514:3: ( rule__ComparativeOperator__Alternatives )
            {
             before(grammarAccess.getComparativeOperatorAccess().getAlternatives()); 
            // InternalMSQLQueryParser.g:515:3: ( rule__ComparativeOperator__Alternatives )
            // InternalMSQLQueryParser.g:515:4: rule__ComparativeOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComparativeOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparativeOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparativeOperator"


    // $ANTLR start "rule__WhatDirective__Alternatives"
    // InternalMSQLQueryParser.g:523:1: rule__WhatDirective__Alternatives : ( ( ruleAllColumnsWhatDirective ) | ( ruleSingleColumnWhatDirective ) );
    public final void rule__WhatDirective__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:527:1: ( ( ruleAllColumnsWhatDirective ) | ( ruleSingleColumnWhatDirective ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Asterisk) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMSQLQueryParser.g:528:2: ( ruleAllColumnsWhatDirective )
                    {
                    // InternalMSQLQueryParser.g:528:2: ( ruleAllColumnsWhatDirective )
                    // InternalMSQLQueryParser.g:529:3: ruleAllColumnsWhatDirective
                    {
                     before(grammarAccess.getWhatDirectiveAccess().getAllColumnsWhatDirectiveParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAllColumnsWhatDirective();

                    state._fsp--;

                     after(grammarAccess.getWhatDirectiveAccess().getAllColumnsWhatDirectiveParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:534:2: ( ruleSingleColumnWhatDirective )
                    {
                    // InternalMSQLQueryParser.g:534:2: ( ruleSingleColumnWhatDirective )
                    // InternalMSQLQueryParser.g:535:3: ruleSingleColumnWhatDirective
                    {
                     before(grammarAccess.getWhatDirectiveAccess().getSingleColumnWhatDirectiveParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSingleColumnWhatDirective();

                    state._fsp--;

                     after(grammarAccess.getWhatDirectiveAccess().getSingleColumnWhatDirectiveParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhatDirective__Alternatives"


    // $ANTLR start "rule__AtomicExpression__Alternatives"
    // InternalMSQLQueryParser.g:544:1: rule__AtomicExpression__Alternatives : ( ( ( rule__AtomicExpression__Group_0__0 ) ) | ( ruleIntegerLiteral ) | ( ruleColumnReference ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:548:1: ( ( ( rule__AtomicExpression__Group_0__0 ) ) | ( ruleIntegerLiteral ) | ( ruleColumnReference ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt2=1;
                }
                break;
            case RULE_INT:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMSQLQueryParser.g:549:2: ( ( rule__AtomicExpression__Group_0__0 ) )
                    {
                    // InternalMSQLQueryParser.g:549:2: ( ( rule__AtomicExpression__Group_0__0 ) )
                    // InternalMSQLQueryParser.g:550:3: ( rule__AtomicExpression__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_0()); 
                    // InternalMSQLQueryParser.g:551:3: ( rule__AtomicExpression__Group_0__0 )
                    // InternalMSQLQueryParser.g:551:4: rule__AtomicExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:555:2: ( ruleIntegerLiteral )
                    {
                    // InternalMSQLQueryParser.g:555:2: ( ruleIntegerLiteral )
                    // InternalMSQLQueryParser.g:556:3: ruleIntegerLiteral
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getIntegerLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerLiteral();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpressionAccess().getIntegerLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMSQLQueryParser.g:561:2: ( ruleColumnReference )
                    {
                    // InternalMSQLQueryParser.g:561:2: ( ruleColumnReference )
                    // InternalMSQLQueryParser.g:562:3: ruleColumnReference
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getColumnReferenceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleColumnReference();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpressionAccess().getColumnReferenceParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Alternatives"


    // $ANTLR start "rule__OrderByDirective__AscendingAlternatives_1_0"
    // InternalMSQLQueryParser.g:571:1: rule__OrderByDirective__AscendingAlternatives_1_0 : ( ( ASC ) | ( DESC ) );
    public final void rule__OrderByDirective__AscendingAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:575:1: ( ( ASC ) | ( DESC ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ASC) ) {
                alt3=1;
            }
            else if ( (LA3_0==DESC) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMSQLQueryParser.g:576:2: ( ASC )
                    {
                    // InternalMSQLQueryParser.g:576:2: ( ASC )
                    // InternalMSQLQueryParser.g:577:3: ASC
                    {
                     before(grammarAccess.getOrderByDirectiveAccess().getAscendingASCKeyword_1_0_0()); 
                    match(input,ASC,FOLLOW_2); 
                     after(grammarAccess.getOrderByDirectiveAccess().getAscendingASCKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:582:2: ( DESC )
                    {
                    // InternalMSQLQueryParser.g:582:2: ( DESC )
                    // InternalMSQLQueryParser.g:583:3: DESC
                    {
                     before(grammarAccess.getOrderByDirectiveAccess().getAscendingDESCKeyword_1_0_1()); 
                    match(input,DESC,FOLLOW_2); 
                     after(grammarAccess.getOrderByDirectiveAccess().getAscendingDESCKeyword_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByDirective__AscendingAlternatives_1_0"


    // $ANTLR start "rule__AdditiveOperator__Alternatives"
    // InternalMSQLQueryParser.g:592:1: rule__AdditiveOperator__Alternatives : ( ( ( PlusSign ) ) | ( ( HyphenMinus ) ) );
    public final void rule__AdditiveOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:596:1: ( ( ( PlusSign ) ) | ( ( HyphenMinus ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==PlusSign) ) {
                alt4=1;
            }
            else if ( (LA4_0==HyphenMinus) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMSQLQueryParser.g:597:2: ( ( PlusSign ) )
                    {
                    // InternalMSQLQueryParser.g:597:2: ( ( PlusSign ) )
                    // InternalMSQLQueryParser.g:598:3: ( PlusSign )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0()); 
                    // InternalMSQLQueryParser.g:599:3: ( PlusSign )
                    // InternalMSQLQueryParser.g:599:4: PlusSign
                    {
                    match(input,PlusSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:603:2: ( ( HyphenMinus ) )
                    {
                    // InternalMSQLQueryParser.g:603:2: ( ( HyphenMinus ) )
                    // InternalMSQLQueryParser.g:604:3: ( HyphenMinus )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1()); 
                    // InternalMSQLQueryParser.g:605:3: ( HyphenMinus )
                    // InternalMSQLQueryParser.g:605:4: HyphenMinus
                    {
                    match(input,HyphenMinus,FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveOperator__Alternatives"


    // $ANTLR start "rule__MultiplicativeOperator__Alternatives"
    // InternalMSQLQueryParser.g:613:1: rule__MultiplicativeOperator__Alternatives : ( ( ( Asterisk ) ) | ( ( Solidus ) ) );
    public final void rule__MultiplicativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:617:1: ( ( ( Asterisk ) ) | ( ( Solidus ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Asterisk) ) {
                alt5=1;
            }
            else if ( (LA5_0==Solidus) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMSQLQueryParser.g:618:2: ( ( Asterisk ) )
                    {
                    // InternalMSQLQueryParser.g:618:2: ( ( Asterisk ) )
                    // InternalMSQLQueryParser.g:619:3: ( Asterisk )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0()); 
                    // InternalMSQLQueryParser.g:620:3: ( Asterisk )
                    // InternalMSQLQueryParser.g:620:4: Asterisk
                    {
                    match(input,Asterisk,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:624:2: ( ( Solidus ) )
                    {
                    // InternalMSQLQueryParser.g:624:2: ( ( Solidus ) )
                    // InternalMSQLQueryParser.g:625:3: ( Solidus )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getDIVIDEEnumLiteralDeclaration_1()); 
                    // InternalMSQLQueryParser.g:626:3: ( Solidus )
                    // InternalMSQLQueryParser.g:626:4: Solidus
                    {
                    match(input,Solidus,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getDIVIDEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeOperator__Alternatives"


    // $ANTLR start "rule__ComparativeOperator__Alternatives"
    // InternalMSQLQueryParser.g:634:1: rule__ComparativeOperator__Alternatives : ( ( ( LessThanSign ) ) | ( ( LessThanSignEqualsSign ) ) | ( ( EqualsSign ) ) | ( ( ExclamationMarkEqualsSign ) ) | ( ( GreaterThanSign ) ) | ( ( GreaterThanSignEqualsSign ) ) );
    public final void rule__ComparativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:638:1: ( ( ( LessThanSign ) ) | ( ( LessThanSignEqualsSign ) ) | ( ( EqualsSign ) ) | ( ( ExclamationMarkEqualsSign ) ) | ( ( GreaterThanSign ) ) | ( ( GreaterThanSignEqualsSign ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case LessThanSign:
                {
                alt6=1;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt6=2;
                }
                break;
            case EqualsSign:
                {
                alt6=3;
                }
                break;
            case ExclamationMarkEqualsSign:
                {
                alt6=4;
                }
                break;
            case GreaterThanSign:
                {
                alt6=5;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMSQLQueryParser.g:639:2: ( ( LessThanSign ) )
                    {
                    // InternalMSQLQueryParser.g:639:2: ( ( LessThanSign ) )
                    // InternalMSQLQueryParser.g:640:3: ( LessThanSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getLESS_THANEnumLiteralDeclaration_0()); 
                    // InternalMSQLQueryParser.g:641:3: ( LessThanSign )
                    // InternalMSQLQueryParser.g:641:4: LessThanSign
                    {
                    match(input,LessThanSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getLESS_THANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:645:2: ( ( LessThanSignEqualsSign ) )
                    {
                    // InternalMSQLQueryParser.g:645:2: ( ( LessThanSignEqualsSign ) )
                    // InternalMSQLQueryParser.g:646:3: ( LessThanSignEqualsSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getLESS_THAN_OR_EQUALEnumLiteralDeclaration_1()); 
                    // InternalMSQLQueryParser.g:647:3: ( LessThanSignEqualsSign )
                    // InternalMSQLQueryParser.g:647:4: LessThanSignEqualsSign
                    {
                    match(input,LessThanSignEqualsSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getLESS_THAN_OR_EQUALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMSQLQueryParser.g:651:2: ( ( EqualsSign ) )
                    {
                    // InternalMSQLQueryParser.g:651:2: ( ( EqualsSign ) )
                    // InternalMSQLQueryParser.g:652:3: ( EqualsSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getEQUALEnumLiteralDeclaration_2()); 
                    // InternalMSQLQueryParser.g:653:3: ( EqualsSign )
                    // InternalMSQLQueryParser.g:653:4: EqualsSign
                    {
                    match(input,EqualsSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getEQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMSQLQueryParser.g:657:2: ( ( ExclamationMarkEqualsSign ) )
                    {
                    // InternalMSQLQueryParser.g:657:2: ( ( ExclamationMarkEqualsSign ) )
                    // InternalMSQLQueryParser.g:658:3: ( ExclamationMarkEqualsSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_3()); 
                    // InternalMSQLQueryParser.g:659:3: ( ExclamationMarkEqualsSign )
                    // InternalMSQLQueryParser.g:659:4: ExclamationMarkEqualsSign
                    {
                    match(input,ExclamationMarkEqualsSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMSQLQueryParser.g:663:2: ( ( GreaterThanSign ) )
                    {
                    // InternalMSQLQueryParser.g:663:2: ( ( GreaterThanSign ) )
                    // InternalMSQLQueryParser.g:664:3: ( GreaterThanSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getGREATER_THANEnumLiteralDeclaration_4()); 
                    // InternalMSQLQueryParser.g:665:3: ( GreaterThanSign )
                    // InternalMSQLQueryParser.g:665:4: GreaterThanSign
                    {
                    match(input,GreaterThanSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getGREATER_THANEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMSQLQueryParser.g:669:2: ( ( GreaterThanSignEqualsSign ) )
                    {
                    // InternalMSQLQueryParser.g:669:2: ( ( GreaterThanSignEqualsSign ) )
                    // InternalMSQLQueryParser.g:670:3: ( GreaterThanSignEqualsSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getGREATER_THAN_OR_EQUALEnumLiteralDeclaration_5()); 
                    // InternalMSQLQueryParser.g:671:3: ( GreaterThanSignEqualsSign )
                    // InternalMSQLQueryParser.g:671:4: GreaterThanSignEqualsSign
                    {
                    match(input,GreaterThanSignEqualsSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getGREATER_THAN_OR_EQUALEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeOperator__Alternatives"


    // $ANTLR start "rule__SelectQuery__Group__0"
    // InternalMSQLQueryParser.g:679:1: rule__SelectQuery__Group__0 : rule__SelectQuery__Group__0__Impl rule__SelectQuery__Group__1 ;
    public final void rule__SelectQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:683:1: ( rule__SelectQuery__Group__0__Impl rule__SelectQuery__Group__1 )
            // InternalMSQLQueryParser.g:684:2: rule__SelectQuery__Group__0__Impl rule__SelectQuery__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SelectQuery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectQuery__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__Group__0"


    // $ANTLR start "rule__SelectQuery__Group__0__Impl"
    // InternalMSQLQueryParser.g:691:1: rule__SelectQuery__Group__0__Impl : ( SELECT ) ;
    public final void rule__SelectQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:695:1: ( ( SELECT ) )
            // InternalMSQLQueryParser.g:696:1: ( SELECT )
            {
            // InternalMSQLQueryParser.g:696:1: ( SELECT )
            // InternalMSQLQueryParser.g:697:2: SELECT
            {
             before(grammarAccess.getSelectQueryAccess().getSELECTKeyword_0()); 
            match(input,SELECT,FOLLOW_2); 
             after(grammarAccess.getSelectQueryAccess().getSELECTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__Group__0__Impl"


    // $ANTLR start "rule__SelectQuery__Group__1"
    // InternalMSQLQueryParser.g:706:1: rule__SelectQuery__Group__1 : rule__SelectQuery__Group__1__Impl rule__SelectQuery__Group__2 ;
    public final void rule__SelectQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:710:1: ( rule__SelectQuery__Group__1__Impl rule__SelectQuery__Group__2 )
            // InternalMSQLQueryParser.g:711:2: rule__SelectQuery__Group__1__Impl rule__SelectQuery__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SelectQuery__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectQuery__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__Group__1"


    // $ANTLR start "rule__SelectQuery__Group__1__Impl"
    // InternalMSQLQueryParser.g:718:1: rule__SelectQuery__Group__1__Impl : ( ( rule__SelectQuery__WhatClauseAssignment_1 ) ) ;
    public final void rule__SelectQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:722:1: ( ( ( rule__SelectQuery__WhatClauseAssignment_1 ) ) )
            // InternalMSQLQueryParser.g:723:1: ( ( rule__SelectQuery__WhatClauseAssignment_1 ) )
            {
            // InternalMSQLQueryParser.g:723:1: ( ( rule__SelectQuery__WhatClauseAssignment_1 ) )
            // InternalMSQLQueryParser.g:724:2: ( rule__SelectQuery__WhatClauseAssignment_1 )
            {
             before(grammarAccess.getSelectQueryAccess().getWhatClauseAssignment_1()); 
            // InternalMSQLQueryParser.g:725:2: ( rule__SelectQuery__WhatClauseAssignment_1 )
            // InternalMSQLQueryParser.g:725:3: rule__SelectQuery__WhatClauseAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectQuery__WhatClauseAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectQueryAccess().getWhatClauseAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__Group__1__Impl"


    // $ANTLR start "rule__SelectQuery__Group__2"
    // InternalMSQLQueryParser.g:733:1: rule__SelectQuery__Group__2 : rule__SelectQuery__Group__2__Impl rule__SelectQuery__Group__3 ;
    public final void rule__SelectQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:737:1: ( rule__SelectQuery__Group__2__Impl rule__SelectQuery__Group__3 )
            // InternalMSQLQueryParser.g:738:2: rule__SelectQuery__Group__2__Impl rule__SelectQuery__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SelectQuery__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectQuery__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__Group__2"


    // $ANTLR start "rule__SelectQuery__Group__2__Impl"
    // InternalMSQLQueryParser.g:745:1: rule__SelectQuery__Group__2__Impl : ( ( rule__SelectQuery__FromClauseAssignment_2 ) ) ;
    public final void rule__SelectQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:749:1: ( ( ( rule__SelectQuery__FromClauseAssignment_2 ) ) )
            // InternalMSQLQueryParser.g:750:1: ( ( rule__SelectQuery__FromClauseAssignment_2 ) )
            {
            // InternalMSQLQueryParser.g:750:1: ( ( rule__SelectQuery__FromClauseAssignment_2 ) )
            // InternalMSQLQueryParser.g:751:2: ( rule__SelectQuery__FromClauseAssignment_2 )
            {
             before(grammarAccess.getSelectQueryAccess().getFromClauseAssignment_2()); 
            // InternalMSQLQueryParser.g:752:2: ( rule__SelectQuery__FromClauseAssignment_2 )
            // InternalMSQLQueryParser.g:752:3: rule__SelectQuery__FromClauseAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SelectQuery__FromClauseAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectQueryAccess().getFromClauseAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__Group__2__Impl"


    // $ANTLR start "rule__SelectQuery__Group__3"
    // InternalMSQLQueryParser.g:760:1: rule__SelectQuery__Group__3 : rule__SelectQuery__Group__3__Impl rule__SelectQuery__Group__4 ;
    public final void rule__SelectQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:764:1: ( rule__SelectQuery__Group__3__Impl rule__SelectQuery__Group__4 )
            // InternalMSQLQueryParser.g:765:2: rule__SelectQuery__Group__3__Impl rule__SelectQuery__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__SelectQuery__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectQuery__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__Group__3"


    // $ANTLR start "rule__SelectQuery__Group__3__Impl"
    // InternalMSQLQueryParser.g:772:1: rule__SelectQuery__Group__3__Impl : ( ( rule__SelectQuery__WhereClauseAssignment_3 )? ) ;
    public final void rule__SelectQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:776:1: ( ( ( rule__SelectQuery__WhereClauseAssignment_3 )? ) )
            // InternalMSQLQueryParser.g:777:1: ( ( rule__SelectQuery__WhereClauseAssignment_3 )? )
            {
            // InternalMSQLQueryParser.g:777:1: ( ( rule__SelectQuery__WhereClauseAssignment_3 )? )
            // InternalMSQLQueryParser.g:778:2: ( rule__SelectQuery__WhereClauseAssignment_3 )?
            {
             before(grammarAccess.getSelectQueryAccess().getWhereClauseAssignment_3()); 
            // InternalMSQLQueryParser.g:779:2: ( rule__SelectQuery__WhereClauseAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==WHERE) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMSQLQueryParser.g:779:3: rule__SelectQuery__WhereClauseAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectQuery__WhereClauseAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectQueryAccess().getWhereClauseAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__Group__3__Impl"


    // $ANTLR start "rule__SelectQuery__Group__4"
    // InternalMSQLQueryParser.g:787:1: rule__SelectQuery__Group__4 : rule__SelectQuery__Group__4__Impl rule__SelectQuery__Group__5 ;
    public final void rule__SelectQuery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:791:1: ( rule__SelectQuery__Group__4__Impl rule__SelectQuery__Group__5 )
            // InternalMSQLQueryParser.g:792:2: rule__SelectQuery__Group__4__Impl rule__SelectQuery__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__SelectQuery__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectQuery__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__Group__4"


    // $ANTLR start "rule__SelectQuery__Group__4__Impl"
    // InternalMSQLQueryParser.g:799:1: rule__SelectQuery__Group__4__Impl : ( ( rule__SelectQuery__OrderByClauseAssignment_4 )? ) ;
    public final void rule__SelectQuery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:803:1: ( ( ( rule__SelectQuery__OrderByClauseAssignment_4 )? ) )
            // InternalMSQLQueryParser.g:804:1: ( ( rule__SelectQuery__OrderByClauseAssignment_4 )? )
            {
            // InternalMSQLQueryParser.g:804:1: ( ( rule__SelectQuery__OrderByClauseAssignment_4 )? )
            // InternalMSQLQueryParser.g:805:2: ( rule__SelectQuery__OrderByClauseAssignment_4 )?
            {
             before(grammarAccess.getSelectQueryAccess().getOrderByClauseAssignment_4()); 
            // InternalMSQLQueryParser.g:806:2: ( rule__SelectQuery__OrderByClauseAssignment_4 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ORDER) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMSQLQueryParser.g:806:3: rule__SelectQuery__OrderByClauseAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectQuery__OrderByClauseAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectQueryAccess().getOrderByClauseAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__Group__4__Impl"


    // $ANTLR start "rule__SelectQuery__Group__5"
    // InternalMSQLQueryParser.g:814:1: rule__SelectQuery__Group__5 : rule__SelectQuery__Group__5__Impl ;
    public final void rule__SelectQuery__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:818:1: ( rule__SelectQuery__Group__5__Impl )
            // InternalMSQLQueryParser.g:819:2: rule__SelectQuery__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectQuery__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__Group__5"


    // $ANTLR start "rule__SelectQuery__Group__5__Impl"
    // InternalMSQLQueryParser.g:825:1: rule__SelectQuery__Group__5__Impl : ( Semicolon ) ;
    public final void rule__SelectQuery__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:829:1: ( ( Semicolon ) )
            // InternalMSQLQueryParser.g:830:1: ( Semicolon )
            {
            // InternalMSQLQueryParser.g:830:1: ( Semicolon )
            // InternalMSQLQueryParser.g:831:2: Semicolon
            {
             before(grammarAccess.getSelectQueryAccess().getSemicolonKeyword_5()); 
            match(input,Semicolon,FOLLOW_2); 
             after(grammarAccess.getSelectQueryAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__Group__5__Impl"


    // $ANTLR start "rule__WhatClause__Group__0"
    // InternalMSQLQueryParser.g:841:1: rule__WhatClause__Group__0 : rule__WhatClause__Group__0__Impl rule__WhatClause__Group__1 ;
    public final void rule__WhatClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:845:1: ( rule__WhatClause__Group__0__Impl rule__WhatClause__Group__1 )
            // InternalMSQLQueryParser.g:846:2: rule__WhatClause__Group__0__Impl rule__WhatClause__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__WhatClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhatClause__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhatClause__Group__0"


    // $ANTLR start "rule__WhatClause__Group__0__Impl"
    // InternalMSQLQueryParser.g:853:1: rule__WhatClause__Group__0__Impl : ( ( rule__WhatClause__WhatDirectiveAssignment_0 ) ) ;
    public final void rule__WhatClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:857:1: ( ( ( rule__WhatClause__WhatDirectiveAssignment_0 ) ) )
            // InternalMSQLQueryParser.g:858:1: ( ( rule__WhatClause__WhatDirectiveAssignment_0 ) )
            {
            // InternalMSQLQueryParser.g:858:1: ( ( rule__WhatClause__WhatDirectiveAssignment_0 ) )
            // InternalMSQLQueryParser.g:859:2: ( rule__WhatClause__WhatDirectiveAssignment_0 )
            {
             before(grammarAccess.getWhatClauseAccess().getWhatDirectiveAssignment_0()); 
            // InternalMSQLQueryParser.g:860:2: ( rule__WhatClause__WhatDirectiveAssignment_0 )
            // InternalMSQLQueryParser.g:860:3: rule__WhatClause__WhatDirectiveAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__WhatClause__WhatDirectiveAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWhatClauseAccess().getWhatDirectiveAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhatClause__Group__0__Impl"


    // $ANTLR start "rule__WhatClause__Group__1"
    // InternalMSQLQueryParser.g:868:1: rule__WhatClause__Group__1 : rule__WhatClause__Group__1__Impl ;
    public final void rule__WhatClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:872:1: ( rule__WhatClause__Group__1__Impl )
            // InternalMSQLQueryParser.g:873:2: rule__WhatClause__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhatClause__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhatClause__Group__1"


    // $ANTLR start "rule__WhatClause__Group__1__Impl"
    // InternalMSQLQueryParser.g:879:1: rule__WhatClause__Group__1__Impl : ( ( rule__WhatClause__Group_1__0 )* ) ;
    public final void rule__WhatClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:883:1: ( ( ( rule__WhatClause__Group_1__0 )* ) )
            // InternalMSQLQueryParser.g:884:1: ( ( rule__WhatClause__Group_1__0 )* )
            {
            // InternalMSQLQueryParser.g:884:1: ( ( rule__WhatClause__Group_1__0 )* )
            // InternalMSQLQueryParser.g:885:2: ( rule__WhatClause__Group_1__0 )*
            {
             before(grammarAccess.getWhatClauseAccess().getGroup_1()); 
            // InternalMSQLQueryParser.g:886:2: ( rule__WhatClause__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Comma) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:886:3: rule__WhatClause__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__WhatClause__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getWhatClauseAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhatClause__Group__1__Impl"


    // $ANTLR start "rule__WhatClause__Group_1__0"
    // InternalMSQLQueryParser.g:895:1: rule__WhatClause__Group_1__0 : rule__WhatClause__Group_1__0__Impl rule__WhatClause__Group_1__1 ;
    public final void rule__WhatClause__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:899:1: ( rule__WhatClause__Group_1__0__Impl rule__WhatClause__Group_1__1 )
            // InternalMSQLQueryParser.g:900:2: rule__WhatClause__Group_1__0__Impl rule__WhatClause__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__WhatClause__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhatClause__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhatClause__Group_1__0"


    // $ANTLR start "rule__WhatClause__Group_1__0__Impl"
    // InternalMSQLQueryParser.g:907:1: rule__WhatClause__Group_1__0__Impl : ( Comma ) ;
    public final void rule__WhatClause__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:911:1: ( ( Comma ) )
            // InternalMSQLQueryParser.g:912:1: ( Comma )
            {
            // InternalMSQLQueryParser.g:912:1: ( Comma )
            // InternalMSQLQueryParser.g:913:2: Comma
            {
             before(grammarAccess.getWhatClauseAccess().getCommaKeyword_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getWhatClauseAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhatClause__Group_1__0__Impl"


    // $ANTLR start "rule__WhatClause__Group_1__1"
    // InternalMSQLQueryParser.g:922:1: rule__WhatClause__Group_1__1 : rule__WhatClause__Group_1__1__Impl ;
    public final void rule__WhatClause__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:926:1: ( rule__WhatClause__Group_1__1__Impl )
            // InternalMSQLQueryParser.g:927:2: rule__WhatClause__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhatClause__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhatClause__Group_1__1"


    // $ANTLR start "rule__WhatClause__Group_1__1__Impl"
    // InternalMSQLQueryParser.g:933:1: rule__WhatClause__Group_1__1__Impl : ( ( rule__WhatClause__WhatDirectiveAssignment_1_1 ) ) ;
    public final void rule__WhatClause__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:937:1: ( ( ( rule__WhatClause__WhatDirectiveAssignment_1_1 ) ) )
            // InternalMSQLQueryParser.g:938:1: ( ( rule__WhatClause__WhatDirectiveAssignment_1_1 ) )
            {
            // InternalMSQLQueryParser.g:938:1: ( ( rule__WhatClause__WhatDirectiveAssignment_1_1 ) )
            // InternalMSQLQueryParser.g:939:2: ( rule__WhatClause__WhatDirectiveAssignment_1_1 )
            {
             before(grammarAccess.getWhatClauseAccess().getWhatDirectiveAssignment_1_1()); 
            // InternalMSQLQueryParser.g:940:2: ( rule__WhatClause__WhatDirectiveAssignment_1_1 )
            // InternalMSQLQueryParser.g:940:3: rule__WhatClause__WhatDirectiveAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__WhatClause__WhatDirectiveAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getWhatClauseAccess().getWhatDirectiveAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhatClause__Group_1__1__Impl"


    // $ANTLR start "rule__AllColumnsWhatDirective__Group__0"
    // InternalMSQLQueryParser.g:949:1: rule__AllColumnsWhatDirective__Group__0 : rule__AllColumnsWhatDirective__Group__0__Impl rule__AllColumnsWhatDirective__Group__1 ;
    public final void rule__AllColumnsWhatDirective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:953:1: ( rule__AllColumnsWhatDirective__Group__0__Impl rule__AllColumnsWhatDirective__Group__1 )
            // InternalMSQLQueryParser.g:954:2: rule__AllColumnsWhatDirective__Group__0__Impl rule__AllColumnsWhatDirective__Group__1
            {
            pushFollow(FOLLOW_1);
            rule__AllColumnsWhatDirective__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllColumnsWhatDirective__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllColumnsWhatDirective__Group__0"


    // $ANTLR start "rule__AllColumnsWhatDirective__Group__0__Impl"
    // InternalMSQLQueryParser.g:961:1: rule__AllColumnsWhatDirective__Group__0__Impl : ( Asterisk ) ;
    public final void rule__AllColumnsWhatDirective__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:965:1: ( ( Asterisk ) )
            // InternalMSQLQueryParser.g:966:1: ( Asterisk )
            {
            // InternalMSQLQueryParser.g:966:1: ( Asterisk )
            // InternalMSQLQueryParser.g:967:2: Asterisk
            {
             before(grammarAccess.getAllColumnsWhatDirectiveAccess().getAsteriskKeyword_0()); 
            match(input,Asterisk,FOLLOW_2); 
             after(grammarAccess.getAllColumnsWhatDirectiveAccess().getAsteriskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllColumnsWhatDirective__Group__0__Impl"


    // $ANTLR start "rule__AllColumnsWhatDirective__Group__1"
    // InternalMSQLQueryParser.g:976:1: rule__AllColumnsWhatDirective__Group__1 : rule__AllColumnsWhatDirective__Group__1__Impl ;
    public final void rule__AllColumnsWhatDirective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:980:1: ( rule__AllColumnsWhatDirective__Group__1__Impl )
            // InternalMSQLQueryParser.g:981:2: rule__AllColumnsWhatDirective__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllColumnsWhatDirective__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllColumnsWhatDirective__Group__1"


    // $ANTLR start "rule__AllColumnsWhatDirective__Group__1__Impl"
    // InternalMSQLQueryParser.g:987:1: rule__AllColumnsWhatDirective__Group__1__Impl : ( () ) ;
    public final void rule__AllColumnsWhatDirective__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:991:1: ( ( () ) )
            // InternalMSQLQueryParser.g:992:1: ( () )
            {
            // InternalMSQLQueryParser.g:992:1: ( () )
            // InternalMSQLQueryParser.g:993:2: ()
            {
             before(grammarAccess.getAllColumnsWhatDirectiveAccess().getAllColumnsWhatDirectiveAction_1()); 
            // InternalMSQLQueryParser.g:994:2: ()
            // InternalMSQLQueryParser.g:994:3: 
            {
            }

             after(grammarAccess.getAllColumnsWhatDirectiveAccess().getAllColumnsWhatDirectiveAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllColumnsWhatDirective__Group__1__Impl"


    // $ANTLR start "rule__FromClause__Group__0"
    // InternalMSQLQueryParser.g:1003:1: rule__FromClause__Group__0 : rule__FromClause__Group__0__Impl rule__FromClause__Group__1 ;
    public final void rule__FromClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1007:1: ( rule__FromClause__Group__0__Impl rule__FromClause__Group__1 )
            // InternalMSQLQueryParser.g:1008:2: rule__FromClause__Group__0__Impl rule__FromClause__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__FromClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FromClause__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromClause__Group__0"


    // $ANTLR start "rule__FromClause__Group__0__Impl"
    // InternalMSQLQueryParser.g:1015:1: rule__FromClause__Group__0__Impl : ( FROM ) ;
    public final void rule__FromClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1019:1: ( ( FROM ) )
            // InternalMSQLQueryParser.g:1020:1: ( FROM )
            {
            // InternalMSQLQueryParser.g:1020:1: ( FROM )
            // InternalMSQLQueryParser.g:1021:2: FROM
            {
             before(grammarAccess.getFromClauseAccess().getFROMKeyword_0()); 
            match(input,FROM,FOLLOW_2); 
             after(grammarAccess.getFromClauseAccess().getFROMKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromClause__Group__0__Impl"


    // $ANTLR start "rule__FromClause__Group__1"
    // InternalMSQLQueryParser.g:1030:1: rule__FromClause__Group__1 : rule__FromClause__Group__1__Impl ;
    public final void rule__FromClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1034:1: ( rule__FromClause__Group__1__Impl )
            // InternalMSQLQueryParser.g:1035:2: rule__FromClause__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FromClause__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromClause__Group__1"


    // $ANTLR start "rule__FromClause__Group__1__Impl"
    // InternalMSQLQueryParser.g:1041:1: rule__FromClause__Group__1__Impl : ( ( rule__FromClause__TableAssignment_1 ) ) ;
    public final void rule__FromClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1045:1: ( ( ( rule__FromClause__TableAssignment_1 ) ) )
            // InternalMSQLQueryParser.g:1046:1: ( ( rule__FromClause__TableAssignment_1 ) )
            {
            // InternalMSQLQueryParser.g:1046:1: ( ( rule__FromClause__TableAssignment_1 ) )
            // InternalMSQLQueryParser.g:1047:2: ( rule__FromClause__TableAssignment_1 )
            {
             before(grammarAccess.getFromClauseAccess().getTableAssignment_1()); 
            // InternalMSQLQueryParser.g:1048:2: ( rule__FromClause__TableAssignment_1 )
            // InternalMSQLQueryParser.g:1048:3: rule__FromClause__TableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FromClause__TableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFromClauseAccess().getTableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromClause__Group__1__Impl"


    // $ANTLR start "rule__WhereClause__Group__0"
    // InternalMSQLQueryParser.g:1057:1: rule__WhereClause__Group__0 : rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1 ;
    public final void rule__WhereClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1061:1: ( rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1 )
            // InternalMSQLQueryParser.g:1062:2: rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__WhereClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereClause__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereClause__Group__0"


    // $ANTLR start "rule__WhereClause__Group__0__Impl"
    // InternalMSQLQueryParser.g:1069:1: rule__WhereClause__Group__0__Impl : ( WHERE ) ;
    public final void rule__WhereClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1073:1: ( ( WHERE ) )
            // InternalMSQLQueryParser.g:1074:1: ( WHERE )
            {
            // InternalMSQLQueryParser.g:1074:1: ( WHERE )
            // InternalMSQLQueryParser.g:1075:2: WHERE
            {
             before(grammarAccess.getWhereClauseAccess().getWHEREKeyword_0()); 
            match(input,WHERE,FOLLOW_2); 
             after(grammarAccess.getWhereClauseAccess().getWHEREKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereClause__Group__0__Impl"


    // $ANTLR start "rule__WhereClause__Group__1"
    // InternalMSQLQueryParser.g:1084:1: rule__WhereClause__Group__1 : rule__WhereClause__Group__1__Impl ;
    public final void rule__WhereClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1088:1: ( rule__WhereClause__Group__1__Impl )
            // InternalMSQLQueryParser.g:1089:2: rule__WhereClause__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhereClause__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereClause__Group__1"


    // $ANTLR start "rule__WhereClause__Group__1__Impl"
    // InternalMSQLQueryParser.g:1095:1: rule__WhereClause__Group__1__Impl : ( ( rule__WhereClause__ExpressionAssignment_1 ) ) ;
    public final void rule__WhereClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1099:1: ( ( ( rule__WhereClause__ExpressionAssignment_1 ) ) )
            // InternalMSQLQueryParser.g:1100:1: ( ( rule__WhereClause__ExpressionAssignment_1 ) )
            {
            // InternalMSQLQueryParser.g:1100:1: ( ( rule__WhereClause__ExpressionAssignment_1 ) )
            // InternalMSQLQueryParser.g:1101:2: ( rule__WhereClause__ExpressionAssignment_1 )
            {
             before(grammarAccess.getWhereClauseAccess().getExpressionAssignment_1()); 
            // InternalMSQLQueryParser.g:1102:2: ( rule__WhereClause__ExpressionAssignment_1 )
            // InternalMSQLQueryParser.g:1102:3: rule__WhereClause__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WhereClause__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhereClauseAccess().getExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereClause__Group__1__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group__0"
    // InternalMSQLQueryParser.g:1111:1: rule__AdditiveExpression__Group__0 : rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 ;
    public final void rule__AdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1115:1: ( rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 )
            // InternalMSQLQueryParser.g:1116:2: rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__AdditiveExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group__0"


    // $ANTLR start "rule__AdditiveExpression__Group__0__Impl"
    // InternalMSQLQueryParser.g:1123:1: rule__AdditiveExpression__Group__0__Impl : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1127:1: ( ( ruleMultiplicativeExpression ) )
            // InternalMSQLQueryParser.g:1128:1: ( ruleMultiplicativeExpression )
            {
            // InternalMSQLQueryParser.g:1128:1: ( ruleMultiplicativeExpression )
            // InternalMSQLQueryParser.g:1129:2: ruleMultiplicativeExpression
            {
             before(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group__1"
    // InternalMSQLQueryParser.g:1138:1: rule__AdditiveExpression__Group__1 : rule__AdditiveExpression__Group__1__Impl ;
    public final void rule__AdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1142:1: ( rule__AdditiveExpression__Group__1__Impl )
            // InternalMSQLQueryParser.g:1143:2: rule__AdditiveExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group__1"


    // $ANTLR start "rule__AdditiveExpression__Group__1__Impl"
    // InternalMSQLQueryParser.g:1149:1: rule__AdditiveExpression__Group__1__Impl : ( ( rule__AdditiveExpression__Group_1__0 )* ) ;
    public final void rule__AdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1153:1: ( ( ( rule__AdditiveExpression__Group_1__0 )* ) )
            // InternalMSQLQueryParser.g:1154:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            {
            // InternalMSQLQueryParser.g:1154:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            // InternalMSQLQueryParser.g:1155:2: ( rule__AdditiveExpression__Group_1__0 )*
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 
            // InternalMSQLQueryParser.g:1156:2: ( rule__AdditiveExpression__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==PlusSign||LA10_0==HyphenMinus) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:1156:3: rule__AdditiveExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__AdditiveExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group__1__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1__0"
    // InternalMSQLQueryParser.g:1165:1: rule__AdditiveExpression__Group_1__0 : rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 ;
    public final void rule__AdditiveExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1169:1: ( rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 )
            // InternalMSQLQueryParser.g:1170:2: rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__AdditiveExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__0"


    // $ANTLR start "rule__AdditiveExpression__Group_1__0__Impl"
    // InternalMSQLQueryParser.g:1177:1: rule__AdditiveExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditiveExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1181:1: ( ( () ) )
            // InternalMSQLQueryParser.g:1182:1: ( () )
            {
            // InternalMSQLQueryParser.g:1182:1: ( () )
            // InternalMSQLQueryParser.g:1183:2: ()
            {
             before(grammarAccess.getAdditiveExpressionAccess().getArithmeticExpressionExpression1Action_1_0()); 
            // InternalMSQLQueryParser.g:1184:2: ()
            // InternalMSQLQueryParser.g:1184:3: 
            {
            }

             after(grammarAccess.getAdditiveExpressionAccess().getArithmeticExpressionExpression1Action_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1__1"
    // InternalMSQLQueryParser.g:1192:1: rule__AdditiveExpression__Group_1__1 : rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 ;
    public final void rule__AdditiveExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1196:1: ( rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 )
            // InternalMSQLQueryParser.g:1197:2: rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__AdditiveExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__1"


    // $ANTLR start "rule__AdditiveExpression__Group_1__1__Impl"
    // InternalMSQLQueryParser.g:1204:1: rule__AdditiveExpression__Group_1__1__Impl : ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1208:1: ( ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) )
            // InternalMSQLQueryParser.g:1209:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            {
            // InternalMSQLQueryParser.g:1209:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            // InternalMSQLQueryParser.g:1210:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalMSQLQueryParser.g:1211:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            // InternalMSQLQueryParser.g:1211:3: rule__AdditiveExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1__2"
    // InternalMSQLQueryParser.g:1219:1: rule__AdditiveExpression__Group_1__2 : rule__AdditiveExpression__Group_1__2__Impl ;
    public final void rule__AdditiveExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1223:1: ( rule__AdditiveExpression__Group_1__2__Impl )
            // InternalMSQLQueryParser.g:1224:2: rule__AdditiveExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__2"


    // $ANTLR start "rule__AdditiveExpression__Group_1__2__Impl"
    // InternalMSQLQueryParser.g:1230:1: rule__AdditiveExpression__Group_1__2__Impl : ( ( rule__AdditiveExpression__Expression2Assignment_1_2 ) ) ;
    public final void rule__AdditiveExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1234:1: ( ( ( rule__AdditiveExpression__Expression2Assignment_1_2 ) ) )
            // InternalMSQLQueryParser.g:1235:1: ( ( rule__AdditiveExpression__Expression2Assignment_1_2 ) )
            {
            // InternalMSQLQueryParser.g:1235:1: ( ( rule__AdditiveExpression__Expression2Assignment_1_2 ) )
            // InternalMSQLQueryParser.g:1236:2: ( rule__AdditiveExpression__Expression2Assignment_1_2 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getExpression2Assignment_1_2()); 
            // InternalMSQLQueryParser.g:1237:2: ( rule__AdditiveExpression__Expression2Assignment_1_2 )
            // InternalMSQLQueryParser.g:1237:3: rule__AdditiveExpression__Expression2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Expression2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionAccess().getExpression2Assignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__2__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0"
    // InternalMSQLQueryParser.g:1246:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1250:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalMSQLQueryParser.g:1251:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__MultiplicativeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0__Impl"
    // InternalMSQLQueryParser.g:1258:1: rule__MultiplicativeExpression__Group__0__Impl : ( ruleAtomicExpression ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1262:1: ( ( ruleAtomicExpression ) )
            // InternalMSQLQueryParser.g:1263:1: ( ruleAtomicExpression )
            {
            // InternalMSQLQueryParser.g:1263:1: ( ruleAtomicExpression )
            // InternalMSQLQueryParser.g:1264:2: ruleAtomicExpression
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getAtomicExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAtomicExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getAtomicExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__1"
    // InternalMSQLQueryParser.g:1273:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1277:1: ( rule__MultiplicativeExpression__Group__1__Impl )
            // InternalMSQLQueryParser.g:1278:2: rule__MultiplicativeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group__1__Impl"
    // InternalMSQLQueryParser.g:1284:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1288:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // InternalMSQLQueryParser.g:1289:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // InternalMSQLQueryParser.g:1289:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // InternalMSQLQueryParser.g:1290:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            // InternalMSQLQueryParser.g:1291:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Asterisk||LA11_0==Solidus) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:1291:3: rule__MultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__MultiplicativeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__0"
    // InternalMSQLQueryParser.g:1300:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1304:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // InternalMSQLQueryParser.g:1305:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__MultiplicativeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__0__Impl"
    // InternalMSQLQueryParser.g:1312:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1316:1: ( ( () ) )
            // InternalMSQLQueryParser.g:1317:1: ( () )
            {
            // InternalMSQLQueryParser.g:1317:1: ( () )
            // InternalMSQLQueryParser.g:1318:2: ()
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getArithmeticExpressionExpression1Action_1_0()); 
            // InternalMSQLQueryParser.g:1319:2: ()
            // InternalMSQLQueryParser.g:1319:3: 
            {
            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getArithmeticExpressionExpression1Action_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__1"
    // InternalMSQLQueryParser.g:1327:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1331:1: ( rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 )
            // InternalMSQLQueryParser.g:1332:2: rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__MultiplicativeExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__1__Impl"
    // InternalMSQLQueryParser.g:1339:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1343:1: ( ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) )
            // InternalMSQLQueryParser.g:1344:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            {
            // InternalMSQLQueryParser.g:1344:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            // InternalMSQLQueryParser.g:1345:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalMSQLQueryParser.g:1346:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            // InternalMSQLQueryParser.g:1346:3: rule__MultiplicativeExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__2"
    // InternalMSQLQueryParser.g:1354:1: rule__MultiplicativeExpression__Group_1__2 : rule__MultiplicativeExpression__Group_1__2__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1358:1: ( rule__MultiplicativeExpression__Group_1__2__Impl )
            // InternalMSQLQueryParser.g:1359:2: rule__MultiplicativeExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__2"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__2__Impl"
    // InternalMSQLQueryParser.g:1365:1: rule__MultiplicativeExpression__Group_1__2__Impl : ( ( rule__MultiplicativeExpression__Expression2Assignment_1_2 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1369:1: ( ( ( rule__MultiplicativeExpression__Expression2Assignment_1_2 ) ) )
            // InternalMSQLQueryParser.g:1370:1: ( ( rule__MultiplicativeExpression__Expression2Assignment_1_2 ) )
            {
            // InternalMSQLQueryParser.g:1370:1: ( ( rule__MultiplicativeExpression__Expression2Assignment_1_2 ) )
            // InternalMSQLQueryParser.g:1371:2: ( rule__MultiplicativeExpression__Expression2Assignment_1_2 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getExpression2Assignment_1_2()); 
            // InternalMSQLQueryParser.g:1372:2: ( rule__MultiplicativeExpression__Expression2Assignment_1_2 )
            // InternalMSQLQueryParser.g:1372:3: rule__MultiplicativeExpression__Expression2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Expression2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getExpression2Assignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ComparativeExpression__Group__0"
    // InternalMSQLQueryParser.g:1381:1: rule__ComparativeExpression__Group__0 : rule__ComparativeExpression__Group__0__Impl rule__ComparativeExpression__Group__1 ;
    public final void rule__ComparativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1385:1: ( rule__ComparativeExpression__Group__0__Impl rule__ComparativeExpression__Group__1 )
            // InternalMSQLQueryParser.g:1386:2: rule__ComparativeExpression__Group__0__Impl rule__ComparativeExpression__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ComparativeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparativeExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpression__Group__0"


    // $ANTLR start "rule__ComparativeExpression__Group__0__Impl"
    // InternalMSQLQueryParser.g:1393:1: rule__ComparativeExpression__Group__0__Impl : ( ruleAdditiveExpression ) ;
    public final void rule__ComparativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1397:1: ( ( ruleAdditiveExpression ) )
            // InternalMSQLQueryParser.g:1398:1: ( ruleAdditiveExpression )
            {
            // InternalMSQLQueryParser.g:1398:1: ( ruleAdditiveExpression )
            // InternalMSQLQueryParser.g:1399:2: ruleAdditiveExpression
            {
             before(grammarAccess.getComparativeExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getComparativeExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpression__Group__0__Impl"


    // $ANTLR start "rule__ComparativeExpression__Group__1"
    // InternalMSQLQueryParser.g:1408:1: rule__ComparativeExpression__Group__1 : rule__ComparativeExpression__Group__1__Impl ;
    public final void rule__ComparativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1412:1: ( rule__ComparativeExpression__Group__1__Impl )
            // InternalMSQLQueryParser.g:1413:2: rule__ComparativeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparativeExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpression__Group__1"


    // $ANTLR start "rule__ComparativeExpression__Group__1__Impl"
    // InternalMSQLQueryParser.g:1419:1: rule__ComparativeExpression__Group__1__Impl : ( ( rule__ComparativeExpression__Group_1__0 )* ) ;
    public final void rule__ComparativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1423:1: ( ( ( rule__ComparativeExpression__Group_1__0 )* ) )
            // InternalMSQLQueryParser.g:1424:1: ( ( rule__ComparativeExpression__Group_1__0 )* )
            {
            // InternalMSQLQueryParser.g:1424:1: ( ( rule__ComparativeExpression__Group_1__0 )* )
            // InternalMSQLQueryParser.g:1425:2: ( rule__ComparativeExpression__Group_1__0 )*
            {
             before(grammarAccess.getComparativeExpressionAccess().getGroup_1()); 
            // InternalMSQLQueryParser.g:1426:2: ( rule__ComparativeExpression__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=ExclamationMarkEqualsSign && LA12_0<=GreaterThanSignEqualsSign)||(LA12_0>=LessThanSign && LA12_0<=GreaterThanSign)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:1426:3: rule__ComparativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ComparativeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getComparativeExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparativeExpression__Group_1__0"
    // InternalMSQLQueryParser.g:1435:1: rule__ComparativeExpression__Group_1__0 : rule__ComparativeExpression__Group_1__0__Impl rule__ComparativeExpression__Group_1__1 ;
    public final void rule__ComparativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1439:1: ( rule__ComparativeExpression__Group_1__0__Impl rule__ComparativeExpression__Group_1__1 )
            // InternalMSQLQueryParser.g:1440:2: rule__ComparativeExpression__Group_1__0__Impl rule__ComparativeExpression__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__ComparativeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparativeExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpression__Group_1__0"


    // $ANTLR start "rule__ComparativeExpression__Group_1__0__Impl"
    // InternalMSQLQueryParser.g:1447:1: rule__ComparativeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1451:1: ( ( () ) )
            // InternalMSQLQueryParser.g:1452:1: ( () )
            {
            // InternalMSQLQueryParser.g:1452:1: ( () )
            // InternalMSQLQueryParser.g:1453:2: ()
            {
             before(grammarAccess.getComparativeExpressionAccess().getComparativeExpressionExpression1Action_1_0()); 
            // InternalMSQLQueryParser.g:1454:2: ()
            // InternalMSQLQueryParser.g:1454:3: 
            {
            }

             after(grammarAccess.getComparativeExpressionAccess().getComparativeExpressionExpression1Action_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ComparativeExpression__Group_1__1"
    // InternalMSQLQueryParser.g:1462:1: rule__ComparativeExpression__Group_1__1 : rule__ComparativeExpression__Group_1__1__Impl rule__ComparativeExpression__Group_1__2 ;
    public final void rule__ComparativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1466:1: ( rule__ComparativeExpression__Group_1__1__Impl rule__ComparativeExpression__Group_1__2 )
            // InternalMSQLQueryParser.g:1467:2: rule__ComparativeExpression__Group_1__1__Impl rule__ComparativeExpression__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__ComparativeExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparativeExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpression__Group_1__1"


    // $ANTLR start "rule__ComparativeExpression__Group_1__1__Impl"
    // InternalMSQLQueryParser.g:1474:1: rule__ComparativeExpression__Group_1__1__Impl : ( ( rule__ComparativeExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1478:1: ( ( ( rule__ComparativeExpression__OperatorAssignment_1_1 ) ) )
            // InternalMSQLQueryParser.g:1479:1: ( ( rule__ComparativeExpression__OperatorAssignment_1_1 ) )
            {
            // InternalMSQLQueryParser.g:1479:1: ( ( rule__ComparativeExpression__OperatorAssignment_1_1 ) )
            // InternalMSQLQueryParser.g:1480:2: ( rule__ComparativeExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparativeExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalMSQLQueryParser.g:1481:2: ( rule__ComparativeExpression__OperatorAssignment_1_1 )
            // InternalMSQLQueryParser.g:1481:3: rule__ComparativeExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ComparativeExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparativeExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ComparativeExpression__Group_1__2"
    // InternalMSQLQueryParser.g:1489:1: rule__ComparativeExpression__Group_1__2 : rule__ComparativeExpression__Group_1__2__Impl ;
    public final void rule__ComparativeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1493:1: ( rule__ComparativeExpression__Group_1__2__Impl )
            // InternalMSQLQueryParser.g:1494:2: rule__ComparativeExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparativeExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpression__Group_1__2"


    // $ANTLR start "rule__ComparativeExpression__Group_1__2__Impl"
    // InternalMSQLQueryParser.g:1500:1: rule__ComparativeExpression__Group_1__2__Impl : ( ( rule__ComparativeExpression__Expression2Assignment_1_2 ) ) ;
    public final void rule__ComparativeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1504:1: ( ( ( rule__ComparativeExpression__Expression2Assignment_1_2 ) ) )
            // InternalMSQLQueryParser.g:1505:1: ( ( rule__ComparativeExpression__Expression2Assignment_1_2 ) )
            {
            // InternalMSQLQueryParser.g:1505:1: ( ( rule__ComparativeExpression__Expression2Assignment_1_2 ) )
            // InternalMSQLQueryParser.g:1506:2: ( rule__ComparativeExpression__Expression2Assignment_1_2 )
            {
             before(grammarAccess.getComparativeExpressionAccess().getExpression2Assignment_1_2()); 
            // InternalMSQLQueryParser.g:1507:2: ( rule__ComparativeExpression__Expression2Assignment_1_2 )
            // InternalMSQLQueryParser.g:1507:3: rule__ComparativeExpression__Expression2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ComparativeExpression__Expression2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparativeExpressionAccess().getExpression2Assignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AtomicExpression__Group_0__0"
    // InternalMSQLQueryParser.g:1516:1: rule__AtomicExpression__Group_0__0 : rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1 ;
    public final void rule__AtomicExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1520:1: ( rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1 )
            // InternalMSQLQueryParser.g:1521:2: rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__AtomicExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_0__0"


    // $ANTLR start "rule__AtomicExpression__Group_0__0__Impl"
    // InternalMSQLQueryParser.g:1528:1: rule__AtomicExpression__Group_0__0__Impl : ( LeftParenthesis ) ;
    public final void rule__AtomicExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1532:1: ( ( LeftParenthesis ) )
            // InternalMSQLQueryParser.g:1533:1: ( LeftParenthesis )
            {
            // InternalMSQLQueryParser.g:1533:1: ( LeftParenthesis )
            // InternalMSQLQueryParser.g:1534:2: LeftParenthesis
            {
             before(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_0__0__Impl"


    // $ANTLR start "rule__AtomicExpression__Group_0__1"
    // InternalMSQLQueryParser.g:1543:1: rule__AtomicExpression__Group_0__1 : rule__AtomicExpression__Group_0__1__Impl rule__AtomicExpression__Group_0__2 ;
    public final void rule__AtomicExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1547:1: ( rule__AtomicExpression__Group_0__1__Impl rule__AtomicExpression__Group_0__2 )
            // InternalMSQLQueryParser.g:1548:2: rule__AtomicExpression__Group_0__1__Impl rule__AtomicExpression__Group_0__2
            {
            pushFollow(FOLLOW_16);
            rule__AtomicExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicExpression__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_0__1"


    // $ANTLR start "rule__AtomicExpression__Group_0__1__Impl"
    // InternalMSQLQueryParser.g:1555:1: rule__AtomicExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__AtomicExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1559:1: ( ( ruleExpression ) )
            // InternalMSQLQueryParser.g:1560:1: ( ruleExpression )
            {
            // InternalMSQLQueryParser.g:1560:1: ( ruleExpression )
            // InternalMSQLQueryParser.g:1561:2: ruleExpression
            {
             before(grammarAccess.getAtomicExpressionAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAtomicExpressionAccess().getExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_0__1__Impl"


    // $ANTLR start "rule__AtomicExpression__Group_0__2"
    // InternalMSQLQueryParser.g:1570:1: rule__AtomicExpression__Group_0__2 : rule__AtomicExpression__Group_0__2__Impl ;
    public final void rule__AtomicExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1574:1: ( rule__AtomicExpression__Group_0__2__Impl )
            // InternalMSQLQueryParser.g:1575:2: rule__AtomicExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicExpression__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_0__2"


    // $ANTLR start "rule__AtomicExpression__Group_0__2__Impl"
    // InternalMSQLQueryParser.g:1581:1: rule__AtomicExpression__Group_0__2__Impl : ( RightParenthesis ) ;
    public final void rule__AtomicExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1585:1: ( ( RightParenthesis ) )
            // InternalMSQLQueryParser.g:1586:1: ( RightParenthesis )
            {
            // InternalMSQLQueryParser.g:1586:1: ( RightParenthesis )
            // InternalMSQLQueryParser.g:1587:2: RightParenthesis
            {
             before(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_0__2__Impl"


    // $ANTLR start "rule__OrderByClause__Group__0"
    // InternalMSQLQueryParser.g:1597:1: rule__OrderByClause__Group__0 : rule__OrderByClause__Group__0__Impl rule__OrderByClause__Group__1 ;
    public final void rule__OrderByClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1601:1: ( rule__OrderByClause__Group__0__Impl rule__OrderByClause__Group__1 )
            // InternalMSQLQueryParser.g:1602:2: rule__OrderByClause__Group__0__Impl rule__OrderByClause__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__OrderByClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderByClause__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__Group__0"


    // $ANTLR start "rule__OrderByClause__Group__0__Impl"
    // InternalMSQLQueryParser.g:1609:1: rule__OrderByClause__Group__0__Impl : ( ORDER ) ;
    public final void rule__OrderByClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1613:1: ( ( ORDER ) )
            // InternalMSQLQueryParser.g:1614:1: ( ORDER )
            {
            // InternalMSQLQueryParser.g:1614:1: ( ORDER )
            // InternalMSQLQueryParser.g:1615:2: ORDER
            {
             before(grammarAccess.getOrderByClauseAccess().getORDERKeyword_0()); 
            match(input,ORDER,FOLLOW_2); 
             after(grammarAccess.getOrderByClauseAccess().getORDERKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__Group__0__Impl"


    // $ANTLR start "rule__OrderByClause__Group__1"
    // InternalMSQLQueryParser.g:1624:1: rule__OrderByClause__Group__1 : rule__OrderByClause__Group__1__Impl rule__OrderByClause__Group__2 ;
    public final void rule__OrderByClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1628:1: ( rule__OrderByClause__Group__1__Impl rule__OrderByClause__Group__2 )
            // InternalMSQLQueryParser.g:1629:2: rule__OrderByClause__Group__1__Impl rule__OrderByClause__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__OrderByClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderByClause__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__Group__1"


    // $ANTLR start "rule__OrderByClause__Group__1__Impl"
    // InternalMSQLQueryParser.g:1636:1: rule__OrderByClause__Group__1__Impl : ( BY ) ;
    public final void rule__OrderByClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1640:1: ( ( BY ) )
            // InternalMSQLQueryParser.g:1641:1: ( BY )
            {
            // InternalMSQLQueryParser.g:1641:1: ( BY )
            // InternalMSQLQueryParser.g:1642:2: BY
            {
             before(grammarAccess.getOrderByClauseAccess().getBYKeyword_1()); 
            match(input,BY,FOLLOW_2); 
             after(grammarAccess.getOrderByClauseAccess().getBYKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__Group__1__Impl"


    // $ANTLR start "rule__OrderByClause__Group__2"
    // InternalMSQLQueryParser.g:1651:1: rule__OrderByClause__Group__2 : rule__OrderByClause__Group__2__Impl rule__OrderByClause__Group__3 ;
    public final void rule__OrderByClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1655:1: ( rule__OrderByClause__Group__2__Impl rule__OrderByClause__Group__3 )
            // InternalMSQLQueryParser.g:1656:2: rule__OrderByClause__Group__2__Impl rule__OrderByClause__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__OrderByClause__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderByClause__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__Group__2"


    // $ANTLR start "rule__OrderByClause__Group__2__Impl"
    // InternalMSQLQueryParser.g:1663:1: rule__OrderByClause__Group__2__Impl : ( ( rule__OrderByClause__OrderDirectivesAssignment_2 ) ) ;
    public final void rule__OrderByClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1667:1: ( ( ( rule__OrderByClause__OrderDirectivesAssignment_2 ) ) )
            // InternalMSQLQueryParser.g:1668:1: ( ( rule__OrderByClause__OrderDirectivesAssignment_2 ) )
            {
            // InternalMSQLQueryParser.g:1668:1: ( ( rule__OrderByClause__OrderDirectivesAssignment_2 ) )
            // InternalMSQLQueryParser.g:1669:2: ( rule__OrderByClause__OrderDirectivesAssignment_2 )
            {
             before(grammarAccess.getOrderByClauseAccess().getOrderDirectivesAssignment_2()); 
            // InternalMSQLQueryParser.g:1670:2: ( rule__OrderByClause__OrderDirectivesAssignment_2 )
            // InternalMSQLQueryParser.g:1670:3: rule__OrderByClause__OrderDirectivesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OrderByClause__OrderDirectivesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOrderByClauseAccess().getOrderDirectivesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__Group__2__Impl"


    // $ANTLR start "rule__OrderByClause__Group__3"
    // InternalMSQLQueryParser.g:1678:1: rule__OrderByClause__Group__3 : rule__OrderByClause__Group__3__Impl ;
    public final void rule__OrderByClause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1682:1: ( rule__OrderByClause__Group__3__Impl )
            // InternalMSQLQueryParser.g:1683:2: rule__OrderByClause__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrderByClause__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__Group__3"


    // $ANTLR start "rule__OrderByClause__Group__3__Impl"
    // InternalMSQLQueryParser.g:1689:1: rule__OrderByClause__Group__3__Impl : ( ( rule__OrderByClause__Group_3__0 )* ) ;
    public final void rule__OrderByClause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1693:1: ( ( ( rule__OrderByClause__Group_3__0 )* ) )
            // InternalMSQLQueryParser.g:1694:1: ( ( rule__OrderByClause__Group_3__0 )* )
            {
            // InternalMSQLQueryParser.g:1694:1: ( ( rule__OrderByClause__Group_3__0 )* )
            // InternalMSQLQueryParser.g:1695:2: ( rule__OrderByClause__Group_3__0 )*
            {
             before(grammarAccess.getOrderByClauseAccess().getGroup_3()); 
            // InternalMSQLQueryParser.g:1696:2: ( rule__OrderByClause__Group_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Comma) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:1696:3: rule__OrderByClause__Group_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__OrderByClause__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getOrderByClauseAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__Group__3__Impl"


    // $ANTLR start "rule__OrderByClause__Group_3__0"
    // InternalMSQLQueryParser.g:1705:1: rule__OrderByClause__Group_3__0 : rule__OrderByClause__Group_3__0__Impl rule__OrderByClause__Group_3__1 ;
    public final void rule__OrderByClause__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1709:1: ( rule__OrderByClause__Group_3__0__Impl rule__OrderByClause__Group_3__1 )
            // InternalMSQLQueryParser.g:1710:2: rule__OrderByClause__Group_3__0__Impl rule__OrderByClause__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__OrderByClause__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderByClause__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__Group_3__0"


    // $ANTLR start "rule__OrderByClause__Group_3__0__Impl"
    // InternalMSQLQueryParser.g:1717:1: rule__OrderByClause__Group_3__0__Impl : ( Comma ) ;
    public final void rule__OrderByClause__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1721:1: ( ( Comma ) )
            // InternalMSQLQueryParser.g:1722:1: ( Comma )
            {
            // InternalMSQLQueryParser.g:1722:1: ( Comma )
            // InternalMSQLQueryParser.g:1723:2: Comma
            {
             before(grammarAccess.getOrderByClauseAccess().getCommaKeyword_3_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getOrderByClauseAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__Group_3__0__Impl"


    // $ANTLR start "rule__OrderByClause__Group_3__1"
    // InternalMSQLQueryParser.g:1732:1: rule__OrderByClause__Group_3__1 : rule__OrderByClause__Group_3__1__Impl ;
    public final void rule__OrderByClause__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1736:1: ( rule__OrderByClause__Group_3__1__Impl )
            // InternalMSQLQueryParser.g:1737:2: rule__OrderByClause__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrderByClause__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__Group_3__1"


    // $ANTLR start "rule__OrderByClause__Group_3__1__Impl"
    // InternalMSQLQueryParser.g:1743:1: rule__OrderByClause__Group_3__1__Impl : ( ( rule__OrderByClause__OrderDirectivesAssignment_3_1 ) ) ;
    public final void rule__OrderByClause__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1747:1: ( ( ( rule__OrderByClause__OrderDirectivesAssignment_3_1 ) ) )
            // InternalMSQLQueryParser.g:1748:1: ( ( rule__OrderByClause__OrderDirectivesAssignment_3_1 ) )
            {
            // InternalMSQLQueryParser.g:1748:1: ( ( rule__OrderByClause__OrderDirectivesAssignment_3_1 ) )
            // InternalMSQLQueryParser.g:1749:2: ( rule__OrderByClause__OrderDirectivesAssignment_3_1 )
            {
             before(grammarAccess.getOrderByClauseAccess().getOrderDirectivesAssignment_3_1()); 
            // InternalMSQLQueryParser.g:1750:2: ( rule__OrderByClause__OrderDirectivesAssignment_3_1 )
            // InternalMSQLQueryParser.g:1750:3: rule__OrderByClause__OrderDirectivesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OrderByClause__OrderDirectivesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderByClauseAccess().getOrderDirectivesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__Group_3__1__Impl"


    // $ANTLR start "rule__OrderByDirective__Group__0"
    // InternalMSQLQueryParser.g:1759:1: rule__OrderByDirective__Group__0 : rule__OrderByDirective__Group__0__Impl rule__OrderByDirective__Group__1 ;
    public final void rule__OrderByDirective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1763:1: ( rule__OrderByDirective__Group__0__Impl rule__OrderByDirective__Group__1 )
            // InternalMSQLQueryParser.g:1764:2: rule__OrderByDirective__Group__0__Impl rule__OrderByDirective__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__OrderByDirective__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderByDirective__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByDirective__Group__0"


    // $ANTLR start "rule__OrderByDirective__Group__0__Impl"
    // InternalMSQLQueryParser.g:1771:1: rule__OrderByDirective__Group__0__Impl : ( ( rule__OrderByDirective__ColumnReferenceAssignment_0 ) ) ;
    public final void rule__OrderByDirective__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1775:1: ( ( ( rule__OrderByDirective__ColumnReferenceAssignment_0 ) ) )
            // InternalMSQLQueryParser.g:1776:1: ( ( rule__OrderByDirective__ColumnReferenceAssignment_0 ) )
            {
            // InternalMSQLQueryParser.g:1776:1: ( ( rule__OrderByDirective__ColumnReferenceAssignment_0 ) )
            // InternalMSQLQueryParser.g:1777:2: ( rule__OrderByDirective__ColumnReferenceAssignment_0 )
            {
             before(grammarAccess.getOrderByDirectiveAccess().getColumnReferenceAssignment_0()); 
            // InternalMSQLQueryParser.g:1778:2: ( rule__OrderByDirective__ColumnReferenceAssignment_0 )
            // InternalMSQLQueryParser.g:1778:3: rule__OrderByDirective__ColumnReferenceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OrderByDirective__ColumnReferenceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOrderByDirectiveAccess().getColumnReferenceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByDirective__Group__0__Impl"


    // $ANTLR start "rule__OrderByDirective__Group__1"
    // InternalMSQLQueryParser.g:1786:1: rule__OrderByDirective__Group__1 : rule__OrderByDirective__Group__1__Impl ;
    public final void rule__OrderByDirective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1790:1: ( rule__OrderByDirective__Group__1__Impl )
            // InternalMSQLQueryParser.g:1791:2: rule__OrderByDirective__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrderByDirective__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByDirective__Group__1"


    // $ANTLR start "rule__OrderByDirective__Group__1__Impl"
    // InternalMSQLQueryParser.g:1797:1: rule__OrderByDirective__Group__1__Impl : ( ( rule__OrderByDirective__AscendingAssignment_1 )? ) ;
    public final void rule__OrderByDirective__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1801:1: ( ( ( rule__OrderByDirective__AscendingAssignment_1 )? ) )
            // InternalMSQLQueryParser.g:1802:1: ( ( rule__OrderByDirective__AscendingAssignment_1 )? )
            {
            // InternalMSQLQueryParser.g:1802:1: ( ( rule__OrderByDirective__AscendingAssignment_1 )? )
            // InternalMSQLQueryParser.g:1803:2: ( rule__OrderByDirective__AscendingAssignment_1 )?
            {
             before(grammarAccess.getOrderByDirectiveAccess().getAscendingAssignment_1()); 
            // InternalMSQLQueryParser.g:1804:2: ( rule__OrderByDirective__AscendingAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==DESC||LA14_0==ASC) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMSQLQueryParser.g:1804:3: rule__OrderByDirective__AscendingAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__OrderByDirective__AscendingAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderByDirectiveAccess().getAscendingAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByDirective__Group__1__Impl"


    // $ANTLR start "rule__SelectQuery__WhatClauseAssignment_1"
    // InternalMSQLQueryParser.g:1813:1: rule__SelectQuery__WhatClauseAssignment_1 : ( ruleWhatClause ) ;
    public final void rule__SelectQuery__WhatClauseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1817:1: ( ( ruleWhatClause ) )
            // InternalMSQLQueryParser.g:1818:2: ( ruleWhatClause )
            {
            // InternalMSQLQueryParser.g:1818:2: ( ruleWhatClause )
            // InternalMSQLQueryParser.g:1819:3: ruleWhatClause
            {
             before(grammarAccess.getSelectQueryAccess().getWhatClauseWhatClauseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWhatClause();

            state._fsp--;

             after(grammarAccess.getSelectQueryAccess().getWhatClauseWhatClauseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__WhatClauseAssignment_1"


    // $ANTLR start "rule__SelectQuery__FromClauseAssignment_2"
    // InternalMSQLQueryParser.g:1828:1: rule__SelectQuery__FromClauseAssignment_2 : ( ruleFromClause ) ;
    public final void rule__SelectQuery__FromClauseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1832:1: ( ( ruleFromClause ) )
            // InternalMSQLQueryParser.g:1833:2: ( ruleFromClause )
            {
            // InternalMSQLQueryParser.g:1833:2: ( ruleFromClause )
            // InternalMSQLQueryParser.g:1834:3: ruleFromClause
            {
             before(grammarAccess.getSelectQueryAccess().getFromClauseFromClauseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFromClause();

            state._fsp--;

             after(grammarAccess.getSelectQueryAccess().getFromClauseFromClauseParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__FromClauseAssignment_2"


    // $ANTLR start "rule__SelectQuery__WhereClauseAssignment_3"
    // InternalMSQLQueryParser.g:1843:1: rule__SelectQuery__WhereClauseAssignment_3 : ( ruleWhereClause ) ;
    public final void rule__SelectQuery__WhereClauseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1847:1: ( ( ruleWhereClause ) )
            // InternalMSQLQueryParser.g:1848:2: ( ruleWhereClause )
            {
            // InternalMSQLQueryParser.g:1848:2: ( ruleWhereClause )
            // InternalMSQLQueryParser.g:1849:3: ruleWhereClause
            {
             before(grammarAccess.getSelectQueryAccess().getWhereClauseWhereClauseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWhereClause();

            state._fsp--;

             after(grammarAccess.getSelectQueryAccess().getWhereClauseWhereClauseParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__WhereClauseAssignment_3"


    // $ANTLR start "rule__SelectQuery__OrderByClauseAssignment_4"
    // InternalMSQLQueryParser.g:1858:1: rule__SelectQuery__OrderByClauseAssignment_4 : ( ruleOrderByClause ) ;
    public final void rule__SelectQuery__OrderByClauseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1862:1: ( ( ruleOrderByClause ) )
            // InternalMSQLQueryParser.g:1863:2: ( ruleOrderByClause )
            {
            // InternalMSQLQueryParser.g:1863:2: ( ruleOrderByClause )
            // InternalMSQLQueryParser.g:1864:3: ruleOrderByClause
            {
             before(grammarAccess.getSelectQueryAccess().getOrderByClauseOrderByClauseParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOrderByClause();

            state._fsp--;

             after(grammarAccess.getSelectQueryAccess().getOrderByClauseOrderByClauseParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__OrderByClauseAssignment_4"


    // $ANTLR start "rule__WhatClause__WhatDirectiveAssignment_0"
    // InternalMSQLQueryParser.g:1873:1: rule__WhatClause__WhatDirectiveAssignment_0 : ( ruleWhatDirective ) ;
    public final void rule__WhatClause__WhatDirectiveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1877:1: ( ( ruleWhatDirective ) )
            // InternalMSQLQueryParser.g:1878:2: ( ruleWhatDirective )
            {
            // InternalMSQLQueryParser.g:1878:2: ( ruleWhatDirective )
            // InternalMSQLQueryParser.g:1879:3: ruleWhatDirective
            {
             before(grammarAccess.getWhatClauseAccess().getWhatDirectiveWhatDirectiveParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleWhatDirective();

            state._fsp--;

             after(grammarAccess.getWhatClauseAccess().getWhatDirectiveWhatDirectiveParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhatClause__WhatDirectiveAssignment_0"


    // $ANTLR start "rule__WhatClause__WhatDirectiveAssignment_1_1"
    // InternalMSQLQueryParser.g:1888:1: rule__WhatClause__WhatDirectiveAssignment_1_1 : ( ruleWhatDirective ) ;
    public final void rule__WhatClause__WhatDirectiveAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1892:1: ( ( ruleWhatDirective ) )
            // InternalMSQLQueryParser.g:1893:2: ( ruleWhatDirective )
            {
            // InternalMSQLQueryParser.g:1893:2: ( ruleWhatDirective )
            // InternalMSQLQueryParser.g:1894:3: ruleWhatDirective
            {
             before(grammarAccess.getWhatClauseAccess().getWhatDirectiveWhatDirectiveParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWhatDirective();

            state._fsp--;

             after(grammarAccess.getWhatClauseAccess().getWhatDirectiveWhatDirectiveParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhatClause__WhatDirectiveAssignment_1_1"


    // $ANTLR start "rule__SingleColumnWhatDirective__ColumnReferenceAssignment"
    // InternalMSQLQueryParser.g:1903:1: rule__SingleColumnWhatDirective__ColumnReferenceAssignment : ( ruleColumnReference ) ;
    public final void rule__SingleColumnWhatDirective__ColumnReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1907:1: ( ( ruleColumnReference ) )
            // InternalMSQLQueryParser.g:1908:2: ( ruleColumnReference )
            {
            // InternalMSQLQueryParser.g:1908:2: ( ruleColumnReference )
            // InternalMSQLQueryParser.g:1909:3: ruleColumnReference
            {
             before(grammarAccess.getSingleColumnWhatDirectiveAccess().getColumnReferenceColumnReferenceParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnReference();

            state._fsp--;

             after(grammarAccess.getSingleColumnWhatDirectiveAccess().getColumnReferenceColumnReferenceParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleColumnWhatDirective__ColumnReferenceAssignment"


    // $ANTLR start "rule__FromClause__TableAssignment_1"
    // InternalMSQLQueryParser.g:1918:1: rule__FromClause__TableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FromClause__TableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1922:1: ( ( ( RULE_ID ) ) )
            // InternalMSQLQueryParser.g:1923:2: ( ( RULE_ID ) )
            {
            // InternalMSQLQueryParser.g:1923:2: ( ( RULE_ID ) )
            // InternalMSQLQueryParser.g:1924:3: ( RULE_ID )
            {
             before(grammarAccess.getFromClauseAccess().getTableTableCrossReference_1_0()); 
            // InternalMSQLQueryParser.g:1925:3: ( RULE_ID )
            // InternalMSQLQueryParser.g:1926:4: RULE_ID
            {
             before(grammarAccess.getFromClauseAccess().getTableTableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFromClauseAccess().getTableTableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getFromClauseAccess().getTableTableCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromClause__TableAssignment_1"


    // $ANTLR start "rule__WhereClause__ExpressionAssignment_1"
    // InternalMSQLQueryParser.g:1937:1: rule__WhereClause__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__WhereClause__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1941:1: ( ( ruleExpression ) )
            // InternalMSQLQueryParser.g:1942:2: ( ruleExpression )
            {
            // InternalMSQLQueryParser.g:1942:2: ( ruleExpression )
            // InternalMSQLQueryParser.g:1943:3: ruleExpression
            {
             before(grammarAccess.getWhereClauseAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getWhereClauseAccess().getExpressionExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereClause__ExpressionAssignment_1"


    // $ANTLR start "rule__AdditiveExpression__OperatorAssignment_1_1"
    // InternalMSQLQueryParser.g:1952:1: rule__AdditiveExpression__OperatorAssignment_1_1 : ( ruleAdditiveOperator ) ;
    public final void rule__AdditiveExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1956:1: ( ( ruleAdditiveOperator ) )
            // InternalMSQLQueryParser.g:1957:2: ( ruleAdditiveOperator )
            {
            // InternalMSQLQueryParser.g:1957:2: ( ruleAdditiveOperator )
            // InternalMSQLQueryParser.g:1958:3: ruleAdditiveOperator
            {
             before(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditiveOperator();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__AdditiveExpression__Expression2Assignment_1_2"
    // InternalMSQLQueryParser.g:1967:1: rule__AdditiveExpression__Expression2Assignment_1_2 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__Expression2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1971:1: ( ( ruleMultiplicativeExpression ) )
            // InternalMSQLQueryParser.g:1972:2: ( ruleMultiplicativeExpression )
            {
            // InternalMSQLQueryParser.g:1972:2: ( ruleMultiplicativeExpression )
            // InternalMSQLQueryParser.g:1973:3: ruleMultiplicativeExpression
            {
             before(grammarAccess.getAdditiveExpressionAccess().getExpression2MultiplicativeExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionAccess().getExpression2MultiplicativeExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Expression2Assignment_1_2"


    // $ANTLR start "rule__MultiplicativeExpression__OperatorAssignment_1_1"
    // InternalMSQLQueryParser.g:1982:1: rule__MultiplicativeExpression__OperatorAssignment_1_1 : ( ruleMultiplicativeOperator ) ;
    public final void rule__MultiplicativeExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1986:1: ( ( ruleMultiplicativeOperator ) )
            // InternalMSQLQueryParser.g:1987:2: ( ruleMultiplicativeOperator )
            {
            // InternalMSQLQueryParser.g:1987:2: ( ruleMultiplicativeOperator )
            // InternalMSQLQueryParser.g:1988:3: ruleMultiplicativeOperator
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicativeOperator();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__MultiplicativeExpression__Expression2Assignment_1_2"
    // InternalMSQLQueryParser.g:1997:1: rule__MultiplicativeExpression__Expression2Assignment_1_2 : ( ruleAtomicExpression ) ;
    public final void rule__MultiplicativeExpression__Expression2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2001:1: ( ( ruleAtomicExpression ) )
            // InternalMSQLQueryParser.g:2002:2: ( ruleAtomicExpression )
            {
            // InternalMSQLQueryParser.g:2002:2: ( ruleAtomicExpression )
            // InternalMSQLQueryParser.g:2003:3: ruleAtomicExpression
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getExpression2AtomicExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAtomicExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getExpression2AtomicExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Expression2Assignment_1_2"


    // $ANTLR start "rule__ComparativeExpression__OperatorAssignment_1_1"
    // InternalMSQLQueryParser.g:2012:1: rule__ComparativeExpression__OperatorAssignment_1_1 : ( ruleComparativeOperator ) ;
    public final void rule__ComparativeExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2016:1: ( ( ruleComparativeOperator ) )
            // InternalMSQLQueryParser.g:2017:2: ( ruleComparativeOperator )
            {
            // InternalMSQLQueryParser.g:2017:2: ( ruleComparativeOperator )
            // InternalMSQLQueryParser.g:2018:3: ruleComparativeOperator
            {
             before(grammarAccess.getComparativeExpressionAccess().getOperatorComparativeOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComparativeOperator();

            state._fsp--;

             after(grammarAccess.getComparativeExpressionAccess().getOperatorComparativeOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__ComparativeExpression__Expression2Assignment_1_2"
    // InternalMSQLQueryParser.g:2027:1: rule__ComparativeExpression__Expression2Assignment_1_2 : ( ruleAdditiveExpression ) ;
    public final void rule__ComparativeExpression__Expression2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2031:1: ( ( ruleAdditiveExpression ) )
            // InternalMSQLQueryParser.g:2032:2: ( ruleAdditiveExpression )
            {
            // InternalMSQLQueryParser.g:2032:2: ( ruleAdditiveExpression )
            // InternalMSQLQueryParser.g:2033:3: ruleAdditiveExpression
            {
             before(grammarAccess.getComparativeExpressionAccess().getExpression2AdditiveExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getComparativeExpressionAccess().getExpression2AdditiveExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpression__Expression2Assignment_1_2"


    // $ANTLR start "rule__IntegerLiteral__ValueAssignment"
    // InternalMSQLQueryParser.g:2042:1: rule__IntegerLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntegerLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2046:1: ( ( RULE_INT ) )
            // InternalMSQLQueryParser.g:2047:2: ( RULE_INT )
            {
            // InternalMSQLQueryParser.g:2047:2: ( RULE_INT )
            // InternalMSQLQueryParser.g:2048:3: RULE_INT
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerLiteral__ValueAssignment"


    // $ANTLR start "rule__OrderByClause__OrderDirectivesAssignment_2"
    // InternalMSQLQueryParser.g:2057:1: rule__OrderByClause__OrderDirectivesAssignment_2 : ( ruleOrderByDirective ) ;
    public final void rule__OrderByClause__OrderDirectivesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2061:1: ( ( ruleOrderByDirective ) )
            // InternalMSQLQueryParser.g:2062:2: ( ruleOrderByDirective )
            {
            // InternalMSQLQueryParser.g:2062:2: ( ruleOrderByDirective )
            // InternalMSQLQueryParser.g:2063:3: ruleOrderByDirective
            {
             before(grammarAccess.getOrderByClauseAccess().getOrderDirectivesOrderByDirectiveParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOrderByDirective();

            state._fsp--;

             after(grammarAccess.getOrderByClauseAccess().getOrderDirectivesOrderByDirectiveParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__OrderDirectivesAssignment_2"


    // $ANTLR start "rule__OrderByClause__OrderDirectivesAssignment_3_1"
    // InternalMSQLQueryParser.g:2072:1: rule__OrderByClause__OrderDirectivesAssignment_3_1 : ( ruleOrderByDirective ) ;
    public final void rule__OrderByClause__OrderDirectivesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2076:1: ( ( ruleOrderByDirective ) )
            // InternalMSQLQueryParser.g:2077:2: ( ruleOrderByDirective )
            {
            // InternalMSQLQueryParser.g:2077:2: ( ruleOrderByDirective )
            // InternalMSQLQueryParser.g:2078:3: ruleOrderByDirective
            {
             before(grammarAccess.getOrderByClauseAccess().getOrderDirectivesOrderByDirectiveParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrderByDirective();

            state._fsp--;

             after(grammarAccess.getOrderByClauseAccess().getOrderDirectivesOrderByDirectiveParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__OrderDirectivesAssignment_3_1"


    // $ANTLR start "rule__OrderByDirective__ColumnReferenceAssignment_0"
    // InternalMSQLQueryParser.g:2087:1: rule__OrderByDirective__ColumnReferenceAssignment_0 : ( ruleColumnReference ) ;
    public final void rule__OrderByDirective__ColumnReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2091:1: ( ( ruleColumnReference ) )
            // InternalMSQLQueryParser.g:2092:2: ( ruleColumnReference )
            {
            // InternalMSQLQueryParser.g:2092:2: ( ruleColumnReference )
            // InternalMSQLQueryParser.g:2093:3: ruleColumnReference
            {
             before(grammarAccess.getOrderByDirectiveAccess().getColumnReferenceColumnReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnReference();

            state._fsp--;

             after(grammarAccess.getOrderByDirectiveAccess().getColumnReferenceColumnReferenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByDirective__ColumnReferenceAssignment_0"


    // $ANTLR start "rule__OrderByDirective__AscendingAssignment_1"
    // InternalMSQLQueryParser.g:2102:1: rule__OrderByDirective__AscendingAssignment_1 : ( ( rule__OrderByDirective__AscendingAlternatives_1_0 ) ) ;
    public final void rule__OrderByDirective__AscendingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2106:1: ( ( ( rule__OrderByDirective__AscendingAlternatives_1_0 ) ) )
            // InternalMSQLQueryParser.g:2107:2: ( ( rule__OrderByDirective__AscendingAlternatives_1_0 ) )
            {
            // InternalMSQLQueryParser.g:2107:2: ( ( rule__OrderByDirective__AscendingAlternatives_1_0 ) )
            // InternalMSQLQueryParser.g:2108:3: ( rule__OrderByDirective__AscendingAlternatives_1_0 )
            {
             before(grammarAccess.getOrderByDirectiveAccess().getAscendingAlternatives_1_0()); 
            // InternalMSQLQueryParser.g:2109:3: ( rule__OrderByDirective__AscendingAlternatives_1_0 )
            // InternalMSQLQueryParser.g:2109:4: rule__OrderByDirective__AscendingAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__OrderByDirective__AscendingAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getOrderByDirectiveAccess().getAscendingAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByDirective__AscendingAssignment_1"


    // $ANTLR start "rule__ColumnReference__ColumnAssignment"
    // InternalMSQLQueryParser.g:2117:1: rule__ColumnReference__ColumnAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ColumnReference__ColumnAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2121:1: ( ( ( RULE_ID ) ) )
            // InternalMSQLQueryParser.g:2122:2: ( ( RULE_ID ) )
            {
            // InternalMSQLQueryParser.g:2122:2: ( ( RULE_ID ) )
            // InternalMSQLQueryParser.g:2123:3: ( RULE_ID )
            {
             before(grammarAccess.getColumnReferenceAccess().getColumnColumnCrossReference_0()); 
            // InternalMSQLQueryParser.g:2124:3: ( RULE_ID )
            // InternalMSQLQueryParser.g:2125:4: RULE_ID
            {
             before(grammarAccess.getColumnReferenceAccess().getColumnColumnIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColumnReferenceAccess().getColumnColumnIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getColumnReferenceAccess().getColumnColumnCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnReference__ColumnAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000006014000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000A0002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000110002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001C01C00L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001C01C02L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000280L});

}