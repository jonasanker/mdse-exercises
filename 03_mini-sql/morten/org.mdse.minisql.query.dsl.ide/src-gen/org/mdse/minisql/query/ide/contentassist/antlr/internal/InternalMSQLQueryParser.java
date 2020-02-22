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
import org.mdse.minisql.query.services.MSQLQueryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMSQLQueryParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SELECT'", "'FROM'", "';'", "','"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMSQLQueryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMSQLQueryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMSQLQueryParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMSQLQuery.g"; }


    	private MSQLQueryGrammarAccess grammarAccess;

    	public void setGrammarAccess(MSQLQueryGrammarAccess grammarAccess) {
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
    // InternalMSQLQuery.g:53:1: entryRuleSelectQuery : ruleSelectQuery EOF ;
    public final void entryRuleSelectQuery() throws RecognitionException {
        try {
            // InternalMSQLQuery.g:54:1: ( ruleSelectQuery EOF )
            // InternalMSQLQuery.g:55:1: ruleSelectQuery EOF
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
    // InternalMSQLQuery.g:62:1: ruleSelectQuery : ( ( rule__SelectQuery__Group__0 ) ) ;
    public final void ruleSelectQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQuery.g:66:2: ( ( ( rule__SelectQuery__Group__0 ) ) )
            // InternalMSQLQuery.g:67:2: ( ( rule__SelectQuery__Group__0 ) )
            {
            // InternalMSQLQuery.g:67:2: ( ( rule__SelectQuery__Group__0 ) )
            // InternalMSQLQuery.g:68:3: ( rule__SelectQuery__Group__0 )
            {
             before(grammarAccess.getSelectQueryAccess().getGroup()); 
            // InternalMSQLQuery.g:69:3: ( rule__SelectQuery__Group__0 )
            // InternalMSQLQuery.g:69:4: rule__SelectQuery__Group__0
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


    // $ANTLR start "rule__SelectQuery__Group__0"
    // InternalMSQLQuery.g:77:1: rule__SelectQuery__Group__0 : rule__SelectQuery__Group__0__Impl rule__SelectQuery__Group__1 ;
    public final void rule__SelectQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQuery.g:81:1: ( rule__SelectQuery__Group__0__Impl rule__SelectQuery__Group__1 )
            // InternalMSQLQuery.g:82:2: rule__SelectQuery__Group__0__Impl rule__SelectQuery__Group__1
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
    // InternalMSQLQuery.g:89:1: rule__SelectQuery__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__SelectQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQuery.g:93:1: ( ( 'SELECT' ) )
            // InternalMSQLQuery.g:94:1: ( 'SELECT' )
            {
            // InternalMSQLQuery.g:94:1: ( 'SELECT' )
            // InternalMSQLQuery.g:95:2: 'SELECT'
            {
             before(grammarAccess.getSelectQueryAccess().getSELECTKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalMSQLQuery.g:104:1: rule__SelectQuery__Group__1 : rule__SelectQuery__Group__1__Impl rule__SelectQuery__Group__2 ;
    public final void rule__SelectQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQuery.g:108:1: ( rule__SelectQuery__Group__1__Impl rule__SelectQuery__Group__2 )
            // InternalMSQLQuery.g:109:2: rule__SelectQuery__Group__1__Impl rule__SelectQuery__Group__2
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
    // InternalMSQLQuery.g:116:1: rule__SelectQuery__Group__1__Impl : ( ( rule__SelectQuery__WhatAssignment_1 ) ) ;
    public final void rule__SelectQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQuery.g:120:1: ( ( ( rule__SelectQuery__WhatAssignment_1 ) ) )
            // InternalMSQLQuery.g:121:1: ( ( rule__SelectQuery__WhatAssignment_1 ) )
            {
            // InternalMSQLQuery.g:121:1: ( ( rule__SelectQuery__WhatAssignment_1 ) )
            // InternalMSQLQuery.g:122:2: ( rule__SelectQuery__WhatAssignment_1 )
            {
             before(grammarAccess.getSelectQueryAccess().getWhatAssignment_1()); 
            // InternalMSQLQuery.g:123:2: ( rule__SelectQuery__WhatAssignment_1 )
            // InternalMSQLQuery.g:123:3: rule__SelectQuery__WhatAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectQuery__WhatAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectQueryAccess().getWhatAssignment_1()); 

            }


            }

        }
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
    // InternalMSQLQuery.g:131:1: rule__SelectQuery__Group__2 : rule__SelectQuery__Group__2__Impl rule__SelectQuery__Group__3 ;
    public final void rule__SelectQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQuery.g:135:1: ( rule__SelectQuery__Group__2__Impl rule__SelectQuery__Group__3 )
            // InternalMSQLQuery.g:136:2: rule__SelectQuery__Group__2__Impl rule__SelectQuery__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalMSQLQuery.g:143:1: rule__SelectQuery__Group__2__Impl : ( ( rule__SelectQuery__Group_2__0 )* ) ;
    public final void rule__SelectQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQuery.g:147:1: ( ( ( rule__SelectQuery__Group_2__0 )* ) )
            // InternalMSQLQuery.g:148:1: ( ( rule__SelectQuery__Group_2__0 )* )
            {
            // InternalMSQLQuery.g:148:1: ( ( rule__SelectQuery__Group_2__0 )* )
            // InternalMSQLQuery.g:149:2: ( rule__SelectQuery__Group_2__0 )*
            {
             before(grammarAccess.getSelectQueryAccess().getGroup_2()); 
            // InternalMSQLQuery.g:150:2: ( rule__SelectQuery__Group_2__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMSQLQuery.g:150:3: rule__SelectQuery__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__SelectQuery__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSelectQueryAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalMSQLQuery.g:158:1: rule__SelectQuery__Group__3 : rule__SelectQuery__Group__3__Impl rule__SelectQuery__Group__4 ;
    public final void rule__SelectQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQuery.g:162:1: ( rule__SelectQuery__Group__3__Impl rule__SelectQuery__Group__4 )
            // InternalMSQLQuery.g:163:2: rule__SelectQuery__Group__3__Impl rule__SelectQuery__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalMSQLQuery.g:170:1: rule__SelectQuery__Group__3__Impl : ( 'FROM' ) ;
    public final void rule__SelectQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQuery.g:174:1: ( ( 'FROM' ) )
            // InternalMSQLQuery.g:175:1: ( 'FROM' )
            {
            // InternalMSQLQuery.g:175:1: ( 'FROM' )
            // InternalMSQLQuery.g:176:2: 'FROM'
            {
             before(grammarAccess.getSelectQueryAccess().getFROMKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSelectQueryAccess().getFROMKeyword_3()); 

            }


            }

        }
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
    // InternalMSQLQuery.g:185:1: rule__SelectQuery__Group__4 : rule__SelectQuery__Group__4__Impl rule__SelectQuery__Group__5 ;
    public final void rule__SelectQuery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQuery.g:189:1: ( rule__SelectQuery__Group__4__Impl rule__SelectQuery__Group__5 )
            // InternalMSQLQuery.g:190:2: rule__SelectQuery__Group__4__Impl rule__SelectQuery__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalMSQLQuery.g:197:1: rule__SelectQuery__Group__4__Impl : ( ( rule__SelectQuery__FromAssignment_4 ) ) ;
    public final void rule__SelectQuery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQuery.g:201:1: ( ( ( rule__SelectQuery__FromAssignment_4 ) ) )
            // InternalMSQLQuery.g:202:1: ( ( rule__SelectQuery__FromAssignment_4 ) )
            {
            // InternalMSQLQuery.g:202:1: ( ( rule__SelectQuery__FromAssignment_4 ) )
            // InternalMSQLQuery.g:203:2: ( rule__SelectQuery__FromAssignment_4 )
            {
             before(grammarAccess.getSelectQueryAccess().getFromAssignment_4()); 
            // InternalMSQLQuery.g:204:2: ( rule__SelectQuery__FromAssignment_4 )
            // InternalMSQLQuery.g:204:3: rule__SelectQuery__FromAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SelectQuery__FromAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSelectQueryAccess().getFromAssignment_4()); 

            }


            }

        }
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
    // InternalMSQLQuery.g:212:1: rule__SelectQuery__Group__5 : rule__SelectQuery__Group__5__Impl ;
    public final void rule__SelectQuery__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQuery.g:216:1: ( rule__SelectQuery__Group__5__Impl )
            // InternalMSQLQuery.g:217:2: rule__SelectQuery__Group__5__Impl
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
    // InternalMSQLQuery.g:223:1: rule__SelectQuery__Group__5__Impl : ( ';' ) ;
    public final void rule__SelectQuery__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQuery.g:227:1: ( ( ';' ) )
            // InternalMSQLQuery.g:228:1: ( ';' )
            {
            // InternalMSQLQuery.g:228:1: ( ';' )
            // InternalMSQLQuery.g:229:2: ';'
            {
             before(grammarAccess.getSelectQueryAccess().getSemicolonKeyword_5()); 
            match(input,13,FOLLOW_2); 
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


    // $ANTLR start "rule__SelectQuery__Group_2__0"
    // InternalMSQLQuery.g:239:1: rule__SelectQuery__Group_2__0 : rule__SelectQuery__Group_2__0__Impl rule__SelectQuery__Group_2__1 ;
    public final void rule__SelectQuery__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQuery.g:243:1: ( rule__SelectQuery__Group_2__0__Impl rule__SelectQuery__Group_2__1 )
            // InternalMSQLQuery.g:244:2: rule__SelectQuery__Group_2__0__Impl rule__SelectQuery__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__SelectQuery__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectQuery__Group_2__1();

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
    // $ANTLR end "rule__SelectQuery__Group_2__0"


    // $ANTLR start "rule__SelectQuery__Group_2__0__Impl"
    // InternalMSQLQuery.g:251:1: rule__SelectQuery__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SelectQuery__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQuery.g:255:1: ( ( ',' ) )
            // InternalMSQLQuery.g:256:1: ( ',' )
            {
            // InternalMSQLQuery.g:256:1: ( ',' )
            // InternalMSQLQuery.g:257:2: ','
            {
             before(grammarAccess.getSelectQueryAccess().getCommaKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSelectQueryAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__Group_2__0__Impl"


    // $ANTLR start "rule__SelectQuery__Group_2__1"
    // InternalMSQLQuery.g:266:1: rule__SelectQuery__Group_2__1 : rule__SelectQuery__Group_2__1__Impl ;
    public final void rule__SelectQuery__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQuery.g:270:1: ( rule__SelectQuery__Group_2__1__Impl )
            // InternalMSQLQuery.g:271:2: rule__SelectQuery__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectQuery__Group_2__1__Impl();

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
    // $ANTLR end "rule__SelectQuery__Group_2__1"


    // $ANTLR start "rule__SelectQuery__Group_2__1__Impl"
    // InternalMSQLQuery.g:277:1: rule__SelectQuery__Group_2__1__Impl : ( ( rule__SelectQuery__WhatAssignment_2_1 ) ) ;
    public final void rule__SelectQuery__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQuery.g:281:1: ( ( ( rule__SelectQuery__WhatAssignment_2_1 ) ) )
            // InternalMSQLQuery.g:282:1: ( ( rule__SelectQuery__WhatAssignment_2_1 ) )
            {
            // InternalMSQLQuery.g:282:1: ( ( rule__SelectQuery__WhatAssignment_2_1 ) )
            // InternalMSQLQuery.g:283:2: ( rule__SelectQuery__WhatAssignment_2_1 )
            {
             before(grammarAccess.getSelectQueryAccess().getWhatAssignment_2_1()); 
            // InternalMSQLQuery.g:284:2: ( rule__SelectQuery__WhatAssignment_2_1 )
            // InternalMSQLQuery.g:284:3: rule__SelectQuery__WhatAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectQuery__WhatAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectQueryAccess().getWhatAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__Group_2__1__Impl"


    // $ANTLR start "rule__SelectQuery__WhatAssignment_1"
    // InternalMSQLQuery.g:293:1: rule__SelectQuery__WhatAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SelectQuery__WhatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQuery.g:297:1: ( ( ( RULE_ID ) ) )
            // InternalMSQLQuery.g:298:2: ( ( RULE_ID ) )
            {
            // InternalMSQLQuery.g:298:2: ( ( RULE_ID ) )
            // InternalMSQLQuery.g:299:3: ( RULE_ID )
            {
             before(grammarAccess.getSelectQueryAccess().getWhatColumnCrossReference_1_0()); 
            // InternalMSQLQuery.g:300:3: ( RULE_ID )
            // InternalMSQLQuery.g:301:4: RULE_ID
            {
             before(grammarAccess.getSelectQueryAccess().getWhatColumnIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectQueryAccess().getWhatColumnIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSelectQueryAccess().getWhatColumnCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__WhatAssignment_1"


    // $ANTLR start "rule__SelectQuery__WhatAssignment_2_1"
    // InternalMSQLQuery.g:312:1: rule__SelectQuery__WhatAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__SelectQuery__WhatAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQuery.g:316:1: ( ( ( RULE_ID ) ) )
            // InternalMSQLQuery.g:317:2: ( ( RULE_ID ) )
            {
            // InternalMSQLQuery.g:317:2: ( ( RULE_ID ) )
            // InternalMSQLQuery.g:318:3: ( RULE_ID )
            {
             before(grammarAccess.getSelectQueryAccess().getWhatColumnCrossReference_2_1_0()); 
            // InternalMSQLQuery.g:319:3: ( RULE_ID )
            // InternalMSQLQuery.g:320:4: RULE_ID
            {
             before(grammarAccess.getSelectQueryAccess().getWhatColumnIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectQueryAccess().getWhatColumnIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getSelectQueryAccess().getWhatColumnCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__WhatAssignment_2_1"


    // $ANTLR start "rule__SelectQuery__FromAssignment_4"
    // InternalMSQLQuery.g:331:1: rule__SelectQuery__FromAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__SelectQuery__FromAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQuery.g:335:1: ( ( ( RULE_ID ) ) )
            // InternalMSQLQuery.g:336:2: ( ( RULE_ID ) )
            {
            // InternalMSQLQuery.g:336:2: ( ( RULE_ID ) )
            // InternalMSQLQuery.g:337:3: ( RULE_ID )
            {
             before(grammarAccess.getSelectQueryAccess().getFromTableCrossReference_4_0()); 
            // InternalMSQLQuery.g:338:3: ( RULE_ID )
            // InternalMSQLQuery.g:339:4: RULE_ID
            {
             before(grammarAccess.getSelectQueryAccess().getFromTableIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectQueryAccess().getFromTableIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getSelectQueryAccess().getFromTableCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__FromAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});

}