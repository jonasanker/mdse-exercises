package org.mdse.minisql.schema.ide.contentassist.antlr.internal;
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
import org.mdse.minisql.schema.services.MSQLSchemaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMSQLSchemaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TABLE", "Comma", "LeftCurlyBracket", "RightCurlyBracket", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=8;
    public static final int RULE_WS=13;
    public static final int LeftCurlyBracket=6;
    public static final int RULE_STRING=10;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_SL_COMMENT=12;
    public static final int TABLE=4;
    public static final int Comma=5;
    public static final int RULE_INT=9;
    public static final int RULE_ML_COMMENT=11;
    public static final int RightCurlyBracket=7;
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
    public String getGrammarFileName() { return "InternalMSQLSchemaParser.g"; }


    	private MSQLSchemaGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("TABLE", "'TABLE'");
    	}

    	public void setGrammarAccess(MSQLSchemaGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleTable"
    // InternalMSQLSchemaParser.g:59:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalMSQLSchemaParser.g:60:1: ( ruleTable EOF )
            // InternalMSQLSchemaParser.g:61:1: ruleTable EOF
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
    // InternalMSQLSchemaParser.g:68:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:72:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalMSQLSchemaParser.g:73:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalMSQLSchemaParser.g:73:2: ( ( rule__Table__Group__0 ) )
            // InternalMSQLSchemaParser.g:74:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalMSQLSchemaParser.g:75:3: ( rule__Table__Group__0 )
            // InternalMSQLSchemaParser.g:75:4: rule__Table__Group__0
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
    // InternalMSQLSchemaParser.g:84:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalMSQLSchemaParser.g:85:1: ( ruleColumn EOF )
            // InternalMSQLSchemaParser.g:86:1: ruleColumn EOF
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
    // InternalMSQLSchemaParser.g:93:1: ruleColumn : ( ( rule__Column__NameAssignment ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:97:2: ( ( ( rule__Column__NameAssignment ) ) )
            // InternalMSQLSchemaParser.g:98:2: ( ( rule__Column__NameAssignment ) )
            {
            // InternalMSQLSchemaParser.g:98:2: ( ( rule__Column__NameAssignment ) )
            // InternalMSQLSchemaParser.g:99:3: ( rule__Column__NameAssignment )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment()); 
            // InternalMSQLSchemaParser.g:100:3: ( rule__Column__NameAssignment )
            // InternalMSQLSchemaParser.g:100:4: rule__Column__NameAssignment
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
    // InternalMSQLSchemaParser.g:108:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:112:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalMSQLSchemaParser.g:113:2: rule__Table__Group__0__Impl rule__Table__Group__1
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
    // InternalMSQLSchemaParser.g:120:1: rule__Table__Group__0__Impl : ( TABLE ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:124:1: ( ( TABLE ) )
            // InternalMSQLSchemaParser.g:125:1: ( TABLE )
            {
            // InternalMSQLSchemaParser.g:125:1: ( TABLE )
            // InternalMSQLSchemaParser.g:126:2: TABLE
            {
             before(grammarAccess.getTableAccess().getTABLEKeyword_0()); 
            match(input,TABLE,FOLLOW_2); 
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
    // InternalMSQLSchemaParser.g:135:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:139:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalMSQLSchemaParser.g:140:2: rule__Table__Group__1__Impl rule__Table__Group__2
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
    // InternalMSQLSchemaParser.g:147:1: rule__Table__Group__1__Impl : ( ( rule__Table__NameAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:151:1: ( ( ( rule__Table__NameAssignment_1 ) ) )
            // InternalMSQLSchemaParser.g:152:1: ( ( rule__Table__NameAssignment_1 ) )
            {
            // InternalMSQLSchemaParser.g:152:1: ( ( rule__Table__NameAssignment_1 ) )
            // InternalMSQLSchemaParser.g:153:2: ( rule__Table__NameAssignment_1 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_1()); 
            // InternalMSQLSchemaParser.g:154:2: ( rule__Table__NameAssignment_1 )
            // InternalMSQLSchemaParser.g:154:3: rule__Table__NameAssignment_1
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
    // InternalMSQLSchemaParser.g:162:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:166:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalMSQLSchemaParser.g:167:2: rule__Table__Group__2__Impl rule__Table__Group__3
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
    // InternalMSQLSchemaParser.g:174:1: rule__Table__Group__2__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:178:1: ( ( LeftCurlyBracket ) )
            // InternalMSQLSchemaParser.g:179:1: ( LeftCurlyBracket )
            {
            // InternalMSQLSchemaParser.g:179:1: ( LeftCurlyBracket )
            // InternalMSQLSchemaParser.g:180:2: LeftCurlyBracket
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
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
    // InternalMSQLSchemaParser.g:189:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:193:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalMSQLSchemaParser.g:194:2: rule__Table__Group__3__Impl rule__Table__Group__4
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
    // InternalMSQLSchemaParser.g:201:1: rule__Table__Group__3__Impl : ( ( rule__Table__ColumnsAssignment_3 ) ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:205:1: ( ( ( rule__Table__ColumnsAssignment_3 ) ) )
            // InternalMSQLSchemaParser.g:206:1: ( ( rule__Table__ColumnsAssignment_3 ) )
            {
            // InternalMSQLSchemaParser.g:206:1: ( ( rule__Table__ColumnsAssignment_3 ) )
            // InternalMSQLSchemaParser.g:207:2: ( rule__Table__ColumnsAssignment_3 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_3()); 
            // InternalMSQLSchemaParser.g:208:2: ( rule__Table__ColumnsAssignment_3 )
            // InternalMSQLSchemaParser.g:208:3: rule__Table__ColumnsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Table__ColumnsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getColumnsAssignment_3()); 

            }


            }

        }
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
    // InternalMSQLSchemaParser.g:216:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:220:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalMSQLSchemaParser.g:221:2: rule__Table__Group__4__Impl rule__Table__Group__5
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
    // InternalMSQLSchemaParser.g:228:1: rule__Table__Group__4__Impl : ( ( rule__Table__Group_4__0 )* ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:232:1: ( ( ( rule__Table__Group_4__0 )* ) )
            // InternalMSQLSchemaParser.g:233:1: ( ( rule__Table__Group_4__0 )* )
            {
            // InternalMSQLSchemaParser.g:233:1: ( ( rule__Table__Group_4__0 )* )
            // InternalMSQLSchemaParser.g:234:2: ( rule__Table__Group_4__0 )*
            {
             before(grammarAccess.getTableAccess().getGroup_4()); 
            // InternalMSQLSchemaParser.g:235:2: ( rule__Table__Group_4__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Comma) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMSQLSchemaParser.g:235:3: rule__Table__Group_4__0
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
    // InternalMSQLSchemaParser.g:243:1: rule__Table__Group__5 : rule__Table__Group__5__Impl ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:247:1: ( rule__Table__Group__5__Impl )
            // InternalMSQLSchemaParser.g:248:2: rule__Table__Group__5__Impl
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
    // InternalMSQLSchemaParser.g:254:1: rule__Table__Group__5__Impl : ( RightCurlyBracket ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:258:1: ( ( RightCurlyBracket ) )
            // InternalMSQLSchemaParser.g:259:1: ( RightCurlyBracket )
            {
            // InternalMSQLSchemaParser.g:259:1: ( RightCurlyBracket )
            // InternalMSQLSchemaParser.g:260:2: RightCurlyBracket
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_5()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
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
    // InternalMSQLSchemaParser.g:270:1: rule__Table__Group_4__0 : rule__Table__Group_4__0__Impl rule__Table__Group_4__1 ;
    public final void rule__Table__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:274:1: ( rule__Table__Group_4__0__Impl rule__Table__Group_4__1 )
            // InternalMSQLSchemaParser.g:275:2: rule__Table__Group_4__0__Impl rule__Table__Group_4__1
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
    // InternalMSQLSchemaParser.g:282:1: rule__Table__Group_4__0__Impl : ( Comma ) ;
    public final void rule__Table__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:286:1: ( ( Comma ) )
            // InternalMSQLSchemaParser.g:287:1: ( Comma )
            {
            // InternalMSQLSchemaParser.g:287:1: ( Comma )
            // InternalMSQLSchemaParser.g:288:2: Comma
            {
             before(grammarAccess.getTableAccess().getCommaKeyword_4_0()); 
            match(input,Comma,FOLLOW_2); 
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
    // InternalMSQLSchemaParser.g:297:1: rule__Table__Group_4__1 : rule__Table__Group_4__1__Impl ;
    public final void rule__Table__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:301:1: ( rule__Table__Group_4__1__Impl )
            // InternalMSQLSchemaParser.g:302:2: rule__Table__Group_4__1__Impl
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
    // InternalMSQLSchemaParser.g:308:1: rule__Table__Group_4__1__Impl : ( ( rule__Table__ColumnsAssignment_4_1 ) ) ;
    public final void rule__Table__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:312:1: ( ( ( rule__Table__ColumnsAssignment_4_1 ) ) )
            // InternalMSQLSchemaParser.g:313:1: ( ( rule__Table__ColumnsAssignment_4_1 ) )
            {
            // InternalMSQLSchemaParser.g:313:1: ( ( rule__Table__ColumnsAssignment_4_1 ) )
            // InternalMSQLSchemaParser.g:314:2: ( rule__Table__ColumnsAssignment_4_1 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_4_1()); 
            // InternalMSQLSchemaParser.g:315:2: ( rule__Table__ColumnsAssignment_4_1 )
            // InternalMSQLSchemaParser.g:315:3: rule__Table__ColumnsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__ColumnsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getColumnsAssignment_4_1()); 

            }


            }

        }
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
    // InternalMSQLSchemaParser.g:324:1: rule__Table__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:328:1: ( ( RULE_ID ) )
            // InternalMSQLSchemaParser.g:329:2: ( RULE_ID )
            {
            // InternalMSQLSchemaParser.g:329:2: ( RULE_ID )
            // InternalMSQLSchemaParser.g:330:3: RULE_ID
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


    // $ANTLR start "rule__Table__ColumnsAssignment_3"
    // InternalMSQLSchemaParser.g:339:1: rule__Table__ColumnsAssignment_3 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:343:1: ( ( ruleColumn ) )
            // InternalMSQLSchemaParser.g:344:2: ( ruleColumn )
            {
            // InternalMSQLSchemaParser.g:344:2: ( ruleColumn )
            // InternalMSQLSchemaParser.g:345:3: ruleColumn
            {
             before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ColumnsAssignment_3"


    // $ANTLR start "rule__Table__ColumnsAssignment_4_1"
    // InternalMSQLSchemaParser.g:354:1: rule__Table__ColumnsAssignment_4_1 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:358:1: ( ( ruleColumn ) )
            // InternalMSQLSchemaParser.g:359:2: ( ruleColumn )
            {
            // InternalMSQLSchemaParser.g:359:2: ( ruleColumn )
            // InternalMSQLSchemaParser.g:360:3: ruleColumn
            {
             before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ColumnsAssignment_4_1"


    // $ANTLR start "rule__Column__NameAssignment"
    // InternalMSQLSchemaParser.g:369:1: rule__Column__NameAssignment : ( RULE_ID ) ;
    public final void rule__Column__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:373:1: ( ( RULE_ID ) )
            // InternalMSQLSchemaParser.g:374:2: ( RULE_ID )
            {
            // InternalMSQLSchemaParser.g:374:2: ( RULE_ID )
            // InternalMSQLSchemaParser.g:375:3: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000022L});

}