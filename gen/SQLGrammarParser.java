// Generated from C:/Users/Lenovo/Documents/GitHub/compiler-project/src/SQLGrammarParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SQLGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, GROUP=4, BY=5, HAVING=6, ORDER=7, ASC=8, DESC=9, 
		UNION=10, DISTINCT=11, TOP=12, INSERT=13, DELETE=14, UPDATE=15, SET=16, 
		VALUES=17, INTO=18, JOIN=19, INNER=20, LEFT=21, RIGHT=22, FULL=23, OUTER=24, 
		CROSS=25, ON=26, AND=27, OR=28, NOT=29, NULL=30, TRUE=31, FALSE=32, IS=33, 
		IN=34, LIKE=35, BETWEEN=36, EXISTS=37, CREATE=38, ALTER=39, DROP=40, TABLE=41, 
		VIEW=42, INDEX=43, CONSTRAINT=44, PRIMARY=45, FOREIGN=46, KEY=47, DATABASE=48, 
		USE=49, UNIQUE=50, AUTO_INCREMENT=51, TIMESTAMP=52, DEFAULT=53, CURRENT_TIMESTAMP=54, 
		REFERENCES=55, COUNT=56, SUM=57, AVG=58, MIN=59, MAX=60, QUOTENAME=61, 
		OBJECT_NAME=62, TRIM=63, UPPER=64, LOWER=65, SUBSTRING=66, REPLACE=67, 
		REPLICATE=68, REVERSE=69, RTRIM=70, LTRIM=71, NCHAR=72, DATEADD=73, DAY=74, 
		GETDATE=75, ISDATE=76, MONTH=77, YEAR=78, CAST=79, ISNULL=80, ISNUMERIC=81, 
		NEWID=82, NULLIF=83, PARSENAME=84, DECLARE=85, AS=86, GO=87, BEGIN=88, 
		END=89, IF=90, ELSE=91, WHILE=92, CASE=93, WHEN=94, THEN=95, TRY=96, CATCH=97, 
		ADD=98, EXEC=99, PRINT=100, START=101, TRANSACTION=102, COMMIT=103, ROLLBACK=104, 
		SAVEPOINT=105, RELEASE=106, WORK=107, RANK=108, ROW_NUMBER=109, DENSE_RANK=110, 
		OVER=111, PARTITION=112, WITH=113, RECURSIVE=114, LIMIT=115, OFFSET=116, 
		FETCH=117, NEXT=118, ROWS=119, ONLY=120, VARCHAR=121, NVARCHAR=122, INT=123, 
		INTEGER=124, CHAR=125, TEXT=126, DATE=127, DATETIME=128, DECIMAL=129, 
		MONEY=130, BIT=131, CURSOR=132, LOCAL=133, GLOBAL=134, FORWARD_ONLY=135, 
		SCROLL=136, STATIC=137, KEYSET=138, DYNAMIC=139, FAST_FORWARD=140, READ_ONLY=141, 
		SCROLL_LOCKS=142, OPTIMISTIC=143, TYPE_WARNING=144, FOR=145, OF=146, OPEN=147, 
		PRIOR=148, FIRST=149, LAST=150, ABSOLUTE=151, RELATIVE=152, CLOSE=153, 
		DEALLOCATE=154, ALL=155, ROLLUP=156, CUBE=157, GROUPING=158, SETS=159, 
		LINE_COMMENT=160, BLOCK_COMMENT=161, STRING=162, HEX_STRING=163, BIT_STRING=164, 
		NUMBER=165, EQUAL=166, NOT_EQUAL=167, LESS=168, GREATER=169, LESS_EQUAL=170, 
		GREATER_EQUAL=171, PLUS=172, MINUS=173, STAR=174, DIV=175, MOD=176, COMMA=177, 
		SEMICOLON=178, LPAREN=179, RPAREN=180, DOT=181, COLON=182, BRACKET_OPEN=183, 
		BRACKET_CLOSE=184, DELIMITED_IDENTIFIER_BRACKET=185, DELIMITED_IDENTIFIER_QUOTE=186, 
		USER_VARIABLE=187, IDENTIFIER=188, WS=189;
	public static final int
		RULE_sql_script = 0, RULE_statement = 1, RULE_dml_statement = 2, RULE_select_statement = 3, 
		RULE_select_list = 4, RULE_select_element = 5, RULE_insert_statement = 6, 
		RULE_update_statement = 7, RULE_delete_statement = 8, RULE_cursor_statement = 9, 
		RULE_declare_cursor = 10, RULE_open_cursor = 11, RULE_fetch_statement = 12, 
		RULE_fetch_direction = 13, RULE_close_cursor = 14, RULE_deallocate_cursor = 15, 
		RULE_print_statement = 16, RULE_with_clause = 17, RULE_common_table_expression = 18, 
		RULE_expression = 19, RULE_when_clause = 20, RULE_primary_expression = 21, 
		RULE_table_source = 22, RULE_join_clause = 23, RULE_group_by_clause = 24, 
		RULE_group_by_item = 25, RULE_grouping_set_list = 26, RULE_grouping_set = 27, 
		RULE_order_by_clause = 28, RULE_order_by_expression = 29, RULE_function_call = 30, 
		RULE_scalar_subquery = 31, RULE_having_clause = 32, RULE_where_clause = 33, 
		RULE_assignment = 34, RULE_expression_list = 35, RULE_column_list = 36, 
		RULE_identifier_ref = 37, RULE_constant = 38, RULE_table_name = 39, RULE_column_name = 40, 
		RULE_table_alias = 41, RULE_cursor_name = 42, RULE_cursor_variable_name = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"sql_script", "statement", "dml_statement", "select_statement", "select_list", 
			"select_element", "insert_statement", "update_statement", "delete_statement", 
			"cursor_statement", "declare_cursor", "open_cursor", "fetch_statement", 
			"fetch_direction", "close_cursor", "deallocate_cursor", "print_statement", 
			"with_clause", "common_table_expression", "expression", "when_clause", 
			"primary_expression", "table_source", "join_clause", "group_by_clause", 
			"group_by_item", "grouping_set_list", "grouping_set", "order_by_clause", 
			"order_by_expression", "function_call", "scalar_subquery", "having_clause", 
			"where_clause", "assignment", "expression_list", "column_list", "identifier_ref", 
			"constant", "table_name", "column_name", "table_alias", "cursor_name", 
			"cursor_variable_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'='", null, 
			"'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "','", 
			"';'", "'('", "')'", "'.'", "':'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "WHERE", "GROUP", "BY", "HAVING", "ORDER", "ASC", 
			"DESC", "UNION", "DISTINCT", "TOP", "INSERT", "DELETE", "UPDATE", "SET", 
			"VALUES", "INTO", "JOIN", "INNER", "LEFT", "RIGHT", "FULL", "OUTER", 
			"CROSS", "ON", "AND", "OR", "NOT", "NULL", "TRUE", "FALSE", "IS", "IN", 
			"LIKE", "BETWEEN", "EXISTS", "CREATE", "ALTER", "DROP", "TABLE", "VIEW", 
			"INDEX", "CONSTRAINT", "PRIMARY", "FOREIGN", "KEY", "DATABASE", "USE", 
			"UNIQUE", "AUTO_INCREMENT", "TIMESTAMP", "DEFAULT", "CURRENT_TIMESTAMP", 
			"REFERENCES", "COUNT", "SUM", "AVG", "MIN", "MAX", "QUOTENAME", "OBJECT_NAME", 
			"TRIM", "UPPER", "LOWER", "SUBSTRING", "REPLACE", "REPLICATE", "REVERSE", 
			"RTRIM", "LTRIM", "NCHAR", "DATEADD", "DAY", "GETDATE", "ISDATE", "MONTH", 
			"YEAR", "CAST", "ISNULL", "ISNUMERIC", "NEWID", "NULLIF", "PARSENAME", 
			"DECLARE", "AS", "GO", "BEGIN", "END", "IF", "ELSE", "WHILE", "CASE", 
			"WHEN", "THEN", "TRY", "CATCH", "ADD", "EXEC", "PRINT", "START", "TRANSACTION", 
			"COMMIT", "ROLLBACK", "SAVEPOINT", "RELEASE", "WORK", "RANK", "ROW_NUMBER", 
			"DENSE_RANK", "OVER", "PARTITION", "WITH", "RECURSIVE", "LIMIT", "OFFSET", 
			"FETCH", "NEXT", "ROWS", "ONLY", "VARCHAR", "NVARCHAR", "INT", "INTEGER", 
			"CHAR", "TEXT", "DATE", "DATETIME", "DECIMAL", "MONEY", "BIT", "CURSOR", 
			"LOCAL", "GLOBAL", "FORWARD_ONLY", "SCROLL", "STATIC", "KEYSET", "DYNAMIC", 
			"FAST_FORWARD", "READ_ONLY", "SCROLL_LOCKS", "OPTIMISTIC", "TYPE_WARNING", 
			"FOR", "OF", "OPEN", "PRIOR", "FIRST", "LAST", "ABSOLUTE", "RELATIVE", 
			"CLOSE", "DEALLOCATE", "ALL", "ROLLUP", "CUBE", "GROUPING", "SETS", "LINE_COMMENT", 
			"BLOCK_COMMENT", "STRING", "HEX_STRING", "BIT_STRING", "NUMBER", "EQUAL", 
			"NOT_EQUAL", "LESS", "GREATER", "LESS_EQUAL", "GREATER_EQUAL", "PLUS", 
			"MINUS", "STAR", "DIV", "MOD", "COMMA", "SEMICOLON", "LPAREN", "RPAREN", 
			"DOT", "COLON", "BRACKET_OPEN", "BRACKET_CLOSE", "DELIMITED_IDENTIFIER_BRACKET", 
			"DELIMITED_IDENTIFIER_QUOTE", "USER_VARIABLE", "IDENTIFIER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SQLGrammarParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sql_scriptContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLGrammarParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> GO() { return getTokens(SQLGrammarParser.GO); }
		public TerminalNode GO(int i) {
			return getToken(SQLGrammarParser.GO, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SQLGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SQLGrammarParser.SEMICOLON, i);
		}
		public Sql_scriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterSql_script(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitSql_script(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitSql_script(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_scriptContext sql_script() throws RecognitionException {
		Sql_scriptContext _localctx = new Sql_scriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sql_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 57346L) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 4611686022990823429L) != 0) || _la==CLOSE || _la==DEALLOCATE) {
				{
				setState(93);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
				case INSERT:
				case DELETE:
				case UPDATE:
				case DECLARE:
				case PRINT:
				case WITH:
				case FETCH:
				case OPEN:
				case CLOSE:
				case DEALLOCATE:
					{
					setState(88);
					statement();
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(89);
						match(SEMICOLON);
						}
					}

					}
					break;
				case GO:
					{
					setState(92);
					match(GO);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Dml_statementContext dml_statement() {
			return getRuleContext(Dml_statementContext.class,0);
		}
		public Cursor_statementContext cursor_statement() {
			return getRuleContext(Cursor_statementContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public Close_cursorContext close_cursor() {
			return getRuleContext(Close_cursorContext.class,0);
		}
		public Deallocate_cursorContext deallocate_cursor() {
			return getRuleContext(Deallocate_cursorContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case DELETE:
			case UPDATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				dml_statement();
				}
				break;
			case DECLARE:
			case FETCH:
			case OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				cursor_statement();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				with_clause();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				print_statement();
				}
				break;
			case CLOSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				close_cursor();
				}
				break;
			case DEALLOCATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(105);
				deallocate_cursor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dml_statementContext extends ParserRuleContext {
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Insert_statementContext insert_statement() {
			return getRuleContext(Insert_statementContext.class,0);
		}
		public Update_statementContext update_statement() {
			return getRuleContext(Update_statementContext.class,0);
		}
		public Delete_statementContext delete_statement() {
			return getRuleContext(Delete_statementContext.class,0);
		}
		public Dml_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dml_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterDml_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitDml_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitDml_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dml_statementContext dml_statement() throws RecognitionException {
		Dml_statementContext _localctx = new Dml_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dml_statement);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				select_statement();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				insert_statement();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				update_statement();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				delete_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_statementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SQLGrammarParser.SELECT, 0); }
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode TOP() { return getToken(SQLGrammarParser.TOP, 0); }
		public TerminalNode NUMBER() { return getToken(SQLGrammarParser.NUMBER, 0); }
		public TerminalNode FROM() { return getToken(SQLGrammarParser.FROM, 0); }
		public Table_sourceContext table_source() {
			return getRuleContext(Table_sourceContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Group_by_clauseContext group_by_clause() {
			return getRuleContext(Group_by_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(SQLGrammarParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SQLGrammarParser.ALL, 0); }
		public List<Join_clauseContext> join_clause() {
			return getRuleContexts(Join_clauseContext.class);
		}
		public Join_clauseContext join_clause(int i) {
			return getRuleContext(Join_clauseContext.class,i);
		}
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterSelect_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitSelect_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitSelect_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(SELECT);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(115);
				_la = _input.LA(1);
				if ( !(_la==DISTINCT || _la==ALL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOP) {
				{
				setState(118);
				match(TOP);
				setState(119);
				match(NUMBER);
				}
			}

			setState(122);
			select_list();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(123);
				match(FROM);
				setState(124);
				table_source();
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 41418752L) != 0)) {
					{
					{
					setState(125);
					join_clause();
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(133);
				where_clause();
				}
			}

			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(136);
				group_by_clause();
				}
			}

			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(139);
				having_clause();
				}
			}

			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(142);
				order_by_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_listContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SQLGrammarParser.STAR, 0); }
		public List<Select_elementContext> select_element() {
			return getRuleContexts(Select_elementContext.class);
		}
		public Select_elementContext select_element(int i) {
			return getRuleContext(Select_elementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLGrammarParser.COMMA, i);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLGrammarParser.AS, 0); }
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitSelect_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitSelect_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_select_list);
		int _la;
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				select_element();
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(147);
					match(COMMA);
					setState(148);
					select_element();
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				function_call();
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==DELIMITED_IDENTIFIER_BRACKET || _la==IDENTIFIER) {
					{
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(155);
						match(AS);
						}
					}

					setState(158);
					column_name();
					}
				}

				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(161);
					match(COMMA);
					setState(162);
					select_element();
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_elementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLGrammarParser.AS, 0); }
		public TerminalNode EQUAL() { return getToken(SQLGrammarParser.EQUAL, 0); }
		public Select_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterSelect_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitSelect_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitSelect_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_elementContext select_element() throws RecognitionException {
		Select_elementContext _localctx = new Select_elementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_select_element);
		int _la;
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				expression(0);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==DELIMITED_IDENTIFIER_BRACKET || _la==IDENTIFIER) {
					{
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(171);
						match(AS);
						}
					}

					setState(174);
					column_name();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				column_name();
				setState(178);
				match(EQUAL);
				setState(179);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Insert_statementContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(SQLGrammarParser.INSERT, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(SQLGrammarParser.VALUES, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(SQLGrammarParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(SQLGrammarParser.LPAREN, i);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(SQLGrammarParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(SQLGrammarParser.RPAREN, i);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SQLGrammarParser.INTO, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public Insert_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterInsert_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitInsert_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitInsert_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_statementContext insert_statement() throws RecognitionException {
		Insert_statementContext _localctx = new Insert_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_insert_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(INSERT);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(184);
				match(INTO);
				}
			}

			setState(187);
			table_name();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(188);
				match(LPAREN);
				setState(189);
				column_list();
				setState(190);
				match(RPAREN);
				}
			}

			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES:
				{
				setState(194);
				match(VALUES);
				setState(195);
				match(LPAREN);
				setState(196);
				expression_list();
				setState(197);
				match(RPAREN);
				}
				break;
			case SELECT:
				{
				setState(199);
				select_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Update_statementContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(SQLGrammarParser.UPDATE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode SET() { return getToken(SQLGrammarParser.SET, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLGrammarParser.COMMA, i);
		}
		public TerminalNode FROM() { return getToken(SQLGrammarParser.FROM, 0); }
		public Table_sourceContext table_source() {
			return getRuleContext(Table_sourceContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public List<Join_clauseContext> join_clause() {
			return getRuleContexts(Join_clauseContext.class);
		}
		public Join_clauseContext join_clause(int i) {
			return getRuleContext(Join_clauseContext.class,i);
		}
		public Update_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterUpdate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitUpdate_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitUpdate_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_statementContext update_statement() throws RecognitionException {
		Update_statementContext _localctx = new Update_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_update_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(UPDATE);
			setState(203);
			table_name();
			setState(204);
			match(SET);
			setState(205);
			assignment();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(206);
				match(COMMA);
				setState(207);
				assignment();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(213);
				match(FROM);
				setState(214);
				table_source();
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 41418752L) != 0)) {
					{
					{
					setState(215);
					join_clause();
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(223);
				where_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Delete_statementContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SQLGrammarParser.DELETE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SQLGrammarParser.FROM, 0); }
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Delete_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterDelete_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitDelete_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitDelete_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_statementContext delete_statement() throws RecognitionException {
		Delete_statementContext _localctx = new Delete_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_delete_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(DELETE);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(227);
				match(FROM);
				}
			}

			setState(230);
			table_name();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(231);
				where_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cursor_statementContext extends ParserRuleContext {
		public Declare_cursorContext declare_cursor() {
			return getRuleContext(Declare_cursorContext.class,0);
		}
		public Open_cursorContext open_cursor() {
			return getRuleContext(Open_cursorContext.class,0);
		}
		public Fetch_statementContext fetch_statement() {
			return getRuleContext(Fetch_statementContext.class,0);
		}
		public Cursor_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterCursor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitCursor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitCursor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_statementContext cursor_statement() throws RecognitionException {
		Cursor_statementContext _localctx = new Cursor_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cursor_statement);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				declare_cursor();
				}
				break;
			case OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				open_cursor();
				}
				break;
			case FETCH:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				fetch_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declare_cursorContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(SQLGrammarParser.DECLARE, 0); }
		public Cursor_nameContext cursor_name() {
			return getRuleContext(Cursor_nameContext.class,0);
		}
		public TerminalNode CURSOR() { return getToken(SQLGrammarParser.CURSOR, 0); }
		public List<TerminalNode> FOR() { return getTokens(SQLGrammarParser.FOR); }
		public TerminalNode FOR(int i) {
			return getToken(SQLGrammarParser.FOR, i);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode TYPE_WARNING() { return getToken(SQLGrammarParser.TYPE_WARNING, 0); }
		public TerminalNode UPDATE() { return getToken(SQLGrammarParser.UPDATE, 0); }
		public TerminalNode LOCAL() { return getToken(SQLGrammarParser.LOCAL, 0); }
		public TerminalNode GLOBAL() { return getToken(SQLGrammarParser.GLOBAL, 0); }
		public TerminalNode FORWARD_ONLY() { return getToken(SQLGrammarParser.FORWARD_ONLY, 0); }
		public TerminalNode SCROLL() { return getToken(SQLGrammarParser.SCROLL, 0); }
		public TerminalNode STATIC() { return getToken(SQLGrammarParser.STATIC, 0); }
		public TerminalNode KEYSET() { return getToken(SQLGrammarParser.KEYSET, 0); }
		public TerminalNode DYNAMIC() { return getToken(SQLGrammarParser.DYNAMIC, 0); }
		public TerminalNode FAST_FORWARD() { return getToken(SQLGrammarParser.FAST_FORWARD, 0); }
		public TerminalNode READ_ONLY() { return getToken(SQLGrammarParser.READ_ONLY, 0); }
		public TerminalNode SCROLL_LOCKS() { return getToken(SQLGrammarParser.SCROLL_LOCKS, 0); }
		public TerminalNode OPTIMISTIC() { return getToken(SQLGrammarParser.OPTIMISTIC, 0); }
		public TerminalNode OF() { return getToken(SQLGrammarParser.OF, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLGrammarParser.COMMA, i);
		}
		public Declare_cursorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_cursor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterDeclare_cursor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitDeclare_cursor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitDeclare_cursor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_cursorContext declare_cursor() throws RecognitionException {
		Declare_cursorContext _localctx = new Declare_cursorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declare_cursor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(DECLARE);
			setState(240);
			cursor_name();
			setState(241);
			match(CURSOR);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL || _la==GLOBAL) {
				{
				setState(242);
				_la = _input.LA(1);
				if ( !(_la==LOCAL || _la==GLOBAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORWARD_ONLY || _la==SCROLL) {
				{
				setState(245);
				_la = _input.LA(1);
				if ( !(_la==FORWARD_ONLY || _la==SCROLL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 15L) != 0)) {
				{
				setState(248);
				_la = _input.LA(1);
				if ( !(((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 15L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & 7L) != 0)) {
				{
				setState(251);
				_la = _input.LA(1);
				if ( !(((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE_WARNING) {
				{
				setState(254);
				match(TYPE_WARNING);
				}
			}

			setState(257);
			match(FOR);
			setState(258);
			select_statement();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(259);
				match(FOR);
				setState(260);
				match(UPDATE);
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OF) {
					{
					setState(261);
					match(OF);
					setState(262);
					column_name();
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(263);
						match(COMMA);
						setState(264);
						column_name();
						}
						}
						setState(269);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Open_cursorContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(SQLGrammarParser.OPEN, 0); }
		public Cursor_nameContext cursor_name() {
			return getRuleContext(Cursor_nameContext.class,0);
		}
		public Cursor_variable_nameContext cursor_variable_name() {
			return getRuleContext(Cursor_variable_nameContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(SQLGrammarParser.GLOBAL, 0); }
		public Open_cursorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_cursor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterOpen_cursor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitOpen_cursor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitOpen_cursor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Open_cursorContext open_cursor() throws RecognitionException {
		Open_cursorContext _localctx = new Open_cursorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_open_cursor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(OPEN);
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL:
			case IDENTIFIER:
				{
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(275);
					match(GLOBAL);
					}
				}

				setState(278);
				cursor_name();
				}
				break;
			case USER_VARIABLE:
				{
				setState(279);
				cursor_variable_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fetch_statementContext extends ParserRuleContext {
		public TerminalNode FETCH() { return getToken(SQLGrammarParser.FETCH, 0); }
		public Cursor_nameContext cursor_name() {
			return getRuleContext(Cursor_nameContext.class,0);
		}
		public List<TerminalNode> USER_VARIABLE() { return getTokens(SQLGrammarParser.USER_VARIABLE); }
		public TerminalNode USER_VARIABLE(int i) {
			return getToken(SQLGrammarParser.USER_VARIABLE, i);
		}
		public Fetch_directionContext fetch_direction() {
			return getRuleContext(Fetch_directionContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SQLGrammarParser.FROM, 0); }
		public TerminalNode INTO() { return getToken(SQLGrammarParser.INTO, 0); }
		public TerminalNode GLOBAL() { return getToken(SQLGrammarParser.GLOBAL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLGrammarParser.COMMA, i);
		}
		public Fetch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterFetch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitFetch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitFetch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fetch_statementContext fetch_statement() throws RecognitionException {
		Fetch_statementContext _localctx = new Fetch_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fetch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(FETCH);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & 33285996545L) != 0)) {
				{
				setState(283);
				fetch_direction();
				setState(284);
				match(FROM);
				}
			}

			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL:
			case IDENTIFIER:
				{
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(288);
					match(GLOBAL);
					}
				}

				setState(291);
				cursor_name();
				}
				break;
			case USER_VARIABLE:
				{
				setState(292);
				match(USER_VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(295);
				match(INTO);
				setState(296);
				match(USER_VARIABLE);
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(297);
					match(COMMA);
					setState(298);
					match(USER_VARIABLE);
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fetch_directionContext extends ParserRuleContext {
		public TerminalNode NEXT() { return getToken(SQLGrammarParser.NEXT, 0); }
		public TerminalNode PRIOR() { return getToken(SQLGrammarParser.PRIOR, 0); }
		public TerminalNode FIRST() { return getToken(SQLGrammarParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(SQLGrammarParser.LAST, 0); }
		public TerminalNode ABSOLUTE() { return getToken(SQLGrammarParser.ABSOLUTE, 0); }
		public TerminalNode NUMBER() { return getToken(SQLGrammarParser.NUMBER, 0); }
		public TerminalNode USER_VARIABLE() { return getToken(SQLGrammarParser.USER_VARIABLE, 0); }
		public TerminalNode RELATIVE() { return getToken(SQLGrammarParser.RELATIVE, 0); }
		public Fetch_directionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch_direction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterFetch_direction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitFetch_direction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitFetch_direction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fetch_directionContext fetch_direction() throws RecognitionException {
		Fetch_directionContext _localctx = new Fetch_directionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fetch_direction);
		int _la;
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				match(NEXT);
				}
				break;
			case PRIOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				match(PRIOR);
				}
				break;
			case FIRST:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				match(FIRST);
				}
				break;
			case LAST:
				enterOuterAlt(_localctx, 4);
				{
				setState(309);
				match(LAST);
				}
				break;
			case ABSOLUTE:
				enterOuterAlt(_localctx, 5);
				{
				setState(310);
				match(ABSOLUTE);
				setState(311);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==USER_VARIABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case RELATIVE:
				enterOuterAlt(_localctx, 6);
				{
				setState(312);
				match(RELATIVE);
				setState(313);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==USER_VARIABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Close_cursorContext extends ParserRuleContext {
		public TerminalNode CLOSE() { return getToken(SQLGrammarParser.CLOSE, 0); }
		public Identifier_refContext identifier_ref() {
			return getRuleContext(Identifier_refContext.class,0);
		}
		public TerminalNode USER_VARIABLE() { return getToken(SQLGrammarParser.USER_VARIABLE, 0); }
		public TerminalNode GLOBAL() { return getToken(SQLGrammarParser.GLOBAL, 0); }
		public Close_cursorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_cursor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterClose_cursor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitClose_cursor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitClose_cursor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Close_cursorContext close_cursor() throws RecognitionException {
		Close_cursorContext _localctx = new Close_cursorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_close_cursor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(CLOSE);
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL:
			case DELIMITED_IDENTIFIER_BRACKET:
			case IDENTIFIER:
				{
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(317);
					match(GLOBAL);
					}
				}

				setState(320);
				identifier_ref();
				}
				break;
			case USER_VARIABLE:
				{
				setState(321);
				match(USER_VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Deallocate_cursorContext extends ParserRuleContext {
		public TerminalNode DEALLOCATE() { return getToken(SQLGrammarParser.DEALLOCATE, 0); }
		public Identifier_refContext identifier_ref() {
			return getRuleContext(Identifier_refContext.class,0);
		}
		public TerminalNode USER_VARIABLE() { return getToken(SQLGrammarParser.USER_VARIABLE, 0); }
		public TerminalNode GLOBAL() { return getToken(SQLGrammarParser.GLOBAL, 0); }
		public Deallocate_cursorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deallocate_cursor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterDeallocate_cursor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitDeallocate_cursor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitDeallocate_cursor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deallocate_cursorContext deallocate_cursor() throws RecognitionException {
		Deallocate_cursorContext _localctx = new Deallocate_cursorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_deallocate_cursor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(DEALLOCATE);
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL:
			case DELIMITED_IDENTIFIER_BRACKET:
			case IDENTIFIER:
				{
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(325);
					match(GLOBAL);
					}
				}

				setState(328);
				identifier_ref();
				}
				break;
			case USER_VARIABLE:
				{
				setState(329);
				match(USER_VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_statementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(SQLGrammarParser.PRINT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> USER_VARIABLE() { return getTokens(SQLGrammarParser.USER_VARIABLE); }
		public TerminalNode USER_VARIABLE(int i) {
			return getToken(SQLGrammarParser.USER_VARIABLE, i);
		}
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterPrint_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitPrint_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitPrint_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_print_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(PRINT);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9151314444427460608L) != 0) || _la==GETDATE || _la==CASE || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & 109182987L) != 0)) {
				{
				setState(335);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(333);
					expression(0);
					}
					break;
				case 2:
					{
					setState(334);
					match(USER_VARIABLE);
					}
					break;
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class With_clauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SQLGrammarParser.WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLGrammarParser.COMMA, i);
		}
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterWith_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitWith_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitWith_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(WITH);
			setState(341);
			common_table_expression();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(342);
				match(COMMA);
				setState(343);
				common_table_expression();
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(349);
			select_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Common_table_expressionContext extends ParserRuleContext {
		public Identifier_refContext identifier_ref() {
			return getRuleContext(Identifier_refContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLGrammarParser.AS, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(SQLGrammarParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(SQLGrammarParser.LPAREN, i);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(SQLGrammarParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(SQLGrammarParser.RPAREN, i);
		}
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitCommon_table_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			identifier_ref();
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(352);
				match(LPAREN);
				setState(353);
				column_list();
				setState(354);
				match(RPAREN);
				}
			}

			setState(358);
			match(AS);
			setState(359);
			match(LPAREN);
			setState(360);
			select_statement();
			setState(361);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQLGrammarParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CASE() { return getToken(SQLGrammarParser.CASE, 0); }
		public TerminalNode END() { return getToken(SQLGrammarParser.END, 0); }
		public List<When_clauseContext> when_clause() {
			return getRuleContexts(When_clauseContext.class);
		}
		public When_clauseContext when_clause(int i) {
			return getRuleContext(When_clauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SQLGrammarParser.ELSE, 0); }
		public TerminalNode STAR() { return getToken(SQLGrammarParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SQLGrammarParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLGrammarParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SQLGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLGrammarParser.MINUS, 0); }
		public TerminalNode EQUAL() { return getToken(SQLGrammarParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(SQLGrammarParser.NOT_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(SQLGrammarParser.LESS, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(SQLGrammarParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(SQLGrammarParser.GREATER, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(SQLGrammarParser.GREATER_EQUAL, 0); }
		public TerminalNode LIKE() { return getToken(SQLGrammarParser.LIKE, 0); }
		public TerminalNode BETWEEN() { return getToken(SQLGrammarParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SQLGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(SQLGrammarParser.OR, 0); }
		public TerminalNode IN() { return getToken(SQLGrammarParser.IN, 0); }
		public TerminalNode LPAREN() { return getToken(SQLGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SQLGrammarParser.RPAREN, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode IS() { return getToken(SQLGrammarParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SQLGrammarParser.NULL, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
			case QUOTENAME:
			case OBJECT_NAME:
			case GETDATE:
			case STRING:
			case HEX_STRING:
			case NUMBER:
			case LPAREN:
			case DELIMITED_IDENTIFIER_BRACKET:
			case USER_VARIABLE:
			case IDENTIFIER:
				{
				setState(364);
				primary_expression();
				}
				break;
			case NOT:
				{
				setState(365);
				match(NOT);
				setState(366);
				expression(4);
				}
				break;
			case CASE:
				{
				setState(367);
				match(CASE);
				setState(369); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(368);
					when_clause();
					}
					}
					setState(371); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(373);
					match(ELSE);
					setState(374);
					expression(0);
					}
				}

				setState(377);
				match(END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(426);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(381);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(382);
						_la = _input.LA(1);
						if ( !(((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & 7L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(383);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(384);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(385);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(386);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(387);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(388);
						_la = _input.LA(1);
						if ( !(_la==LIKE || ((((_la - 166)) & ~0x3f) == 0 && ((1L << (_la - 166)) & 63L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(389);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(390);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(392);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(391);
							match(NOT);
							}
						}

						setState(394);
						match(BETWEEN);
						setState(395);
						expression(0);
						setState(396);
						match(AND);
						setState(397);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(399);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(400);
						match(AND);
						setState(401);
						expression(4);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(402);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(403);
						match(OR);
						setState(404);
						expression(3);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(405);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(407);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(406);
							match(NOT);
							}
						}

						setState(409);
						match(IN);
						setState(418);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
						case 1:
							{
							setState(410);
							match(LPAREN);
							setState(413);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case NOT:
							case NULL:
							case COUNT:
							case SUM:
							case AVG:
							case MIN:
							case MAX:
							case QUOTENAME:
							case OBJECT_NAME:
							case GETDATE:
							case CASE:
							case STRING:
							case HEX_STRING:
							case NUMBER:
							case LPAREN:
							case DELIMITED_IDENTIFIER_BRACKET:
							case USER_VARIABLE:
							case IDENTIFIER:
								{
								setState(411);
								expression_list();
								}
								break;
							case SELECT:
								{
								setState(412);
								select_statement();
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(415);
							match(RPAREN);
							}
							break;
						case 2:
							{
							setState(417);
							expression(0);
							}
							break;
						}
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(420);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(421);
						match(IS);
						setState(423);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(422);
							match(NOT);
							}
						}

						setState(425);
						match(NULL);
						}
						break;
					}
					} 
				}
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class When_clauseContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(SQLGrammarParser.WHEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode THEN() { return getToken(SQLGrammarParser.THEN, 0); }
		public When_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterWhen_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitWhen_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitWhen_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final When_clauseContext when_clause() throws RecognitionException {
		When_clauseContext _localctx = new When_clauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_when_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(WHEN);
			setState(432);
			expression(0);
			setState(433);
			match(THEN);
			setState(434);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Primary_expressionContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode USER_VARIABLE() { return getToken(SQLGrammarParser.USER_VARIABLE, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SQLGrammarParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SQLGrammarParser.RPAREN, 0); }
		public Scalar_subqueryContext scalar_subquery() {
			return getRuleContext(Scalar_subqueryContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_primary_expression);
		try {
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				column_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				match(USER_VARIABLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(439);
				function_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(440);
				match(LPAREN);
				setState(441);
				expression(0);
				setState(442);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(444);
				scalar_subquery();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_sourceContext extends ParserRuleContext {
		public Identifier_refContext identifier_ref() {
			return getRuleContext(Identifier_refContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLGrammarParser.AS, 0); }
		public TerminalNode LPAREN() { return getToken(SQLGrammarParser.LPAREN, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SQLGrammarParser.RPAREN, 0); }
		public Table_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterTable_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitTable_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitTable_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_sourceContext table_source() throws RecognitionException {
		Table_sourceContext _localctx = new Table_sourceContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_table_source);
		int _la;
		try {
			setState(462);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELIMITED_IDENTIFIER_BRACKET:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				identifier_ref();
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==IDENTIFIER) {
					{
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(448);
						match(AS);
						}
					}

					setState(451);
					table_alias();
					}
				}

				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				match(LPAREN);
				setState(455);
				select_statement();
				setState(456);
				match(RPAREN);
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(457);
					match(AS);
					}
				}

				setState(460);
				table_alias();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Join_clauseContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(SQLGrammarParser.JOIN, 0); }
		public Table_sourceContext table_source() {
			return getRuleContext(Table_sourceContext.class,0);
		}
		public TerminalNode ON() { return getToken(SQLGrammarParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INNER() { return getToken(SQLGrammarParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(SQLGrammarParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SQLGrammarParser.RIGHT, 0); }
		public TerminalNode CROSS() { return getToken(SQLGrammarParser.CROSS, 0); }
		public TerminalNode OUTER() { return getToken(SQLGrammarParser.OUTER, 0); }
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
				{
				setState(464);
				match(INNER);
				}
				break;
			case LEFT:
				{
				setState(465);
				match(LEFT);
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(466);
					match(OUTER);
					}
				}

				}
				break;
			case RIGHT:
				{
				setState(469);
				match(RIGHT);
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(470);
					match(OUTER);
					}
				}

				}
				break;
			case CROSS:
				{
				setState(473);
				match(CROSS);
				}
				break;
			case JOIN:
				break;
			default:
				break;
			}
			setState(476);
			match(JOIN);
			setState(477);
			table_source();
			setState(478);
			match(ON);
			setState(479);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Group_by_clauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(SQLGrammarParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SQLGrammarParser.BY, 0); }
		public List<Group_by_itemContext> group_by_item() {
			return getRuleContexts(Group_by_itemContext.class);
		}
		public Group_by_itemContext group_by_item(int i) {
			return getRuleContext(Group_by_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLGrammarParser.COMMA, i);
		}
		public Group_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterGroup_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitGroup_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitGroup_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_by_clauseContext group_by_clause() throws RecognitionException {
		Group_by_clauseContext _localctx = new Group_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_group_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(GROUP);
			setState(482);
			match(BY);
			setState(483);
			group_by_item();
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(484);
				match(COMMA);
				setState(485);
				group_by_item();
				}
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Group_by_itemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROLLUP() { return getToken(SQLGrammarParser.ROLLUP, 0); }
		public TerminalNode LPAREN() { return getToken(SQLGrammarParser.LPAREN, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SQLGrammarParser.RPAREN, 0); }
		public TerminalNode CUBE() { return getToken(SQLGrammarParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(SQLGrammarParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(SQLGrammarParser.SETS, 0); }
		public Grouping_set_listContext grouping_set_list() {
			return getRuleContext(Grouping_set_listContext.class,0);
		}
		public Group_by_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterGroup_by_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitGroup_by_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitGroup_by_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_by_itemContext group_by_item() throws RecognitionException {
		Group_by_itemContext _localctx = new Group_by_itemContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_group_by_item);
		try {
			setState(508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case NULL:
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
			case QUOTENAME:
			case OBJECT_NAME:
			case GETDATE:
			case CASE:
			case STRING:
			case HEX_STRING:
			case NUMBER:
			case LPAREN:
			case DELIMITED_IDENTIFIER_BRACKET:
			case USER_VARIABLE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				expression(0);
				}
				break;
			case ROLLUP:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				match(ROLLUP);
				setState(493);
				match(LPAREN);
				setState(494);
				expression_list();
				setState(495);
				match(RPAREN);
				}
				break;
			case CUBE:
				enterOuterAlt(_localctx, 3);
				{
				setState(497);
				match(CUBE);
				setState(498);
				match(LPAREN);
				setState(499);
				expression_list();
				setState(500);
				match(RPAREN);
				}
				break;
			case GROUPING:
				enterOuterAlt(_localctx, 4);
				{
				setState(502);
				match(GROUPING);
				setState(503);
				match(SETS);
				setState(504);
				match(LPAREN);
				setState(505);
				grouping_set_list();
				setState(506);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Grouping_set_listContext extends ParserRuleContext {
		public List<Grouping_setContext> grouping_set() {
			return getRuleContexts(Grouping_setContext.class);
		}
		public Grouping_setContext grouping_set(int i) {
			return getRuleContext(Grouping_setContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLGrammarParser.COMMA, i);
		}
		public Grouping_set_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping_set_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterGrouping_set_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitGrouping_set_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitGrouping_set_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grouping_set_listContext grouping_set_list() throws RecognitionException {
		Grouping_set_listContext _localctx = new Grouping_set_listContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_grouping_set_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			grouping_set();
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(511);
				match(COMMA);
				setState(512);
				grouping_set();
				}
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Grouping_setContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SQLGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SQLGrammarParser.RPAREN, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Grouping_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterGrouping_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitGrouping_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitGrouping_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grouping_setContext grouping_set() throws RecognitionException {
		Grouping_setContext _localctx = new Grouping_setContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_grouping_set);
		int _la;
		try {
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				match(LPAREN);
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9151314444427460608L) != 0) || _la==GETDATE || _la==CASE || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & 109182987L) != 0)) {
					{
					setState(520);
					expression_list();
					}
				}

				setState(523);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Order_by_clauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(SQLGrammarParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SQLGrammarParser.BY, 0); }
		public List<Order_by_expressionContext> order_by_expression() {
			return getRuleContexts(Order_by_expressionContext.class);
		}
		public Order_by_expressionContext order_by_expression(int i) {
			return getRuleContext(Order_by_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLGrammarParser.COMMA, i);
		}
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterOrder_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitOrder_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitOrder_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_order_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(ORDER);
			setState(527);
			match(BY);
			setState(528);
			order_by_expression();
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(529);
				match(COMMA);
				setState(530);
				order_by_expression();
				}
				}
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Order_by_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SQLGrammarParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLGrammarParser.DESC, 0); }
		public Order_by_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterOrder_by_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitOrder_by_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitOrder_by_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_expressionContext order_by_expression() throws RecognitionException {
		Order_by_expressionContext _localctx = new Order_by_expressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_order_by_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			expression(0);
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(537);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SQLGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SQLGrammarParser.RPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLGrammarParser.IDENTIFIER, 0); }
		public TerminalNode QUOTENAME() { return getToken(SQLGrammarParser.QUOTENAME, 0); }
		public TerminalNode OBJECT_NAME() { return getToken(SQLGrammarParser.OBJECT_NAME, 0); }
		public TerminalNode AVG() { return getToken(SQLGrammarParser.AVG, 0); }
		public TerminalNode SUM() { return getToken(SQLGrammarParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(SQLGrammarParser.COUNT, 0); }
		public TerminalNode MIN() { return getToken(SQLGrammarParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(SQLGrammarParser.MAX, 0); }
		public TerminalNode GETDATE() { return getToken(SQLGrammarParser.GETDATE, 0); }
		public TerminalNode STAR() { return getToken(SQLGrammarParser.STAR, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			_la = _input.LA(1);
			if ( !(((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 524415L) != 0) || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(541);
			match(LPAREN);
			setState(544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(542);
				match(STAR);
				}
				break;
			case NOT:
			case NULL:
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
			case QUOTENAME:
			case OBJECT_NAME:
			case GETDATE:
			case CASE:
			case STRING:
			case HEX_STRING:
			case NUMBER:
			case LPAREN:
			case DELIMITED_IDENTIFIER_BRACKET:
			case USER_VARIABLE:
			case IDENTIFIER:
				{
				setState(543);
				expression_list();
				}
				break;
			case RPAREN:
				break;
			default:
				break;
			}
			setState(546);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Scalar_subqueryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SQLGrammarParser.LPAREN, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SQLGrammarParser.RPAREN, 0); }
		public Scalar_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterScalar_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitScalar_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitScalar_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scalar_subqueryContext scalar_subquery() throws RecognitionException {
		Scalar_subqueryContext _localctx = new Scalar_subqueryContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_scalar_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(LPAREN);
			setState(549);
			select_statement();
			setState(550);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Having_clauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(SQLGrammarParser.HAVING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterHaving_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitHaving_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitHaving_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(HAVING);
			setState(553);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SQLGrammarParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(WHERE);
			setState(556);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(SQLGrammarParser.EQUAL, 0); }
		public TerminalNode PLUS() { return getToken(SQLGrammarParser.PLUS, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			column_name();
			setState(559);
			_la = _input.LA(1);
			if ( !(_la==EQUAL || _la==PLUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(560);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLGrammarParser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitExpression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			expression(0);
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(563);
				match(COMMA);
				setState(564);
				expression(0);
				}
				}
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_listContext extends ParserRuleContext {
		public List<Identifier_refContext> identifier_ref() {
			return getRuleContexts(Identifier_refContext.class);
		}
		public Identifier_refContext identifier_ref(int i) {
			return getRuleContext(Identifier_refContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLGrammarParser.COMMA, i);
		}
		public Column_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterColumn_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitColumn_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitColumn_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_listContext column_list() throws RecognitionException {
		Column_listContext _localctx = new Column_listContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			identifier_ref();
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(571);
				match(COMMA);
				setState(572);
				identifier_ref();
				}
				}
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Identifier_refContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLGrammarParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(SQLGrammarParser.DOT, 0); }
		public TerminalNode DELIMITED_IDENTIFIER_BRACKET() { return getToken(SQLGrammarParser.DELIMITED_IDENTIFIER_BRACKET, 0); }
		public Identifier_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterIdentifier_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitIdentifier_ref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitIdentifier_ref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_refContext identifier_ref() throws RecognitionException {
		Identifier_refContext _localctx = new Identifier_refContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_identifier_ref);
		int _la;
		try {
			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				match(IDENTIFIER);
				setState(581);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(579);
					match(DOT);
					setState(580);
					match(IDENTIFIER);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(583);
					match(IDENTIFIER);
					setState(584);
					match(DOT);
					}
				}

				setState(587);
				match(DELIMITED_IDENTIFIER_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(588);
				match(DELIMITED_IDENTIFIER_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SQLGrammarParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(SQLGrammarParser.STRING, 0); }
		public TerminalNode HEX_STRING() { return getToken(SQLGrammarParser.HEX_STRING, 0); }
		public TerminalNode NULL() { return getToken(SQLGrammarParser.NULL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			_la = _input.LA(1);
			if ( !(_la==NULL || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & 11L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_nameContext extends ParserRuleContext {
		public Identifier_refContext identifier_ref() {
			return getRuleContext(Identifier_refContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			identifier_ref();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_nameContext extends ParserRuleContext {
		public Identifier_refContext identifier_ref() {
			return getRuleContext(Identifier_refContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			identifier_ref();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLGrammarParser.IDENTIFIER, 0); }
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cursor_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLGrammarParser.IDENTIFIER, 0); }
		public Cursor_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterCursor_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitCursor_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitCursor_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_nameContext cursor_name() throws RecognitionException {
		Cursor_nameContext _localctx = new Cursor_nameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_cursor_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cursor_variable_nameContext extends ParserRuleContext {
		public TerminalNode USER_VARIABLE() { return getToken(SQLGrammarParser.USER_VARIABLE, 0); }
		public Cursor_variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_variable_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterCursor_variable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitCursor_variable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitCursor_variable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_variable_nameContext cursor_variable_name() throws RecognitionException {
		Cursor_variable_nameContext _localctx = new Cursor_variable_nameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_cursor_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(USER_VARIABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00bd\u025c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0001\u0000"+
		"\u0001\u0000\u0003\u0000[\b\u0000\u0001\u0000\u0005\u0000^\b\u0000\n\u0000"+
		"\f\u0000a\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001k\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002q\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0003\u0003u\b\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003y\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u007f\b\u0003\n\u0003\f\u0003\u0082\t\u0003\u0003\u0003\u0084\b"+
		"\u0003\u0001\u0003\u0003\u0003\u0087\b\u0003\u0001\u0003\u0003\u0003\u008a"+
		"\b\u0003\u0001\u0003\u0003\u0003\u008d\b\u0003\u0001\u0003\u0003\u0003"+
		"\u0090\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u0096\b\u0004\n\u0004\f\u0004\u0099\t\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u009d\b\u0004\u0001\u0004\u0003\u0004\u00a0\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u00a4\b\u0004\n\u0004\f\u0004\u00a7\t\u0004\u0003"+
		"\u0004\u00a9\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005\u00ad\b\u0005"+
		"\u0001\u0005\u0003\u0005\u00b0\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00b6\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00ba\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00c1\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00c9\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00d1\b\u0007"+
		"\n\u0007\f\u0007\u00d4\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u00d9\b\u0007\n\u0007\f\u0007\u00dc\t\u0007\u0003\u0007\u00de\b"+
		"\u0007\u0001\u0007\u0003\u0007\u00e1\b\u0007\u0001\b\u0001\b\u0003\b\u00e5"+
		"\b\b\u0001\b\u0001\b\u0003\b\u00e9\b\b\u0001\t\u0001\t\u0001\t\u0003\t"+
		"\u00ee\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00f4\b\n\u0001\n\u0003"+
		"\n\u00f7\b\n\u0001\n\u0003\n\u00fa\b\n\u0001\n\u0003\n\u00fd\b\n\u0001"+
		"\n\u0003\n\u0100\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u010a\b\n\n\n\f\n\u010d\t\n\u0003\n\u010f\b\n\u0003"+
		"\n\u0111\b\n\u0001\u000b\u0001\u000b\u0003\u000b\u0115\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u0119\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0003\f\u011f\b\f\u0001\f\u0003\f\u0122\b\f\u0001\f\u0001\f\u0003\f\u0126"+
		"\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u012c\b\f\n\f\f\f\u012f\t"+
		"\f\u0003\f\u0131\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u013b\b\r\u0001\u000e\u0001\u000e\u0003\u000e\u013f"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0143\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0147\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u014b\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0150\b"+
		"\u0010\n\u0010\f\u0010\u0153\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u0159\b\u0011\n\u0011\f\u0011\u015c\t\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u0165\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0004\u0013\u0172\b\u0013\u000b\u0013\f\u0013\u0173"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0178\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u017c\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u0189\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0198\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u019e\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01a3\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u01a8\b\u0013\u0001\u0013\u0005\u0013"+
		"\u01ab\b\u0013\n\u0013\f\u0013\u01ae\t\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u01be\b\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u01c2\b\u0016"+
		"\u0001\u0016\u0003\u0016\u01c5\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u01cb\b\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u01cf\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01d4\b"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01d8\b\u0017\u0001\u0017\u0003"+
		"\u0017\u01db\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u01e7\b\u0018\n\u0018\f\u0018\u01ea\t\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01fd\b\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u0202\b\u001a\n\u001a\f\u001a\u0205"+
		"\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u020a\b\u001b"+
		"\u0001\u001b\u0003\u001b\u020d\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u0214\b\u001c\n\u001c\f\u001c\u0217"+
		"\t\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u021b\b\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0221\b\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001#\u0005#\u0236\b#\n#\f#\u0239\t#\u0001$\u0001$\u0001$\u0005$\u023e"+
		"\b$\n$\f$\u0241\t$\u0001%\u0001%\u0001%\u0003%\u0246\b%\u0001%\u0001%"+
		"\u0003%\u024a\b%\u0001%\u0001%\u0003%\u024e\b%\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001+\u0000"+
		"\u0001&,\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTV\u0000\r\u0002\u0000\u000b"+
		"\u000b\u009b\u009b\u0001\u0000\u0085\u0086\u0001\u0000\u0087\u0088\u0001"+
		"\u0000\u0089\u008c\u0001\u0000\u008d\u008f\u0002\u0000\u00a5\u00a5\u00bb"+
		"\u00bb\u0001\u0000\u00ae\u00b0\u0001\u0000\u00ac\u00ad\u0002\u0000##\u00a6"+
		"\u00ab\u0001\u0000\b\t\u0003\u00008>KK\u00bc\u00bc\u0002\u0000\u00a6\u00a6"+
		"\u00ac\u00ac\u0003\u0000\u001e\u001e\u00a2\u00a3\u00a5\u00a5\u02a3\u0000"+
		"_\u0001\u0000\u0000\u0000\u0002j\u0001\u0000\u0000\u0000\u0004p\u0001"+
		"\u0000\u0000\u0000\u0006r\u0001\u0000\u0000\u0000\b\u00a8\u0001\u0000"+
		"\u0000\u0000\n\u00b5\u0001\u0000\u0000\u0000\f\u00b7\u0001\u0000\u0000"+
		"\u0000\u000e\u00ca\u0001\u0000\u0000\u0000\u0010\u00e2\u0001\u0000\u0000"+
		"\u0000\u0012\u00ed\u0001\u0000\u0000\u0000\u0014\u00ef\u0001\u0000\u0000"+
		"\u0000\u0016\u0112\u0001\u0000\u0000\u0000\u0018\u011a\u0001\u0000\u0000"+
		"\u0000\u001a\u013a\u0001\u0000\u0000\u0000\u001c\u013c\u0001\u0000\u0000"+
		"\u0000\u001e\u0144\u0001\u0000\u0000\u0000 \u014c\u0001\u0000\u0000\u0000"+
		"\"\u0154\u0001\u0000\u0000\u0000$\u015f\u0001\u0000\u0000\u0000&\u017b"+
		"\u0001\u0000\u0000\u0000(\u01af\u0001\u0000\u0000\u0000*\u01bd\u0001\u0000"+
		"\u0000\u0000,\u01ce\u0001\u0000\u0000\u0000.\u01da\u0001\u0000\u0000\u0000"+
		"0\u01e1\u0001\u0000\u0000\u00002\u01fc\u0001\u0000\u0000\u00004\u01fe"+
		"\u0001\u0000\u0000\u00006\u020c\u0001\u0000\u0000\u00008\u020e\u0001\u0000"+
		"\u0000\u0000:\u0218\u0001\u0000\u0000\u0000<\u021c\u0001\u0000\u0000\u0000"+
		">\u0224\u0001\u0000\u0000\u0000@\u0228\u0001\u0000\u0000\u0000B\u022b"+
		"\u0001\u0000\u0000\u0000D\u022e\u0001\u0000\u0000\u0000F\u0232\u0001\u0000"+
		"\u0000\u0000H\u023a\u0001\u0000\u0000\u0000J\u024d\u0001\u0000\u0000\u0000"+
		"L\u024f\u0001\u0000\u0000\u0000N\u0251\u0001\u0000\u0000\u0000P\u0253"+
		"\u0001\u0000\u0000\u0000R\u0255\u0001\u0000\u0000\u0000T\u0257\u0001\u0000"+
		"\u0000\u0000V\u0259\u0001\u0000\u0000\u0000XZ\u0003\u0002\u0001\u0000"+
		"Y[\u0005\u00b2\u0000\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[^\u0001\u0000\u0000\u0000\\^\u0005W\u0000\u0000]X\u0001\u0000\u0000"+
		"\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000bc\u0005\u0000\u0000\u0001c\u0001\u0001\u0000\u0000"+
		"\u0000dk\u0003\u0004\u0002\u0000ek\u0003\u0012\t\u0000fk\u0003\"\u0011"+
		"\u0000gk\u0003 \u0010\u0000hk\u0003\u001c\u000e\u0000ik\u0003\u001e\u000f"+
		"\u0000jd\u0001\u0000\u0000\u0000je\u0001\u0000\u0000\u0000jf\u0001\u0000"+
		"\u0000\u0000jg\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000ji\u0001"+
		"\u0000\u0000\u0000k\u0003\u0001\u0000\u0000\u0000lq\u0003\u0006\u0003"+
		"\u0000mq\u0003\f\u0006\u0000nq\u0003\u000e\u0007\u0000oq\u0003\u0010\b"+
		"\u0000pl\u0001\u0000\u0000\u0000pm\u0001\u0000\u0000\u0000pn\u0001\u0000"+
		"\u0000\u0000po\u0001\u0000\u0000\u0000q\u0005\u0001\u0000\u0000\u0000"+
		"rt\u0005\u0001\u0000\u0000su\u0007\u0000\u0000\u0000ts\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vw\u0005\f\u0000"+
		"\u0000wy\u0005\u00a5\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z\u0083\u0003\b\u0004\u0000{|\u0005"+
		"\u0002\u0000\u0000|\u0080\u0003,\u0016\u0000}\u007f\u0003.\u0017\u0000"+
		"~}\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0084"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083{\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0086\u0001"+
		"\u0000\u0000\u0000\u0085\u0087\u0003B!\u0000\u0086\u0085\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000"+
		"\u0000\u0088\u008a\u00030\u0018\u0000\u0089\u0088\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008c\u0001\u0000\u0000\u0000"+
		"\u008b\u008d\u0003@ \u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0001\u0000\u0000\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u0090"+
		"\u00038\u001c\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0007\u0001\u0000\u0000\u0000\u0091\u00a9\u0005"+
		"\u00ae\u0000\u0000\u0092\u0097\u0003\n\u0005\u0000\u0093\u0094\u0005\u00b1"+
		"\u0000\u0000\u0094\u0096\u0003\n\u0005\u0000\u0095\u0093\u0001\u0000\u0000"+
		"\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u00a9\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009f\u0003<\u001e\u0000"+
		"\u009b\u009d\u0005V\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e"+
		"\u00a0\u0003P(\u0000\u009f\u009c\u0001\u0000\u0000\u0000\u009f\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a5\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005"+
		"\u00b1\u0000\u0000\u00a2\u00a4\u0003\n\u0005\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u0091\u0001\u0000"+
		"\u0000\u0000\u00a8\u0092\u0001\u0000\u0000\u0000\u00a8\u009a\u0001\u0000"+
		"\u0000\u0000\u00a9\t\u0001\u0000\u0000\u0000\u00aa\u00af\u0003&\u0013"+
		"\u0000\u00ab\u00ad\u0005V\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ae\u00b0\u0003P(\u0000\u00af\u00ac\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b6\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0003P(\u0000\u00b2\u00b3\u0005\u00a6\u0000\u0000\u00b3\u00b4\u0003&"+
		"\u0013\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00aa\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b1\u0001\u0000\u0000\u0000\u00b6\u000b\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b9\u0005\r\u0000\u0000\u00b8\u00ba\u0005\u0012\u0000"+
		"\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00c0\u0003N\'\u0000"+
		"\u00bc\u00bd\u0005\u00b3\u0000\u0000\u00bd\u00be\u0003H$\u0000\u00be\u00bf"+
		"\u0005\u00b4\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0\u00bc"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u0011\u0000\u0000\u00c3\u00c4"+
		"\u0005\u00b3\u0000\u0000\u00c4\u00c5\u0003F#\u0000\u00c5\u00c6\u0005\u00b4"+
		"\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c9\u0003\u0006"+
		"\u0003\u0000\u00c8\u00c2\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c9\r\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u000f\u0000"+
		"\u0000\u00cb\u00cc\u0003N\'\u0000\u00cc\u00cd\u0005\u0010\u0000\u0000"+
		"\u00cd\u00d2\u0003D\"\u0000\u00ce\u00cf\u0005\u00b1\u0000\u0000\u00cf"+
		"\u00d1\u0003D\"\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d3\u00dd\u0001\u0000\u0000\u0000\u00d4\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0002\u0000\u0000\u00d6\u00da"+
		"\u0003,\u0016\u0000\u00d7\u00d9\u0003.\u0017\u0000\u00d8\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000"+
		"\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00d5\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e0\u0001\u0000"+
		"\u0000\u0000\u00df\u00e1\u0003B!\u0000\u00e0\u00df\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u000f\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e4\u0005\u000e\u0000\u0000\u00e3\u00e5\u0005\u0002\u0000\u0000"+
		"\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e8\u0003N\'\u0000\u00e7"+
		"\u00e9\u0003B!\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001"+
		"\u0000\u0000\u0000\u00e9\u0011\u0001\u0000\u0000\u0000\u00ea\u00ee\u0003"+
		"\u0014\n\u0000\u00eb\u00ee\u0003\u0016\u000b\u0000\u00ec\u00ee\u0003\u0018"+
		"\f\u0000\u00ed\u00ea\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee\u0013\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0005U\u0000\u0000\u00f0\u00f1\u0003T*\u0000\u00f1"+
		"\u00f3\u0005\u0084\u0000\u0000\u00f2\u00f4\u0007\u0001\u0000\u0000\u00f3"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f7\u0007\u0002\u0000\u0000\u00f6"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f9\u0001\u0000\u0000\u0000\u00f8\u00fa\u0007\u0003\u0000\u0000\u00f9"+
		"\u00f8\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fb\u00fd\u0007\u0004\u0000\u0000\u00fc"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd"+
		"\u00ff\u0001\u0000\u0000\u0000\u00fe\u0100\u0005\u0090\u0000\u0000\u00ff"+
		"\u00fe\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0001\u0000\u0000\u0000\u0101\u0102\u0005\u0091\u0000\u0000\u0102"+
		"\u0110\u0003\u0006\u0003\u0000\u0103\u0104\u0005\u0091\u0000\u0000\u0104"+
		"\u010e\u0005\u000f\u0000\u0000\u0105\u0106\u0005\u0092\u0000\u0000\u0106"+
		"\u010b\u0003P(\u0000\u0107\u0108\u0005\u00b1\u0000\u0000\u0108\u010a\u0003"+
		"P(\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u010a\u010d\u0001\u0000\u0000"+
		"\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000"+
		"\u0000\u010c\u010f\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000"+
		"\u0000\u010e\u0105\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000"+
		"\u0000\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u0103\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0015\u0001\u0000\u0000"+
		"\u0000\u0112\u0118\u0005\u0093\u0000\u0000\u0113\u0115\u0005\u0086\u0000"+
		"\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000"+
		"\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0119\u0003T*\u0000\u0117"+
		"\u0119\u0003V+\u0000\u0118\u0114\u0001\u0000\u0000\u0000\u0118\u0117\u0001"+
		"\u0000\u0000\u0000\u0119\u0017\u0001\u0000\u0000\u0000\u011a\u011e\u0005"+
		"u\u0000\u0000\u011b\u011c\u0003\u001a\r\u0000\u011c\u011d\u0005\u0002"+
		"\u0000\u0000\u011d\u011f\u0001\u0000\u0000\u0000\u011e\u011b\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0125\u0001\u0000"+
		"\u0000\u0000\u0120\u0122\u0005\u0086\u0000\u0000\u0121\u0120\u0001\u0000"+
		"\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000"+
		"\u0000\u0000\u0123\u0126\u0003T*\u0000\u0124\u0126\u0005\u00bb\u0000\u0000"+
		"\u0125\u0121\u0001\u0000\u0000\u0000\u0125\u0124\u0001\u0000\u0000\u0000"+
		"\u0126\u0130\u0001\u0000\u0000\u0000\u0127\u0128\u0005\u0012\u0000\u0000"+
		"\u0128\u012d\u0005\u00bb\u0000\u0000\u0129\u012a\u0005\u00b1\u0000\u0000"+
		"\u012a\u012c\u0005\u00bb\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000"+
		"\u012c\u012f\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000"+
		"\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u0131\u0001\u0000\u0000\u0000"+
		"\u012f\u012d\u0001\u0000\u0000\u0000\u0130\u0127\u0001\u0000\u0000\u0000"+
		"\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0019\u0001\u0000\u0000\u0000"+
		"\u0132\u013b\u0005v\u0000\u0000\u0133\u013b\u0005\u0094\u0000\u0000\u0134"+
		"\u013b\u0005\u0095\u0000\u0000\u0135\u013b\u0005\u0096\u0000\u0000\u0136"+
		"\u0137\u0005\u0097\u0000\u0000\u0137\u013b\u0007\u0005\u0000\u0000\u0138"+
		"\u0139\u0005\u0098\u0000\u0000\u0139\u013b\u0007\u0005\u0000\u0000\u013a"+
		"\u0132\u0001\u0000\u0000\u0000\u013a\u0133\u0001\u0000\u0000\u0000\u013a"+
		"\u0134\u0001\u0000\u0000\u0000\u013a\u0135\u0001\u0000\u0000\u0000\u013a"+
		"\u0136\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b"+
		"\u001b\u0001\u0000\u0000\u0000\u013c\u0142\u0005\u0099\u0000\u0000\u013d"+
		"\u013f\u0005\u0086\u0000\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013e"+
		"\u013f\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140"+
		"\u0143\u0003J%\u0000\u0141\u0143\u0005\u00bb\u0000\u0000\u0142\u013e\u0001"+
		"\u0000\u0000\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0143\u001d\u0001"+
		"\u0000\u0000\u0000\u0144\u014a\u0005\u009a\u0000\u0000\u0145\u0147\u0005"+
		"\u0086\u0000\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0146\u0147\u0001"+
		"\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u014b\u0003"+
		"J%\u0000\u0149\u014b\u0005\u00bb\u0000\u0000\u014a\u0146\u0001\u0000\u0000"+
		"\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014b\u001f\u0001\u0000\u0000"+
		"\u0000\u014c\u0151\u0005d\u0000\u0000\u014d\u0150\u0003&\u0013\u0000\u014e"+
		"\u0150\u0005\u00bb\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f"+
		"\u014e\u0001\u0000\u0000\u0000\u0150\u0153\u0001\u0000\u0000\u0000\u0151"+
		"\u014f\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152"+
		"!\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0005q\u0000\u0000\u0155\u015a\u0003$\u0012\u0000\u0156\u0157\u0005\u00b1"+
		"\u0000\u0000\u0157\u0159\u0003$\u0012\u0000\u0158\u0156\u0001\u0000\u0000"+
		"\u0000\u0159\u015c\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015d\u0001\u0000\u0000"+
		"\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015d\u015e\u0003\u0006\u0003"+
		"\u0000\u015e#\u0001\u0000\u0000\u0000\u015f\u0164\u0003J%\u0000\u0160"+
		"\u0161\u0005\u00b3\u0000\u0000\u0161\u0162\u0003H$\u0000\u0162\u0163\u0005"+
		"\u00b4\u0000\u0000\u0163\u0165\u0001\u0000\u0000\u0000\u0164\u0160\u0001"+
		"\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0166\u0001"+
		"\u0000\u0000\u0000\u0166\u0167\u0005V\u0000\u0000\u0167\u0168\u0005\u00b3"+
		"\u0000\u0000\u0168\u0169\u0003\u0006\u0003\u0000\u0169\u016a\u0005\u00b4"+
		"\u0000\u0000\u016a%\u0001\u0000\u0000\u0000\u016b\u016c\u0006\u0013\uffff"+
		"\uffff\u0000\u016c\u017c\u0003*\u0015\u0000\u016d\u016e\u0005\u001d\u0000"+
		"\u0000\u016e\u017c\u0003&\u0013\u0004\u016f\u0171\u0005]\u0000\u0000\u0170"+
		"\u0172\u0003(\u0014\u0000\u0171\u0170\u0001\u0000\u0000\u0000\u0172\u0173"+
		"\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173\u0174"+
		"\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000\u0000\u0000\u0175\u0176"+
		"\u0005[\u0000\u0000\u0176\u0178\u0003&\u0013\u0000\u0177\u0175\u0001\u0000"+
		"\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000"+
		"\u0000\u0000\u0179\u017a\u0005Y\u0000\u0000\u017a\u017c\u0001\u0000\u0000"+
		"\u0000\u017b\u016b\u0001\u0000\u0000\u0000\u017b\u016d\u0001\u0000\u0000"+
		"\u0000\u017b\u016f\u0001\u0000\u0000\u0000\u017c\u01ac\u0001\u0000\u0000"+
		"\u0000\u017d\u017e\n\n\u0000\u0000\u017e\u017f\u0007\u0006\u0000\u0000"+
		"\u017f\u01ab\u0003&\u0013\u000b\u0180\u0181\n\t\u0000\u0000\u0181\u0182"+
		"\u0007\u0007\u0000\u0000\u0182\u01ab\u0003&\u0013\n\u0183\u0184\n\b\u0000"+
		"\u0000\u0184\u0185\u0007\b\u0000\u0000\u0185\u01ab\u0003&\u0013\t\u0186"+
		"\u0188\n\u0006\u0000\u0000\u0187\u0189\u0005\u001d\u0000\u0000\u0188\u0187"+
		"\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018a"+
		"\u0001\u0000\u0000\u0000\u018a\u018b\u0005$\u0000\u0000\u018b\u018c\u0003"+
		"&\u0013\u0000\u018c\u018d\u0005\u001b\u0000\u0000\u018d\u018e\u0003&\u0013"+
		"\u0007\u018e\u01ab\u0001\u0000\u0000\u0000\u018f\u0190\n\u0003\u0000\u0000"+
		"\u0190\u0191\u0005\u001b\u0000\u0000\u0191\u01ab\u0003&\u0013\u0004\u0192"+
		"\u0193\n\u0002\u0000\u0000\u0193\u0194\u0005\u001c\u0000\u0000\u0194\u01ab"+
		"\u0003&\u0013\u0003\u0195\u0197\n\u0007\u0000\u0000\u0196\u0198\u0005"+
		"\u001d\u0000\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u0197\u0198\u0001"+
		"\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u01a2\u0005"+
		"\"\u0000\u0000\u019a\u019d\u0005\u00b3\u0000\u0000\u019b\u019e\u0003F"+
		"#\u0000\u019c\u019e\u0003\u0006\u0003\u0000\u019d\u019b\u0001\u0000\u0000"+
		"\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000"+
		"\u0000\u019f\u01a0\u0005\u00b4\u0000\u0000\u01a0\u01a3\u0001\u0000\u0000"+
		"\u0000\u01a1\u01a3\u0003&\u0013\u0000\u01a2\u019a\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a3\u01ab\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a5\n\u0005\u0000\u0000\u01a5\u01a7\u0005!\u0000\u0000\u01a6"+
		"\u01a8\u0005\u001d\u0000\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a8\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9"+
		"\u01ab\u0005\u001e\u0000\u0000\u01aa\u017d\u0001\u0000\u0000\u0000\u01aa"+
		"\u0180\u0001\u0000\u0000\u0000\u01aa\u0183\u0001\u0000\u0000\u0000\u01aa"+
		"\u0186\u0001\u0000\u0000\u0000\u01aa\u018f\u0001\u0000\u0000\u0000\u01aa"+
		"\u0192\u0001\u0000\u0000\u0000\u01aa\u0195\u0001\u0000\u0000\u0000\u01aa"+
		"\u01a4\u0001\u0000\u0000\u0000\u01ab\u01ae\u0001\u0000\u0000\u0000\u01ac"+
		"\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad"+
		"\'\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01af\u01b0"+
		"\u0005^\u0000\u0000\u01b0\u01b1\u0003&\u0013\u0000\u01b1\u01b2\u0005_"+
		"\u0000\u0000\u01b2\u01b3\u0003&\u0013\u0000\u01b3)\u0001\u0000\u0000\u0000"+
		"\u01b4\u01be\u0003P(\u0000\u01b5\u01be\u0003L&\u0000\u01b6\u01be\u0005"+
		"\u00bb\u0000\u0000\u01b7\u01be\u0003<\u001e\u0000\u01b8\u01b9\u0005\u00b3"+
		"\u0000\u0000\u01b9\u01ba\u0003&\u0013\u0000\u01ba\u01bb\u0005\u00b4\u0000"+
		"\u0000\u01bb\u01be\u0001\u0000\u0000\u0000\u01bc\u01be\u0003>\u001f\u0000"+
		"\u01bd\u01b4\u0001\u0000\u0000\u0000\u01bd\u01b5\u0001\u0000\u0000\u0000"+
		"\u01bd\u01b6\u0001\u0000\u0000\u0000\u01bd\u01b7\u0001\u0000\u0000\u0000"+
		"\u01bd\u01b8\u0001\u0000\u0000\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000"+
		"\u01be+\u0001\u0000\u0000\u0000\u01bf\u01c4\u0003J%\u0000\u01c0\u01c2"+
		"\u0005V\u0000\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3\u01c5\u0003"+
		"R)\u0000\u01c4\u01c1\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c5\u01cf\u0001\u0000\u0000\u0000\u01c6\u01c7\u0005\u00b3\u0000"+
		"\u0000\u01c7\u01c8\u0003\u0006\u0003\u0000\u01c8\u01ca\u0005\u00b4\u0000"+
		"\u0000\u01c9\u01cb\u0005V\u0000\u0000\u01ca\u01c9\u0001\u0000\u0000\u0000"+
		"\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000"+
		"\u01cc\u01cd\u0003R)\u0000\u01cd\u01cf\u0001\u0000\u0000\u0000\u01ce\u01bf"+
		"\u0001\u0000\u0000\u0000\u01ce\u01c6\u0001\u0000\u0000\u0000\u01cf-\u0001"+
		"\u0000\u0000\u0000\u01d0\u01db\u0005\u0014\u0000\u0000\u01d1\u01d3\u0005"+
		"\u0015\u0000\u0000\u01d2\u01d4\u0005\u0018\u0000\u0000\u01d3\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01db\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d7\u0005\u0016\u0000\u0000\u01d6\u01d8\u0005"+
		"\u0018\u0000\u0000\u01d7\u01d6\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001"+
		"\u0000\u0000\u0000\u01d8\u01db\u0001\u0000\u0000\u0000\u01d9\u01db\u0005"+
		"\u0019\u0000\u0000\u01da\u01d0\u0001\u0000\u0000\u0000\u01da\u01d1\u0001"+
		"\u0000\u0000\u0000\u01da\u01d5\u0001\u0000\u0000\u0000\u01da\u01d9\u0001"+
		"\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01dc\u0001"+
		"\u0000\u0000\u0000\u01dc\u01dd\u0005\u0013\u0000\u0000\u01dd\u01de\u0003"+
		",\u0016\u0000\u01de\u01df\u0005\u001a\u0000\u0000\u01df\u01e0\u0003&\u0013"+
		"\u0000\u01e0/\u0001\u0000\u0000\u0000\u01e1\u01e2\u0005\u0004\u0000\u0000"+
		"\u01e2\u01e3\u0005\u0005\u0000\u0000\u01e3\u01e8\u00032\u0019\u0000\u01e4"+
		"\u01e5\u0005\u00b1\u0000\u0000\u01e5\u01e7\u00032\u0019\u0000\u01e6\u01e4"+
		"\u0001\u0000\u0000\u0000\u01e7\u01ea\u0001\u0000\u0000\u0000\u01e8\u01e6"+
		"\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e91\u0001"+
		"\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01eb\u01fd\u0003"+
		"&\u0013\u0000\u01ec\u01ed\u0005\u009c\u0000\u0000\u01ed\u01ee\u0005\u00b3"+
		"\u0000\u0000\u01ee\u01ef\u0003F#\u0000\u01ef\u01f0\u0005\u00b4\u0000\u0000"+
		"\u01f0\u01fd\u0001\u0000\u0000\u0000\u01f1\u01f2\u0005\u009d\u0000\u0000"+
		"\u01f2\u01f3\u0005\u00b3\u0000\u0000\u01f3\u01f4\u0003F#\u0000\u01f4\u01f5"+
		"\u0005\u00b4\u0000\u0000\u01f5\u01fd\u0001\u0000\u0000\u0000\u01f6\u01f7"+
		"\u0005\u009e\u0000\u0000\u01f7\u01f8\u0005\u009f\u0000\u0000\u01f8\u01f9"+
		"\u0005\u00b3\u0000\u0000\u01f9\u01fa\u00034\u001a\u0000\u01fa\u01fb\u0005"+
		"\u00b4\u0000\u0000\u01fb\u01fd\u0001\u0000\u0000\u0000\u01fc\u01eb\u0001"+
		"\u0000\u0000\u0000\u01fc\u01ec\u0001\u0000\u0000\u0000\u01fc\u01f1\u0001"+
		"\u0000\u0000\u0000\u01fc\u01f6\u0001\u0000\u0000\u0000\u01fd3\u0001\u0000"+
		"\u0000\u0000\u01fe\u0203\u00036\u001b\u0000\u01ff\u0200\u0005\u00b1\u0000"+
		"\u0000\u0200\u0202\u00036\u001b\u0000\u0201\u01ff\u0001\u0000\u0000\u0000"+
		"\u0202\u0205\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000\u0000"+
		"\u0203\u0204\u0001\u0000\u0000\u0000\u02045\u0001\u0000\u0000\u0000\u0205"+
		"\u0203\u0001\u0000\u0000\u0000\u0206\u020d\u0003&\u0013\u0000\u0207\u0209"+
		"\u0005\u00b3\u0000\u0000\u0208\u020a\u0003F#\u0000\u0209\u0208\u0001\u0000"+
		"\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000"+
		"\u0000\u0000\u020b\u020d\u0005\u00b4\u0000\u0000\u020c\u0206\u0001\u0000"+
		"\u0000\u0000\u020c\u0207\u0001\u0000\u0000\u0000\u020d7\u0001\u0000\u0000"+
		"\u0000\u020e\u020f\u0005\u0007\u0000\u0000\u020f\u0210\u0005\u0005\u0000"+
		"\u0000\u0210\u0215\u0003:\u001d\u0000\u0211\u0212\u0005\u00b1\u0000\u0000"+
		"\u0212\u0214\u0003:\u001d\u0000\u0213\u0211\u0001\u0000\u0000\u0000\u0214"+
		"\u0217\u0001\u0000\u0000\u0000\u0215\u0213\u0001\u0000\u0000\u0000\u0215"+
		"\u0216\u0001\u0000\u0000\u0000\u02169\u0001\u0000\u0000\u0000\u0217\u0215"+
		"\u0001\u0000\u0000\u0000\u0218\u021a\u0003&\u0013\u0000\u0219\u021b\u0007"+
		"\t\u0000\u0000\u021a\u0219\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000"+
		"\u0000\u0000\u021b;\u0001\u0000\u0000\u0000\u021c\u021d\u0007\n\u0000"+
		"\u0000\u021d\u0220\u0005\u00b3\u0000\u0000\u021e\u0221\u0005\u00ae\u0000"+
		"\u0000\u021f\u0221\u0003F#\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0220"+
		"\u021f\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000\u0000\u0221"+
		"\u0222\u0001\u0000\u0000\u0000\u0222\u0223\u0005\u00b4\u0000\u0000\u0223"+
		"=\u0001\u0000\u0000\u0000\u0224\u0225\u0005\u00b3\u0000\u0000\u0225\u0226"+
		"\u0003\u0006\u0003\u0000\u0226\u0227\u0005\u00b4\u0000\u0000\u0227?\u0001"+
		"\u0000\u0000\u0000\u0228\u0229\u0005\u0006\u0000\u0000\u0229\u022a\u0003"+
		"&\u0013\u0000\u022aA\u0001\u0000\u0000\u0000\u022b\u022c\u0005\u0003\u0000"+
		"\u0000\u022c\u022d\u0003&\u0013\u0000\u022dC\u0001\u0000\u0000\u0000\u022e"+
		"\u022f\u0003P(\u0000\u022f\u0230\u0007\u000b\u0000\u0000\u0230\u0231\u0003"+
		"&\u0013\u0000\u0231E\u0001\u0000\u0000\u0000\u0232\u0237\u0003&\u0013"+
		"\u0000\u0233\u0234\u0005\u00b1\u0000\u0000\u0234\u0236\u0003&\u0013\u0000"+
		"\u0235\u0233\u0001\u0000\u0000\u0000\u0236\u0239\u0001\u0000\u0000\u0000"+
		"\u0237\u0235\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000"+
		"\u0238G\u0001\u0000\u0000\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u023a"+
		"\u023f\u0003J%\u0000\u023b\u023c\u0005\u00b1\u0000\u0000\u023c\u023e\u0003"+
		"J%\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023e\u0241\u0001\u0000\u0000"+
		"\u0000\u023f\u023d\u0001\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000"+
		"\u0000\u0240I\u0001\u0000\u0000\u0000\u0241\u023f\u0001\u0000\u0000\u0000"+
		"\u0242\u0245\u0005\u00bc\u0000\u0000\u0243\u0244\u0005\u00b5\u0000\u0000"+
		"\u0244\u0246\u0005\u00bc\u0000\u0000\u0245\u0243\u0001\u0000\u0000\u0000"+
		"\u0245\u0246\u0001\u0000\u0000\u0000\u0246\u024e\u0001\u0000\u0000\u0000"+
		"\u0247\u0248\u0005\u00bc\u0000\u0000\u0248\u024a\u0005\u00b5\u0000\u0000"+
		"\u0249\u0247\u0001\u0000\u0000\u0000\u0249\u024a\u0001\u0000\u0000\u0000"+
		"\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u024e\u0005\u00b9\u0000\u0000"+
		"\u024c\u024e\u0005\u00b9\u0000\u0000\u024d\u0242\u0001\u0000\u0000\u0000"+
		"\u024d\u0249\u0001\u0000\u0000\u0000\u024d\u024c\u0001\u0000\u0000\u0000"+
		"\u024eK\u0001\u0000\u0000\u0000\u024f\u0250\u0007\f\u0000\u0000\u0250"+
		"M\u0001\u0000\u0000\u0000\u0251\u0252\u0003J%\u0000\u0252O\u0001\u0000"+
		"\u0000\u0000\u0253\u0254\u0003J%\u0000\u0254Q\u0001\u0000\u0000\u0000"+
		"\u0255\u0256\u0005\u00bc\u0000\u0000\u0256S\u0001\u0000\u0000\u0000\u0257"+
		"\u0258\u0005\u00bc\u0000\u0000\u0258U\u0001\u0000\u0000\u0000\u0259\u025a"+
		"\u0005\u00bb\u0000\u0000\u025aW\u0001\u0000\u0000\u0000VZ]_jptx\u0080"+
		"\u0083\u0086\u0089\u008c\u008f\u0097\u009c\u009f\u00a5\u00a8\u00ac\u00af"+
		"\u00b5\u00b9\u00c0\u00c8\u00d2\u00da\u00dd\u00e0\u00e4\u00e8\u00ed\u00f3"+
		"\u00f6\u00f9\u00fc\u00ff\u010b\u010e\u0110\u0114\u0118\u011e\u0121\u0125"+
		"\u012d\u0130\u013a\u013e\u0142\u0146\u014a\u014f\u0151\u015a\u0164\u0173"+
		"\u0177\u017b\u0188\u0197\u019d\u01a2\u01a7\u01aa\u01ac\u01bd\u01c1\u01c4"+
		"\u01ca\u01ce\u01d3\u01d7\u01da\u01e8\u01fc\u0203\u0209\u020c\u0215\u021a"+
		"\u0220\u0237\u023f\u0245\u0249\u024d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}