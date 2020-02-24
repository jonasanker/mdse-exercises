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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SELECT", "FROM", "Comma", "Semicolon", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=8;
    public static final int RULE_WS=13;
    public static final int RULE_STRING=10;
    public static final int FROM=5;
    public static final int RULE_ANY_OTHER=14;
    public static final int SELECT=4;
    public static final int RULE_SL_COMMENT=12;
    public static final int Semicolon=7;
    public static final int Comma=6;
    public static final int RULE_INT=9;
    public static final int RULE_ML_COMMENT=11;
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
    public String getGrammarFileName() { return "InternalMSQLQueryParser.g"; }


    	private MSQLQueryGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("Semicolon", "';'");
    		tokenNameToValue.put("FROM", "'FROM'");
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
    // InternalMSQLQueryParser.g:59:1: entryRuleSelectQuery : ruleSelectQuery EOF ;
    public final void entryRuleSelectQuery() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:60:1: ( ruleSelectQuery EOF )
            // InternalMSQLQueryParser.g:61:1: ruleSelectQuery EOF
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
    // InternalMSQLQueryParser.g:68:1: ruleSelectQuery : ( ( rule__SelectQuery__Group__0 ) ) ;
    public final void ruleSelectQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:72:2: ( ( ( rule__SelectQuery__Group__0 ) ) )
            // InternalMSQLQueryParser.g:73:2: ( ( rule__SelectQuery__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:73:2: ( ( rule__SelectQuery__Group__0 ) )
            // InternalMSQLQueryParser.g:74:3: ( rule__SelectQuery__Group__0 )
            {
             before(grammarAccess.getSelectQueryAccess().getGroup()); 
            // InternalMSQLQueryParser.g:75:3: ( rule__SelectQuery__Group__0 )
            // InternalMSQLQueryParser.g:75:4: rule__SelectQuery__Group__0
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
    // InternalMSQLQueryParser.g:83:1: rule__SelectQuery__Group__0 : rule__SelectQuery__Group__0__Impl rule__SelectQuery__Group__1 ;
    public final void rule__SelectQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:87:1: ( rule__SelectQuery__Group__0__Impl rule__SelectQuery__Group__1 )
            // InternalMSQLQueryParser.g:88:2: rule__SelectQuery__Group__0__Impl rule__SelectQuery__Group__1
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
    // InternalMSQLQueryParser.g:95:1: rule__SelectQuery__Group__0__Impl : ( SELECT ) ;
    public final void rule__SelectQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:99:1: ( ( SELECT ) )
            // InternalMSQLQueryParser.g:100:1: ( SELECT )
            {
            // InternalMSQLQueryParser.g:100:1: ( SELECT )
            // InternalMSQLQueryParser.g:101:2: SELECT
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
    // InternalMSQLQueryParser.g:110:1: rule__SelectQuery__Group__1 : rule__SelectQuery__Group__1__Impl rule__SelectQuery__Group__2 ;
    public final void rule__SelectQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:114:1: ( rule__SelectQuery__Group__1__Impl rule__SelectQuery__Group__2 )
            // InternalMSQLQueryParser.g:115:2: rule__SelectQuery__Group__1__Impl rule__SelectQuery__Group__2
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
    // InternalMSQLQueryParser.g:122:1: rule__SelectQuery__Group__1__Impl : ( ( rule__SelectQuery__WhatAssignment_1 ) ) ;
    public final void rule__SelectQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:126:1: ( ( ( rule__SelectQuery__WhatAssignment_1 ) ) )
            // InternalMSQLQueryParser.g:127:1: ( ( rule__SelectQuery__WhatAssignment_1 ) )
            {
            // InternalMSQLQueryParser.g:127:1: ( ( rule__SelectQuery__WhatAssignment_1 ) )
            // InternalMSQLQueryParser.g:128:2: ( rule__SelectQuery__WhatAssignment_1 )
            {
             before(grammarAccess.getSelectQueryAccess().getWhatAssignment_1()); 
            // InternalMSQLQueryParser.g:129:2: ( rule__SelectQuery__WhatAssignment_1 )
            // InternalMSQLQueryParser.g:129:3: rule__SelectQuery__WhatAssignment_1
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
    // InternalMSQLQueryParser.g:137:1: rule__SelectQuery__Group__2 : rule__SelectQuery__Group__2__Impl rule__SelectQuery__Group__3 ;
    public final void rule__SelectQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:141:1: ( rule__SelectQuery__Group__2__Impl rule__SelectQuery__Group__3 )
            // InternalMSQLQueryParser.g:142:2: rule__SelectQuery__Group__2__Impl rule__SelectQuery__Group__3
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
    // InternalMSQLQueryParser.g:149:1: rule__SelectQuery__Group__2__Impl : ( ( rule__SelectQuery__Group_2__0 )* ) ;
    public final void rule__SelectQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:153:1: ( ( ( rule__SelectQuery__Group_2__0 )* ) )
            // InternalMSQLQueryParser.g:154:1: ( ( rule__SelectQuery__Group_2__0 )* )
            {
            // InternalMSQLQueryParser.g:154:1: ( ( rule__SelectQuery__Group_2__0 )* )
            // InternalMSQLQueryParser.g:155:2: ( rule__SelectQuery__Group_2__0 )*
            {
             before(grammarAccess.getSelectQueryAccess().getGroup_2()); 
            // InternalMSQLQueryParser.g:156:2: ( rule__SelectQuery__Group_2__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Comma) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:156:3: rule__SelectQuery__Group_2__0
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
    // InternalMSQLQueryParser.g:164:1: rule__SelectQuery__Group__3 : rule__SelectQuery__Group__3__Impl rule__SelectQuery__Group__4 ;
    public final void rule__SelectQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:168:1: ( rule__SelectQuery__Group__3__Impl rule__SelectQuery__Group__4 )
            // InternalMSQLQueryParser.g:169:2: rule__SelectQuery__Group__3__Impl rule__SelectQuery__Group__4
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
    // InternalMSQLQueryParser.g:176:1: rule__SelectQuery__Group__3__Impl : ( FROM ) ;
    public final void rule__SelectQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:180:1: ( ( FROM ) )
            // InternalMSQLQueryParser.g:181:1: ( FROM )
            {
            // InternalMSQLQueryParser.g:181:1: ( FROM )
            // InternalMSQLQueryParser.g:182:2: FROM
            {
             before(grammarAccess.getSelectQueryAccess().getFROMKeyword_3()); 
            match(input,FROM,FOLLOW_2); 
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
    // InternalMSQLQueryParser.g:191:1: rule__SelectQuery__Group__4 : rule__SelectQuery__Group__4__Impl rule__SelectQuery__Group__5 ;
    public final void rule__SelectQuery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:195:1: ( rule__SelectQuery__Group__4__Impl rule__SelectQuery__Group__5 )
            // InternalMSQLQueryParser.g:196:2: rule__SelectQuery__Group__4__Impl rule__SelectQuery__Group__5
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
    // InternalMSQLQueryParser.g:203:1: rule__SelectQuery__Group__4__Impl : ( ( rule__SelectQuery__FromAssignment_4 ) ) ;
    public final void rule__SelectQuery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:207:1: ( ( ( rule__SelectQuery__FromAssignment_4 ) ) )
            // InternalMSQLQueryParser.g:208:1: ( ( rule__SelectQuery__FromAssignment_4 ) )
            {
            // InternalMSQLQueryParser.g:208:1: ( ( rule__SelectQuery__FromAssignment_4 ) )
            // InternalMSQLQueryParser.g:209:2: ( rule__SelectQuery__FromAssignment_4 )
            {
             before(grammarAccess.getSelectQueryAccess().getFromAssignment_4()); 
            // InternalMSQLQueryParser.g:210:2: ( rule__SelectQuery__FromAssignment_4 )
            // InternalMSQLQueryParser.g:210:3: rule__SelectQuery__FromAssignment_4
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
    // InternalMSQLQueryParser.g:218:1: rule__SelectQuery__Group__5 : rule__SelectQuery__Group__5__Impl ;
    public final void rule__SelectQuery__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:222:1: ( rule__SelectQuery__Group__5__Impl )
            // InternalMSQLQueryParser.g:223:2: rule__SelectQuery__Group__5__Impl
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
    // InternalMSQLQueryParser.g:229:1: rule__SelectQuery__Group__5__Impl : ( Semicolon ) ;
    public final void rule__SelectQuery__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:233:1: ( ( Semicolon ) )
            // InternalMSQLQueryParser.g:234:1: ( Semicolon )
            {
            // InternalMSQLQueryParser.g:234:1: ( Semicolon )
            // InternalMSQLQueryParser.g:235:2: Semicolon
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


    // $ANTLR start "rule__SelectQuery__Group_2__0"
    // InternalMSQLQueryParser.g:245:1: rule__SelectQuery__Group_2__0 : rule__SelectQuery__Group_2__0__Impl rule__SelectQuery__Group_2__1 ;
    public final void rule__SelectQuery__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:249:1: ( rule__SelectQuery__Group_2__0__Impl rule__SelectQuery__Group_2__1 )
            // InternalMSQLQueryParser.g:250:2: rule__SelectQuery__Group_2__0__Impl rule__SelectQuery__Group_2__1
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
    // InternalMSQLQueryParser.g:257:1: rule__SelectQuery__Group_2__0__Impl : ( Comma ) ;
    public final void rule__SelectQuery__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:261:1: ( ( Comma ) )
            // InternalMSQLQueryParser.g:262:1: ( Comma )
            {
            // InternalMSQLQueryParser.g:262:1: ( Comma )
            // InternalMSQLQueryParser.g:263:2: Comma
            {
             before(grammarAccess.getSelectQueryAccess().getCommaKeyword_2_0()); 
            match(input,Comma,FOLLOW_2); 
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
    // InternalMSQLQueryParser.g:272:1: rule__SelectQuery__Group_2__1 : rule__SelectQuery__Group_2__1__Impl ;
    public final void rule__SelectQuery__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:276:1: ( rule__SelectQuery__Group_2__1__Impl )
            // InternalMSQLQueryParser.g:277:2: rule__SelectQuery__Group_2__1__Impl
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
    // InternalMSQLQueryParser.g:283:1: rule__SelectQuery__Group_2__1__Impl : ( ( rule__SelectQuery__WhatAssignment_2_1 ) ) ;
    public final void rule__SelectQuery__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:287:1: ( ( ( rule__SelectQuery__WhatAssignment_2_1 ) ) )
            // InternalMSQLQueryParser.g:288:1: ( ( rule__SelectQuery__WhatAssignment_2_1 ) )
            {
            // InternalMSQLQueryParser.g:288:1: ( ( rule__SelectQuery__WhatAssignment_2_1 ) )
            // InternalMSQLQueryParser.g:289:2: ( rule__SelectQuery__WhatAssignment_2_1 )
            {
             before(grammarAccess.getSelectQueryAccess().getWhatAssignment_2_1()); 
            // InternalMSQLQueryParser.g:290:2: ( rule__SelectQuery__WhatAssignment_2_1 )
            // InternalMSQLQueryParser.g:290:3: rule__SelectQuery__WhatAssignment_2_1
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
    // InternalMSQLQueryParser.g:299:1: rule__SelectQuery__WhatAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SelectQuery__WhatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:303:1: ( ( ( RULE_ID ) ) )
            // InternalMSQLQueryParser.g:304:2: ( ( RULE_ID ) )
            {
            // InternalMSQLQueryParser.g:304:2: ( ( RULE_ID ) )
            // InternalMSQLQueryParser.g:305:3: ( RULE_ID )
            {
             before(grammarAccess.getSelectQueryAccess().getWhatColumnCrossReference_1_0()); 
            // InternalMSQLQueryParser.g:306:3: ( RULE_ID )
            // InternalMSQLQueryParser.g:307:4: RULE_ID
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
    // InternalMSQLQueryParser.g:318:1: rule__SelectQuery__WhatAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__SelectQuery__WhatAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:322:1: ( ( ( RULE_ID ) ) )
            // InternalMSQLQueryParser.g:323:2: ( ( RULE_ID ) )
            {
            // InternalMSQLQueryParser.g:323:2: ( ( RULE_ID ) )
            // InternalMSQLQueryParser.g:324:3: ( RULE_ID )
            {
             before(grammarAccess.getSelectQueryAccess().getWhatColumnCrossReference_2_1_0()); 
            // InternalMSQLQueryParser.g:325:3: ( RULE_ID )
            // InternalMSQLQueryParser.g:326:4: RULE_ID
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
    // InternalMSQLQueryParser.g:337:1: rule__SelectQuery__FromAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__SelectQuery__FromAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:341:1: ( ( ( RULE_ID ) ) )
            // InternalMSQLQueryParser.g:342:2: ( ( RULE_ID ) )
            {
            // InternalMSQLQueryParser.g:342:2: ( ( RULE_ID ) )
            // InternalMSQLQueryParser.g:343:3: ( RULE_ID )
            {
             before(grammarAccess.getSelectQueryAccess().getFromTableCrossReference_4_0()); 
            // InternalMSQLQueryParser.g:344:3: ( RULE_ID )
            // InternalMSQLQueryParser.g:345:4: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});

}