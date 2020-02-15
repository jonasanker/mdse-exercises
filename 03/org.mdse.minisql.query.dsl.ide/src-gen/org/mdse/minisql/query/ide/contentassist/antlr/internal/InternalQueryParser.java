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


    // $ANTLR start "rule__SelectQuery__Group__0"
    // InternalQuery.g:77:1: rule__SelectQuery__Group__0 : rule__SelectQuery__Group__0__Impl rule__SelectQuery__Group__1 ;
    public final void rule__SelectQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:81:1: ( rule__SelectQuery__Group__0__Impl rule__SelectQuery__Group__1 )
            // InternalQuery.g:82:2: rule__SelectQuery__Group__0__Impl rule__SelectQuery__Group__1
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
    // InternalQuery.g:89:1: rule__SelectQuery__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__SelectQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:93:1: ( ( 'SELECT' ) )
            // InternalQuery.g:94:1: ( 'SELECT' )
            {
            // InternalQuery.g:94:1: ( 'SELECT' )
            // InternalQuery.g:95:2: 'SELECT'
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
    // InternalQuery.g:104:1: rule__SelectQuery__Group__1 : rule__SelectQuery__Group__1__Impl rule__SelectQuery__Group__2 ;
    public final void rule__SelectQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:108:1: ( rule__SelectQuery__Group__1__Impl rule__SelectQuery__Group__2 )
            // InternalQuery.g:109:2: rule__SelectQuery__Group__1__Impl rule__SelectQuery__Group__2
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
    // InternalQuery.g:116:1: rule__SelectQuery__Group__1__Impl : ( ( rule__SelectQuery__WhatAssignment_1 ) ) ;
    public final void rule__SelectQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:120:1: ( ( ( rule__SelectQuery__WhatAssignment_1 ) ) )
            // InternalQuery.g:121:1: ( ( rule__SelectQuery__WhatAssignment_1 ) )
            {
            // InternalQuery.g:121:1: ( ( rule__SelectQuery__WhatAssignment_1 ) )
            // InternalQuery.g:122:2: ( rule__SelectQuery__WhatAssignment_1 )
            {
             before(grammarAccess.getSelectQueryAccess().getWhatAssignment_1()); 
            // InternalQuery.g:123:2: ( rule__SelectQuery__WhatAssignment_1 )
            // InternalQuery.g:123:3: rule__SelectQuery__WhatAssignment_1
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
    // InternalQuery.g:131:1: rule__SelectQuery__Group__2 : rule__SelectQuery__Group__2__Impl rule__SelectQuery__Group__3 ;
    public final void rule__SelectQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:135:1: ( rule__SelectQuery__Group__2__Impl rule__SelectQuery__Group__3 )
            // InternalQuery.g:136:2: rule__SelectQuery__Group__2__Impl rule__SelectQuery__Group__3
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
    // InternalQuery.g:143:1: rule__SelectQuery__Group__2__Impl : ( ( rule__SelectQuery__Group_2__0 )* ) ;
    public final void rule__SelectQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:147:1: ( ( ( rule__SelectQuery__Group_2__0 )* ) )
            // InternalQuery.g:148:1: ( ( rule__SelectQuery__Group_2__0 )* )
            {
            // InternalQuery.g:148:1: ( ( rule__SelectQuery__Group_2__0 )* )
            // InternalQuery.g:149:2: ( rule__SelectQuery__Group_2__0 )*
            {
             before(grammarAccess.getSelectQueryAccess().getGroup_2()); 
            // InternalQuery.g:150:2: ( rule__SelectQuery__Group_2__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalQuery.g:150:3: rule__SelectQuery__Group_2__0
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
    // InternalQuery.g:158:1: rule__SelectQuery__Group__3 : rule__SelectQuery__Group__3__Impl rule__SelectQuery__Group__4 ;
    public final void rule__SelectQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:162:1: ( rule__SelectQuery__Group__3__Impl rule__SelectQuery__Group__4 )
            // InternalQuery.g:163:2: rule__SelectQuery__Group__3__Impl rule__SelectQuery__Group__4
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
    // InternalQuery.g:170:1: rule__SelectQuery__Group__3__Impl : ( 'FROM' ) ;
    public final void rule__SelectQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:174:1: ( ( 'FROM' ) )
            // InternalQuery.g:175:1: ( 'FROM' )
            {
            // InternalQuery.g:175:1: ( 'FROM' )
            // InternalQuery.g:176:2: 'FROM'
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
    // InternalQuery.g:185:1: rule__SelectQuery__Group__4 : rule__SelectQuery__Group__4__Impl rule__SelectQuery__Group__5 ;
    public final void rule__SelectQuery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:189:1: ( rule__SelectQuery__Group__4__Impl rule__SelectQuery__Group__5 )
            // InternalQuery.g:190:2: rule__SelectQuery__Group__4__Impl rule__SelectQuery__Group__5
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
    // InternalQuery.g:197:1: rule__SelectQuery__Group__4__Impl : ( ( rule__SelectQuery__FromAssignment_4 ) ) ;
    public final void rule__SelectQuery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:201:1: ( ( ( rule__SelectQuery__FromAssignment_4 ) ) )
            // InternalQuery.g:202:1: ( ( rule__SelectQuery__FromAssignment_4 ) )
            {
            // InternalQuery.g:202:1: ( ( rule__SelectQuery__FromAssignment_4 ) )
            // InternalQuery.g:203:2: ( rule__SelectQuery__FromAssignment_4 )
            {
             before(grammarAccess.getSelectQueryAccess().getFromAssignment_4()); 
            // InternalQuery.g:204:2: ( rule__SelectQuery__FromAssignment_4 )
            // InternalQuery.g:204:3: rule__SelectQuery__FromAssignment_4
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
    // InternalQuery.g:212:1: rule__SelectQuery__Group__5 : rule__SelectQuery__Group__5__Impl ;
    public final void rule__SelectQuery__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:216:1: ( rule__SelectQuery__Group__5__Impl )
            // InternalQuery.g:217:2: rule__SelectQuery__Group__5__Impl
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
    // InternalQuery.g:223:1: rule__SelectQuery__Group__5__Impl : ( ';' ) ;
    public final void rule__SelectQuery__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:227:1: ( ( ';' ) )
            // InternalQuery.g:228:1: ( ';' )
            {
            // InternalQuery.g:228:1: ( ';' )
            // InternalQuery.g:229:2: ';'
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
    // InternalQuery.g:239:1: rule__SelectQuery__Group_2__0 : rule__SelectQuery__Group_2__0__Impl rule__SelectQuery__Group_2__1 ;
    public final void rule__SelectQuery__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:243:1: ( rule__SelectQuery__Group_2__0__Impl rule__SelectQuery__Group_2__1 )
            // InternalQuery.g:244:2: rule__SelectQuery__Group_2__0__Impl rule__SelectQuery__Group_2__1
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
    // InternalQuery.g:251:1: rule__SelectQuery__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SelectQuery__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:255:1: ( ( ',' ) )
            // InternalQuery.g:256:1: ( ',' )
            {
            // InternalQuery.g:256:1: ( ',' )
            // InternalQuery.g:257:2: ','
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
    // InternalQuery.g:266:1: rule__SelectQuery__Group_2__1 : rule__SelectQuery__Group_2__1__Impl ;
    public final void rule__SelectQuery__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:270:1: ( rule__SelectQuery__Group_2__1__Impl )
            // InternalQuery.g:271:2: rule__SelectQuery__Group_2__1__Impl
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
    // InternalQuery.g:277:1: rule__SelectQuery__Group_2__1__Impl : ( ( rule__SelectQuery__WhatAssignment_2_1 ) ) ;
    public final void rule__SelectQuery__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:281:1: ( ( ( rule__SelectQuery__WhatAssignment_2_1 ) ) )
            // InternalQuery.g:282:1: ( ( rule__SelectQuery__WhatAssignment_2_1 ) )
            {
            // InternalQuery.g:282:1: ( ( rule__SelectQuery__WhatAssignment_2_1 ) )
            // InternalQuery.g:283:2: ( rule__SelectQuery__WhatAssignment_2_1 )
            {
             before(grammarAccess.getSelectQueryAccess().getWhatAssignment_2_1()); 
            // InternalQuery.g:284:2: ( rule__SelectQuery__WhatAssignment_2_1 )
            // InternalQuery.g:284:3: rule__SelectQuery__WhatAssignment_2_1
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
    // InternalQuery.g:293:1: rule__SelectQuery__WhatAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SelectQuery__WhatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:297:1: ( ( ( RULE_ID ) ) )
            // InternalQuery.g:298:2: ( ( RULE_ID ) )
            {
            // InternalQuery.g:298:2: ( ( RULE_ID ) )
            // InternalQuery.g:299:3: ( RULE_ID )
            {
             before(grammarAccess.getSelectQueryAccess().getWhatColumnCrossReference_1_0()); 
            // InternalQuery.g:300:3: ( RULE_ID )
            // InternalQuery.g:301:4: RULE_ID
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
    // InternalQuery.g:312:1: rule__SelectQuery__WhatAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__SelectQuery__WhatAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:316:1: ( ( ( RULE_ID ) ) )
            // InternalQuery.g:317:2: ( ( RULE_ID ) )
            {
            // InternalQuery.g:317:2: ( ( RULE_ID ) )
            // InternalQuery.g:318:3: ( RULE_ID )
            {
             before(grammarAccess.getSelectQueryAccess().getWhatColumnCrossReference_2_1_0()); 
            // InternalQuery.g:319:3: ( RULE_ID )
            // InternalQuery.g:320:4: RULE_ID
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
    // InternalQuery.g:331:1: rule__SelectQuery__FromAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__SelectQuery__FromAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuery.g:335:1: ( ( ( RULE_ID ) ) )
            // InternalQuery.g:336:2: ( ( RULE_ID ) )
            {
            // InternalQuery.g:336:2: ( ( RULE_ID ) )
            // InternalQuery.g:337:3: ( RULE_ID )
            {
             before(grammarAccess.getSelectQueryAccess().getFromTableCrossReference_4_0()); 
            // InternalQuery.g:338:3: ( RULE_ID )
            // InternalQuery.g:339:4: RULE_ID
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