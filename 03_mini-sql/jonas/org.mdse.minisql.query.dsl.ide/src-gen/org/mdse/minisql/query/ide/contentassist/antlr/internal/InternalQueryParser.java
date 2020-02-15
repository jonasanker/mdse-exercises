package org.mdse.minisql.query.ide.contentassist.antlr.internal;

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
import org.mdse.minisql.query.services.QueryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQueryParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ASC'", "'DESC'", "'SELECT'", "';'", "','", "'*'", "'FROM'", "'ORDER'", "'BY'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalQueryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQueryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQueryParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQuery.g"; }


    	private QueryGrammarAccess grammarAccess;

    	public void setGrammarAccess(QueryGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSelectQuery"
    // InternalQuery.g:53:1: entryRuleSelectQuery : ruleSelectQuery EOF ;
    public final void entryRuleSelectQuery() throws RecognitionException {
        try {
            // InternalQuery.g:54:1: ( ruleSelectQuery EOF )
            // InternalQuery.g:55:1: ruleSelectQuery EOF
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
    // InternalQuery.g:62:1: ruleSelectQuery : ( ( rule__SelectQuery__Group__0 ) ) ;
    public final void ruleSelectQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:66:2: ( ( ( rule__SelectQuery__Group__0 ) ) )
            // InternalQuery.g:67:2: ( ( rule__SelectQuery__Group__0 ) )
            {
            // InternalQuery.g:67:2: ( ( rule__SelectQuery__Group__0 ) )
            // InternalQuery.g:68:3: ( rule__SelectQuery__Group__0 )
            {
             before(grammarAccess.getSelectQueryAccess().getGroup()); 
            // InternalQuery.g:69:3: ( rule__SelectQuery__Group__0 )
            // InternalQuery.g:69:4: rule__SelectQuery__Group__0
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
    // InternalQuery.g:78:1: entryRuleWhatClause : ruleWhatClause EOF ;
    public final void entryRuleWhatClause() throws RecognitionException {
        try {
            // InternalQuery.g:79:1: ( ruleWhatClause EOF )
            // InternalQuery.g:80:1: ruleWhatClause EOF
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
    // InternalQuery.g:87:1: ruleWhatClause : ( ( rule__WhatClause__Group__0 ) ) ;
    public final void ruleWhatClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:91:2: ( ( ( rule__WhatClause__Group__0 ) ) )
            // InternalQuery.g:92:2: ( ( rule__WhatClause__Group__0 ) )
            {
            // InternalQuery.g:92:2: ( ( rule__WhatClause__Group__0 ) )
            // InternalQuery.g:93:3: ( rule__WhatClause__Group__0 )
            {
             before(grammarAccess.getWhatClauseAccess().getGroup()); 
            // InternalQuery.g:94:3: ( rule__WhatClause__Group__0 )
            // InternalQuery.g:94:4: rule__WhatClause__Group__0
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
    // InternalQuery.g:103:1: entryRuleWhatDirective : ruleWhatDirective EOF ;
    public final void entryRuleWhatDirective() throws RecognitionException {
        try {
            // InternalQuery.g:104:1: ( ruleWhatDirective EOF )
            // InternalQuery.g:105:1: ruleWhatDirective EOF
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
    // InternalQuery.g:112:1: ruleWhatDirective : ( ( rule__WhatDirective__Alternatives ) ) ;
    public final void ruleWhatDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:116:2: ( ( ( rule__WhatDirective__Alternatives ) ) )
            // InternalQuery.g:117:2: ( ( rule__WhatDirective__Alternatives ) )
            {
            // InternalQuery.g:117:2: ( ( rule__WhatDirective__Alternatives ) )
            // InternalQuery.g:118:3: ( rule__WhatDirective__Alternatives )
            {
             before(grammarAccess.getWhatDirectiveAccess().getAlternatives()); 
            // InternalQuery.g:119:3: ( rule__WhatDirective__Alternatives )
            // InternalQuery.g:119:4: rule__WhatDirective__Alternatives
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
    // InternalQuery.g:128:1: entryRuleAllColumnsWhatDirective : ruleAllColumnsWhatDirective EOF ;
    public final void entryRuleAllColumnsWhatDirective() throws RecognitionException {
        try {
            // InternalQuery.g:129:1: ( ruleAllColumnsWhatDirective EOF )
            // InternalQuery.g:130:1: ruleAllColumnsWhatDirective EOF
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
    // InternalQuery.g:137:1: ruleAllColumnsWhatDirective : ( ( rule__AllColumnsWhatDirective__Group__0 ) ) ;
    public final void ruleAllColumnsWhatDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:141:2: ( ( ( rule__AllColumnsWhatDirective__Group__0 ) ) )
            // InternalQuery.g:142:2: ( ( rule__AllColumnsWhatDirective__Group__0 ) )
            {
            // InternalQuery.g:142:2: ( ( rule__AllColumnsWhatDirective__Group__0 ) )
            // InternalQuery.g:143:3: ( rule__AllColumnsWhatDirective__Group__0 )
            {
             before(grammarAccess.getAllColumnsWhatDirectiveAccess().getGroup()); 
            // InternalQuery.g:144:3: ( rule__AllColumnsWhatDirective__Group__0 )
            // InternalQuery.g:144:4: rule__AllColumnsWhatDirective__Group__0
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
    // InternalQuery.g:153:1: entryRuleSingleColumnWhatDirective : ruleSingleColumnWhatDirective EOF ;
    public final void entryRuleSingleColumnWhatDirective() throws RecognitionException {
        try {
            // InternalQuery.g:154:1: ( ruleSingleColumnWhatDirective EOF )
            // InternalQuery.g:155:1: ruleSingleColumnWhatDirective EOF
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
    // InternalQuery.g:162:1: ruleSingleColumnWhatDirective : ( ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment ) ) ;
    public final void ruleSingleColumnWhatDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:166:2: ( ( ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment ) ) )
            // InternalQuery.g:167:2: ( ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment ) )
            {
            // InternalQuery.g:167:2: ( ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment ) )
            // InternalQuery.g:168:3: ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment )
            {
             before(grammarAccess.getSingleColumnWhatDirectiveAccess().getColumnReferenceAssignment()); 
            // InternalQuery.g:169:3: ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment )
            // InternalQuery.g:169:4: rule__SingleColumnWhatDirective__ColumnReferenceAssignment
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
    // InternalQuery.g:178:1: entryRuleFromClause : ruleFromClause EOF ;
    public final void entryRuleFromClause() throws RecognitionException {
        try {
            // InternalQuery.g:179:1: ( ruleFromClause EOF )
            // InternalQuery.g:180:1: ruleFromClause EOF
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
    // InternalQuery.g:187:1: ruleFromClause : ( ( rule__FromClause__Group__0 ) ) ;
    public final void ruleFromClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:191:2: ( ( ( rule__FromClause__Group__0 ) ) )
            // InternalQuery.g:192:2: ( ( rule__FromClause__Group__0 ) )
            {
            // InternalQuery.g:192:2: ( ( rule__FromClause__Group__0 ) )
            // InternalQuery.g:193:3: ( rule__FromClause__Group__0 )
            {
             before(grammarAccess.getFromClauseAccess().getGroup()); 
            // InternalQuery.g:194:3: ( rule__FromClause__Group__0 )
            // InternalQuery.g:194:4: rule__FromClause__Group__0
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
    // InternalQuery.g:203:1: entryRuleOrderByClause : ruleOrderByClause EOF ;
    public final void entryRuleOrderByClause() throws RecognitionException {
        try {
            // InternalQuery.g:204:1: ( ruleOrderByClause EOF )
            // InternalQuery.g:205:1: ruleOrderByClause EOF
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
    // InternalQuery.g:212:1: ruleOrderByClause : ( ( rule__OrderByClause__Group__0 ) ) ;
    public final void ruleOrderByClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:216:2: ( ( ( rule__OrderByClause__Group__0 ) ) )
            // InternalQuery.g:217:2: ( ( rule__OrderByClause__Group__0 ) )
            {
            // InternalQuery.g:217:2: ( ( rule__OrderByClause__Group__0 ) )
            // InternalQuery.g:218:3: ( rule__OrderByClause__Group__0 )
            {
             before(grammarAccess.getOrderByClauseAccess().getGroup()); 
            // InternalQuery.g:219:3: ( rule__OrderByClause__Group__0 )
            // InternalQuery.g:219:4: rule__OrderByClause__Group__0
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
    // InternalQuery.g:228:1: entryRuleOrderByDirective : ruleOrderByDirective EOF ;
    public final void entryRuleOrderByDirective() throws RecognitionException {
        try {
            // InternalQuery.g:229:1: ( ruleOrderByDirective EOF )
            // InternalQuery.g:230:1: ruleOrderByDirective EOF
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
    // InternalQuery.g:237:1: ruleOrderByDirective : ( ( rule__OrderByDirective__Group__0 ) ) ;
    public final void ruleOrderByDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:241:2: ( ( ( rule__OrderByDirective__Group__0 ) ) )
            // InternalQuery.g:242:2: ( ( rule__OrderByDirective__Group__0 ) )
            {
            // InternalQuery.g:242:2: ( ( rule__OrderByDirective__Group__0 ) )
            // InternalQuery.g:243:3: ( rule__OrderByDirective__Group__0 )
            {
             before(grammarAccess.getOrderByDirectiveAccess().getGroup()); 
            // InternalQuery.g:244:3: ( rule__OrderByDirective__Group__0 )
            // InternalQuery.g:244:4: rule__OrderByDirective__Group__0
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
    // InternalQuery.g:253:1: entryRuleColumnReference : ruleColumnReference EOF ;
    public final void entryRuleColumnReference() throws RecognitionException {
        try {
            // InternalQuery.g:254:1: ( ruleColumnReference EOF )
            // InternalQuery.g:255:1: ruleColumnReference EOF
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
    // InternalQuery.g:262:1: ruleColumnReference : ( ( rule__ColumnReference__ColumnAssignment ) ) ;
    public final void ruleColumnReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:266:2: ( ( ( rule__ColumnReference__ColumnAssignment ) ) )
            // InternalQuery.g:267:2: ( ( rule__ColumnReference__ColumnAssignment ) )
            {
            // InternalQuery.g:267:2: ( ( rule__ColumnReference__ColumnAssignment ) )
            // InternalQuery.g:268:3: ( rule__ColumnReference__ColumnAssignment )
            {
             before(grammarAccess.getColumnReferenceAccess().getColumnAssignment()); 
            // InternalQuery.g:269:3: ( rule__ColumnReference__ColumnAssignment )
            // InternalQuery.g:269:4: rule__ColumnReference__ColumnAssignment
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
    // InternalQuery.g:277:1: rule__WhatDirective__Alternatives : ( ( ruleAllColumnsWhatDirective ) | ( ruleSingleColumnWhatDirective ) );
    public final void rule__WhatDirective__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:281:1: ( ( ruleAllColumnsWhatDirective ) | ( ruleSingleColumnWhatDirective ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
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
                    // InternalQuery.g:282:2: ( ruleAllColumnsWhatDirective )
                    {
                    // InternalQuery.g:282:2: ( ruleAllColumnsWhatDirective )
                    // InternalQuery.g:283:3: ruleAllColumnsWhatDirective
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
                    // InternalQuery.g:288:2: ( ruleSingleColumnWhatDirective )
                    {
                    // InternalQuery.g:288:2: ( ruleSingleColumnWhatDirective )
                    // InternalQuery.g:289:3: ruleSingleColumnWhatDirective
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
    // InternalQuery.g:298:1: rule__OrderByDirective__AscendingAlternatives_1_0 : ( ( 'ASC' ) | ( 'DESC' ) );
    public final void rule__OrderByDirective__AscendingAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:302:1: ( ( 'ASC' ) | ( 'DESC' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalQuery.g:303:2: ( 'ASC' )
                    {
                    // InternalQuery.g:303:2: ( 'ASC' )
                    // InternalQuery.g:304:3: 'ASC'
                    {
                     before(grammarAccess.getOrderByDirectiveAccess().getAscendingASCKeyword_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getOrderByDirectiveAccess().getAscendingASCKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQuery.g:309:2: ( 'DESC' )
                    {
                    // InternalQuery.g:309:2: ( 'DESC' )
                    // InternalQuery.g:310:3: 'DESC'
                    {
                     before(grammarAccess.getOrderByDirectiveAccess().getAscendingDESCKeyword_1_0_1()); 
                    match(input,12,FOLLOW_2); 
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
    // InternalQuery.g:319:1: rule__SelectQuery__Group__0 : rule__SelectQuery__Group__0__Impl rule__SelectQuery__Group__1 ;
    public final void rule__SelectQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:323:1: ( rule__SelectQuery__Group__0__Impl rule__SelectQuery__Group__1 )
            // InternalQuery.g:324:2: rule__SelectQuery__Group__0__Impl rule__SelectQuery__Group__1
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
    // InternalQuery.g:331:1: rule__SelectQuery__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__SelectQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:335:1: ( ( 'SELECT' ) )
            // InternalQuery.g:336:1: ( 'SELECT' )
            {
            // InternalQuery.g:336:1: ( 'SELECT' )
            // InternalQuery.g:337:2: 'SELECT'
            {
             before(grammarAccess.getSelectQueryAccess().getSELECTKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalQuery.g:346:1: rule__SelectQuery__Group__1 : rule__SelectQuery__Group__1__Impl rule__SelectQuery__Group__2 ;
    public final void rule__SelectQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:350:1: ( rule__SelectQuery__Group__1__Impl rule__SelectQuery__Group__2 )
            // InternalQuery.g:351:2: rule__SelectQuery__Group__1__Impl rule__SelectQuery__Group__2
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
    // InternalQuery.g:358:1: rule__SelectQuery__Group__1__Impl : ( ( rule__SelectQuery__WhatClauseAssignment_1 ) ) ;
    public final void rule__SelectQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:362:1: ( ( ( rule__SelectQuery__WhatClauseAssignment_1 ) ) )
            // InternalQuery.g:363:1: ( ( rule__SelectQuery__WhatClauseAssignment_1 ) )
            {
            // InternalQuery.g:363:1: ( ( rule__SelectQuery__WhatClauseAssignment_1 ) )
            // InternalQuery.g:364:2: ( rule__SelectQuery__WhatClauseAssignment_1 )
            {
             before(grammarAccess.getSelectQueryAccess().getWhatClauseAssignment_1()); 
            // InternalQuery.g:365:2: ( rule__SelectQuery__WhatClauseAssignment_1 )
            // InternalQuery.g:365:3: rule__SelectQuery__WhatClauseAssignment_1
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
    // InternalQuery.g:373:1: rule__SelectQuery__Group__2 : rule__SelectQuery__Group__2__Impl rule__SelectQuery__Group__3 ;
    public final void rule__SelectQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:377:1: ( rule__SelectQuery__Group__2__Impl rule__SelectQuery__Group__3 )
            // InternalQuery.g:378:2: rule__SelectQuery__Group__2__Impl rule__SelectQuery__Group__3
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
    // InternalQuery.g:385:1: rule__SelectQuery__Group__2__Impl : ( ( rule__SelectQuery__FromClauseAssignment_2 ) ) ;
    public final void rule__SelectQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:389:1: ( ( ( rule__SelectQuery__FromClauseAssignment_2 ) ) )
            // InternalQuery.g:390:1: ( ( rule__SelectQuery__FromClauseAssignment_2 ) )
            {
            // InternalQuery.g:390:1: ( ( rule__SelectQuery__FromClauseAssignment_2 ) )
            // InternalQuery.g:391:2: ( rule__SelectQuery__FromClauseAssignment_2 )
            {
             before(grammarAccess.getSelectQueryAccess().getFromClauseAssignment_2()); 
            // InternalQuery.g:392:2: ( rule__SelectQuery__FromClauseAssignment_2 )
            // InternalQuery.g:392:3: rule__SelectQuery__FromClauseAssignment_2
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
    // InternalQuery.g:400:1: rule__SelectQuery__Group__3 : rule__SelectQuery__Group__3__Impl rule__SelectQuery__Group__4 ;
    public final void rule__SelectQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:404:1: ( rule__SelectQuery__Group__3__Impl rule__SelectQuery__Group__4 )
            // InternalQuery.g:405:2: rule__SelectQuery__Group__3__Impl rule__SelectQuery__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalQuery.g:412:1: rule__SelectQuery__Group__3__Impl : ( ( rule__SelectQuery__OrderByClauseAssignment_3 ) ) ;
    public final void rule__SelectQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:416:1: ( ( ( rule__SelectQuery__OrderByClauseAssignment_3 ) ) )
            // InternalQuery.g:417:1: ( ( rule__SelectQuery__OrderByClauseAssignment_3 ) )
            {
            // InternalQuery.g:417:1: ( ( rule__SelectQuery__OrderByClauseAssignment_3 ) )
            // InternalQuery.g:418:2: ( rule__SelectQuery__OrderByClauseAssignment_3 )
            {
             before(grammarAccess.getSelectQueryAccess().getOrderByClauseAssignment_3()); 
            // InternalQuery.g:419:2: ( rule__SelectQuery__OrderByClauseAssignment_3 )
            // InternalQuery.g:419:3: rule__SelectQuery__OrderByClauseAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SelectQuery__OrderByClauseAssignment_3();

            state._fsp--;


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
    // InternalQuery.g:427:1: rule__SelectQuery__Group__4 : rule__SelectQuery__Group__4__Impl ;
    public final void rule__SelectQuery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:431:1: ( rule__SelectQuery__Group__4__Impl )
            // InternalQuery.g:432:2: rule__SelectQuery__Group__4__Impl
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
    // InternalQuery.g:438:1: rule__SelectQuery__Group__4__Impl : ( ';' ) ;
    public final void rule__SelectQuery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:442:1: ( ( ';' ) )
            // InternalQuery.g:443:1: ( ';' )
            {
            // InternalQuery.g:443:1: ( ';' )
            // InternalQuery.g:444:2: ';'
            {
             before(grammarAccess.getSelectQueryAccess().getSemicolonKeyword_4()); 
            match(input,14,FOLLOW_2); 
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
    // InternalQuery.g:454:1: rule__WhatClause__Group__0 : rule__WhatClause__Group__0__Impl rule__WhatClause__Group__1 ;
    public final void rule__WhatClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:458:1: ( rule__WhatClause__Group__0__Impl rule__WhatClause__Group__1 )
            // InternalQuery.g:459:2: rule__WhatClause__Group__0__Impl rule__WhatClause__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalQuery.g:466:1: rule__WhatClause__Group__0__Impl : ( ( rule__WhatClause__WhatDirectivesAssignment_0 ) ) ;
    public final void rule__WhatClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:470:1: ( ( ( rule__WhatClause__WhatDirectivesAssignment_0 ) ) )
            // InternalQuery.g:471:1: ( ( rule__WhatClause__WhatDirectivesAssignment_0 ) )
            {
            // InternalQuery.g:471:1: ( ( rule__WhatClause__WhatDirectivesAssignment_0 ) )
            // InternalQuery.g:472:2: ( rule__WhatClause__WhatDirectivesAssignment_0 )
            {
             before(grammarAccess.getWhatClauseAccess().getWhatDirectivesAssignment_0()); 
            // InternalQuery.g:473:2: ( rule__WhatClause__WhatDirectivesAssignment_0 )
            // InternalQuery.g:473:3: rule__WhatClause__WhatDirectivesAssignment_0
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
    // InternalQuery.g:481:1: rule__WhatClause__Group__1 : rule__WhatClause__Group__1__Impl ;
    public final void rule__WhatClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:485:1: ( rule__WhatClause__Group__1__Impl )
            // InternalQuery.g:486:2: rule__WhatClause__Group__1__Impl
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
    // InternalQuery.g:492:1: rule__WhatClause__Group__1__Impl : ( ( rule__WhatClause__Group_1__0 )* ) ;
    public final void rule__WhatClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:496:1: ( ( ( rule__WhatClause__Group_1__0 )* ) )
            // InternalQuery.g:497:1: ( ( rule__WhatClause__Group_1__0 )* )
            {
            // InternalQuery.g:497:1: ( ( rule__WhatClause__Group_1__0 )* )
            // InternalQuery.g:498:2: ( rule__WhatClause__Group_1__0 )*
            {
             before(grammarAccess.getWhatClauseAccess().getGroup_1()); 
            // InternalQuery.g:499:2: ( rule__WhatClause__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalQuery.g:499:3: rule__WhatClause__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__WhatClause__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalQuery.g:508:1: rule__WhatClause__Group_1__0 : rule__WhatClause__Group_1__0__Impl rule__WhatClause__Group_1__1 ;
    public final void rule__WhatClause__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:512:1: ( rule__WhatClause__Group_1__0__Impl rule__WhatClause__Group_1__1 )
            // InternalQuery.g:513:2: rule__WhatClause__Group_1__0__Impl rule__WhatClause__Group_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalQuery.g:520:1: rule__WhatClause__Group_1__0__Impl : ( ',' ) ;
    public final void rule__WhatClause__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:524:1: ( ( ',' ) )
            // InternalQuery.g:525:1: ( ',' )
            {
            // InternalQuery.g:525:1: ( ',' )
            // InternalQuery.g:526:2: ','
            {
             before(grammarAccess.getWhatClauseAccess().getCommaKeyword_1_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalQuery.g:535:1: rule__WhatClause__Group_1__1 : rule__WhatClause__Group_1__1__Impl ;
    public final void rule__WhatClause__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:539:1: ( rule__WhatClause__Group_1__1__Impl )
            // InternalQuery.g:540:2: rule__WhatClause__Group_1__1__Impl
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
    // InternalQuery.g:546:1: rule__WhatClause__Group_1__1__Impl : ( ( rule__WhatClause__WhatDirectivesAssignment_1_1 ) ) ;
    public final void rule__WhatClause__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:550:1: ( ( ( rule__WhatClause__WhatDirectivesAssignment_1_1 ) ) )
            // InternalQuery.g:551:1: ( ( rule__WhatClause__WhatDirectivesAssignment_1_1 ) )
            {
            // InternalQuery.g:551:1: ( ( rule__WhatClause__WhatDirectivesAssignment_1_1 ) )
            // InternalQuery.g:552:2: ( rule__WhatClause__WhatDirectivesAssignment_1_1 )
            {
             before(grammarAccess.getWhatClauseAccess().getWhatDirectivesAssignment_1_1()); 
            // InternalQuery.g:553:2: ( rule__WhatClause__WhatDirectivesAssignment_1_1 )
            // InternalQuery.g:553:3: rule__WhatClause__WhatDirectivesAssignment_1_1
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
    // InternalQuery.g:562:1: rule__AllColumnsWhatDirective__Group__0 : rule__AllColumnsWhatDirective__Group__0__Impl rule__AllColumnsWhatDirective__Group__1 ;
    public final void rule__AllColumnsWhatDirective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:566:1: ( rule__AllColumnsWhatDirective__Group__0__Impl rule__AllColumnsWhatDirective__Group__1 )
            // InternalQuery.g:567:2: rule__AllColumnsWhatDirective__Group__0__Impl rule__AllColumnsWhatDirective__Group__1
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
    // InternalQuery.g:574:1: rule__AllColumnsWhatDirective__Group__0__Impl : ( '*' ) ;
    public final void rule__AllColumnsWhatDirective__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:578:1: ( ( '*' ) )
            // InternalQuery.g:579:1: ( '*' )
            {
            // InternalQuery.g:579:1: ( '*' )
            // InternalQuery.g:580:2: '*'
            {
             before(grammarAccess.getAllColumnsWhatDirectiveAccess().getAsteriskKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalQuery.g:589:1: rule__AllColumnsWhatDirective__Group__1 : rule__AllColumnsWhatDirective__Group__1__Impl ;
    public final void rule__AllColumnsWhatDirective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:593:1: ( rule__AllColumnsWhatDirective__Group__1__Impl )
            // InternalQuery.g:594:2: rule__AllColumnsWhatDirective__Group__1__Impl
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
    // InternalQuery.g:600:1: rule__AllColumnsWhatDirective__Group__1__Impl : ( () ) ;
    public final void rule__AllColumnsWhatDirective__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:604:1: ( ( () ) )
            // InternalQuery.g:605:1: ( () )
            {
            // InternalQuery.g:605:1: ( () )
            // InternalQuery.g:606:2: ()
            {
             before(grammarAccess.getAllColumnsWhatDirectiveAccess().getAllColumnsWhatDirectiveAction_1()); 
            // InternalQuery.g:607:2: ()
            // InternalQuery.g:607:3: 
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
    // InternalQuery.g:616:1: rule__FromClause__Group__0 : rule__FromClause__Group__0__Impl rule__FromClause__Group__1 ;
    public final void rule__FromClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:620:1: ( rule__FromClause__Group__0__Impl rule__FromClause__Group__1 )
            // InternalQuery.g:621:2: rule__FromClause__Group__0__Impl rule__FromClause__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalQuery.g:628:1: rule__FromClause__Group__0__Impl : ( 'FROM' ) ;
    public final void rule__FromClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:632:1: ( ( 'FROM' ) )
            // InternalQuery.g:633:1: ( 'FROM' )
            {
            // InternalQuery.g:633:1: ( 'FROM' )
            // InternalQuery.g:634:2: 'FROM'
            {
             before(grammarAccess.getFromClauseAccess().getFROMKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalQuery.g:643:1: rule__FromClause__Group__1 : rule__FromClause__Group__1__Impl ;
    public final void rule__FromClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:647:1: ( rule__FromClause__Group__1__Impl )
            // InternalQuery.g:648:2: rule__FromClause__Group__1__Impl
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
    // InternalQuery.g:654:1: rule__FromClause__Group__1__Impl : ( ( rule__FromClause__TableAssignment_1 ) ) ;
    public final void rule__FromClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:658:1: ( ( ( rule__FromClause__TableAssignment_1 ) ) )
            // InternalQuery.g:659:1: ( ( rule__FromClause__TableAssignment_1 ) )
            {
            // InternalQuery.g:659:1: ( ( rule__FromClause__TableAssignment_1 ) )
            // InternalQuery.g:660:2: ( rule__FromClause__TableAssignment_1 )
            {
             before(grammarAccess.getFromClauseAccess().getTableAssignment_1()); 
            // InternalQuery.g:661:2: ( rule__FromClause__TableAssignment_1 )
            // InternalQuery.g:661:3: rule__FromClause__TableAssignment_1
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
    // InternalQuery.g:670:1: rule__OrderByClause__Group__0 : rule__OrderByClause__Group__0__Impl rule__OrderByClause__Group__1 ;
    public final void rule__OrderByClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:674:1: ( rule__OrderByClause__Group__0__Impl rule__OrderByClause__Group__1 )
            // InternalQuery.g:675:2: rule__OrderByClause__Group__0__Impl rule__OrderByClause__Group__1
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
    // InternalQuery.g:682:1: rule__OrderByClause__Group__0__Impl : ( 'ORDER' ) ;
    public final void rule__OrderByClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:686:1: ( ( 'ORDER' ) )
            // InternalQuery.g:687:1: ( 'ORDER' )
            {
            // InternalQuery.g:687:1: ( 'ORDER' )
            // InternalQuery.g:688:2: 'ORDER'
            {
             before(grammarAccess.getOrderByClauseAccess().getORDERKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalQuery.g:697:1: rule__OrderByClause__Group__1 : rule__OrderByClause__Group__1__Impl rule__OrderByClause__Group__2 ;
    public final void rule__OrderByClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:701:1: ( rule__OrderByClause__Group__1__Impl rule__OrderByClause__Group__2 )
            // InternalQuery.g:702:2: rule__OrderByClause__Group__1__Impl rule__OrderByClause__Group__2
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
    // InternalQuery.g:709:1: rule__OrderByClause__Group__1__Impl : ( 'BY' ) ;
    public final void rule__OrderByClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:713:1: ( ( 'BY' ) )
            // InternalQuery.g:714:1: ( 'BY' )
            {
            // InternalQuery.g:714:1: ( 'BY' )
            // InternalQuery.g:715:2: 'BY'
            {
             before(grammarAccess.getOrderByClauseAccess().getBYKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalQuery.g:724:1: rule__OrderByClause__Group__2 : rule__OrderByClause__Group__2__Impl rule__OrderByClause__Group__3 ;
    public final void rule__OrderByClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:728:1: ( rule__OrderByClause__Group__2__Impl rule__OrderByClause__Group__3 )
            // InternalQuery.g:729:2: rule__OrderByClause__Group__2__Impl rule__OrderByClause__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalQuery.g:736:1: rule__OrderByClause__Group__2__Impl : ( ( rule__OrderByClause__OrderByDirectivesAssignment_2 ) ) ;
    public final void rule__OrderByClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:740:1: ( ( ( rule__OrderByClause__OrderByDirectivesAssignment_2 ) ) )
            // InternalQuery.g:741:1: ( ( rule__OrderByClause__OrderByDirectivesAssignment_2 ) )
            {
            // InternalQuery.g:741:1: ( ( rule__OrderByClause__OrderByDirectivesAssignment_2 ) )
            // InternalQuery.g:742:2: ( rule__OrderByClause__OrderByDirectivesAssignment_2 )
            {
             before(grammarAccess.getOrderByClauseAccess().getOrderByDirectivesAssignment_2()); 
            // InternalQuery.g:743:2: ( rule__OrderByClause__OrderByDirectivesAssignment_2 )
            // InternalQuery.g:743:3: rule__OrderByClause__OrderByDirectivesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OrderByClause__OrderByDirectivesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOrderByClauseAccess().getOrderByDirectivesAssignment_2()); 

            }


            }

        }
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
    // InternalQuery.g:751:1: rule__OrderByClause__Group__3 : rule__OrderByClause__Group__3__Impl ;
    public final void rule__OrderByClause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:755:1: ( rule__OrderByClause__Group__3__Impl )
            // InternalQuery.g:756:2: rule__OrderByClause__Group__3__Impl
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
    // InternalQuery.g:762:1: rule__OrderByClause__Group__3__Impl : ( ( rule__OrderByClause__Group_3__0 )* ) ;
    public final void rule__OrderByClause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:766:1: ( ( ( rule__OrderByClause__Group_3__0 )* ) )
            // InternalQuery.g:767:1: ( ( rule__OrderByClause__Group_3__0 )* )
            {
            // InternalQuery.g:767:1: ( ( rule__OrderByClause__Group_3__0 )* )
            // InternalQuery.g:768:2: ( rule__OrderByClause__Group_3__0 )*
            {
             before(grammarAccess.getOrderByClauseAccess().getGroup_3()); 
            // InternalQuery.g:769:2: ( rule__OrderByClause__Group_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalQuery.g:769:3: rule__OrderByClause__Group_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__OrderByClause__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalQuery.g:778:1: rule__OrderByClause__Group_3__0 : rule__OrderByClause__Group_3__0__Impl rule__OrderByClause__Group_3__1 ;
    public final void rule__OrderByClause__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:782:1: ( rule__OrderByClause__Group_3__0__Impl rule__OrderByClause__Group_3__1 )
            // InternalQuery.g:783:2: rule__OrderByClause__Group_3__0__Impl rule__OrderByClause__Group_3__1
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
    // InternalQuery.g:790:1: rule__OrderByClause__Group_3__0__Impl : ( ',' ) ;
    public final void rule__OrderByClause__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:794:1: ( ( ',' ) )
            // InternalQuery.g:795:1: ( ',' )
            {
            // InternalQuery.g:795:1: ( ',' )
            // InternalQuery.g:796:2: ','
            {
             before(grammarAccess.getOrderByClauseAccess().getCommaKeyword_3_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalQuery.g:805:1: rule__OrderByClause__Group_3__1 : rule__OrderByClause__Group_3__1__Impl ;
    public final void rule__OrderByClause__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:809:1: ( rule__OrderByClause__Group_3__1__Impl )
            // InternalQuery.g:810:2: rule__OrderByClause__Group_3__1__Impl
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
    // InternalQuery.g:816:1: rule__OrderByClause__Group_3__1__Impl : ( ( rule__OrderByClause__OrderByDirectivesAssignment_3_1 ) ) ;
    public final void rule__OrderByClause__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:820:1: ( ( ( rule__OrderByClause__OrderByDirectivesAssignment_3_1 ) ) )
            // InternalQuery.g:821:1: ( ( rule__OrderByClause__OrderByDirectivesAssignment_3_1 ) )
            {
            // InternalQuery.g:821:1: ( ( rule__OrderByClause__OrderByDirectivesAssignment_3_1 ) )
            // InternalQuery.g:822:2: ( rule__OrderByClause__OrderByDirectivesAssignment_3_1 )
            {
             before(grammarAccess.getOrderByClauseAccess().getOrderByDirectivesAssignment_3_1()); 
            // InternalQuery.g:823:2: ( rule__OrderByClause__OrderByDirectivesAssignment_3_1 )
            // InternalQuery.g:823:3: rule__OrderByClause__OrderByDirectivesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OrderByClause__OrderByDirectivesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderByClauseAccess().getOrderByDirectivesAssignment_3_1()); 

            }


            }

        }
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
    // InternalQuery.g:832:1: rule__OrderByDirective__Group__0 : rule__OrderByDirective__Group__0__Impl rule__OrderByDirective__Group__1 ;
    public final void rule__OrderByDirective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:836:1: ( rule__OrderByDirective__Group__0__Impl rule__OrderByDirective__Group__1 )
            // InternalQuery.g:837:2: rule__OrderByDirective__Group__0__Impl rule__OrderByDirective__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalQuery.g:844:1: rule__OrderByDirective__Group__0__Impl : ( ( rule__OrderByDirective__ColumnReferenceAssignment_0 ) ) ;
    public final void rule__OrderByDirective__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:848:1: ( ( ( rule__OrderByDirective__ColumnReferenceAssignment_0 ) ) )
            // InternalQuery.g:849:1: ( ( rule__OrderByDirective__ColumnReferenceAssignment_0 ) )
            {
            // InternalQuery.g:849:1: ( ( rule__OrderByDirective__ColumnReferenceAssignment_0 ) )
            // InternalQuery.g:850:2: ( rule__OrderByDirective__ColumnReferenceAssignment_0 )
            {
             before(grammarAccess.getOrderByDirectiveAccess().getColumnReferenceAssignment_0()); 
            // InternalQuery.g:851:2: ( rule__OrderByDirective__ColumnReferenceAssignment_0 )
            // InternalQuery.g:851:3: rule__OrderByDirective__ColumnReferenceAssignment_0
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
    // InternalQuery.g:859:1: rule__OrderByDirective__Group__1 : rule__OrderByDirective__Group__1__Impl ;
    public final void rule__OrderByDirective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:863:1: ( rule__OrderByDirective__Group__1__Impl )
            // InternalQuery.g:864:2: rule__OrderByDirective__Group__1__Impl
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
    // InternalQuery.g:870:1: rule__OrderByDirective__Group__1__Impl : ( ( rule__OrderByDirective__AscendingAssignment_1 )? ) ;
    public final void rule__OrderByDirective__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:874:1: ( ( ( rule__OrderByDirective__AscendingAssignment_1 )? ) )
            // InternalQuery.g:875:1: ( ( rule__OrderByDirective__AscendingAssignment_1 )? )
            {
            // InternalQuery.g:875:1: ( ( rule__OrderByDirective__AscendingAssignment_1 )? )
            // InternalQuery.g:876:2: ( rule__OrderByDirective__AscendingAssignment_1 )?
            {
             before(grammarAccess.getOrderByDirectiveAccess().getAscendingAssignment_1()); 
            // InternalQuery.g:877:2: ( rule__OrderByDirective__AscendingAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=11 && LA5_0<=12)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalQuery.g:877:3: rule__OrderByDirective__AscendingAssignment_1
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
    // InternalQuery.g:886:1: rule__SelectQuery__WhatClauseAssignment_1 : ( ruleWhatClause ) ;
    public final void rule__SelectQuery__WhatClauseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:890:1: ( ( ruleWhatClause ) )
            // InternalQuery.g:891:2: ( ruleWhatClause )
            {
            // InternalQuery.g:891:2: ( ruleWhatClause )
            // InternalQuery.g:892:3: ruleWhatClause
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
    // InternalQuery.g:901:1: rule__SelectQuery__FromClauseAssignment_2 : ( ruleFromClause ) ;
    public final void rule__SelectQuery__FromClauseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:905:1: ( ( ruleFromClause ) )
            // InternalQuery.g:906:2: ( ruleFromClause )
            {
            // InternalQuery.g:906:2: ( ruleFromClause )
            // InternalQuery.g:907:3: ruleFromClause
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
    // InternalQuery.g:916:1: rule__SelectQuery__OrderByClauseAssignment_3 : ( ruleOrderByClause ) ;
    public final void rule__SelectQuery__OrderByClauseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:920:1: ( ( ruleOrderByClause ) )
            // InternalQuery.g:921:2: ( ruleOrderByClause )
            {
            // InternalQuery.g:921:2: ( ruleOrderByClause )
            // InternalQuery.g:922:3: ruleOrderByClause
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


    // $ANTLR start "rule__WhatClause__WhatDirectivesAssignment_0"
    // InternalQuery.g:931:1: rule__WhatClause__WhatDirectivesAssignment_0 : ( ruleSingleColumnWhatDirective ) ;
    public final void rule__WhatClause__WhatDirectivesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:935:1: ( ( ruleSingleColumnWhatDirective ) )
            // InternalQuery.g:936:2: ( ruleSingleColumnWhatDirective )
            {
            // InternalQuery.g:936:2: ( ruleSingleColumnWhatDirective )
            // InternalQuery.g:937:3: ruleSingleColumnWhatDirective
            {
             before(grammarAccess.getWhatClauseAccess().getWhatDirectivesSingleColumnWhatDirectiveParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSingleColumnWhatDirective();

            state._fsp--;

             after(grammarAccess.getWhatClauseAccess().getWhatDirectivesSingleColumnWhatDirectiveParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalQuery.g:946:1: rule__WhatClause__WhatDirectivesAssignment_1_1 : ( ruleWhatDirective ) ;
    public final void rule__WhatClause__WhatDirectivesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:950:1: ( ( ruleWhatDirective ) )
            // InternalQuery.g:951:2: ( ruleWhatDirective )
            {
            // InternalQuery.g:951:2: ( ruleWhatDirective )
            // InternalQuery.g:952:3: ruleWhatDirective
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
    // InternalQuery.g:961:1: rule__SingleColumnWhatDirective__ColumnReferenceAssignment : ( ruleColumnReference ) ;
    public final void rule__SingleColumnWhatDirective__ColumnReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:965:1: ( ( ruleColumnReference ) )
            // InternalQuery.g:966:2: ( ruleColumnReference )
            {
            // InternalQuery.g:966:2: ( ruleColumnReference )
            // InternalQuery.g:967:3: ruleColumnReference
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
    // InternalQuery.g:976:1: rule__FromClause__TableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FromClause__TableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:980:1: ( ( ( RULE_ID ) ) )
            // InternalQuery.g:981:2: ( ( RULE_ID ) )
            {
            // InternalQuery.g:981:2: ( ( RULE_ID ) )
            // InternalQuery.g:982:3: ( RULE_ID )
            {
             before(grammarAccess.getFromClauseAccess().getTableTableCrossReference_1_0()); 
            // InternalQuery.g:983:3: ( RULE_ID )
            // InternalQuery.g:984:4: RULE_ID
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


    // $ANTLR start "rule__OrderByClause__OrderByDirectivesAssignment_2"
    // InternalQuery.g:995:1: rule__OrderByClause__OrderByDirectivesAssignment_2 : ( ruleOrderByDirective ) ;
    public final void rule__OrderByClause__OrderByDirectivesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:999:1: ( ( ruleOrderByDirective ) )
            // InternalQuery.g:1000:2: ( ruleOrderByDirective )
            {
            // InternalQuery.g:1000:2: ( ruleOrderByDirective )
            // InternalQuery.g:1001:3: ruleOrderByDirective
            {
             before(grammarAccess.getOrderByClauseAccess().getOrderByDirectivesOrderByDirectiveParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOrderByDirective();

            state._fsp--;

             after(grammarAccess.getOrderByClauseAccess().getOrderByDirectivesOrderByDirectiveParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__OrderByDirectivesAssignment_2"


    // $ANTLR start "rule__OrderByClause__OrderByDirectivesAssignment_3_1"
    // InternalQuery.g:1010:1: rule__OrderByClause__OrderByDirectivesAssignment_3_1 : ( ruleOrderByDirective ) ;
    public final void rule__OrderByClause__OrderByDirectivesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:1014:1: ( ( ruleOrderByDirective ) )
            // InternalQuery.g:1015:2: ( ruleOrderByDirective )
            {
            // InternalQuery.g:1015:2: ( ruleOrderByDirective )
            // InternalQuery.g:1016:3: ruleOrderByDirective
            {
             before(grammarAccess.getOrderByClauseAccess().getOrderByDirectivesOrderByDirectiveParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrderByDirective();

            state._fsp--;

             after(grammarAccess.getOrderByClauseAccess().getOrderByDirectivesOrderByDirectiveParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__OrderByDirectivesAssignment_3_1"


    // $ANTLR start "rule__OrderByDirective__ColumnReferenceAssignment_0"
    // InternalQuery.g:1025:1: rule__OrderByDirective__ColumnReferenceAssignment_0 : ( ruleColumnReference ) ;
    public final void rule__OrderByDirective__ColumnReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:1029:1: ( ( ruleColumnReference ) )
            // InternalQuery.g:1030:2: ( ruleColumnReference )
            {
            // InternalQuery.g:1030:2: ( ruleColumnReference )
            // InternalQuery.g:1031:3: ruleColumnReference
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
    // InternalQuery.g:1040:1: rule__OrderByDirective__AscendingAssignment_1 : ( ( rule__OrderByDirective__AscendingAlternatives_1_0 ) ) ;
    public final void rule__OrderByDirective__AscendingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:1044:1: ( ( ( rule__OrderByDirective__AscendingAlternatives_1_0 ) ) )
            // InternalQuery.g:1045:2: ( ( rule__OrderByDirective__AscendingAlternatives_1_0 ) )
            {
            // InternalQuery.g:1045:2: ( ( rule__OrderByDirective__AscendingAlternatives_1_0 ) )
            // InternalQuery.g:1046:3: ( rule__OrderByDirective__AscendingAlternatives_1_0 )
            {
             before(grammarAccess.getOrderByDirectiveAccess().getAscendingAlternatives_1_0()); 
            // InternalQuery.g:1047:3: ( rule__OrderByDirective__AscendingAlternatives_1_0 )
            // InternalQuery.g:1047:4: rule__OrderByDirective__AscendingAlternatives_1_0
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
    // InternalQuery.g:1055:1: rule__ColumnReference__ColumnAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ColumnReference__ColumnAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:1059:1: ( ( ( RULE_ID ) ) )
            // InternalQuery.g:1060:2: ( ( RULE_ID ) )
            {
            // InternalQuery.g:1060:2: ( ( RULE_ID ) )
            // InternalQuery.g:1061:3: ( RULE_ID )
            {
             before(grammarAccess.getColumnReferenceAccess().getColumnColumnCrossReference_0()); 
            // InternalQuery.g:1062:3: ( RULE_ID )
            // InternalQuery.g:1063:4: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001800L});

}