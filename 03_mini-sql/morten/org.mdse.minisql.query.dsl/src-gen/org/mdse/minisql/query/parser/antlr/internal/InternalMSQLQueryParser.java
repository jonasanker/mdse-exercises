package org.mdse.minisql.query.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.mdse.minisql.query.services.MSQLQueryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMSQLQueryParser extends AbstractInternalAntlrParser {
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

        public InternalMSQLQueryParser(TokenStream input, MSQLQueryGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SelectQuery";
       	}

       	@Override
       	protected MSQLQueryGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSelectQuery"
    // InternalMSQLQueryParser.g:58:1: entryRuleSelectQuery returns [EObject current=null] : iv_ruleSelectQuery= ruleSelectQuery EOF ;
    public final EObject entryRuleSelectQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectQuery = null;


        try {
            // InternalMSQLQueryParser.g:58:52: (iv_ruleSelectQuery= ruleSelectQuery EOF )
            // InternalMSQLQueryParser.g:59:2: iv_ruleSelectQuery= ruleSelectQuery EOF
            {
             newCompositeNode(grammarAccess.getSelectQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectQuery=ruleSelectQuery();

            state._fsp--;

             current =iv_ruleSelectQuery; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectQuery"


    // $ANTLR start "ruleSelectQuery"
    // InternalMSQLQueryParser.g:65:1: ruleSelectQuery returns [EObject current=null] : (otherlv_0= SELECT ( (lv_whatClause_1_0= ruleWhatClause ) ) ( (lv_fromClause_2_0= ruleFromClause ) ) ( (lv_whereClause_3_0= ruleWhereClause ) )? ( (lv_orderByClause_4_0= ruleOrderByClause ) )? otherlv_5= Semicolon ) ;
    public final EObject ruleSelectQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_5=null;
        EObject lv_whatClause_1_0 = null;

        EObject lv_fromClause_2_0 = null;

        EObject lv_whereClause_3_0 = null;

        EObject lv_orderByClause_4_0 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:71:2: ( (otherlv_0= SELECT ( (lv_whatClause_1_0= ruleWhatClause ) ) ( (lv_fromClause_2_0= ruleFromClause ) ) ( (lv_whereClause_3_0= ruleWhereClause ) )? ( (lv_orderByClause_4_0= ruleOrderByClause ) )? otherlv_5= Semicolon ) )
            // InternalMSQLQueryParser.g:72:2: (otherlv_0= SELECT ( (lv_whatClause_1_0= ruleWhatClause ) ) ( (lv_fromClause_2_0= ruleFromClause ) ) ( (lv_whereClause_3_0= ruleWhereClause ) )? ( (lv_orderByClause_4_0= ruleOrderByClause ) )? otherlv_5= Semicolon )
            {
            // InternalMSQLQueryParser.g:72:2: (otherlv_0= SELECT ( (lv_whatClause_1_0= ruleWhatClause ) ) ( (lv_fromClause_2_0= ruleFromClause ) ) ( (lv_whereClause_3_0= ruleWhereClause ) )? ( (lv_orderByClause_4_0= ruleOrderByClause ) )? otherlv_5= Semicolon )
            // InternalMSQLQueryParser.g:73:3: otherlv_0= SELECT ( (lv_whatClause_1_0= ruleWhatClause ) ) ( (lv_fromClause_2_0= ruleFromClause ) ) ( (lv_whereClause_3_0= ruleWhereClause ) )? ( (lv_orderByClause_4_0= ruleOrderByClause ) )? otherlv_5= Semicolon
            {
            otherlv_0=(Token)match(input,SELECT,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectQueryAccess().getSELECTKeyword_0());
            		
            // InternalMSQLQueryParser.g:77:3: ( (lv_whatClause_1_0= ruleWhatClause ) )
            // InternalMSQLQueryParser.g:78:4: (lv_whatClause_1_0= ruleWhatClause )
            {
            // InternalMSQLQueryParser.g:78:4: (lv_whatClause_1_0= ruleWhatClause )
            // InternalMSQLQueryParser.g:79:5: lv_whatClause_1_0= ruleWhatClause
            {

            					newCompositeNode(grammarAccess.getSelectQueryAccess().getWhatClauseWhatClauseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_whatClause_1_0=ruleWhatClause();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectQueryRule());
            					}
            					add(
            						current,
            						"whatClause",
            						lv_whatClause_1_0,
            						"org.mdse.minisql.query.MSQLQuery.WhatClause");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSQLQueryParser.g:96:3: ( (lv_fromClause_2_0= ruleFromClause ) )
            // InternalMSQLQueryParser.g:97:4: (lv_fromClause_2_0= ruleFromClause )
            {
            // InternalMSQLQueryParser.g:97:4: (lv_fromClause_2_0= ruleFromClause )
            // InternalMSQLQueryParser.g:98:5: lv_fromClause_2_0= ruleFromClause
            {

            					newCompositeNode(grammarAccess.getSelectQueryAccess().getFromClauseFromClauseParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_fromClause_2_0=ruleFromClause();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectQueryRule());
            					}
            					set(
            						current,
            						"fromClause",
            						lv_fromClause_2_0,
            						"org.mdse.minisql.query.MSQLQuery.FromClause");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSQLQueryParser.g:115:3: ( (lv_whereClause_3_0= ruleWhereClause ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==WHERE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMSQLQueryParser.g:116:4: (lv_whereClause_3_0= ruleWhereClause )
                    {
                    // InternalMSQLQueryParser.g:116:4: (lv_whereClause_3_0= ruleWhereClause )
                    // InternalMSQLQueryParser.g:117:5: lv_whereClause_3_0= ruleWhereClause
                    {

                    					newCompositeNode(grammarAccess.getSelectQueryAccess().getWhereClauseWhereClauseParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_whereClause_3_0=ruleWhereClause();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectQueryRule());
                    					}
                    					set(
                    						current,
                    						"whereClause",
                    						lv_whereClause_3_0,
                    						"org.mdse.minisql.query.MSQLQuery.WhereClause");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMSQLQueryParser.g:134:3: ( (lv_orderByClause_4_0= ruleOrderByClause ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ORDER) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMSQLQueryParser.g:135:4: (lv_orderByClause_4_0= ruleOrderByClause )
                    {
                    // InternalMSQLQueryParser.g:135:4: (lv_orderByClause_4_0= ruleOrderByClause )
                    // InternalMSQLQueryParser.g:136:5: lv_orderByClause_4_0= ruleOrderByClause
                    {

                    					newCompositeNode(grammarAccess.getSelectQueryAccess().getOrderByClauseOrderByClauseParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_orderByClause_4_0=ruleOrderByClause();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectQueryRule());
                    					}
                    					set(
                    						current,
                    						"orderByClause",
                    						lv_orderByClause_4_0,
                    						"org.mdse.minisql.query.MSQLQuery.OrderByClause");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,Semicolon,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSelectQueryAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectQuery"


    // $ANTLR start "entryRuleWhatClause"
    // InternalMSQLQueryParser.g:161:1: entryRuleWhatClause returns [EObject current=null] : iv_ruleWhatClause= ruleWhatClause EOF ;
    public final EObject entryRuleWhatClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhatClause = null;


        try {
            // InternalMSQLQueryParser.g:161:51: (iv_ruleWhatClause= ruleWhatClause EOF )
            // InternalMSQLQueryParser.g:162:2: iv_ruleWhatClause= ruleWhatClause EOF
            {
             newCompositeNode(grammarAccess.getWhatClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhatClause=ruleWhatClause();

            state._fsp--;

             current =iv_ruleWhatClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhatClause"


    // $ANTLR start "ruleWhatClause"
    // InternalMSQLQueryParser.g:168:1: ruleWhatClause returns [EObject current=null] : ( ( (lv_whatDirective_0_0= ruleWhatDirective ) ) (otherlv_1= Comma ( (lv_whatDirective_2_0= ruleWhatDirective ) ) )* ) ;
    public final EObject ruleWhatClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_whatDirective_0_0 = null;

        EObject lv_whatDirective_2_0 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:174:2: ( ( ( (lv_whatDirective_0_0= ruleWhatDirective ) ) (otherlv_1= Comma ( (lv_whatDirective_2_0= ruleWhatDirective ) ) )* ) )
            // InternalMSQLQueryParser.g:175:2: ( ( (lv_whatDirective_0_0= ruleWhatDirective ) ) (otherlv_1= Comma ( (lv_whatDirective_2_0= ruleWhatDirective ) ) )* )
            {
            // InternalMSQLQueryParser.g:175:2: ( ( (lv_whatDirective_0_0= ruleWhatDirective ) ) (otherlv_1= Comma ( (lv_whatDirective_2_0= ruleWhatDirective ) ) )* )
            // InternalMSQLQueryParser.g:176:3: ( (lv_whatDirective_0_0= ruleWhatDirective ) ) (otherlv_1= Comma ( (lv_whatDirective_2_0= ruleWhatDirective ) ) )*
            {
            // InternalMSQLQueryParser.g:176:3: ( (lv_whatDirective_0_0= ruleWhatDirective ) )
            // InternalMSQLQueryParser.g:177:4: (lv_whatDirective_0_0= ruleWhatDirective )
            {
            // InternalMSQLQueryParser.g:177:4: (lv_whatDirective_0_0= ruleWhatDirective )
            // InternalMSQLQueryParser.g:178:5: lv_whatDirective_0_0= ruleWhatDirective
            {

            					newCompositeNode(grammarAccess.getWhatClauseAccess().getWhatDirectiveWhatDirectiveParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_whatDirective_0_0=ruleWhatDirective();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhatClauseRule());
            					}
            					add(
            						current,
            						"whatDirective",
            						lv_whatDirective_0_0,
            						"org.mdse.minisql.query.MSQLQuery.WhatDirective");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSQLQueryParser.g:195:3: (otherlv_1= Comma ( (lv_whatDirective_2_0= ruleWhatDirective ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==Comma) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:196:4: otherlv_1= Comma ( (lv_whatDirective_2_0= ruleWhatDirective ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getWhatClauseAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMSQLQueryParser.g:200:4: ( (lv_whatDirective_2_0= ruleWhatDirective ) )
            	    // InternalMSQLQueryParser.g:201:5: (lv_whatDirective_2_0= ruleWhatDirective )
            	    {
            	    // InternalMSQLQueryParser.g:201:5: (lv_whatDirective_2_0= ruleWhatDirective )
            	    // InternalMSQLQueryParser.g:202:6: lv_whatDirective_2_0= ruleWhatDirective
            	    {

            	    						newCompositeNode(grammarAccess.getWhatClauseAccess().getWhatDirectiveWhatDirectiveParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_whatDirective_2_0=ruleWhatDirective();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWhatClauseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"whatDirective",
            	    							lv_whatDirective_2_0,
            	    							"org.mdse.minisql.query.MSQLQuery.WhatDirective");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhatClause"


    // $ANTLR start "entryRuleWhatDirective"
    // InternalMSQLQueryParser.g:224:1: entryRuleWhatDirective returns [EObject current=null] : iv_ruleWhatDirective= ruleWhatDirective EOF ;
    public final EObject entryRuleWhatDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhatDirective = null;


        try {
            // InternalMSQLQueryParser.g:224:54: (iv_ruleWhatDirective= ruleWhatDirective EOF )
            // InternalMSQLQueryParser.g:225:2: iv_ruleWhatDirective= ruleWhatDirective EOF
            {
             newCompositeNode(grammarAccess.getWhatDirectiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhatDirective=ruleWhatDirective();

            state._fsp--;

             current =iv_ruleWhatDirective; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhatDirective"


    // $ANTLR start "ruleWhatDirective"
    // InternalMSQLQueryParser.g:231:1: ruleWhatDirective returns [EObject current=null] : (this_AllColumnsWhatDirective_0= ruleAllColumnsWhatDirective | this_SingleColumnWhatDirective_1= ruleSingleColumnWhatDirective ) ;
    public final EObject ruleWhatDirective() throws RecognitionException {
        EObject current = null;

        EObject this_AllColumnsWhatDirective_0 = null;

        EObject this_SingleColumnWhatDirective_1 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:237:2: ( (this_AllColumnsWhatDirective_0= ruleAllColumnsWhatDirective | this_SingleColumnWhatDirective_1= ruleSingleColumnWhatDirective ) )
            // InternalMSQLQueryParser.g:238:2: (this_AllColumnsWhatDirective_0= ruleAllColumnsWhatDirective | this_SingleColumnWhatDirective_1= ruleSingleColumnWhatDirective )
            {
            // InternalMSQLQueryParser.g:238:2: (this_AllColumnsWhatDirective_0= ruleAllColumnsWhatDirective | this_SingleColumnWhatDirective_1= ruleSingleColumnWhatDirective )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Asterisk) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMSQLQueryParser.g:239:3: this_AllColumnsWhatDirective_0= ruleAllColumnsWhatDirective
                    {

                    			newCompositeNode(grammarAccess.getWhatDirectiveAccess().getAllColumnsWhatDirectiveParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AllColumnsWhatDirective_0=ruleAllColumnsWhatDirective();

                    state._fsp--;


                    			current = this_AllColumnsWhatDirective_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:248:3: this_SingleColumnWhatDirective_1= ruleSingleColumnWhatDirective
                    {

                    			newCompositeNode(grammarAccess.getWhatDirectiveAccess().getSingleColumnWhatDirectiveParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingleColumnWhatDirective_1=ruleSingleColumnWhatDirective();

                    state._fsp--;


                    			current = this_SingleColumnWhatDirective_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhatDirective"


    // $ANTLR start "entryRuleAllColumnsWhatDirective"
    // InternalMSQLQueryParser.g:260:1: entryRuleAllColumnsWhatDirective returns [EObject current=null] : iv_ruleAllColumnsWhatDirective= ruleAllColumnsWhatDirective EOF ;
    public final EObject entryRuleAllColumnsWhatDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllColumnsWhatDirective = null;


        try {
            // InternalMSQLQueryParser.g:260:64: (iv_ruleAllColumnsWhatDirective= ruleAllColumnsWhatDirective EOF )
            // InternalMSQLQueryParser.g:261:2: iv_ruleAllColumnsWhatDirective= ruleAllColumnsWhatDirective EOF
            {
             newCompositeNode(grammarAccess.getAllColumnsWhatDirectiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllColumnsWhatDirective=ruleAllColumnsWhatDirective();

            state._fsp--;

             current =iv_ruleAllColumnsWhatDirective; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAllColumnsWhatDirective"


    // $ANTLR start "ruleAllColumnsWhatDirective"
    // InternalMSQLQueryParser.g:267:1: ruleAllColumnsWhatDirective returns [EObject current=null] : (otherlv_0= Asterisk () ) ;
    public final EObject ruleAllColumnsWhatDirective() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMSQLQueryParser.g:273:2: ( (otherlv_0= Asterisk () ) )
            // InternalMSQLQueryParser.g:274:2: (otherlv_0= Asterisk () )
            {
            // InternalMSQLQueryParser.g:274:2: (otherlv_0= Asterisk () )
            // InternalMSQLQueryParser.g:275:3: otherlv_0= Asterisk ()
            {
            otherlv_0=(Token)match(input,Asterisk,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getAllColumnsWhatDirectiveAccess().getAsteriskKeyword_0());
            		
            // InternalMSQLQueryParser.g:279:3: ()
            // InternalMSQLQueryParser.g:280:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAllColumnsWhatDirectiveAccess().getAllColumnsWhatDirectiveAction_1(),
            					current);
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAllColumnsWhatDirective"


    // $ANTLR start "entryRuleSingleColumnWhatDirective"
    // InternalMSQLQueryParser.g:290:1: entryRuleSingleColumnWhatDirective returns [EObject current=null] : iv_ruleSingleColumnWhatDirective= ruleSingleColumnWhatDirective EOF ;
    public final EObject entryRuleSingleColumnWhatDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleColumnWhatDirective = null;


        try {
            // InternalMSQLQueryParser.g:290:66: (iv_ruleSingleColumnWhatDirective= ruleSingleColumnWhatDirective EOF )
            // InternalMSQLQueryParser.g:291:2: iv_ruleSingleColumnWhatDirective= ruleSingleColumnWhatDirective EOF
            {
             newCompositeNode(grammarAccess.getSingleColumnWhatDirectiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleColumnWhatDirective=ruleSingleColumnWhatDirective();

            state._fsp--;

             current =iv_ruleSingleColumnWhatDirective; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleColumnWhatDirective"


    // $ANTLR start "ruleSingleColumnWhatDirective"
    // InternalMSQLQueryParser.g:297:1: ruleSingleColumnWhatDirective returns [EObject current=null] : ( (lv_columnReference_0_0= ruleColumnReference ) ) ;
    public final EObject ruleSingleColumnWhatDirective() throws RecognitionException {
        EObject current = null;

        EObject lv_columnReference_0_0 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:303:2: ( ( (lv_columnReference_0_0= ruleColumnReference ) ) )
            // InternalMSQLQueryParser.g:304:2: ( (lv_columnReference_0_0= ruleColumnReference ) )
            {
            // InternalMSQLQueryParser.g:304:2: ( (lv_columnReference_0_0= ruleColumnReference ) )
            // InternalMSQLQueryParser.g:305:3: (lv_columnReference_0_0= ruleColumnReference )
            {
            // InternalMSQLQueryParser.g:305:3: (lv_columnReference_0_0= ruleColumnReference )
            // InternalMSQLQueryParser.g:306:4: lv_columnReference_0_0= ruleColumnReference
            {

            				newCompositeNode(grammarAccess.getSingleColumnWhatDirectiveAccess().getColumnReferenceColumnReferenceParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_columnReference_0_0=ruleColumnReference();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSingleColumnWhatDirectiveRule());
            				}
            				set(
            					current,
            					"columnReference",
            					lv_columnReference_0_0,
            					"org.mdse.minisql.query.MSQLQuery.ColumnReference");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleColumnWhatDirective"


    // $ANTLR start "entryRuleFromClause"
    // InternalMSQLQueryParser.g:326:1: entryRuleFromClause returns [EObject current=null] : iv_ruleFromClause= ruleFromClause EOF ;
    public final EObject entryRuleFromClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClause = null;


        try {
            // InternalMSQLQueryParser.g:326:51: (iv_ruleFromClause= ruleFromClause EOF )
            // InternalMSQLQueryParser.g:327:2: iv_ruleFromClause= ruleFromClause EOF
            {
             newCompositeNode(grammarAccess.getFromClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFromClause=ruleFromClause();

            state._fsp--;

             current =iv_ruleFromClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFromClause"


    // $ANTLR start "ruleFromClause"
    // InternalMSQLQueryParser.g:333:1: ruleFromClause returns [EObject current=null] : (otherlv_0= FROM ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleFromClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMSQLQueryParser.g:339:2: ( (otherlv_0= FROM ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMSQLQueryParser.g:340:2: (otherlv_0= FROM ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMSQLQueryParser.g:340:2: (otherlv_0= FROM ( (otherlv_1= RULE_ID ) ) )
            // InternalMSQLQueryParser.g:341:3: otherlv_0= FROM ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,FROM,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getFromClauseAccess().getFROMKeyword_0());
            		
            // InternalMSQLQueryParser.g:345:3: ( (otherlv_1= RULE_ID ) )
            // InternalMSQLQueryParser.g:346:4: (otherlv_1= RULE_ID )
            {
            // InternalMSQLQueryParser.g:346:4: (otherlv_1= RULE_ID )
            // InternalMSQLQueryParser.g:347:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFromClauseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getFromClauseAccess().getTableTableCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFromClause"


    // $ANTLR start "entryRuleWhereClause"
    // InternalMSQLQueryParser.g:362:1: entryRuleWhereClause returns [EObject current=null] : iv_ruleWhereClause= ruleWhereClause EOF ;
    public final EObject entryRuleWhereClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereClause = null;


        try {
            // InternalMSQLQueryParser.g:362:52: (iv_ruleWhereClause= ruleWhereClause EOF )
            // InternalMSQLQueryParser.g:363:2: iv_ruleWhereClause= ruleWhereClause EOF
            {
             newCompositeNode(grammarAccess.getWhereClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhereClause=ruleWhereClause();

            state._fsp--;

             current =iv_ruleWhereClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhereClause"


    // $ANTLR start "ruleWhereClause"
    // InternalMSQLQueryParser.g:369:1: ruleWhereClause returns [EObject current=null] : (otherlv_0= WHERE ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleWhereClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:375:2: ( (otherlv_0= WHERE ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalMSQLQueryParser.g:376:2: (otherlv_0= WHERE ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalMSQLQueryParser.g:376:2: (otherlv_0= WHERE ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalMSQLQueryParser.g:377:3: otherlv_0= WHERE ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,WHERE,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getWhereClauseAccess().getWHEREKeyword_0());
            		
            // InternalMSQLQueryParser.g:381:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalMSQLQueryParser.g:382:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalMSQLQueryParser.g:382:4: (lv_expression_1_0= ruleExpression )
            // InternalMSQLQueryParser.g:383:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhereClauseAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhereClauseRule());
            					}
            					add(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.mdse.minisql.query.MSQLQuery.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhereClause"


    // $ANTLR start "entryRuleExpression"
    // InternalMSQLQueryParser.g:404:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMSQLQueryParser.g:404:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMSQLQueryParser.g:405:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMSQLQueryParser.g:411:1: ruleExpression returns [EObject current=null] : (this_ColumnReference_0= ruleColumnReference | this_IntegerLiteral_1= ruleIntegerLiteral | this_ComparativeExpression_2= ruleComparativeExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ColumnReference_0 = null;

        EObject this_IntegerLiteral_1 = null;

        EObject this_ComparativeExpression_2 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:417:2: ( (this_ColumnReference_0= ruleColumnReference | this_IntegerLiteral_1= ruleIntegerLiteral | this_ComparativeExpression_2= ruleComparativeExpression ) )
            // InternalMSQLQueryParser.g:418:2: (this_ColumnReference_0= ruleColumnReference | this_IntegerLiteral_1= ruleIntegerLiteral | this_ComparativeExpression_2= ruleComparativeExpression )
            {
            // InternalMSQLQueryParser.g:418:2: (this_ColumnReference_0= ruleColumnReference | this_IntegerLiteral_1= ruleIntegerLiteral | this_ComparativeExpression_2= ruleComparativeExpression )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||LA5_1==ORDER||LA5_1==Semicolon) ) {
                    alt5=1;
                }
                else if ( ((LA5_1>=ExclamationMarkEqualsSign && LA5_1<=GreaterThanSignEqualsSign)||(LA5_1>=LessThanSign && LA5_1<=GreaterThanSign)) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==RULE_INT) ) {
                int LA5_2 = input.LA(2);

                if ( ((LA5_2>=ExclamationMarkEqualsSign && LA5_2<=GreaterThanSignEqualsSign)||(LA5_2>=LessThanSign && LA5_2<=GreaterThanSign)) ) {
                    alt5=3;
                }
                else if ( (LA5_2==EOF||LA5_2==ORDER||LA5_2==Semicolon) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMSQLQueryParser.g:419:3: this_ColumnReference_0= ruleColumnReference
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getColumnReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColumnReference_0=ruleColumnReference();

                    state._fsp--;


                    			current = this_ColumnReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:428:3: this_IntegerLiteral_1= ruleIntegerLiteral
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getIntegerLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerLiteral_1=ruleIntegerLiteral();

                    state._fsp--;


                    			current = this_IntegerLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMSQLQueryParser.g:437:3: this_ComparativeExpression_2= ruleComparativeExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getComparativeExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComparativeExpression_2=ruleComparativeExpression();

                    state._fsp--;


                    			current = this_ComparativeExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleComparativeExpression"
    // InternalMSQLQueryParser.g:449:1: entryRuleComparativeExpression returns [EObject current=null] : iv_ruleComparativeExpression= ruleComparativeExpression EOF ;
    public final EObject entryRuleComparativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparativeExpression = null;


        try {
            // InternalMSQLQueryParser.g:449:62: (iv_ruleComparativeExpression= ruleComparativeExpression EOF )
            // InternalMSQLQueryParser.g:450:2: iv_ruleComparativeExpression= ruleComparativeExpression EOF
            {
             newCompositeNode(grammarAccess.getComparativeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparativeExpression=ruleComparativeExpression();

            state._fsp--;

             current =iv_ruleComparativeExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparativeExpression"


    // $ANTLR start "ruleComparativeExpression"
    // InternalMSQLQueryParser.g:456:1: ruleComparativeExpression returns [EObject current=null] : ( ( (lv_expression1_0_0= ruleAtomicExpression ) ) ( (lv_operator_1_0= ruleComparativeOperator ) ) ( (lv_expression2_2_0= ruleAtomicExpression ) ) ) ;
    public final EObject ruleComparativeExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expression1_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_expression2_2_0 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:462:2: ( ( ( (lv_expression1_0_0= ruleAtomicExpression ) ) ( (lv_operator_1_0= ruleComparativeOperator ) ) ( (lv_expression2_2_0= ruleAtomicExpression ) ) ) )
            // InternalMSQLQueryParser.g:463:2: ( ( (lv_expression1_0_0= ruleAtomicExpression ) ) ( (lv_operator_1_0= ruleComparativeOperator ) ) ( (lv_expression2_2_0= ruleAtomicExpression ) ) )
            {
            // InternalMSQLQueryParser.g:463:2: ( ( (lv_expression1_0_0= ruleAtomicExpression ) ) ( (lv_operator_1_0= ruleComparativeOperator ) ) ( (lv_expression2_2_0= ruleAtomicExpression ) ) )
            // InternalMSQLQueryParser.g:464:3: ( (lv_expression1_0_0= ruleAtomicExpression ) ) ( (lv_operator_1_0= ruleComparativeOperator ) ) ( (lv_expression2_2_0= ruleAtomicExpression ) )
            {
            // InternalMSQLQueryParser.g:464:3: ( (lv_expression1_0_0= ruleAtomicExpression ) )
            // InternalMSQLQueryParser.g:465:4: (lv_expression1_0_0= ruleAtomicExpression )
            {
            // InternalMSQLQueryParser.g:465:4: (lv_expression1_0_0= ruleAtomicExpression )
            // InternalMSQLQueryParser.g:466:5: lv_expression1_0_0= ruleAtomicExpression
            {

            					newCompositeNode(grammarAccess.getComparativeExpressionAccess().getExpression1AtomicExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_expression1_0_0=ruleAtomicExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparativeExpressionRule());
            					}
            					set(
            						current,
            						"expression1",
            						lv_expression1_0_0,
            						"org.mdse.minisql.query.MSQLQuery.AtomicExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSQLQueryParser.g:483:3: ( (lv_operator_1_0= ruleComparativeOperator ) )
            // InternalMSQLQueryParser.g:484:4: (lv_operator_1_0= ruleComparativeOperator )
            {
            // InternalMSQLQueryParser.g:484:4: (lv_operator_1_0= ruleComparativeOperator )
            // InternalMSQLQueryParser.g:485:5: lv_operator_1_0= ruleComparativeOperator
            {

            					newCompositeNode(grammarAccess.getComparativeExpressionAccess().getOperatorComparativeOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_operator_1_0=ruleComparativeOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparativeExpressionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"org.mdse.minisql.query.MSQLQuery.ComparativeOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSQLQueryParser.g:502:3: ( (lv_expression2_2_0= ruleAtomicExpression ) )
            // InternalMSQLQueryParser.g:503:4: (lv_expression2_2_0= ruleAtomicExpression )
            {
            // InternalMSQLQueryParser.g:503:4: (lv_expression2_2_0= ruleAtomicExpression )
            // InternalMSQLQueryParser.g:504:5: lv_expression2_2_0= ruleAtomicExpression
            {

            					newCompositeNode(grammarAccess.getComparativeExpressionAccess().getExpression2AtomicExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression2_2_0=ruleAtomicExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparativeExpressionRule());
            					}
            					set(
            						current,
            						"expression2",
            						lv_expression2_2_0,
            						"org.mdse.minisql.query.MSQLQuery.AtomicExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparativeExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalMSQLQueryParser.g:525:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalMSQLQueryParser.g:525:57: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalMSQLQueryParser.g:526:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
             newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;

             current =iv_ruleAtomicExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // InternalMSQLQueryParser.g:532:1: ruleAtomicExpression returns [EObject current=null] : (this_IntegerLiteral_0= ruleIntegerLiteral | this_ColumnReference_1= ruleColumnReference ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerLiteral_0 = null;

        EObject this_ColumnReference_1 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:538:2: ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_ColumnReference_1= ruleColumnReference ) )
            // InternalMSQLQueryParser.g:539:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_ColumnReference_1= ruleColumnReference )
            {
            // InternalMSQLQueryParser.g:539:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_ColumnReference_1= ruleColumnReference )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMSQLQueryParser.g:540:3: this_IntegerLiteral_0= ruleIntegerLiteral
                    {

                    			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getIntegerLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerLiteral_0=ruleIntegerLiteral();

                    state._fsp--;


                    			current = this_IntegerLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:549:3: this_ColumnReference_1= ruleColumnReference
                    {

                    			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getColumnReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColumnReference_1=ruleColumnReference();

                    state._fsp--;


                    			current = this_ColumnReference_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleIntegerLiteral"
    // InternalMSQLQueryParser.g:561:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // InternalMSQLQueryParser.g:561:55: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // InternalMSQLQueryParser.g:562:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;

             current =iv_ruleIntegerLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // InternalMSQLQueryParser.g:568:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMSQLQueryParser.g:574:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalMSQLQueryParser.g:575:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalMSQLQueryParser.g:575:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalMSQLQueryParser.g:576:3: (lv_value_0_0= RULE_INT )
            {
            // InternalMSQLQueryParser.g:576:3: (lv_value_0_0= RULE_INT )
            // InternalMSQLQueryParser.g:577:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntegerLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleOrderByClause"
    // InternalMSQLQueryParser.g:596:1: entryRuleOrderByClause returns [EObject current=null] : iv_ruleOrderByClause= ruleOrderByClause EOF ;
    public final EObject entryRuleOrderByClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderByClause = null;


        try {
            // InternalMSQLQueryParser.g:596:54: (iv_ruleOrderByClause= ruleOrderByClause EOF )
            // InternalMSQLQueryParser.g:597:2: iv_ruleOrderByClause= ruleOrderByClause EOF
            {
             newCompositeNode(grammarAccess.getOrderByClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrderByClause=ruleOrderByClause();

            state._fsp--;

             current =iv_ruleOrderByClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrderByClause"


    // $ANTLR start "ruleOrderByClause"
    // InternalMSQLQueryParser.g:603:1: ruleOrderByClause returns [EObject current=null] : (otherlv_0= ORDER otherlv_1= BY ( (lv_orderDirectives_2_0= ruleOrderByDirective ) ) (otherlv_3= Comma ( (lv_orderDirectives_4_0= ruleOrderByDirective ) ) )* ) ;
    public final EObject ruleOrderByClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_orderDirectives_2_0 = null;

        EObject lv_orderDirectives_4_0 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:609:2: ( (otherlv_0= ORDER otherlv_1= BY ( (lv_orderDirectives_2_0= ruleOrderByDirective ) ) (otherlv_3= Comma ( (lv_orderDirectives_4_0= ruleOrderByDirective ) ) )* ) )
            // InternalMSQLQueryParser.g:610:2: (otherlv_0= ORDER otherlv_1= BY ( (lv_orderDirectives_2_0= ruleOrderByDirective ) ) (otherlv_3= Comma ( (lv_orderDirectives_4_0= ruleOrderByDirective ) ) )* )
            {
            // InternalMSQLQueryParser.g:610:2: (otherlv_0= ORDER otherlv_1= BY ( (lv_orderDirectives_2_0= ruleOrderByDirective ) ) (otherlv_3= Comma ( (lv_orderDirectives_4_0= ruleOrderByDirective ) ) )* )
            // InternalMSQLQueryParser.g:611:3: otherlv_0= ORDER otherlv_1= BY ( (lv_orderDirectives_2_0= ruleOrderByDirective ) ) (otherlv_3= Comma ( (lv_orderDirectives_4_0= ruleOrderByDirective ) ) )*
            {
            otherlv_0=(Token)match(input,ORDER,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getOrderByClauseAccess().getORDERKeyword_0());
            		
            otherlv_1=(Token)match(input,BY,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOrderByClauseAccess().getBYKeyword_1());
            		
            // InternalMSQLQueryParser.g:619:3: ( (lv_orderDirectives_2_0= ruleOrderByDirective ) )
            // InternalMSQLQueryParser.g:620:4: (lv_orderDirectives_2_0= ruleOrderByDirective )
            {
            // InternalMSQLQueryParser.g:620:4: (lv_orderDirectives_2_0= ruleOrderByDirective )
            // InternalMSQLQueryParser.g:621:5: lv_orderDirectives_2_0= ruleOrderByDirective
            {

            					newCompositeNode(grammarAccess.getOrderByClauseAccess().getOrderDirectivesOrderByDirectiveParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_orderDirectives_2_0=ruleOrderByDirective();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrderByClauseRule());
            					}
            					add(
            						current,
            						"orderDirectives",
            						lv_orderDirectives_2_0,
            						"org.mdse.minisql.query.MSQLQuery.OrderByDirective");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSQLQueryParser.g:638:3: (otherlv_3= Comma ( (lv_orderDirectives_4_0= ruleOrderByDirective ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Comma) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:639:4: otherlv_3= Comma ( (lv_orderDirectives_4_0= ruleOrderByDirective ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getOrderByClauseAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMSQLQueryParser.g:643:4: ( (lv_orderDirectives_4_0= ruleOrderByDirective ) )
            	    // InternalMSQLQueryParser.g:644:5: (lv_orderDirectives_4_0= ruleOrderByDirective )
            	    {
            	    // InternalMSQLQueryParser.g:644:5: (lv_orderDirectives_4_0= ruleOrderByDirective )
            	    // InternalMSQLQueryParser.g:645:6: lv_orderDirectives_4_0= ruleOrderByDirective
            	    {

            	    						newCompositeNode(grammarAccess.getOrderByClauseAccess().getOrderDirectivesOrderByDirectiveParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_orderDirectives_4_0=ruleOrderByDirective();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrderByClauseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"orderDirectives",
            	    							lv_orderDirectives_4_0,
            	    							"org.mdse.minisql.query.MSQLQuery.OrderByDirective");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrderByClause"


    // $ANTLR start "entryRuleOrderByDirective"
    // InternalMSQLQueryParser.g:667:1: entryRuleOrderByDirective returns [EObject current=null] : iv_ruleOrderByDirective= ruleOrderByDirective EOF ;
    public final EObject entryRuleOrderByDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderByDirective = null;


        try {
            // InternalMSQLQueryParser.g:667:57: (iv_ruleOrderByDirective= ruleOrderByDirective EOF )
            // InternalMSQLQueryParser.g:668:2: iv_ruleOrderByDirective= ruleOrderByDirective EOF
            {
             newCompositeNode(grammarAccess.getOrderByDirectiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrderByDirective=ruleOrderByDirective();

            state._fsp--;

             current =iv_ruleOrderByDirective; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrderByDirective"


    // $ANTLR start "ruleOrderByDirective"
    // InternalMSQLQueryParser.g:674:1: ruleOrderByDirective returns [EObject current=null] : ( ( (lv_columnReference_0_0= ruleColumnReference ) ) ( ( (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC ) ) )? ) ;
    public final EObject ruleOrderByDirective() throws RecognitionException {
        EObject current = null;

        Token lv_ascending_1_1=null;
        Token lv_ascending_1_2=null;
        EObject lv_columnReference_0_0 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:680:2: ( ( ( (lv_columnReference_0_0= ruleColumnReference ) ) ( ( (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC ) ) )? ) )
            // InternalMSQLQueryParser.g:681:2: ( ( (lv_columnReference_0_0= ruleColumnReference ) ) ( ( (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC ) ) )? )
            {
            // InternalMSQLQueryParser.g:681:2: ( ( (lv_columnReference_0_0= ruleColumnReference ) ) ( ( (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC ) ) )? )
            // InternalMSQLQueryParser.g:682:3: ( (lv_columnReference_0_0= ruleColumnReference ) ) ( ( (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC ) ) )?
            {
            // InternalMSQLQueryParser.g:682:3: ( (lv_columnReference_0_0= ruleColumnReference ) )
            // InternalMSQLQueryParser.g:683:4: (lv_columnReference_0_0= ruleColumnReference )
            {
            // InternalMSQLQueryParser.g:683:4: (lv_columnReference_0_0= ruleColumnReference )
            // InternalMSQLQueryParser.g:684:5: lv_columnReference_0_0= ruleColumnReference
            {

            					newCompositeNode(grammarAccess.getOrderByDirectiveAccess().getColumnReferenceColumnReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_columnReference_0_0=ruleColumnReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrderByDirectiveRule());
            					}
            					add(
            						current,
            						"columnReference",
            						lv_columnReference_0_0,
            						"org.mdse.minisql.query.MSQLQuery.ColumnReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSQLQueryParser.g:701:3: ( ( (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==DESC||LA9_0==ASC) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMSQLQueryParser.g:702:4: ( (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC ) )
                    {
                    // InternalMSQLQueryParser.g:702:4: ( (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC ) )
                    // InternalMSQLQueryParser.g:703:5: (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC )
                    {
                    // InternalMSQLQueryParser.g:703:5: (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==ASC) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==DESC) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMSQLQueryParser.g:704:6: lv_ascending_1_1= ASC
                            {
                            lv_ascending_1_1=(Token)match(input,ASC,FOLLOW_2); 

                            						newLeafNode(lv_ascending_1_1, grammarAccess.getOrderByDirectiveAccess().getAscendingASCKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOrderByDirectiveRule());
                            						}
                            						setWithLastConsumed(current, "ascending", true, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalMSQLQueryParser.g:715:6: lv_ascending_1_2= DESC
                            {
                            lv_ascending_1_2=(Token)match(input,DESC,FOLLOW_2); 

                            						newLeafNode(lv_ascending_1_2, grammarAccess.getOrderByDirectiveAccess().getAscendingDESCKeyword_1_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOrderByDirectiveRule());
                            						}
                            						setWithLastConsumed(current, "ascending", true, null);
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrderByDirective"


    // $ANTLR start "entryRuleColumnReference"
    // InternalMSQLQueryParser.g:732:1: entryRuleColumnReference returns [EObject current=null] : iv_ruleColumnReference= ruleColumnReference EOF ;
    public final EObject entryRuleColumnReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnReference = null;


        try {
            // InternalMSQLQueryParser.g:732:56: (iv_ruleColumnReference= ruleColumnReference EOF )
            // InternalMSQLQueryParser.g:733:2: iv_ruleColumnReference= ruleColumnReference EOF
            {
             newCompositeNode(grammarAccess.getColumnReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumnReference=ruleColumnReference();

            state._fsp--;

             current =iv_ruleColumnReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumnReference"


    // $ANTLR start "ruleColumnReference"
    // InternalMSQLQueryParser.g:739:1: ruleColumnReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleColumnReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMSQLQueryParser.g:745:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMSQLQueryParser.g:746:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMSQLQueryParser.g:746:2: ( (otherlv_0= RULE_ID ) )
            // InternalMSQLQueryParser.g:747:3: (otherlv_0= RULE_ID )
            {
            // InternalMSQLQueryParser.g:747:3: (otherlv_0= RULE_ID )
            // InternalMSQLQueryParser.g:748:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getColumnReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getColumnReferenceAccess().getColumnColumnCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumnReference"


    // $ANTLR start "ruleComparativeOperator"
    // InternalMSQLQueryParser.g:762:1: ruleComparativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= LessThanSign ) | (enumLiteral_1= LessThanSignEqualsSign ) | (enumLiteral_2= EqualsSign ) | (enumLiteral_3= ExclamationMarkEqualsSign ) | (enumLiteral_4= GreaterThanSign ) | (enumLiteral_5= GreaterThanSignEqualsSign ) ) ;
    public final Enumerator ruleComparativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalMSQLQueryParser.g:768:2: ( ( (enumLiteral_0= LessThanSign ) | (enumLiteral_1= LessThanSignEqualsSign ) | (enumLiteral_2= EqualsSign ) | (enumLiteral_3= ExclamationMarkEqualsSign ) | (enumLiteral_4= GreaterThanSign ) | (enumLiteral_5= GreaterThanSignEqualsSign ) ) )
            // InternalMSQLQueryParser.g:769:2: ( (enumLiteral_0= LessThanSign ) | (enumLiteral_1= LessThanSignEqualsSign ) | (enumLiteral_2= EqualsSign ) | (enumLiteral_3= ExclamationMarkEqualsSign ) | (enumLiteral_4= GreaterThanSign ) | (enumLiteral_5= GreaterThanSignEqualsSign ) )
            {
            // InternalMSQLQueryParser.g:769:2: ( (enumLiteral_0= LessThanSign ) | (enumLiteral_1= LessThanSignEqualsSign ) | (enumLiteral_2= EqualsSign ) | (enumLiteral_3= ExclamationMarkEqualsSign ) | (enumLiteral_4= GreaterThanSign ) | (enumLiteral_5= GreaterThanSignEqualsSign ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case LessThanSign:
                {
                alt10=1;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt10=2;
                }
                break;
            case EqualsSign:
                {
                alt10=3;
                }
                break;
            case ExclamationMarkEqualsSign:
                {
                alt10=4;
                }
                break;
            case GreaterThanSign:
                {
                alt10=5;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMSQLQueryParser.g:770:3: (enumLiteral_0= LessThanSign )
                    {
                    // InternalMSQLQueryParser.g:770:3: (enumLiteral_0= LessThanSign )
                    // InternalMSQLQueryParser.g:771:4: enumLiteral_0= LessThanSign
                    {
                    enumLiteral_0=(Token)match(input,LessThanSign,FOLLOW_2); 

                    				current = grammarAccess.getComparativeOperatorAccess().getLESS_THANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparativeOperatorAccess().getLESS_THANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:778:3: (enumLiteral_1= LessThanSignEqualsSign )
                    {
                    // InternalMSQLQueryParser.g:778:3: (enumLiteral_1= LessThanSignEqualsSign )
                    // InternalMSQLQueryParser.g:779:4: enumLiteral_1= LessThanSignEqualsSign
                    {
                    enumLiteral_1=(Token)match(input,LessThanSignEqualsSign,FOLLOW_2); 

                    				current = grammarAccess.getComparativeOperatorAccess().getLESS_THAN_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparativeOperatorAccess().getLESS_THAN_OR_EQUALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMSQLQueryParser.g:786:3: (enumLiteral_2= EqualsSign )
                    {
                    // InternalMSQLQueryParser.g:786:3: (enumLiteral_2= EqualsSign )
                    // InternalMSQLQueryParser.g:787:4: enumLiteral_2= EqualsSign
                    {
                    enumLiteral_2=(Token)match(input,EqualsSign,FOLLOW_2); 

                    				current = grammarAccess.getComparativeOperatorAccess().getEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparativeOperatorAccess().getEQUALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMSQLQueryParser.g:794:3: (enumLiteral_3= ExclamationMarkEqualsSign )
                    {
                    // InternalMSQLQueryParser.g:794:3: (enumLiteral_3= ExclamationMarkEqualsSign )
                    // InternalMSQLQueryParser.g:795:4: enumLiteral_3= ExclamationMarkEqualsSign
                    {
                    enumLiteral_3=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_2); 

                    				current = grammarAccess.getComparativeOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getComparativeOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMSQLQueryParser.g:802:3: (enumLiteral_4= GreaterThanSign )
                    {
                    // InternalMSQLQueryParser.g:802:3: (enumLiteral_4= GreaterThanSign )
                    // InternalMSQLQueryParser.g:803:4: enumLiteral_4= GreaterThanSign
                    {
                    enumLiteral_4=(Token)match(input,GreaterThanSign,FOLLOW_2); 

                    				current = grammarAccess.getComparativeOperatorAccess().getGREATER_THANEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getComparativeOperatorAccess().getGREATER_THANEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMSQLQueryParser.g:810:3: (enumLiteral_5= GreaterThanSignEqualsSign )
                    {
                    // InternalMSQLQueryParser.g:810:3: (enumLiteral_5= GreaterThanSignEqualsSign )
                    // InternalMSQLQueryParser.g:811:4: enumLiteral_5= GreaterThanSignEqualsSign
                    {
                    enumLiteral_5=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_2); 

                    				current = grammarAccess.getComparativeOperatorAccess().getGREATER_THAN_OR_EQUALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getComparativeOperatorAccess().getGREATER_THAN_OR_EQUALEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparativeOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000304000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000E1C00L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000282L});

}