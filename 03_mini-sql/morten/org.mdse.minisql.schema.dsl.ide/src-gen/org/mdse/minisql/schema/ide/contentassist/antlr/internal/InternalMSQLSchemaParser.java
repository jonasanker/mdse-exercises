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
import org.mdse.minisql.schema.services.MSQLSchemaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMSQLSchemaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TABLE'", "'{'", "'}'", "','"
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


        public InternalMSQLSchemaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMSQLSchemaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMSQLSchemaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMSQLSchema.g"; }


    	private MSQLSchemaGrammarAccess grammarAccess;

    	public void setGrammarAccess(MSQLSchemaGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleTable"
    // InternalMSQLSchema.g:53:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalMSQLSchema.g:54:1: ( ruleTable EOF )
            // InternalMSQLSchema.g:55:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalMSQLSchema.g:62:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchema.g:66:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalMSQLSchema.g:67:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalMSQLSchema.g:67:2: ( ( rule__Table__Group__0 ) )
            // InternalMSQLSchema.g:68:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalMSQLSchema.g:69:3: ( rule__Table__Group__0 )
            // InternalMSQLSchema.g:69:4: rule__Table__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleColumn"
    // InternalMSQLSchema.g:78:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalMSQLSchema.g:79:1: ( ruleColumn EOF )
            // InternalMSQLSchema.g:80:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalMSQLSchema.g:87:1: ruleColumn : ( ( rule__Column__NameAssignment ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchema.g:91:2: ( ( ( rule__Column__NameAssignment ) ) )
            // InternalMSQLSchema.g:92:2: ( ( rule__Column__NameAssignment ) )
            {
            // InternalMSQLSchema.g:92:2: ( ( rule__Column__NameAssignment ) )
            // InternalMSQLSchema.g:93:3: ( rule__Column__NameAssignment )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment()); 
            // InternalMSQLSchema.g:94:3: ( rule__Column__NameAssignment )
            // InternalMSQLSchema.g:94:4: rule__Column__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Column__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "rule__Table__Group__0"
    // InternalMSQLSchema.g:102:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchema.g:106:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalMSQLSchema.g:107:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__1();

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
    // $ANTLR end "rule__Table__Group__0"


    // $ANTLR start "rule__Table__Group__0__Impl"
    // InternalMSQLSchema.g:114:1: rule__Table__Group__0__Impl : ( 'TABLE' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchema.g:118:1: ( ( 'TABLE' ) )
            // InternalMSQLSchema.g:119:1: ( 'TABLE' )
            {
            // InternalMSQLSchema.g:119:1: ( 'TABLE' )
            // InternalMSQLSchema.g:120:2: 'TABLE'
            {
             before(grammarAccess.getTableAccess().getTABLEKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getTABLEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // InternalMSQLSchema.g:129:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchema.g:133:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalMSQLSchema.g:134:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Table__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__2();

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
    // $ANTLR end "rule__Table__Group__1"


    // $ANTLR start "rule__Table__Group__1__Impl"
    // InternalMSQLSchema.g:141:1: rule__Table__Group__1__Impl : ( ( rule__Table__NameAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchema.g:145:1: ( ( ( rule__Table__NameAssignment_1 ) ) )
            // InternalMSQLSchema.g:146:1: ( ( rule__Table__NameAssignment_1 ) )
            {
            // InternalMSQLSchema.g:146:1: ( ( rule__Table__NameAssignment_1 ) )
            // InternalMSQLSchema.g:147:2: ( rule__Table__NameAssignment_1 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_1()); 
            // InternalMSQLSchema.g:148:2: ( rule__Table__NameAssignment_1 )
            // InternalMSQLSchema.g:148:3: rule__Table__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__2"
    // InternalMSQLSchema.g:156:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchema.g:160:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalMSQLSchema.g:161:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Table__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__3();

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
    // $ANTLR end "rule__Table__Group__2"


    // $ANTLR start "rule__Table__Group__2__Impl"
    // InternalMSQLSchema.g:168:1: rule__Table__Group__2__Impl : ( '{' ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchema.g:172:1: ( ( '{' ) )
            // InternalMSQLSchema.g:173:1: ( '{' )
            {
            // InternalMSQLSchema.g:173:1: ( '{' )
            // InternalMSQLSchema.g:174:2: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__3"
    // InternalMSQLSchema.g:183:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchema.g:187:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalMSQLSchema.g:188:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Table__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__4();

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
    // $ANTLR end "rule__Table__Group__3"


    // $ANTLR start "rule__Table__Group__3__Impl"
    // InternalMSQLSchema.g:195:1: rule__Table__Group__3__Impl : ( ( rule__Table__ColumnAssignment_3 ) ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchema.g:199:1: ( ( ( rule__Table__ColumnAssignment_3 ) ) )
            // InternalMSQLSchema.g:200:1: ( ( rule__Table__ColumnAssignment_3 ) )
            {
            // InternalMSQLSchema.g:200:1: ( ( rule__Table__ColumnAssignment_3 ) )
            // InternalMSQLSchema.g:201:2: ( rule__Table__ColumnAssignment_3 )
            {
             before(grammarAccess.getTableAccess().getColumnAssignment_3()); 
            // InternalMSQLSchema.g:202:2: ( rule__Table__ColumnAssignment_3 )
            // InternalMSQLSchema.g:202:3: rule__Table__ColumnAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Table__ColumnAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getColumnAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3__Impl"


    // $ANTLR start "rule__Table__Group__4"
    // InternalMSQLSchema.g:210:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchema.g:214:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalMSQLSchema.g:215:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Table__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__5();

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
    // $ANTLR end "rule__Table__Group__4"


    // $ANTLR start "rule__Table__Group__4__Impl"
    // InternalMSQLSchema.g:222:1: rule__Table__Group__4__Impl : ( ( rule__Table__Group_4__0 )* ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchema.g:226:1: ( ( ( rule__Table__Group_4__0 )* ) )
            // InternalMSQLSchema.g:227:1: ( ( rule__Table__Group_4__0 )* )
            {
            // InternalMSQLSchema.g:227:1: ( ( rule__Table__Group_4__0 )* )
            // InternalMSQLSchema.g:228:2: ( rule__Table__Group_4__0 )*
            {
             before(grammarAccess.getTableAccess().getGroup_4()); 
            // InternalMSQLSchema.g:229:2: ( rule__Table__Group_4__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMSQLSchema.g:229:3: rule__Table__Group_4__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Table__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4__Impl"


    // $ANTLR start "rule__Table__Group__5"
    // InternalMSQLSchema.g:237:1: rule__Table__Group__5 : rule__Table__Group__5__Impl ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchema.g:241:1: ( rule__Table__Group__5__Impl )
            // InternalMSQLSchema.g:242:2: rule__Table__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__5__Impl();

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
    // $ANTLR end "rule__Table__Group__5"


    // $ANTLR start "rule__Table__Group__5__Impl"
    // InternalMSQLSchema.g:248:1: rule__Table__Group__5__Impl : ( '}' ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchema.g:252:1: ( ( '}' ) )
            // InternalMSQLSchema.g:253:1: ( '}' )
            {
            // InternalMSQLSchema.g:253:1: ( '}' )
            // InternalMSQLSchema.g:254:2: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__5__Impl"


    // $ANTLR start "rule__Table__Group_4__0"
    // InternalMSQLSchema.g:264:1: rule__Table__Group_4__0 : rule__Table__Group_4__0__Impl rule__Table__Group_4__1 ;
    public final void rule__Table__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchema.g:268:1: ( rule__Table__Group_4__0__Impl rule__Table__Group_4__1 )
            // InternalMSQLSchema.g:269:2: rule__Table__Group_4__0__Impl rule__Table__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Table__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_4__1();

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
    // $ANTLR end "rule__Table__Group_4__0"


    // $ANTLR start "rule__Table__Group_4__0__Impl"
    // InternalMSQLSchema.g:276:1: rule__Table__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Table__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchema.g:280:1: ( ( ',' ) )
            // InternalMSQLSchema.g:281:1: ( ',' )
            {
            // InternalMSQLSchema.g:281:1: ( ',' )
            // InternalMSQLSchema.g:282:2: ','
            {
             before(grammarAccess.getTableAccess().getCommaKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4__0__Impl"


    // $ANTLR start "rule__Table__Group_4__1"
    // InternalMSQLSchema.g:291:1: rule__Table__Group_4__1 : rule__Table__Group_4__1__Impl ;
    public final void rule__Table__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchema.g:295:1: ( rule__Table__Group_4__1__Impl )
            // InternalMSQLSchema.g:296:2: rule__Table__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_4__1__Impl();

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
    // $ANTLR end "rule__Table__Group_4__1"


    // $ANTLR start "rule__Table__Group_4__1__Impl"
    // InternalMSQLSchema.g:302:1: rule__Table__Group_4__1__Impl : ( ( rule__Table__ColumnAssignment_4_1 ) ) ;
    public final void rule__Table__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchema.g:306:1: ( ( ( rule__Table__ColumnAssignment_4_1 ) ) )
            // InternalMSQLSchema.g:307:1: ( ( rule__Table__ColumnAssignment_4_1 ) )
            {
            // InternalMSQLSchema.g:307:1: ( ( rule__Table__ColumnAssignment_4_1 ) )
            // InternalMSQLSchema.g:308:2: ( rule__Table__ColumnAssignment_4_1 )
            {
             before(grammarAccess.getTableAccess().getColumnAssignment_4_1()); 
            // InternalMSQLSchema.g:309:2: ( rule__Table__ColumnAssignment_4_1 )
            // InternalMSQLSchema.g:309:3: rule__Table__ColumnAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__ColumnAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getColumnAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4__1__Impl"


    // $ANTLR start "rule__Table__NameAssignment_1"
    // InternalMSQLSchema.g:318:1: rule__Table__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchema.g:322:1: ( ( RULE_ID ) )
            // InternalMSQLSchema.g:323:2: ( RULE_ID )
            {
            // InternalMSQLSchema.g:323:2: ( RULE_ID )
            // InternalMSQLSchema.g:324:3: RULE_ID
            {
             before(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__NameAssignment_1"


    // $ANTLR start "rule__Table__ColumnAssignment_3"
    // InternalMSQLSchema.g:333:1: rule__Table__ColumnAssignment_3 : ( ruleColumn ) ;
    public final void rule__Table__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchema.g:337:1: ( ( ruleColumn ) )
            // InternalMSQLSchema.g:338:2: ( ruleColumn )
            {
            // InternalMSQLSchema.g:338:2: ( ruleColumn )
            // InternalMSQLSchema.g:339:3: ruleColumn
            {
             before(grammarAccess.getTableAccess().getColumnColumnParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnColumnParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ColumnAssignment_3"


    // $ANTLR start "rule__Table__ColumnAssignment_4_1"
    // InternalMSQLSchema.g:348:1: rule__Table__ColumnAssignment_4_1 : ( ruleColumn ) ;
    public final void rule__Table__ColumnAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchema.g:352:1: ( ( ruleColumn ) )
            // InternalMSQLSchema.g:353:2: ( ruleColumn )
            {
            // InternalMSQLSchema.g:353:2: ( ruleColumn )
            // InternalMSQLSchema.g:354:3: ruleColumn
            {
             before(grammarAccess.getTableAccess().getColumnColumnParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnColumnParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ColumnAssignment_4_1"


    // $ANTLR start "rule__Column__NameAssignment"
    // InternalMSQLSchema.g:363:1: rule__Column__NameAssignment : ( RULE_ID ) ;
    public final void rule__Column__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchema.g:367:1: ( ( RULE_ID ) )
            // InternalMSQLSchema.g:368:2: ( RULE_ID )
            {
            // InternalMSQLSchema.g:368:2: ( RULE_ID )
            // InternalMSQLSchema.g:369:3: RULE_ID
            {
             before(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});

}