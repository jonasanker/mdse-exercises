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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SELECT", "ORDER", "DESC", "FROM", "ASC", "BY", "Asterisk", "Comma", "Semicolon", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_STRING=15;
    public static final int FROM=7;
    public static final int DESC=6;
    public static final int RULE_SL_COMMENT=17;
    public static final int ORDER=5;
    public static final int ASC=8;
    public static final int Comma=11;
    public static final int BY=9;
    public static final int EOF=-1;
    public static final int Asterisk=10;
    public static final int RULE_ID=13;
    public static final int RULE_WS=18;
    public static final int RULE_ANY_OTHER=19;
    public static final int SELECT=4;
    public static final int Semicolon=12;
    public static final int RULE_INT=14;
    public static final int RULE_ML_COMMENT=16;

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
    		tokenNameToValue.put("BY", "'BY'");
    		tokenNameToValue.put("ASC", "'ASC'");
    		tokenNameToValue.put("DESC", "'DESC'");
    		tokenNameToValue.put("FROM", "'FROM'");
    		tokenNameToValue.put("ORDER", "'ORDER'");
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
    // InternalMSQLQueryParser.g:64:1: entryRuleSelectQuery : ruleSelectQuery EOF ;
    public final void entryRuleSelectQuery() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:65:1: ( ruleSelectQuery EOF )
            // InternalMSQLQueryParser.g:66:1: ruleSelectQuery EOF
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
    // InternalMSQLQueryParser.g:73:1: ruleSelectQuery : ( ( rule__SelectQuery__Group__0 ) ) ;
    public final void ruleSelectQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:77:2: ( ( ( rule__SelectQuery__Group__0 ) ) )
            // InternalMSQLQueryParser.g:78:2: ( ( rule__SelectQuery__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:78:2: ( ( rule__SelectQuery__Group__0 ) )
            // InternalMSQLQueryParser.g:79:3: ( rule__SelectQuery__Group__0 )
            {
             before(grammarAccess.getSelectQueryAccess().getGroup()); 
            // InternalMSQLQueryParser.g:80:3: ( rule__SelectQuery__Group__0 )
            // InternalMSQLQueryParser.g:80:4: rule__SelectQuery__Group__0
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
    // InternalMSQLQueryParser.g:89:1: entryRuleWhatClause : ruleWhatClause EOF ;
    public final void entryRuleWhatClause() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:90:1: ( ruleWhatClause EOF )
            // InternalMSQLQueryParser.g:91:1: ruleWhatClause EOF
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
    // InternalMSQLQueryParser.g:98:1: ruleWhatClause : ( ( rule__WhatClause__Group__0 ) ) ;
    public final void ruleWhatClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:102:2: ( ( ( rule__WhatClause__Group__0 ) ) )
            // InternalMSQLQueryParser.g:103:2: ( ( rule__WhatClause__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:103:2: ( ( rule__WhatClause__Group__0 ) )
            // InternalMSQLQueryParser.g:104:3: ( rule__WhatClause__Group__0 )
            {
             before(grammarAccess.getWhatClauseAccess().getGroup()); 
            // InternalMSQLQueryParser.g:105:3: ( rule__WhatClause__Group__0 )
            // InternalMSQLQueryParser.g:105:4: rule__WhatClause__Group__0
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
    // InternalMSQLQueryParser.g:114:1: entryRuleWhatDirective : ruleWhatDirective EOF ;
    public final void entryRuleWhatDirective() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:115:1: ( ruleWhatDirective EOF )
            // InternalMSQLQueryParser.g:116:1: ruleWhatDirective EOF
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
    // InternalMSQLQueryParser.g:123:1: ruleWhatDirective : ( ( rule__WhatDirective__Alternatives ) ) ;
    public final void ruleWhatDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:127:2: ( ( ( rule__WhatDirective__Alternatives ) ) )
            // InternalMSQLQueryParser.g:128:2: ( ( rule__WhatDirective__Alternatives ) )
            {
            // InternalMSQLQueryParser.g:128:2: ( ( rule__WhatDirective__Alternatives ) )
            // InternalMSQLQueryParser.g:129:3: ( rule__WhatDirective__Alternatives )
            {
             before(grammarAccess.getWhatDirectiveAccess().getAlternatives()); 
            // InternalMSQLQueryParser.g:130:3: ( rule__WhatDirective__Alternatives )
            // InternalMSQLQueryParser.g:130:4: rule__WhatDirective__Alternatives
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
    // InternalMSQLQueryParser.g:139:1: entryRuleAllColumnsWhatDirective : ruleAllColumnsWhatDirective EOF ;
    public final void entryRuleAllColumnsWhatDirective() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:140:1: ( ruleAllColumnsWhatDirective EOF )
            // InternalMSQLQueryParser.g:141:1: ruleAllColumnsWhatDirective EOF
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
    // InternalMSQLQueryParser.g:148:1: ruleAllColumnsWhatDirective : ( ( rule__AllColumnsWhatDirective__Group__0 ) ) ;
    public final void ruleAllColumnsWhatDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:152:2: ( ( ( rule__AllColumnsWhatDirective__Group__0 ) ) )
            // InternalMSQLQueryParser.g:153:2: ( ( rule__AllColumnsWhatDirective__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:153:2: ( ( rule__AllColumnsWhatDirective__Group__0 ) )
            // InternalMSQLQueryParser.g:154:3: ( rule__AllColumnsWhatDirective__Group__0 )
            {
             before(grammarAccess.getAllColumnsWhatDirectiveAccess().getGroup()); 
            // InternalMSQLQueryParser.g:155:3: ( rule__AllColumnsWhatDirective__Group__0 )
            // InternalMSQLQueryParser.g:155:4: rule__AllColumnsWhatDirective__Group__0
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
    // InternalMSQLQueryParser.g:164:1: entryRuleSingleColumnWhatDirective : ruleSingleColumnWhatDirective EOF ;
    public final void entryRuleSingleColumnWhatDirective() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:165:1: ( ruleSingleColumnWhatDirective EOF )
            // InternalMSQLQueryParser.g:166:1: ruleSingleColumnWhatDirective EOF
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
    // InternalMSQLQueryParser.g:173:1: ruleSingleColumnWhatDirective : ( ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment ) ) ;
    public final void ruleSingleColumnWhatDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:177:2: ( ( ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment ) ) )
            // InternalMSQLQueryParser.g:178:2: ( ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment ) )
            {
            // InternalMSQLQueryParser.g:178:2: ( ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment ) )
            // InternalMSQLQueryParser.g:179:3: ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment )
            {
             before(grammarAccess.getSingleColumnWhatDirectiveAccess().getColumnReferenceAssignment()); 
            // InternalMSQLQueryParser.g:180:3: ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment )
            // InternalMSQLQueryParser.g:180:4: rule__SingleColumnWhatDirective__ColumnReferenceAssignment
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
    // InternalMSQLQueryParser.g:189:1: entryRuleFromClause : ruleFromClause EOF ;
    public final void entryRuleFromClause() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:190:1: ( ruleFromClause EOF )
            // InternalMSQLQueryParser.g:191:1: ruleFromClause EOF
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
    // InternalMSQLQueryParser.g:198:1: ruleFromClause : ( ( rule__FromClause__Group__0 ) ) ;
    public final void ruleFromClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:202:2: ( ( ( rule__FromClause__Group__0 ) ) )
            // InternalMSQLQueryParser.g:203:2: ( ( rule__FromClause__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:203:2: ( ( rule__FromClause__Group__0 ) )
            // InternalMSQLQueryParser.g:204:3: ( rule__FromClause__Group__0 )
            {
             before(grammarAccess.getFromClauseAccess().getGroup()); 
            // InternalMSQLQueryParser.g:205:3: ( rule__FromClause__Group__0 )
            // InternalMSQLQueryParser.g:205:4: rule__FromClause__Group__0
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


    // $ANTLR start "entryRuleOrderByClause"
    // InternalMSQLQueryParser.g:214:1: entryRuleOrderByClause : ruleOrderByClause EOF ;
    public final void entryRuleOrderByClause() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:215:1: ( ruleOrderByClause EOF )
            // InternalMSQLQueryParser.g:216:1: ruleOrderByClause EOF
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
    // InternalMSQLQueryParser.g:223:1: ruleOrderByClause : ( ( rule__OrderByClause__Group__0 ) ) ;
    public final void ruleOrderByClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:227:2: ( ( ( rule__OrderByClause__Group__0 ) ) )
            // InternalMSQLQueryParser.g:228:2: ( ( rule__OrderByClause__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:228:2: ( ( rule__OrderByClause__Group__0 ) )
            // InternalMSQLQueryParser.g:229:3: ( rule__OrderByClause__Group__0 )
            {
             before(grammarAccess.getOrderByClauseAccess().getGroup()); 
            // InternalMSQLQueryParser.g:230:3: ( rule__OrderByClause__Group__0 )
            // InternalMSQLQueryParser.g:230:4: rule__OrderByClause__Group__0
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
    // InternalMSQLQueryParser.g:239:1: entryRuleOrderByDirective : ruleOrderByDirective EOF ;
    public final void entryRuleOrderByDirective() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:240:1: ( ruleOrderByDirective EOF )
            // InternalMSQLQueryParser.g:241:1: ruleOrderByDirective EOF
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
    // InternalMSQLQueryParser.g:248:1: ruleOrderByDirective : ( ( rule__OrderByDirective__Group__0 ) ) ;
    public final void ruleOrderByDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:252:2: ( ( ( rule__OrderByDirective__Group__0 ) ) )
            // InternalMSQLQueryParser.g:253:2: ( ( rule__OrderByDirective__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:253:2: ( ( rule__OrderByDirective__Group__0 ) )
            // InternalMSQLQueryParser.g:254:3: ( rule__OrderByDirective__Group__0 )
            {
             before(grammarAccess.getOrderByDirectiveAccess().getGroup()); 
            // InternalMSQLQueryParser.g:255:3: ( rule__OrderByDirective__Group__0 )
            // InternalMSQLQueryParser.g:255:4: rule__OrderByDirective__Group__0
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
    // InternalMSQLQueryParser.g:264:1: entryRuleColumnReference : ruleColumnReference EOF ;
    public final void entryRuleColumnReference() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:265:1: ( ruleColumnReference EOF )
            // InternalMSQLQueryParser.g:266:1: ruleColumnReference EOF
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
    // InternalMSQLQueryParser.g:273:1: ruleColumnReference : ( ( rule__ColumnReference__ColumnAssignment ) ) ;
    public final void ruleColumnReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:277:2: ( ( ( rule__ColumnReference__ColumnAssignment ) ) )
            // InternalMSQLQueryParser.g:278:2: ( ( rule__ColumnReference__ColumnAssignment ) )
            {
            // InternalMSQLQueryParser.g:278:2: ( ( rule__ColumnReference__ColumnAssignment ) )
            // InternalMSQLQueryParser.g:279:3: ( rule__ColumnReference__ColumnAssignment )
            {
             before(grammarAccess.getColumnReferenceAccess().getColumnAssignment()); 
            // InternalMSQLQueryParser.g:280:3: ( rule__ColumnReference__ColumnAssignment )
            // InternalMSQLQueryParser.g:280:4: rule__ColumnReference__ColumnAssignment
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


    // $ANTLR start "rule__WhatDirective__Alternatives"
    // InternalMSQLQueryParser.g:288:1: rule__WhatDirective__Alternatives : ( ( ruleAllColumnsWhatDirective ) | ( ruleSingleColumnWhatDirective ) );
    public final void rule__WhatDirective__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:292:1: ( ( ruleAllColumnsWhatDirective ) | ( ruleSingleColumnWhatDirective ) )
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
                    // InternalMSQLQueryParser.g:293:2: ( ruleAllColumnsWhatDirective )
                    {
                    // InternalMSQLQueryParser.g:293:2: ( ruleAllColumnsWhatDirective )
                    // InternalMSQLQueryParser.g:294:3: ruleAllColumnsWhatDirective
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
                    // InternalMSQLQueryParser.g:299:2: ( ruleSingleColumnWhatDirective )
                    {
                    // InternalMSQLQueryParser.g:299:2: ( ruleSingleColumnWhatDirective )
                    // InternalMSQLQueryParser.g:300:3: ruleSingleColumnWhatDirective
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


    // $ANTLR start "rule__OrderByDirective__AscendingAlternatives_1_0"
    // InternalMSQLQueryParser.g:309:1: rule__OrderByDirective__AscendingAlternatives_1_0 : ( ( ASC ) | ( DESC ) );
    public final void rule__OrderByDirective__AscendingAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:313:1: ( ( ASC ) | ( DESC ) )
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
                    // InternalMSQLQueryParser.g:314:2: ( ASC )
                    {
                    // InternalMSQLQueryParser.g:314:2: ( ASC )
                    // InternalMSQLQueryParser.g:315:3: ASC
                    {
                     before(grammarAccess.getOrderByDirectiveAccess().getAscendingASCKeyword_1_0_0()); 
                    match(input,ASC,FOLLOW_2); 
                     after(grammarAccess.getOrderByDirectiveAccess().getAscendingASCKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:320:2: ( DESC )
                    {
                    // InternalMSQLQueryParser.g:320:2: ( DESC )
                    // InternalMSQLQueryParser.g:321:3: DESC
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


    // $ANTLR start "rule__SelectQuery__Group__0"
    // InternalMSQLQueryParser.g:330:1: rule__SelectQuery__Group__0 : rule__SelectQuery__Group__0__Impl rule__SelectQuery__Group__1 ;
    public final void rule__SelectQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:334:1: ( rule__SelectQuery__Group__0__Impl rule__SelectQuery__Group__1 )
            // InternalMSQLQueryParser.g:335:2: rule__SelectQuery__Group__0__Impl rule__SelectQuery__Group__1
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
    // InternalMSQLQueryParser.g:342:1: rule__SelectQuery__Group__0__Impl : ( SELECT ) ;
    public final void rule__SelectQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:346:1: ( ( SELECT ) )
            // InternalMSQLQueryParser.g:347:1: ( SELECT )
            {
            // InternalMSQLQueryParser.g:347:1: ( SELECT )
            // InternalMSQLQueryParser.g:348:2: SELECT
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
    // InternalMSQLQueryParser.g:357:1: rule__SelectQuery__Group__1 : rule__SelectQuery__Group__1__Impl rule__SelectQuery__Group__2 ;
    public final void rule__SelectQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:361:1: ( rule__SelectQuery__Group__1__Impl rule__SelectQuery__Group__2 )
            // InternalMSQLQueryParser.g:362:2: rule__SelectQuery__Group__1__Impl rule__SelectQuery__Group__2
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
    // InternalMSQLQueryParser.g:369:1: rule__SelectQuery__Group__1__Impl : ( ( rule__SelectQuery__WhatClauseAssignment_1 ) ) ;
    public final void rule__SelectQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:373:1: ( ( ( rule__SelectQuery__WhatClauseAssignment_1 ) ) )
            // InternalMSQLQueryParser.g:374:1: ( ( rule__SelectQuery__WhatClauseAssignment_1 ) )
            {
            // InternalMSQLQueryParser.g:374:1: ( ( rule__SelectQuery__WhatClauseAssignment_1 ) )
            // InternalMSQLQueryParser.g:375:2: ( rule__SelectQuery__WhatClauseAssignment_1 )
            {
             before(grammarAccess.getSelectQueryAccess().getWhatClauseAssignment_1()); 
            // InternalMSQLQueryParser.g:376:2: ( rule__SelectQuery__WhatClauseAssignment_1 )
            // InternalMSQLQueryParser.g:376:3: rule__SelectQuery__WhatClauseAssignment_1
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
    // InternalMSQLQueryParser.g:384:1: rule__SelectQuery__Group__2 : rule__SelectQuery__Group__2__Impl rule__SelectQuery__Group__3 ;
    public final void rule__SelectQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:388:1: ( rule__SelectQuery__Group__2__Impl rule__SelectQuery__Group__3 )
            // InternalMSQLQueryParser.g:389:2: rule__SelectQuery__Group__2__Impl rule__SelectQuery__Group__3
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
    // InternalMSQLQueryParser.g:396:1: rule__SelectQuery__Group__2__Impl : ( ( rule__SelectQuery__FromClauseAssignment_2 ) ) ;
    public final void rule__SelectQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:400:1: ( ( ( rule__SelectQuery__FromClauseAssignment_2 ) ) )
            // InternalMSQLQueryParser.g:401:1: ( ( rule__SelectQuery__FromClauseAssignment_2 ) )
            {
            // InternalMSQLQueryParser.g:401:1: ( ( rule__SelectQuery__FromClauseAssignment_2 ) )
            // InternalMSQLQueryParser.g:402:2: ( rule__SelectQuery__FromClauseAssignment_2 )
            {
             before(grammarAccess.getSelectQueryAccess().getFromClauseAssignment_2()); 
            // InternalMSQLQueryParser.g:403:2: ( rule__SelectQuery__FromClauseAssignment_2 )
            // InternalMSQLQueryParser.g:403:3: rule__SelectQuery__FromClauseAssignment_2
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
    // InternalMSQLQueryParser.g:411:1: rule__SelectQuery__Group__3 : rule__SelectQuery__Group__3__Impl rule__SelectQuery__Group__4 ;
    public final void rule__SelectQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:415:1: ( rule__SelectQuery__Group__3__Impl rule__SelectQuery__Group__4 )
            // InternalMSQLQueryParser.g:416:2: rule__SelectQuery__Group__3__Impl rule__SelectQuery__Group__4
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
    // InternalMSQLQueryParser.g:423:1: rule__SelectQuery__Group__3__Impl : ( ( rule__SelectQuery__OrderByClauseAssignment_3 )? ) ;
    public final void rule__SelectQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:427:1: ( ( ( rule__SelectQuery__OrderByClauseAssignment_3 )? ) )
            // InternalMSQLQueryParser.g:428:1: ( ( rule__SelectQuery__OrderByClauseAssignment_3 )? )
            {
            // InternalMSQLQueryParser.g:428:1: ( ( rule__SelectQuery__OrderByClauseAssignment_3 )? )
            // InternalMSQLQueryParser.g:429:2: ( rule__SelectQuery__OrderByClauseAssignment_3 )?
            {
             before(grammarAccess.getSelectQueryAccess().getOrderByClauseAssignment_3()); 
            // InternalMSQLQueryParser.g:430:2: ( rule__SelectQuery__OrderByClauseAssignment_3 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ORDER) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMSQLQueryParser.g:430:3: rule__SelectQuery__OrderByClauseAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectQuery__OrderByClauseAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectQueryAccess().getOrderByClauseAssignment_3()); 

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
    // InternalMSQLQueryParser.g:438:1: rule__SelectQuery__Group__4 : rule__SelectQuery__Group__4__Impl ;
    public final void rule__SelectQuery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:442:1: ( rule__SelectQuery__Group__4__Impl )
            // InternalMSQLQueryParser.g:443:2: rule__SelectQuery__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectQuery__Group__4__Impl();

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
    // InternalMSQLQueryParser.g:449:1: rule__SelectQuery__Group__4__Impl : ( Semicolon ) ;
    public final void rule__SelectQuery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:453:1: ( ( Semicolon ) )
            // InternalMSQLQueryParser.g:454:1: ( Semicolon )
            {
            // InternalMSQLQueryParser.g:454:1: ( Semicolon )
            // InternalMSQLQueryParser.g:455:2: Semicolon
            {
             before(grammarAccess.getSelectQueryAccess().getSemicolonKeyword_4()); 
            match(input,Semicolon,FOLLOW_2); 
             after(grammarAccess.getSelectQueryAccess().getSemicolonKeyword_4()); 

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


    // $ANTLR start "rule__WhatClause__Group__0"
    // InternalMSQLQueryParser.g:465:1: rule__WhatClause__Group__0 : rule__WhatClause__Group__0__Impl rule__WhatClause__Group__1 ;
    public final void rule__WhatClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:469:1: ( rule__WhatClause__Group__0__Impl rule__WhatClause__Group__1 )
            // InternalMSQLQueryParser.g:470:2: rule__WhatClause__Group__0__Impl rule__WhatClause__Group__1
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
    // InternalMSQLQueryParser.g:477:1: rule__WhatClause__Group__0__Impl : ( ( rule__WhatClause__WhatDirectiveAssignment_0 ) ) ;
    public final void rule__WhatClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:481:1: ( ( ( rule__WhatClause__WhatDirectiveAssignment_0 ) ) )
            // InternalMSQLQueryParser.g:482:1: ( ( rule__WhatClause__WhatDirectiveAssignment_0 ) )
            {
            // InternalMSQLQueryParser.g:482:1: ( ( rule__WhatClause__WhatDirectiveAssignment_0 ) )
            // InternalMSQLQueryParser.g:483:2: ( rule__WhatClause__WhatDirectiveAssignment_0 )
            {
             before(grammarAccess.getWhatClauseAccess().getWhatDirectiveAssignment_0()); 
            // InternalMSQLQueryParser.g:484:2: ( rule__WhatClause__WhatDirectiveAssignment_0 )
            // InternalMSQLQueryParser.g:484:3: rule__WhatClause__WhatDirectiveAssignment_0
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
    // InternalMSQLQueryParser.g:492:1: rule__WhatClause__Group__1 : rule__WhatClause__Group__1__Impl ;
    public final void rule__WhatClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:496:1: ( rule__WhatClause__Group__1__Impl )
            // InternalMSQLQueryParser.g:497:2: rule__WhatClause__Group__1__Impl
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
    // InternalMSQLQueryParser.g:503:1: rule__WhatClause__Group__1__Impl : ( ( rule__WhatClause__Group_1__0 )* ) ;
    public final void rule__WhatClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:507:1: ( ( ( rule__WhatClause__Group_1__0 )* ) )
            // InternalMSQLQueryParser.g:508:1: ( ( rule__WhatClause__Group_1__0 )* )
            {
            // InternalMSQLQueryParser.g:508:1: ( ( rule__WhatClause__Group_1__0 )* )
            // InternalMSQLQueryParser.g:509:2: ( rule__WhatClause__Group_1__0 )*
            {
             before(grammarAccess.getWhatClauseAccess().getGroup_1()); 
            // InternalMSQLQueryParser.g:510:2: ( rule__WhatClause__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==Comma) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:510:3: rule__WhatClause__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__WhatClause__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalMSQLQueryParser.g:519:1: rule__WhatClause__Group_1__0 : rule__WhatClause__Group_1__0__Impl rule__WhatClause__Group_1__1 ;
    public final void rule__WhatClause__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:523:1: ( rule__WhatClause__Group_1__0__Impl rule__WhatClause__Group_1__1 )
            // InternalMSQLQueryParser.g:524:2: rule__WhatClause__Group_1__0__Impl rule__WhatClause__Group_1__1
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
    // InternalMSQLQueryParser.g:531:1: rule__WhatClause__Group_1__0__Impl : ( Comma ) ;
    public final void rule__WhatClause__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:535:1: ( ( Comma ) )
            // InternalMSQLQueryParser.g:536:1: ( Comma )
            {
            // InternalMSQLQueryParser.g:536:1: ( Comma )
            // InternalMSQLQueryParser.g:537:2: Comma
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
    // InternalMSQLQueryParser.g:546:1: rule__WhatClause__Group_1__1 : rule__WhatClause__Group_1__1__Impl ;
    public final void rule__WhatClause__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:550:1: ( rule__WhatClause__Group_1__1__Impl )
            // InternalMSQLQueryParser.g:551:2: rule__WhatClause__Group_1__1__Impl
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
    // InternalMSQLQueryParser.g:557:1: rule__WhatClause__Group_1__1__Impl : ( ( rule__WhatClause__WhatDirectiveAssignment_1_1 ) ) ;
    public final void rule__WhatClause__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:561:1: ( ( ( rule__WhatClause__WhatDirectiveAssignment_1_1 ) ) )
            // InternalMSQLQueryParser.g:562:1: ( ( rule__WhatClause__WhatDirectiveAssignment_1_1 ) )
            {
            // InternalMSQLQueryParser.g:562:1: ( ( rule__WhatClause__WhatDirectiveAssignment_1_1 ) )
            // InternalMSQLQueryParser.g:563:2: ( rule__WhatClause__WhatDirectiveAssignment_1_1 )
            {
             before(grammarAccess.getWhatClauseAccess().getWhatDirectiveAssignment_1_1()); 
            // InternalMSQLQueryParser.g:564:2: ( rule__WhatClause__WhatDirectiveAssignment_1_1 )
            // InternalMSQLQueryParser.g:564:3: rule__WhatClause__WhatDirectiveAssignment_1_1
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
    // InternalMSQLQueryParser.g:573:1: rule__AllColumnsWhatDirective__Group__0 : rule__AllColumnsWhatDirective__Group__0__Impl rule__AllColumnsWhatDirective__Group__1 ;
    public final void rule__AllColumnsWhatDirective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:577:1: ( rule__AllColumnsWhatDirective__Group__0__Impl rule__AllColumnsWhatDirective__Group__1 )
            // InternalMSQLQueryParser.g:578:2: rule__AllColumnsWhatDirective__Group__0__Impl rule__AllColumnsWhatDirective__Group__1
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
    // InternalMSQLQueryParser.g:585:1: rule__AllColumnsWhatDirective__Group__0__Impl : ( Asterisk ) ;
    public final void rule__AllColumnsWhatDirective__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:589:1: ( ( Asterisk ) )
            // InternalMSQLQueryParser.g:590:1: ( Asterisk )
            {
            // InternalMSQLQueryParser.g:590:1: ( Asterisk )
            // InternalMSQLQueryParser.g:591:2: Asterisk
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
    // InternalMSQLQueryParser.g:600:1: rule__AllColumnsWhatDirective__Group__1 : rule__AllColumnsWhatDirective__Group__1__Impl ;
    public final void rule__AllColumnsWhatDirective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:604:1: ( rule__AllColumnsWhatDirective__Group__1__Impl )
            // InternalMSQLQueryParser.g:605:2: rule__AllColumnsWhatDirective__Group__1__Impl
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
    // InternalMSQLQueryParser.g:611:1: rule__AllColumnsWhatDirective__Group__1__Impl : ( () ) ;
    public final void rule__AllColumnsWhatDirective__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:615:1: ( ( () ) )
            // InternalMSQLQueryParser.g:616:1: ( () )
            {
            // InternalMSQLQueryParser.g:616:1: ( () )
            // InternalMSQLQueryParser.g:617:2: ()
            {
             before(grammarAccess.getAllColumnsWhatDirectiveAccess().getAllColumnsWhatDirectiveAction_1()); 
            // InternalMSQLQueryParser.g:618:2: ()
            // InternalMSQLQueryParser.g:618:3: 
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
    // InternalMSQLQueryParser.g:627:1: rule__FromClause__Group__0 : rule__FromClause__Group__0__Impl rule__FromClause__Group__1 ;
    public final void rule__FromClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:631:1: ( rule__FromClause__Group__0__Impl rule__FromClause__Group__1 )
            // InternalMSQLQueryParser.g:632:2: rule__FromClause__Group__0__Impl rule__FromClause__Group__1
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
    // InternalMSQLQueryParser.g:639:1: rule__FromClause__Group__0__Impl : ( FROM ) ;
    public final void rule__FromClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:643:1: ( ( FROM ) )
            // InternalMSQLQueryParser.g:644:1: ( FROM )
            {
            // InternalMSQLQueryParser.g:644:1: ( FROM )
            // InternalMSQLQueryParser.g:645:2: FROM
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
    // InternalMSQLQueryParser.g:654:1: rule__FromClause__Group__1 : rule__FromClause__Group__1__Impl ;
    public final void rule__FromClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:658:1: ( rule__FromClause__Group__1__Impl )
            // InternalMSQLQueryParser.g:659:2: rule__FromClause__Group__1__Impl
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
    // InternalMSQLQueryParser.g:665:1: rule__FromClause__Group__1__Impl : ( ( rule__FromClause__TableAssignment_1 ) ) ;
    public final void rule__FromClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:669:1: ( ( ( rule__FromClause__TableAssignment_1 ) ) )
            // InternalMSQLQueryParser.g:670:1: ( ( rule__FromClause__TableAssignment_1 ) )
            {
            // InternalMSQLQueryParser.g:670:1: ( ( rule__FromClause__TableAssignment_1 ) )
            // InternalMSQLQueryParser.g:671:2: ( rule__FromClause__TableAssignment_1 )
            {
             before(grammarAccess.getFromClauseAccess().getTableAssignment_1()); 
            // InternalMSQLQueryParser.g:672:2: ( rule__FromClause__TableAssignment_1 )
            // InternalMSQLQueryParser.g:672:3: rule__FromClause__TableAssignment_1
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


    // $ANTLR start "rule__OrderByClause__Group__0"
    // InternalMSQLQueryParser.g:681:1: rule__OrderByClause__Group__0 : rule__OrderByClause__Group__0__Impl rule__OrderByClause__Group__1 ;
    public final void rule__OrderByClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:685:1: ( rule__OrderByClause__Group__0__Impl rule__OrderByClause__Group__1 )
            // InternalMSQLQueryParser.g:686:2: rule__OrderByClause__Group__0__Impl rule__OrderByClause__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMSQLQueryParser.g:693:1: rule__OrderByClause__Group__0__Impl : ( ORDER ) ;
    public final void rule__OrderByClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:697:1: ( ( ORDER ) )
            // InternalMSQLQueryParser.g:698:1: ( ORDER )
            {
            // InternalMSQLQueryParser.g:698:1: ( ORDER )
            // InternalMSQLQueryParser.g:699:2: ORDER
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
    // InternalMSQLQueryParser.g:708:1: rule__OrderByClause__Group__1 : rule__OrderByClause__Group__1__Impl rule__OrderByClause__Group__2 ;
    public final void rule__OrderByClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:712:1: ( rule__OrderByClause__Group__1__Impl rule__OrderByClause__Group__2 )
            // InternalMSQLQueryParser.g:713:2: rule__OrderByClause__Group__1__Impl rule__OrderByClause__Group__2
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
    // InternalMSQLQueryParser.g:720:1: rule__OrderByClause__Group__1__Impl : ( BY ) ;
    public final void rule__OrderByClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:724:1: ( ( BY ) )
            // InternalMSQLQueryParser.g:725:1: ( BY )
            {
            // InternalMSQLQueryParser.g:725:1: ( BY )
            // InternalMSQLQueryParser.g:726:2: BY
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
    // InternalMSQLQueryParser.g:735:1: rule__OrderByClause__Group__2 : rule__OrderByClause__Group__2__Impl rule__OrderByClause__Group__3 ;
    public final void rule__OrderByClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:739:1: ( rule__OrderByClause__Group__2__Impl rule__OrderByClause__Group__3 )
            // InternalMSQLQueryParser.g:740:2: rule__OrderByClause__Group__2__Impl rule__OrderByClause__Group__3
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
    // InternalMSQLQueryParser.g:747:1: rule__OrderByClause__Group__2__Impl : ( ( rule__OrderByClause__OrderDirectivesAssignment_2 ) ) ;
    public final void rule__OrderByClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:751:1: ( ( ( rule__OrderByClause__OrderDirectivesAssignment_2 ) ) )
            // InternalMSQLQueryParser.g:752:1: ( ( rule__OrderByClause__OrderDirectivesAssignment_2 ) )
            {
            // InternalMSQLQueryParser.g:752:1: ( ( rule__OrderByClause__OrderDirectivesAssignment_2 ) )
            // InternalMSQLQueryParser.g:753:2: ( rule__OrderByClause__OrderDirectivesAssignment_2 )
            {
             before(grammarAccess.getOrderByClauseAccess().getOrderDirectivesAssignment_2()); 
            // InternalMSQLQueryParser.g:754:2: ( rule__OrderByClause__OrderDirectivesAssignment_2 )
            // InternalMSQLQueryParser.g:754:3: rule__OrderByClause__OrderDirectivesAssignment_2
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
    // InternalMSQLQueryParser.g:762:1: rule__OrderByClause__Group__3 : rule__OrderByClause__Group__3__Impl ;
    public final void rule__OrderByClause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:766:1: ( rule__OrderByClause__Group__3__Impl )
            // InternalMSQLQueryParser.g:767:2: rule__OrderByClause__Group__3__Impl
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
    // InternalMSQLQueryParser.g:773:1: rule__OrderByClause__Group__3__Impl : ( ( rule__OrderByClause__Group_3__0 )* ) ;
    public final void rule__OrderByClause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:777:1: ( ( ( rule__OrderByClause__Group_3__0 )* ) )
            // InternalMSQLQueryParser.g:778:1: ( ( rule__OrderByClause__Group_3__0 )* )
            {
            // InternalMSQLQueryParser.g:778:1: ( ( rule__OrderByClause__Group_3__0 )* )
            // InternalMSQLQueryParser.g:779:2: ( rule__OrderByClause__Group_3__0 )*
            {
             before(grammarAccess.getOrderByClauseAccess().getGroup_3()); 
            // InternalMSQLQueryParser.g:780:2: ( rule__OrderByClause__Group_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Comma) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:780:3: rule__OrderByClause__Group_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__OrderByClause__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalMSQLQueryParser.g:789:1: rule__OrderByClause__Group_3__0 : rule__OrderByClause__Group_3__0__Impl rule__OrderByClause__Group_3__1 ;
    public final void rule__OrderByClause__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:793:1: ( rule__OrderByClause__Group_3__0__Impl rule__OrderByClause__Group_3__1 )
            // InternalMSQLQueryParser.g:794:2: rule__OrderByClause__Group_3__0__Impl rule__OrderByClause__Group_3__1
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
    // InternalMSQLQueryParser.g:801:1: rule__OrderByClause__Group_3__0__Impl : ( Comma ) ;
    public final void rule__OrderByClause__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:805:1: ( ( Comma ) )
            // InternalMSQLQueryParser.g:806:1: ( Comma )
            {
            // InternalMSQLQueryParser.g:806:1: ( Comma )
            // InternalMSQLQueryParser.g:807:2: Comma
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
    // InternalMSQLQueryParser.g:816:1: rule__OrderByClause__Group_3__1 : rule__OrderByClause__Group_3__1__Impl ;
    public final void rule__OrderByClause__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:820:1: ( rule__OrderByClause__Group_3__1__Impl )
            // InternalMSQLQueryParser.g:821:2: rule__OrderByClause__Group_3__1__Impl
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
    // InternalMSQLQueryParser.g:827:1: rule__OrderByClause__Group_3__1__Impl : ( ( rule__OrderByClause__OrderDirectivesAssignment_3_1 ) ) ;
    public final void rule__OrderByClause__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:831:1: ( ( ( rule__OrderByClause__OrderDirectivesAssignment_3_1 ) ) )
            // InternalMSQLQueryParser.g:832:1: ( ( rule__OrderByClause__OrderDirectivesAssignment_3_1 ) )
            {
            // InternalMSQLQueryParser.g:832:1: ( ( rule__OrderByClause__OrderDirectivesAssignment_3_1 ) )
            // InternalMSQLQueryParser.g:833:2: ( rule__OrderByClause__OrderDirectivesAssignment_3_1 )
            {
             before(grammarAccess.getOrderByClauseAccess().getOrderDirectivesAssignment_3_1()); 
            // InternalMSQLQueryParser.g:834:2: ( rule__OrderByClause__OrderDirectivesAssignment_3_1 )
            // InternalMSQLQueryParser.g:834:3: rule__OrderByClause__OrderDirectivesAssignment_3_1
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
    // InternalMSQLQueryParser.g:843:1: rule__OrderByDirective__Group__0 : rule__OrderByDirective__Group__0__Impl rule__OrderByDirective__Group__1 ;
    public final void rule__OrderByDirective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:847:1: ( rule__OrderByDirective__Group__0__Impl rule__OrderByDirective__Group__1 )
            // InternalMSQLQueryParser.g:848:2: rule__OrderByDirective__Group__0__Impl rule__OrderByDirective__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMSQLQueryParser.g:855:1: rule__OrderByDirective__Group__0__Impl : ( ( rule__OrderByDirective__ColumnReferenceAssignment_0 ) ) ;
    public final void rule__OrderByDirective__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:859:1: ( ( ( rule__OrderByDirective__ColumnReferenceAssignment_0 ) ) )
            // InternalMSQLQueryParser.g:860:1: ( ( rule__OrderByDirective__ColumnReferenceAssignment_0 ) )
            {
            // InternalMSQLQueryParser.g:860:1: ( ( rule__OrderByDirective__ColumnReferenceAssignment_0 ) )
            // InternalMSQLQueryParser.g:861:2: ( rule__OrderByDirective__ColumnReferenceAssignment_0 )
            {
             before(grammarAccess.getOrderByDirectiveAccess().getColumnReferenceAssignment_0()); 
            // InternalMSQLQueryParser.g:862:2: ( rule__OrderByDirective__ColumnReferenceAssignment_0 )
            // InternalMSQLQueryParser.g:862:3: rule__OrderByDirective__ColumnReferenceAssignment_0
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
    // InternalMSQLQueryParser.g:870:1: rule__OrderByDirective__Group__1 : rule__OrderByDirective__Group__1__Impl ;
    public final void rule__OrderByDirective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:874:1: ( rule__OrderByDirective__Group__1__Impl )
            // InternalMSQLQueryParser.g:875:2: rule__OrderByDirective__Group__1__Impl
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
    // InternalMSQLQueryParser.g:881:1: rule__OrderByDirective__Group__1__Impl : ( ( rule__OrderByDirective__AscendingAssignment_1 )? ) ;
    public final void rule__OrderByDirective__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:885:1: ( ( ( rule__OrderByDirective__AscendingAssignment_1 )? ) )
            // InternalMSQLQueryParser.g:886:1: ( ( rule__OrderByDirective__AscendingAssignment_1 )? )
            {
            // InternalMSQLQueryParser.g:886:1: ( ( rule__OrderByDirective__AscendingAssignment_1 )? )
            // InternalMSQLQueryParser.g:887:2: ( rule__OrderByDirective__AscendingAssignment_1 )?
            {
             before(grammarAccess.getOrderByDirectiveAccess().getAscendingAssignment_1()); 
            // InternalMSQLQueryParser.g:888:2: ( rule__OrderByDirective__AscendingAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==DESC||LA6_0==ASC) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMSQLQueryParser.g:888:3: rule__OrderByDirective__AscendingAssignment_1
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
    // InternalMSQLQueryParser.g:897:1: rule__SelectQuery__WhatClauseAssignment_1 : ( ruleWhatClause ) ;
    public final void rule__SelectQuery__WhatClauseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:901:1: ( ( ruleWhatClause ) )
            // InternalMSQLQueryParser.g:902:2: ( ruleWhatClause )
            {
            // InternalMSQLQueryParser.g:902:2: ( ruleWhatClause )
            // InternalMSQLQueryParser.g:903:3: ruleWhatClause
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
    // InternalMSQLQueryParser.g:912:1: rule__SelectQuery__FromClauseAssignment_2 : ( ruleFromClause ) ;
    public final void rule__SelectQuery__FromClauseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:916:1: ( ( ruleFromClause ) )
            // InternalMSQLQueryParser.g:917:2: ( ruleFromClause )
            {
            // InternalMSQLQueryParser.g:917:2: ( ruleFromClause )
            // InternalMSQLQueryParser.g:918:3: ruleFromClause
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


    // $ANTLR start "rule__SelectQuery__OrderByClauseAssignment_3"
    // InternalMSQLQueryParser.g:927:1: rule__SelectQuery__OrderByClauseAssignment_3 : ( ruleOrderByClause ) ;
    public final void rule__SelectQuery__OrderByClauseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:931:1: ( ( ruleOrderByClause ) )
            // InternalMSQLQueryParser.g:932:2: ( ruleOrderByClause )
            {
            // InternalMSQLQueryParser.g:932:2: ( ruleOrderByClause )
            // InternalMSQLQueryParser.g:933:3: ruleOrderByClause
            {
             before(grammarAccess.getSelectQueryAccess().getOrderByClauseOrderByClauseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOrderByClause();

            state._fsp--;

             after(grammarAccess.getSelectQueryAccess().getOrderByClauseOrderByClauseParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SelectQuery__OrderByClauseAssignment_3"


    // $ANTLR start "rule__WhatClause__WhatDirectiveAssignment_0"
    // InternalMSQLQueryParser.g:942:1: rule__WhatClause__WhatDirectiveAssignment_0 : ( ruleWhatDirective ) ;
    public final void rule__WhatClause__WhatDirectiveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:946:1: ( ( ruleWhatDirective ) )
            // InternalMSQLQueryParser.g:947:2: ( ruleWhatDirective )
            {
            // InternalMSQLQueryParser.g:947:2: ( ruleWhatDirective )
            // InternalMSQLQueryParser.g:948:3: ruleWhatDirective
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
    // InternalMSQLQueryParser.g:957:1: rule__WhatClause__WhatDirectiveAssignment_1_1 : ( ruleWhatDirective ) ;
    public final void rule__WhatClause__WhatDirectiveAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:961:1: ( ( ruleWhatDirective ) )
            // InternalMSQLQueryParser.g:962:2: ( ruleWhatDirective )
            {
            // InternalMSQLQueryParser.g:962:2: ( ruleWhatDirective )
            // InternalMSQLQueryParser.g:963:3: ruleWhatDirective
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
    // InternalMSQLQueryParser.g:972:1: rule__SingleColumnWhatDirective__ColumnReferenceAssignment : ( ruleColumnReference ) ;
    public final void rule__SingleColumnWhatDirective__ColumnReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:976:1: ( ( ruleColumnReference ) )
            // InternalMSQLQueryParser.g:977:2: ( ruleColumnReference )
            {
            // InternalMSQLQueryParser.g:977:2: ( ruleColumnReference )
            // InternalMSQLQueryParser.g:978:3: ruleColumnReference
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
    // InternalMSQLQueryParser.g:987:1: rule__FromClause__TableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FromClause__TableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:991:1: ( ( ( RULE_ID ) ) )
            // InternalMSQLQueryParser.g:992:2: ( ( RULE_ID ) )
            {
            // InternalMSQLQueryParser.g:992:2: ( ( RULE_ID ) )
            // InternalMSQLQueryParser.g:993:3: ( RULE_ID )
            {
             before(grammarAccess.getFromClauseAccess().getTableTableCrossReference_1_0()); 
            // InternalMSQLQueryParser.g:994:3: ( RULE_ID )
            // InternalMSQLQueryParser.g:995:4: RULE_ID
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


    // $ANTLR start "rule__OrderByClause__OrderDirectivesAssignment_2"
    // InternalMSQLQueryParser.g:1006:1: rule__OrderByClause__OrderDirectivesAssignment_2 : ( ruleOrderByDirective ) ;
    public final void rule__OrderByClause__OrderDirectivesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1010:1: ( ( ruleOrderByDirective ) )
            // InternalMSQLQueryParser.g:1011:2: ( ruleOrderByDirective )
            {
            // InternalMSQLQueryParser.g:1011:2: ( ruleOrderByDirective )
            // InternalMSQLQueryParser.g:1012:3: ruleOrderByDirective
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
    // InternalMSQLQueryParser.g:1021:1: rule__OrderByClause__OrderDirectivesAssignment_3_1 : ( ruleOrderByDirective ) ;
    public final void rule__OrderByClause__OrderDirectivesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1025:1: ( ( ruleOrderByDirective ) )
            // InternalMSQLQueryParser.g:1026:2: ( ruleOrderByDirective )
            {
            // InternalMSQLQueryParser.g:1026:2: ( ruleOrderByDirective )
            // InternalMSQLQueryParser.g:1027:3: ruleOrderByDirective
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
    // InternalMSQLQueryParser.g:1036:1: rule__OrderByDirective__ColumnReferenceAssignment_0 : ( ruleColumnReference ) ;
    public final void rule__OrderByDirective__ColumnReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1040:1: ( ( ruleColumnReference ) )
            // InternalMSQLQueryParser.g:1041:2: ( ruleColumnReference )
            {
            // InternalMSQLQueryParser.g:1041:2: ( ruleColumnReference )
            // InternalMSQLQueryParser.g:1042:3: ruleColumnReference
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
    // InternalMSQLQueryParser.g:1051:1: rule__OrderByDirective__AscendingAssignment_1 : ( ( rule__OrderByDirective__AscendingAlternatives_1_0 ) ) ;
    public final void rule__OrderByDirective__AscendingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1055:1: ( ( ( rule__OrderByDirective__AscendingAlternatives_1_0 ) ) )
            // InternalMSQLQueryParser.g:1056:2: ( ( rule__OrderByDirective__AscendingAlternatives_1_0 ) )
            {
            // InternalMSQLQueryParser.g:1056:2: ( ( rule__OrderByDirective__AscendingAlternatives_1_0 ) )
            // InternalMSQLQueryParser.g:1057:3: ( rule__OrderByDirective__AscendingAlternatives_1_0 )
            {
             before(grammarAccess.getOrderByDirectiveAccess().getAscendingAlternatives_1_0()); 
            // InternalMSQLQueryParser.g:1058:3: ( rule__OrderByDirective__AscendingAlternatives_1_0 )
            // InternalMSQLQueryParser.g:1058:4: rule__OrderByDirective__AscendingAlternatives_1_0
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
    // InternalMSQLQueryParser.g:1066:1: rule__ColumnReference__ColumnAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ColumnReference__ColumnAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1070:1: ( ( ( RULE_ID ) ) )
            // InternalMSQLQueryParser.g:1071:2: ( ( RULE_ID ) )
            {
            // InternalMSQLQueryParser.g:1071:2: ( ( RULE_ID ) )
            // InternalMSQLQueryParser.g:1072:3: ( RULE_ID )
            {
             before(grammarAccess.getColumnReferenceAccess().getColumnColumnCrossReference_0()); 
            // InternalMSQLQueryParser.g:1073:3: ( RULE_ID )
            // InternalMSQLQueryParser.g:1074:4: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002400L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000140L});

}