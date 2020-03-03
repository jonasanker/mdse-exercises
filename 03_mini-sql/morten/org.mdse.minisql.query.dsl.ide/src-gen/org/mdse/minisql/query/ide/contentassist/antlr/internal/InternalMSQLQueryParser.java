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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SELECT", "ORDER", "WHERE", "DESC", "FROM", "ASC", "ExclamationMarkEqualsSign", "LessThanSignEqualsSign", "GreaterThanSignEqualsSign", "BY", "Asterisk", "Comma", "Semicolon", "LessThanSign", "EqualsSign", "GreaterThanSign", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_STRING=22;
    public static final int FROM=8;
    public static final int DESC=7;
    public static final int LessThanSign=17;
    public static final int RULE_SL_COMMENT=24;
    public static final int ORDER=5;
    public static final int ASC=9;
    public static final int Comma=15;
    public static final int EqualsSign=18;
    public static final int BY=13;
    public static final int LessThanSignEqualsSign=11;
    public static final int EOF=-1;
    public static final int Asterisk=14;
    public static final int GreaterThanSign=19;
    public static final int RULE_ID=20;
    public static final int RULE_WS=25;
    public static final int RULE_ANY_OTHER=26;
    public static final int WHERE=6;
    public static final int SELECT=4;
    public static final int GreaterThanSignEqualsSign=12;
    public static final int Semicolon=16;
    public static final int RULE_INT=21;
    public static final int RULE_ML_COMMENT=23;
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
    		tokenNameToValue.put("Asterisk", "'*'");
    		tokenNameToValue.put("Comma", "','");
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
    // InternalMSQLQueryParser.g:71:1: entryRuleSelectQuery : ruleSelectQuery EOF ;
    public final void entryRuleSelectQuery() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:72:1: ( ruleSelectQuery EOF )
            // InternalMSQLQueryParser.g:73:1: ruleSelectQuery EOF
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
    // InternalMSQLQueryParser.g:80:1: ruleSelectQuery : ( ( rule__SelectQuery__Group__0 ) ) ;
    public final void ruleSelectQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:84:2: ( ( ( rule__SelectQuery__Group__0 ) ) )
            // InternalMSQLQueryParser.g:85:2: ( ( rule__SelectQuery__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:85:2: ( ( rule__SelectQuery__Group__0 ) )
            // InternalMSQLQueryParser.g:86:3: ( rule__SelectQuery__Group__0 )
            {
             before(grammarAccess.getSelectQueryAccess().getGroup()); 
            // InternalMSQLQueryParser.g:87:3: ( rule__SelectQuery__Group__0 )
            // InternalMSQLQueryParser.g:87:4: rule__SelectQuery__Group__0
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
    // InternalMSQLQueryParser.g:96:1: entryRuleWhatClause : ruleWhatClause EOF ;
    public final void entryRuleWhatClause() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:97:1: ( ruleWhatClause EOF )
            // InternalMSQLQueryParser.g:98:1: ruleWhatClause EOF
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
    // InternalMSQLQueryParser.g:105:1: ruleWhatClause : ( ( rule__WhatClause__Group__0 ) ) ;
    public final void ruleWhatClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:109:2: ( ( ( rule__WhatClause__Group__0 ) ) )
            // InternalMSQLQueryParser.g:110:2: ( ( rule__WhatClause__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:110:2: ( ( rule__WhatClause__Group__0 ) )
            // InternalMSQLQueryParser.g:111:3: ( rule__WhatClause__Group__0 )
            {
             before(grammarAccess.getWhatClauseAccess().getGroup()); 
            // InternalMSQLQueryParser.g:112:3: ( rule__WhatClause__Group__0 )
            // InternalMSQLQueryParser.g:112:4: rule__WhatClause__Group__0
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
    // InternalMSQLQueryParser.g:121:1: entryRuleWhatDirective : ruleWhatDirective EOF ;
    public final void entryRuleWhatDirective() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:122:1: ( ruleWhatDirective EOF )
            // InternalMSQLQueryParser.g:123:1: ruleWhatDirective EOF
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
    // InternalMSQLQueryParser.g:130:1: ruleWhatDirective : ( ( rule__WhatDirective__Alternatives ) ) ;
    public final void ruleWhatDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:134:2: ( ( ( rule__WhatDirective__Alternatives ) ) )
            // InternalMSQLQueryParser.g:135:2: ( ( rule__WhatDirective__Alternatives ) )
            {
            // InternalMSQLQueryParser.g:135:2: ( ( rule__WhatDirective__Alternatives ) )
            // InternalMSQLQueryParser.g:136:3: ( rule__WhatDirective__Alternatives )
            {
             before(grammarAccess.getWhatDirectiveAccess().getAlternatives()); 
            // InternalMSQLQueryParser.g:137:3: ( rule__WhatDirective__Alternatives )
            // InternalMSQLQueryParser.g:137:4: rule__WhatDirective__Alternatives
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
    // InternalMSQLQueryParser.g:146:1: entryRuleAllColumnsWhatDirective : ruleAllColumnsWhatDirective EOF ;
    public final void entryRuleAllColumnsWhatDirective() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:147:1: ( ruleAllColumnsWhatDirective EOF )
            // InternalMSQLQueryParser.g:148:1: ruleAllColumnsWhatDirective EOF
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
    // InternalMSQLQueryParser.g:155:1: ruleAllColumnsWhatDirective : ( ( rule__AllColumnsWhatDirective__Group__0 ) ) ;
    public final void ruleAllColumnsWhatDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:159:2: ( ( ( rule__AllColumnsWhatDirective__Group__0 ) ) )
            // InternalMSQLQueryParser.g:160:2: ( ( rule__AllColumnsWhatDirective__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:160:2: ( ( rule__AllColumnsWhatDirective__Group__0 ) )
            // InternalMSQLQueryParser.g:161:3: ( rule__AllColumnsWhatDirective__Group__0 )
            {
             before(grammarAccess.getAllColumnsWhatDirectiveAccess().getGroup()); 
            // InternalMSQLQueryParser.g:162:3: ( rule__AllColumnsWhatDirective__Group__0 )
            // InternalMSQLQueryParser.g:162:4: rule__AllColumnsWhatDirective__Group__0
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
    // InternalMSQLQueryParser.g:171:1: entryRuleSingleColumnWhatDirective : ruleSingleColumnWhatDirective EOF ;
    public final void entryRuleSingleColumnWhatDirective() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:172:1: ( ruleSingleColumnWhatDirective EOF )
            // InternalMSQLQueryParser.g:173:1: ruleSingleColumnWhatDirective EOF
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
    // InternalMSQLQueryParser.g:180:1: ruleSingleColumnWhatDirective : ( ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment ) ) ;
    public final void ruleSingleColumnWhatDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:184:2: ( ( ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment ) ) )
            // InternalMSQLQueryParser.g:185:2: ( ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment ) )
            {
            // InternalMSQLQueryParser.g:185:2: ( ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment ) )
            // InternalMSQLQueryParser.g:186:3: ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment )
            {
             before(grammarAccess.getSingleColumnWhatDirectiveAccess().getColumnReferenceAssignment()); 
            // InternalMSQLQueryParser.g:187:3: ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment )
            // InternalMSQLQueryParser.g:187:4: rule__SingleColumnWhatDirective__ColumnReferenceAssignment
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
    // InternalMSQLQueryParser.g:196:1: entryRuleFromClause : ruleFromClause EOF ;
    public final void entryRuleFromClause() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:197:1: ( ruleFromClause EOF )
            // InternalMSQLQueryParser.g:198:1: ruleFromClause EOF
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
    // InternalMSQLQueryParser.g:205:1: ruleFromClause : ( ( rule__FromClause__Group__0 ) ) ;
    public final void ruleFromClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:209:2: ( ( ( rule__FromClause__Group__0 ) ) )
            // InternalMSQLQueryParser.g:210:2: ( ( rule__FromClause__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:210:2: ( ( rule__FromClause__Group__0 ) )
            // InternalMSQLQueryParser.g:211:3: ( rule__FromClause__Group__0 )
            {
             before(grammarAccess.getFromClauseAccess().getGroup()); 
            // InternalMSQLQueryParser.g:212:3: ( rule__FromClause__Group__0 )
            // InternalMSQLQueryParser.g:212:4: rule__FromClause__Group__0
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
    // InternalMSQLQueryParser.g:221:1: entryRuleWhereClause : ruleWhereClause EOF ;
    public final void entryRuleWhereClause() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:222:1: ( ruleWhereClause EOF )
            // InternalMSQLQueryParser.g:223:1: ruleWhereClause EOF
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
    // InternalMSQLQueryParser.g:230:1: ruleWhereClause : ( ( rule__WhereClause__Group__0 ) ) ;
    public final void ruleWhereClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:234:2: ( ( ( rule__WhereClause__Group__0 ) ) )
            // InternalMSQLQueryParser.g:235:2: ( ( rule__WhereClause__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:235:2: ( ( rule__WhereClause__Group__0 ) )
            // InternalMSQLQueryParser.g:236:3: ( rule__WhereClause__Group__0 )
            {
             before(grammarAccess.getWhereClauseAccess().getGroup()); 
            // InternalMSQLQueryParser.g:237:3: ( rule__WhereClause__Group__0 )
            // InternalMSQLQueryParser.g:237:4: rule__WhereClause__Group__0
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
    // InternalMSQLQueryParser.g:246:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:247:1: ( ruleExpression EOF )
            // InternalMSQLQueryParser.g:248:1: ruleExpression EOF
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
    // InternalMSQLQueryParser.g:255:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:259:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalMSQLQueryParser.g:260:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalMSQLQueryParser.g:260:2: ( ( rule__Expression__Alternatives ) )
            // InternalMSQLQueryParser.g:261:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalMSQLQueryParser.g:262:3: ( rule__Expression__Alternatives )
            // InternalMSQLQueryParser.g:262:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleComparativeExpression"
    // InternalMSQLQueryParser.g:271:1: entryRuleComparativeExpression : ruleComparativeExpression EOF ;
    public final void entryRuleComparativeExpression() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:272:1: ( ruleComparativeExpression EOF )
            // InternalMSQLQueryParser.g:273:1: ruleComparativeExpression EOF
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
    // InternalMSQLQueryParser.g:280:1: ruleComparativeExpression : ( ( rule__ComparativeExpression__Group__0 ) ) ;
    public final void ruleComparativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:284:2: ( ( ( rule__ComparativeExpression__Group__0 ) ) )
            // InternalMSQLQueryParser.g:285:2: ( ( rule__ComparativeExpression__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:285:2: ( ( rule__ComparativeExpression__Group__0 ) )
            // InternalMSQLQueryParser.g:286:3: ( rule__ComparativeExpression__Group__0 )
            {
             before(grammarAccess.getComparativeExpressionAccess().getGroup()); 
            // InternalMSQLQueryParser.g:287:3: ( rule__ComparativeExpression__Group__0 )
            // InternalMSQLQueryParser.g:287:4: rule__ComparativeExpression__Group__0
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
    // InternalMSQLQueryParser.g:296:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:297:1: ( ruleAtomicExpression EOF )
            // InternalMSQLQueryParser.g:298:1: ruleAtomicExpression EOF
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
    // InternalMSQLQueryParser.g:305:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Alternatives ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:309:2: ( ( ( rule__AtomicExpression__Alternatives ) ) )
            // InternalMSQLQueryParser.g:310:2: ( ( rule__AtomicExpression__Alternatives ) )
            {
            // InternalMSQLQueryParser.g:310:2: ( ( rule__AtomicExpression__Alternatives ) )
            // InternalMSQLQueryParser.g:311:3: ( rule__AtomicExpression__Alternatives )
            {
             before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            // InternalMSQLQueryParser.g:312:3: ( rule__AtomicExpression__Alternatives )
            // InternalMSQLQueryParser.g:312:4: rule__AtomicExpression__Alternatives
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
    // InternalMSQLQueryParser.g:321:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:322:1: ( ruleIntegerLiteral EOF )
            // InternalMSQLQueryParser.g:323:1: ruleIntegerLiteral EOF
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
    // InternalMSQLQueryParser.g:330:1: ruleIntegerLiteral : ( ( rule__IntegerLiteral__ValueAssignment ) ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:334:2: ( ( ( rule__IntegerLiteral__ValueAssignment ) ) )
            // InternalMSQLQueryParser.g:335:2: ( ( rule__IntegerLiteral__ValueAssignment ) )
            {
            // InternalMSQLQueryParser.g:335:2: ( ( rule__IntegerLiteral__ValueAssignment ) )
            // InternalMSQLQueryParser.g:336:3: ( rule__IntegerLiteral__ValueAssignment )
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); 
            // InternalMSQLQueryParser.g:337:3: ( rule__IntegerLiteral__ValueAssignment )
            // InternalMSQLQueryParser.g:337:4: rule__IntegerLiteral__ValueAssignment
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
    // InternalMSQLQueryParser.g:346:1: entryRuleOrderByClause : ruleOrderByClause EOF ;
    public final void entryRuleOrderByClause() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:347:1: ( ruleOrderByClause EOF )
            // InternalMSQLQueryParser.g:348:1: ruleOrderByClause EOF
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
    // InternalMSQLQueryParser.g:355:1: ruleOrderByClause : ( ( rule__OrderByClause__Group__0 ) ) ;
    public final void ruleOrderByClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:359:2: ( ( ( rule__OrderByClause__Group__0 ) ) )
            // InternalMSQLQueryParser.g:360:2: ( ( rule__OrderByClause__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:360:2: ( ( rule__OrderByClause__Group__0 ) )
            // InternalMSQLQueryParser.g:361:3: ( rule__OrderByClause__Group__0 )
            {
             before(grammarAccess.getOrderByClauseAccess().getGroup()); 
            // InternalMSQLQueryParser.g:362:3: ( rule__OrderByClause__Group__0 )
            // InternalMSQLQueryParser.g:362:4: rule__OrderByClause__Group__0
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
    // InternalMSQLQueryParser.g:371:1: entryRuleOrderByDirective : ruleOrderByDirective EOF ;
    public final void entryRuleOrderByDirective() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:372:1: ( ruleOrderByDirective EOF )
            // InternalMSQLQueryParser.g:373:1: ruleOrderByDirective EOF
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
    // InternalMSQLQueryParser.g:380:1: ruleOrderByDirective : ( ( rule__OrderByDirective__Group__0 ) ) ;
    public final void ruleOrderByDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:384:2: ( ( ( rule__OrderByDirective__Group__0 ) ) )
            // InternalMSQLQueryParser.g:385:2: ( ( rule__OrderByDirective__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:385:2: ( ( rule__OrderByDirective__Group__0 ) )
            // InternalMSQLQueryParser.g:386:3: ( rule__OrderByDirective__Group__0 )
            {
             before(grammarAccess.getOrderByDirectiveAccess().getGroup()); 
            // InternalMSQLQueryParser.g:387:3: ( rule__OrderByDirective__Group__0 )
            // InternalMSQLQueryParser.g:387:4: rule__OrderByDirective__Group__0
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
    // InternalMSQLQueryParser.g:396:1: entryRuleColumnReference : ruleColumnReference EOF ;
    public final void entryRuleColumnReference() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:397:1: ( ruleColumnReference EOF )
            // InternalMSQLQueryParser.g:398:1: ruleColumnReference EOF
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
    // InternalMSQLQueryParser.g:405:1: ruleColumnReference : ( ( rule__ColumnReference__ColumnAssignment ) ) ;
    public final void ruleColumnReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:409:2: ( ( ( rule__ColumnReference__ColumnAssignment ) ) )
            // InternalMSQLQueryParser.g:410:2: ( ( rule__ColumnReference__ColumnAssignment ) )
            {
            // InternalMSQLQueryParser.g:410:2: ( ( rule__ColumnReference__ColumnAssignment ) )
            // InternalMSQLQueryParser.g:411:3: ( rule__ColumnReference__ColumnAssignment )
            {
             before(grammarAccess.getColumnReferenceAccess().getColumnAssignment()); 
            // InternalMSQLQueryParser.g:412:3: ( rule__ColumnReference__ColumnAssignment )
            // InternalMSQLQueryParser.g:412:4: rule__ColumnReference__ColumnAssignment
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


    // $ANTLR start "ruleComparativeOperator"
    // InternalMSQLQueryParser.g:421:1: ruleComparativeOperator : ( ( rule__ComparativeOperator__Alternatives ) ) ;
    public final void ruleComparativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:425:1: ( ( ( rule__ComparativeOperator__Alternatives ) ) )
            // InternalMSQLQueryParser.g:426:2: ( ( rule__ComparativeOperator__Alternatives ) )
            {
            // InternalMSQLQueryParser.g:426:2: ( ( rule__ComparativeOperator__Alternatives ) )
            // InternalMSQLQueryParser.g:427:3: ( rule__ComparativeOperator__Alternatives )
            {
             before(grammarAccess.getComparativeOperatorAccess().getAlternatives()); 
            // InternalMSQLQueryParser.g:428:3: ( rule__ComparativeOperator__Alternatives )
            // InternalMSQLQueryParser.g:428:4: rule__ComparativeOperator__Alternatives
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
    // InternalMSQLQueryParser.g:436:1: rule__WhatDirective__Alternatives : ( ( ruleAllColumnsWhatDirective ) | ( ruleSingleColumnWhatDirective ) );
    public final void rule__WhatDirective__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:440:1: ( ( ruleAllColumnsWhatDirective ) | ( ruleSingleColumnWhatDirective ) )
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
                    // InternalMSQLQueryParser.g:441:2: ( ruleAllColumnsWhatDirective )
                    {
                    // InternalMSQLQueryParser.g:441:2: ( ruleAllColumnsWhatDirective )
                    // InternalMSQLQueryParser.g:442:3: ruleAllColumnsWhatDirective
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
                    // InternalMSQLQueryParser.g:447:2: ( ruleSingleColumnWhatDirective )
                    {
                    // InternalMSQLQueryParser.g:447:2: ( ruleSingleColumnWhatDirective )
                    // InternalMSQLQueryParser.g:448:3: ruleSingleColumnWhatDirective
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


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalMSQLQueryParser.g:457:1: rule__Expression__Alternatives : ( ( ruleColumnReference ) | ( ruleIntegerLiteral ) | ( ruleComparativeExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:461:1: ( ( ruleColumnReference ) | ( ruleIntegerLiteral ) | ( ruleComparativeExpression ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||LA2_1==ORDER||LA2_1==Semicolon) ) {
                    alt2=1;
                }
                else if ( ((LA2_1>=ExclamationMarkEqualsSign && LA2_1<=GreaterThanSignEqualsSign)||(LA2_1>=LessThanSign && LA2_1<=GreaterThanSign)) ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_INT) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==EOF||LA2_2==ORDER||LA2_2==Semicolon) ) {
                    alt2=2;
                }
                else if ( ((LA2_2>=ExclamationMarkEqualsSign && LA2_2<=GreaterThanSignEqualsSign)||(LA2_2>=LessThanSign && LA2_2<=GreaterThanSign)) ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMSQLQueryParser.g:462:2: ( ruleColumnReference )
                    {
                    // InternalMSQLQueryParser.g:462:2: ( ruleColumnReference )
                    // InternalMSQLQueryParser.g:463:3: ruleColumnReference
                    {
                     before(grammarAccess.getExpressionAccess().getColumnReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleColumnReference();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getColumnReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:468:2: ( ruleIntegerLiteral )
                    {
                    // InternalMSQLQueryParser.g:468:2: ( ruleIntegerLiteral )
                    // InternalMSQLQueryParser.g:469:3: ruleIntegerLiteral
                    {
                     before(grammarAccess.getExpressionAccess().getIntegerLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerLiteral();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getIntegerLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMSQLQueryParser.g:474:2: ( ruleComparativeExpression )
                    {
                    // InternalMSQLQueryParser.g:474:2: ( ruleComparativeExpression )
                    // InternalMSQLQueryParser.g:475:3: ruleComparativeExpression
                    {
                     before(grammarAccess.getExpressionAccess().getComparativeExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleComparativeExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getComparativeExpressionParserRuleCall_2()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__AtomicExpression__Alternatives"
    // InternalMSQLQueryParser.g:484:1: rule__AtomicExpression__Alternatives : ( ( ruleIntegerLiteral ) | ( ruleColumnReference ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:488:1: ( ( ruleIntegerLiteral ) | ( ruleColumnReference ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMSQLQueryParser.g:489:2: ( ruleIntegerLiteral )
                    {
                    // InternalMSQLQueryParser.g:489:2: ( ruleIntegerLiteral )
                    // InternalMSQLQueryParser.g:490:3: ruleIntegerLiteral
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getIntegerLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerLiteral();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpressionAccess().getIntegerLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:495:2: ( ruleColumnReference )
                    {
                    // InternalMSQLQueryParser.g:495:2: ( ruleColumnReference )
                    // InternalMSQLQueryParser.g:496:3: ruleColumnReference
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getColumnReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleColumnReference();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpressionAccess().getColumnReferenceParserRuleCall_1()); 

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
    // InternalMSQLQueryParser.g:505:1: rule__OrderByDirective__AscendingAlternatives_1_0 : ( ( ASC ) | ( DESC ) );
    public final void rule__OrderByDirective__AscendingAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:509:1: ( ( ASC ) | ( DESC ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ASC) ) {
                alt4=1;
            }
            else if ( (LA4_0==DESC) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMSQLQueryParser.g:510:2: ( ASC )
                    {
                    // InternalMSQLQueryParser.g:510:2: ( ASC )
                    // InternalMSQLQueryParser.g:511:3: ASC
                    {
                     before(grammarAccess.getOrderByDirectiveAccess().getAscendingASCKeyword_1_0_0()); 
                    match(input,ASC,FOLLOW_2); 
                     after(grammarAccess.getOrderByDirectiveAccess().getAscendingASCKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:516:2: ( DESC )
                    {
                    // InternalMSQLQueryParser.g:516:2: ( DESC )
                    // InternalMSQLQueryParser.g:517:3: DESC
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


    // $ANTLR start "rule__ComparativeOperator__Alternatives"
    // InternalMSQLQueryParser.g:526:1: rule__ComparativeOperator__Alternatives : ( ( ( LessThanSign ) ) | ( ( LessThanSignEqualsSign ) ) | ( ( EqualsSign ) ) | ( ( ExclamationMarkEqualsSign ) ) | ( ( GreaterThanSign ) ) | ( ( GreaterThanSignEqualsSign ) ) );
    public final void rule__ComparativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:530:1: ( ( ( LessThanSign ) ) | ( ( LessThanSignEqualsSign ) ) | ( ( EqualsSign ) ) | ( ( ExclamationMarkEqualsSign ) ) | ( ( GreaterThanSign ) ) | ( ( GreaterThanSignEqualsSign ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case LessThanSign:
                {
                alt5=1;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt5=2;
                }
                break;
            case EqualsSign:
                {
                alt5=3;
                }
                break;
            case ExclamationMarkEqualsSign:
                {
                alt5=4;
                }
                break;
            case GreaterThanSign:
                {
                alt5=5;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMSQLQueryParser.g:531:2: ( ( LessThanSign ) )
                    {
                    // InternalMSQLQueryParser.g:531:2: ( ( LessThanSign ) )
                    // InternalMSQLQueryParser.g:532:3: ( LessThanSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getLESS_THANEnumLiteralDeclaration_0()); 
                    // InternalMSQLQueryParser.g:533:3: ( LessThanSign )
                    // InternalMSQLQueryParser.g:533:4: LessThanSign
                    {
                    match(input,LessThanSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getLESS_THANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:537:2: ( ( LessThanSignEqualsSign ) )
                    {
                    // InternalMSQLQueryParser.g:537:2: ( ( LessThanSignEqualsSign ) )
                    // InternalMSQLQueryParser.g:538:3: ( LessThanSignEqualsSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getLESS_THAN_OR_EQUALEnumLiteralDeclaration_1()); 
                    // InternalMSQLQueryParser.g:539:3: ( LessThanSignEqualsSign )
                    // InternalMSQLQueryParser.g:539:4: LessThanSignEqualsSign
                    {
                    match(input,LessThanSignEqualsSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getLESS_THAN_OR_EQUALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMSQLQueryParser.g:543:2: ( ( EqualsSign ) )
                    {
                    // InternalMSQLQueryParser.g:543:2: ( ( EqualsSign ) )
                    // InternalMSQLQueryParser.g:544:3: ( EqualsSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getEQUALEnumLiteralDeclaration_2()); 
                    // InternalMSQLQueryParser.g:545:3: ( EqualsSign )
                    // InternalMSQLQueryParser.g:545:4: EqualsSign
                    {
                    match(input,EqualsSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getEQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMSQLQueryParser.g:549:2: ( ( ExclamationMarkEqualsSign ) )
                    {
                    // InternalMSQLQueryParser.g:549:2: ( ( ExclamationMarkEqualsSign ) )
                    // InternalMSQLQueryParser.g:550:3: ( ExclamationMarkEqualsSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_3()); 
                    // InternalMSQLQueryParser.g:551:3: ( ExclamationMarkEqualsSign )
                    // InternalMSQLQueryParser.g:551:4: ExclamationMarkEqualsSign
                    {
                    match(input,ExclamationMarkEqualsSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMSQLQueryParser.g:555:2: ( ( GreaterThanSign ) )
                    {
                    // InternalMSQLQueryParser.g:555:2: ( ( GreaterThanSign ) )
                    // InternalMSQLQueryParser.g:556:3: ( GreaterThanSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getGREATER_THANEnumLiteralDeclaration_4()); 
                    // InternalMSQLQueryParser.g:557:3: ( GreaterThanSign )
                    // InternalMSQLQueryParser.g:557:4: GreaterThanSign
                    {
                    match(input,GreaterThanSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getGREATER_THANEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMSQLQueryParser.g:561:2: ( ( GreaterThanSignEqualsSign ) )
                    {
                    // InternalMSQLQueryParser.g:561:2: ( ( GreaterThanSignEqualsSign ) )
                    // InternalMSQLQueryParser.g:562:3: ( GreaterThanSignEqualsSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getGREATER_THAN_OR_EQUALEnumLiteralDeclaration_5()); 
                    // InternalMSQLQueryParser.g:563:3: ( GreaterThanSignEqualsSign )
                    // InternalMSQLQueryParser.g:563:4: GreaterThanSignEqualsSign
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
    // InternalMSQLQueryParser.g:571:1: rule__SelectQuery__Group__0 : rule__SelectQuery__Group__0__Impl rule__SelectQuery__Group__1 ;
    public final void rule__SelectQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:575:1: ( rule__SelectQuery__Group__0__Impl rule__SelectQuery__Group__1 )
            // InternalMSQLQueryParser.g:576:2: rule__SelectQuery__Group__0__Impl rule__SelectQuery__Group__1
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
    // InternalMSQLQueryParser.g:583:1: rule__SelectQuery__Group__0__Impl : ( SELECT ) ;
    public final void rule__SelectQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:587:1: ( ( SELECT ) )
            // InternalMSQLQueryParser.g:588:1: ( SELECT )
            {
            // InternalMSQLQueryParser.g:588:1: ( SELECT )
            // InternalMSQLQueryParser.g:589:2: SELECT
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
    // InternalMSQLQueryParser.g:598:1: rule__SelectQuery__Group__1 : rule__SelectQuery__Group__1__Impl rule__SelectQuery__Group__2 ;
    public final void rule__SelectQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:602:1: ( rule__SelectQuery__Group__1__Impl rule__SelectQuery__Group__2 )
            // InternalMSQLQueryParser.g:603:2: rule__SelectQuery__Group__1__Impl rule__SelectQuery__Group__2
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
    // InternalMSQLQueryParser.g:610:1: rule__SelectQuery__Group__1__Impl : ( ( rule__SelectQuery__WhatClauseAssignment_1 ) ) ;
    public final void rule__SelectQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:614:1: ( ( ( rule__SelectQuery__WhatClauseAssignment_1 ) ) )
            // InternalMSQLQueryParser.g:615:1: ( ( rule__SelectQuery__WhatClauseAssignment_1 ) )
            {
            // InternalMSQLQueryParser.g:615:1: ( ( rule__SelectQuery__WhatClauseAssignment_1 ) )
            // InternalMSQLQueryParser.g:616:2: ( rule__SelectQuery__WhatClauseAssignment_1 )
            {
             before(grammarAccess.getSelectQueryAccess().getWhatClauseAssignment_1()); 
            // InternalMSQLQueryParser.g:617:2: ( rule__SelectQuery__WhatClauseAssignment_1 )
            // InternalMSQLQueryParser.g:617:3: rule__SelectQuery__WhatClauseAssignment_1
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
    // InternalMSQLQueryParser.g:625:1: rule__SelectQuery__Group__2 : rule__SelectQuery__Group__2__Impl rule__SelectQuery__Group__3 ;
    public final void rule__SelectQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:629:1: ( rule__SelectQuery__Group__2__Impl rule__SelectQuery__Group__3 )
            // InternalMSQLQueryParser.g:630:2: rule__SelectQuery__Group__2__Impl rule__SelectQuery__Group__3
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
    // InternalMSQLQueryParser.g:637:1: rule__SelectQuery__Group__2__Impl : ( ( rule__SelectQuery__FromClauseAssignment_2 ) ) ;
    public final void rule__SelectQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:641:1: ( ( ( rule__SelectQuery__FromClauseAssignment_2 ) ) )
            // InternalMSQLQueryParser.g:642:1: ( ( rule__SelectQuery__FromClauseAssignment_2 ) )
            {
            // InternalMSQLQueryParser.g:642:1: ( ( rule__SelectQuery__FromClauseAssignment_2 ) )
            // InternalMSQLQueryParser.g:643:2: ( rule__SelectQuery__FromClauseAssignment_2 )
            {
             before(grammarAccess.getSelectQueryAccess().getFromClauseAssignment_2()); 
            // InternalMSQLQueryParser.g:644:2: ( rule__SelectQuery__FromClauseAssignment_2 )
            // InternalMSQLQueryParser.g:644:3: rule__SelectQuery__FromClauseAssignment_2
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
    // InternalMSQLQueryParser.g:652:1: rule__SelectQuery__Group__3 : rule__SelectQuery__Group__3__Impl rule__SelectQuery__Group__4 ;
    public final void rule__SelectQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:656:1: ( rule__SelectQuery__Group__3__Impl rule__SelectQuery__Group__4 )
            // InternalMSQLQueryParser.g:657:2: rule__SelectQuery__Group__3__Impl rule__SelectQuery__Group__4
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
    // InternalMSQLQueryParser.g:664:1: rule__SelectQuery__Group__3__Impl : ( ( rule__SelectQuery__WhereClauseAssignment_3 )? ) ;
    public final void rule__SelectQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:668:1: ( ( ( rule__SelectQuery__WhereClauseAssignment_3 )? ) )
            // InternalMSQLQueryParser.g:669:1: ( ( rule__SelectQuery__WhereClauseAssignment_3 )? )
            {
            // InternalMSQLQueryParser.g:669:1: ( ( rule__SelectQuery__WhereClauseAssignment_3 )? )
            // InternalMSQLQueryParser.g:670:2: ( rule__SelectQuery__WhereClauseAssignment_3 )?
            {
             before(grammarAccess.getSelectQueryAccess().getWhereClauseAssignment_3()); 
            // InternalMSQLQueryParser.g:671:2: ( rule__SelectQuery__WhereClauseAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==WHERE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMSQLQueryParser.g:671:3: rule__SelectQuery__WhereClauseAssignment_3
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
    // InternalMSQLQueryParser.g:679:1: rule__SelectQuery__Group__4 : rule__SelectQuery__Group__4__Impl rule__SelectQuery__Group__5 ;
    public final void rule__SelectQuery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:683:1: ( rule__SelectQuery__Group__4__Impl rule__SelectQuery__Group__5 )
            // InternalMSQLQueryParser.g:684:2: rule__SelectQuery__Group__4__Impl rule__SelectQuery__Group__5
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
    // InternalMSQLQueryParser.g:691:1: rule__SelectQuery__Group__4__Impl : ( ( rule__SelectQuery__OrderByClauseAssignment_4 )? ) ;
    public final void rule__SelectQuery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:695:1: ( ( ( rule__SelectQuery__OrderByClauseAssignment_4 )? ) )
            // InternalMSQLQueryParser.g:696:1: ( ( rule__SelectQuery__OrderByClauseAssignment_4 )? )
            {
            // InternalMSQLQueryParser.g:696:1: ( ( rule__SelectQuery__OrderByClauseAssignment_4 )? )
            // InternalMSQLQueryParser.g:697:2: ( rule__SelectQuery__OrderByClauseAssignment_4 )?
            {
             before(grammarAccess.getSelectQueryAccess().getOrderByClauseAssignment_4()); 
            // InternalMSQLQueryParser.g:698:2: ( rule__SelectQuery__OrderByClauseAssignment_4 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ORDER) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMSQLQueryParser.g:698:3: rule__SelectQuery__OrderByClauseAssignment_4
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
    // InternalMSQLQueryParser.g:706:1: rule__SelectQuery__Group__5 : rule__SelectQuery__Group__5__Impl ;
    public final void rule__SelectQuery__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:710:1: ( rule__SelectQuery__Group__5__Impl )
            // InternalMSQLQueryParser.g:711:2: rule__SelectQuery__Group__5__Impl
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
    // InternalMSQLQueryParser.g:717:1: rule__SelectQuery__Group__5__Impl : ( Semicolon ) ;
    public final void rule__SelectQuery__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:721:1: ( ( Semicolon ) )
            // InternalMSQLQueryParser.g:722:1: ( Semicolon )
            {
            // InternalMSQLQueryParser.g:722:1: ( Semicolon )
            // InternalMSQLQueryParser.g:723:2: Semicolon
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
    // InternalMSQLQueryParser.g:733:1: rule__WhatClause__Group__0 : rule__WhatClause__Group__0__Impl rule__WhatClause__Group__1 ;
    public final void rule__WhatClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:737:1: ( rule__WhatClause__Group__0__Impl rule__WhatClause__Group__1 )
            // InternalMSQLQueryParser.g:738:2: rule__WhatClause__Group__0__Impl rule__WhatClause__Group__1
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
    // InternalMSQLQueryParser.g:745:1: rule__WhatClause__Group__0__Impl : ( ( rule__WhatClause__WhatDirectiveAssignment_0 ) ) ;
    public final void rule__WhatClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:749:1: ( ( ( rule__WhatClause__WhatDirectiveAssignment_0 ) ) )
            // InternalMSQLQueryParser.g:750:1: ( ( rule__WhatClause__WhatDirectiveAssignment_0 ) )
            {
            // InternalMSQLQueryParser.g:750:1: ( ( rule__WhatClause__WhatDirectiveAssignment_0 ) )
            // InternalMSQLQueryParser.g:751:2: ( rule__WhatClause__WhatDirectiveAssignment_0 )
            {
             before(grammarAccess.getWhatClauseAccess().getWhatDirectiveAssignment_0()); 
            // InternalMSQLQueryParser.g:752:2: ( rule__WhatClause__WhatDirectiveAssignment_0 )
            // InternalMSQLQueryParser.g:752:3: rule__WhatClause__WhatDirectiveAssignment_0
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
    // InternalMSQLQueryParser.g:760:1: rule__WhatClause__Group__1 : rule__WhatClause__Group__1__Impl ;
    public final void rule__WhatClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:764:1: ( rule__WhatClause__Group__1__Impl )
            // InternalMSQLQueryParser.g:765:2: rule__WhatClause__Group__1__Impl
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
    // InternalMSQLQueryParser.g:771:1: rule__WhatClause__Group__1__Impl : ( ( rule__WhatClause__Group_1__0 )* ) ;
    public final void rule__WhatClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:775:1: ( ( ( rule__WhatClause__Group_1__0 )* ) )
            // InternalMSQLQueryParser.g:776:1: ( ( rule__WhatClause__Group_1__0 )* )
            {
            // InternalMSQLQueryParser.g:776:1: ( ( rule__WhatClause__Group_1__0 )* )
            // InternalMSQLQueryParser.g:777:2: ( rule__WhatClause__Group_1__0 )*
            {
             before(grammarAccess.getWhatClauseAccess().getGroup_1()); 
            // InternalMSQLQueryParser.g:778:2: ( rule__WhatClause__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Comma) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:778:3: rule__WhatClause__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__WhatClause__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalMSQLQueryParser.g:787:1: rule__WhatClause__Group_1__0 : rule__WhatClause__Group_1__0__Impl rule__WhatClause__Group_1__1 ;
    public final void rule__WhatClause__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:791:1: ( rule__WhatClause__Group_1__0__Impl rule__WhatClause__Group_1__1 )
            // InternalMSQLQueryParser.g:792:2: rule__WhatClause__Group_1__0__Impl rule__WhatClause__Group_1__1
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
    // InternalMSQLQueryParser.g:799:1: rule__WhatClause__Group_1__0__Impl : ( Comma ) ;
    public final void rule__WhatClause__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:803:1: ( ( Comma ) )
            // InternalMSQLQueryParser.g:804:1: ( Comma )
            {
            // InternalMSQLQueryParser.g:804:1: ( Comma )
            // InternalMSQLQueryParser.g:805:2: Comma
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
    // InternalMSQLQueryParser.g:814:1: rule__WhatClause__Group_1__1 : rule__WhatClause__Group_1__1__Impl ;
    public final void rule__WhatClause__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:818:1: ( rule__WhatClause__Group_1__1__Impl )
            // InternalMSQLQueryParser.g:819:2: rule__WhatClause__Group_1__1__Impl
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
    // InternalMSQLQueryParser.g:825:1: rule__WhatClause__Group_1__1__Impl : ( ( rule__WhatClause__WhatDirectiveAssignment_1_1 ) ) ;
    public final void rule__WhatClause__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:829:1: ( ( ( rule__WhatClause__WhatDirectiveAssignment_1_1 ) ) )
            // InternalMSQLQueryParser.g:830:1: ( ( rule__WhatClause__WhatDirectiveAssignment_1_1 ) )
            {
            // InternalMSQLQueryParser.g:830:1: ( ( rule__WhatClause__WhatDirectiveAssignment_1_1 ) )
            // InternalMSQLQueryParser.g:831:2: ( rule__WhatClause__WhatDirectiveAssignment_1_1 )
            {
             before(grammarAccess.getWhatClauseAccess().getWhatDirectiveAssignment_1_1()); 
            // InternalMSQLQueryParser.g:832:2: ( rule__WhatClause__WhatDirectiveAssignment_1_1 )
            // InternalMSQLQueryParser.g:832:3: rule__WhatClause__WhatDirectiveAssignment_1_1
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
    // InternalMSQLQueryParser.g:841:1: rule__AllColumnsWhatDirective__Group__0 : rule__AllColumnsWhatDirective__Group__0__Impl rule__AllColumnsWhatDirective__Group__1 ;
    public final void rule__AllColumnsWhatDirective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:845:1: ( rule__AllColumnsWhatDirective__Group__0__Impl rule__AllColumnsWhatDirective__Group__1 )
            // InternalMSQLQueryParser.g:846:2: rule__AllColumnsWhatDirective__Group__0__Impl rule__AllColumnsWhatDirective__Group__1
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
    // InternalMSQLQueryParser.g:853:1: rule__AllColumnsWhatDirective__Group__0__Impl : ( Asterisk ) ;
    public final void rule__AllColumnsWhatDirective__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:857:1: ( ( Asterisk ) )
            // InternalMSQLQueryParser.g:858:1: ( Asterisk )
            {
            // InternalMSQLQueryParser.g:858:1: ( Asterisk )
            // InternalMSQLQueryParser.g:859:2: Asterisk
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
    // InternalMSQLQueryParser.g:868:1: rule__AllColumnsWhatDirective__Group__1 : rule__AllColumnsWhatDirective__Group__1__Impl ;
    public final void rule__AllColumnsWhatDirective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:872:1: ( rule__AllColumnsWhatDirective__Group__1__Impl )
            // InternalMSQLQueryParser.g:873:2: rule__AllColumnsWhatDirective__Group__1__Impl
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
    // InternalMSQLQueryParser.g:879:1: rule__AllColumnsWhatDirective__Group__1__Impl : ( () ) ;
    public final void rule__AllColumnsWhatDirective__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:883:1: ( ( () ) )
            // InternalMSQLQueryParser.g:884:1: ( () )
            {
            // InternalMSQLQueryParser.g:884:1: ( () )
            // InternalMSQLQueryParser.g:885:2: ()
            {
             before(grammarAccess.getAllColumnsWhatDirectiveAccess().getAllColumnsWhatDirectiveAction_1()); 
            // InternalMSQLQueryParser.g:886:2: ()
            // InternalMSQLQueryParser.g:886:3: 
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
    // InternalMSQLQueryParser.g:895:1: rule__FromClause__Group__0 : rule__FromClause__Group__0__Impl rule__FromClause__Group__1 ;
    public final void rule__FromClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:899:1: ( rule__FromClause__Group__0__Impl rule__FromClause__Group__1 )
            // InternalMSQLQueryParser.g:900:2: rule__FromClause__Group__0__Impl rule__FromClause__Group__1
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
    // InternalMSQLQueryParser.g:907:1: rule__FromClause__Group__0__Impl : ( FROM ) ;
    public final void rule__FromClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:911:1: ( ( FROM ) )
            // InternalMSQLQueryParser.g:912:1: ( FROM )
            {
            // InternalMSQLQueryParser.g:912:1: ( FROM )
            // InternalMSQLQueryParser.g:913:2: FROM
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
    // InternalMSQLQueryParser.g:922:1: rule__FromClause__Group__1 : rule__FromClause__Group__1__Impl ;
    public final void rule__FromClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:926:1: ( rule__FromClause__Group__1__Impl )
            // InternalMSQLQueryParser.g:927:2: rule__FromClause__Group__1__Impl
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
    // InternalMSQLQueryParser.g:933:1: rule__FromClause__Group__1__Impl : ( ( rule__FromClause__TableAssignment_1 ) ) ;
    public final void rule__FromClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:937:1: ( ( ( rule__FromClause__TableAssignment_1 ) ) )
            // InternalMSQLQueryParser.g:938:1: ( ( rule__FromClause__TableAssignment_1 ) )
            {
            // InternalMSQLQueryParser.g:938:1: ( ( rule__FromClause__TableAssignment_1 ) )
            // InternalMSQLQueryParser.g:939:2: ( rule__FromClause__TableAssignment_1 )
            {
             before(grammarAccess.getFromClauseAccess().getTableAssignment_1()); 
            // InternalMSQLQueryParser.g:940:2: ( rule__FromClause__TableAssignment_1 )
            // InternalMSQLQueryParser.g:940:3: rule__FromClause__TableAssignment_1
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
    // InternalMSQLQueryParser.g:949:1: rule__WhereClause__Group__0 : rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1 ;
    public final void rule__WhereClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:953:1: ( rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1 )
            // InternalMSQLQueryParser.g:954:2: rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1
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
    // InternalMSQLQueryParser.g:961:1: rule__WhereClause__Group__0__Impl : ( WHERE ) ;
    public final void rule__WhereClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:965:1: ( ( WHERE ) )
            // InternalMSQLQueryParser.g:966:1: ( WHERE )
            {
            // InternalMSQLQueryParser.g:966:1: ( WHERE )
            // InternalMSQLQueryParser.g:967:2: WHERE
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
    // InternalMSQLQueryParser.g:976:1: rule__WhereClause__Group__1 : rule__WhereClause__Group__1__Impl ;
    public final void rule__WhereClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:980:1: ( rule__WhereClause__Group__1__Impl )
            // InternalMSQLQueryParser.g:981:2: rule__WhereClause__Group__1__Impl
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
    // InternalMSQLQueryParser.g:987:1: rule__WhereClause__Group__1__Impl : ( ( rule__WhereClause__ExpressionAssignment_1 ) ) ;
    public final void rule__WhereClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:991:1: ( ( ( rule__WhereClause__ExpressionAssignment_1 ) ) )
            // InternalMSQLQueryParser.g:992:1: ( ( rule__WhereClause__ExpressionAssignment_1 ) )
            {
            // InternalMSQLQueryParser.g:992:1: ( ( rule__WhereClause__ExpressionAssignment_1 ) )
            // InternalMSQLQueryParser.g:993:2: ( rule__WhereClause__ExpressionAssignment_1 )
            {
             before(grammarAccess.getWhereClauseAccess().getExpressionAssignment_1()); 
            // InternalMSQLQueryParser.g:994:2: ( rule__WhereClause__ExpressionAssignment_1 )
            // InternalMSQLQueryParser.g:994:3: rule__WhereClause__ExpressionAssignment_1
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


    // $ANTLR start "rule__ComparativeExpression__Group__0"
    // InternalMSQLQueryParser.g:1003:1: rule__ComparativeExpression__Group__0 : rule__ComparativeExpression__Group__0__Impl rule__ComparativeExpression__Group__1 ;
    public final void rule__ComparativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1007:1: ( rule__ComparativeExpression__Group__0__Impl rule__ComparativeExpression__Group__1 )
            // InternalMSQLQueryParser.g:1008:2: rule__ComparativeExpression__Group__0__Impl rule__ComparativeExpression__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMSQLQueryParser.g:1015:1: rule__ComparativeExpression__Group__0__Impl : ( ( rule__ComparativeExpression__Expression1Assignment_0 ) ) ;
    public final void rule__ComparativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1019:1: ( ( ( rule__ComparativeExpression__Expression1Assignment_0 ) ) )
            // InternalMSQLQueryParser.g:1020:1: ( ( rule__ComparativeExpression__Expression1Assignment_0 ) )
            {
            // InternalMSQLQueryParser.g:1020:1: ( ( rule__ComparativeExpression__Expression1Assignment_0 ) )
            // InternalMSQLQueryParser.g:1021:2: ( rule__ComparativeExpression__Expression1Assignment_0 )
            {
             before(grammarAccess.getComparativeExpressionAccess().getExpression1Assignment_0()); 
            // InternalMSQLQueryParser.g:1022:2: ( rule__ComparativeExpression__Expression1Assignment_0 )
            // InternalMSQLQueryParser.g:1022:3: rule__ComparativeExpression__Expression1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ComparativeExpression__Expression1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComparativeExpressionAccess().getExpression1Assignment_0()); 

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
    // InternalMSQLQueryParser.g:1030:1: rule__ComparativeExpression__Group__1 : rule__ComparativeExpression__Group__1__Impl rule__ComparativeExpression__Group__2 ;
    public final void rule__ComparativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1034:1: ( rule__ComparativeExpression__Group__1__Impl rule__ComparativeExpression__Group__2 )
            // InternalMSQLQueryParser.g:1035:2: rule__ComparativeExpression__Group__1__Impl rule__ComparativeExpression__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ComparativeExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparativeExpression__Group__2();

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
    // InternalMSQLQueryParser.g:1042:1: rule__ComparativeExpression__Group__1__Impl : ( ( rule__ComparativeExpression__OperatorAssignment_1 ) ) ;
    public final void rule__ComparativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1046:1: ( ( ( rule__ComparativeExpression__OperatorAssignment_1 ) ) )
            // InternalMSQLQueryParser.g:1047:1: ( ( rule__ComparativeExpression__OperatorAssignment_1 ) )
            {
            // InternalMSQLQueryParser.g:1047:1: ( ( rule__ComparativeExpression__OperatorAssignment_1 ) )
            // InternalMSQLQueryParser.g:1048:2: ( rule__ComparativeExpression__OperatorAssignment_1 )
            {
             before(grammarAccess.getComparativeExpressionAccess().getOperatorAssignment_1()); 
            // InternalMSQLQueryParser.g:1049:2: ( rule__ComparativeExpression__OperatorAssignment_1 )
            // InternalMSQLQueryParser.g:1049:3: rule__ComparativeExpression__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComparativeExpression__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComparativeExpressionAccess().getOperatorAssignment_1()); 

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


    // $ANTLR start "rule__ComparativeExpression__Group__2"
    // InternalMSQLQueryParser.g:1057:1: rule__ComparativeExpression__Group__2 : rule__ComparativeExpression__Group__2__Impl ;
    public final void rule__ComparativeExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1061:1: ( rule__ComparativeExpression__Group__2__Impl )
            // InternalMSQLQueryParser.g:1062:2: rule__ComparativeExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparativeExpression__Group__2__Impl();

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
    // $ANTLR end "rule__ComparativeExpression__Group__2"


    // $ANTLR start "rule__ComparativeExpression__Group__2__Impl"
    // InternalMSQLQueryParser.g:1068:1: rule__ComparativeExpression__Group__2__Impl : ( ( rule__ComparativeExpression__Expression2Assignment_2 ) ) ;
    public final void rule__ComparativeExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1072:1: ( ( ( rule__ComparativeExpression__Expression2Assignment_2 ) ) )
            // InternalMSQLQueryParser.g:1073:1: ( ( rule__ComparativeExpression__Expression2Assignment_2 ) )
            {
            // InternalMSQLQueryParser.g:1073:1: ( ( rule__ComparativeExpression__Expression2Assignment_2 ) )
            // InternalMSQLQueryParser.g:1074:2: ( rule__ComparativeExpression__Expression2Assignment_2 )
            {
             before(grammarAccess.getComparativeExpressionAccess().getExpression2Assignment_2()); 
            // InternalMSQLQueryParser.g:1075:2: ( rule__ComparativeExpression__Expression2Assignment_2 )
            // InternalMSQLQueryParser.g:1075:3: rule__ComparativeExpression__Expression2Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComparativeExpression__Expression2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComparativeExpressionAccess().getExpression2Assignment_2()); 

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
    // $ANTLR end "rule__ComparativeExpression__Group__2__Impl"


    // $ANTLR start "rule__OrderByClause__Group__0"
    // InternalMSQLQueryParser.g:1084:1: rule__OrderByClause__Group__0 : rule__OrderByClause__Group__0__Impl rule__OrderByClause__Group__1 ;
    public final void rule__OrderByClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1088:1: ( rule__OrderByClause__Group__0__Impl rule__OrderByClause__Group__1 )
            // InternalMSQLQueryParser.g:1089:2: rule__OrderByClause__Group__0__Impl rule__OrderByClause__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMSQLQueryParser.g:1096:1: rule__OrderByClause__Group__0__Impl : ( ORDER ) ;
    public final void rule__OrderByClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1100:1: ( ( ORDER ) )
            // InternalMSQLQueryParser.g:1101:1: ( ORDER )
            {
            // InternalMSQLQueryParser.g:1101:1: ( ORDER )
            // InternalMSQLQueryParser.g:1102:2: ORDER
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
    // InternalMSQLQueryParser.g:1111:1: rule__OrderByClause__Group__1 : rule__OrderByClause__Group__1__Impl rule__OrderByClause__Group__2 ;
    public final void rule__OrderByClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1115:1: ( rule__OrderByClause__Group__1__Impl rule__OrderByClause__Group__2 )
            // InternalMSQLQueryParser.g:1116:2: rule__OrderByClause__Group__1__Impl rule__OrderByClause__Group__2
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
    // InternalMSQLQueryParser.g:1123:1: rule__OrderByClause__Group__1__Impl : ( BY ) ;
    public final void rule__OrderByClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1127:1: ( ( BY ) )
            // InternalMSQLQueryParser.g:1128:1: ( BY )
            {
            // InternalMSQLQueryParser.g:1128:1: ( BY )
            // InternalMSQLQueryParser.g:1129:2: BY
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
    // InternalMSQLQueryParser.g:1138:1: rule__OrderByClause__Group__2 : rule__OrderByClause__Group__2__Impl rule__OrderByClause__Group__3 ;
    public final void rule__OrderByClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1142:1: ( rule__OrderByClause__Group__2__Impl rule__OrderByClause__Group__3 )
            // InternalMSQLQueryParser.g:1143:2: rule__OrderByClause__Group__2__Impl rule__OrderByClause__Group__3
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
    // InternalMSQLQueryParser.g:1150:1: rule__OrderByClause__Group__2__Impl : ( ( rule__OrderByClause__OrderDirectivesAssignment_2 ) ) ;
    public final void rule__OrderByClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1154:1: ( ( ( rule__OrderByClause__OrderDirectivesAssignment_2 ) ) )
            // InternalMSQLQueryParser.g:1155:1: ( ( rule__OrderByClause__OrderDirectivesAssignment_2 ) )
            {
            // InternalMSQLQueryParser.g:1155:1: ( ( rule__OrderByClause__OrderDirectivesAssignment_2 ) )
            // InternalMSQLQueryParser.g:1156:2: ( rule__OrderByClause__OrderDirectivesAssignment_2 )
            {
             before(grammarAccess.getOrderByClauseAccess().getOrderDirectivesAssignment_2()); 
            // InternalMSQLQueryParser.g:1157:2: ( rule__OrderByClause__OrderDirectivesAssignment_2 )
            // InternalMSQLQueryParser.g:1157:3: rule__OrderByClause__OrderDirectivesAssignment_2
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
    // InternalMSQLQueryParser.g:1165:1: rule__OrderByClause__Group__3 : rule__OrderByClause__Group__3__Impl ;
    public final void rule__OrderByClause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1169:1: ( rule__OrderByClause__Group__3__Impl )
            // InternalMSQLQueryParser.g:1170:2: rule__OrderByClause__Group__3__Impl
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
    // InternalMSQLQueryParser.g:1176:1: rule__OrderByClause__Group__3__Impl : ( ( rule__OrderByClause__Group_3__0 )* ) ;
    public final void rule__OrderByClause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1180:1: ( ( ( rule__OrderByClause__Group_3__0 )* ) )
            // InternalMSQLQueryParser.g:1181:1: ( ( rule__OrderByClause__Group_3__0 )* )
            {
            // InternalMSQLQueryParser.g:1181:1: ( ( rule__OrderByClause__Group_3__0 )* )
            // InternalMSQLQueryParser.g:1182:2: ( rule__OrderByClause__Group_3__0 )*
            {
             before(grammarAccess.getOrderByClauseAccess().getGroup_3()); 
            // InternalMSQLQueryParser.g:1183:2: ( rule__OrderByClause__Group_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Comma) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:1183:3: rule__OrderByClause__Group_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__OrderByClause__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalMSQLQueryParser.g:1192:1: rule__OrderByClause__Group_3__0 : rule__OrderByClause__Group_3__0__Impl rule__OrderByClause__Group_3__1 ;
    public final void rule__OrderByClause__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1196:1: ( rule__OrderByClause__Group_3__0__Impl rule__OrderByClause__Group_3__1 )
            // InternalMSQLQueryParser.g:1197:2: rule__OrderByClause__Group_3__0__Impl rule__OrderByClause__Group_3__1
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
    // InternalMSQLQueryParser.g:1204:1: rule__OrderByClause__Group_3__0__Impl : ( Comma ) ;
    public final void rule__OrderByClause__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1208:1: ( ( Comma ) )
            // InternalMSQLQueryParser.g:1209:1: ( Comma )
            {
            // InternalMSQLQueryParser.g:1209:1: ( Comma )
            // InternalMSQLQueryParser.g:1210:2: Comma
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
    // InternalMSQLQueryParser.g:1219:1: rule__OrderByClause__Group_3__1 : rule__OrderByClause__Group_3__1__Impl ;
    public final void rule__OrderByClause__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1223:1: ( rule__OrderByClause__Group_3__1__Impl )
            // InternalMSQLQueryParser.g:1224:2: rule__OrderByClause__Group_3__1__Impl
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
    // InternalMSQLQueryParser.g:1230:1: rule__OrderByClause__Group_3__1__Impl : ( ( rule__OrderByClause__OrderDirectivesAssignment_3_1 ) ) ;
    public final void rule__OrderByClause__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1234:1: ( ( ( rule__OrderByClause__OrderDirectivesAssignment_3_1 ) ) )
            // InternalMSQLQueryParser.g:1235:1: ( ( rule__OrderByClause__OrderDirectivesAssignment_3_1 ) )
            {
            // InternalMSQLQueryParser.g:1235:1: ( ( rule__OrderByClause__OrderDirectivesAssignment_3_1 ) )
            // InternalMSQLQueryParser.g:1236:2: ( rule__OrderByClause__OrderDirectivesAssignment_3_1 )
            {
             before(grammarAccess.getOrderByClauseAccess().getOrderDirectivesAssignment_3_1()); 
            // InternalMSQLQueryParser.g:1237:2: ( rule__OrderByClause__OrderDirectivesAssignment_3_1 )
            // InternalMSQLQueryParser.g:1237:3: rule__OrderByClause__OrderDirectivesAssignment_3_1
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
    // InternalMSQLQueryParser.g:1246:1: rule__OrderByDirective__Group__0 : rule__OrderByDirective__Group__0__Impl rule__OrderByDirective__Group__1 ;
    public final void rule__OrderByDirective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1250:1: ( rule__OrderByDirective__Group__0__Impl rule__OrderByDirective__Group__1 )
            // InternalMSQLQueryParser.g:1251:2: rule__OrderByDirective__Group__0__Impl rule__OrderByDirective__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMSQLQueryParser.g:1258:1: rule__OrderByDirective__Group__0__Impl : ( ( rule__OrderByDirective__ColumnReferenceAssignment_0 ) ) ;
    public final void rule__OrderByDirective__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1262:1: ( ( ( rule__OrderByDirective__ColumnReferenceAssignment_0 ) ) )
            // InternalMSQLQueryParser.g:1263:1: ( ( rule__OrderByDirective__ColumnReferenceAssignment_0 ) )
            {
            // InternalMSQLQueryParser.g:1263:1: ( ( rule__OrderByDirective__ColumnReferenceAssignment_0 ) )
            // InternalMSQLQueryParser.g:1264:2: ( rule__OrderByDirective__ColumnReferenceAssignment_0 )
            {
             before(grammarAccess.getOrderByDirectiveAccess().getColumnReferenceAssignment_0()); 
            // InternalMSQLQueryParser.g:1265:2: ( rule__OrderByDirective__ColumnReferenceAssignment_0 )
            // InternalMSQLQueryParser.g:1265:3: rule__OrderByDirective__ColumnReferenceAssignment_0
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
    // InternalMSQLQueryParser.g:1273:1: rule__OrderByDirective__Group__1 : rule__OrderByDirective__Group__1__Impl ;
    public final void rule__OrderByDirective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1277:1: ( rule__OrderByDirective__Group__1__Impl )
            // InternalMSQLQueryParser.g:1278:2: rule__OrderByDirective__Group__1__Impl
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
    // InternalMSQLQueryParser.g:1284:1: rule__OrderByDirective__Group__1__Impl : ( ( rule__OrderByDirective__AscendingAssignment_1 )? ) ;
    public final void rule__OrderByDirective__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1288:1: ( ( ( rule__OrderByDirective__AscendingAssignment_1 )? ) )
            // InternalMSQLQueryParser.g:1289:1: ( ( rule__OrderByDirective__AscendingAssignment_1 )? )
            {
            // InternalMSQLQueryParser.g:1289:1: ( ( rule__OrderByDirective__AscendingAssignment_1 )? )
            // InternalMSQLQueryParser.g:1290:2: ( rule__OrderByDirective__AscendingAssignment_1 )?
            {
             before(grammarAccess.getOrderByDirectiveAccess().getAscendingAssignment_1()); 
            // InternalMSQLQueryParser.g:1291:2: ( rule__OrderByDirective__AscendingAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==DESC||LA10_0==ASC) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMSQLQueryParser.g:1291:3: rule__OrderByDirective__AscendingAssignment_1
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
    // InternalMSQLQueryParser.g:1300:1: rule__SelectQuery__WhatClauseAssignment_1 : ( ruleWhatClause ) ;
    public final void rule__SelectQuery__WhatClauseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1304:1: ( ( ruleWhatClause ) )
            // InternalMSQLQueryParser.g:1305:2: ( ruleWhatClause )
            {
            // InternalMSQLQueryParser.g:1305:2: ( ruleWhatClause )
            // InternalMSQLQueryParser.g:1306:3: ruleWhatClause
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
    // InternalMSQLQueryParser.g:1315:1: rule__SelectQuery__FromClauseAssignment_2 : ( ruleFromClause ) ;
    public final void rule__SelectQuery__FromClauseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1319:1: ( ( ruleFromClause ) )
            // InternalMSQLQueryParser.g:1320:2: ( ruleFromClause )
            {
            // InternalMSQLQueryParser.g:1320:2: ( ruleFromClause )
            // InternalMSQLQueryParser.g:1321:3: ruleFromClause
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
    // InternalMSQLQueryParser.g:1330:1: rule__SelectQuery__WhereClauseAssignment_3 : ( ruleWhereClause ) ;
    public final void rule__SelectQuery__WhereClauseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1334:1: ( ( ruleWhereClause ) )
            // InternalMSQLQueryParser.g:1335:2: ( ruleWhereClause )
            {
            // InternalMSQLQueryParser.g:1335:2: ( ruleWhereClause )
            // InternalMSQLQueryParser.g:1336:3: ruleWhereClause
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
    // InternalMSQLQueryParser.g:1345:1: rule__SelectQuery__OrderByClauseAssignment_4 : ( ruleOrderByClause ) ;
    public final void rule__SelectQuery__OrderByClauseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1349:1: ( ( ruleOrderByClause ) )
            // InternalMSQLQueryParser.g:1350:2: ( ruleOrderByClause )
            {
            // InternalMSQLQueryParser.g:1350:2: ( ruleOrderByClause )
            // InternalMSQLQueryParser.g:1351:3: ruleOrderByClause
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
    // InternalMSQLQueryParser.g:1360:1: rule__WhatClause__WhatDirectiveAssignment_0 : ( ruleWhatDirective ) ;
    public final void rule__WhatClause__WhatDirectiveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1364:1: ( ( ruleWhatDirective ) )
            // InternalMSQLQueryParser.g:1365:2: ( ruleWhatDirective )
            {
            // InternalMSQLQueryParser.g:1365:2: ( ruleWhatDirective )
            // InternalMSQLQueryParser.g:1366:3: ruleWhatDirective
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
    // InternalMSQLQueryParser.g:1375:1: rule__WhatClause__WhatDirectiveAssignment_1_1 : ( ruleWhatDirective ) ;
    public final void rule__WhatClause__WhatDirectiveAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1379:1: ( ( ruleWhatDirective ) )
            // InternalMSQLQueryParser.g:1380:2: ( ruleWhatDirective )
            {
            // InternalMSQLQueryParser.g:1380:2: ( ruleWhatDirective )
            // InternalMSQLQueryParser.g:1381:3: ruleWhatDirective
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
    // InternalMSQLQueryParser.g:1390:1: rule__SingleColumnWhatDirective__ColumnReferenceAssignment : ( ruleColumnReference ) ;
    public final void rule__SingleColumnWhatDirective__ColumnReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1394:1: ( ( ruleColumnReference ) )
            // InternalMSQLQueryParser.g:1395:2: ( ruleColumnReference )
            {
            // InternalMSQLQueryParser.g:1395:2: ( ruleColumnReference )
            // InternalMSQLQueryParser.g:1396:3: ruleColumnReference
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
    // InternalMSQLQueryParser.g:1405:1: rule__FromClause__TableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FromClause__TableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1409:1: ( ( ( RULE_ID ) ) )
            // InternalMSQLQueryParser.g:1410:2: ( ( RULE_ID ) )
            {
            // InternalMSQLQueryParser.g:1410:2: ( ( RULE_ID ) )
            // InternalMSQLQueryParser.g:1411:3: ( RULE_ID )
            {
             before(grammarAccess.getFromClauseAccess().getTableTableCrossReference_1_0()); 
            // InternalMSQLQueryParser.g:1412:3: ( RULE_ID )
            // InternalMSQLQueryParser.g:1413:4: RULE_ID
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
    // InternalMSQLQueryParser.g:1424:1: rule__WhereClause__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__WhereClause__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1428:1: ( ( ruleExpression ) )
            // InternalMSQLQueryParser.g:1429:2: ( ruleExpression )
            {
            // InternalMSQLQueryParser.g:1429:2: ( ruleExpression )
            // InternalMSQLQueryParser.g:1430:3: ruleExpression
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


    // $ANTLR start "rule__ComparativeExpression__Expression1Assignment_0"
    // InternalMSQLQueryParser.g:1439:1: rule__ComparativeExpression__Expression1Assignment_0 : ( ruleAtomicExpression ) ;
    public final void rule__ComparativeExpression__Expression1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1443:1: ( ( ruleAtomicExpression ) )
            // InternalMSQLQueryParser.g:1444:2: ( ruleAtomicExpression )
            {
            // InternalMSQLQueryParser.g:1444:2: ( ruleAtomicExpression )
            // InternalMSQLQueryParser.g:1445:3: ruleAtomicExpression
            {
             before(grammarAccess.getComparativeExpressionAccess().getExpression1AtomicExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAtomicExpression();

            state._fsp--;

             after(grammarAccess.getComparativeExpressionAccess().getExpression1AtomicExpressionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ComparativeExpression__Expression1Assignment_0"


    // $ANTLR start "rule__ComparativeExpression__OperatorAssignment_1"
    // InternalMSQLQueryParser.g:1454:1: rule__ComparativeExpression__OperatorAssignment_1 : ( ruleComparativeOperator ) ;
    public final void rule__ComparativeExpression__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1458:1: ( ( ruleComparativeOperator ) )
            // InternalMSQLQueryParser.g:1459:2: ( ruleComparativeOperator )
            {
            // InternalMSQLQueryParser.g:1459:2: ( ruleComparativeOperator )
            // InternalMSQLQueryParser.g:1460:3: ruleComparativeOperator
            {
             before(grammarAccess.getComparativeExpressionAccess().getOperatorComparativeOperatorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComparativeOperator();

            state._fsp--;

             after(grammarAccess.getComparativeExpressionAccess().getOperatorComparativeOperatorEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__ComparativeExpression__OperatorAssignment_1"


    // $ANTLR start "rule__ComparativeExpression__Expression2Assignment_2"
    // InternalMSQLQueryParser.g:1469:1: rule__ComparativeExpression__Expression2Assignment_2 : ( ruleAtomicExpression ) ;
    public final void rule__ComparativeExpression__Expression2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1473:1: ( ( ruleAtomicExpression ) )
            // InternalMSQLQueryParser.g:1474:2: ( ruleAtomicExpression )
            {
            // InternalMSQLQueryParser.g:1474:2: ( ruleAtomicExpression )
            // InternalMSQLQueryParser.g:1475:3: ruleAtomicExpression
            {
             before(grammarAccess.getComparativeExpressionAccess().getExpression2AtomicExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAtomicExpression();

            state._fsp--;

             after(grammarAccess.getComparativeExpressionAccess().getExpression2AtomicExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ComparativeExpression__Expression2Assignment_2"


    // $ANTLR start "rule__IntegerLiteral__ValueAssignment"
    // InternalMSQLQueryParser.g:1484:1: rule__IntegerLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntegerLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1488:1: ( ( RULE_INT ) )
            // InternalMSQLQueryParser.g:1489:2: ( RULE_INT )
            {
            // InternalMSQLQueryParser.g:1489:2: ( RULE_INT )
            // InternalMSQLQueryParser.g:1490:3: RULE_INT
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
    // InternalMSQLQueryParser.g:1499:1: rule__OrderByClause__OrderDirectivesAssignment_2 : ( ruleOrderByDirective ) ;
    public final void rule__OrderByClause__OrderDirectivesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1503:1: ( ( ruleOrderByDirective ) )
            // InternalMSQLQueryParser.g:1504:2: ( ruleOrderByDirective )
            {
            // InternalMSQLQueryParser.g:1504:2: ( ruleOrderByDirective )
            // InternalMSQLQueryParser.g:1505:3: ruleOrderByDirective
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
    // InternalMSQLQueryParser.g:1514:1: rule__OrderByClause__OrderDirectivesAssignment_3_1 : ( ruleOrderByDirective ) ;
    public final void rule__OrderByClause__OrderDirectivesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1518:1: ( ( ruleOrderByDirective ) )
            // InternalMSQLQueryParser.g:1519:2: ( ruleOrderByDirective )
            {
            // InternalMSQLQueryParser.g:1519:2: ( ruleOrderByDirective )
            // InternalMSQLQueryParser.g:1520:3: ruleOrderByDirective
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
    // InternalMSQLQueryParser.g:1529:1: rule__OrderByDirective__ColumnReferenceAssignment_0 : ( ruleColumnReference ) ;
    public final void rule__OrderByDirective__ColumnReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1533:1: ( ( ruleColumnReference ) )
            // InternalMSQLQueryParser.g:1534:2: ( ruleColumnReference )
            {
            // InternalMSQLQueryParser.g:1534:2: ( ruleColumnReference )
            // InternalMSQLQueryParser.g:1535:3: ruleColumnReference
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
    // InternalMSQLQueryParser.g:1544:1: rule__OrderByDirective__AscendingAssignment_1 : ( ( rule__OrderByDirective__AscendingAlternatives_1_0 ) ) ;
    public final void rule__OrderByDirective__AscendingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1548:1: ( ( ( rule__OrderByDirective__AscendingAlternatives_1_0 ) ) )
            // InternalMSQLQueryParser.g:1549:2: ( ( rule__OrderByDirective__AscendingAlternatives_1_0 ) )
            {
            // InternalMSQLQueryParser.g:1549:2: ( ( rule__OrderByDirective__AscendingAlternatives_1_0 ) )
            // InternalMSQLQueryParser.g:1550:3: ( rule__OrderByDirective__AscendingAlternatives_1_0 )
            {
             before(grammarAccess.getOrderByDirectiveAccess().getAscendingAlternatives_1_0()); 
            // InternalMSQLQueryParser.g:1551:3: ( rule__OrderByDirective__AscendingAlternatives_1_0 )
            // InternalMSQLQueryParser.g:1551:4: rule__OrderByDirective__AscendingAlternatives_1_0
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
    // InternalMSQLQueryParser.g:1559:1: rule__ColumnReference__ColumnAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ColumnReference__ColumnAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1563:1: ( ( ( RULE_ID ) ) )
            // InternalMSQLQueryParser.g:1564:2: ( ( RULE_ID ) )
            {
            // InternalMSQLQueryParser.g:1564:2: ( ( RULE_ID ) )
            // InternalMSQLQueryParser.g:1565:3: ( RULE_ID )
            {
             before(grammarAccess.getColumnReferenceAccess().getColumnColumnCrossReference_0()); 
            // InternalMSQLQueryParser.g:1566:3: ( RULE_ID )
            // InternalMSQLQueryParser.g:1567:4: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000304000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000E1C00L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000280L});

}