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
import org.mdse.minisql.query.services.QueryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQueryParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SELECT'", "';'", "','", "'*'", "'FROM'", "'ORDER'", "'BY'", "'ASC'", "'DESC'"
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

        public InternalQueryParser(TokenStream input, QueryGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SelectQuery";
       	}

       	@Override
       	protected QueryGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSelectQuery"
    // InternalQuery.g:64:1: entryRuleSelectQuery returns [EObject current=null] : iv_ruleSelectQuery= ruleSelectQuery EOF ;
    public final EObject entryRuleSelectQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectQuery = null;


        try {
            // InternalQuery.g:64:52: (iv_ruleSelectQuery= ruleSelectQuery EOF )
            // InternalQuery.g:65:2: iv_ruleSelectQuery= ruleSelectQuery EOF
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
    // InternalQuery.g:71:1: ruleSelectQuery returns [EObject current=null] : (otherlv_0= 'SELECT' ( (lv_whatClause_1_0= ruleWhatClause ) ) ( (lv_fromClause_2_0= ruleFromClause ) ) ( (lv_orderByClause_3_0= ruleOrderByClause ) ) otherlv_4= ';' ) ;
    public final EObject ruleSelectQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_whatClause_1_0 = null;

        EObject lv_fromClause_2_0 = null;

        EObject lv_orderByClause_3_0 = null;



        	enterRule();

        try {
            // InternalQuery.g:77:2: ( (otherlv_0= 'SELECT' ( (lv_whatClause_1_0= ruleWhatClause ) ) ( (lv_fromClause_2_0= ruleFromClause ) ) ( (lv_orderByClause_3_0= ruleOrderByClause ) ) otherlv_4= ';' ) )
            // InternalQuery.g:78:2: (otherlv_0= 'SELECT' ( (lv_whatClause_1_0= ruleWhatClause ) ) ( (lv_fromClause_2_0= ruleFromClause ) ) ( (lv_orderByClause_3_0= ruleOrderByClause ) ) otherlv_4= ';' )
            {
            // InternalQuery.g:78:2: (otherlv_0= 'SELECT' ( (lv_whatClause_1_0= ruleWhatClause ) ) ( (lv_fromClause_2_0= ruleFromClause ) ) ( (lv_orderByClause_3_0= ruleOrderByClause ) ) otherlv_4= ';' )
            // InternalQuery.g:79:3: otherlv_0= 'SELECT' ( (lv_whatClause_1_0= ruleWhatClause ) ) ( (lv_fromClause_2_0= ruleFromClause ) ) ( (lv_orderByClause_3_0= ruleOrderByClause ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectQueryAccess().getSELECTKeyword_0());
            		
            // InternalQuery.g:83:3: ( (lv_whatClause_1_0= ruleWhatClause ) )
            // InternalQuery.g:84:4: (lv_whatClause_1_0= ruleWhatClause )
            {
            // InternalQuery.g:84:4: (lv_whatClause_1_0= ruleWhatClause )
            // InternalQuery.g:85:5: lv_whatClause_1_0= ruleWhatClause
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
            						"org.mdse.minisql.query.Query.WhatClause");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQuery.g:102:3: ( (lv_fromClause_2_0= ruleFromClause ) )
            // InternalQuery.g:103:4: (lv_fromClause_2_0= ruleFromClause )
            {
            // InternalQuery.g:103:4: (lv_fromClause_2_0= ruleFromClause )
            // InternalQuery.g:104:5: lv_fromClause_2_0= ruleFromClause
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
            						"org.mdse.minisql.query.Query.FromClause");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQuery.g:121:3: ( (lv_orderByClause_3_0= ruleOrderByClause ) )
            // InternalQuery.g:122:4: (lv_orderByClause_3_0= ruleOrderByClause )
            {
            // InternalQuery.g:122:4: (lv_orderByClause_3_0= ruleOrderByClause )
            // InternalQuery.g:123:5: lv_orderByClause_3_0= ruleOrderByClause
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
            						"org.mdse.minisql.query.Query.OrderByClause");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

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
    // InternalQuery.g:148:1: entryRuleWhatClause returns [EObject current=null] : iv_ruleWhatClause= ruleWhatClause EOF ;
    public final EObject entryRuleWhatClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhatClause = null;


        try {
            // InternalQuery.g:148:51: (iv_ruleWhatClause= ruleWhatClause EOF )
            // InternalQuery.g:149:2: iv_ruleWhatClause= ruleWhatClause EOF
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
    // InternalQuery.g:155:1: ruleWhatClause returns [EObject current=null] : ( ( (lv_whatDirectives_0_0= ruleSingleColumnWhatDirective ) ) (otherlv_1= ',' ( (lv_whatDirectives_2_0= ruleWhatDirective ) ) )* ) ;
    public final EObject ruleWhatClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_whatDirectives_0_0 = null;

        EObject lv_whatDirectives_2_0 = null;



        	enterRule();

        try {
            // InternalQuery.g:161:2: ( ( ( (lv_whatDirectives_0_0= ruleSingleColumnWhatDirective ) ) (otherlv_1= ',' ( (lv_whatDirectives_2_0= ruleWhatDirective ) ) )* ) )
            // InternalQuery.g:162:2: ( ( (lv_whatDirectives_0_0= ruleSingleColumnWhatDirective ) ) (otherlv_1= ',' ( (lv_whatDirectives_2_0= ruleWhatDirective ) ) )* )
            {
            // InternalQuery.g:162:2: ( ( (lv_whatDirectives_0_0= ruleSingleColumnWhatDirective ) ) (otherlv_1= ',' ( (lv_whatDirectives_2_0= ruleWhatDirective ) ) )* )
            // InternalQuery.g:163:3: ( (lv_whatDirectives_0_0= ruleSingleColumnWhatDirective ) ) (otherlv_1= ',' ( (lv_whatDirectives_2_0= ruleWhatDirective ) ) )*
            {
            // InternalQuery.g:163:3: ( (lv_whatDirectives_0_0= ruleSingleColumnWhatDirective ) )
            // InternalQuery.g:164:4: (lv_whatDirectives_0_0= ruleSingleColumnWhatDirective )
            {
            // InternalQuery.g:164:4: (lv_whatDirectives_0_0= ruleSingleColumnWhatDirective )
            // InternalQuery.g:165:5: lv_whatDirectives_0_0= ruleSingleColumnWhatDirective
            {

            					newCompositeNode(grammarAccess.getWhatClauseAccess().getWhatDirectivesSingleColumnWhatDirectiveParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_whatDirectives_0_0=ruleSingleColumnWhatDirective();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhatClauseRule());
            					}
            					add(
            						current,
            						"whatDirectives",
            						lv_whatDirectives_0_0,
            						"org.mdse.minisql.query.Query.SingleColumnWhatDirective");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQuery.g:182:3: (otherlv_1= ',' ( (lv_whatDirectives_2_0= ruleWhatDirective ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalQuery.g:183:4: otherlv_1= ',' ( (lv_whatDirectives_2_0= ruleWhatDirective ) )
            	    {
            	    otherlv_1=(Token)match(input,13,FOLLOW_8); 

            	    				newLeafNode(otherlv_1, grammarAccess.getWhatClauseAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalQuery.g:187:4: ( (lv_whatDirectives_2_0= ruleWhatDirective ) )
            	    // InternalQuery.g:188:5: (lv_whatDirectives_2_0= ruleWhatDirective )
            	    {
            	    // InternalQuery.g:188:5: (lv_whatDirectives_2_0= ruleWhatDirective )
            	    // InternalQuery.g:189:6: lv_whatDirectives_2_0= ruleWhatDirective
            	    {

            	    						newCompositeNode(grammarAccess.getWhatClauseAccess().getWhatDirectivesWhatDirectiveParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_whatDirectives_2_0=ruleWhatDirective();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWhatClauseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"whatDirectives",
            	    							lv_whatDirectives_2_0,
            	    							"org.mdse.minisql.query.Query.WhatDirective");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // InternalQuery.g:211:1: entryRuleWhatDirective returns [EObject current=null] : iv_ruleWhatDirective= ruleWhatDirective EOF ;
    public final EObject entryRuleWhatDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhatDirective = null;


        try {
            // InternalQuery.g:211:54: (iv_ruleWhatDirective= ruleWhatDirective EOF )
            // InternalQuery.g:212:2: iv_ruleWhatDirective= ruleWhatDirective EOF
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
    // InternalQuery.g:218:1: ruleWhatDirective returns [EObject current=null] : (this_AllColumnsWhatDirective_0= ruleAllColumnsWhatDirective | this_SingleColumnWhatDirective_1= ruleSingleColumnWhatDirective ) ;
    public final EObject ruleWhatDirective() throws RecognitionException {
        EObject current = null;

        EObject this_AllColumnsWhatDirective_0 = null;

        EObject this_SingleColumnWhatDirective_1 = null;



        	enterRule();

        try {
            // InternalQuery.g:224:2: ( (this_AllColumnsWhatDirective_0= ruleAllColumnsWhatDirective | this_SingleColumnWhatDirective_1= ruleSingleColumnWhatDirective ) )
            // InternalQuery.g:225:2: (this_AllColumnsWhatDirective_0= ruleAllColumnsWhatDirective | this_SingleColumnWhatDirective_1= ruleSingleColumnWhatDirective )
            {
            // InternalQuery.g:225:2: (this_AllColumnsWhatDirective_0= ruleAllColumnsWhatDirective | this_SingleColumnWhatDirective_1= ruleSingleColumnWhatDirective )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalQuery.g:226:3: this_AllColumnsWhatDirective_0= ruleAllColumnsWhatDirective
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
                    // InternalQuery.g:235:3: this_SingleColumnWhatDirective_1= ruleSingleColumnWhatDirective
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
    // InternalQuery.g:247:1: entryRuleAllColumnsWhatDirective returns [EObject current=null] : iv_ruleAllColumnsWhatDirective= ruleAllColumnsWhatDirective EOF ;
    public final EObject entryRuleAllColumnsWhatDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllColumnsWhatDirective = null;


        try {
            // InternalQuery.g:247:64: (iv_ruleAllColumnsWhatDirective= ruleAllColumnsWhatDirective EOF )
            // InternalQuery.g:248:2: iv_ruleAllColumnsWhatDirective= ruleAllColumnsWhatDirective EOF
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
    // InternalQuery.g:254:1: ruleAllColumnsWhatDirective returns [EObject current=null] : (otherlv_0= '*' () ) ;
    public final EObject ruleAllColumnsWhatDirective() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalQuery.g:260:2: ( (otherlv_0= '*' () ) )
            // InternalQuery.g:261:2: (otherlv_0= '*' () )
            {
            // InternalQuery.g:261:2: (otherlv_0= '*' () )
            // InternalQuery.g:262:3: otherlv_0= '*' ()
            {
            otherlv_0=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getAllColumnsWhatDirectiveAccess().getAsteriskKeyword_0());
            		
            // InternalQuery.g:266:3: ()
            // InternalQuery.g:267:4: 
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
    // InternalQuery.g:277:1: entryRuleSingleColumnWhatDirective returns [EObject current=null] : iv_ruleSingleColumnWhatDirective= ruleSingleColumnWhatDirective EOF ;
    public final EObject entryRuleSingleColumnWhatDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleColumnWhatDirective = null;


        try {
            // InternalQuery.g:277:66: (iv_ruleSingleColumnWhatDirective= ruleSingleColumnWhatDirective EOF )
            // InternalQuery.g:278:2: iv_ruleSingleColumnWhatDirective= ruleSingleColumnWhatDirective EOF
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
    // InternalQuery.g:284:1: ruleSingleColumnWhatDirective returns [EObject current=null] : ( (lv_columnReference_0_0= ruleColumnReference ) ) ;
    public final EObject ruleSingleColumnWhatDirective() throws RecognitionException {
        EObject current = null;

        EObject lv_columnReference_0_0 = null;



        	enterRule();

        try {
            // InternalQuery.g:290:2: ( ( (lv_columnReference_0_0= ruleColumnReference ) ) )
            // InternalQuery.g:291:2: ( (lv_columnReference_0_0= ruleColumnReference ) )
            {
            // InternalQuery.g:291:2: ( (lv_columnReference_0_0= ruleColumnReference ) )
            // InternalQuery.g:292:3: (lv_columnReference_0_0= ruleColumnReference )
            {
            // InternalQuery.g:292:3: (lv_columnReference_0_0= ruleColumnReference )
            // InternalQuery.g:293:4: lv_columnReference_0_0= ruleColumnReference
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
            					"org.mdse.minisql.query.Query.ColumnReference");
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
    // InternalQuery.g:313:1: entryRuleFromClause returns [EObject current=null] : iv_ruleFromClause= ruleFromClause EOF ;
    public final EObject entryRuleFromClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClause = null;


        try {
            // InternalQuery.g:313:51: (iv_ruleFromClause= ruleFromClause EOF )
            // InternalQuery.g:314:2: iv_ruleFromClause= ruleFromClause EOF
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
    // InternalQuery.g:320:1: ruleFromClause returns [EObject current=null] : (otherlv_0= 'FROM' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleFromClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalQuery.g:326:2: ( (otherlv_0= 'FROM' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalQuery.g:327:2: (otherlv_0= 'FROM' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalQuery.g:327:2: (otherlv_0= 'FROM' ( (otherlv_1= RULE_ID ) ) )
            // InternalQuery.g:328:3: otherlv_0= 'FROM' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFromClauseAccess().getFROMKeyword_0());
            		
            // InternalQuery.g:332:3: ( (otherlv_1= RULE_ID ) )
            // InternalQuery.g:333:4: (otherlv_1= RULE_ID )
            {
            // InternalQuery.g:333:4: (otherlv_1= RULE_ID )
            // InternalQuery.g:334:5: otherlv_1= RULE_ID
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
    // InternalQuery.g:349:1: entryRuleOrderByClause returns [EObject current=null] : iv_ruleOrderByClause= ruleOrderByClause EOF ;
    public final EObject entryRuleOrderByClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderByClause = null;


        try {
            // InternalQuery.g:349:54: (iv_ruleOrderByClause= ruleOrderByClause EOF )
            // InternalQuery.g:350:2: iv_ruleOrderByClause= ruleOrderByClause EOF
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
    // InternalQuery.g:356:1: ruleOrderByClause returns [EObject current=null] : (otherlv_0= 'ORDER' otherlv_1= 'BY' ( (lv_orderByDirectives_2_0= ruleOrderByDirective ) ) (otherlv_3= ',' ( (lv_orderByDirectives_4_0= ruleOrderByDirective ) ) )* ) ;
    public final EObject ruleOrderByClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_orderByDirectives_2_0 = null;

        EObject lv_orderByDirectives_4_0 = null;



        	enterRule();

        try {
            // InternalQuery.g:362:2: ( (otherlv_0= 'ORDER' otherlv_1= 'BY' ( (lv_orderByDirectives_2_0= ruleOrderByDirective ) ) (otherlv_3= ',' ( (lv_orderByDirectives_4_0= ruleOrderByDirective ) ) )* ) )
            // InternalQuery.g:363:2: (otherlv_0= 'ORDER' otherlv_1= 'BY' ( (lv_orderByDirectives_2_0= ruleOrderByDirective ) ) (otherlv_3= ',' ( (lv_orderByDirectives_4_0= ruleOrderByDirective ) ) )* )
            {
            // InternalQuery.g:363:2: (otherlv_0= 'ORDER' otherlv_1= 'BY' ( (lv_orderByDirectives_2_0= ruleOrderByDirective ) ) (otherlv_3= ',' ( (lv_orderByDirectives_4_0= ruleOrderByDirective ) ) )* )
            // InternalQuery.g:364:3: otherlv_0= 'ORDER' otherlv_1= 'BY' ( (lv_orderByDirectives_2_0= ruleOrderByDirective ) ) (otherlv_3= ',' ( (lv_orderByDirectives_4_0= ruleOrderByDirective ) ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getOrderByClauseAccess().getORDERKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOrderByClauseAccess().getBYKeyword_1());
            		
            // InternalQuery.g:372:3: ( (lv_orderByDirectives_2_0= ruleOrderByDirective ) )
            // InternalQuery.g:373:4: (lv_orderByDirectives_2_0= ruleOrderByDirective )
            {
            // InternalQuery.g:373:4: (lv_orderByDirectives_2_0= ruleOrderByDirective )
            // InternalQuery.g:374:5: lv_orderByDirectives_2_0= ruleOrderByDirective
            {

            					newCompositeNode(grammarAccess.getOrderByClauseAccess().getOrderByDirectivesOrderByDirectiveParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_orderByDirectives_2_0=ruleOrderByDirective();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrderByClauseRule());
            					}
            					add(
            						current,
            						"orderByDirectives",
            						lv_orderByDirectives_2_0,
            						"org.mdse.minisql.query.Query.OrderByDirective");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQuery.g:391:3: (otherlv_3= ',' ( (lv_orderByDirectives_4_0= ruleOrderByDirective ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalQuery.g:392:4: otherlv_3= ',' ( (lv_orderByDirectives_4_0= ruleOrderByDirective ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getOrderByClauseAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalQuery.g:396:4: ( (lv_orderByDirectives_4_0= ruleOrderByDirective ) )
            	    // InternalQuery.g:397:5: (lv_orderByDirectives_4_0= ruleOrderByDirective )
            	    {
            	    // InternalQuery.g:397:5: (lv_orderByDirectives_4_0= ruleOrderByDirective )
            	    // InternalQuery.g:398:6: lv_orderByDirectives_4_0= ruleOrderByDirective
            	    {

            	    						newCompositeNode(grammarAccess.getOrderByClauseAccess().getOrderByDirectivesOrderByDirectiveParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_orderByDirectives_4_0=ruleOrderByDirective();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrderByClauseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"orderByDirectives",
            	    							lv_orderByDirectives_4_0,
            	    							"org.mdse.minisql.query.Query.OrderByDirective");
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
    // $ANTLR end "ruleOrderByClause"


    // $ANTLR start "entryRuleOrderByDirective"
    // InternalQuery.g:420:1: entryRuleOrderByDirective returns [EObject current=null] : iv_ruleOrderByDirective= ruleOrderByDirective EOF ;
    public final EObject entryRuleOrderByDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderByDirective = null;


        try {
            // InternalQuery.g:420:57: (iv_ruleOrderByDirective= ruleOrderByDirective EOF )
            // InternalQuery.g:421:2: iv_ruleOrderByDirective= ruleOrderByDirective EOF
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
    // InternalQuery.g:427:1: ruleOrderByDirective returns [EObject current=null] : ( ( (lv_columnReference_0_0= ruleColumnReference ) ) ( ( (lv_ascending_1_1= 'ASC' | lv_ascending_1_2= 'DESC' ) ) )? ) ;
    public final EObject ruleOrderByDirective() throws RecognitionException {
        EObject current = null;

        Token lv_ascending_1_1=null;
        Token lv_ascending_1_2=null;
        EObject lv_columnReference_0_0 = null;



        	enterRule();

        try {
            // InternalQuery.g:433:2: ( ( ( (lv_columnReference_0_0= ruleColumnReference ) ) ( ( (lv_ascending_1_1= 'ASC' | lv_ascending_1_2= 'DESC' ) ) )? ) )
            // InternalQuery.g:434:2: ( ( (lv_columnReference_0_0= ruleColumnReference ) ) ( ( (lv_ascending_1_1= 'ASC' | lv_ascending_1_2= 'DESC' ) ) )? )
            {
            // InternalQuery.g:434:2: ( ( (lv_columnReference_0_0= ruleColumnReference ) ) ( ( (lv_ascending_1_1= 'ASC' | lv_ascending_1_2= 'DESC' ) ) )? )
            // InternalQuery.g:435:3: ( (lv_columnReference_0_0= ruleColumnReference ) ) ( ( (lv_ascending_1_1= 'ASC' | lv_ascending_1_2= 'DESC' ) ) )?
            {
            // InternalQuery.g:435:3: ( (lv_columnReference_0_0= ruleColumnReference ) )
            // InternalQuery.g:436:4: (lv_columnReference_0_0= ruleColumnReference )
            {
            // InternalQuery.g:436:4: (lv_columnReference_0_0= ruleColumnReference )
            // InternalQuery.g:437:5: lv_columnReference_0_0= ruleColumnReference
            {

            					newCompositeNode(grammarAccess.getOrderByDirectiveAccess().getColumnReferenceColumnReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_columnReference_0_0=ruleColumnReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrderByDirectiveRule());
            					}
            					set(
            						current,
            						"columnReference",
            						lv_columnReference_0_0,
            						"org.mdse.minisql.query.Query.ColumnReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQuery.g:454:3: ( ( (lv_ascending_1_1= 'ASC' | lv_ascending_1_2= 'DESC' ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=18 && LA5_0<=19)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalQuery.g:455:4: ( (lv_ascending_1_1= 'ASC' | lv_ascending_1_2= 'DESC' ) )
                    {
                    // InternalQuery.g:455:4: ( (lv_ascending_1_1= 'ASC' | lv_ascending_1_2= 'DESC' ) )
                    // InternalQuery.g:456:5: (lv_ascending_1_1= 'ASC' | lv_ascending_1_2= 'DESC' )
                    {
                    // InternalQuery.g:456:5: (lv_ascending_1_1= 'ASC' | lv_ascending_1_2= 'DESC' )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==18) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==19) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalQuery.g:457:6: lv_ascending_1_1= 'ASC'
                            {
                            lv_ascending_1_1=(Token)match(input,18,FOLLOW_2); 

                            						newLeafNode(lv_ascending_1_1, grammarAccess.getOrderByDirectiveAccess().getAscendingASCKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOrderByDirectiveRule());
                            						}
                            						setWithLastConsumed(current, "ascending", true, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalQuery.g:468:6: lv_ascending_1_2= 'DESC'
                            {
                            lv_ascending_1_2=(Token)match(input,19,FOLLOW_2); 

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
    // InternalQuery.g:485:1: entryRuleColumnReference returns [EObject current=null] : iv_ruleColumnReference= ruleColumnReference EOF ;
    public final EObject entryRuleColumnReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnReference = null;


        try {
            // InternalQuery.g:485:56: (iv_ruleColumnReference= ruleColumnReference EOF )
            // InternalQuery.g:486:2: iv_ruleColumnReference= ruleColumnReference EOF
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
    // InternalQuery.g:492:1: ruleColumnReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleColumnReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalQuery.g:498:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalQuery.g:499:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalQuery.g:499:2: ( (otherlv_0= RULE_ID ) )
            // InternalQuery.g:500:3: (otherlv_0= RULE_ID )
            {
            // InternalQuery.g:500:3: (otherlv_0= RULE_ID )
            // InternalQuery.g:501:4: otherlv_0= RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0002L});

}