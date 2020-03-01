package org.mdse.minisql.query.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
    // InternalMSQLQueryParser.g:57:1: entryRuleSelectQuery returns [EObject current=null] : iv_ruleSelectQuery= ruleSelectQuery EOF ;
    public final EObject entryRuleSelectQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectQuery = null;


        try {
            // InternalMSQLQueryParser.g:57:52: (iv_ruleSelectQuery= ruleSelectQuery EOF )
            // InternalMSQLQueryParser.g:58:2: iv_ruleSelectQuery= ruleSelectQuery EOF
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
    // InternalMSQLQueryParser.g:64:1: ruleSelectQuery returns [EObject current=null] : (otherlv_0= SELECT ( (lv_whatClause_1_0= ruleWhatClause ) ) ( (lv_fromClause_2_0= ruleFromClause ) ) ( (lv_orderByClause_3_0= ruleOrderByClause ) )? otherlv_4= Semicolon ) ;
    public final EObject ruleSelectQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_whatClause_1_0 = null;

        EObject lv_fromClause_2_0 = null;

        EObject lv_orderByClause_3_0 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:70:2: ( (otherlv_0= SELECT ( (lv_whatClause_1_0= ruleWhatClause ) ) ( (lv_fromClause_2_0= ruleFromClause ) ) ( (lv_orderByClause_3_0= ruleOrderByClause ) )? otherlv_4= Semicolon ) )
            // InternalMSQLQueryParser.g:71:2: (otherlv_0= SELECT ( (lv_whatClause_1_0= ruleWhatClause ) ) ( (lv_fromClause_2_0= ruleFromClause ) ) ( (lv_orderByClause_3_0= ruleOrderByClause ) )? otherlv_4= Semicolon )
            {
            // InternalMSQLQueryParser.g:71:2: (otherlv_0= SELECT ( (lv_whatClause_1_0= ruleWhatClause ) ) ( (lv_fromClause_2_0= ruleFromClause ) ) ( (lv_orderByClause_3_0= ruleOrderByClause ) )? otherlv_4= Semicolon )
            // InternalMSQLQueryParser.g:72:3: otherlv_0= SELECT ( (lv_whatClause_1_0= ruleWhatClause ) ) ( (lv_fromClause_2_0= ruleFromClause ) ) ( (lv_orderByClause_3_0= ruleOrderByClause ) )? otherlv_4= Semicolon
            {
            otherlv_0=(Token)match(input,SELECT,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectQueryAccess().getSELECTKeyword_0());
            		
            // InternalMSQLQueryParser.g:76:3: ( (lv_whatClause_1_0= ruleWhatClause ) )
            // InternalMSQLQueryParser.g:77:4: (lv_whatClause_1_0= ruleWhatClause )
            {
            // InternalMSQLQueryParser.g:77:4: (lv_whatClause_1_0= ruleWhatClause )
            // InternalMSQLQueryParser.g:78:5: lv_whatClause_1_0= ruleWhatClause
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

            // InternalMSQLQueryParser.g:95:3: ( (lv_fromClause_2_0= ruleFromClause ) )
            // InternalMSQLQueryParser.g:96:4: (lv_fromClause_2_0= ruleFromClause )
            {
            // InternalMSQLQueryParser.g:96:4: (lv_fromClause_2_0= ruleFromClause )
            // InternalMSQLQueryParser.g:97:5: lv_fromClause_2_0= ruleFromClause
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

            // InternalMSQLQueryParser.g:114:3: ( (lv_orderByClause_3_0= ruleOrderByClause ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==ORDER) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMSQLQueryParser.g:115:4: (lv_orderByClause_3_0= ruleOrderByClause )
                    {
                    // InternalMSQLQueryParser.g:115:4: (lv_orderByClause_3_0= ruleOrderByClause )
                    // InternalMSQLQueryParser.g:116:5: lv_orderByClause_3_0= ruleOrderByClause
                    {

                    					newCompositeNode(grammarAccess.getSelectQueryAccess().getOrderByClauseOrderByClauseParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_orderByClause_3_0=ruleOrderByClause();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectQueryRule());
                    					}
                    					set(
                    						current,
                    						"orderByClause",
                    						lv_orderByClause_3_0,
                    						"org.mdse.minisql.query.MSQLQuery.OrderByClause");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,Semicolon,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSelectQueryAccess().getSemicolonKeyword_4());
            		

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
    // InternalMSQLQueryParser.g:141:1: entryRuleWhatClause returns [EObject current=null] : iv_ruleWhatClause= ruleWhatClause EOF ;
    public final EObject entryRuleWhatClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhatClause = null;


        try {
            // InternalMSQLQueryParser.g:141:51: (iv_ruleWhatClause= ruleWhatClause EOF )
            // InternalMSQLQueryParser.g:142:2: iv_ruleWhatClause= ruleWhatClause EOF
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
    // InternalMSQLQueryParser.g:148:1: ruleWhatClause returns [EObject current=null] : ( ( (lv_whatDirective_0_0= ruleWhatDirective ) ) (otherlv_1= Comma ( (lv_whatDirective_2_0= ruleWhatDirective ) ) )* ) ;
    public final EObject ruleWhatClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_whatDirective_0_0 = null;

        EObject lv_whatDirective_2_0 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:154:2: ( ( ( (lv_whatDirective_0_0= ruleWhatDirective ) ) (otherlv_1= Comma ( (lv_whatDirective_2_0= ruleWhatDirective ) ) )* ) )
            // InternalMSQLQueryParser.g:155:2: ( ( (lv_whatDirective_0_0= ruleWhatDirective ) ) (otherlv_1= Comma ( (lv_whatDirective_2_0= ruleWhatDirective ) ) )* )
            {
            // InternalMSQLQueryParser.g:155:2: ( ( (lv_whatDirective_0_0= ruleWhatDirective ) ) (otherlv_1= Comma ( (lv_whatDirective_2_0= ruleWhatDirective ) ) )* )
            // InternalMSQLQueryParser.g:156:3: ( (lv_whatDirective_0_0= ruleWhatDirective ) ) (otherlv_1= Comma ( (lv_whatDirective_2_0= ruleWhatDirective ) ) )*
            {
            // InternalMSQLQueryParser.g:156:3: ( (lv_whatDirective_0_0= ruleWhatDirective ) )
            // InternalMSQLQueryParser.g:157:4: (lv_whatDirective_0_0= ruleWhatDirective )
            {
            // InternalMSQLQueryParser.g:157:4: (lv_whatDirective_0_0= ruleWhatDirective )
            // InternalMSQLQueryParser.g:158:5: lv_whatDirective_0_0= ruleWhatDirective
            {

            					newCompositeNode(grammarAccess.getWhatClauseAccess().getWhatDirectiveWhatDirectiveParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalMSQLQueryParser.g:175:3: (otherlv_1= Comma ( (lv_whatDirective_2_0= ruleWhatDirective ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Comma) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:176:4: otherlv_1= Comma ( (lv_whatDirective_2_0= ruleWhatDirective ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getWhatClauseAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMSQLQueryParser.g:180:4: ( (lv_whatDirective_2_0= ruleWhatDirective ) )
            	    // InternalMSQLQueryParser.g:181:5: (lv_whatDirective_2_0= ruleWhatDirective )
            	    {
            	    // InternalMSQLQueryParser.g:181:5: (lv_whatDirective_2_0= ruleWhatDirective )
            	    // InternalMSQLQueryParser.g:182:6: lv_whatDirective_2_0= ruleWhatDirective
            	    {

            	    						newCompositeNode(grammarAccess.getWhatClauseAccess().getWhatDirectiveWhatDirectiveParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
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
            	    break loop2;
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
    // InternalMSQLQueryParser.g:204:1: entryRuleWhatDirective returns [EObject current=null] : iv_ruleWhatDirective= ruleWhatDirective EOF ;
    public final EObject entryRuleWhatDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhatDirective = null;


        try {
            // InternalMSQLQueryParser.g:204:54: (iv_ruleWhatDirective= ruleWhatDirective EOF )
            // InternalMSQLQueryParser.g:205:2: iv_ruleWhatDirective= ruleWhatDirective EOF
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
    // InternalMSQLQueryParser.g:211:1: ruleWhatDirective returns [EObject current=null] : (this_AllColumnsWhatDirective_0= ruleAllColumnsWhatDirective | this_SingleColumnWhatDirective_1= ruleSingleColumnWhatDirective ) ;
    public final EObject ruleWhatDirective() throws RecognitionException {
        EObject current = null;

        EObject this_AllColumnsWhatDirective_0 = null;

        EObject this_SingleColumnWhatDirective_1 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:217:2: ( (this_AllColumnsWhatDirective_0= ruleAllColumnsWhatDirective | this_SingleColumnWhatDirective_1= ruleSingleColumnWhatDirective ) )
            // InternalMSQLQueryParser.g:218:2: (this_AllColumnsWhatDirective_0= ruleAllColumnsWhatDirective | this_SingleColumnWhatDirective_1= ruleSingleColumnWhatDirective )
            {
            // InternalMSQLQueryParser.g:218:2: (this_AllColumnsWhatDirective_0= ruleAllColumnsWhatDirective | this_SingleColumnWhatDirective_1= ruleSingleColumnWhatDirective )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Asterisk) ) {
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
                    // InternalMSQLQueryParser.g:219:3: this_AllColumnsWhatDirective_0= ruleAllColumnsWhatDirective
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
                    // InternalMSQLQueryParser.g:228:3: this_SingleColumnWhatDirective_1= ruleSingleColumnWhatDirective
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
    // InternalMSQLQueryParser.g:240:1: entryRuleAllColumnsWhatDirective returns [EObject current=null] : iv_ruleAllColumnsWhatDirective= ruleAllColumnsWhatDirective EOF ;
    public final EObject entryRuleAllColumnsWhatDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllColumnsWhatDirective = null;


        try {
            // InternalMSQLQueryParser.g:240:64: (iv_ruleAllColumnsWhatDirective= ruleAllColumnsWhatDirective EOF )
            // InternalMSQLQueryParser.g:241:2: iv_ruleAllColumnsWhatDirective= ruleAllColumnsWhatDirective EOF
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
    // InternalMSQLQueryParser.g:247:1: ruleAllColumnsWhatDirective returns [EObject current=null] : (otherlv_0= Asterisk () ) ;
    public final EObject ruleAllColumnsWhatDirective() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMSQLQueryParser.g:253:2: ( (otherlv_0= Asterisk () ) )
            // InternalMSQLQueryParser.g:254:2: (otherlv_0= Asterisk () )
            {
            // InternalMSQLQueryParser.g:254:2: (otherlv_0= Asterisk () )
            // InternalMSQLQueryParser.g:255:3: otherlv_0= Asterisk ()
            {
            otherlv_0=(Token)match(input,Asterisk,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getAllColumnsWhatDirectiveAccess().getAsteriskKeyword_0());
            		
            // InternalMSQLQueryParser.g:259:3: ()
            // InternalMSQLQueryParser.g:260:4: 
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
    // InternalMSQLQueryParser.g:270:1: entryRuleSingleColumnWhatDirective returns [EObject current=null] : iv_ruleSingleColumnWhatDirective= ruleSingleColumnWhatDirective EOF ;
    public final EObject entryRuleSingleColumnWhatDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleColumnWhatDirective = null;


        try {
            // InternalMSQLQueryParser.g:270:66: (iv_ruleSingleColumnWhatDirective= ruleSingleColumnWhatDirective EOF )
            // InternalMSQLQueryParser.g:271:2: iv_ruleSingleColumnWhatDirective= ruleSingleColumnWhatDirective EOF
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
    // InternalMSQLQueryParser.g:277:1: ruleSingleColumnWhatDirective returns [EObject current=null] : ( (lv_columnReference_0_0= ruleColumnReference ) ) ;
    public final EObject ruleSingleColumnWhatDirective() throws RecognitionException {
        EObject current = null;

        EObject lv_columnReference_0_0 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:283:2: ( ( (lv_columnReference_0_0= ruleColumnReference ) ) )
            // InternalMSQLQueryParser.g:284:2: ( (lv_columnReference_0_0= ruleColumnReference ) )
            {
            // InternalMSQLQueryParser.g:284:2: ( (lv_columnReference_0_0= ruleColumnReference ) )
            // InternalMSQLQueryParser.g:285:3: (lv_columnReference_0_0= ruleColumnReference )
            {
            // InternalMSQLQueryParser.g:285:3: (lv_columnReference_0_0= ruleColumnReference )
            // InternalMSQLQueryParser.g:286:4: lv_columnReference_0_0= ruleColumnReference
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
    // InternalMSQLQueryParser.g:306:1: entryRuleFromClause returns [EObject current=null] : iv_ruleFromClause= ruleFromClause EOF ;
    public final EObject entryRuleFromClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClause = null;


        try {
            // InternalMSQLQueryParser.g:306:51: (iv_ruleFromClause= ruleFromClause EOF )
            // InternalMSQLQueryParser.g:307:2: iv_ruleFromClause= ruleFromClause EOF
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
    // InternalMSQLQueryParser.g:313:1: ruleFromClause returns [EObject current=null] : (otherlv_0= FROM ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleFromClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMSQLQueryParser.g:319:2: ( (otherlv_0= FROM ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMSQLQueryParser.g:320:2: (otherlv_0= FROM ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMSQLQueryParser.g:320:2: (otherlv_0= FROM ( (otherlv_1= RULE_ID ) ) )
            // InternalMSQLQueryParser.g:321:3: otherlv_0= FROM ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,FROM,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFromClauseAccess().getFROMKeyword_0());
            		
            // InternalMSQLQueryParser.g:325:3: ( (otherlv_1= RULE_ID ) )
            // InternalMSQLQueryParser.g:326:4: (otherlv_1= RULE_ID )
            {
            // InternalMSQLQueryParser.g:326:4: (otherlv_1= RULE_ID )
            // InternalMSQLQueryParser.g:327:5: otherlv_1= RULE_ID
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


    // $ANTLR start "entryRuleOrderByClause"
    // InternalMSQLQueryParser.g:342:1: entryRuleOrderByClause returns [EObject current=null] : iv_ruleOrderByClause= ruleOrderByClause EOF ;
    public final EObject entryRuleOrderByClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderByClause = null;


        try {
            // InternalMSQLQueryParser.g:342:54: (iv_ruleOrderByClause= ruleOrderByClause EOF )
            // InternalMSQLQueryParser.g:343:2: iv_ruleOrderByClause= ruleOrderByClause EOF
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
    // InternalMSQLQueryParser.g:349:1: ruleOrderByClause returns [EObject current=null] : (otherlv_0= ORDER otherlv_1= BY ( (lv_orderDirectives_2_0= ruleOrderByDirective ) ) (otherlv_3= Comma ( (lv_orderDirectives_4_0= ruleOrderByDirective ) ) )* ) ;
    public final EObject ruleOrderByClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_orderDirectives_2_0 = null;

        EObject lv_orderDirectives_4_0 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:355:2: ( (otherlv_0= ORDER otherlv_1= BY ( (lv_orderDirectives_2_0= ruleOrderByDirective ) ) (otherlv_3= Comma ( (lv_orderDirectives_4_0= ruleOrderByDirective ) ) )* ) )
            // InternalMSQLQueryParser.g:356:2: (otherlv_0= ORDER otherlv_1= BY ( (lv_orderDirectives_2_0= ruleOrderByDirective ) ) (otherlv_3= Comma ( (lv_orderDirectives_4_0= ruleOrderByDirective ) ) )* )
            {
            // InternalMSQLQueryParser.g:356:2: (otherlv_0= ORDER otherlv_1= BY ( (lv_orderDirectives_2_0= ruleOrderByDirective ) ) (otherlv_3= Comma ( (lv_orderDirectives_4_0= ruleOrderByDirective ) ) )* )
            // InternalMSQLQueryParser.g:357:3: otherlv_0= ORDER otherlv_1= BY ( (lv_orderDirectives_2_0= ruleOrderByDirective ) ) (otherlv_3= Comma ( (lv_orderDirectives_4_0= ruleOrderByDirective ) ) )*
            {
            otherlv_0=(Token)match(input,ORDER,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getOrderByClauseAccess().getORDERKeyword_0());
            		
            otherlv_1=(Token)match(input,BY,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOrderByClauseAccess().getBYKeyword_1());
            		
            // InternalMSQLQueryParser.g:365:3: ( (lv_orderDirectives_2_0= ruleOrderByDirective ) )
            // InternalMSQLQueryParser.g:366:4: (lv_orderDirectives_2_0= ruleOrderByDirective )
            {
            // InternalMSQLQueryParser.g:366:4: (lv_orderDirectives_2_0= ruleOrderByDirective )
            // InternalMSQLQueryParser.g:367:5: lv_orderDirectives_2_0= ruleOrderByDirective
            {

            					newCompositeNode(grammarAccess.getOrderByClauseAccess().getOrderDirectivesOrderByDirectiveParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalMSQLQueryParser.g:384:3: (otherlv_3= Comma ( (lv_orderDirectives_4_0= ruleOrderByDirective ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==Comma) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:385:4: otherlv_3= Comma ( (lv_orderDirectives_4_0= ruleOrderByDirective ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getOrderByClauseAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMSQLQueryParser.g:389:4: ( (lv_orderDirectives_4_0= ruleOrderByDirective ) )
            	    // InternalMSQLQueryParser.g:390:5: (lv_orderDirectives_4_0= ruleOrderByDirective )
            	    {
            	    // InternalMSQLQueryParser.g:390:5: (lv_orderDirectives_4_0= ruleOrderByDirective )
            	    // InternalMSQLQueryParser.g:391:6: lv_orderDirectives_4_0= ruleOrderByDirective
            	    {

            	    						newCompositeNode(grammarAccess.getOrderByClauseAccess().getOrderDirectivesOrderByDirectiveParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
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
            	    break loop4;
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
    // InternalMSQLQueryParser.g:413:1: entryRuleOrderByDirective returns [EObject current=null] : iv_ruleOrderByDirective= ruleOrderByDirective EOF ;
    public final EObject entryRuleOrderByDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderByDirective = null;


        try {
            // InternalMSQLQueryParser.g:413:57: (iv_ruleOrderByDirective= ruleOrderByDirective EOF )
            // InternalMSQLQueryParser.g:414:2: iv_ruleOrderByDirective= ruleOrderByDirective EOF
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
    // InternalMSQLQueryParser.g:420:1: ruleOrderByDirective returns [EObject current=null] : ( ( (lv_columnReference_0_0= ruleColumnReference ) ) ( ( (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC ) ) )? ) ;
    public final EObject ruleOrderByDirective() throws RecognitionException {
        EObject current = null;

        Token lv_ascending_1_1=null;
        Token lv_ascending_1_2=null;
        EObject lv_columnReference_0_0 = null;



        	enterRule();

        try {
            // InternalMSQLQueryParser.g:426:2: ( ( ( (lv_columnReference_0_0= ruleColumnReference ) ) ( ( (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC ) ) )? ) )
            // InternalMSQLQueryParser.g:427:2: ( ( (lv_columnReference_0_0= ruleColumnReference ) ) ( ( (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC ) ) )? )
            {
            // InternalMSQLQueryParser.g:427:2: ( ( (lv_columnReference_0_0= ruleColumnReference ) ) ( ( (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC ) ) )? )
            // InternalMSQLQueryParser.g:428:3: ( (lv_columnReference_0_0= ruleColumnReference ) ) ( ( (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC ) ) )?
            {
            // InternalMSQLQueryParser.g:428:3: ( (lv_columnReference_0_0= ruleColumnReference ) )
            // InternalMSQLQueryParser.g:429:4: (lv_columnReference_0_0= ruleColumnReference )
            {
            // InternalMSQLQueryParser.g:429:4: (lv_columnReference_0_0= ruleColumnReference )
            // InternalMSQLQueryParser.g:430:5: lv_columnReference_0_0= ruleColumnReference
            {

            					newCompositeNode(grammarAccess.getOrderByDirectiveAccess().getColumnReferenceColumnReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalMSQLQueryParser.g:447:3: ( ( (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==DESC||LA6_0==ASC) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMSQLQueryParser.g:448:4: ( (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC ) )
                    {
                    // InternalMSQLQueryParser.g:448:4: ( (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC ) )
                    // InternalMSQLQueryParser.g:449:5: (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC )
                    {
                    // InternalMSQLQueryParser.g:449:5: (lv_ascending_1_1= ASC | lv_ascending_1_2= DESC )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==ASC) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==DESC) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalMSQLQueryParser.g:450:6: lv_ascending_1_1= ASC
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
                            // InternalMSQLQueryParser.g:461:6: lv_ascending_1_2= DESC
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
    // InternalMSQLQueryParser.g:478:1: entryRuleColumnReference returns [EObject current=null] : iv_ruleColumnReference= ruleColumnReference EOF ;
    public final EObject entryRuleColumnReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnReference = null;


        try {
            // InternalMSQLQueryParser.g:478:56: (iv_ruleColumnReference= ruleColumnReference EOF )
            // InternalMSQLQueryParser.g:479:2: iv_ruleColumnReference= ruleColumnReference EOF
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
    // InternalMSQLQueryParser.g:485:1: ruleColumnReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleColumnReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMSQLQueryParser.g:491:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMSQLQueryParser.g:492:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMSQLQueryParser.g:492:2: ( (otherlv_0= RULE_ID ) )
            // InternalMSQLQueryParser.g:493:3: (otherlv_0= RULE_ID )
            {
            // InternalMSQLQueryParser.g:493:3: (otherlv_0= RULE_ID )
            // InternalMSQLQueryParser.g:494:4: otherlv_0= RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002400L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000142L});

}