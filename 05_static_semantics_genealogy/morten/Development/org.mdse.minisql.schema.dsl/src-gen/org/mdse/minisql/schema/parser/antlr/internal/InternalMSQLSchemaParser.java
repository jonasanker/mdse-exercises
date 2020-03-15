package org.mdse.minisql.schema.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.mdse.minisql.schema.services.MSQLSchemaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMSQLSchemaParser extends AbstractInternalAntlrParser {
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

        public InternalMSQLSchemaParser(TokenStream input, MSQLSchemaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Table";
       	}

       	@Override
       	protected MSQLSchemaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTable"
    // InternalMSQLSchemaParser.g:57:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalMSQLSchemaParser.g:57:46: (iv_ruleTable= ruleTable EOF )
            // InternalMSQLSchemaParser.g:58:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalMSQLSchemaParser.g:64:1: ruleTable returns [EObject current=null] : (otherlv_0= TABLE ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftCurlyBracket ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= Comma ( (lv_columns_5_0= ruleColumn ) ) )* otherlv_6= RightCurlyBracket ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_columns_3_0 = null;

        EObject lv_columns_5_0 = null;



        	enterRule();

        try {
            // InternalMSQLSchemaParser.g:70:2: ( (otherlv_0= TABLE ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftCurlyBracket ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= Comma ( (lv_columns_5_0= ruleColumn ) ) )* otherlv_6= RightCurlyBracket ) )
            // InternalMSQLSchemaParser.g:71:2: (otherlv_0= TABLE ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftCurlyBracket ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= Comma ( (lv_columns_5_0= ruleColumn ) ) )* otherlv_6= RightCurlyBracket )
            {
            // InternalMSQLSchemaParser.g:71:2: (otherlv_0= TABLE ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftCurlyBracket ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= Comma ( (lv_columns_5_0= ruleColumn ) ) )* otherlv_6= RightCurlyBracket )
            // InternalMSQLSchemaParser.g:72:3: otherlv_0= TABLE ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftCurlyBracket ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= Comma ( (lv_columns_5_0= ruleColumn ) ) )* otherlv_6= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,TABLE,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTABLEKeyword_0());
            		
            // InternalMSQLSchemaParser.g:76:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMSQLSchemaParser.g:77:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMSQLSchemaParser.g:77:4: (lv_name_1_0= RULE_ID )
            // InternalMSQLSchemaParser.g:78:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMSQLSchemaParser.g:98:3: ( (lv_columns_3_0= ruleColumn ) )
            // InternalMSQLSchemaParser.g:99:4: (lv_columns_3_0= ruleColumn )
            {
            // InternalMSQLSchemaParser.g:99:4: (lv_columns_3_0= ruleColumn )
            // InternalMSQLSchemaParser.g:100:5: lv_columns_3_0= ruleColumn
            {

            					newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_columns_3_0=ruleColumn();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					add(
            						current,
            						"columns",
            						lv_columns_3_0,
            						"org.mdse.minisql.schema.MSQLSchema.Column");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSQLSchemaParser.g:117:3: (otherlv_4= Comma ( (lv_columns_5_0= ruleColumn ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Comma) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMSQLSchemaParser.g:118:4: otherlv_4= Comma ( (lv_columns_5_0= ruleColumn ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getTableAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMSQLSchemaParser.g:122:4: ( (lv_columns_5_0= ruleColumn ) )
            	    // InternalMSQLSchemaParser.g:123:5: (lv_columns_5_0= ruleColumn )
            	    {
            	    // InternalMSQLSchemaParser.g:123:5: (lv_columns_5_0= ruleColumn )
            	    // InternalMSQLSchemaParser.g:124:6: lv_columns_5_0= ruleColumn
            	    {

            	    						newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_columns_5_0=ruleColumn();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTableRule());
            	    						}
            	    						add(
            	    							current,
            	    							"columns",
            	    							lv_columns_5_0,
            	    							"org.mdse.minisql.schema.MSQLSchema.Column");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleColumn"
    // InternalMSQLSchemaParser.g:150:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalMSQLSchemaParser.g:150:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalMSQLSchemaParser.g:151:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalMSQLSchemaParser.g:157:1: ruleColumn returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMSQLSchemaParser.g:163:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMSQLSchemaParser.g:164:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMSQLSchemaParser.g:164:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMSQLSchemaParser.g:165:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMSQLSchemaParser.g:165:3: (lv_name_0_0= RULE_ID )
            // InternalMSQLSchemaParser.g:166:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getColumnRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleColumn"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000000A0L});

}