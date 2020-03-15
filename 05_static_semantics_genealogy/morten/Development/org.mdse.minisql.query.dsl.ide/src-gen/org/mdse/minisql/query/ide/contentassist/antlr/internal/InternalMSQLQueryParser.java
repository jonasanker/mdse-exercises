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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SELECT", "FALSE", "ORDER", "WHERE", "DESC", "FROM", "TRUE", "AND", "ASC", "NOT", "ExclamationMarkEqualsSign", "LessThanSignEqualsSign", "GreaterThanSignEqualsSign", "BY", "OR", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "Solidus", "Semicolon", "LessThanSign", "EqualsSign", "GreaterThanSign", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_STRING=32;
    public static final int FROM=9;
    public static final int DESC=8;
    public static final int LessThanSign=27;
    public static final int RULE_SL_COMMENT=34;
    public static final int ORDER=6;
    public static final int ASC=12;
    public static final int Comma=23;
    public static final int EqualsSign=28;
    public static final int HyphenMinus=24;
    public static final int LeftParenthesis=19;
    public static final int BY=17;
    public static final int LessThanSignEqualsSign=15;
    public static final int Solidus=25;
    public static final int EOF=-1;
    public static final int Asterisk=21;
    public static final int GreaterThanSign=29;
    public static final int OR=18;
    public static final int RULE_ID=30;
    public static final int RULE_WS=35;
    public static final int RightParenthesis=20;
    public static final int TRUE=10;
    public static final int RULE_ANY_OTHER=36;
    public static final int WHERE=7;
    public static final int SELECT=4;
    public static final int GreaterThanSignEqualsSign=16;
    public static final int Semicolon=26;
    public static final int NOT=13;
    public static final int PlusSign=22;
    public static final int RULE_INT=31;
    public static final int AND=11;
    public static final int RULE_ML_COMMENT=33;
    public static final int FALSE=5;
    public static final int ExclamationMarkEqualsSign=14;

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
    		tokenNameToValue.put("OR", "'OR'");
    		tokenNameToValue.put("AND", "'AND'");
    		tokenNameToValue.put("ASC", "'ASC'");
    		tokenNameToValue.put("NOT", "'NOT'");
    		tokenNameToValue.put("DESC", "'DESC'");
    		tokenNameToValue.put("FROM", "'FROM'");
    		tokenNameToValue.put("TRUE", "'TRUE'");
    		tokenNameToValue.put("FALSE", "'FALSE'");
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
    // InternalMSQLQueryParser.g:81:1: entryRuleSelectQuery : ruleSelectQuery EOF ;
    public final void entryRuleSelectQuery() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:82:1: ( ruleSelectQuery EOF )
            // InternalMSQLQueryParser.g:83:1: ruleSelectQuery EOF
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
    // InternalMSQLQueryParser.g:90:1: ruleSelectQuery : ( ( rule__SelectQuery__Group__0 ) ) ;
    public final void ruleSelectQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:94:2: ( ( ( rule__SelectQuery__Group__0 ) ) )
            // InternalMSQLQueryParser.g:95:2: ( ( rule__SelectQuery__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:95:2: ( ( rule__SelectQuery__Group__0 ) )
            // InternalMSQLQueryParser.g:96:3: ( rule__SelectQuery__Group__0 )
            {
             before(grammarAccess.getSelectQueryAccess().getGroup()); 
            // InternalMSQLQueryParser.g:97:3: ( rule__SelectQuery__Group__0 )
            // InternalMSQLQueryParser.g:97:4: rule__SelectQuery__Group__0
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
    // InternalMSQLQueryParser.g:106:1: entryRuleWhatClause : ruleWhatClause EOF ;
    public final void entryRuleWhatClause() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:107:1: ( ruleWhatClause EOF )
            // InternalMSQLQueryParser.g:108:1: ruleWhatClause EOF
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
    // InternalMSQLQueryParser.g:115:1: ruleWhatClause : ( ( rule__WhatClause__Group__0 ) ) ;
    public final void ruleWhatClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:119:2: ( ( ( rule__WhatClause__Group__0 ) ) )
            // InternalMSQLQueryParser.g:120:2: ( ( rule__WhatClause__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:120:2: ( ( rule__WhatClause__Group__0 ) )
            // InternalMSQLQueryParser.g:121:3: ( rule__WhatClause__Group__0 )
            {
             before(grammarAccess.getWhatClauseAccess().getGroup()); 
            // InternalMSQLQueryParser.g:122:3: ( rule__WhatClause__Group__0 )
            // InternalMSQLQueryParser.g:122:4: rule__WhatClause__Group__0
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
    // InternalMSQLQueryParser.g:131:1: entryRuleWhatDirective : ruleWhatDirective EOF ;
    public final void entryRuleWhatDirective() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:132:1: ( ruleWhatDirective EOF )
            // InternalMSQLQueryParser.g:133:1: ruleWhatDirective EOF
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
    // InternalMSQLQueryParser.g:140:1: ruleWhatDirective : ( ( rule__WhatDirective__Alternatives ) ) ;
    public final void ruleWhatDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:144:2: ( ( ( rule__WhatDirective__Alternatives ) ) )
            // InternalMSQLQueryParser.g:145:2: ( ( rule__WhatDirective__Alternatives ) )
            {
            // InternalMSQLQueryParser.g:145:2: ( ( rule__WhatDirective__Alternatives ) )
            // InternalMSQLQueryParser.g:146:3: ( rule__WhatDirective__Alternatives )
            {
             before(grammarAccess.getWhatDirectiveAccess().getAlternatives()); 
            // InternalMSQLQueryParser.g:147:3: ( rule__WhatDirective__Alternatives )
            // InternalMSQLQueryParser.g:147:4: rule__WhatDirective__Alternatives
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
    // InternalMSQLQueryParser.g:156:1: entryRuleAllColumnsWhatDirective : ruleAllColumnsWhatDirective EOF ;
    public final void entryRuleAllColumnsWhatDirective() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:157:1: ( ruleAllColumnsWhatDirective EOF )
            // InternalMSQLQueryParser.g:158:1: ruleAllColumnsWhatDirective EOF
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
    // InternalMSQLQueryParser.g:165:1: ruleAllColumnsWhatDirective : ( ( rule__AllColumnsWhatDirective__Group__0 ) ) ;
    public final void ruleAllColumnsWhatDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:169:2: ( ( ( rule__AllColumnsWhatDirective__Group__0 ) ) )
            // InternalMSQLQueryParser.g:170:2: ( ( rule__AllColumnsWhatDirective__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:170:2: ( ( rule__AllColumnsWhatDirective__Group__0 ) )
            // InternalMSQLQueryParser.g:171:3: ( rule__AllColumnsWhatDirective__Group__0 )
            {
             before(grammarAccess.getAllColumnsWhatDirectiveAccess().getGroup()); 
            // InternalMSQLQueryParser.g:172:3: ( rule__AllColumnsWhatDirective__Group__0 )
            // InternalMSQLQueryParser.g:172:4: rule__AllColumnsWhatDirective__Group__0
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
    // InternalMSQLQueryParser.g:181:1: entryRuleSingleColumnWhatDirective : ruleSingleColumnWhatDirective EOF ;
    public final void entryRuleSingleColumnWhatDirective() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:182:1: ( ruleSingleColumnWhatDirective EOF )
            // InternalMSQLQueryParser.g:183:1: ruleSingleColumnWhatDirective EOF
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
    // InternalMSQLQueryParser.g:190:1: ruleSingleColumnWhatDirective : ( ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment ) ) ;
    public final void ruleSingleColumnWhatDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:194:2: ( ( ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment ) ) )
            // InternalMSQLQueryParser.g:195:2: ( ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment ) )
            {
            // InternalMSQLQueryParser.g:195:2: ( ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment ) )
            // InternalMSQLQueryParser.g:196:3: ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment )
            {
             before(grammarAccess.getSingleColumnWhatDirectiveAccess().getColumnReferenceAssignment()); 
            // InternalMSQLQueryParser.g:197:3: ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment )
            // InternalMSQLQueryParser.g:197:4: rule__SingleColumnWhatDirective__ColumnReferenceAssignment
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
    // InternalMSQLQueryParser.g:206:1: entryRuleFromClause : ruleFromClause EOF ;
    public final void entryRuleFromClause() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:207:1: ( ruleFromClause EOF )
            // InternalMSQLQueryParser.g:208:1: ruleFromClause EOF
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
    // InternalMSQLQueryParser.g:215:1: ruleFromClause : ( ( rule__FromClause__Group__0 ) ) ;
    public final void ruleFromClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:219:2: ( ( ( rule__FromClause__Group__0 ) ) )
            // InternalMSQLQueryParser.g:220:2: ( ( rule__FromClause__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:220:2: ( ( rule__FromClause__Group__0 ) )
            // InternalMSQLQueryParser.g:221:3: ( rule__FromClause__Group__0 )
            {
             before(grammarAccess.getFromClauseAccess().getGroup()); 
            // InternalMSQLQueryParser.g:222:3: ( rule__FromClause__Group__0 )
            // InternalMSQLQueryParser.g:222:4: rule__FromClause__Group__0
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
    // InternalMSQLQueryParser.g:231:1: entryRuleWhereClause : ruleWhereClause EOF ;
    public final void entryRuleWhereClause() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:232:1: ( ruleWhereClause EOF )
            // InternalMSQLQueryParser.g:233:1: ruleWhereClause EOF
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
    // InternalMSQLQueryParser.g:240:1: ruleWhereClause : ( ( rule__WhereClause__Group__0 ) ) ;
    public final void ruleWhereClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:244:2: ( ( ( rule__WhereClause__Group__0 ) ) )
            // InternalMSQLQueryParser.g:245:2: ( ( rule__WhereClause__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:245:2: ( ( rule__WhereClause__Group__0 ) )
            // InternalMSQLQueryParser.g:246:3: ( rule__WhereClause__Group__0 )
            {
             before(grammarAccess.getWhereClauseAccess().getGroup()); 
            // InternalMSQLQueryParser.g:247:3: ( rule__WhereClause__Group__0 )
            // InternalMSQLQueryParser.g:247:4: rule__WhereClause__Group__0
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


    // $ANTLR start "entryRuleOrderByClause"
    // InternalMSQLQueryParser.g:256:1: entryRuleOrderByClause : ruleOrderByClause EOF ;
    public final void entryRuleOrderByClause() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:257:1: ( ruleOrderByClause EOF )
            // InternalMSQLQueryParser.g:258:1: ruleOrderByClause EOF
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
    // InternalMSQLQueryParser.g:265:1: ruleOrderByClause : ( ( rule__OrderByClause__Group__0 ) ) ;
    public final void ruleOrderByClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:269:2: ( ( ( rule__OrderByClause__Group__0 ) ) )
            // InternalMSQLQueryParser.g:270:2: ( ( rule__OrderByClause__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:270:2: ( ( rule__OrderByClause__Group__0 ) )
            // InternalMSQLQueryParser.g:271:3: ( rule__OrderByClause__Group__0 )
            {
             before(grammarAccess.getOrderByClauseAccess().getGroup()); 
            // InternalMSQLQueryParser.g:272:3: ( rule__OrderByClause__Group__0 )
            // InternalMSQLQueryParser.g:272:4: rule__OrderByClause__Group__0
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


    // $ANTLR start "entryRuleOrderDirective"
    // InternalMSQLQueryParser.g:281:1: entryRuleOrderDirective : ruleOrderDirective EOF ;
    public final void entryRuleOrderDirective() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:282:1: ( ruleOrderDirective EOF )
            // InternalMSQLQueryParser.g:283:1: ruleOrderDirective EOF
            {
             before(grammarAccess.getOrderDirectiveRule()); 
            pushFollow(FOLLOW_1);
            ruleOrderDirective();

            state._fsp--;

             after(grammarAccess.getOrderDirectiveRule()); 
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
    // $ANTLR end "entryRuleOrderDirective"


    // $ANTLR start "ruleOrderDirective"
    // InternalMSQLQueryParser.g:290:1: ruleOrderDirective : ( ( rule__OrderDirective__Group__0 ) ) ;
    public final void ruleOrderDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:294:2: ( ( ( rule__OrderDirective__Group__0 ) ) )
            // InternalMSQLQueryParser.g:295:2: ( ( rule__OrderDirective__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:295:2: ( ( rule__OrderDirective__Group__0 ) )
            // InternalMSQLQueryParser.g:296:3: ( rule__OrderDirective__Group__0 )
            {
             before(grammarAccess.getOrderDirectiveAccess().getGroup()); 
            // InternalMSQLQueryParser.g:297:3: ( rule__OrderDirective__Group__0 )
            // InternalMSQLQueryParser.g:297:4: rule__OrderDirective__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrderDirective__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderDirectiveAccess().getGroup()); 

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
    // $ANTLR end "ruleOrderDirective"


    // $ANTLR start "entryRuleExpression"
    // InternalMSQLQueryParser.g:306:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:307:1: ( ruleExpression EOF )
            // InternalMSQLQueryParser.g:308:1: ruleExpression EOF
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
    // InternalMSQLQueryParser.g:315:1: ruleExpression : ( ruleOrExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:319:2: ( ( ruleOrExpression ) )
            // InternalMSQLQueryParser.g:320:2: ( ruleOrExpression )
            {
            // InternalMSQLQueryParser.g:320:2: ( ruleOrExpression )
            // InternalMSQLQueryParser.g:321:3: ruleOrExpression
            {
             before(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall()); 

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


    // $ANTLR start "entryRuleOrExpression"
    // InternalMSQLQueryParser.g:331:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:332:1: ( ruleOrExpression EOF )
            // InternalMSQLQueryParser.g:333:1: ruleOrExpression EOF
            {
             before(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionRule()); 
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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalMSQLQueryParser.g:340:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:344:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalMSQLQueryParser.g:345:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:345:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalMSQLQueryParser.g:346:3: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // InternalMSQLQueryParser.g:347:3: ( rule__OrExpression__Group__0 )
            // InternalMSQLQueryParser.g:347:4: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalMSQLQueryParser.g:356:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:357:1: ( ruleAndExpression EOF )
            // InternalMSQLQueryParser.g:358:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalMSQLQueryParser.g:365:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:369:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalMSQLQueryParser.g:370:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:370:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalMSQLQueryParser.g:371:3: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // InternalMSQLQueryParser.g:372:3: ( rule__AndExpression__Group__0 )
            // InternalMSQLQueryParser.g:372:4: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleAndOperand"
    // InternalMSQLQueryParser.g:381:1: entryRuleAndOperand : ruleAndOperand EOF ;
    public final void entryRuleAndOperand() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:382:1: ( ruleAndOperand EOF )
            // InternalMSQLQueryParser.g:383:1: ruleAndOperand EOF
            {
             before(grammarAccess.getAndOperandRule()); 
            pushFollow(FOLLOW_1);
            ruleAndOperand();

            state._fsp--;

             after(grammarAccess.getAndOperandRule()); 
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
    // $ANTLR end "entryRuleAndOperand"


    // $ANTLR start "ruleAndOperand"
    // InternalMSQLQueryParser.g:390:1: ruleAndOperand : ( ( rule__AndOperand__Alternatives ) ) ;
    public final void ruleAndOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:394:2: ( ( ( rule__AndOperand__Alternatives ) ) )
            // InternalMSQLQueryParser.g:395:2: ( ( rule__AndOperand__Alternatives ) )
            {
            // InternalMSQLQueryParser.g:395:2: ( ( rule__AndOperand__Alternatives ) )
            // InternalMSQLQueryParser.g:396:3: ( rule__AndOperand__Alternatives )
            {
             before(grammarAccess.getAndOperandAccess().getAlternatives()); 
            // InternalMSQLQueryParser.g:397:3: ( rule__AndOperand__Alternatives )
            // InternalMSQLQueryParser.g:397:4: rule__AndOperand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AndOperand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAndOperandAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAndOperand"


    // $ANTLR start "entryRuleNotExpression"
    // InternalMSQLQueryParser.g:406:1: entryRuleNotExpression : ruleNotExpression EOF ;
    public final void entryRuleNotExpression() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:407:1: ( ruleNotExpression EOF )
            // InternalMSQLQueryParser.g:408:1: ruleNotExpression EOF
            {
             before(grammarAccess.getNotExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleNotExpression();

            state._fsp--;

             after(grammarAccess.getNotExpressionRule()); 
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
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalMSQLQueryParser.g:415:1: ruleNotExpression : ( ( rule__NotExpression__Group__0 ) ) ;
    public final void ruleNotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:419:2: ( ( ( rule__NotExpression__Group__0 ) ) )
            // InternalMSQLQueryParser.g:420:2: ( ( rule__NotExpression__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:420:2: ( ( rule__NotExpression__Group__0 ) )
            // InternalMSQLQueryParser.g:421:3: ( rule__NotExpression__Group__0 )
            {
             before(grammarAccess.getNotExpressionAccess().getGroup()); 
            // InternalMSQLQueryParser.g:422:3: ( rule__NotExpression__Group__0 )
            // InternalMSQLQueryParser.g:422:4: rule__NotExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNotExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleComparativeExpression"
    // InternalMSQLQueryParser.g:431:1: entryRuleComparativeExpression : ruleComparativeExpression EOF ;
    public final void entryRuleComparativeExpression() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:432:1: ( ruleComparativeExpression EOF )
            // InternalMSQLQueryParser.g:433:1: ruleComparativeExpression EOF
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
    // InternalMSQLQueryParser.g:440:1: ruleComparativeExpression : ( ( rule__ComparativeExpression__Group__0 ) ) ;
    public final void ruleComparativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:444:2: ( ( ( rule__ComparativeExpression__Group__0 ) ) )
            // InternalMSQLQueryParser.g:445:2: ( ( rule__ComparativeExpression__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:445:2: ( ( rule__ComparativeExpression__Group__0 ) )
            // InternalMSQLQueryParser.g:446:3: ( rule__ComparativeExpression__Group__0 )
            {
             before(grammarAccess.getComparativeExpressionAccess().getGroup()); 
            // InternalMSQLQueryParser.g:447:3: ( rule__ComparativeExpression__Group__0 )
            // InternalMSQLQueryParser.g:447:4: rule__ComparativeExpression__Group__0
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


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalMSQLQueryParser.g:456:1: entryRuleAdditiveExpression : ruleAdditiveExpression EOF ;
    public final void entryRuleAdditiveExpression() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:457:1: ( ruleAdditiveExpression EOF )
            // InternalMSQLQueryParser.g:458:1: ruleAdditiveExpression EOF
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
    // InternalMSQLQueryParser.g:465:1: ruleAdditiveExpression : ( ( rule__AdditiveExpression__Group__0 ) ) ;
    public final void ruleAdditiveExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:469:2: ( ( ( rule__AdditiveExpression__Group__0 ) ) )
            // InternalMSQLQueryParser.g:470:2: ( ( rule__AdditiveExpression__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:470:2: ( ( rule__AdditiveExpression__Group__0 ) )
            // InternalMSQLQueryParser.g:471:3: ( rule__AdditiveExpression__Group__0 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup()); 
            // InternalMSQLQueryParser.g:472:3: ( rule__AdditiveExpression__Group__0 )
            // InternalMSQLQueryParser.g:472:4: rule__AdditiveExpression__Group__0
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
    // InternalMSQLQueryParser.g:481:1: entryRuleMultiplicativeExpression : ruleMultiplicativeExpression EOF ;
    public final void entryRuleMultiplicativeExpression() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:482:1: ( ruleMultiplicativeExpression EOF )
            // InternalMSQLQueryParser.g:483:1: ruleMultiplicativeExpression EOF
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
    // InternalMSQLQueryParser.g:490:1: ruleMultiplicativeExpression : ( ( rule__MultiplicativeExpression__Group__0 ) ) ;
    public final void ruleMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:494:2: ( ( ( rule__MultiplicativeExpression__Group__0 ) ) )
            // InternalMSQLQueryParser.g:495:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:495:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            // InternalMSQLQueryParser.g:496:3: ( rule__MultiplicativeExpression__Group__0 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            // InternalMSQLQueryParser.g:497:3: ( rule__MultiplicativeExpression__Group__0 )
            // InternalMSQLQueryParser.g:497:4: rule__MultiplicativeExpression__Group__0
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


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalMSQLQueryParser.g:506:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:507:1: ( ruleAtomicExpression EOF )
            // InternalMSQLQueryParser.g:508:1: ruleAtomicExpression EOF
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
    // InternalMSQLQueryParser.g:515:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Alternatives ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:519:2: ( ( ( rule__AtomicExpression__Alternatives ) ) )
            // InternalMSQLQueryParser.g:520:2: ( ( rule__AtomicExpression__Alternatives ) )
            {
            // InternalMSQLQueryParser.g:520:2: ( ( rule__AtomicExpression__Alternatives ) )
            // InternalMSQLQueryParser.g:521:3: ( rule__AtomicExpression__Alternatives )
            {
             before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            // InternalMSQLQueryParser.g:522:3: ( rule__AtomicExpression__Alternatives )
            // InternalMSQLQueryParser.g:522:4: rule__AtomicExpression__Alternatives
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


    // $ANTLR start "entryRuleTableReference"
    // InternalMSQLQueryParser.g:531:1: entryRuleTableReference : ruleTableReference EOF ;
    public final void entryRuleTableReference() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:532:1: ( ruleTableReference EOF )
            // InternalMSQLQueryParser.g:533:1: ruleTableReference EOF
            {
             before(grammarAccess.getTableReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleTableReference();

            state._fsp--;

             after(grammarAccess.getTableReferenceRule()); 
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
    // $ANTLR end "entryRuleTableReference"


    // $ANTLR start "ruleTableReference"
    // InternalMSQLQueryParser.g:540:1: ruleTableReference : ( ( rule__TableReference__TableAssignment ) ) ;
    public final void ruleTableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:544:2: ( ( ( rule__TableReference__TableAssignment ) ) )
            // InternalMSQLQueryParser.g:545:2: ( ( rule__TableReference__TableAssignment ) )
            {
            // InternalMSQLQueryParser.g:545:2: ( ( rule__TableReference__TableAssignment ) )
            // InternalMSQLQueryParser.g:546:3: ( rule__TableReference__TableAssignment )
            {
             before(grammarAccess.getTableReferenceAccess().getTableAssignment()); 
            // InternalMSQLQueryParser.g:547:3: ( rule__TableReference__TableAssignment )
            // InternalMSQLQueryParser.g:547:4: rule__TableReference__TableAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TableReference__TableAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTableReferenceAccess().getTableAssignment()); 

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
    // $ANTLR end "ruleTableReference"


    // $ANTLR start "entryRuleColumnReference"
    // InternalMSQLQueryParser.g:556:1: entryRuleColumnReference : ruleColumnReference EOF ;
    public final void entryRuleColumnReference() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:557:1: ( ruleColumnReference EOF )
            // InternalMSQLQueryParser.g:558:1: ruleColumnReference EOF
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
    // InternalMSQLQueryParser.g:565:1: ruleColumnReference : ( ( rule__ColumnReference__ColumnAssignment ) ) ;
    public final void ruleColumnReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:569:2: ( ( ( rule__ColumnReference__ColumnAssignment ) ) )
            // InternalMSQLQueryParser.g:570:2: ( ( rule__ColumnReference__ColumnAssignment ) )
            {
            // InternalMSQLQueryParser.g:570:2: ( ( rule__ColumnReference__ColumnAssignment ) )
            // InternalMSQLQueryParser.g:571:3: ( rule__ColumnReference__ColumnAssignment )
            {
             before(grammarAccess.getColumnReferenceAccess().getColumnAssignment()); 
            // InternalMSQLQueryParser.g:572:3: ( rule__ColumnReference__ColumnAssignment )
            // InternalMSQLQueryParser.g:572:4: rule__ColumnReference__ColumnAssignment
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


    // $ANTLR start "entryRuleLiteral"
    // InternalMSQLQueryParser.g:581:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:582:1: ( ruleLiteral EOF )
            // InternalMSQLQueryParser.g:583:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalMSQLQueryParser.g:590:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:594:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalMSQLQueryParser.g:595:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalMSQLQueryParser.g:595:2: ( ( rule__Literal__Alternatives ) )
            // InternalMSQLQueryParser.g:596:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalMSQLQueryParser.g:597:3: ( rule__Literal__Alternatives )
            // InternalMSQLQueryParser.g:597:4: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalMSQLQueryParser.g:606:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:607:1: ( ruleStringLiteral EOF )
            // InternalMSQLQueryParser.g:608:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalMSQLQueryParser.g:615:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:619:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalMSQLQueryParser.g:620:2: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalMSQLQueryParser.g:620:2: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalMSQLQueryParser.g:621:3: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // InternalMSQLQueryParser.g:622:3: ( rule__StringLiteral__ValueAssignment )
            // InternalMSQLQueryParser.g:622:4: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleIntegerLiteral"
    // InternalMSQLQueryParser.g:631:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:632:1: ( ruleIntegerLiteral EOF )
            // InternalMSQLQueryParser.g:633:1: ruleIntegerLiteral EOF
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
    // InternalMSQLQueryParser.g:640:1: ruleIntegerLiteral : ( ( rule__IntegerLiteral__ValueAssignment ) ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:644:2: ( ( ( rule__IntegerLiteral__ValueAssignment ) ) )
            // InternalMSQLQueryParser.g:645:2: ( ( rule__IntegerLiteral__ValueAssignment ) )
            {
            // InternalMSQLQueryParser.g:645:2: ( ( rule__IntegerLiteral__ValueAssignment ) )
            // InternalMSQLQueryParser.g:646:3: ( rule__IntegerLiteral__ValueAssignment )
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); 
            // InternalMSQLQueryParser.g:647:3: ( rule__IntegerLiteral__ValueAssignment )
            // InternalMSQLQueryParser.g:647:4: rule__IntegerLiteral__ValueAssignment
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


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalMSQLQueryParser.g:656:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:657:1: ( ruleBooleanLiteral EOF )
            // InternalMSQLQueryParser.g:658:1: ruleBooleanLiteral EOF
            {
             before(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanLiteral();

            state._fsp--;

             after(grammarAccess.getBooleanLiteralRule()); 
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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalMSQLQueryParser.g:665:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:669:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // InternalMSQLQueryParser.g:670:2: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // InternalMSQLQueryParser.g:670:2: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // InternalMSQLQueryParser.g:671:3: ( rule__BooleanLiteral__ValueAssignment )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            // InternalMSQLQueryParser.g:672:3: ( rule__BooleanLiteral__ValueAssignment )
            // InternalMSQLQueryParser.g:672:4: rule__BooleanLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "ruleOrOperator"
    // InternalMSQLQueryParser.g:681:1: ruleOrOperator : ( ( OR ) ) ;
    public final void ruleOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:685:1: ( ( ( OR ) ) )
            // InternalMSQLQueryParser.g:686:2: ( ( OR ) )
            {
            // InternalMSQLQueryParser.g:686:2: ( ( OR ) )
            // InternalMSQLQueryParser.g:687:3: ( OR )
            {
             before(grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration()); 
            // InternalMSQLQueryParser.g:688:3: ( OR )
            // InternalMSQLQueryParser.g:688:4: OR
            {
            match(input,OR,FOLLOW_2); 

            }

             after(grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration()); 

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
    // $ANTLR end "ruleOrOperator"


    // $ANTLR start "ruleAndOperator"
    // InternalMSQLQueryParser.g:697:1: ruleAndOperator : ( ( AND ) ) ;
    public final void ruleAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:701:1: ( ( ( AND ) ) )
            // InternalMSQLQueryParser.g:702:2: ( ( AND ) )
            {
            // InternalMSQLQueryParser.g:702:2: ( ( AND ) )
            // InternalMSQLQueryParser.g:703:3: ( AND )
            {
             before(grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            // InternalMSQLQueryParser.g:704:3: ( AND )
            // InternalMSQLQueryParser.g:704:4: AND
            {
            match(input,AND,FOLLOW_2); 

            }

             after(grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration()); 

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
    // $ANTLR end "ruleAndOperator"


    // $ANTLR start "ruleNotOperator"
    // InternalMSQLQueryParser.g:713:1: ruleNotOperator : ( ( NOT ) ) ;
    public final void ruleNotOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:717:1: ( ( ( NOT ) ) )
            // InternalMSQLQueryParser.g:718:2: ( ( NOT ) )
            {
            // InternalMSQLQueryParser.g:718:2: ( ( NOT ) )
            // InternalMSQLQueryParser.g:719:3: ( NOT )
            {
             before(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration()); 
            // InternalMSQLQueryParser.g:720:3: ( NOT )
            // InternalMSQLQueryParser.g:720:4: NOT
            {
            match(input,NOT,FOLLOW_2); 

            }

             after(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration()); 

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
    // $ANTLR end "ruleNotOperator"


    // $ANTLR start "ruleComparativeOperator"
    // InternalMSQLQueryParser.g:729:1: ruleComparativeOperator : ( ( rule__ComparativeOperator__Alternatives ) ) ;
    public final void ruleComparativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:733:1: ( ( ( rule__ComparativeOperator__Alternatives ) ) )
            // InternalMSQLQueryParser.g:734:2: ( ( rule__ComparativeOperator__Alternatives ) )
            {
            // InternalMSQLQueryParser.g:734:2: ( ( rule__ComparativeOperator__Alternatives ) )
            // InternalMSQLQueryParser.g:735:3: ( rule__ComparativeOperator__Alternatives )
            {
             before(grammarAccess.getComparativeOperatorAccess().getAlternatives()); 
            // InternalMSQLQueryParser.g:736:3: ( rule__ComparativeOperator__Alternatives )
            // InternalMSQLQueryParser.g:736:4: rule__ComparativeOperator__Alternatives
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


    // $ANTLR start "ruleAdditiveOperator"
    // InternalMSQLQueryParser.g:745:1: ruleAdditiveOperator : ( ( rule__AdditiveOperator__Alternatives ) ) ;
    public final void ruleAdditiveOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:749:1: ( ( ( rule__AdditiveOperator__Alternatives ) ) )
            // InternalMSQLQueryParser.g:750:2: ( ( rule__AdditiveOperator__Alternatives ) )
            {
            // InternalMSQLQueryParser.g:750:2: ( ( rule__AdditiveOperator__Alternatives ) )
            // InternalMSQLQueryParser.g:751:3: ( rule__AdditiveOperator__Alternatives )
            {
             before(grammarAccess.getAdditiveOperatorAccess().getAlternatives()); 
            // InternalMSQLQueryParser.g:752:3: ( rule__AdditiveOperator__Alternatives )
            // InternalMSQLQueryParser.g:752:4: rule__AdditiveOperator__Alternatives
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
    // InternalMSQLQueryParser.g:761:1: ruleMultiplicativeOperator : ( ( rule__MultiplicativeOperator__Alternatives ) ) ;
    public final void ruleMultiplicativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:765:1: ( ( ( rule__MultiplicativeOperator__Alternatives ) ) )
            // InternalMSQLQueryParser.g:766:2: ( ( rule__MultiplicativeOperator__Alternatives ) )
            {
            // InternalMSQLQueryParser.g:766:2: ( ( rule__MultiplicativeOperator__Alternatives ) )
            // InternalMSQLQueryParser.g:767:3: ( rule__MultiplicativeOperator__Alternatives )
            {
             before(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives()); 
            // InternalMSQLQueryParser.g:768:3: ( rule__MultiplicativeOperator__Alternatives )
            // InternalMSQLQueryParser.g:768:4: rule__MultiplicativeOperator__Alternatives
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


    // $ANTLR start "rule__WhatDirective__Alternatives"
    // InternalMSQLQueryParser.g:776:1: rule__WhatDirective__Alternatives : ( ( ruleAllColumnsWhatDirective ) | ( ruleSingleColumnWhatDirective ) );
    public final void rule__WhatDirective__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:780:1: ( ( ruleAllColumnsWhatDirective ) | ( ruleSingleColumnWhatDirective ) )
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
                    // InternalMSQLQueryParser.g:781:2: ( ruleAllColumnsWhatDirective )
                    {
                    // InternalMSQLQueryParser.g:781:2: ( ruleAllColumnsWhatDirective )
                    // InternalMSQLQueryParser.g:782:3: ruleAllColumnsWhatDirective
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
                    // InternalMSQLQueryParser.g:787:2: ( ruleSingleColumnWhatDirective )
                    {
                    // InternalMSQLQueryParser.g:787:2: ( ruleSingleColumnWhatDirective )
                    // InternalMSQLQueryParser.g:788:3: ruleSingleColumnWhatDirective
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


    // $ANTLR start "rule__OrderDirective__AscendingAlternatives_1_0"
    // InternalMSQLQueryParser.g:797:1: rule__OrderDirective__AscendingAlternatives_1_0 : ( ( ASC ) | ( DESC ) );
    public final void rule__OrderDirective__AscendingAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:801:1: ( ( ASC ) | ( DESC ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ASC) ) {
                alt2=1;
            }
            else if ( (LA2_0==DESC) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMSQLQueryParser.g:802:2: ( ASC )
                    {
                    // InternalMSQLQueryParser.g:802:2: ( ASC )
                    // InternalMSQLQueryParser.g:803:3: ASC
                    {
                     before(grammarAccess.getOrderDirectiveAccess().getAscendingASCKeyword_1_0_0()); 
                    match(input,ASC,FOLLOW_2); 
                     after(grammarAccess.getOrderDirectiveAccess().getAscendingASCKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:808:2: ( DESC )
                    {
                    // InternalMSQLQueryParser.g:808:2: ( DESC )
                    // InternalMSQLQueryParser.g:809:3: DESC
                    {
                     before(grammarAccess.getOrderDirectiveAccess().getAscendingDESCKeyword_1_0_1()); 
                    match(input,DESC,FOLLOW_2); 
                     after(grammarAccess.getOrderDirectiveAccess().getAscendingDESCKeyword_1_0_1()); 

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
    // $ANTLR end "rule__OrderDirective__AscendingAlternatives_1_0"


    // $ANTLR start "rule__AndOperand__Alternatives"
    // InternalMSQLQueryParser.g:818:1: rule__AndOperand__Alternatives : ( ( ruleNotExpression ) | ( ruleComparativeExpression ) );
    public final void rule__AndOperand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:822:1: ( ( ruleNotExpression ) | ( ruleComparativeExpression ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==NOT) ) {
                alt3=1;
            }
            else if ( (LA3_0==FALSE||LA3_0==TRUE||LA3_0==LeftParenthesis||(LA3_0>=RULE_ID && LA3_0<=RULE_STRING)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMSQLQueryParser.g:823:2: ( ruleNotExpression )
                    {
                    // InternalMSQLQueryParser.g:823:2: ( ruleNotExpression )
                    // InternalMSQLQueryParser.g:824:3: ruleNotExpression
                    {
                     before(grammarAccess.getAndOperandAccess().getNotExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNotExpression();

                    state._fsp--;

                     after(grammarAccess.getAndOperandAccess().getNotExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:829:2: ( ruleComparativeExpression )
                    {
                    // InternalMSQLQueryParser.g:829:2: ( ruleComparativeExpression )
                    // InternalMSQLQueryParser.g:830:3: ruleComparativeExpression
                    {
                     before(grammarAccess.getAndOperandAccess().getComparativeExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComparativeExpression();

                    state._fsp--;

                     after(grammarAccess.getAndOperandAccess().getComparativeExpressionParserRuleCall_1()); 

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
    // $ANTLR end "rule__AndOperand__Alternatives"


    // $ANTLR start "rule__AtomicExpression__Alternatives"
    // InternalMSQLQueryParser.g:839:1: rule__AtomicExpression__Alternatives : ( ( ( rule__AtomicExpression__Group_0__0 ) ) | ( ruleColumnReference ) | ( ruleLiteral ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:843:1: ( ( ( rule__AtomicExpression__Group_0__0 ) ) | ( ruleColumnReference ) | ( ruleLiteral ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case FALSE:
            case TRUE:
            case RULE_INT:
            case RULE_STRING:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMSQLQueryParser.g:844:2: ( ( rule__AtomicExpression__Group_0__0 ) )
                    {
                    // InternalMSQLQueryParser.g:844:2: ( ( rule__AtomicExpression__Group_0__0 ) )
                    // InternalMSQLQueryParser.g:845:3: ( rule__AtomicExpression__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_0()); 
                    // InternalMSQLQueryParser.g:846:3: ( rule__AtomicExpression__Group_0__0 )
                    // InternalMSQLQueryParser.g:846:4: rule__AtomicExpression__Group_0__0
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
                    // InternalMSQLQueryParser.g:850:2: ( ruleColumnReference )
                    {
                    // InternalMSQLQueryParser.g:850:2: ( ruleColumnReference )
                    // InternalMSQLQueryParser.g:851:3: ruleColumnReference
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getColumnReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleColumnReference();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpressionAccess().getColumnReferenceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMSQLQueryParser.g:856:2: ( ruleLiteral )
                    {
                    // InternalMSQLQueryParser.g:856:2: ( ruleLiteral )
                    // InternalMSQLQueryParser.g:857:3: ruleLiteral
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpressionAccess().getLiteralParserRuleCall_2()); 

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


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalMSQLQueryParser.g:866:1: rule__Literal__Alternatives : ( ( ruleStringLiteral ) | ( ruleIntegerLiteral ) | ( ruleBooleanLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:870:1: ( ( ruleStringLiteral ) | ( ruleIntegerLiteral ) | ( ruleBooleanLiteral ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
                {
                alt5=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMSQLQueryParser.g:871:2: ( ruleStringLiteral )
                    {
                    // InternalMSQLQueryParser.g:871:2: ( ruleStringLiteral )
                    // InternalMSQLQueryParser.g:872:3: ruleStringLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:877:2: ( ruleIntegerLiteral )
                    {
                    // InternalMSQLQueryParser.g:877:2: ( ruleIntegerLiteral )
                    // InternalMSQLQueryParser.g:878:3: ruleIntegerLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMSQLQueryParser.g:883:2: ( ruleBooleanLiteral )
                    {
                    // InternalMSQLQueryParser.g:883:2: ( ruleBooleanLiteral )
                    // InternalMSQLQueryParser.g:884:3: ruleBooleanLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_2()); 

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
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__BooleanLiteral__ValueAlternatives_0"
    // InternalMSQLQueryParser.g:893:1: rule__BooleanLiteral__ValueAlternatives_0 : ( ( TRUE ) | ( FALSE ) );
    public final void rule__BooleanLiteral__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:897:1: ( ( TRUE ) | ( FALSE ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==TRUE) ) {
                alt6=1;
            }
            else if ( (LA6_0==FALSE) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMSQLQueryParser.g:898:2: ( TRUE )
                    {
                    // InternalMSQLQueryParser.g:898:2: ( TRUE )
                    // InternalMSQLQueryParser.g:899:3: TRUE
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getValueTRUEKeyword_0_0()); 
                    match(input,TRUE,FOLLOW_2); 
                     after(grammarAccess.getBooleanLiteralAccess().getValueTRUEKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:904:2: ( FALSE )
                    {
                    // InternalMSQLQueryParser.g:904:2: ( FALSE )
                    // InternalMSQLQueryParser.g:905:3: FALSE
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getValueFALSEKeyword_0_1()); 
                    match(input,FALSE,FOLLOW_2); 
                     after(grammarAccess.getBooleanLiteralAccess().getValueFALSEKeyword_0_1()); 

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
    // $ANTLR end "rule__BooleanLiteral__ValueAlternatives_0"


    // $ANTLR start "rule__ComparativeOperator__Alternatives"
    // InternalMSQLQueryParser.g:914:1: rule__ComparativeOperator__Alternatives : ( ( ( LessThanSignEqualsSign ) ) | ( ( LessThanSign ) ) | ( ( EqualsSign ) ) | ( ( ExclamationMarkEqualsSign ) ) | ( ( GreaterThanSign ) ) | ( ( GreaterThanSignEqualsSign ) ) );
    public final void rule__ComparativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:918:1: ( ( ( LessThanSignEqualsSign ) ) | ( ( LessThanSign ) ) | ( ( EqualsSign ) ) | ( ( ExclamationMarkEqualsSign ) ) | ( ( GreaterThanSign ) ) | ( ( GreaterThanSignEqualsSign ) ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case LessThanSignEqualsSign:
                {
                alt7=1;
                }
                break;
            case LessThanSign:
                {
                alt7=2;
                }
                break;
            case EqualsSign:
                {
                alt7=3;
                }
                break;
            case ExclamationMarkEqualsSign:
                {
                alt7=4;
                }
                break;
            case GreaterThanSign:
                {
                alt7=5;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMSQLQueryParser.g:919:2: ( ( LessThanSignEqualsSign ) )
                    {
                    // InternalMSQLQueryParser.g:919:2: ( ( LessThanSignEqualsSign ) )
                    // InternalMSQLQueryParser.g:920:3: ( LessThanSignEqualsSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getLESS_THAN_OR_EQUALEnumLiteralDeclaration_0()); 
                    // InternalMSQLQueryParser.g:921:3: ( LessThanSignEqualsSign )
                    // InternalMSQLQueryParser.g:921:4: LessThanSignEqualsSign
                    {
                    match(input,LessThanSignEqualsSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getLESS_THAN_OR_EQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:925:2: ( ( LessThanSign ) )
                    {
                    // InternalMSQLQueryParser.g:925:2: ( ( LessThanSign ) )
                    // InternalMSQLQueryParser.g:926:3: ( LessThanSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getLESS_THANEnumLiteralDeclaration_1()); 
                    // InternalMSQLQueryParser.g:927:3: ( LessThanSign )
                    // InternalMSQLQueryParser.g:927:4: LessThanSign
                    {
                    match(input,LessThanSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getLESS_THANEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMSQLQueryParser.g:931:2: ( ( EqualsSign ) )
                    {
                    // InternalMSQLQueryParser.g:931:2: ( ( EqualsSign ) )
                    // InternalMSQLQueryParser.g:932:3: ( EqualsSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getEQUALEnumLiteralDeclaration_2()); 
                    // InternalMSQLQueryParser.g:933:3: ( EqualsSign )
                    // InternalMSQLQueryParser.g:933:4: EqualsSign
                    {
                    match(input,EqualsSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getEQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMSQLQueryParser.g:937:2: ( ( ExclamationMarkEqualsSign ) )
                    {
                    // InternalMSQLQueryParser.g:937:2: ( ( ExclamationMarkEqualsSign ) )
                    // InternalMSQLQueryParser.g:938:3: ( ExclamationMarkEqualsSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_3()); 
                    // InternalMSQLQueryParser.g:939:3: ( ExclamationMarkEqualsSign )
                    // InternalMSQLQueryParser.g:939:4: ExclamationMarkEqualsSign
                    {
                    match(input,ExclamationMarkEqualsSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMSQLQueryParser.g:943:2: ( ( GreaterThanSign ) )
                    {
                    // InternalMSQLQueryParser.g:943:2: ( ( GreaterThanSign ) )
                    // InternalMSQLQueryParser.g:944:3: ( GreaterThanSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getGREATER_THANEnumLiteralDeclaration_4()); 
                    // InternalMSQLQueryParser.g:945:3: ( GreaterThanSign )
                    // InternalMSQLQueryParser.g:945:4: GreaterThanSign
                    {
                    match(input,GreaterThanSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getGREATER_THANEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMSQLQueryParser.g:949:2: ( ( GreaterThanSignEqualsSign ) )
                    {
                    // InternalMSQLQueryParser.g:949:2: ( ( GreaterThanSignEqualsSign ) )
                    // InternalMSQLQueryParser.g:950:3: ( GreaterThanSignEqualsSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getGREATER_THAN_OR_EQUALEnumLiteralDeclaration_5()); 
                    // InternalMSQLQueryParser.g:951:3: ( GreaterThanSignEqualsSign )
                    // InternalMSQLQueryParser.g:951:4: GreaterThanSignEqualsSign
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


    // $ANTLR start "rule__AdditiveOperator__Alternatives"
    // InternalMSQLQueryParser.g:959:1: rule__AdditiveOperator__Alternatives : ( ( ( PlusSign ) ) | ( ( HyphenMinus ) ) );
    public final void rule__AdditiveOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:963:1: ( ( ( PlusSign ) ) | ( ( HyphenMinus ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==PlusSign) ) {
                alt8=1;
            }
            else if ( (LA8_0==HyphenMinus) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMSQLQueryParser.g:964:2: ( ( PlusSign ) )
                    {
                    // InternalMSQLQueryParser.g:964:2: ( ( PlusSign ) )
                    // InternalMSQLQueryParser.g:965:3: ( PlusSign )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0()); 
                    // InternalMSQLQueryParser.g:966:3: ( PlusSign )
                    // InternalMSQLQueryParser.g:966:4: PlusSign
                    {
                    match(input,PlusSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:970:2: ( ( HyphenMinus ) )
                    {
                    // InternalMSQLQueryParser.g:970:2: ( ( HyphenMinus ) )
                    // InternalMSQLQueryParser.g:971:3: ( HyphenMinus )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1()); 
                    // InternalMSQLQueryParser.g:972:3: ( HyphenMinus )
                    // InternalMSQLQueryParser.g:972:4: HyphenMinus
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
    // InternalMSQLQueryParser.g:980:1: rule__MultiplicativeOperator__Alternatives : ( ( ( Asterisk ) ) | ( ( Solidus ) ) );
    public final void rule__MultiplicativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:984:1: ( ( ( Asterisk ) ) | ( ( Solidus ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Asterisk) ) {
                alt9=1;
            }
            else if ( (LA9_0==Solidus) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMSQLQueryParser.g:985:2: ( ( Asterisk ) )
                    {
                    // InternalMSQLQueryParser.g:985:2: ( ( Asterisk ) )
                    // InternalMSQLQueryParser.g:986:3: ( Asterisk )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0()); 
                    // InternalMSQLQueryParser.g:987:3: ( Asterisk )
                    // InternalMSQLQueryParser.g:987:4: Asterisk
                    {
                    match(input,Asterisk,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:991:2: ( ( Solidus ) )
                    {
                    // InternalMSQLQueryParser.g:991:2: ( ( Solidus ) )
                    // InternalMSQLQueryParser.g:992:3: ( Solidus )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getDIVIDEEnumLiteralDeclaration_1()); 
                    // InternalMSQLQueryParser.g:993:3: ( Solidus )
                    // InternalMSQLQueryParser.g:993:4: Solidus
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


    // $ANTLR start "rule__SelectQuery__Group__0"
    // InternalMSQLQueryParser.g:1001:1: rule__SelectQuery__Group__0 : rule__SelectQuery__Group__0__Impl rule__SelectQuery__Group__1 ;
    public final void rule__SelectQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1005:1: ( rule__SelectQuery__Group__0__Impl rule__SelectQuery__Group__1 )
            // InternalMSQLQueryParser.g:1006:2: rule__SelectQuery__Group__0__Impl rule__SelectQuery__Group__1
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
    // InternalMSQLQueryParser.g:1013:1: rule__SelectQuery__Group__0__Impl : ( SELECT ) ;
    public final void rule__SelectQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1017:1: ( ( SELECT ) )
            // InternalMSQLQueryParser.g:1018:1: ( SELECT )
            {
            // InternalMSQLQueryParser.g:1018:1: ( SELECT )
            // InternalMSQLQueryParser.g:1019:2: SELECT
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
    // InternalMSQLQueryParser.g:1028:1: rule__SelectQuery__Group__1 : rule__SelectQuery__Group__1__Impl rule__SelectQuery__Group__2 ;
    public final void rule__SelectQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1032:1: ( rule__SelectQuery__Group__1__Impl rule__SelectQuery__Group__2 )
            // InternalMSQLQueryParser.g:1033:2: rule__SelectQuery__Group__1__Impl rule__SelectQuery__Group__2
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
    // InternalMSQLQueryParser.g:1040:1: rule__SelectQuery__Group__1__Impl : ( ( rule__SelectQuery__WhatClauseAssignment_1 ) ) ;
    public final void rule__SelectQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1044:1: ( ( ( rule__SelectQuery__WhatClauseAssignment_1 ) ) )
            // InternalMSQLQueryParser.g:1045:1: ( ( rule__SelectQuery__WhatClauseAssignment_1 ) )
            {
            // InternalMSQLQueryParser.g:1045:1: ( ( rule__SelectQuery__WhatClauseAssignment_1 ) )
            // InternalMSQLQueryParser.g:1046:2: ( rule__SelectQuery__WhatClauseAssignment_1 )
            {
             before(grammarAccess.getSelectQueryAccess().getWhatClauseAssignment_1()); 
            // InternalMSQLQueryParser.g:1047:2: ( rule__SelectQuery__WhatClauseAssignment_1 )
            // InternalMSQLQueryParser.g:1047:3: rule__SelectQuery__WhatClauseAssignment_1
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
    // InternalMSQLQueryParser.g:1055:1: rule__SelectQuery__Group__2 : rule__SelectQuery__Group__2__Impl rule__SelectQuery__Group__3 ;
    public final void rule__SelectQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1059:1: ( rule__SelectQuery__Group__2__Impl rule__SelectQuery__Group__3 )
            // InternalMSQLQueryParser.g:1060:2: rule__SelectQuery__Group__2__Impl rule__SelectQuery__Group__3
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
    // InternalMSQLQueryParser.g:1067:1: rule__SelectQuery__Group__2__Impl : ( ( rule__SelectQuery__FromClauseAssignment_2 ) ) ;
    public final void rule__SelectQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1071:1: ( ( ( rule__SelectQuery__FromClauseAssignment_2 ) ) )
            // InternalMSQLQueryParser.g:1072:1: ( ( rule__SelectQuery__FromClauseAssignment_2 ) )
            {
            // InternalMSQLQueryParser.g:1072:1: ( ( rule__SelectQuery__FromClauseAssignment_2 ) )
            // InternalMSQLQueryParser.g:1073:2: ( rule__SelectQuery__FromClauseAssignment_2 )
            {
             before(grammarAccess.getSelectQueryAccess().getFromClauseAssignment_2()); 
            // InternalMSQLQueryParser.g:1074:2: ( rule__SelectQuery__FromClauseAssignment_2 )
            // InternalMSQLQueryParser.g:1074:3: rule__SelectQuery__FromClauseAssignment_2
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
    // InternalMSQLQueryParser.g:1082:1: rule__SelectQuery__Group__3 : rule__SelectQuery__Group__3__Impl rule__SelectQuery__Group__4 ;
    public final void rule__SelectQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1086:1: ( rule__SelectQuery__Group__3__Impl rule__SelectQuery__Group__4 )
            // InternalMSQLQueryParser.g:1087:2: rule__SelectQuery__Group__3__Impl rule__SelectQuery__Group__4
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
    // InternalMSQLQueryParser.g:1094:1: rule__SelectQuery__Group__3__Impl : ( ( rule__SelectQuery__WhereClauseAssignment_3 )? ) ;
    public final void rule__SelectQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1098:1: ( ( ( rule__SelectQuery__WhereClauseAssignment_3 )? ) )
            // InternalMSQLQueryParser.g:1099:1: ( ( rule__SelectQuery__WhereClauseAssignment_3 )? )
            {
            // InternalMSQLQueryParser.g:1099:1: ( ( rule__SelectQuery__WhereClauseAssignment_3 )? )
            // InternalMSQLQueryParser.g:1100:2: ( rule__SelectQuery__WhereClauseAssignment_3 )?
            {
             before(grammarAccess.getSelectQueryAccess().getWhereClauseAssignment_3()); 
            // InternalMSQLQueryParser.g:1101:2: ( rule__SelectQuery__WhereClauseAssignment_3 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==WHERE) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMSQLQueryParser.g:1101:3: rule__SelectQuery__WhereClauseAssignment_3
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
    // InternalMSQLQueryParser.g:1109:1: rule__SelectQuery__Group__4 : rule__SelectQuery__Group__4__Impl rule__SelectQuery__Group__5 ;
    public final void rule__SelectQuery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1113:1: ( rule__SelectQuery__Group__4__Impl rule__SelectQuery__Group__5 )
            // InternalMSQLQueryParser.g:1114:2: rule__SelectQuery__Group__4__Impl rule__SelectQuery__Group__5
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
    // InternalMSQLQueryParser.g:1121:1: rule__SelectQuery__Group__4__Impl : ( ( rule__SelectQuery__OrderByClauseAssignment_4 )? ) ;
    public final void rule__SelectQuery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1125:1: ( ( ( rule__SelectQuery__OrderByClauseAssignment_4 )? ) )
            // InternalMSQLQueryParser.g:1126:1: ( ( rule__SelectQuery__OrderByClauseAssignment_4 )? )
            {
            // InternalMSQLQueryParser.g:1126:1: ( ( rule__SelectQuery__OrderByClauseAssignment_4 )? )
            // InternalMSQLQueryParser.g:1127:2: ( rule__SelectQuery__OrderByClauseAssignment_4 )?
            {
             before(grammarAccess.getSelectQueryAccess().getOrderByClauseAssignment_4()); 
            // InternalMSQLQueryParser.g:1128:2: ( rule__SelectQuery__OrderByClauseAssignment_4 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ORDER) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMSQLQueryParser.g:1128:3: rule__SelectQuery__OrderByClauseAssignment_4
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
    // InternalMSQLQueryParser.g:1136:1: rule__SelectQuery__Group__5 : rule__SelectQuery__Group__5__Impl ;
    public final void rule__SelectQuery__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1140:1: ( rule__SelectQuery__Group__5__Impl )
            // InternalMSQLQueryParser.g:1141:2: rule__SelectQuery__Group__5__Impl
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
    // InternalMSQLQueryParser.g:1147:1: rule__SelectQuery__Group__5__Impl : ( Semicolon ) ;
    public final void rule__SelectQuery__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1151:1: ( ( Semicolon ) )
            // InternalMSQLQueryParser.g:1152:1: ( Semicolon )
            {
            // InternalMSQLQueryParser.g:1152:1: ( Semicolon )
            // InternalMSQLQueryParser.g:1153:2: Semicolon
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
    // InternalMSQLQueryParser.g:1163:1: rule__WhatClause__Group__0 : rule__WhatClause__Group__0__Impl rule__WhatClause__Group__1 ;
    public final void rule__WhatClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1167:1: ( rule__WhatClause__Group__0__Impl rule__WhatClause__Group__1 )
            // InternalMSQLQueryParser.g:1168:2: rule__WhatClause__Group__0__Impl rule__WhatClause__Group__1
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
    // InternalMSQLQueryParser.g:1175:1: rule__WhatClause__Group__0__Impl : ( ( rule__WhatClause__WhatDirectivesAssignment_0 ) ) ;
    public final void rule__WhatClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1179:1: ( ( ( rule__WhatClause__WhatDirectivesAssignment_0 ) ) )
            // InternalMSQLQueryParser.g:1180:1: ( ( rule__WhatClause__WhatDirectivesAssignment_0 ) )
            {
            // InternalMSQLQueryParser.g:1180:1: ( ( rule__WhatClause__WhatDirectivesAssignment_0 ) )
            // InternalMSQLQueryParser.g:1181:2: ( rule__WhatClause__WhatDirectivesAssignment_0 )
            {
             before(grammarAccess.getWhatClauseAccess().getWhatDirectivesAssignment_0()); 
            // InternalMSQLQueryParser.g:1182:2: ( rule__WhatClause__WhatDirectivesAssignment_0 )
            // InternalMSQLQueryParser.g:1182:3: rule__WhatClause__WhatDirectivesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__WhatClause__WhatDirectivesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWhatClauseAccess().getWhatDirectivesAssignment_0()); 

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
    // InternalMSQLQueryParser.g:1190:1: rule__WhatClause__Group__1 : rule__WhatClause__Group__1__Impl ;
    public final void rule__WhatClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1194:1: ( rule__WhatClause__Group__1__Impl )
            // InternalMSQLQueryParser.g:1195:2: rule__WhatClause__Group__1__Impl
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
    // InternalMSQLQueryParser.g:1201:1: rule__WhatClause__Group__1__Impl : ( ( rule__WhatClause__Group_1__0 )* ) ;
    public final void rule__WhatClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1205:1: ( ( ( rule__WhatClause__Group_1__0 )* ) )
            // InternalMSQLQueryParser.g:1206:1: ( ( rule__WhatClause__Group_1__0 )* )
            {
            // InternalMSQLQueryParser.g:1206:1: ( ( rule__WhatClause__Group_1__0 )* )
            // InternalMSQLQueryParser.g:1207:2: ( rule__WhatClause__Group_1__0 )*
            {
             before(grammarAccess.getWhatClauseAccess().getGroup_1()); 
            // InternalMSQLQueryParser.g:1208:2: ( rule__WhatClause__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Comma) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:1208:3: rule__WhatClause__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__WhatClause__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalMSQLQueryParser.g:1217:1: rule__WhatClause__Group_1__0 : rule__WhatClause__Group_1__0__Impl rule__WhatClause__Group_1__1 ;
    public final void rule__WhatClause__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1221:1: ( rule__WhatClause__Group_1__0__Impl rule__WhatClause__Group_1__1 )
            // InternalMSQLQueryParser.g:1222:2: rule__WhatClause__Group_1__0__Impl rule__WhatClause__Group_1__1
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
    // InternalMSQLQueryParser.g:1229:1: rule__WhatClause__Group_1__0__Impl : ( Comma ) ;
    public final void rule__WhatClause__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1233:1: ( ( Comma ) )
            // InternalMSQLQueryParser.g:1234:1: ( Comma )
            {
            // InternalMSQLQueryParser.g:1234:1: ( Comma )
            // InternalMSQLQueryParser.g:1235:2: Comma
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
    // InternalMSQLQueryParser.g:1244:1: rule__WhatClause__Group_1__1 : rule__WhatClause__Group_1__1__Impl ;
    public final void rule__WhatClause__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1248:1: ( rule__WhatClause__Group_1__1__Impl )
            // InternalMSQLQueryParser.g:1249:2: rule__WhatClause__Group_1__1__Impl
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
    // InternalMSQLQueryParser.g:1255:1: rule__WhatClause__Group_1__1__Impl : ( ( rule__WhatClause__WhatDirectivesAssignment_1_1 ) ) ;
    public final void rule__WhatClause__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1259:1: ( ( ( rule__WhatClause__WhatDirectivesAssignment_1_1 ) ) )
            // InternalMSQLQueryParser.g:1260:1: ( ( rule__WhatClause__WhatDirectivesAssignment_1_1 ) )
            {
            // InternalMSQLQueryParser.g:1260:1: ( ( rule__WhatClause__WhatDirectivesAssignment_1_1 ) )
            // InternalMSQLQueryParser.g:1261:2: ( rule__WhatClause__WhatDirectivesAssignment_1_1 )
            {
             before(grammarAccess.getWhatClauseAccess().getWhatDirectivesAssignment_1_1()); 
            // InternalMSQLQueryParser.g:1262:2: ( rule__WhatClause__WhatDirectivesAssignment_1_1 )
            // InternalMSQLQueryParser.g:1262:3: rule__WhatClause__WhatDirectivesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__WhatClause__WhatDirectivesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getWhatClauseAccess().getWhatDirectivesAssignment_1_1()); 

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
    // InternalMSQLQueryParser.g:1271:1: rule__AllColumnsWhatDirective__Group__0 : rule__AllColumnsWhatDirective__Group__0__Impl rule__AllColumnsWhatDirective__Group__1 ;
    public final void rule__AllColumnsWhatDirective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1275:1: ( rule__AllColumnsWhatDirective__Group__0__Impl rule__AllColumnsWhatDirective__Group__1 )
            // InternalMSQLQueryParser.g:1276:2: rule__AllColumnsWhatDirective__Group__0__Impl rule__AllColumnsWhatDirective__Group__1
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
    // InternalMSQLQueryParser.g:1283:1: rule__AllColumnsWhatDirective__Group__0__Impl : ( Asterisk ) ;
    public final void rule__AllColumnsWhatDirective__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1287:1: ( ( Asterisk ) )
            // InternalMSQLQueryParser.g:1288:1: ( Asterisk )
            {
            // InternalMSQLQueryParser.g:1288:1: ( Asterisk )
            // InternalMSQLQueryParser.g:1289:2: Asterisk
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
    // InternalMSQLQueryParser.g:1298:1: rule__AllColumnsWhatDirective__Group__1 : rule__AllColumnsWhatDirective__Group__1__Impl ;
    public final void rule__AllColumnsWhatDirective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1302:1: ( rule__AllColumnsWhatDirective__Group__1__Impl )
            // InternalMSQLQueryParser.g:1303:2: rule__AllColumnsWhatDirective__Group__1__Impl
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
    // InternalMSQLQueryParser.g:1309:1: rule__AllColumnsWhatDirective__Group__1__Impl : ( () ) ;
    public final void rule__AllColumnsWhatDirective__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1313:1: ( ( () ) )
            // InternalMSQLQueryParser.g:1314:1: ( () )
            {
            // InternalMSQLQueryParser.g:1314:1: ( () )
            // InternalMSQLQueryParser.g:1315:2: ()
            {
             before(grammarAccess.getAllColumnsWhatDirectiveAccess().getAllColumnsWhatDirectiveAction_1()); 
            // InternalMSQLQueryParser.g:1316:2: ()
            // InternalMSQLQueryParser.g:1316:3: 
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
    // InternalMSQLQueryParser.g:1325:1: rule__FromClause__Group__0 : rule__FromClause__Group__0__Impl rule__FromClause__Group__1 ;
    public final void rule__FromClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1329:1: ( rule__FromClause__Group__0__Impl rule__FromClause__Group__1 )
            // InternalMSQLQueryParser.g:1330:2: rule__FromClause__Group__0__Impl rule__FromClause__Group__1
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
    // InternalMSQLQueryParser.g:1337:1: rule__FromClause__Group__0__Impl : ( FROM ) ;
    public final void rule__FromClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1341:1: ( ( FROM ) )
            // InternalMSQLQueryParser.g:1342:1: ( FROM )
            {
            // InternalMSQLQueryParser.g:1342:1: ( FROM )
            // InternalMSQLQueryParser.g:1343:2: FROM
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
    // InternalMSQLQueryParser.g:1352:1: rule__FromClause__Group__1 : rule__FromClause__Group__1__Impl ;
    public final void rule__FromClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1356:1: ( rule__FromClause__Group__1__Impl )
            // InternalMSQLQueryParser.g:1357:2: rule__FromClause__Group__1__Impl
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
    // InternalMSQLQueryParser.g:1363:1: rule__FromClause__Group__1__Impl : ( ( rule__FromClause__TableReferenceAssignment_1 ) ) ;
    public final void rule__FromClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1367:1: ( ( ( rule__FromClause__TableReferenceAssignment_1 ) ) )
            // InternalMSQLQueryParser.g:1368:1: ( ( rule__FromClause__TableReferenceAssignment_1 ) )
            {
            // InternalMSQLQueryParser.g:1368:1: ( ( rule__FromClause__TableReferenceAssignment_1 ) )
            // InternalMSQLQueryParser.g:1369:2: ( rule__FromClause__TableReferenceAssignment_1 )
            {
             before(grammarAccess.getFromClauseAccess().getTableReferenceAssignment_1()); 
            // InternalMSQLQueryParser.g:1370:2: ( rule__FromClause__TableReferenceAssignment_1 )
            // InternalMSQLQueryParser.g:1370:3: rule__FromClause__TableReferenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FromClause__TableReferenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFromClauseAccess().getTableReferenceAssignment_1()); 

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
    // InternalMSQLQueryParser.g:1379:1: rule__WhereClause__Group__0 : rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1 ;
    public final void rule__WhereClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1383:1: ( rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1 )
            // InternalMSQLQueryParser.g:1384:2: rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1
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
    // InternalMSQLQueryParser.g:1391:1: rule__WhereClause__Group__0__Impl : ( WHERE ) ;
    public final void rule__WhereClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1395:1: ( ( WHERE ) )
            // InternalMSQLQueryParser.g:1396:1: ( WHERE )
            {
            // InternalMSQLQueryParser.g:1396:1: ( WHERE )
            // InternalMSQLQueryParser.g:1397:2: WHERE
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
    // InternalMSQLQueryParser.g:1406:1: rule__WhereClause__Group__1 : rule__WhereClause__Group__1__Impl ;
    public final void rule__WhereClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1410:1: ( rule__WhereClause__Group__1__Impl )
            // InternalMSQLQueryParser.g:1411:2: rule__WhereClause__Group__1__Impl
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
    // InternalMSQLQueryParser.g:1417:1: rule__WhereClause__Group__1__Impl : ( ( rule__WhereClause__ExpressionAssignment_1 ) ) ;
    public final void rule__WhereClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1421:1: ( ( ( rule__WhereClause__ExpressionAssignment_1 ) ) )
            // InternalMSQLQueryParser.g:1422:1: ( ( rule__WhereClause__ExpressionAssignment_1 ) )
            {
            // InternalMSQLQueryParser.g:1422:1: ( ( rule__WhereClause__ExpressionAssignment_1 ) )
            // InternalMSQLQueryParser.g:1423:2: ( rule__WhereClause__ExpressionAssignment_1 )
            {
             before(grammarAccess.getWhereClauseAccess().getExpressionAssignment_1()); 
            // InternalMSQLQueryParser.g:1424:2: ( rule__WhereClause__ExpressionAssignment_1 )
            // InternalMSQLQueryParser.g:1424:3: rule__WhereClause__ExpressionAssignment_1
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


    // $ANTLR start "rule__OrderByClause__Group__0"
    // InternalMSQLQueryParser.g:1433:1: rule__OrderByClause__Group__0 : rule__OrderByClause__Group__0__Impl rule__OrderByClause__Group__1 ;
    public final void rule__OrderByClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1437:1: ( rule__OrderByClause__Group__0__Impl rule__OrderByClause__Group__1 )
            // InternalMSQLQueryParser.g:1438:2: rule__OrderByClause__Group__0__Impl rule__OrderByClause__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMSQLQueryParser.g:1445:1: rule__OrderByClause__Group__0__Impl : ( ORDER ) ;
    public final void rule__OrderByClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1449:1: ( ( ORDER ) )
            // InternalMSQLQueryParser.g:1450:1: ( ORDER )
            {
            // InternalMSQLQueryParser.g:1450:1: ( ORDER )
            // InternalMSQLQueryParser.g:1451:2: ORDER
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
    // InternalMSQLQueryParser.g:1460:1: rule__OrderByClause__Group__1 : rule__OrderByClause__Group__1__Impl rule__OrderByClause__Group__2 ;
    public final void rule__OrderByClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1464:1: ( rule__OrderByClause__Group__1__Impl rule__OrderByClause__Group__2 )
            // InternalMSQLQueryParser.g:1465:2: rule__OrderByClause__Group__1__Impl rule__OrderByClause__Group__2
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
    // InternalMSQLQueryParser.g:1472:1: rule__OrderByClause__Group__1__Impl : ( BY ) ;
    public final void rule__OrderByClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1476:1: ( ( BY ) )
            // InternalMSQLQueryParser.g:1477:1: ( BY )
            {
            // InternalMSQLQueryParser.g:1477:1: ( BY )
            // InternalMSQLQueryParser.g:1478:2: BY
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
    // InternalMSQLQueryParser.g:1487:1: rule__OrderByClause__Group__2 : rule__OrderByClause__Group__2__Impl rule__OrderByClause__Group__3 ;
    public final void rule__OrderByClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1491:1: ( rule__OrderByClause__Group__2__Impl rule__OrderByClause__Group__3 )
            // InternalMSQLQueryParser.g:1492:2: rule__OrderByClause__Group__2__Impl rule__OrderByClause__Group__3
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
    // InternalMSQLQueryParser.g:1499:1: rule__OrderByClause__Group__2__Impl : ( ( rule__OrderByClause__OrderDirectivesAssignment_2 ) ) ;
    public final void rule__OrderByClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1503:1: ( ( ( rule__OrderByClause__OrderDirectivesAssignment_2 ) ) )
            // InternalMSQLQueryParser.g:1504:1: ( ( rule__OrderByClause__OrderDirectivesAssignment_2 ) )
            {
            // InternalMSQLQueryParser.g:1504:1: ( ( rule__OrderByClause__OrderDirectivesAssignment_2 ) )
            // InternalMSQLQueryParser.g:1505:2: ( rule__OrderByClause__OrderDirectivesAssignment_2 )
            {
             before(grammarAccess.getOrderByClauseAccess().getOrderDirectivesAssignment_2()); 
            // InternalMSQLQueryParser.g:1506:2: ( rule__OrderByClause__OrderDirectivesAssignment_2 )
            // InternalMSQLQueryParser.g:1506:3: rule__OrderByClause__OrderDirectivesAssignment_2
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
    // InternalMSQLQueryParser.g:1514:1: rule__OrderByClause__Group__3 : rule__OrderByClause__Group__3__Impl ;
    public final void rule__OrderByClause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1518:1: ( rule__OrderByClause__Group__3__Impl )
            // InternalMSQLQueryParser.g:1519:2: rule__OrderByClause__Group__3__Impl
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
    // InternalMSQLQueryParser.g:1525:1: rule__OrderByClause__Group__3__Impl : ( ( rule__OrderByClause__Group_3__0 )* ) ;
    public final void rule__OrderByClause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1529:1: ( ( ( rule__OrderByClause__Group_3__0 )* ) )
            // InternalMSQLQueryParser.g:1530:1: ( ( rule__OrderByClause__Group_3__0 )* )
            {
            // InternalMSQLQueryParser.g:1530:1: ( ( rule__OrderByClause__Group_3__0 )* )
            // InternalMSQLQueryParser.g:1531:2: ( rule__OrderByClause__Group_3__0 )*
            {
             before(grammarAccess.getOrderByClauseAccess().getGroup_3()); 
            // InternalMSQLQueryParser.g:1532:2: ( rule__OrderByClause__Group_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Comma) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:1532:3: rule__OrderByClause__Group_3__0
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
    // InternalMSQLQueryParser.g:1541:1: rule__OrderByClause__Group_3__0 : rule__OrderByClause__Group_3__0__Impl rule__OrderByClause__Group_3__1 ;
    public final void rule__OrderByClause__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1545:1: ( rule__OrderByClause__Group_3__0__Impl rule__OrderByClause__Group_3__1 )
            // InternalMSQLQueryParser.g:1546:2: rule__OrderByClause__Group_3__0__Impl rule__OrderByClause__Group_3__1
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
    // InternalMSQLQueryParser.g:1553:1: rule__OrderByClause__Group_3__0__Impl : ( Comma ) ;
    public final void rule__OrderByClause__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1557:1: ( ( Comma ) )
            // InternalMSQLQueryParser.g:1558:1: ( Comma )
            {
            // InternalMSQLQueryParser.g:1558:1: ( Comma )
            // InternalMSQLQueryParser.g:1559:2: Comma
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
    // InternalMSQLQueryParser.g:1568:1: rule__OrderByClause__Group_3__1 : rule__OrderByClause__Group_3__1__Impl ;
    public final void rule__OrderByClause__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1572:1: ( rule__OrderByClause__Group_3__1__Impl )
            // InternalMSQLQueryParser.g:1573:2: rule__OrderByClause__Group_3__1__Impl
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
    // InternalMSQLQueryParser.g:1579:1: rule__OrderByClause__Group_3__1__Impl : ( ( rule__OrderByClause__OrderDirectivesAssignment_3_1 ) ) ;
    public final void rule__OrderByClause__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1583:1: ( ( ( rule__OrderByClause__OrderDirectivesAssignment_3_1 ) ) )
            // InternalMSQLQueryParser.g:1584:1: ( ( rule__OrderByClause__OrderDirectivesAssignment_3_1 ) )
            {
            // InternalMSQLQueryParser.g:1584:1: ( ( rule__OrderByClause__OrderDirectivesAssignment_3_1 ) )
            // InternalMSQLQueryParser.g:1585:2: ( rule__OrderByClause__OrderDirectivesAssignment_3_1 )
            {
             before(grammarAccess.getOrderByClauseAccess().getOrderDirectivesAssignment_3_1()); 
            // InternalMSQLQueryParser.g:1586:2: ( rule__OrderByClause__OrderDirectivesAssignment_3_1 )
            // InternalMSQLQueryParser.g:1586:3: rule__OrderByClause__OrderDirectivesAssignment_3_1
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


    // $ANTLR start "rule__OrderDirective__Group__0"
    // InternalMSQLQueryParser.g:1595:1: rule__OrderDirective__Group__0 : rule__OrderDirective__Group__0__Impl rule__OrderDirective__Group__1 ;
    public final void rule__OrderDirective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1599:1: ( rule__OrderDirective__Group__0__Impl rule__OrderDirective__Group__1 )
            // InternalMSQLQueryParser.g:1600:2: rule__OrderDirective__Group__0__Impl rule__OrderDirective__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__OrderDirective__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderDirective__Group__1();

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
    // $ANTLR end "rule__OrderDirective__Group__0"


    // $ANTLR start "rule__OrderDirective__Group__0__Impl"
    // InternalMSQLQueryParser.g:1607:1: rule__OrderDirective__Group__0__Impl : ( ( rule__OrderDirective__ColumnReferenceAssignment_0 ) ) ;
    public final void rule__OrderDirective__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1611:1: ( ( ( rule__OrderDirective__ColumnReferenceAssignment_0 ) ) )
            // InternalMSQLQueryParser.g:1612:1: ( ( rule__OrderDirective__ColumnReferenceAssignment_0 ) )
            {
            // InternalMSQLQueryParser.g:1612:1: ( ( rule__OrderDirective__ColumnReferenceAssignment_0 ) )
            // InternalMSQLQueryParser.g:1613:2: ( rule__OrderDirective__ColumnReferenceAssignment_0 )
            {
             before(grammarAccess.getOrderDirectiveAccess().getColumnReferenceAssignment_0()); 
            // InternalMSQLQueryParser.g:1614:2: ( rule__OrderDirective__ColumnReferenceAssignment_0 )
            // InternalMSQLQueryParser.g:1614:3: rule__OrderDirective__ColumnReferenceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OrderDirective__ColumnReferenceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOrderDirectiveAccess().getColumnReferenceAssignment_0()); 

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
    // $ANTLR end "rule__OrderDirective__Group__0__Impl"


    // $ANTLR start "rule__OrderDirective__Group__1"
    // InternalMSQLQueryParser.g:1622:1: rule__OrderDirective__Group__1 : rule__OrderDirective__Group__1__Impl ;
    public final void rule__OrderDirective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1626:1: ( rule__OrderDirective__Group__1__Impl )
            // InternalMSQLQueryParser.g:1627:2: rule__OrderDirective__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrderDirective__Group__1__Impl();

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
    // $ANTLR end "rule__OrderDirective__Group__1"


    // $ANTLR start "rule__OrderDirective__Group__1__Impl"
    // InternalMSQLQueryParser.g:1633:1: rule__OrderDirective__Group__1__Impl : ( ( rule__OrderDirective__AscendingAssignment_1 )? ) ;
    public final void rule__OrderDirective__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1637:1: ( ( ( rule__OrderDirective__AscendingAssignment_1 )? ) )
            // InternalMSQLQueryParser.g:1638:1: ( ( rule__OrderDirective__AscendingAssignment_1 )? )
            {
            // InternalMSQLQueryParser.g:1638:1: ( ( rule__OrderDirective__AscendingAssignment_1 )? )
            // InternalMSQLQueryParser.g:1639:2: ( rule__OrderDirective__AscendingAssignment_1 )?
            {
             before(grammarAccess.getOrderDirectiveAccess().getAscendingAssignment_1()); 
            // InternalMSQLQueryParser.g:1640:2: ( rule__OrderDirective__AscendingAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==DESC||LA14_0==ASC) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMSQLQueryParser.g:1640:3: rule__OrderDirective__AscendingAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__OrderDirective__AscendingAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderDirectiveAccess().getAscendingAssignment_1()); 

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
    // $ANTLR end "rule__OrderDirective__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // InternalMSQLQueryParser.g:1649:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1653:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalMSQLQueryParser.g:1654:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1();

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
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // InternalMSQLQueryParser.g:1661:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1665:1: ( ( ruleAndExpression ) )
            // InternalMSQLQueryParser.g:1666:1: ( ruleAndExpression )
            {
            // InternalMSQLQueryParser.g:1666:1: ( ruleAndExpression )
            // InternalMSQLQueryParser.g:1667:2: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // InternalMSQLQueryParser.g:1676:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1680:1: ( rule__OrExpression__Group__1__Impl )
            // InternalMSQLQueryParser.g:1681:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1__Impl();

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
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // InternalMSQLQueryParser.g:1687:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1691:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalMSQLQueryParser.g:1692:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalMSQLQueryParser.g:1692:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalMSQLQueryParser.g:1693:2: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // InternalMSQLQueryParser.g:1694:2: ( rule__OrExpression__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==OR) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:1694:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getOrExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__0"
    // InternalMSQLQueryParser.g:1703:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1707:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalMSQLQueryParser.g:1708:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__1();

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
    // $ANTLR end "rule__OrExpression__Group_1__0"


    // $ANTLR start "rule__OrExpression__Group_1__0__Impl"
    // InternalMSQLQueryParser.g:1715:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1719:1: ( ( () ) )
            // InternalMSQLQueryParser.g:1720:1: ( () )
            {
            // InternalMSQLQueryParser.g:1720:1: ( () )
            // InternalMSQLQueryParser.g:1721:2: ()
            {
             before(grammarAccess.getOrExpressionAccess().getBinaryLogicalExpressionExpression1Action_1_0()); 
            // InternalMSQLQueryParser.g:1722:2: ()
            // InternalMSQLQueryParser.g:1722:3: 
            {
            }

             after(grammarAccess.getOrExpressionAccess().getBinaryLogicalExpressionExpression1Action_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__1"
    // InternalMSQLQueryParser.g:1730:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1734:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // InternalMSQLQueryParser.g:1735:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__2();

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
    // $ANTLR end "rule__OrExpression__Group_1__1"


    // $ANTLR start "rule__OrExpression__Group_1__1__Impl"
    // InternalMSQLQueryParser.g:1742:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1746:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // InternalMSQLQueryParser.g:1747:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // InternalMSQLQueryParser.g:1747:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // InternalMSQLQueryParser.g:1748:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalMSQLQueryParser.g:1749:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            // InternalMSQLQueryParser.g:1749:3: rule__OrExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__OrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__2"
    // InternalMSQLQueryParser.g:1757:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1761:1: ( rule__OrExpression__Group_1__2__Impl )
            // InternalMSQLQueryParser.g:1762:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__OrExpression__Group_1__2"


    // $ANTLR start "rule__OrExpression__Group_1__2__Impl"
    // InternalMSQLQueryParser.g:1768:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__Expression2Assignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1772:1: ( ( ( rule__OrExpression__Expression2Assignment_1_2 ) ) )
            // InternalMSQLQueryParser.g:1773:1: ( ( rule__OrExpression__Expression2Assignment_1_2 ) )
            {
            // InternalMSQLQueryParser.g:1773:1: ( ( rule__OrExpression__Expression2Assignment_1_2 ) )
            // InternalMSQLQueryParser.g:1774:2: ( rule__OrExpression__Expression2Assignment_1_2 )
            {
             before(grammarAccess.getOrExpressionAccess().getExpression2Assignment_1_2()); 
            // InternalMSQLQueryParser.g:1775:2: ( rule__OrExpression__Expression2Assignment_1_2 )
            // InternalMSQLQueryParser.g:1775:3: rule__OrExpression__Expression2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Expression2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getExpression2Assignment_1_2()); 

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
    // $ANTLR end "rule__OrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // InternalMSQLQueryParser.g:1784:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1788:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalMSQLQueryParser.g:1789:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1();

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
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // InternalMSQLQueryParser.g:1796:1: rule__AndExpression__Group__0__Impl : ( ruleAndOperand ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1800:1: ( ( ruleAndOperand ) )
            // InternalMSQLQueryParser.g:1801:1: ( ruleAndOperand )
            {
            // InternalMSQLQueryParser.g:1801:1: ( ruleAndOperand )
            // InternalMSQLQueryParser.g:1802:2: ruleAndOperand
            {
             before(grammarAccess.getAndExpressionAccess().getAndOperandParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndOperand();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getAndOperandParserRuleCall_0()); 

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
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // InternalMSQLQueryParser.g:1811:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1815:1: ( rule__AndExpression__Group__1__Impl )
            // InternalMSQLQueryParser.g:1816:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1__Impl();

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
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // InternalMSQLQueryParser.g:1822:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1826:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalMSQLQueryParser.g:1827:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalMSQLQueryParser.g:1827:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalMSQLQueryParser.g:1828:2: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // InternalMSQLQueryParser.g:1829:2: ( rule__AndExpression__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==AND) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:1829:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getAndExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // InternalMSQLQueryParser.g:1838:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1842:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalMSQLQueryParser.g:1843:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__1();

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
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // InternalMSQLQueryParser.g:1850:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1854:1: ( ( () ) )
            // InternalMSQLQueryParser.g:1855:1: ( () )
            {
            // InternalMSQLQueryParser.g:1855:1: ( () )
            // InternalMSQLQueryParser.g:1856:2: ()
            {
             before(grammarAccess.getAndExpressionAccess().getBinaryLogicalExpressionExpression1Action_1_0()); 
            // InternalMSQLQueryParser.g:1857:2: ()
            // InternalMSQLQueryParser.g:1857:3: 
            {
            }

             after(grammarAccess.getAndExpressionAccess().getBinaryLogicalExpressionExpression1Action_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // InternalMSQLQueryParser.g:1865:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1869:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalMSQLQueryParser.g:1870:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2();

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
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // InternalMSQLQueryParser.g:1877:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1881:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // InternalMSQLQueryParser.g:1882:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // InternalMSQLQueryParser.g:1882:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // InternalMSQLQueryParser.g:1883:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalMSQLQueryParser.g:1884:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            // InternalMSQLQueryParser.g:1884:3: rule__AndExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__2"
    // InternalMSQLQueryParser.g:1892:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1896:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalMSQLQueryParser.g:1897:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__AndExpression__Group_1__2"


    // $ANTLR start "rule__AndExpression__Group_1__2__Impl"
    // InternalMSQLQueryParser.g:1903:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__Expression2Assignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1907:1: ( ( ( rule__AndExpression__Expression2Assignment_1_2 ) ) )
            // InternalMSQLQueryParser.g:1908:1: ( ( rule__AndExpression__Expression2Assignment_1_2 ) )
            {
            // InternalMSQLQueryParser.g:1908:1: ( ( rule__AndExpression__Expression2Assignment_1_2 ) )
            // InternalMSQLQueryParser.g:1909:2: ( rule__AndExpression__Expression2Assignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getExpression2Assignment_1_2()); 
            // InternalMSQLQueryParser.g:1910:2: ( rule__AndExpression__Expression2Assignment_1_2 )
            // InternalMSQLQueryParser.g:1910:3: rule__AndExpression__Expression2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Expression2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getExpression2Assignment_1_2()); 

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
    // $ANTLR end "rule__AndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__NotExpression__Group__0"
    // InternalMSQLQueryParser.g:1919:1: rule__NotExpression__Group__0 : rule__NotExpression__Group__0__Impl rule__NotExpression__Group__1 ;
    public final void rule__NotExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1923:1: ( rule__NotExpression__Group__0__Impl rule__NotExpression__Group__1 )
            // InternalMSQLQueryParser.g:1924:2: rule__NotExpression__Group__0__Impl rule__NotExpression__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__NotExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotExpression__Group__1();

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
    // $ANTLR end "rule__NotExpression__Group__0"


    // $ANTLR start "rule__NotExpression__Group__0__Impl"
    // InternalMSQLQueryParser.g:1931:1: rule__NotExpression__Group__0__Impl : ( ( rule__NotExpression__OperatorAssignment_0 ) ) ;
    public final void rule__NotExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1935:1: ( ( ( rule__NotExpression__OperatorAssignment_0 ) ) )
            // InternalMSQLQueryParser.g:1936:1: ( ( rule__NotExpression__OperatorAssignment_0 ) )
            {
            // InternalMSQLQueryParser.g:1936:1: ( ( rule__NotExpression__OperatorAssignment_0 ) )
            // InternalMSQLQueryParser.g:1937:2: ( rule__NotExpression__OperatorAssignment_0 )
            {
             before(grammarAccess.getNotExpressionAccess().getOperatorAssignment_0()); 
            // InternalMSQLQueryParser.g:1938:2: ( rule__NotExpression__OperatorAssignment_0 )
            // InternalMSQLQueryParser.g:1938:3: rule__NotExpression__OperatorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__OperatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNotExpressionAccess().getOperatorAssignment_0()); 

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
    // $ANTLR end "rule__NotExpression__Group__0__Impl"


    // $ANTLR start "rule__NotExpression__Group__1"
    // InternalMSQLQueryParser.g:1946:1: rule__NotExpression__Group__1 : rule__NotExpression__Group__1__Impl ;
    public final void rule__NotExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1950:1: ( rule__NotExpression__Group__1__Impl )
            // InternalMSQLQueryParser.g:1951:2: rule__NotExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__Group__1__Impl();

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
    // $ANTLR end "rule__NotExpression__Group__1"


    // $ANTLR start "rule__NotExpression__Group__1__Impl"
    // InternalMSQLQueryParser.g:1957:1: rule__NotExpression__Group__1__Impl : ( ( rule__NotExpression__ExpressionAssignment_1 ) ) ;
    public final void rule__NotExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1961:1: ( ( ( rule__NotExpression__ExpressionAssignment_1 ) ) )
            // InternalMSQLQueryParser.g:1962:1: ( ( rule__NotExpression__ExpressionAssignment_1 ) )
            {
            // InternalMSQLQueryParser.g:1962:1: ( ( rule__NotExpression__ExpressionAssignment_1 ) )
            // InternalMSQLQueryParser.g:1963:2: ( rule__NotExpression__ExpressionAssignment_1 )
            {
             before(grammarAccess.getNotExpressionAccess().getExpressionAssignment_1()); 
            // InternalMSQLQueryParser.g:1964:2: ( rule__NotExpression__ExpressionAssignment_1 )
            // InternalMSQLQueryParser.g:1964:3: rule__NotExpression__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNotExpressionAccess().getExpressionAssignment_1()); 

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
    // $ANTLR end "rule__NotExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparativeExpression__Group__0"
    // InternalMSQLQueryParser.g:1973:1: rule__ComparativeExpression__Group__0 : rule__ComparativeExpression__Group__0__Impl rule__ComparativeExpression__Group__1 ;
    public final void rule__ComparativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1977:1: ( rule__ComparativeExpression__Group__0__Impl rule__ComparativeExpression__Group__1 )
            // InternalMSQLQueryParser.g:1978:2: rule__ComparativeExpression__Group__0__Impl rule__ComparativeExpression__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMSQLQueryParser.g:1985:1: rule__ComparativeExpression__Group__0__Impl : ( ruleAdditiveExpression ) ;
    public final void rule__ComparativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1989:1: ( ( ruleAdditiveExpression ) )
            // InternalMSQLQueryParser.g:1990:1: ( ruleAdditiveExpression )
            {
            // InternalMSQLQueryParser.g:1990:1: ( ruleAdditiveExpression )
            // InternalMSQLQueryParser.g:1991:2: ruleAdditiveExpression
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
    // InternalMSQLQueryParser.g:2000:1: rule__ComparativeExpression__Group__1 : rule__ComparativeExpression__Group__1__Impl ;
    public final void rule__ComparativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2004:1: ( rule__ComparativeExpression__Group__1__Impl )
            // InternalMSQLQueryParser.g:2005:2: rule__ComparativeExpression__Group__1__Impl
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
    // InternalMSQLQueryParser.g:2011:1: rule__ComparativeExpression__Group__1__Impl : ( ( rule__ComparativeExpression__Group_1__0 )* ) ;
    public final void rule__ComparativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2015:1: ( ( ( rule__ComparativeExpression__Group_1__0 )* ) )
            // InternalMSQLQueryParser.g:2016:1: ( ( rule__ComparativeExpression__Group_1__0 )* )
            {
            // InternalMSQLQueryParser.g:2016:1: ( ( rule__ComparativeExpression__Group_1__0 )* )
            // InternalMSQLQueryParser.g:2017:2: ( rule__ComparativeExpression__Group_1__0 )*
            {
             before(grammarAccess.getComparativeExpressionAccess().getGroup_1()); 
            // InternalMSQLQueryParser.g:2018:2: ( rule__ComparativeExpression__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=ExclamationMarkEqualsSign && LA17_0<=GreaterThanSignEqualsSign)||(LA17_0>=LessThanSign && LA17_0<=GreaterThanSign)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:2018:3: rule__ComparativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ComparativeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalMSQLQueryParser.g:2027:1: rule__ComparativeExpression__Group_1__0 : rule__ComparativeExpression__Group_1__0__Impl rule__ComparativeExpression__Group_1__1 ;
    public final void rule__ComparativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2031:1: ( rule__ComparativeExpression__Group_1__0__Impl rule__ComparativeExpression__Group_1__1 )
            // InternalMSQLQueryParser.g:2032:2: rule__ComparativeExpression__Group_1__0__Impl rule__ComparativeExpression__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMSQLQueryParser.g:2039:1: rule__ComparativeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2043:1: ( ( () ) )
            // InternalMSQLQueryParser.g:2044:1: ( () )
            {
            // InternalMSQLQueryParser.g:2044:1: ( () )
            // InternalMSQLQueryParser.g:2045:2: ()
            {
             before(grammarAccess.getComparativeExpressionAccess().getComparativeExpressionExpression1Action_1_0()); 
            // InternalMSQLQueryParser.g:2046:2: ()
            // InternalMSQLQueryParser.g:2046:3: 
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
    // InternalMSQLQueryParser.g:2054:1: rule__ComparativeExpression__Group_1__1 : rule__ComparativeExpression__Group_1__1__Impl rule__ComparativeExpression__Group_1__2 ;
    public final void rule__ComparativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2058:1: ( rule__ComparativeExpression__Group_1__1__Impl rule__ComparativeExpression__Group_1__2 )
            // InternalMSQLQueryParser.g:2059:2: rule__ComparativeExpression__Group_1__1__Impl rule__ComparativeExpression__Group_1__2
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
    // InternalMSQLQueryParser.g:2066:1: rule__ComparativeExpression__Group_1__1__Impl : ( ( rule__ComparativeExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2070:1: ( ( ( rule__ComparativeExpression__OperatorAssignment_1_1 ) ) )
            // InternalMSQLQueryParser.g:2071:1: ( ( rule__ComparativeExpression__OperatorAssignment_1_1 ) )
            {
            // InternalMSQLQueryParser.g:2071:1: ( ( rule__ComparativeExpression__OperatorAssignment_1_1 ) )
            // InternalMSQLQueryParser.g:2072:2: ( rule__ComparativeExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparativeExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalMSQLQueryParser.g:2073:2: ( rule__ComparativeExpression__OperatorAssignment_1_1 )
            // InternalMSQLQueryParser.g:2073:3: rule__ComparativeExpression__OperatorAssignment_1_1
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
    // InternalMSQLQueryParser.g:2081:1: rule__ComparativeExpression__Group_1__2 : rule__ComparativeExpression__Group_1__2__Impl ;
    public final void rule__ComparativeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2085:1: ( rule__ComparativeExpression__Group_1__2__Impl )
            // InternalMSQLQueryParser.g:2086:2: rule__ComparativeExpression__Group_1__2__Impl
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
    // InternalMSQLQueryParser.g:2092:1: rule__ComparativeExpression__Group_1__2__Impl : ( ( rule__ComparativeExpression__Expression2Assignment_1_2 ) ) ;
    public final void rule__ComparativeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2096:1: ( ( ( rule__ComparativeExpression__Expression2Assignment_1_2 ) ) )
            // InternalMSQLQueryParser.g:2097:1: ( ( rule__ComparativeExpression__Expression2Assignment_1_2 ) )
            {
            // InternalMSQLQueryParser.g:2097:1: ( ( rule__ComparativeExpression__Expression2Assignment_1_2 ) )
            // InternalMSQLQueryParser.g:2098:2: ( rule__ComparativeExpression__Expression2Assignment_1_2 )
            {
             before(grammarAccess.getComparativeExpressionAccess().getExpression2Assignment_1_2()); 
            // InternalMSQLQueryParser.g:2099:2: ( rule__ComparativeExpression__Expression2Assignment_1_2 )
            // InternalMSQLQueryParser.g:2099:3: rule__ComparativeExpression__Expression2Assignment_1_2
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


    // $ANTLR start "rule__AdditiveExpression__Group__0"
    // InternalMSQLQueryParser.g:2108:1: rule__AdditiveExpression__Group__0 : rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 ;
    public final void rule__AdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2112:1: ( rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 )
            // InternalMSQLQueryParser.g:2113:2: rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMSQLQueryParser.g:2120:1: rule__AdditiveExpression__Group__0__Impl : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2124:1: ( ( ruleMultiplicativeExpression ) )
            // InternalMSQLQueryParser.g:2125:1: ( ruleMultiplicativeExpression )
            {
            // InternalMSQLQueryParser.g:2125:1: ( ruleMultiplicativeExpression )
            // InternalMSQLQueryParser.g:2126:2: ruleMultiplicativeExpression
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
    // InternalMSQLQueryParser.g:2135:1: rule__AdditiveExpression__Group__1 : rule__AdditiveExpression__Group__1__Impl ;
    public final void rule__AdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2139:1: ( rule__AdditiveExpression__Group__1__Impl )
            // InternalMSQLQueryParser.g:2140:2: rule__AdditiveExpression__Group__1__Impl
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
    // InternalMSQLQueryParser.g:2146:1: rule__AdditiveExpression__Group__1__Impl : ( ( rule__AdditiveExpression__Group_1__0 )* ) ;
    public final void rule__AdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2150:1: ( ( ( rule__AdditiveExpression__Group_1__0 )* ) )
            // InternalMSQLQueryParser.g:2151:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            {
            // InternalMSQLQueryParser.g:2151:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            // InternalMSQLQueryParser.g:2152:2: ( rule__AdditiveExpression__Group_1__0 )*
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 
            // InternalMSQLQueryParser.g:2153:2: ( rule__AdditiveExpression__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==PlusSign||LA18_0==HyphenMinus) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:2153:3: rule__AdditiveExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__AdditiveExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalMSQLQueryParser.g:2162:1: rule__AdditiveExpression__Group_1__0 : rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 ;
    public final void rule__AdditiveExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2166:1: ( rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 )
            // InternalMSQLQueryParser.g:2167:2: rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMSQLQueryParser.g:2174:1: rule__AdditiveExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditiveExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2178:1: ( ( () ) )
            // InternalMSQLQueryParser.g:2179:1: ( () )
            {
            // InternalMSQLQueryParser.g:2179:1: ( () )
            // InternalMSQLQueryParser.g:2180:2: ()
            {
             before(grammarAccess.getAdditiveExpressionAccess().getArithmeticExpressionExpression1Action_1_0()); 
            // InternalMSQLQueryParser.g:2181:2: ()
            // InternalMSQLQueryParser.g:2181:3: 
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
    // InternalMSQLQueryParser.g:2189:1: rule__AdditiveExpression__Group_1__1 : rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 ;
    public final void rule__AdditiveExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2193:1: ( rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 )
            // InternalMSQLQueryParser.g:2194:2: rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2
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
    // InternalMSQLQueryParser.g:2201:1: rule__AdditiveExpression__Group_1__1__Impl : ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2205:1: ( ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) )
            // InternalMSQLQueryParser.g:2206:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            {
            // InternalMSQLQueryParser.g:2206:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            // InternalMSQLQueryParser.g:2207:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalMSQLQueryParser.g:2208:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            // InternalMSQLQueryParser.g:2208:3: rule__AdditiveExpression__OperatorAssignment_1_1
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
    // InternalMSQLQueryParser.g:2216:1: rule__AdditiveExpression__Group_1__2 : rule__AdditiveExpression__Group_1__2__Impl ;
    public final void rule__AdditiveExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2220:1: ( rule__AdditiveExpression__Group_1__2__Impl )
            // InternalMSQLQueryParser.g:2221:2: rule__AdditiveExpression__Group_1__2__Impl
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
    // InternalMSQLQueryParser.g:2227:1: rule__AdditiveExpression__Group_1__2__Impl : ( ( rule__AdditiveExpression__Expression2Assignment_1_2 ) ) ;
    public final void rule__AdditiveExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2231:1: ( ( ( rule__AdditiveExpression__Expression2Assignment_1_2 ) ) )
            // InternalMSQLQueryParser.g:2232:1: ( ( rule__AdditiveExpression__Expression2Assignment_1_2 ) )
            {
            // InternalMSQLQueryParser.g:2232:1: ( ( rule__AdditiveExpression__Expression2Assignment_1_2 ) )
            // InternalMSQLQueryParser.g:2233:2: ( rule__AdditiveExpression__Expression2Assignment_1_2 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getExpression2Assignment_1_2()); 
            // InternalMSQLQueryParser.g:2234:2: ( rule__AdditiveExpression__Expression2Assignment_1_2 )
            // InternalMSQLQueryParser.g:2234:3: rule__AdditiveExpression__Expression2Assignment_1_2
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
    // InternalMSQLQueryParser.g:2243:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2247:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalMSQLQueryParser.g:2248:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMSQLQueryParser.g:2255:1: rule__MultiplicativeExpression__Group__0__Impl : ( ruleAtomicExpression ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2259:1: ( ( ruleAtomicExpression ) )
            // InternalMSQLQueryParser.g:2260:1: ( ruleAtomicExpression )
            {
            // InternalMSQLQueryParser.g:2260:1: ( ruleAtomicExpression )
            // InternalMSQLQueryParser.g:2261:2: ruleAtomicExpression
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
    // InternalMSQLQueryParser.g:2270:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2274:1: ( rule__MultiplicativeExpression__Group__1__Impl )
            // InternalMSQLQueryParser.g:2275:2: rule__MultiplicativeExpression__Group__1__Impl
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
    // InternalMSQLQueryParser.g:2281:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2285:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // InternalMSQLQueryParser.g:2286:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // InternalMSQLQueryParser.g:2286:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // InternalMSQLQueryParser.g:2287:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            // InternalMSQLQueryParser.g:2288:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Asterisk||LA19_0==Solidus) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:2288:3: rule__MultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__MultiplicativeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalMSQLQueryParser.g:2297:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2301:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // InternalMSQLQueryParser.g:2302:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMSQLQueryParser.g:2309:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2313:1: ( ( () ) )
            // InternalMSQLQueryParser.g:2314:1: ( () )
            {
            // InternalMSQLQueryParser.g:2314:1: ( () )
            // InternalMSQLQueryParser.g:2315:2: ()
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getArithmeticExpressionExpression1Action_1_0()); 
            // InternalMSQLQueryParser.g:2316:2: ()
            // InternalMSQLQueryParser.g:2316:3: 
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
    // InternalMSQLQueryParser.g:2324:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2328:1: ( rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 )
            // InternalMSQLQueryParser.g:2329:2: rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2
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
    // InternalMSQLQueryParser.g:2336:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2340:1: ( ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) )
            // InternalMSQLQueryParser.g:2341:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            {
            // InternalMSQLQueryParser.g:2341:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            // InternalMSQLQueryParser.g:2342:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalMSQLQueryParser.g:2343:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            // InternalMSQLQueryParser.g:2343:3: rule__MultiplicativeExpression__OperatorAssignment_1_1
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
    // InternalMSQLQueryParser.g:2351:1: rule__MultiplicativeExpression__Group_1__2 : rule__MultiplicativeExpression__Group_1__2__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2355:1: ( rule__MultiplicativeExpression__Group_1__2__Impl )
            // InternalMSQLQueryParser.g:2356:2: rule__MultiplicativeExpression__Group_1__2__Impl
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
    // InternalMSQLQueryParser.g:2362:1: rule__MultiplicativeExpression__Group_1__2__Impl : ( ( rule__MultiplicativeExpression__Expression2Assignment_1_2 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2366:1: ( ( ( rule__MultiplicativeExpression__Expression2Assignment_1_2 ) ) )
            // InternalMSQLQueryParser.g:2367:1: ( ( rule__MultiplicativeExpression__Expression2Assignment_1_2 ) )
            {
            // InternalMSQLQueryParser.g:2367:1: ( ( rule__MultiplicativeExpression__Expression2Assignment_1_2 ) )
            // InternalMSQLQueryParser.g:2368:2: ( rule__MultiplicativeExpression__Expression2Assignment_1_2 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getExpression2Assignment_1_2()); 
            // InternalMSQLQueryParser.g:2369:2: ( rule__MultiplicativeExpression__Expression2Assignment_1_2 )
            // InternalMSQLQueryParser.g:2369:3: rule__MultiplicativeExpression__Expression2Assignment_1_2
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


    // $ANTLR start "rule__AtomicExpression__Group_0__0"
    // InternalMSQLQueryParser.g:2378:1: rule__AtomicExpression__Group_0__0 : rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1 ;
    public final void rule__AtomicExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2382:1: ( rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1 )
            // InternalMSQLQueryParser.g:2383:2: rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1
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
    // InternalMSQLQueryParser.g:2390:1: rule__AtomicExpression__Group_0__0__Impl : ( LeftParenthesis ) ;
    public final void rule__AtomicExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2394:1: ( ( LeftParenthesis ) )
            // InternalMSQLQueryParser.g:2395:1: ( LeftParenthesis )
            {
            // InternalMSQLQueryParser.g:2395:1: ( LeftParenthesis )
            // InternalMSQLQueryParser.g:2396:2: LeftParenthesis
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
    // InternalMSQLQueryParser.g:2405:1: rule__AtomicExpression__Group_0__1 : rule__AtomicExpression__Group_0__1__Impl rule__AtomicExpression__Group_0__2 ;
    public final void rule__AtomicExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2409:1: ( rule__AtomicExpression__Group_0__1__Impl rule__AtomicExpression__Group_0__2 )
            // InternalMSQLQueryParser.g:2410:2: rule__AtomicExpression__Group_0__1__Impl rule__AtomicExpression__Group_0__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalMSQLQueryParser.g:2417:1: rule__AtomicExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__AtomicExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2421:1: ( ( ruleExpression ) )
            // InternalMSQLQueryParser.g:2422:1: ( ruleExpression )
            {
            // InternalMSQLQueryParser.g:2422:1: ( ruleExpression )
            // InternalMSQLQueryParser.g:2423:2: ruleExpression
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
    // InternalMSQLQueryParser.g:2432:1: rule__AtomicExpression__Group_0__2 : rule__AtomicExpression__Group_0__2__Impl ;
    public final void rule__AtomicExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2436:1: ( rule__AtomicExpression__Group_0__2__Impl )
            // InternalMSQLQueryParser.g:2437:2: rule__AtomicExpression__Group_0__2__Impl
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
    // InternalMSQLQueryParser.g:2443:1: rule__AtomicExpression__Group_0__2__Impl : ( RightParenthesis ) ;
    public final void rule__AtomicExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2447:1: ( ( RightParenthesis ) )
            // InternalMSQLQueryParser.g:2448:1: ( RightParenthesis )
            {
            // InternalMSQLQueryParser.g:2448:1: ( RightParenthesis )
            // InternalMSQLQueryParser.g:2449:2: RightParenthesis
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


    // $ANTLR start "rule__SelectQuery__WhatClauseAssignment_1"
    // InternalMSQLQueryParser.g:2459:1: rule__SelectQuery__WhatClauseAssignment_1 : ( ruleWhatClause ) ;
    public final void rule__SelectQuery__WhatClauseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2463:1: ( ( ruleWhatClause ) )
            // InternalMSQLQueryParser.g:2464:2: ( ruleWhatClause )
            {
            // InternalMSQLQueryParser.g:2464:2: ( ruleWhatClause )
            // InternalMSQLQueryParser.g:2465:3: ruleWhatClause
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
    // InternalMSQLQueryParser.g:2474:1: rule__SelectQuery__FromClauseAssignment_2 : ( ruleFromClause ) ;
    public final void rule__SelectQuery__FromClauseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2478:1: ( ( ruleFromClause ) )
            // InternalMSQLQueryParser.g:2479:2: ( ruleFromClause )
            {
            // InternalMSQLQueryParser.g:2479:2: ( ruleFromClause )
            // InternalMSQLQueryParser.g:2480:3: ruleFromClause
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
    // InternalMSQLQueryParser.g:2489:1: rule__SelectQuery__WhereClauseAssignment_3 : ( ruleWhereClause ) ;
    public final void rule__SelectQuery__WhereClauseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2493:1: ( ( ruleWhereClause ) )
            // InternalMSQLQueryParser.g:2494:2: ( ruleWhereClause )
            {
            // InternalMSQLQueryParser.g:2494:2: ( ruleWhereClause )
            // InternalMSQLQueryParser.g:2495:3: ruleWhereClause
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
    // InternalMSQLQueryParser.g:2504:1: rule__SelectQuery__OrderByClauseAssignment_4 : ( ruleOrderByClause ) ;
    public final void rule__SelectQuery__OrderByClauseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2508:1: ( ( ruleOrderByClause ) )
            // InternalMSQLQueryParser.g:2509:2: ( ruleOrderByClause )
            {
            // InternalMSQLQueryParser.g:2509:2: ( ruleOrderByClause )
            // InternalMSQLQueryParser.g:2510:3: ruleOrderByClause
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


    // $ANTLR start "rule__WhatClause__WhatDirectivesAssignment_0"
    // InternalMSQLQueryParser.g:2519:1: rule__WhatClause__WhatDirectivesAssignment_0 : ( ruleWhatDirective ) ;
    public final void rule__WhatClause__WhatDirectivesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2523:1: ( ( ruleWhatDirective ) )
            // InternalMSQLQueryParser.g:2524:2: ( ruleWhatDirective )
            {
            // InternalMSQLQueryParser.g:2524:2: ( ruleWhatDirective )
            // InternalMSQLQueryParser.g:2525:3: ruleWhatDirective
            {
             before(grammarAccess.getWhatClauseAccess().getWhatDirectivesWhatDirectiveParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleWhatDirective();

            state._fsp--;

             after(grammarAccess.getWhatClauseAccess().getWhatDirectivesWhatDirectiveParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__WhatClause__WhatDirectivesAssignment_0"


    // $ANTLR start "rule__WhatClause__WhatDirectivesAssignment_1_1"
    // InternalMSQLQueryParser.g:2534:1: rule__WhatClause__WhatDirectivesAssignment_1_1 : ( ruleWhatDirective ) ;
    public final void rule__WhatClause__WhatDirectivesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2538:1: ( ( ruleWhatDirective ) )
            // InternalMSQLQueryParser.g:2539:2: ( ruleWhatDirective )
            {
            // InternalMSQLQueryParser.g:2539:2: ( ruleWhatDirective )
            // InternalMSQLQueryParser.g:2540:3: ruleWhatDirective
            {
             before(grammarAccess.getWhatClauseAccess().getWhatDirectivesWhatDirectiveParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWhatDirective();

            state._fsp--;

             after(grammarAccess.getWhatClauseAccess().getWhatDirectivesWhatDirectiveParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__WhatClause__WhatDirectivesAssignment_1_1"


    // $ANTLR start "rule__SingleColumnWhatDirective__ColumnReferenceAssignment"
    // InternalMSQLQueryParser.g:2549:1: rule__SingleColumnWhatDirective__ColumnReferenceAssignment : ( ruleColumnReference ) ;
    public final void rule__SingleColumnWhatDirective__ColumnReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2553:1: ( ( ruleColumnReference ) )
            // InternalMSQLQueryParser.g:2554:2: ( ruleColumnReference )
            {
            // InternalMSQLQueryParser.g:2554:2: ( ruleColumnReference )
            // InternalMSQLQueryParser.g:2555:3: ruleColumnReference
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


    // $ANTLR start "rule__FromClause__TableReferenceAssignment_1"
    // InternalMSQLQueryParser.g:2564:1: rule__FromClause__TableReferenceAssignment_1 : ( ruleTableReference ) ;
    public final void rule__FromClause__TableReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2568:1: ( ( ruleTableReference ) )
            // InternalMSQLQueryParser.g:2569:2: ( ruleTableReference )
            {
            // InternalMSQLQueryParser.g:2569:2: ( ruleTableReference )
            // InternalMSQLQueryParser.g:2570:3: ruleTableReference
            {
             before(grammarAccess.getFromClauseAccess().getTableReferenceTableReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTableReference();

            state._fsp--;

             after(grammarAccess.getFromClauseAccess().getTableReferenceTableReferenceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FromClause__TableReferenceAssignment_1"


    // $ANTLR start "rule__WhereClause__ExpressionAssignment_1"
    // InternalMSQLQueryParser.g:2579:1: rule__WhereClause__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__WhereClause__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2583:1: ( ( ruleExpression ) )
            // InternalMSQLQueryParser.g:2584:2: ( ruleExpression )
            {
            // InternalMSQLQueryParser.g:2584:2: ( ruleExpression )
            // InternalMSQLQueryParser.g:2585:3: ruleExpression
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


    // $ANTLR start "rule__OrderByClause__OrderDirectivesAssignment_2"
    // InternalMSQLQueryParser.g:2594:1: rule__OrderByClause__OrderDirectivesAssignment_2 : ( ruleOrderDirective ) ;
    public final void rule__OrderByClause__OrderDirectivesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2598:1: ( ( ruleOrderDirective ) )
            // InternalMSQLQueryParser.g:2599:2: ( ruleOrderDirective )
            {
            // InternalMSQLQueryParser.g:2599:2: ( ruleOrderDirective )
            // InternalMSQLQueryParser.g:2600:3: ruleOrderDirective
            {
             before(grammarAccess.getOrderByClauseAccess().getOrderDirectivesOrderDirectiveParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOrderDirective();

            state._fsp--;

             after(grammarAccess.getOrderByClauseAccess().getOrderDirectivesOrderDirectiveParserRuleCall_2_0()); 

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
    // InternalMSQLQueryParser.g:2609:1: rule__OrderByClause__OrderDirectivesAssignment_3_1 : ( ruleOrderDirective ) ;
    public final void rule__OrderByClause__OrderDirectivesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2613:1: ( ( ruleOrderDirective ) )
            // InternalMSQLQueryParser.g:2614:2: ( ruleOrderDirective )
            {
            // InternalMSQLQueryParser.g:2614:2: ( ruleOrderDirective )
            // InternalMSQLQueryParser.g:2615:3: ruleOrderDirective
            {
             before(grammarAccess.getOrderByClauseAccess().getOrderDirectivesOrderDirectiveParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrderDirective();

            state._fsp--;

             after(grammarAccess.getOrderByClauseAccess().getOrderDirectivesOrderDirectiveParserRuleCall_3_1_0()); 

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


    // $ANTLR start "rule__OrderDirective__ColumnReferenceAssignment_0"
    // InternalMSQLQueryParser.g:2624:1: rule__OrderDirective__ColumnReferenceAssignment_0 : ( ruleColumnReference ) ;
    public final void rule__OrderDirective__ColumnReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2628:1: ( ( ruleColumnReference ) )
            // InternalMSQLQueryParser.g:2629:2: ( ruleColumnReference )
            {
            // InternalMSQLQueryParser.g:2629:2: ( ruleColumnReference )
            // InternalMSQLQueryParser.g:2630:3: ruleColumnReference
            {
             before(grammarAccess.getOrderDirectiveAccess().getColumnReferenceColumnReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnReference();

            state._fsp--;

             after(grammarAccess.getOrderDirectiveAccess().getColumnReferenceColumnReferenceParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__OrderDirective__ColumnReferenceAssignment_0"


    // $ANTLR start "rule__OrderDirective__AscendingAssignment_1"
    // InternalMSQLQueryParser.g:2639:1: rule__OrderDirective__AscendingAssignment_1 : ( ( rule__OrderDirective__AscendingAlternatives_1_0 ) ) ;
    public final void rule__OrderDirective__AscendingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2643:1: ( ( ( rule__OrderDirective__AscendingAlternatives_1_0 ) ) )
            // InternalMSQLQueryParser.g:2644:2: ( ( rule__OrderDirective__AscendingAlternatives_1_0 ) )
            {
            // InternalMSQLQueryParser.g:2644:2: ( ( rule__OrderDirective__AscendingAlternatives_1_0 ) )
            // InternalMSQLQueryParser.g:2645:3: ( rule__OrderDirective__AscendingAlternatives_1_0 )
            {
             before(grammarAccess.getOrderDirectiveAccess().getAscendingAlternatives_1_0()); 
            // InternalMSQLQueryParser.g:2646:3: ( rule__OrderDirective__AscendingAlternatives_1_0 )
            // InternalMSQLQueryParser.g:2646:4: rule__OrderDirective__AscendingAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__OrderDirective__AscendingAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getOrderDirectiveAccess().getAscendingAlternatives_1_0()); 

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
    // $ANTLR end "rule__OrderDirective__AscendingAssignment_1"


    // $ANTLR start "rule__OrExpression__OperatorAssignment_1_1"
    // InternalMSQLQueryParser.g:2654:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperator ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2658:1: ( ( ruleOrOperator ) )
            // InternalMSQLQueryParser.g:2659:2: ( ruleOrOperator )
            {
            // InternalMSQLQueryParser.g:2659:2: ( ruleOrOperator )
            // InternalMSQLQueryParser.g:2660:3: ruleOrOperator
            {
             before(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrOperator();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__OrExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__OrExpression__Expression2Assignment_1_2"
    // InternalMSQLQueryParser.g:2669:1: rule__OrExpression__Expression2Assignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Expression2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2673:1: ( ( ruleAndExpression ) )
            // InternalMSQLQueryParser.g:2674:2: ( ruleAndExpression )
            {
            // InternalMSQLQueryParser.g:2674:2: ( ruleAndExpression )
            // InternalMSQLQueryParser.g:2675:3: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getExpression2AndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getExpression2AndExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__OrExpression__Expression2Assignment_1_2"


    // $ANTLR start "rule__AndExpression__OperatorAssignment_1_1"
    // InternalMSQLQueryParser.g:2684:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperator ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2688:1: ( ( ruleAndOperator ) )
            // InternalMSQLQueryParser.g:2689:2: ( ruleAndOperator )
            {
            // InternalMSQLQueryParser.g:2689:2: ( ruleAndOperator )
            // InternalMSQLQueryParser.g:2690:3: ruleAndOperator
            {
             before(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAndOperator();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__AndExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__AndExpression__Expression2Assignment_1_2"
    // InternalMSQLQueryParser.g:2699:1: rule__AndExpression__Expression2Assignment_1_2 : ( ruleAndOperand ) ;
    public final void rule__AndExpression__Expression2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2703:1: ( ( ruleAndOperand ) )
            // InternalMSQLQueryParser.g:2704:2: ( ruleAndOperand )
            {
            // InternalMSQLQueryParser.g:2704:2: ( ruleAndOperand )
            // InternalMSQLQueryParser.g:2705:3: ruleAndOperand
            {
             before(grammarAccess.getAndExpressionAccess().getExpression2AndOperandParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndOperand();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getExpression2AndOperandParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__AndExpression__Expression2Assignment_1_2"


    // $ANTLR start "rule__NotExpression__OperatorAssignment_0"
    // InternalMSQLQueryParser.g:2714:1: rule__NotExpression__OperatorAssignment_0 : ( ruleNotOperator ) ;
    public final void rule__NotExpression__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2718:1: ( ( ruleNotOperator ) )
            // InternalMSQLQueryParser.g:2719:2: ( ruleNotOperator )
            {
            // InternalMSQLQueryParser.g:2719:2: ( ruleNotOperator )
            // InternalMSQLQueryParser.g:2720:3: ruleNotOperator
            {
             before(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNotOperator();

            state._fsp--;

             after(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__NotExpression__OperatorAssignment_0"


    // $ANTLR start "rule__NotExpression__ExpressionAssignment_1"
    // InternalMSQLQueryParser.g:2729:1: rule__NotExpression__ExpressionAssignment_1 : ( ruleComparativeExpression ) ;
    public final void rule__NotExpression__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2733:1: ( ( ruleComparativeExpression ) )
            // InternalMSQLQueryParser.g:2734:2: ( ruleComparativeExpression )
            {
            // InternalMSQLQueryParser.g:2734:2: ( ruleComparativeExpression )
            // InternalMSQLQueryParser.g:2735:3: ruleComparativeExpression
            {
             before(grammarAccess.getNotExpressionAccess().getExpressionComparativeExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComparativeExpression();

            state._fsp--;

             after(grammarAccess.getNotExpressionAccess().getExpressionComparativeExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NotExpression__ExpressionAssignment_1"


    // $ANTLR start "rule__ComparativeExpression__OperatorAssignment_1_1"
    // InternalMSQLQueryParser.g:2744:1: rule__ComparativeExpression__OperatorAssignment_1_1 : ( ruleComparativeOperator ) ;
    public final void rule__ComparativeExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2748:1: ( ( ruleComparativeOperator ) )
            // InternalMSQLQueryParser.g:2749:2: ( ruleComparativeOperator )
            {
            // InternalMSQLQueryParser.g:2749:2: ( ruleComparativeOperator )
            // InternalMSQLQueryParser.g:2750:3: ruleComparativeOperator
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
    // InternalMSQLQueryParser.g:2759:1: rule__ComparativeExpression__Expression2Assignment_1_2 : ( ruleAdditiveExpression ) ;
    public final void rule__ComparativeExpression__Expression2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2763:1: ( ( ruleAdditiveExpression ) )
            // InternalMSQLQueryParser.g:2764:2: ( ruleAdditiveExpression )
            {
            // InternalMSQLQueryParser.g:2764:2: ( ruleAdditiveExpression )
            // InternalMSQLQueryParser.g:2765:3: ruleAdditiveExpression
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


    // $ANTLR start "rule__AdditiveExpression__OperatorAssignment_1_1"
    // InternalMSQLQueryParser.g:2774:1: rule__AdditiveExpression__OperatorAssignment_1_1 : ( ruleAdditiveOperator ) ;
    public final void rule__AdditiveExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2778:1: ( ( ruleAdditiveOperator ) )
            // InternalMSQLQueryParser.g:2779:2: ( ruleAdditiveOperator )
            {
            // InternalMSQLQueryParser.g:2779:2: ( ruleAdditiveOperator )
            // InternalMSQLQueryParser.g:2780:3: ruleAdditiveOperator
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
    // InternalMSQLQueryParser.g:2789:1: rule__AdditiveExpression__Expression2Assignment_1_2 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__Expression2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2793:1: ( ( ruleMultiplicativeExpression ) )
            // InternalMSQLQueryParser.g:2794:2: ( ruleMultiplicativeExpression )
            {
            // InternalMSQLQueryParser.g:2794:2: ( ruleMultiplicativeExpression )
            // InternalMSQLQueryParser.g:2795:3: ruleMultiplicativeExpression
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
    // InternalMSQLQueryParser.g:2804:1: rule__MultiplicativeExpression__OperatorAssignment_1_1 : ( ruleMultiplicativeOperator ) ;
    public final void rule__MultiplicativeExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2808:1: ( ( ruleMultiplicativeOperator ) )
            // InternalMSQLQueryParser.g:2809:2: ( ruleMultiplicativeOperator )
            {
            // InternalMSQLQueryParser.g:2809:2: ( ruleMultiplicativeOperator )
            // InternalMSQLQueryParser.g:2810:3: ruleMultiplicativeOperator
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
    // InternalMSQLQueryParser.g:2819:1: rule__MultiplicativeExpression__Expression2Assignment_1_2 : ( ruleAtomicExpression ) ;
    public final void rule__MultiplicativeExpression__Expression2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2823:1: ( ( ruleAtomicExpression ) )
            // InternalMSQLQueryParser.g:2824:2: ( ruleAtomicExpression )
            {
            // InternalMSQLQueryParser.g:2824:2: ( ruleAtomicExpression )
            // InternalMSQLQueryParser.g:2825:3: ruleAtomicExpression
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


    // $ANTLR start "rule__TableReference__TableAssignment"
    // InternalMSQLQueryParser.g:2834:1: rule__TableReference__TableAssignment : ( ( RULE_ID ) ) ;
    public final void rule__TableReference__TableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2838:1: ( ( ( RULE_ID ) ) )
            // InternalMSQLQueryParser.g:2839:2: ( ( RULE_ID ) )
            {
            // InternalMSQLQueryParser.g:2839:2: ( ( RULE_ID ) )
            // InternalMSQLQueryParser.g:2840:3: ( RULE_ID )
            {
             before(grammarAccess.getTableReferenceAccess().getTableTableCrossReference_0()); 
            // InternalMSQLQueryParser.g:2841:3: ( RULE_ID )
            // InternalMSQLQueryParser.g:2842:4: RULE_ID
            {
             before(grammarAccess.getTableReferenceAccess().getTableTableIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTableReferenceAccess().getTableTableIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getTableReferenceAccess().getTableTableCrossReference_0()); 

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
    // $ANTLR end "rule__TableReference__TableAssignment"


    // $ANTLR start "rule__ColumnReference__ColumnAssignment"
    // InternalMSQLQueryParser.g:2853:1: rule__ColumnReference__ColumnAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ColumnReference__ColumnAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2857:1: ( ( ( RULE_ID ) ) )
            // InternalMSQLQueryParser.g:2858:2: ( ( RULE_ID ) )
            {
            // InternalMSQLQueryParser.g:2858:2: ( ( RULE_ID ) )
            // InternalMSQLQueryParser.g:2859:3: ( RULE_ID )
            {
             before(grammarAccess.getColumnReferenceAccess().getColumnColumnCrossReference_0()); 
            // InternalMSQLQueryParser.g:2860:3: ( RULE_ID )
            // InternalMSQLQueryParser.g:2861:4: RULE_ID
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


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // InternalMSQLQueryParser.g:2872:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2876:1: ( ( RULE_STRING ) )
            // InternalMSQLQueryParser.g:2877:2: ( RULE_STRING )
            {
            // InternalMSQLQueryParser.g:2877:2: ( RULE_STRING )
            // InternalMSQLQueryParser.g:2878:3: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__StringLiteral__ValueAssignment"


    // $ANTLR start "rule__IntegerLiteral__ValueAssignment"
    // InternalMSQLQueryParser.g:2887:1: rule__IntegerLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntegerLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2891:1: ( ( RULE_INT ) )
            // InternalMSQLQueryParser.g:2892:2: ( RULE_INT )
            {
            // InternalMSQLQueryParser.g:2892:2: ( RULE_INT )
            // InternalMSQLQueryParser.g:2893:3: RULE_INT
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


    // $ANTLR start "rule__BooleanLiteral__ValueAssignment"
    // InternalMSQLQueryParser.g:2902:1: rule__BooleanLiteral__ValueAssignment : ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2906:1: ( ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) )
            // InternalMSQLQueryParser.g:2907:2: ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
            {
            // InternalMSQLQueryParser.g:2907:2: ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
            // InternalMSQLQueryParser.g:2908:3: ( rule__BooleanLiteral__ValueAlternatives_0 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_0()); 
            // InternalMSQLQueryParser.g:2909:3: ( rule__BooleanLiteral__ValueAlternatives_0 )
            // InternalMSQLQueryParser.g:2909:4: rule__BooleanLiteral__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_0()); 

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
    // $ANTLR end "rule__BooleanLiteral__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000040000C0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000001C0282420L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000003801C000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000003801C002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001400002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002200002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000100000L});

}