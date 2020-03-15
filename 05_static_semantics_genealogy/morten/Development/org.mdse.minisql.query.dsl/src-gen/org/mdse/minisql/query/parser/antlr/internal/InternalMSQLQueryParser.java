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
            					set(
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
    // InternalMSQLQueryParser.g:168:1: ruleWhatClause returns [EObject current=null] : ( ( (lv_whatDirectives_0_0= ruleWhatDirective ) ) (otherlv_1= Comma ( (lv_whatDirectives_2_0= ruleWhatDirective ) ) )* ) ;
    public final EObject ruleWhatClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_whatDirectives_0_0 = null;

        EObject lv_whatDirectives_2_0 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:174:2: ( ( ( (lv_whatDirectives_0_0= ruleWhatDirective ) ) (otherlv_1= Comma ( (lv_whatDirectives_2_0= ruleWhatDirective ) ) )* ) )
            // InternalMSQLQueryParser.g:175:2: ( ( (lv_whatDirectives_0_0= ruleWhatDirective ) ) (otherlv_1= Comma ( (lv_whatDirectives_2_0= ruleWhatDirective ) ) )* )
            {
            // InternalMSQLQueryParser.g:175:2: ( ( (lv_whatDirectives_0_0= ruleWhatDirective ) ) (otherlv_1= Comma ( (lv_whatDirectives_2_0= ruleWhatDirective ) ) )* )
            // InternalMSQLQueryParser.g:176:3: ( (lv_whatDirectives_0_0= ruleWhatDirective ) ) (otherlv_1= Comma ( (lv_whatDirectives_2_0= ruleWhatDirective ) ) )*
            {
            // InternalMSQLQueryParser.g:176:3: ( (lv_whatDirectives_0_0= ruleWhatDirective ) )
            // InternalMSQLQueryParser.g:177:4: (lv_whatDirectives_0_0= ruleWhatDirective )
            {
            // InternalMSQLQueryParser.g:177:4: (lv_whatDirectives_0_0= ruleWhatDirective )
            // InternalMSQLQueryParser.g:178:5: lv_whatDirectives_0_0= ruleWhatDirective
            {

            					newCompositeNode(grammarAccess.getWhatClauseAccess().getWhatDirectivesWhatDirectiveParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_whatDirectives_0_0=ruleWhatDirective();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhatClauseRule());
            					}
            					add(
            						current,
            						"whatDirectives",
            						lv_whatDirectives_0_0,
            						"org.mdse.minisql.query.MSQLQuery.WhatDirective");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSQLQueryParser.g:195:3: (otherlv_1= Comma ( (lv_whatDirectives_2_0= ruleWhatDirective ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==Comma) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:196:4: otherlv_1= Comma ( (lv_whatDirectives_2_0= ruleWhatDirective ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getWhatClauseAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMSQLQueryParser.g:200:4: ( (lv_whatDirectives_2_0= ruleWhatDirective ) )
            	    // InternalMSQLQueryParser.g:201:5: (lv_whatDirectives_2_0= ruleWhatDirective )
            	    {
            	    // InternalMSQLQueryParser.g:201:5: (lv_whatDirectives_2_0= ruleWhatDirective )
            	    // InternalMSQLQueryParser.g:202:6: lv_whatDirectives_2_0= ruleWhatDirective
            	    {

            	    						newCompositeNode(grammarAccess.getWhatClauseAccess().getWhatDirectivesWhatDirectiveParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_whatDirectives_2_0=ruleWhatDirective();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWhatClauseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"whatDirectives",
            	    							lv_whatDirectives_2_0,
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
    // InternalMSQLQueryParser.g:333:1: ruleFromClause returns [EObject current=null] : (otherlv_0= FROM ( (lv_tableReference_1_0= ruleTableReference ) ) ) ;
    public final EObject ruleFromClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_tableReference_1_0 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:339:2: ( (otherlv_0= FROM ( (lv_tableReference_1_0= ruleTableReference ) ) ) )
            // InternalMSQLQueryParser.g:340:2: (otherlv_0= FROM ( (lv_tableReference_1_0= ruleTableReference ) ) )
            {
            // InternalMSQLQueryParser.g:340:2: (otherlv_0= FROM ( (lv_tableReference_1_0= ruleTableReference ) ) )
            // InternalMSQLQueryParser.g:341:3: otherlv_0= FROM ( (lv_tableReference_1_0= ruleTableReference ) )
            {
            otherlv_0=(Token)match(input,FROM,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getFromClauseAccess().getFROMKeyword_0());
            		
            // InternalMSQLQueryParser.g:345:3: ( (lv_tableReference_1_0= ruleTableReference ) )
            // InternalMSQLQueryParser.g:346:4: (lv_tableReference_1_0= ruleTableReference )
            {
            // InternalMSQLQueryParser.g:346:4: (lv_tableReference_1_0= ruleTableReference )
            // InternalMSQLQueryParser.g:347:5: lv_tableReference_1_0= ruleTableReference
            {

            					newCompositeNode(grammarAccess.getFromClauseAccess().getTableReferenceTableReferenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_tableReference_1_0=ruleTableReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFromClauseRule());
            					}
            					set(
            						current,
            						"tableReference",
            						lv_tableReference_1_0,
            						"org.mdse.minisql.query.MSQLQuery.TableReference");
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
    // $ANTLR end "ruleFromClause"


    // $ANTLR start "entryRuleWhereClause"
    // InternalMSQLQueryParser.g:368:1: entryRuleWhereClause returns [EObject current=null] : iv_ruleWhereClause= ruleWhereClause EOF ;
    public final EObject entryRuleWhereClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereClause = null;


        try {
            // InternalMSQLQueryParser.g:368:52: (iv_ruleWhereClause= ruleWhereClause EOF )
            // InternalMSQLQueryParser.g:369:2: iv_ruleWhereClause= ruleWhereClause EOF
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
    // InternalMSQLQueryParser.g:375:1: ruleWhereClause returns [EObject current=null] : (otherlv_0= WHERE ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleWhereClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:381:2: ( (otherlv_0= WHERE ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalMSQLQueryParser.g:382:2: (otherlv_0= WHERE ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalMSQLQueryParser.g:382:2: (otherlv_0= WHERE ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalMSQLQueryParser.g:383:3: otherlv_0= WHERE ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,WHERE,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getWhereClauseAccess().getWHEREKeyword_0());
            		
            // InternalMSQLQueryParser.g:387:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalMSQLQueryParser.g:388:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalMSQLQueryParser.g:388:4: (lv_expression_1_0= ruleExpression )
            // InternalMSQLQueryParser.g:389:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhereClauseAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhereClauseRule());
            					}
            					set(
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


    // $ANTLR start "entryRuleOrderByClause"
    // InternalMSQLQueryParser.g:410:1: entryRuleOrderByClause returns [EObject current=null] : iv_ruleOrderByClause= ruleOrderByClause EOF ;
    public final EObject entryRuleOrderByClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderByClause = null;


        try {
            // InternalMSQLQueryParser.g:410:54: (iv_ruleOrderByClause= ruleOrderByClause EOF )
            // InternalMSQLQueryParser.g:411:2: iv_ruleOrderByClause= ruleOrderByClause EOF
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
    // InternalMSQLQueryParser.g:417:1: ruleOrderByClause returns [EObject current=null] : (otherlv_0= ORDER otherlv_1= BY ( (lv_orderDirectives_2_0= ruleOrderDirective ) ) (otherlv_3= Comma ( (lv_orderDirectives_4_0= ruleOrderDirective ) ) )* ) ;
    public final EObject ruleOrderByClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_orderDirectives_2_0 = null;

        EObject lv_orderDirectives_4_0 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:423:2: ( (otherlv_0= ORDER otherlv_1= BY ( (lv_orderDirectives_2_0= ruleOrderDirective ) ) (otherlv_3= Comma ( (lv_orderDirectives_4_0= ruleOrderDirective ) ) )* ) )
            // InternalMSQLQueryParser.g:424:2: (otherlv_0= ORDER otherlv_1= BY ( (lv_orderDirectives_2_0= ruleOrderDirective ) ) (otherlv_3= Comma ( (lv_orderDirectives_4_0= ruleOrderDirective ) ) )* )
            {
            // InternalMSQLQueryParser.g:424:2: (otherlv_0= ORDER otherlv_1= BY ( (lv_orderDirectives_2_0= ruleOrderDirective ) ) (otherlv_3= Comma ( (lv_orderDirectives_4_0= ruleOrderDirective ) ) )* )
            // InternalMSQLQueryParser.g:425:3: otherlv_0= ORDER otherlv_1= BY ( (lv_orderDirectives_2_0= ruleOrderDirective ) ) (otherlv_3= Comma ( (lv_orderDirectives_4_0= ruleOrderDirective ) ) )*
            {
            otherlv_0=(Token)match(input,ORDER,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getOrderByClauseAccess().getORDERKeyword_0());
            		
            otherlv_1=(Token)match(input,BY,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOrderByClauseAccess().getBYKeyword_1());
            		
            // InternalMSQLQueryParser.g:433:3: ( (lv_orderDirectives_2_0= ruleOrderDirective ) )
            // InternalMSQLQueryParser.g:434:4: (lv_orderDirectives_2_0= ruleOrderDirective )
            {
            // InternalMSQLQueryParser.g:434:4: (lv_orderDirectives_2_0= ruleOrderDirective )
            // InternalMSQLQueryParser.g:435:5: lv_orderDirectives_2_0= ruleOrderDirective
            {

            					newCompositeNode(grammarAccess.getOrderByClauseAccess().getOrderDirectivesOrderDirectiveParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_orderDirectives_2_0=ruleOrderDirective();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrderByClauseRule());
            					}
            					add(
            						current,
            						"orderDirectives",
            						lv_orderDirectives_2_0,
            						"org.mdse.minisql.query.MSQLQuery.OrderDirective");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSQLQueryParser.g:452:3: (otherlv_3= Comma ( (lv_orderDirectives_4_0= ruleOrderDirective ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Comma) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:453:4: otherlv_3= Comma ( (lv_orderDirectives_4_0= ruleOrderDirective ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getOrderByClauseAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMSQLQueryParser.g:457:4: ( (lv_orderDirectives_4_0= ruleOrderDirective ) )
            	    // InternalMSQLQueryParser.g:458:5: (lv_orderDirectives_4_0= ruleOrderDirective )
            	    {
            	    // InternalMSQLQueryParser.g:458:5: (lv_orderDirectives_4_0= ruleOrderDirective )
            	    // InternalMSQLQueryParser.g:459:6: lv_orderDirectives_4_0= ruleOrderDirective
            	    {

            	    						newCompositeNode(grammarAccess.getOrderByClauseAccess().getOrderDirectivesOrderDirectiveParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_orderDirectives_4_0=ruleOrderDirective();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrderByClauseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"orderDirectives",
            	    							lv_orderDirectives_4_0,
            	    							"org.mdse.minisql.query.MSQLQuery.OrderDirective");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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


    // $ANTLR start "entryRuleOrderDirective"
    // InternalMSQLQueryParser.g:481:1: entryRuleOrderDirective returns [EObject current=null] : iv_ruleOrderDirective= ruleOrderDirective EOF ;
    public final EObject entryRuleOrderDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderDirective = null;


        try {
            // InternalMSQLQueryParser.g:481:55: (iv_ruleOrderDirective= ruleOrderDirective EOF )
            // InternalMSQLQueryParser.g:482:2: iv_ruleOrderDirective= ruleOrderDirective EOF
            {
             newCompositeNode(grammarAccess.getOrderDirectiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrderDirective=ruleOrderDirective();

            state._fsp--;

             current =iv_ruleOrderDirective; 
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
    // $ANTLR end "entryRuleOrderDirective"


    // $ANTLR start "ruleOrderDirective"
    // InternalMSQLQueryParser.g:488:1: ruleOrderDirective returns [EObject current=null] : ( ( (lv_columnReference_0_0= ruleColumnReference ) ) ( ( (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC ) ) )? ) ;
    public final EObject ruleOrderDirective() throws RecognitionException {
        EObject current = null;

        Token lv_ascending_1_1=null;
        Token lv_ascending_1_2=null;
        EObject lv_columnReference_0_0 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:494:2: ( ( ( (lv_columnReference_0_0= ruleColumnReference ) ) ( ( (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC ) ) )? ) )
            // InternalMSQLQueryParser.g:495:2: ( ( (lv_columnReference_0_0= ruleColumnReference ) ) ( ( (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC ) ) )? )
            {
            // InternalMSQLQueryParser.g:495:2: ( ( (lv_columnReference_0_0= ruleColumnReference ) ) ( ( (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC ) ) )? )
            // InternalMSQLQueryParser.g:496:3: ( (lv_columnReference_0_0= ruleColumnReference ) ) ( ( (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC ) ) )?
            {
            // InternalMSQLQueryParser.g:496:3: ( (lv_columnReference_0_0= ruleColumnReference ) )
            // InternalMSQLQueryParser.g:497:4: (lv_columnReference_0_0= ruleColumnReference )
            {
            // InternalMSQLQueryParser.g:497:4: (lv_columnReference_0_0= ruleColumnReference )
            // InternalMSQLQueryParser.g:498:5: lv_columnReference_0_0= ruleColumnReference
            {

            					newCompositeNode(grammarAccess.getOrderDirectiveAccess().getColumnReferenceColumnReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_columnReference_0_0=ruleColumnReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrderDirectiveRule());
            					}
            					set(
            						current,
            						"columnReference",
            						lv_columnReference_0_0,
            						"org.mdse.minisql.query.MSQLQuery.ColumnReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSQLQueryParser.g:515:3: ( ( (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==DESC||LA7_0==ASC) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMSQLQueryParser.g:516:4: ( (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC ) )
                    {
                    // InternalMSQLQueryParser.g:516:4: ( (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC ) )
                    // InternalMSQLQueryParser.g:517:5: (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC )
                    {
                    // InternalMSQLQueryParser.g:517:5: (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==ASC) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==DESC) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalMSQLQueryParser.g:518:6: lv_ascending_1_1= ASC
                            {
                            lv_ascending_1_1=(Token)match(input,ASC,FOLLOW_2); 

                            						newLeafNode(lv_ascending_1_1, grammarAccess.getOrderDirectiveAccess().getAscendingASCKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOrderDirectiveRule());
                            						}
                            						setWithLastConsumed(current, "ascending", true, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalMSQLQueryParser.g:529:6: lv_ascending_1_2= DESC
                            {
                            lv_ascending_1_2=(Token)match(input,DESC,FOLLOW_2); 

                            						newLeafNode(lv_ascending_1_2, grammarAccess.getOrderDirectiveAccess().getAscendingDESCKeyword_1_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOrderDirectiveRule());
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
    // $ANTLR end "ruleOrderDirective"


    // $ANTLR start "entryRuleExpression"
    // InternalMSQLQueryParser.g:546:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMSQLQueryParser.g:546:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMSQLQueryParser.g:547:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMSQLQueryParser.g:553:1: ruleExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:559:2: (this_OrExpression_0= ruleOrExpression )
            // InternalMSQLQueryParser.g:560:2: this_OrExpression_0= ruleOrExpression
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;


            		current = this_OrExpression_0;
            		afterParserOrEnumRuleCall();
            	

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


    // $ANTLR start "entryRuleOrExpression"
    // InternalMSQLQueryParser.g:571:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalMSQLQueryParser.g:571:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalMSQLQueryParser.g:572:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalMSQLQueryParser.g:578:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_expression2_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression2_3_0 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:584:2: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_expression2_3_0= ruleAndExpression ) ) )* ) )
            // InternalMSQLQueryParser.g:585:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_expression2_3_0= ruleAndExpression ) ) )* )
            {
            // InternalMSQLQueryParser.g:585:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_expression2_3_0= ruleAndExpression ) ) )* )
            // InternalMSQLQueryParser.g:586:3: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_expression2_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMSQLQueryParser.g:594:3: ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_expression2_3_0= ruleAndExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==OR) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:595:4: () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_expression2_3_0= ruleAndExpression ) )
            	    {
            	    // InternalMSQLQueryParser.g:595:4: ()
            	    // InternalMSQLQueryParser.g:596:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExpressionAccess().getBinaryLogicalExpressionExpression1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMSQLQueryParser.g:602:4: ( (lv_operator_2_0= ruleOrOperator ) )
            	    // InternalMSQLQueryParser.g:603:5: (lv_operator_2_0= ruleOrOperator )
            	    {
            	    // InternalMSQLQueryParser.g:603:5: (lv_operator_2_0= ruleOrOperator )
            	    // InternalMSQLQueryParser.g:604:6: lv_operator_2_0= ruleOrOperator
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_operator_2_0=ruleOrOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.mdse.minisql.query.MSQLQuery.OrOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMSQLQueryParser.g:621:4: ( (lv_expression2_3_0= ruleAndExpression ) )
            	    // InternalMSQLQueryParser.g:622:5: (lv_expression2_3_0= ruleAndExpression )
            	    {
            	    // InternalMSQLQueryParser.g:622:5: (lv_expression2_3_0= ruleAndExpression )
            	    // InternalMSQLQueryParser.g:623:6: lv_expression2_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getExpression2AndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_expression2_3_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"expression2",
            	    							lv_expression2_3_0,
            	    							"org.mdse.minisql.query.MSQLQuery.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalMSQLQueryParser.g:645:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalMSQLQueryParser.g:645:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalMSQLQueryParser.g:646:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalMSQLQueryParser.g:652:1: ruleAndExpression returns [EObject current=null] : (this_AndOperand_0= ruleAndOperand ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_expression2_3_0= ruleAndOperand ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndOperand_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression2_3_0 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:658:2: ( (this_AndOperand_0= ruleAndOperand ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_expression2_3_0= ruleAndOperand ) ) )* ) )
            // InternalMSQLQueryParser.g:659:2: (this_AndOperand_0= ruleAndOperand ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_expression2_3_0= ruleAndOperand ) ) )* )
            {
            // InternalMSQLQueryParser.g:659:2: (this_AndOperand_0= ruleAndOperand ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_expression2_3_0= ruleAndOperand ) ) )* )
            // InternalMSQLQueryParser.g:660:3: this_AndOperand_0= ruleAndOperand ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_expression2_3_0= ruleAndOperand ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getAndOperandParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_AndOperand_0=ruleAndOperand();

            state._fsp--;


            			current = this_AndOperand_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMSQLQueryParser.g:668:3: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_expression2_3_0= ruleAndOperand ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==AND) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:669:4: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_expression2_3_0= ruleAndOperand ) )
            	    {
            	    // InternalMSQLQueryParser.g:669:4: ()
            	    // InternalMSQLQueryParser.g:670:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getBinaryLogicalExpressionExpression1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMSQLQueryParser.g:676:4: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // InternalMSQLQueryParser.g:677:5: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // InternalMSQLQueryParser.g:677:5: (lv_operator_2_0= ruleAndOperator )
            	    // InternalMSQLQueryParser.g:678:6: lv_operator_2_0= ruleAndOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_operator_2_0=ruleAndOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.mdse.minisql.query.MSQLQuery.AndOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMSQLQueryParser.g:695:4: ( (lv_expression2_3_0= ruleAndOperand ) )
            	    // InternalMSQLQueryParser.g:696:5: (lv_expression2_3_0= ruleAndOperand )
            	    {
            	    // InternalMSQLQueryParser.g:696:5: (lv_expression2_3_0= ruleAndOperand )
            	    // InternalMSQLQueryParser.g:697:6: lv_expression2_3_0= ruleAndOperand
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getExpression2AndOperandParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_expression2_3_0=ruleAndOperand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"expression2",
            	    							lv_expression2_3_0,
            	    							"org.mdse.minisql.query.MSQLQuery.AndOperand");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleAndOperand"
    // InternalMSQLQueryParser.g:719:1: entryRuleAndOperand returns [EObject current=null] : iv_ruleAndOperand= ruleAndOperand EOF ;
    public final EObject entryRuleAndOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOperand = null;


        try {
            // InternalMSQLQueryParser.g:719:51: (iv_ruleAndOperand= ruleAndOperand EOF )
            // InternalMSQLQueryParser.g:720:2: iv_ruleAndOperand= ruleAndOperand EOF
            {
             newCompositeNode(grammarAccess.getAndOperandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndOperand=ruleAndOperand();

            state._fsp--;

             current =iv_ruleAndOperand; 
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
    // $ANTLR end "entryRuleAndOperand"


    // $ANTLR start "ruleAndOperand"
    // InternalMSQLQueryParser.g:726:1: ruleAndOperand returns [EObject current=null] : (this_NotExpression_0= ruleNotExpression | this_ComparativeExpression_1= ruleComparativeExpression ) ;
    public final EObject ruleAndOperand() throws RecognitionException {
        EObject current = null;

        EObject this_NotExpression_0 = null;

        EObject this_ComparativeExpression_1 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:732:2: ( (this_NotExpression_0= ruleNotExpression | this_ComparativeExpression_1= ruleComparativeExpression ) )
            // InternalMSQLQueryParser.g:733:2: (this_NotExpression_0= ruleNotExpression | this_ComparativeExpression_1= ruleComparativeExpression )
            {
            // InternalMSQLQueryParser.g:733:2: (this_NotExpression_0= ruleNotExpression | this_ComparativeExpression_1= ruleComparativeExpression )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==NOT) ) {
                alt10=1;
            }
            else if ( (LA10_0==FALSE||LA10_0==TRUE||LA10_0==LeftParenthesis||(LA10_0>=RULE_ID && LA10_0<=RULE_STRING)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMSQLQueryParser.g:734:3: this_NotExpression_0= ruleNotExpression
                    {

                    			newCompositeNode(grammarAccess.getAndOperandAccess().getNotExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NotExpression_0=ruleNotExpression();

                    state._fsp--;


                    			current = this_NotExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:743:3: this_ComparativeExpression_1= ruleComparativeExpression
                    {

                    			newCompositeNode(grammarAccess.getAndOperandAccess().getComparativeExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComparativeExpression_1=ruleComparativeExpression();

                    state._fsp--;


                    			current = this_ComparativeExpression_1;
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
    // $ANTLR end "ruleAndOperand"


    // $ANTLR start "entryRuleNotExpression"
    // InternalMSQLQueryParser.g:755:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalMSQLQueryParser.g:755:54: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalMSQLQueryParser.g:756:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
             newCompositeNode(grammarAccess.getNotExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;

             current =iv_ruleNotExpression; 
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
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalMSQLQueryParser.g:762:1: ruleNotExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_expression_1_0= ruleComparativeExpression ) ) ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:768:2: ( ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_expression_1_0= ruleComparativeExpression ) ) ) )
            // InternalMSQLQueryParser.g:769:2: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_expression_1_0= ruleComparativeExpression ) ) )
            {
            // InternalMSQLQueryParser.g:769:2: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_expression_1_0= ruleComparativeExpression ) ) )
            // InternalMSQLQueryParser.g:770:3: ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_expression_1_0= ruleComparativeExpression ) )
            {
            // InternalMSQLQueryParser.g:770:3: ( (lv_operator_0_0= ruleNotOperator ) )
            // InternalMSQLQueryParser.g:771:4: (lv_operator_0_0= ruleNotOperator )
            {
            // InternalMSQLQueryParser.g:771:4: (lv_operator_0_0= ruleNotOperator )
            // InternalMSQLQueryParser.g:772:5: lv_operator_0_0= ruleNotOperator
            {

            					newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_operator_0_0=ruleNotOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNotExpressionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_0_0,
            						"org.mdse.minisql.query.MSQLQuery.NotOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSQLQueryParser.g:789:3: ( (lv_expression_1_0= ruleComparativeExpression ) )
            // InternalMSQLQueryParser.g:790:4: (lv_expression_1_0= ruleComparativeExpression )
            {
            // InternalMSQLQueryParser.g:790:4: (lv_expression_1_0= ruleComparativeExpression )
            // InternalMSQLQueryParser.g:791:5: lv_expression_1_0= ruleComparativeExpression
            {

            					newCompositeNode(grammarAccess.getNotExpressionAccess().getExpressionComparativeExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleComparativeExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNotExpressionRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.mdse.minisql.query.MSQLQuery.ComparativeExpression");
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
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleComparativeExpression"
    // InternalMSQLQueryParser.g:812:1: entryRuleComparativeExpression returns [EObject current=null] : iv_ruleComparativeExpression= ruleComparativeExpression EOF ;
    public final EObject entryRuleComparativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparativeExpression = null;


        try {
            // InternalMSQLQueryParser.g:812:62: (iv_ruleComparativeExpression= ruleComparativeExpression EOF )
            // InternalMSQLQueryParser.g:813:2: iv_ruleComparativeExpression= ruleComparativeExpression EOF
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
    // InternalMSQLQueryParser.g:819:1: ruleComparativeExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparativeOperator ) ) ( (lv_expression2_3_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleComparativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression2_3_0 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:825:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparativeOperator ) ) ( (lv_expression2_3_0= ruleAdditiveExpression ) ) )* ) )
            // InternalMSQLQueryParser.g:826:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparativeOperator ) ) ( (lv_expression2_3_0= ruleAdditiveExpression ) ) )* )
            {
            // InternalMSQLQueryParser.g:826:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparativeOperator ) ) ( (lv_expression2_3_0= ruleAdditiveExpression ) ) )* )
            // InternalMSQLQueryParser.g:827:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparativeOperator ) ) ( (lv_expression2_3_0= ruleAdditiveExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparativeExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current = this_AdditiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMSQLQueryParser.g:835:3: ( () ( (lv_operator_2_0= ruleComparativeOperator ) ) ( (lv_expression2_3_0= ruleAdditiveExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=ExclamationMarkEqualsSign && LA11_0<=GreaterThanSignEqualsSign)||(LA11_0>=LessThanSign && LA11_0<=GreaterThanSign)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:836:4: () ( (lv_operator_2_0= ruleComparativeOperator ) ) ( (lv_expression2_3_0= ruleAdditiveExpression ) )
            	    {
            	    // InternalMSQLQueryParser.g:836:4: ()
            	    // InternalMSQLQueryParser.g:837:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparativeExpressionAccess().getComparativeExpressionExpression1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMSQLQueryParser.g:843:4: ( (lv_operator_2_0= ruleComparativeOperator ) )
            	    // InternalMSQLQueryParser.g:844:5: (lv_operator_2_0= ruleComparativeOperator )
            	    {
            	    // InternalMSQLQueryParser.g:844:5: (lv_operator_2_0= ruleComparativeOperator )
            	    // InternalMSQLQueryParser.g:845:6: lv_operator_2_0= ruleComparativeOperator
            	    {

            	    						newCompositeNode(grammarAccess.getComparativeExpressionAccess().getOperatorComparativeOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_operator_2_0=ruleComparativeOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparativeExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.mdse.minisql.query.MSQLQuery.ComparativeOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMSQLQueryParser.g:862:4: ( (lv_expression2_3_0= ruleAdditiveExpression ) )
            	    // InternalMSQLQueryParser.g:863:5: (lv_expression2_3_0= ruleAdditiveExpression )
            	    {
            	    // InternalMSQLQueryParser.g:863:5: (lv_expression2_3_0= ruleAdditiveExpression )
            	    // InternalMSQLQueryParser.g:864:6: lv_expression2_3_0= ruleAdditiveExpression
            	    {

            	    						newCompositeNode(grammarAccess.getComparativeExpressionAccess().getExpression2AdditiveExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_expression2_3_0=ruleAdditiveExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparativeExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"expression2",
            	    							lv_expression2_3_0,
            	    							"org.mdse.minisql.query.MSQLQuery.AdditiveExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleComparativeExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalMSQLQueryParser.g:886:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalMSQLQueryParser.g:886:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalMSQLQueryParser.g:887:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;

             current =iv_ruleAdditiveExpression; 
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
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalMSQLQueryParser.g:893:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_expression2_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression2_3_0 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:899:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_expression2_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalMSQLQueryParser.g:900:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_expression2_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalMSQLQueryParser.g:900:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_expression2_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalMSQLQueryParser.g:901:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_expression2_3_0= ruleMultiplicativeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current = this_MultiplicativeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMSQLQueryParser.g:909:3: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_expression2_3_0= ruleMultiplicativeExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==PlusSign||LA12_0==HyphenMinus) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:910:4: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_expression2_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalMSQLQueryParser.g:910:4: ()
            	    // InternalMSQLQueryParser.g:911:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditiveExpressionAccess().getArithmeticExpressionExpression1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMSQLQueryParser.g:917:4: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // InternalMSQLQueryParser.g:918:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // InternalMSQLQueryParser.g:918:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    // InternalMSQLQueryParser.g:919:6: lv_operator_2_0= ruleAdditiveOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_operator_2_0=ruleAdditiveOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.mdse.minisql.query.MSQLQuery.AdditiveOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMSQLQueryParser.g:936:4: ( (lv_expression2_3_0= ruleMultiplicativeExpression ) )
            	    // InternalMSQLQueryParser.g:937:5: (lv_expression2_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalMSQLQueryParser.g:937:5: (lv_expression2_3_0= ruleMultiplicativeExpression )
            	    // InternalMSQLQueryParser.g:938:6: lv_expression2_3_0= ruleMultiplicativeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getExpression2MultiplicativeExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_expression2_3_0=ruleMultiplicativeExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"expression2",
            	    							lv_expression2_3_0,
            	    							"org.mdse.minisql.query.MSQLQuery.MultiplicativeExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalMSQLQueryParser.g:960:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalMSQLQueryParser.g:960:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalMSQLQueryParser.g:961:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;

             current =iv_ruleMultiplicativeExpression; 
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
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalMSQLQueryParser.g:967:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_AtomicExpression_0= ruleAtomicExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_expression2_3_0= ruleAtomicExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression2_3_0 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:973:2: ( (this_AtomicExpression_0= ruleAtomicExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_expression2_3_0= ruleAtomicExpression ) ) )* ) )
            // InternalMSQLQueryParser.g:974:2: (this_AtomicExpression_0= ruleAtomicExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_expression2_3_0= ruleAtomicExpression ) ) )* )
            {
            // InternalMSQLQueryParser.g:974:2: (this_AtomicExpression_0= ruleAtomicExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_expression2_3_0= ruleAtomicExpression ) ) )* )
            // InternalMSQLQueryParser.g:975:3: this_AtomicExpression_0= ruleAtomicExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_expression2_3_0= ruleAtomicExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getAtomicExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_AtomicExpression_0=ruleAtomicExpression();

            state._fsp--;


            			current = this_AtomicExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMSQLQueryParser.g:983:3: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_expression2_3_0= ruleAtomicExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Asterisk||LA13_0==Solidus) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:984:4: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_expression2_3_0= ruleAtomicExpression ) )
            	    {
            	    // InternalMSQLQueryParser.g:984:4: ()
            	    // InternalMSQLQueryParser.g:985:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicativeExpressionAccess().getArithmeticExpressionExpression1Action_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMSQLQueryParser.g:991:4: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // InternalMSQLQueryParser.g:992:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // InternalMSQLQueryParser.g:992:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // InternalMSQLQueryParser.g:993:6: lv_operator_2_0= ruleMultiplicativeOperator
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_operator_2_0=ruleMultiplicativeOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.mdse.minisql.query.MSQLQuery.MultiplicativeOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMSQLQueryParser.g:1010:4: ( (lv_expression2_3_0= ruleAtomicExpression ) )
            	    // InternalMSQLQueryParser.g:1011:5: (lv_expression2_3_0= ruleAtomicExpression )
            	    {
            	    // InternalMSQLQueryParser.g:1011:5: (lv_expression2_3_0= ruleAtomicExpression )
            	    // InternalMSQLQueryParser.g:1012:6: lv_expression2_3_0= ruleAtomicExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getExpression2AtomicExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_expression2_3_0=ruleAtomicExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"expression2",
            	    							lv_expression2_3_0,
            	    							"org.mdse.minisql.query.MSQLQuery.AtomicExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalMSQLQueryParser.g:1034:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalMSQLQueryParser.g:1034:57: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalMSQLQueryParser.g:1035:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
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
    // InternalMSQLQueryParser.g:1041:1: ruleAtomicExpression returns [EObject current=null] : ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_ColumnReference_3= ruleColumnReference | this_Literal_4= ruleLiteral ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_ColumnReference_3 = null;

        EObject this_Literal_4 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:1047:2: ( ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_ColumnReference_3= ruleColumnReference | this_Literal_4= ruleLiteral ) )
            // InternalMSQLQueryParser.g:1048:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_ColumnReference_3= ruleColumnReference | this_Literal_4= ruleLiteral )
            {
            // InternalMSQLQueryParser.g:1048:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_ColumnReference_3= ruleColumnReference | this_Literal_4= ruleLiteral )
            int alt14=3;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt14=1;
                }
                break;
            case RULE_ID:
                {
                alt14=2;
                }
                break;
            case FALSE:
            case TRUE:
            case RULE_INT:
            case RULE_STRING:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMSQLQueryParser.g:1049:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    {
                    // InternalMSQLQueryParser.g:1049:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    // InternalMSQLQueryParser.g:1050:4: otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getAtomicExpressionAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_18);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,RightParenthesis,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:1068:3: this_ColumnReference_3= ruleColumnReference
                    {

                    			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getColumnReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColumnReference_3=ruleColumnReference();

                    state._fsp--;


                    			current = this_ColumnReference_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMSQLQueryParser.g:1077:3: this_Literal_4= ruleLiteral
                    {

                    			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Literal_4=ruleLiteral();

                    state._fsp--;


                    			current = this_Literal_4;
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


    // $ANTLR start "entryRuleTableReference"
    // InternalMSQLQueryParser.g:1089:1: entryRuleTableReference returns [EObject current=null] : iv_ruleTableReference= ruleTableReference EOF ;
    public final EObject entryRuleTableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableReference = null;


        try {
            // InternalMSQLQueryParser.g:1089:55: (iv_ruleTableReference= ruleTableReference EOF )
            // InternalMSQLQueryParser.g:1090:2: iv_ruleTableReference= ruleTableReference EOF
            {
             newCompositeNode(grammarAccess.getTableReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableReference=ruleTableReference();

            state._fsp--;

             current =iv_ruleTableReference; 
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
    // $ANTLR end "entryRuleTableReference"


    // $ANTLR start "ruleTableReference"
    // InternalMSQLQueryParser.g:1096:1: ruleTableReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleTableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMSQLQueryParser.g:1102:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMSQLQueryParser.g:1103:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMSQLQueryParser.g:1103:2: ( (otherlv_0= RULE_ID ) )
            // InternalMSQLQueryParser.g:1104:3: (otherlv_0= RULE_ID )
            {
            // InternalMSQLQueryParser.g:1104:3: (otherlv_0= RULE_ID )
            // InternalMSQLQueryParser.g:1105:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTableReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getTableReferenceAccess().getTableTableCrossReference_0());
            			

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
    // $ANTLR end "ruleTableReference"


    // $ANTLR start "entryRuleColumnReference"
    // InternalMSQLQueryParser.g:1119:1: entryRuleColumnReference returns [EObject current=null] : iv_ruleColumnReference= ruleColumnReference EOF ;
    public final EObject entryRuleColumnReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnReference = null;


        try {
            // InternalMSQLQueryParser.g:1119:56: (iv_ruleColumnReference= ruleColumnReference EOF )
            // InternalMSQLQueryParser.g:1120:2: iv_ruleColumnReference= ruleColumnReference EOF
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
    // InternalMSQLQueryParser.g:1126:1: ruleColumnReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleColumnReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMSQLQueryParser.g:1132:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMSQLQueryParser.g:1133:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMSQLQueryParser.g:1133:2: ( (otherlv_0= RULE_ID ) )
            // InternalMSQLQueryParser.g:1134:3: (otherlv_0= RULE_ID )
            {
            // InternalMSQLQueryParser.g:1134:3: (otherlv_0= RULE_ID )
            // InternalMSQLQueryParser.g:1135:4: otherlv_0= RULE_ID
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


    // $ANTLR start "entryRuleLiteral"
    // InternalMSQLQueryParser.g:1149:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalMSQLQueryParser.g:1149:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalMSQLQueryParser.g:1150:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalMSQLQueryParser.g:1156:1: ruleLiteral returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_IntegerLiteral_1= ruleIntegerLiteral | this_BooleanLiteral_2= ruleBooleanLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_IntegerLiteral_1 = null;

        EObject this_BooleanLiteral_2 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:1162:2: ( (this_StringLiteral_0= ruleStringLiteral | this_IntegerLiteral_1= ruleIntegerLiteral | this_BooleanLiteral_2= ruleBooleanLiteral ) )
            // InternalMSQLQueryParser.g:1163:2: (this_StringLiteral_0= ruleStringLiteral | this_IntegerLiteral_1= ruleIntegerLiteral | this_BooleanLiteral_2= ruleBooleanLiteral )
            {
            // InternalMSQLQueryParser.g:1163:2: (this_StringLiteral_0= ruleStringLiteral | this_IntegerLiteral_1= ruleIntegerLiteral | this_BooleanLiteral_2= ruleBooleanLiteral )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt15=1;
                }
                break;
            case RULE_INT:
                {
                alt15=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMSQLQueryParser.g:1164:3: this_StringLiteral_0= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:1173:3: this_IntegerLiteral_1= ruleIntegerLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerLiteral_1=ruleIntegerLiteral();

                    state._fsp--;


                    			current = this_IntegerLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMSQLQueryParser.g:1182:3: this_BooleanLiteral_2= ruleBooleanLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteral_2=ruleBooleanLiteral();

                    state._fsp--;


                    			current = this_BooleanLiteral_2;
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalMSQLQueryParser.g:1194:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalMSQLQueryParser.g:1194:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalMSQLQueryParser.g:1195:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalMSQLQueryParser.g:1201:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMSQLQueryParser.g:1207:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMSQLQueryParser.g:1208:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMSQLQueryParser.g:1208:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMSQLQueryParser.g:1209:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMSQLQueryParser.g:1209:3: (lv_value_0_0= RULE_STRING )
            // InternalMSQLQueryParser.g:1210:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleIntegerLiteral"
    // InternalMSQLQueryParser.g:1229:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // InternalMSQLQueryParser.g:1229:55: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // InternalMSQLQueryParser.g:1230:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
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
    // InternalMSQLQueryParser.g:1236:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMSQLQueryParser.g:1242:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalMSQLQueryParser.g:1243:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalMSQLQueryParser.g:1243:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalMSQLQueryParser.g:1244:3: (lv_value_0_0= RULE_INT )
            {
            // InternalMSQLQueryParser.g:1244:3: (lv_value_0_0= RULE_INT )
            // InternalMSQLQueryParser.g:1245:4: lv_value_0_0= RULE_INT
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


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalMSQLQueryParser.g:1264:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalMSQLQueryParser.g:1264:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalMSQLQueryParser.g:1265:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalMSQLQueryParser.g:1271:1: ruleBooleanLiteral returns [EObject current=null] : ( ( (lv_value_0_1= TRUE | lv_value_0_2= FALSE ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalMSQLQueryParser.g:1277:2: ( ( ( (lv_value_0_1= TRUE | lv_value_0_2= FALSE ) ) ) )
            // InternalMSQLQueryParser.g:1278:2: ( ( (lv_value_0_1= TRUE | lv_value_0_2= FALSE ) ) )
            {
            // InternalMSQLQueryParser.g:1278:2: ( ( (lv_value_0_1= TRUE | lv_value_0_2= FALSE ) ) )
            // InternalMSQLQueryParser.g:1279:3: ( (lv_value_0_1= TRUE | lv_value_0_2= FALSE ) )
            {
            // InternalMSQLQueryParser.g:1279:3: ( (lv_value_0_1= TRUE | lv_value_0_2= FALSE ) )
            // InternalMSQLQueryParser.g:1280:4: (lv_value_0_1= TRUE | lv_value_0_2= FALSE )
            {
            // InternalMSQLQueryParser.g:1280:4: (lv_value_0_1= TRUE | lv_value_0_2= FALSE )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==TRUE) ) {
                alt16=1;
            }
            else if ( (LA16_0==FALSE) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMSQLQueryParser.g:1281:5: lv_value_0_1= TRUE
                    {
                    lv_value_0_1=(Token)match(input,TRUE,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBooleanLiteralAccess().getValueTRUEKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    					}
                    					setWithLastConsumed(current, "value", true, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:1292:5: lv_value_0_2= FALSE
                    {
                    lv_value_0_2=(Token)match(input,FALSE,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getBooleanLiteralAccess().getValueFALSEKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    					}
                    					setWithLastConsumed(current, "value", true, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "ruleOrOperator"
    // InternalMSQLQueryParser.g:1308:1: ruleOrOperator returns [Enumerator current=null] : (enumLiteral_0= OR ) ;
    public final Enumerator ruleOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMSQLQueryParser.g:1314:2: ( (enumLiteral_0= OR ) )
            // InternalMSQLQueryParser.g:1315:2: (enumLiteral_0= OR )
            {
            // InternalMSQLQueryParser.g:1315:2: (enumLiteral_0= OR )
            // InternalMSQLQueryParser.g:1316:3: enumLiteral_0= OR
            {
            enumLiteral_0=(Token)match(input,OR,FOLLOW_2); 

            			current = grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleOrOperator"


    // $ANTLR start "ruleAndOperator"
    // InternalMSQLQueryParser.g:1325:1: ruleAndOperator returns [Enumerator current=null] : (enumLiteral_0= AND ) ;
    public final Enumerator ruleAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMSQLQueryParser.g:1331:2: ( (enumLiteral_0= AND ) )
            // InternalMSQLQueryParser.g:1332:2: (enumLiteral_0= AND )
            {
            // InternalMSQLQueryParser.g:1332:2: (enumLiteral_0= AND )
            // InternalMSQLQueryParser.g:1333:3: enumLiteral_0= AND
            {
            enumLiteral_0=(Token)match(input,AND,FOLLOW_2); 

            			current = grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleAndOperator"


    // $ANTLR start "ruleNotOperator"
    // InternalMSQLQueryParser.g:1342:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= NOT ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMSQLQueryParser.g:1348:2: ( (enumLiteral_0= NOT ) )
            // InternalMSQLQueryParser.g:1349:2: (enumLiteral_0= NOT )
            {
            // InternalMSQLQueryParser.g:1349:2: (enumLiteral_0= NOT )
            // InternalMSQLQueryParser.g:1350:3: enumLiteral_0= NOT
            {
            enumLiteral_0=(Token)match(input,NOT,FOLLOW_2); 

            			current = grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleNotOperator"


    // $ANTLR start "ruleComparativeOperator"
    // InternalMSQLQueryParser.g:1359:1: ruleComparativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= LessThanSignEqualsSign ) | (enumLiteral_1= LessThanSign ) | (enumLiteral_2= EqualsSign ) | (enumLiteral_3= ExclamationMarkEqualsSign ) | (enumLiteral_4= GreaterThanSign ) | (enumLiteral_5= GreaterThanSignEqualsSign ) ) ;
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
            // InternalMSQLQueryParser.g:1365:2: ( ( (enumLiteral_0= LessThanSignEqualsSign ) | (enumLiteral_1= LessThanSign ) | (enumLiteral_2= EqualsSign ) | (enumLiteral_3= ExclamationMarkEqualsSign ) | (enumLiteral_4= GreaterThanSign ) | (enumLiteral_5= GreaterThanSignEqualsSign ) ) )
            // InternalMSQLQueryParser.g:1366:2: ( (enumLiteral_0= LessThanSignEqualsSign ) | (enumLiteral_1= LessThanSign ) | (enumLiteral_2= EqualsSign ) | (enumLiteral_3= ExclamationMarkEqualsSign ) | (enumLiteral_4= GreaterThanSign ) | (enumLiteral_5= GreaterThanSignEqualsSign ) )
            {
            // InternalMSQLQueryParser.g:1366:2: ( (enumLiteral_0= LessThanSignEqualsSign ) | (enumLiteral_1= LessThanSign ) | (enumLiteral_2= EqualsSign ) | (enumLiteral_3= ExclamationMarkEqualsSign ) | (enumLiteral_4= GreaterThanSign ) | (enumLiteral_5= GreaterThanSignEqualsSign ) )
            int alt17=6;
            switch ( input.LA(1) ) {
            case LessThanSignEqualsSign:
                {
                alt17=1;
                }
                break;
            case LessThanSign:
                {
                alt17=2;
                }
                break;
            case EqualsSign:
                {
                alt17=3;
                }
                break;
            case ExclamationMarkEqualsSign:
                {
                alt17=4;
                }
                break;
            case GreaterThanSign:
                {
                alt17=5;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMSQLQueryParser.g:1367:3: (enumLiteral_0= LessThanSignEqualsSign )
                    {
                    // InternalMSQLQueryParser.g:1367:3: (enumLiteral_0= LessThanSignEqualsSign )
                    // InternalMSQLQueryParser.g:1368:4: enumLiteral_0= LessThanSignEqualsSign
                    {
                    enumLiteral_0=(Token)match(input,LessThanSignEqualsSign,FOLLOW_2); 

                    				current = grammarAccess.getComparativeOperatorAccess().getLESS_THAN_OR_EQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparativeOperatorAccess().getLESS_THAN_OR_EQUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:1375:3: (enumLiteral_1= LessThanSign )
                    {
                    // InternalMSQLQueryParser.g:1375:3: (enumLiteral_1= LessThanSign )
                    // InternalMSQLQueryParser.g:1376:4: enumLiteral_1= LessThanSign
                    {
                    enumLiteral_1=(Token)match(input,LessThanSign,FOLLOW_2); 

                    				current = grammarAccess.getComparativeOperatorAccess().getLESS_THANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparativeOperatorAccess().getLESS_THANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMSQLQueryParser.g:1383:3: (enumLiteral_2= EqualsSign )
                    {
                    // InternalMSQLQueryParser.g:1383:3: (enumLiteral_2= EqualsSign )
                    // InternalMSQLQueryParser.g:1384:4: enumLiteral_2= EqualsSign
                    {
                    enumLiteral_2=(Token)match(input,EqualsSign,FOLLOW_2); 

                    				current = grammarAccess.getComparativeOperatorAccess().getEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparativeOperatorAccess().getEQUALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMSQLQueryParser.g:1391:3: (enumLiteral_3= ExclamationMarkEqualsSign )
                    {
                    // InternalMSQLQueryParser.g:1391:3: (enumLiteral_3= ExclamationMarkEqualsSign )
                    // InternalMSQLQueryParser.g:1392:4: enumLiteral_3= ExclamationMarkEqualsSign
                    {
                    enumLiteral_3=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_2); 

                    				current = grammarAccess.getComparativeOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getComparativeOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMSQLQueryParser.g:1399:3: (enumLiteral_4= GreaterThanSign )
                    {
                    // InternalMSQLQueryParser.g:1399:3: (enumLiteral_4= GreaterThanSign )
                    // InternalMSQLQueryParser.g:1400:4: enumLiteral_4= GreaterThanSign
                    {
                    enumLiteral_4=(Token)match(input,GreaterThanSign,FOLLOW_2); 

                    				current = grammarAccess.getComparativeOperatorAccess().getGREATER_THANEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getComparativeOperatorAccess().getGREATER_THANEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMSQLQueryParser.g:1407:3: (enumLiteral_5= GreaterThanSignEqualsSign )
                    {
                    // InternalMSQLQueryParser.g:1407:3: (enumLiteral_5= GreaterThanSignEqualsSign )
                    // InternalMSQLQueryParser.g:1408:4: enumLiteral_5= GreaterThanSignEqualsSign
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


    // $ANTLR start "ruleAdditiveOperator"
    // InternalMSQLQueryParser.g:1418:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= PlusSign ) | (enumLiteral_1= HyphenMinus ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMSQLQueryParser.g:1424:2: ( ( (enumLiteral_0= PlusSign ) | (enumLiteral_1= HyphenMinus ) ) )
            // InternalMSQLQueryParser.g:1425:2: ( (enumLiteral_0= PlusSign ) | (enumLiteral_1= HyphenMinus ) )
            {
            // InternalMSQLQueryParser.g:1425:2: ( (enumLiteral_0= PlusSign ) | (enumLiteral_1= HyphenMinus ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==PlusSign) ) {
                alt18=1;
            }
            else if ( (LA18_0==HyphenMinus) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMSQLQueryParser.g:1426:3: (enumLiteral_0= PlusSign )
                    {
                    // InternalMSQLQueryParser.g:1426:3: (enumLiteral_0= PlusSign )
                    // InternalMSQLQueryParser.g:1427:4: enumLiteral_0= PlusSign
                    {
                    enumLiteral_0=(Token)match(input,PlusSign,FOLLOW_2); 

                    				current = grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:1434:3: (enumLiteral_1= HyphenMinus )
                    {
                    // InternalMSQLQueryParser.g:1434:3: (enumLiteral_1= HyphenMinus )
                    // InternalMSQLQueryParser.g:1435:4: enumLiteral_1= HyphenMinus
                    {
                    enumLiteral_1=(Token)match(input,HyphenMinus,FOLLOW_2); 

                    				current = grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleAdditiveOperator"


    // $ANTLR start "ruleMultiplicativeOperator"
    // InternalMSQLQueryParser.g:1445:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= Asterisk ) | (enumLiteral_1= Solidus ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMSQLQueryParser.g:1451:2: ( ( (enumLiteral_0= Asterisk ) | (enumLiteral_1= Solidus ) ) )
            // InternalMSQLQueryParser.g:1452:2: ( (enumLiteral_0= Asterisk ) | (enumLiteral_1= Solidus ) )
            {
            // InternalMSQLQueryParser.g:1452:2: ( (enumLiteral_0= Asterisk ) | (enumLiteral_1= Solidus ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Asterisk) ) {
                alt19=1;
            }
            else if ( (LA19_0==Solidus) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMSQLQueryParser.g:1453:3: (enumLiteral_0= Asterisk )
                    {
                    // InternalMSQLQueryParser.g:1453:3: (enumLiteral_0= Asterisk )
                    // InternalMSQLQueryParser.g:1454:4: enumLiteral_0= Asterisk
                    {
                    enumLiteral_0=(Token)match(input,Asterisk,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:1461:3: (enumLiteral_1= Solidus )
                    {
                    // InternalMSQLQueryParser.g:1461:3: (enumLiteral_1= Solidus )
                    // InternalMSQLQueryParser.g:1462:4: enumLiteral_1= Solidus
                    {
                    enumLiteral_1=(Token)match(input,Solidus,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicativeOperatorAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDIVIDEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleMultiplicativeOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000040000C0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000001C0282420L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001102L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000003801C002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001400002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002200002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});

}