// Generated from C:/Users/batoo/IdeaProjects/compiler-project/src/SQLGrammarParser.g4 by ANTLR 4.13.2
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
		GET=160, IDENTITY=161, CASCADE=162, ACTION=163, BIGINT=164, SMALLINT=165, 
		TINYINT=166, NO=167, VARBINARY=168, BINARY=169, NAME=170, VALUE=171, RESTRICT=172, 
		COLUMN=173, FLOAT=174, REAL=175, COLLATE=176, DATETIME2=177, UNIQUEIDENTIFIER=178, 
		XML=179, JSON=180, TEXTIMAGE_ON=181, ID=182, CODE=183, STATUS=184, TYPE=185, 
		NEW=186, DONE=187, CANCEL=188, INTERVAL=189, HOUR=190, MINUTE=191, SECOND=192, 
		TO=193, DOUBLE=194, PRECISION=195, TIME=196, NUMERIC=197, OUTPUT=198, 
		RETURN=199, RETURNS=200, FUNCTION=201, PROCEDURE=202, PROC=203, SCHEMA=204, 
		AUTHORIZATION=205, MODIFY=206, REBUILD=207, DISABLE=208, RECOVERY=209, 
		SIMPLE=210, LOG=211, TRUNCATE=212, TRANSFER=213, OBJECT=214, DOUBLE_COLON=215, 
		DATEDIFF=216, SYSDATETIMEOFFSET=217, SYSDATETIME=218, CLUSTERED=219, NONCLUSTERED=220, 
		DOUBLE_QUOTED_IDENTIFIER=221, BACKTICK_IDENTIFIER=222, BRACKET_IDENTIFIER=223, 
		USER=224, ROLE=225, UTF8=226, CURRENT_USER=227, OWNER=228, TEMPLATE=229, 
		ENCODING=230, DIVIDE=231, CHECK=232, HASH=233, LINE_COMMENT=234, BLOCK_COMMENT=235, 
		STRING=236, HEX_STRING=237, BIT_STRING=238, NUMBER=239, EQUAL=240, NOT_EQUAL=241, 
		LESS=242, GREATER=243, LESS_EQUAL=244, GREATER_EQUAL=245, PLUS=246, MINUS=247, 
		STAR=248, DIV=249, MOD=250, COMMA=251, SEMICOLON=252, LPAREN=253, RPAREN=254, 
		DOT=255, COLON=256, BRACKET_OPEN=257, BRACKET_CLOSE=258, DELIMITED_IDENTIFIER_BRACKET=259, 
		DELIMITED_IDENTIFIER_QUOTE=260, USER_VARIABLE=261, IDENTIFIER=262, WS=263;
	public static final int
		RULE_sql_script = 0, RULE_statement = 1, RULE_while_statement = 2, RULE_block_statement = 3, 
		RULE_declaration_statement = 4, RULE_variable_declaration = 5, RULE_dml_statement = 6, 
		RULE_select_statement = 7, RULE_select_list = 8, RULE_select_element = 9, 
		RULE_insert_statement = 10, RULE_update_statement = 11, RULE_delete_statement = 12, 
		RULE_ddlStatement = 13, RULE_createStatement = 14, RULE_alterStatement = 15, 
		RULE_dropStatement = 16, RULE_truncateStatement = 17, RULE_otherStatements = 18, 
		RULE_returnStatement = 19, RULE_tableElement = 20, RULE_columnDefinition = 21, 
		RULE_dataType = 22, RULE_columnConstraint = 23, RULE_createTable = 24, 
		RULE_createDatabase = 25, RULE_createSchema = 26, RULE_createProcedure = 27, 
		RULE_createFunction = 28, RULE_createIndex = 29, RULE_indexColumn = 30, 
		RULE_createView = 31, RULE_alterTable = 32, RULE_alterTableAction = 33, 
		RULE_alterDatabase = 34, RULE_alterIndex = 35, RULE_alterView = 36, RULE_alterProcedure = 37, 
		RULE_alterFunction = 38, RULE_alterSchema = 39, RULE_tableConstraint = 40, 
		RULE_parameterList = 41, RULE_parameter = 42, RULE_fileGroup = 43, RULE_action = 44, 
		RULE_defaultValue = 45, RULE_columnList = 46, RULE_identifier = 47, RULE_anyKeywordAsIdentifier = 48, 
		RULE_fullIdentifier = 49, RULE_valueList = 50, RULE_value = 51, RULE_cursor_statement = 52, 
		RULE_declare_cursor = 53, RULE_open_cursor = 54, RULE_fetch_statement = 55, 
		RULE_fetch_direction = 56, RULE_close_cursor = 57, RULE_deallocate_cursor = 58, 
		RULE_print_statement = 59, RULE_with_clause = 60, RULE_common_table_expression = 61, 
		RULE_expression = 62, RULE_when_clause = 63, RULE_primary_expression = 64, 
		RULE_table_source = 65, RULE_join_clause = 66, RULE_group_by_clause = 67, 
		RULE_group_by_item = 68, RULE_grouping_set_list = 69, RULE_grouping_set = 70, 
		RULE_order_by_clause = 71, RULE_order_by_expression = 72, RULE_function_call = 73, 
		RULE_scalar_subquery = 74, RULE_having_clause = 75, RULE_where_clause = 76, 
		RULE_assignment = 77, RULE_expression_list = 78, RULE_column_list = 79, 
		RULE_identifier_ref = 80, RULE_constant = 81, RULE_table_name = 82, RULE_column_name = 83, 
		RULE_table_alias = 84, RULE_cursor_name = 85, RULE_cursor_variable_name = 86;
	private static String[] makeRuleNames() {
		return new String[] {
			"sql_script", "statement", "while_statement", "block_statement", "declaration_statement", 
			"variable_declaration", "dml_statement", "select_statement", "select_list", 
			"select_element", "insert_statement", "update_statement", "delete_statement", 
			"ddlStatement", "createStatement", "alterStatement", "dropStatement", 
			"truncateStatement", "otherStatements", "returnStatement", "tableElement", 
			"columnDefinition", "dataType", "columnConstraint", "createTable", "createDatabase", 
			"createSchema", "createProcedure", "createFunction", "createIndex", "indexColumn", 
			"createView", "alterTable", "alterTableAction", "alterDatabase", "alterIndex", 
			"alterView", "alterProcedure", "alterFunction", "alterSchema", "tableConstraint", 
			"parameterList", "parameter", "fileGroup", "action", "defaultValue", 
			"columnList", "identifier", "anyKeywordAsIdentifier", "fullIdentifier", 
			"valueList", "value", "cursor_statement", "declare_cursor", "open_cursor", 
			"fetch_statement", "fetch_direction", "close_cursor", "deallocate_cursor", 
			"print_statement", "with_clause", "common_table_expression", "expression", 
			"when_clause", "primary_expression", "table_source", "join_clause", "group_by_clause", 
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'#'", null, null, null, null, null, null, 
			"'='", null, "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "','", "';'", "'('", "')'", "'.'", "':'", "'['", "']'"
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
			"CLOSE", "DEALLOCATE", "ALL", "ROLLUP", "CUBE", "GROUPING", "SETS", "GET", 
			"IDENTITY", "CASCADE", "ACTION", "BIGINT", "SMALLINT", "TINYINT", "NO", 
			"VARBINARY", "BINARY", "NAME", "VALUE", "RESTRICT", "COLUMN", "FLOAT", 
			"REAL", "COLLATE", "DATETIME2", "UNIQUEIDENTIFIER", "XML", "JSON", "TEXTIMAGE_ON", 
			"ID", "CODE", "STATUS", "TYPE", "NEW", "DONE", "CANCEL", "INTERVAL", 
			"HOUR", "MINUTE", "SECOND", "TO", "DOUBLE", "PRECISION", "TIME", "NUMERIC", 
			"OUTPUT", "RETURN", "RETURNS", "FUNCTION", "PROCEDURE", "PROC", "SCHEMA", 
			"AUTHORIZATION", "MODIFY", "REBUILD", "DISABLE", "RECOVERY", "SIMPLE", 
			"LOG", "TRUNCATE", "TRANSFER", "OBJECT", "DOUBLE_COLON", "DATEDIFF", 
			"SYSDATETIMEOFFSET", "SYSDATETIME", "CLUSTERED", "NONCLUSTERED", "DOUBLE_QUOTED_IDENTIFIER", 
			"BACKTICK_IDENTIFIER", "BRACKET_IDENTIFIER", "USER", "ROLE", "UTF8", 
			"CURRENT_USER", "OWNER", "TEMPLATE", "ENCODING", "DIVIDE", "CHECK", "HASH", 
			"LINE_COMMENT", "BLOCK_COMMENT", "STRING", "HEX_STRING", "BIT_STRING", 
			"NUMBER", "EQUAL", "NOT_EQUAL", "LESS", "GREATER", "LESS_EQUAL", "GREATER_EQUAL", 
			"PLUS", "MINUS", "STAR", "DIV", "MOD", "COMMA", "SEMICOLON", "LPAREN", 
			"RPAREN", "DOT", "COLON", "BRACKET_OPEN", "BRACKET_CLOSE", "DELIMITED_IDENTIFIER_BRACKET", 
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
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1924145471490L) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 4611686022990823565L) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & 576531121047601155L) != 0)) {
				{
				setState(179);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
				case INSERT:
				case DELETE:
				case UPDATE:
				case SET:
				case CREATE:
				case ALTER:
				case DROP:
				case DECLARE:
				case BEGIN:
				case WHILE:
				case PRINT:
				case WITH:
				case FETCH:
				case OPEN:
				case CLOSE:
				case DEALLOCATE:
				case RETURN:
				case TRUNCATE:
					{
					setState(174);
					statement();
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(175);
						match(SEMICOLON);
						}
					}

					}
					break;
				case GO:
					{
					setState(178);
					match(GO);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
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
		public DdlStatementContext ddlStatement() {
			return getRuleContext(DdlStatementContext.class,0);
		}
		public Cursor_statementContext cursor_statement() {
			return getRuleContext(Cursor_statementContext.class,0);
		}
		public Declaration_statementContext declaration_statement() {
			return getRuleContext(Declaration_statementContext.class,0);
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
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
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
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				dml_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				ddlStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				cursor_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				declaration_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(190);
				with_clause();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(191);
				print_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(192);
				close_cursor();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(193);
				deallocate_cursor();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(194);
				while_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(195);
				block_statement();
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
	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SQLGrammarParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(WHILE);
			setState(199);
			expression(0);
			setState(200);
			statement();
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
	public static class Block_statementContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(SQLGrammarParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(SQLGrammarParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SQLGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SQLGrammarParser.SEMICOLON, i);
		}
		public Block_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterBlock_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitBlock_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitBlock_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_statementContext block_statement() throws RecognitionException {
		Block_statementContext _localctx = new Block_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(BEGIN);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1924145471490L) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 4611686022990823561L) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & 576531121047601155L) != 0)) {
				{
				{
				setState(203);
				statement();
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(204);
					match(SEMICOLON);
					}
				}

				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
			match(END);
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
	public static class Declaration_statementContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(SQLGrammarParser.DECLARE, 0); }
		public List<Variable_declarationContext> variable_declaration() {
			return getRuleContexts(Variable_declarationContext.class);
		}
		public Variable_declarationContext variable_declaration(int i) {
			return getRuleContext(Variable_declarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLGrammarParser.COMMA, i);
		}
		public Declaration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterDeclaration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitDeclaration_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitDeclaration_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_statementContext declaration_statement() throws RecognitionException {
		Declaration_statementContext _localctx = new Declaration_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(DECLARE);
			setState(215);
			variable_declaration();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(216);
				match(COMMA);
				setState(217);
				variable_declaration();
				}
				}
				setState(222);
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
	public static class Variable_declarationContext extends ParserRuleContext {
		public TerminalNode USER_VARIABLE() { return getToken(SQLGrammarParser.USER_VARIABLE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(SQLGrammarParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(USER_VARIABLE);
			setState(224);
			dataType();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(225);
				match(EQUAL);
				setState(226);
				expression(0);
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
		enterRule(_localctx, 12, RULE_dml_statement);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				select_statement();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				insert_statement();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				update_statement();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
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
		enterRule(_localctx, 14, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(SELECT);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(236);
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

			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOP) {
				{
				setState(239);
				match(TOP);
				setState(240);
				match(NUMBER);
				}
			}

			setState(243);
			select_list();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(244);
				match(FROM);
				setState(245);
				table_source();
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 41418752L) != 0)) {
					{
					{
					setState(246);
					join_clause();
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(254);
				where_clause();
				}
			}

			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(257);
				group_by_clause();
				}
			}

			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(260);
				having_clause();
				}
			}

			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(263);
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
		enterRule(_localctx, 16, RULE_select_list);
		int _la;
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				select_element();
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(268);
					match(COMMA);
					setState(269);
					select_element();
					}
					}
					setState(274);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				function_call();
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==DELIMITED_IDENTIFIER_BRACKET || _la==IDENTIFIER) {
					{
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(276);
						match(AS);
						}
					}

					setState(279);
					column_name();
					}
				}

				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(282);
					match(COMMA);
					setState(283);
					select_element();
					}
					}
					setState(288);
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
		enterRule(_localctx, 18, RULE_select_element);
		int _la;
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				expression(0);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==DELIMITED_IDENTIFIER_BRACKET || _la==IDENTIFIER) {
					{
					setState(293);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(292);
						match(AS);
						}
					}

					setState(295);
					column_name();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				column_name();
				setState(299);
				match(EQUAL);
				setState(300);
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
		enterRule(_localctx, 20, RULE_insert_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(INSERT);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(305);
				match(INTO);
				}
			}

			setState(308);
			table_name();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(309);
				match(LPAREN);
				setState(310);
				column_list();
				setState(311);
				match(RPAREN);
				}
			}

			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES:
				{
				setState(315);
				match(VALUES);
				setState(316);
				match(LPAREN);
				setState(317);
				expression_list();
				setState(318);
				match(RPAREN);
				}
				break;
			case SELECT:
				{
				setState(320);
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
		enterRule(_localctx, 22, RULE_update_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(UPDATE);
			setState(324);
			table_name();
			setState(325);
			match(SET);
			setState(326);
			assignment();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(327);
				match(COMMA);
				setState(328);
				assignment();
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(334);
				match(FROM);
				setState(335);
				table_source();
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 41418752L) != 0)) {
					{
					{
					setState(336);
					join_clause();
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(344);
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
		enterRule(_localctx, 24, RULE_delete_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(DELETE);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(348);
				match(FROM);
				}
			}

			setState(351);
			table_name();
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(352);
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
	public static class DdlStatementContext extends ParserRuleContext {
		public CreateStatementContext createStatement() {
			return getRuleContext(CreateStatementContext.class,0);
		}
		public AlterStatementContext alterStatement() {
			return getRuleContext(AlterStatementContext.class,0);
		}
		public DropStatementContext dropStatement() {
			return getRuleContext(DropStatementContext.class,0);
		}
		public TruncateStatementContext truncateStatement() {
			return getRuleContext(TruncateStatementContext.class,0);
		}
		public OtherStatementsContext otherStatements() {
			return getRuleContext(OtherStatementsContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public DdlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterDdlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitDdlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitDdlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DdlStatementContext ddlStatement() throws RecognitionException {
		DdlStatementContext _localctx = new DdlStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ddlStatement);
		try {
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				createStatement();
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				alterStatement();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
				dropStatement();
				}
				break;
			case TRUNCATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(358);
				truncateStatement();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 5);
				{
				setState(359);
				otherStatements();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(360);
				returnStatement();
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
	public static class CreateStatementContext extends ParserRuleContext {
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public CreateDatabaseContext createDatabase() {
			return getRuleContext(CreateDatabaseContext.class,0);
		}
		public CreateSchemaContext createSchema() {
			return getRuleContext(CreateSchemaContext.class,0);
		}
		public CreateProcedureContext createProcedure() {
			return getRuleContext(CreateProcedureContext.class,0);
		}
		public CreateFunctionContext createFunction() {
			return getRuleContext(CreateFunctionContext.class,0);
		}
		public CreateIndexContext createIndex() {
			return getRuleContext(CreateIndexContext.class,0);
		}
		public CreateViewContext createView() {
			return getRuleContext(CreateViewContext.class,0);
		}
		public CreateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterCreateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitCreateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitCreateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateStatementContext createStatement() throws RecognitionException {
		CreateStatementContext _localctx = new CreateStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_createStatement);
		try {
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				createTable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				createDatabase();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				createSchema();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(366);
				createProcedure();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(367);
				createFunction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(368);
				createIndex();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(369);
				createView();
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
	public static class AlterStatementContext extends ParserRuleContext {
		public AlterTableContext alterTable() {
			return getRuleContext(AlterTableContext.class,0);
		}
		public AlterDatabaseContext alterDatabase() {
			return getRuleContext(AlterDatabaseContext.class,0);
		}
		public AlterIndexContext alterIndex() {
			return getRuleContext(AlterIndexContext.class,0);
		}
		public AlterViewContext alterView() {
			return getRuleContext(AlterViewContext.class,0);
		}
		public AlterProcedureContext alterProcedure() {
			return getRuleContext(AlterProcedureContext.class,0);
		}
		public AlterFunctionContext alterFunction() {
			return getRuleContext(AlterFunctionContext.class,0);
		}
		public AlterSchemaContext alterSchema() {
			return getRuleContext(AlterSchemaContext.class,0);
		}
		public AlterStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterAlterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitAlterStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitAlterStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterStatementContext alterStatement() throws RecognitionException {
		AlterStatementContext _localctx = new AlterStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_alterStatement);
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				alterTable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				alterDatabase();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(374);
				alterIndex();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(375);
				alterView();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(376);
				alterProcedure();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(377);
				alterFunction();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(378);
				alterSchema();
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
	public static class DropStatementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQLGrammarParser.DROP, 0); }
		public List<FullIdentifierContext> fullIdentifier() {
			return getRuleContexts(FullIdentifierContext.class);
		}
		public FullIdentifierContext fullIdentifier(int i) {
			return getRuleContext(FullIdentifierContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(SQLGrammarParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SQLGrammarParser.VIEW, 0); }
		public TerminalNode DATABASE() { return getToken(SQLGrammarParser.DATABASE, 0); }
		public TerminalNode PROCEDURE() { return getToken(SQLGrammarParser.PROCEDURE, 0); }
		public TerminalNode PROC() { return getToken(SQLGrammarParser.PROC, 0); }
		public TerminalNode FUNCTION() { return getToken(SQLGrammarParser.FUNCTION, 0); }
		public TerminalNode SCHEMA() { return getToken(SQLGrammarParser.SCHEMA, 0); }
		public TerminalNode IF() { return getToken(SQLGrammarParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SQLGrammarParser.EXISTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLGrammarParser.COMMA, i);
		}
		public TerminalNode INDEX() { return getToken(SQLGrammarParser.INDEX, 0); }
		public TerminalNode ON() { return getToken(SQLGrammarParser.ON, 0); }
		public DropStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterDropStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitDropStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitDropStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropStatementContext dropStatement() throws RecognitionException {
		DropStatementContext _localctx = new DropStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dropStatement);
		int _la;
		try {
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				match(DROP);
				setState(382);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 288072046477312L) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & 15L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(385);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(383);
					match(IF);
					setState(384);
					match(EXISTS);
					}
					break;
				}
				setState(387);
				fullIdentifier();
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(388);
					match(COMMA);
					setState(389);
					fullIdentifier();
					}
					}
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(DROP);
				setState(396);
				match(INDEX);
				setState(399);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(397);
					match(IF);
					setState(398);
					match(EXISTS);
					}
					break;
				}
				setState(401);
				fullIdentifier();
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(402);
					match(ON);
					setState(403);
					fullIdentifier();
					}
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
	public static class TruncateStatementContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(SQLGrammarParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SQLGrammarParser.TABLE, 0); }
		public FullIdentifierContext fullIdentifier() {
			return getRuleContext(FullIdentifierContext.class,0);
		}
		public TruncateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterTruncateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitTruncateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitTruncateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruncateStatementContext truncateStatement() throws RecognitionException {
		TruncateStatementContext _localctx = new TruncateStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_truncateStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(TRUNCATE);
			setState(409);
			match(TABLE);
			setState(410);
			fullIdentifier();
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
	public static class OtherStatementsContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SQLGrammarParser.SET, 0); }
		public TerminalNode EQUAL() { return getToken(SQLGrammarParser.EQUAL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode USER_VARIABLE() { return getToken(SQLGrammarParser.USER_VARIABLE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OtherStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterOtherStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitOtherStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitOtherStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherStatementsContext otherStatements() throws RecognitionException {
		OtherStatementsContext _localctx = new OtherStatementsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_otherStatements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(SET);
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FULL:
			case ON:
			case NULL:
			case KEY:
			case DATEADD:
			case DAY:
			case GETDATE:
			case MONTH:
			case YEAR:
			case NEWID:
			case AS:
			case IF:
			case TEXT:
			case DATE:
			case NAME:
			case VALUE:
			case ID:
			case CODE:
			case STATUS:
			case TYPE:
			case TIME:
			case RECOVERY:
			case SIMPLE:
			case LOG:
			case DATEDIFF:
			case SYSDATETIMEOFFSET:
			case SYSDATETIME:
			case CLUSTERED:
			case NONCLUSTERED:
			case USER:
			case ROLE:
			case DELIMITED_IDENTIFIER_BRACKET:
			case DELIMITED_IDENTIFIER_QUOTE:
			case IDENTIFIER:
				{
				setState(413);
				identifier();
				}
				break;
			case USER_VARIABLE:
				{
				setState(414);
				match(USER_VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(417);
			match(EQUAL);
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(418);
				value();
				}
				break;
			case 2:
				{
				setState(419);
				expression(0);
				}
				break;
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(SQLGrammarParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SQLGrammarParser.SEMICOLON, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(RETURN);
			setState(423);
			expression(0);
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(424);
				match(SEMICOLON);
				}
				break;
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
	public static class TableElementContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public TableElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterTableElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitTableElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitTableElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableElementContext tableElement() throws RecognitionException {
		TableElementContext _localctx = new TableElementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tableElement);
		try {
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FULL:
			case ON:
			case NULL:
			case KEY:
			case DATEADD:
			case DAY:
			case GETDATE:
			case MONTH:
			case YEAR:
			case NEWID:
			case AS:
			case IF:
			case TEXT:
			case DATE:
			case NAME:
			case VALUE:
			case ID:
			case CODE:
			case STATUS:
			case TYPE:
			case TIME:
			case RECOVERY:
			case SIMPLE:
			case LOG:
			case DATEDIFF:
			case SYSDATETIMEOFFSET:
			case SYSDATETIME:
			case CLUSTERED:
			case NONCLUSTERED:
			case USER:
			case ROLE:
			case DELIMITED_IDENTIFIER_BRACKET:
			case DELIMITED_IDENTIFIER_QUOTE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				columnDefinition();
				}
				break;
			case CONSTRAINT:
			case PRIMARY:
			case FOREIGN:
			case UNIQUE:
			case CHECK:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				tableConstraint();
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
	public static class ColumnDefinitionContext extends ParserRuleContext {
		public IdentifierContext columnName;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLGrammarParser.AS, 0); }
		public TerminalNode LPAREN() { return getToken(SQLGrammarParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SQLGrammarParser.RPAREN, 0); }
		public List<ColumnConstraintContext> columnConstraint() {
			return getRuleContexts(ColumnConstraintContext.class);
		}
		public ColumnConstraintContext columnConstraint(int i) {
			return getRuleContext(ColumnConstraintContext.class,i);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			((ColumnDefinitionContext)_localctx).columnName = identifier();
			setState(451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIMESTAMP:
			case NCHAR:
			case VARCHAR:
			case NVARCHAR:
			case INT:
			case INTEGER:
			case CHAR:
			case TEXT:
			case DATE:
			case DATETIME:
			case DECIMAL:
			case MONEY:
			case BIT:
			case BIGINT:
			case SMALLINT:
			case TINYINT:
			case VARBINARY:
			case BINARY:
			case FLOAT:
			case REAL:
			case DATETIME2:
			case UNIQUEIDENTIFIER:
			case XML:
			case JSON:
			case INTERVAL:
			case DOUBLE:
			case TIME:
			case NUMERIC:
				{
				{
				setState(432);
				dataType();
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 46214674349293568L) != 0) || _la==IDENTITY || _la==CHECK) {
					{
					{
					setState(433);
					columnConstraint();
					}
					}
					setState(438);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(439);
					match(AS);
					setState(440);
					match(LPAREN);
					setState(441);
					expression(0);
					setState(442);
					match(RPAREN);
					}
				}

				}
				}
				break;
			case AS:
				{
				{
				setState(446);
				match(AS);
				setState(447);
				match(LPAREN);
				setState(448);
				expression(0);
				setState(449);
				match(RPAREN);
				}
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
	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(SQLGrammarParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(SQLGrammarParser.PRECISION, 0); }
		public TerminalNode FLOAT() { return getToken(SQLGrammarParser.FLOAT, 0); }
		public TerminalNode REAL() { return getToken(SQLGrammarParser.REAL, 0); }
		public TerminalNode VARCHAR() { return getToken(SQLGrammarParser.VARCHAR, 0); }
		public TerminalNode NVARCHAR() { return getToken(SQLGrammarParser.NVARCHAR, 0); }
		public TerminalNode CHAR() { return getToken(SQLGrammarParser.CHAR, 0); }
		public TerminalNode NCHAR() { return getToken(SQLGrammarParser.NCHAR, 0); }
		public TerminalNode BINARY() { return getToken(SQLGrammarParser.BINARY, 0); }
		public TerminalNode VARBINARY() { return getToken(SQLGrammarParser.VARBINARY, 0); }
		public TerminalNode LPAREN() { return getToken(SQLGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SQLGrammarParser.RPAREN, 0); }
		public TerminalNode COLLATE() { return getToken(SQLGrammarParser.COLLATE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SQLGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SQLGrammarParser.NUMBER, i);
		}
		public TerminalNode MAX() { return getToken(SQLGrammarParser.MAX, 0); }
		public TerminalNode DECIMAL() { return getToken(SQLGrammarParser.DECIMAL, 0); }
		public TerminalNode NUMERIC() { return getToken(SQLGrammarParser.NUMERIC, 0); }
		public TerminalNode COMMA() { return getToken(SQLGrammarParser.COMMA, 0); }
		public TerminalNode INT() { return getToken(SQLGrammarParser.INT, 0); }
		public TerminalNode INTEGER() { return getToken(SQLGrammarParser.INTEGER, 0); }
		public TerminalNode BIGINT() { return getToken(SQLGrammarParser.BIGINT, 0); }
		public TerminalNode SMALLINT() { return getToken(SQLGrammarParser.SMALLINT, 0); }
		public TerminalNode TINYINT() { return getToken(SQLGrammarParser.TINYINT, 0); }
		public TerminalNode DATE() { return getToken(SQLGrammarParser.DATE, 0); }
		public TerminalNode DATETIME() { return getToken(SQLGrammarParser.DATETIME, 0); }
		public TerminalNode DATETIME2() { return getToken(SQLGrammarParser.DATETIME2, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SQLGrammarParser.TIMESTAMP, 0); }
		public TerminalNode TIME() { return getToken(SQLGrammarParser.TIME, 0); }
		public TerminalNode TEXT() { return getToken(SQLGrammarParser.TEXT, 0); }
		public TerminalNode BIT() { return getToken(SQLGrammarParser.BIT, 0); }
		public TerminalNode MONEY() { return getToken(SQLGrammarParser.MONEY, 0); }
		public TerminalNode UNIQUEIDENTIFIER() { return getToken(SQLGrammarParser.UNIQUEIDENTIFIER, 0); }
		public TerminalNode XML() { return getToken(SQLGrammarParser.XML, 0); }
		public TerminalNode JSON() { return getToken(SQLGrammarParser.JSON, 0); }
		public TerminalNode INTERVAL() { return getToken(SQLGrammarParser.INTERVAL, 0); }
		public TerminalNode TO() { return getToken(SQLGrammarParser.TO, 0); }
		public TerminalNode DAY() { return getToken(SQLGrammarParser.DAY, 0); }
		public List<TerminalNode> HOUR() { return getTokens(SQLGrammarParser.HOUR); }
		public TerminalNode HOUR(int i) {
			return getToken(SQLGrammarParser.HOUR, i);
		}
		public List<TerminalNode> MINUTE() { return getTokens(SQLGrammarParser.MINUTE); }
		public TerminalNode MINUTE(int i) {
			return getToken(SQLGrammarParser.MINUTE, i);
		}
		public List<TerminalNode> SECOND() { return getTokens(SQLGrammarParser.SECOND); }
		public TerminalNode SECOND(int i) {
			return getToken(SQLGrammarParser.SECOND, i);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dataType);
		int _la;
		try {
			setState(504);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				match(DOUBLE);
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRECISION) {
					{
					setState(454);
					match(PRECISION);
					}
				}

				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				match(FLOAT);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(458);
				match(REAL);
				}
				break;
			case NCHAR:
			case VARCHAR:
			case NVARCHAR:
			case CHAR:
			case VARBINARY:
			case BINARY:
				enterOuterAlt(_localctx, 4);
				{
				setState(459);
				_la = _input.LA(1);
				if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 10696049115004929L) != 0) || _la==VARBINARY || _la==BINARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(460);
					match(LPAREN);
					setState(461);
					_la = _input.LA(1);
					if ( !(_la==MAX || _la==NUMBER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(462);
					match(RPAREN);
					}
				}

				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(465);
					match(COLLATE);
					setState(466);
					identifier();
					}
				}

				}
				break;
			case DECIMAL:
			case NUMERIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(469);
				_la = _input.LA(1);
				if ( !(_la==DECIMAL || _la==NUMERIC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(470);
					match(LPAREN);
					setState(471);
					match(NUMBER);
					setState(474);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(472);
						match(COMMA);
						setState(473);
						match(NUMBER);
						}
					}

					setState(476);
					match(RPAREN);
					}
				}

				}
				break;
			case INT:
				enterOuterAlt(_localctx, 6);
				{
				setState(479);
				match(INT);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 7);
				{
				setState(480);
				match(INTEGER);
				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 8);
				{
				setState(481);
				match(BIGINT);
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 9);
				{
				setState(482);
				match(SMALLINT);
				}
				break;
			case TINYINT:
				enterOuterAlt(_localctx, 10);
				{
				setState(483);
				match(TINYINT);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 11);
				{
				setState(484);
				match(DATE);
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 12);
				{
				setState(485);
				match(DATETIME);
				}
				break;
			case DATETIME2:
				enterOuterAlt(_localctx, 13);
				{
				setState(486);
				match(DATETIME2);
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(487);
					match(LPAREN);
					setState(488);
					match(NUMBER);
					setState(489);
					match(RPAREN);
					}
				}

				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 14);
				{
				setState(492);
				match(TIMESTAMP);
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 15);
				{
				setState(493);
				match(TIME);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 16);
				{
				setState(494);
				match(TEXT);
				}
				break;
			case BIT:
				enterOuterAlt(_localctx, 17);
				{
				setState(495);
				match(BIT);
				}
				break;
			case MONEY:
				enterOuterAlt(_localctx, 18);
				{
				setState(496);
				match(MONEY);
				}
				break;
			case UNIQUEIDENTIFIER:
				enterOuterAlt(_localctx, 19);
				{
				setState(497);
				match(UNIQUEIDENTIFIER);
				}
				break;
			case XML:
				enterOuterAlt(_localctx, 20);
				{
				setState(498);
				match(XML);
				}
				break;
			case JSON:
				enterOuterAlt(_localctx, 21);
				{
				setState(499);
				match(JSON);
				}
				break;
			case INTERVAL:
				enterOuterAlt(_localctx, 22);
				{
				setState(500);
				match(INTERVAL);
				setState(501);
				_la = _input.LA(1);
				if ( !(_la==DAY || ((((_la - 190)) & ~0x3f) == 0 && ((1L << (_la - 190)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(502);
				match(TO);
				setState(503);
				_la = _input.LA(1);
				if ( !(((((_la - 190)) & ~0x3f) == 0 && ((1L << (_la - 190)) & 7L) != 0)) ) {
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
	public static class ColumnConstraintContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(SQLGrammarParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(SQLGrammarParser.KEY, 0); }
		public TerminalNode NOT() { return getToken(SQLGrammarParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SQLGrammarParser.NULL, 0); }
		public TerminalNode UNIQUE() { return getToken(SQLGrammarParser.UNIQUE, 0); }
		public TerminalNode IDENTITY() { return getToken(SQLGrammarParser.IDENTITY, 0); }
		public TerminalNode DEFAULT() { return getToken(SQLGrammarParser.DEFAULT, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(SQLGrammarParser.CHECK, 0); }
		public TerminalNode LPAREN() { return getToken(SQLGrammarParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SQLGrammarParser.RPAREN, 0); }
		public TerminalNode REFERENCES() { return getToken(SQLGrammarParser.REFERENCES, 0); }
		public FullIdentifierContext fullIdentifier() {
			return getRuleContext(FullIdentifierContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLGrammarParser.CONSTRAINT, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SQLGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SQLGrammarParser.NUMBER, i);
		}
		public List<TerminalNode> ON() { return getTokens(SQLGrammarParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(SQLGrammarParser.ON, i);
		}
		public TerminalNode DELETE() { return getToken(SQLGrammarParser.DELETE, 0); }
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public TerminalNode UPDATE() { return getToken(SQLGrammarParser.UPDATE, 0); }
		public TerminalNode CLUSTERED() { return getToken(SQLGrammarParser.CLUSTERED, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(SQLGrammarParser.NONCLUSTERED, 0); }
		public TerminalNode COMMA() { return getToken(SQLGrammarParser.COMMA, 0); }
		public ColumnConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterColumnConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitColumnConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitColumnConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnConstraintContext columnConstraint() throws RecognitionException {
		ColumnConstraintContext _localctx = new ColumnConstraintContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_columnConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(506);
				match(CONSTRAINT);
				setState(507);
				identifier();
				}
			}

			setState(557);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				{
				setState(510);
				match(PRIMARY);
				setState(511);
				match(KEY);
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTERED || _la==NONCLUSTERED) {
					{
					setState(512);
					_la = _input.LA(1);
					if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
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
				break;
			case NOT:
				{
				setState(515);
				match(NOT);
				setState(516);
				match(NULL);
				}
				break;
			case NULL:
				{
				setState(517);
				match(NULL);
				}
				break;
			case UNIQUE:
				{
				setState(518);
				match(UNIQUE);
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTERED || _la==NONCLUSTERED) {
					{
					setState(519);
					_la = _input.LA(1);
					if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
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
				break;
			case IDENTITY:
				{
				setState(522);
				match(IDENTITY);
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(523);
					match(LPAREN);
					setState(524);
					match(NUMBER);
					setState(527);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(525);
						match(COMMA);
						setState(526);
						match(NUMBER);
						}
					}

					setState(529);
					match(RPAREN);
					}
				}

				}
				break;
			case DEFAULT:
				{
				setState(532);
				match(DEFAULT);
				setState(533);
				defaultValue();
				}
				break;
			case CHECK:
				{
				setState(534);
				match(CHECK);
				setState(535);
				match(LPAREN);
				setState(536);
				expression(0);
				setState(537);
				match(RPAREN);
				}
				break;
			case REFERENCES:
				{
				setState(539);
				match(REFERENCES);
				setState(540);
				fullIdentifier();
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(541);
					match(LPAREN);
					setState(542);
					identifier();
					setState(543);
					match(RPAREN);
					}
				}

				setState(550);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(547);
					match(ON);
					setState(548);
					match(DELETE);
					setState(549);
					action();
					}
					break;
				}
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(552);
					match(ON);
					setState(553);
					match(UPDATE);
					setState(554);
					action();
					}
				}

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
	public static class CreateTableContext extends ParserRuleContext {
		public FullIdentifierContext tableName;
		public TerminalNode CREATE() { return getToken(SQLGrammarParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SQLGrammarParser.TABLE, 0); }
		public TerminalNode LPAREN() { return getToken(SQLGrammarParser.LPAREN, 0); }
		public List<TableElementContext> tableElement() {
			return getRuleContexts(TableElementContext.class);
		}
		public TableElementContext tableElement(int i) {
			return getRuleContext(TableElementContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(SQLGrammarParser.RPAREN, 0); }
		public FullIdentifierContext fullIdentifier() {
			return getRuleContext(FullIdentifierContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLGrammarParser.COMMA, i);
		}
		public TerminalNode ON() { return getToken(SQLGrammarParser.ON, 0); }
		public List<FileGroupContext> fileGroup() {
			return getRuleContexts(FileGroupContext.class);
		}
		public FileGroupContext fileGroup(int i) {
			return getRuleContext(FileGroupContext.class,i);
		}
		public TerminalNode TEXTIMAGE_ON() { return getToken(SQLGrammarParser.TEXTIMAGE_ON, 0); }
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(CREATE);
			setState(560);
			match(TABLE);
			setState(561);
			((CreateTableContext)_localctx).tableName = fullIdentifier();
			setState(562);
			match(LPAREN);
			setState(563);
			tableElement();
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(564);
				match(COMMA);
				setState(565);
				tableElement();
				}
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(571);
			match(RPAREN);
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(572);
				match(ON);
				setState(573);
				fileGroup();
				}
			}

			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEXTIMAGE_ON) {
				{
				setState(576);
				match(TEXTIMAGE_ON);
				setState(577);
				fileGroup();
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
	public static class CreateDatabaseContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLGrammarParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(SQLGrammarParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CreateDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDatabase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterCreateDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitCreateDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitCreateDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDatabaseContext createDatabase() throws RecognitionException {
		CreateDatabaseContext _localctx = new CreateDatabaseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_createDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(CREATE);
			setState(581);
			match(DATABASE);
			setState(582);
			identifier();
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
	public static class CreateSchemaContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLGrammarParser.CREATE, 0); }
		public TerminalNode SCHEMA() { return getToken(SQLGrammarParser.SCHEMA, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode AUTHORIZATION() { return getToken(SQLGrammarParser.AUTHORIZATION, 0); }
		public CreateSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterCreateSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitCreateSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitCreateSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateSchemaContext createSchema() throws RecognitionException {
		CreateSchemaContext _localctx = new CreateSchemaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_createSchema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(CREATE);
			setState(585);
			match(SCHEMA);
			setState(586);
			identifier();
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AUTHORIZATION) {
				{
				setState(587);
				match(AUTHORIZATION);
				setState(588);
				identifier();
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
	public static class CreateProcedureContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLGrammarParser.CREATE, 0); }
		public FullIdentifierContext fullIdentifier() {
			return getRuleContext(FullIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLGrammarParser.AS, 0); }
		public TerminalNode BEGIN() { return getToken(SQLGrammarParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(SQLGrammarParser.END, 0); }
		public TerminalNode PROCEDURE() { return getToken(SQLGrammarParser.PROCEDURE, 0); }
		public TerminalNode PROC() { return getToken(SQLGrammarParser.PROC, 0); }
		public TerminalNode LPAREN() { return getToken(SQLGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SQLGrammarParser.RPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SQLGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SQLGrammarParser.SEMICOLON, i);
		}
		public CreateProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createProcedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterCreateProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitCreateProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitCreateProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateProcedureContext createProcedure() throws RecognitionException {
		CreateProcedureContext _localctx = new CreateProcedureContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_createProcedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(CREATE);
			setState(592);
			_la = _input.LA(1);
			if ( !(_la==PROCEDURE || _la==PROC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(593);
			fullIdentifier();
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(594);
				match(LPAREN);
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140738637594624L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 27021597764362807L) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & 56228474955821059L) != 0) || ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & 15L) != 0)) {
					{
					setState(595);
					parameterList();
					}
				}

				setState(598);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(599);
				parameterList();
				}
				break;
			}
			setState(602);
			match(AS);
			setState(603);
			match(BEGIN);
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1924145471490L) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 4611686022990823561L) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & 576531121047601155L) != 0)) {
				{
				{
				setState(604);
				statement();
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(605);
					match(SEMICOLON);
					}
				}

				}
				}
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(613);
			match(END);
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
	public static class CreateFunctionContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLGrammarParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SQLGrammarParser.FUNCTION, 0); }
		public FullIdentifierContext fullIdentifier() {
			return getRuleContext(FullIdentifierContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(SQLGrammarParser.RETURNS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLGrammarParser.AS, 0); }
		public TerminalNode BEGIN() { return getToken(SQLGrammarParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(SQLGrammarParser.END, 0); }
		public TerminalNode LPAREN() { return getToken(SQLGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SQLGrammarParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SQLGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SQLGrammarParser.SEMICOLON, i);
		}
		public CreateFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFunctionContext createFunction() throws RecognitionException {
		CreateFunctionContext _localctx = new CreateFunctionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_createFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(CREATE);
			setState(616);
			match(FUNCTION);
			setState(617);
			fullIdentifier();
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(618);
				match(LPAREN);
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140738637594624L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 27021597764362807L) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & 56228474955821059L) != 0) || ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & 15L) != 0)) {
					{
					setState(619);
					parameterList();
					}
				}

				setState(622);
				match(RPAREN);
				}
			}

			setState(625);
			match(RETURNS);
			setState(626);
			dataType();
			setState(627);
			match(AS);
			setState(628);
			match(BEGIN);
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1924145471490L) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 4611686022990823561L) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & 576531121047601155L) != 0)) {
				{
				{
				setState(629);
				statement();
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(630);
					match(SEMICOLON);
					}
				}

				}
				}
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(638);
			match(END);
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
	public static class CreateIndexContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLGrammarParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(SQLGrammarParser.INDEX, 0); }
		public List<FullIdentifierContext> fullIdentifier() {
			return getRuleContexts(FullIdentifierContext.class);
		}
		public FullIdentifierContext fullIdentifier(int i) {
			return getRuleContext(FullIdentifierContext.class,i);
		}
		public TerminalNode ON() { return getToken(SQLGrammarParser.ON, 0); }
		public TerminalNode LPAREN() { return getToken(SQLGrammarParser.LPAREN, 0); }
		public List<IndexColumnContext> indexColumn() {
			return getRuleContexts(IndexColumnContext.class);
		}
		public IndexColumnContext indexColumn(int i) {
			return getRuleContext(IndexColumnContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(SQLGrammarParser.RPAREN, 0); }
		public TerminalNode UNIQUE() { return getToken(SQLGrammarParser.UNIQUE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLGrammarParser.COMMA, i);
		}
		public TerminalNode CLUSTERED() { return getToken(SQLGrammarParser.CLUSTERED, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(SQLGrammarParser.NONCLUSTERED, 0); }
		public CreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterCreateIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitCreateIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitCreateIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateIndexContext createIndex() throws RecognitionException {
		CreateIndexContext _localctx = new CreateIndexContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_createIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(CREATE);
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(641);
				match(UNIQUE);
				}
			}

			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(644);
				_la = _input.LA(1);
				if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(647);
			match(INDEX);
			setState(648);
			fullIdentifier();
			setState(649);
			match(ON);
			setState(650);
			fullIdentifier();
			setState(651);
			match(LPAREN);
			setState(652);
			indexColumn();
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(653);
				match(COMMA);
				setState(654);
				indexColumn();
				}
				}
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(660);
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
	public static class IndexColumnContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SQLGrammarParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLGrammarParser.DESC, 0); }
		public IndexColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterIndexColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitIndexColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitIndexColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexColumnContext indexColumn() throws RecognitionException {
		IndexColumnContext _localctx = new IndexColumnContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_indexColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			identifier();
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(663);
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
	public static class CreateViewContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLGrammarParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SQLGrammarParser.VIEW, 0); }
		public FullIdentifierContext fullIdentifier() {
			return getRuleContext(FullIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLGrammarParser.AS, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public CreateViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateViewContext createView() throws RecognitionException {
		CreateViewContext _localctx = new CreateViewContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_createView);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(CREATE);
			setState(667);
			match(VIEW);
			setState(668);
			fullIdentifier();
			setState(669);
			match(AS);
			setState(670);
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
	public static class AlterTableContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLGrammarParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SQLGrammarParser.TABLE, 0); }
		public FullIdentifierContext fullIdentifier() {
			return getRuleContext(FullIdentifierContext.class,0);
		}
		public List<AlterTableActionContext> alterTableAction() {
			return getRuleContexts(AlterTableActionContext.class);
		}
		public AlterTableActionContext alterTableAction(int i) {
			return getRuleContext(AlterTableActionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLGrammarParser.COMMA, i);
		}
		public AlterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterAlterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitAlterTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitAlterTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_alterTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			match(ALTER);
			setState(673);
			match(TABLE);
			setState(674);
			fullIdentifier();
			setState(675);
			alterTableAction();
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(676);
				match(COMMA);
				setState(677);
				alterTableAction();
				}
				}
				setState(682);
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
	public static class AlterTableActionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SQLGrammarParser.ADD, 0); }
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SQLGrammarParser.DROP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SQLGrammarParser.COLUMN, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SQLGrammarParser.CONSTRAINT, 0); }
		public TerminalNode ALTER() { return getToken(SQLGrammarParser.ALTER, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public AlterTableActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterAlterTableAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitAlterTableAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitAlterTableAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableActionContext alterTableAction() throws RecognitionException {
		AlterTableActionContext _localctx = new AlterTableActionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_alterTableAction);
		int _la;
		try {
			setState(698);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(683);
				match(ADD);
				setState(686);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FULL:
				case ON:
				case NULL:
				case KEY:
				case DATEADD:
				case DAY:
				case GETDATE:
				case MONTH:
				case YEAR:
				case NEWID:
				case AS:
				case IF:
				case TEXT:
				case DATE:
				case NAME:
				case VALUE:
				case ID:
				case CODE:
				case STATUS:
				case TYPE:
				case TIME:
				case RECOVERY:
				case SIMPLE:
				case LOG:
				case DATEDIFF:
				case SYSDATETIMEOFFSET:
				case SYSDATETIME:
				case CLUSTERED:
				case NONCLUSTERED:
				case USER:
				case ROLE:
				case DELIMITED_IDENTIFIER_BRACKET:
				case DELIMITED_IDENTIFIER_QUOTE:
				case IDENTIFIER:
					{
					setState(684);
					columnDefinition();
					}
					break;
				case CONSTRAINT:
				case PRIMARY:
				case FOREIGN:
				case UNIQUE:
				case CHECK:
					{
					setState(685);
					tableConstraint();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(688);
				match(DROP);
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT || _la==COLUMN) {
					{
					setState(689);
					_la = _input.LA(1);
					if ( !(_la==CONSTRAINT || _la==COLUMN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(692);
				identifier();
				}
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(693);
				match(ALTER);
				setState(694);
				match(COLUMN);
				setState(695);
				identifier();
				setState(696);
				dataType();
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
	public static class AlterDatabaseContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLGrammarParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(SQLGrammarParser.DATABASE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode MODIFY() { return getToken(SQLGrammarParser.MODIFY, 0); }
		public TerminalNode NAME() { return getToken(SQLGrammarParser.NAME, 0); }
		public TerminalNode EQUAL() { return getToken(SQLGrammarParser.EQUAL, 0); }
		public TerminalNode SET() { return getToken(SQLGrammarParser.SET, 0); }
		public AlterDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDatabase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterAlterDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitAlterDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitAlterDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterDatabaseContext alterDatabase() throws RecognitionException {
		AlterDatabaseContext _localctx = new AlterDatabaseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_alterDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(ALTER);
			setState(701);
			match(DATABASE);
			setState(702);
			identifier();
			setState(711);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODIFY:
				{
				setState(703);
				match(MODIFY);
				setState(704);
				match(NAME);
				setState(705);
				match(EQUAL);
				setState(706);
				identifier();
				}
				break;
			case SET:
				{
				setState(707);
				match(SET);
				setState(708);
				identifier();
				setState(709);
				identifier();
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
	public static class AlterIndexContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLGrammarParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(SQLGrammarParser.INDEX, 0); }
		public TerminalNode ON() { return getToken(SQLGrammarParser.ON, 0); }
		public FullIdentifierContext fullIdentifier() {
			return getRuleContext(FullIdentifierContext.class,0);
		}
		public TerminalNode REBUILD() { return getToken(SQLGrammarParser.REBUILD, 0); }
		public TerminalNode DISABLE() { return getToken(SQLGrammarParser.DISABLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SQLGrammarParser.ALL, 0); }
		public AlterIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterAlterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitAlterIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitAlterIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterIndexContext alterIndex() throws RecognitionException {
		AlterIndexContext _localctx = new AlterIndexContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_alterIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(ALTER);
			setState(714);
			match(INDEX);
			setState(717);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FULL:
			case ON:
			case NULL:
			case KEY:
			case DATEADD:
			case DAY:
			case GETDATE:
			case MONTH:
			case YEAR:
			case NEWID:
			case AS:
			case IF:
			case TEXT:
			case DATE:
			case NAME:
			case VALUE:
			case ID:
			case CODE:
			case STATUS:
			case TYPE:
			case TIME:
			case RECOVERY:
			case SIMPLE:
			case LOG:
			case DATEDIFF:
			case SYSDATETIMEOFFSET:
			case SYSDATETIME:
			case CLUSTERED:
			case NONCLUSTERED:
			case USER:
			case ROLE:
			case DELIMITED_IDENTIFIER_BRACKET:
			case DELIMITED_IDENTIFIER_QUOTE:
			case IDENTIFIER:
				{
				setState(715);
				identifier();
				}
				break;
			case ALL:
				{
				setState(716);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(719);
			match(ON);
			setState(720);
			fullIdentifier();
			setState(721);
			_la = _input.LA(1);
			if ( !(_la==REBUILD || _la==DISABLE) ) {
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
	public static class AlterViewContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLGrammarParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(SQLGrammarParser.VIEW, 0); }
		public FullIdentifierContext fullIdentifier() {
			return getRuleContext(FullIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLGrammarParser.AS, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public AlterViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterAlterView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitAlterView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitAlterView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterViewContext alterView() throws RecognitionException {
		AlterViewContext _localctx = new AlterViewContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_alterView);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(ALTER);
			setState(724);
			match(VIEW);
			setState(725);
			fullIdentifier();
			setState(726);
			match(AS);
			setState(727);
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
	public static class AlterProcedureContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLGrammarParser.ALTER, 0); }
		public FullIdentifierContext fullIdentifier() {
			return getRuleContext(FullIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLGrammarParser.AS, 0); }
		public TerminalNode BEGIN() { return getToken(SQLGrammarParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(SQLGrammarParser.END, 0); }
		public TerminalNode PROCEDURE() { return getToken(SQLGrammarParser.PROCEDURE, 0); }
		public TerminalNode PROC() { return getToken(SQLGrammarParser.PROC, 0); }
		public TerminalNode LPAREN() { return getToken(SQLGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SQLGrammarParser.RPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SQLGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SQLGrammarParser.SEMICOLON, i);
		}
		public AlterProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterProcedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterAlterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitAlterProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitAlterProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterProcedureContext alterProcedure() throws RecognitionException {
		AlterProcedureContext _localctx = new AlterProcedureContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_alterProcedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(ALTER);
			setState(730);
			_la = _input.LA(1);
			if ( !(_la==PROCEDURE || _la==PROC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(731);
			fullIdentifier();
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(732);
				match(LPAREN);
				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140738637594624L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 27021597764362807L) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & 56228474955821059L) != 0) || ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & 15L) != 0)) {
					{
					setState(733);
					parameterList();
					}
				}

				setState(736);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(737);
				parameterList();
				}
				break;
			}
			setState(740);
			match(AS);
			setState(741);
			match(BEGIN);
			setState(748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1924145471490L) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 4611686022990823561L) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & 576531121047601155L) != 0)) {
				{
				{
				setState(742);
				statement();
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(743);
					match(SEMICOLON);
					}
				}

				}
				}
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(751);
			match(END);
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
	public static class AlterFunctionContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLGrammarParser.ALTER, 0); }
		public TerminalNode FUNCTION() { return getToken(SQLGrammarParser.FUNCTION, 0); }
		public FullIdentifierContext fullIdentifier() {
			return getRuleContext(FullIdentifierContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(SQLGrammarParser.RETURNS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLGrammarParser.AS, 0); }
		public TerminalNode BEGIN() { return getToken(SQLGrammarParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(SQLGrammarParser.END, 0); }
		public TerminalNode LPAREN() { return getToken(SQLGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SQLGrammarParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SQLGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SQLGrammarParser.SEMICOLON, i);
		}
		public AlterFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterAlterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitAlterFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitAlterFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterFunctionContext alterFunction() throws RecognitionException {
		AlterFunctionContext _localctx = new AlterFunctionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_alterFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(ALTER);
			setState(754);
			match(FUNCTION);
			setState(755);
			fullIdentifier();
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(756);
				match(LPAREN);
				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140738637594624L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 27021597764362807L) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & 56228474955821059L) != 0) || ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & 15L) != 0)) {
					{
					setState(757);
					parameterList();
					}
				}

				setState(760);
				match(RPAREN);
				}
			}

			setState(763);
			match(RETURNS);
			setState(764);
			dataType();
			setState(765);
			match(AS);
			setState(766);
			match(BEGIN);
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1924145471490L) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 4611686022990823561L) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & 576531121047601155L) != 0)) {
				{
				{
				setState(767);
				statement();
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(768);
					match(SEMICOLON);
					}
				}

				}
				}
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(776);
			match(END);
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
	public static class AlterSchemaContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLGrammarParser.ALTER, 0); }
		public TerminalNode SCHEMA() { return getToken(SQLGrammarParser.SCHEMA, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TRANSFER() { return getToken(SQLGrammarParser.TRANSFER, 0); }
		public FullIdentifierContext fullIdentifier() {
			return getRuleContext(FullIdentifierContext.class,0);
		}
		public TerminalNode OBJECT() { return getToken(SQLGrammarParser.OBJECT, 0); }
		public TerminalNode DOUBLE_COLON() { return getToken(SQLGrammarParser.DOUBLE_COLON, 0); }
		public AlterSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterAlterSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitAlterSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitAlterSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterSchemaContext alterSchema() throws RecognitionException {
		AlterSchemaContext _localctx = new AlterSchemaContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_alterSchema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			match(ALTER);
			setState(779);
			match(SCHEMA);
			setState(780);
			identifier();
			setState(781);
			match(TRANSFER);
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBJECT) {
				{
				setState(782);
				match(OBJECT);
				setState(783);
				match(DOUBLE_COLON);
				}
			}

			setState(786);
			fullIdentifier();
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
	public static class TableConstraintContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(SQLGrammarParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(SQLGrammarParser.KEY, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(SQLGrammarParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(SQLGrammarParser.LPAREN, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(SQLGrammarParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(SQLGrammarParser.RPAREN, i);
		}
		public TerminalNode UNIQUE() { return getToken(SQLGrammarParser.UNIQUE, 0); }
		public TerminalNode FOREIGN() { return getToken(SQLGrammarParser.FOREIGN, 0); }
		public TerminalNode REFERENCES() { return getToken(SQLGrammarParser.REFERENCES, 0); }
		public FullIdentifierContext fullIdentifier() {
			return getRuleContext(FullIdentifierContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(SQLGrammarParser.CHECK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLGrammarParser.CONSTRAINT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLGrammarParser.COMMA, i);
		}
		public List<TerminalNode> ON() { return getTokens(SQLGrammarParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(SQLGrammarParser.ON, i);
		}
		public TerminalNode DELETE() { return getToken(SQLGrammarParser.DELETE, 0); }
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public TerminalNode UPDATE() { return getToken(SQLGrammarParser.UPDATE, 0); }
		public TerminalNode CLUSTERED() { return getToken(SQLGrammarParser.CLUSTERED, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(SQLGrammarParser.NONCLUSTERED, 0); }
		public TableConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterTableConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitTableConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitTableConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableConstraintContext tableConstraint() throws RecognitionException {
		TableConstraintContext _localctx = new TableConstraintContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_tableConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(788);
				match(CONSTRAINT);
				setState(789);
				identifier();
				}
			}

			setState(865);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				{
				setState(792);
				match(PRIMARY);
				setState(793);
				match(KEY);
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTERED || _la==NONCLUSTERED) {
					{
					setState(794);
					_la = _input.LA(1);
					if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(797);
				match(LPAREN);
				setState(798);
				identifier();
				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(799);
					match(COMMA);
					setState(800);
					identifier();
					}
					}
					setState(805);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(806);
				match(RPAREN);
				}
				break;
			case UNIQUE:
				{
				setState(808);
				match(UNIQUE);
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTERED || _la==NONCLUSTERED) {
					{
					setState(809);
					_la = _input.LA(1);
					if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(812);
				match(LPAREN);
				setState(813);
				identifier();
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(814);
					match(COMMA);
					setState(815);
					identifier();
					}
					}
					setState(820);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(821);
				match(RPAREN);
				}
				break;
			case FOREIGN:
				{
				setState(823);
				match(FOREIGN);
				setState(824);
				match(KEY);
				setState(825);
				match(LPAREN);
				setState(826);
				identifier();
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(827);
					match(COMMA);
					setState(828);
					identifier();
					}
					}
					setState(833);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(834);
				match(RPAREN);
				setState(835);
				match(REFERENCES);
				setState(836);
				fullIdentifier();
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(837);
					match(LPAREN);
					setState(838);
					identifier();
					setState(843);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(839);
						match(COMMA);
						setState(840);
						identifier();
						}
						}
						setState(845);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(846);
					match(RPAREN);
					}
				}

				setState(853);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(850);
					match(ON);
					setState(851);
					match(DELETE);
					setState(852);
					action();
					}
					break;
				}
				setState(858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(855);
					match(ON);
					setState(856);
					match(UPDATE);
					setState(857);
					action();
					}
				}

				}
				break;
			case CHECK:
				{
				setState(860);
				match(CHECK);
				setState(861);
				match(LPAREN);
				setState(862);
				expression(0);
				setState(863);
				match(RPAREN);
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
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLGrammarParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			parameter();
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(868);
				match(COMMA);
				setState(869);
				parameter();
				}
				}
				setState(874);
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
	public static class ParameterContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode USER_VARIABLE() { return getToken(SQLGrammarParser.USER_VARIABLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(SQLGrammarParser.EQUAL, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public TerminalNode OUTPUT() { return getToken(SQLGrammarParser.OUTPUT, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USER_VARIABLE:
				{
				setState(875);
				match(USER_VARIABLE);
				}
				break;
			case FULL:
			case ON:
			case NULL:
			case KEY:
			case DATEADD:
			case DAY:
			case GETDATE:
			case MONTH:
			case YEAR:
			case NEWID:
			case AS:
			case IF:
			case TEXT:
			case DATE:
			case NAME:
			case VALUE:
			case ID:
			case CODE:
			case STATUS:
			case TYPE:
			case TIME:
			case RECOVERY:
			case SIMPLE:
			case LOG:
			case DATEDIFF:
			case SYSDATETIMEOFFSET:
			case SYSDATETIME:
			case CLUSTERED:
			case NONCLUSTERED:
			case USER:
			case ROLE:
			case DELIMITED_IDENTIFIER_BRACKET:
			case DELIMITED_IDENTIFIER_QUOTE:
			case IDENTIFIER:
				{
				setState(876);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(879);
			dataType();
			setState(882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(880);
				match(EQUAL);
				setState(881);
				defaultValue();
				}
			}

			setState(885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUTPUT) {
				{
				setState(884);
				match(OUTPUT);
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
	public static class FileGroupContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode PRIMARY() { return getToken(SQLGrammarParser.PRIMARY, 0); }
		public FileGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterFileGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitFileGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitFileGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileGroupContext fileGroup() throws RecognitionException {
		FileGroupContext _localctx = new FileGroupContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_fileGroup);
		try {
			setState(889);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FULL:
			case ON:
			case NULL:
			case KEY:
			case DATEADD:
			case DAY:
			case GETDATE:
			case MONTH:
			case YEAR:
			case NEWID:
			case AS:
			case IF:
			case TEXT:
			case DATE:
			case NAME:
			case VALUE:
			case ID:
			case CODE:
			case STATUS:
			case TYPE:
			case TIME:
			case RECOVERY:
			case SIMPLE:
			case LOG:
			case DATEDIFF:
			case SYSDATETIMEOFFSET:
			case SYSDATETIME:
			case CLUSTERED:
			case NONCLUSTERED:
			case USER:
			case ROLE:
			case DELIMITED_IDENTIFIER_BRACKET:
			case DELIMITED_IDENTIFIER_QUOTE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(887);
				identifier();
				}
				break;
			case PRIMARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(888);
				match(PRIMARY);
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
	public static class ActionContext extends ParserRuleContext {
		public TerminalNode CASCADE() { return getToken(SQLGrammarParser.CASCADE, 0); }
		public TerminalNode NO() { return getToken(SQLGrammarParser.NO, 0); }
		public TerminalNode ACTION() { return getToken(SQLGrammarParser.ACTION, 0); }
		public TerminalNode SET() { return getToken(SQLGrammarParser.SET, 0); }
		public TerminalNode NULL() { return getToken(SQLGrammarParser.NULL, 0); }
		public TerminalNode DEFAULT() { return getToken(SQLGrammarParser.DEFAULT, 0); }
		public TerminalNode RESTRICT() { return getToken(SQLGrammarParser.RESTRICT, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_action);
		try {
			setState(899);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(891);
				match(CASCADE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(892);
				match(NO);
				setState(893);
				match(ACTION);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(894);
				match(SET);
				setState(895);
				match(NULL);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(896);
				match(SET);
				setState(897);
				match(DEFAULT);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(898);
				match(RESTRICT);
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
	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SQLGrammarParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(SQLGrammarParser.NUMBER, 0); }
		public TerminalNode MINUS() { return getToken(SQLGrammarParser.MINUS, 0); }
		public TerminalNode NULL() { return getToken(SQLGrammarParser.NULL, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SQLGrammarParser.CURRENT_TIMESTAMP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SQLGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SQLGrammarParser.RPAREN, 0); }
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
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_defaultValue);
		int _la;
		try {
			setState(924);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(901);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(902);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(904);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(903);
					match(MINUS);
					}
				}

				setState(906);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(907);
				match(NULL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(908);
				match(CURRENT_TIMESTAMP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(909);
				identifier();
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(910);
					match(LPAREN);
					setState(919);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9151455181991313408L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 27021597765411383L) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & 56228474955821059L) != 0) || ((((_la - 236)) & ~0x3f) == 0 && ((1L << (_la - 236)) & 125960203L) != 0)) {
						{
						setState(911);
						expression(0);
						setState(916);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(912);
							match(COMMA);
							setState(913);
							expression(0);
							}
							}
							setState(918);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(921);
					match(RPAREN);
					}
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
	public static class ColumnListContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SQLGrammarParser.STAR, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLGrammarParser.COMMA, i);
		}
		public ColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterColumnList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitColumnList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitColumnList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnListContext columnList() throws RecognitionException {
		ColumnListContext _localctx = new ColumnListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_columnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(926);
				match(STAR);
				}
				break;
			case FULL:
			case ON:
			case NULL:
			case KEY:
			case DATEADD:
			case DAY:
			case GETDATE:
			case MONTH:
			case YEAR:
			case NEWID:
			case AS:
			case IF:
			case TEXT:
			case DATE:
			case NAME:
			case VALUE:
			case ID:
			case CODE:
			case STATUS:
			case TYPE:
			case TIME:
			case RECOVERY:
			case SIMPLE:
			case LOG:
			case DATEDIFF:
			case SYSDATETIMEOFFSET:
			case SYSDATETIME:
			case CLUSTERED:
			case NONCLUSTERED:
			case USER:
			case ROLE:
			case DELIMITED_IDENTIFIER_BRACKET:
			case DELIMITED_IDENTIFIER_QUOTE:
			case IDENTIFIER:
				{
				setState(927);
				identifier();
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(928);
					match(COMMA);
					setState(929);
					identifier();
					}
					}
					setState(934);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLGrammarParser.IDENTIFIER, 0); }
		public TerminalNode DELIMITED_IDENTIFIER_BRACKET() { return getToken(SQLGrammarParser.DELIMITED_IDENTIFIER_BRACKET, 0); }
		public TerminalNode DELIMITED_IDENTIFIER_QUOTE() { return getToken(SQLGrammarParser.DELIMITED_IDENTIFIER_QUOTE, 0); }
		public AnyKeywordAsIdentifierContext anyKeywordAsIdentifier() {
			return getRuleContext(AnyKeywordAsIdentifierContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_identifier);
		try {
			setState(941);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(937);
				match(IDENTIFIER);
				}
				break;
			case DELIMITED_IDENTIFIER_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(938);
				match(DELIMITED_IDENTIFIER_BRACKET);
				}
				break;
			case DELIMITED_IDENTIFIER_QUOTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(939);
				match(DELIMITED_IDENTIFIER_QUOTE);
				}
				break;
			case FULL:
			case ON:
			case NULL:
			case KEY:
			case DATEADD:
			case DAY:
			case GETDATE:
			case MONTH:
			case YEAR:
			case NEWID:
			case AS:
			case IF:
			case TEXT:
			case DATE:
			case NAME:
			case VALUE:
			case ID:
			case CODE:
			case STATUS:
			case TYPE:
			case TIME:
			case RECOVERY:
			case SIMPLE:
			case LOG:
			case DATEDIFF:
			case SYSDATETIMEOFFSET:
			case SYSDATETIME:
			case CLUSTERED:
			case NONCLUSTERED:
			case USER:
			case ROLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(940);
				anyKeywordAsIdentifier();
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
	public static class AnyKeywordAsIdentifierContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SQLGrammarParser.NAME, 0); }
		public TerminalNode VALUE() { return getToken(SQLGrammarParser.VALUE, 0); }
		public TerminalNode ID() { return getToken(SQLGrammarParser.ID, 0); }
		public TerminalNode CODE() { return getToken(SQLGrammarParser.CODE, 0); }
		public TerminalNode STATUS() { return getToken(SQLGrammarParser.STATUS, 0); }
		public TerminalNode TYPE() { return getToken(SQLGrammarParser.TYPE, 0); }
		public TerminalNode DATE() { return getToken(SQLGrammarParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(SQLGrammarParser.TIME, 0); }
		public TerminalNode TEXT() { return getToken(SQLGrammarParser.TEXT, 0); }
		public TerminalNode RECOVERY() { return getToken(SQLGrammarParser.RECOVERY, 0); }
		public TerminalNode FULL() { return getToken(SQLGrammarParser.FULL, 0); }
		public TerminalNode SIMPLE() { return getToken(SQLGrammarParser.SIMPLE, 0); }
		public TerminalNode LOG() { return getToken(SQLGrammarParser.LOG, 0); }
		public TerminalNode GETDATE() { return getToken(SQLGrammarParser.GETDATE, 0); }
		public TerminalNode DATEADD() { return getToken(SQLGrammarParser.DATEADD, 0); }
		public TerminalNode DATEDIFF() { return getToken(SQLGrammarParser.DATEDIFF, 0); }
		public TerminalNode NEWID() { return getToken(SQLGrammarParser.NEWID, 0); }
		public TerminalNode SYSDATETIMEOFFSET() { return getToken(SQLGrammarParser.SYSDATETIMEOFFSET, 0); }
		public TerminalNode SYSDATETIME() { return getToken(SQLGrammarParser.SYSDATETIME, 0); }
		public TerminalNode CLUSTERED() { return getToken(SQLGrammarParser.CLUSTERED, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(SQLGrammarParser.NONCLUSTERED, 0); }
		public TerminalNode AS() { return getToken(SQLGrammarParser.AS, 0); }
		public TerminalNode IF() { return getToken(SQLGrammarParser.IF, 0); }
		public TerminalNode NULL() { return getToken(SQLGrammarParser.NULL, 0); }
		public TerminalNode ON() { return getToken(SQLGrammarParser.ON, 0); }
		public TerminalNode YEAR() { return getToken(SQLGrammarParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(SQLGrammarParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(SQLGrammarParser.DAY, 0); }
		public TerminalNode USER() { return getToken(SQLGrammarParser.USER, 0); }
		public TerminalNode ROLE() { return getToken(SQLGrammarParser.ROLE, 0); }
		public TerminalNode KEY() { return getToken(SQLGrammarParser.KEY, 0); }
		public AnyKeywordAsIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyKeywordAsIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterAnyKeywordAsIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitAnyKeywordAsIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitAnyKeywordAsIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyKeywordAsIdentifierContext anyKeywordAsIdentifier() throws RecognitionException {
		AnyKeywordAsIdentifierContext _localctx = new AnyKeywordAsIdentifierContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_anyKeywordAsIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 140738637594624L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 27021597764362807L) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & 56228474955821059L) != 0)) ) {
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
	public static class FullIdentifierContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLGrammarParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLGrammarParser.DOT, i);
		}
		public FullIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterFullIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitFullIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitFullIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullIdentifierContext fullIdentifier() throws RecognitionException {
		FullIdentifierContext _localctx = new FullIdentifierContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_fullIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			identifier();
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(946);
				match(DOT);
				setState(947);
				identifier();
				}
				}
				setState(952);
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
	public static class ValueListContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLGrammarParser.COMMA, i);
		}
		public ValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			value();
			setState(958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(954);
				match(COMMA);
				setState(955);
				value();
				}
				}
				setState(960);
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
	public static class ValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SQLGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SQLGrammarParser.RPAREN, 0); }
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
		public TerminalNode USER_VARIABLE() { return getToken(SQLGrammarParser.USER_VARIABLE, 0); }
		public TerminalNode NUMBER() { return getToken(SQLGrammarParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(SQLGrammarParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(SQLGrammarParser.NULL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_value);
		int _la;
		try {
			setState(980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(961);
				identifier();
				setState(974);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(962);
					match(LPAREN);
					setState(971);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9151455181991313408L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 27021597765411383L) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & 56228474955821059L) != 0) || ((((_la - 236)) & ~0x3f) == 0 && ((1L << (_la - 236)) & 125960203L) != 0)) {
						{
						setState(963);
						expression(0);
						setState(968);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(964);
							match(COMMA);
							setState(965);
							expression(0);
							}
							}
							setState(970);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(973);
					match(RPAREN);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(976);
				match(USER_VARIABLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(977);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(978);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(979);
				match(NULL);
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
		enterRule(_localctx, 104, RULE_cursor_statement);
		try {
			setState(985);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(982);
				declare_cursor();
				}
				break;
			case OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(983);
				open_cursor();
				}
				break;
			case FETCH:
				enterOuterAlt(_localctx, 3);
				{
				setState(984);
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
		enterRule(_localctx, 106, RULE_declare_cursor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			match(DECLARE);
			setState(988);
			cursor_name();
			setState(989);
			match(CURSOR);
			setState(991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL || _la==GLOBAL) {
				{
				setState(990);
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

			setState(994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORWARD_ONLY || _la==SCROLL) {
				{
				setState(993);
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

			setState(997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 15L) != 0)) {
				{
				setState(996);
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

			setState(1000);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & 7L) != 0)) {
				{
				setState(999);
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

			setState(1003);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE_WARNING) {
				{
				setState(1002);
				match(TYPE_WARNING);
				}
			}

			setState(1005);
			match(FOR);
			setState(1006);
			select_statement();
			setState(1020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(1007);
				match(FOR);
				setState(1008);
				match(UPDATE);
				setState(1018);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OF) {
					{
					setState(1009);
					match(OF);
					setState(1010);
					column_name();
					setState(1015);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1011);
						match(COMMA);
						setState(1012);
						column_name();
						}
						}
						setState(1017);
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
		enterRule(_localctx, 108, RULE_open_cursor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1022);
			match(OPEN);
			setState(1028);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL:
			case IDENTIFIER:
				{
				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(1023);
					match(GLOBAL);
					}
				}

				setState(1026);
				cursor_name();
				}
				break;
			case USER_VARIABLE:
				{
				setState(1027);
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
		enterRule(_localctx, 110, RULE_fetch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030);
			match(FETCH);
			setState(1034);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & 33285996545L) != 0)) {
				{
				setState(1031);
				fetch_direction();
				setState(1032);
				match(FROM);
				}
			}

			setState(1041);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL:
			case IDENTIFIER:
				{
				setState(1037);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(1036);
					match(GLOBAL);
					}
				}

				setState(1039);
				cursor_name();
				}
				break;
			case USER_VARIABLE:
				{
				setState(1040);
				match(USER_VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(1043);
				match(INTO);
				setState(1044);
				match(USER_VARIABLE);
				setState(1049);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1045);
					match(COMMA);
					setState(1046);
					match(USER_VARIABLE);
					}
					}
					setState(1051);
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
		enterRule(_localctx, 112, RULE_fetch_direction);
		int _la;
		try {
			setState(1062);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1054);
				match(NEXT);
				}
				break;
			case PRIOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1055);
				match(PRIOR);
				}
				break;
			case FIRST:
				enterOuterAlt(_localctx, 3);
				{
				setState(1056);
				match(FIRST);
				}
				break;
			case LAST:
				enterOuterAlt(_localctx, 4);
				{
				setState(1057);
				match(LAST);
				}
				break;
			case ABSOLUTE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1058);
				match(ABSOLUTE);
				setState(1059);
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
				setState(1060);
				match(RELATIVE);
				setState(1061);
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
		enterRule(_localctx, 114, RULE_close_cursor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			match(CLOSE);
			setState(1070);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL:
			case DELIMITED_IDENTIFIER_BRACKET:
			case IDENTIFIER:
				{
				setState(1066);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(1065);
					match(GLOBAL);
					}
				}

				setState(1068);
				identifier_ref();
				}
				break;
			case USER_VARIABLE:
				{
				setState(1069);
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
		enterRule(_localctx, 116, RULE_deallocate_cursor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			match(DEALLOCATE);
			setState(1078);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL:
			case DELIMITED_IDENTIFIER_BRACKET:
			case IDENTIFIER:
				{
				setState(1074);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(1073);
					match(GLOBAL);
					}
				}

				setState(1076);
				identifier_ref();
				}
				break;
			case USER_VARIABLE:
				{
				setState(1077);
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
		enterRule(_localctx, 118, RULE_print_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1080);
			match(PRINT);
			setState(1085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9151455181991313408L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 27021597765411383L) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & 56228474955821059L) != 0) || ((((_la - 236)) & ~0x3f) == 0 && ((1L << (_la - 236)) & 125960203L) != 0)) {
				{
				setState(1083);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1081);
					expression(0);
					}
					break;
				case 2:
					{
					setState(1082);
					match(USER_VARIABLE);
					}
					break;
				}
				}
				setState(1087);
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
		enterRule(_localctx, 120, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
			match(WITH);
			setState(1089);
			common_table_expression();
			setState(1094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1090);
				match(COMMA);
				setState(1091);
				common_table_expression();
				}
				}
				setState(1096);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1097);
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
		enterRule(_localctx, 122, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			identifier_ref();
			setState(1104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1100);
				match(LPAREN);
				setState(1101);
				column_list();
				setState(1102);
				match(RPAREN);
				}
			}

			setState(1106);
			match(AS);
			setState(1107);
			match(LPAREN);
			setState(1108);
			select_statement();
			setState(1109);
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
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FULL:
			case ON:
			case NULL:
			case KEY:
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
			case QUOTENAME:
			case OBJECT_NAME:
			case DATEADD:
			case DAY:
			case GETDATE:
			case MONTH:
			case YEAR:
			case NEWID:
			case AS:
			case IF:
			case TEXT:
			case DATE:
			case NAME:
			case VALUE:
			case ID:
			case CODE:
			case STATUS:
			case TYPE:
			case TIME:
			case RECOVERY:
			case SIMPLE:
			case LOG:
			case DATEDIFF:
			case SYSDATETIMEOFFSET:
			case SYSDATETIME:
			case CLUSTERED:
			case NONCLUSTERED:
			case USER:
			case ROLE:
			case STRING:
			case HEX_STRING:
			case NUMBER:
			case LPAREN:
			case DELIMITED_IDENTIFIER_BRACKET:
			case DELIMITED_IDENTIFIER_QUOTE:
			case USER_VARIABLE:
			case IDENTIFIER:
				{
				setState(1112);
				primary_expression();
				}
				break;
			case NOT:
				{
				setState(1113);
				match(NOT);
				setState(1114);
				expression(4);
				}
				break;
			case CASE:
				{
				setState(1115);
				match(CASE);
				setState(1117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1116);
					when_clause();
					}
					}
					setState(1119); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1121);
					match(ELSE);
					setState(1122);
					expression(0);
					}
				}

				setState(1125);
				match(END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1174);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1129);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1130);
						_la = _input.LA(1);
						if ( !(((((_la - 248)) & ~0x3f) == 0 && ((1L << (_la - 248)) & 7L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1131);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1132);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1133);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1134);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1135);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1136);
						_la = _input.LA(1);
						if ( !(_la==LIKE || ((((_la - 240)) & ~0x3f) == 0 && ((1L << (_la - 240)) & 63L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1137);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1138);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1140);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1139);
							match(NOT);
							}
						}

						setState(1142);
						match(BETWEEN);
						setState(1143);
						expression(0);
						setState(1144);
						match(AND);
						setState(1145);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1147);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1148);
						match(AND);
						setState(1149);
						expression(4);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1150);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1151);
						match(OR);
						setState(1152);
						expression(3);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1153);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1155);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1154);
							match(NOT);
							}
						}

						setState(1157);
						match(IN);
						setState(1166);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
						case 1:
							{
							setState(1158);
							match(LPAREN);
							setState(1161);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case FULL:
							case ON:
							case NOT:
							case NULL:
							case KEY:
							case COUNT:
							case SUM:
							case AVG:
							case MIN:
							case MAX:
							case QUOTENAME:
							case OBJECT_NAME:
							case DATEADD:
							case DAY:
							case GETDATE:
							case MONTH:
							case YEAR:
							case NEWID:
							case AS:
							case IF:
							case CASE:
							case TEXT:
							case DATE:
							case NAME:
							case VALUE:
							case ID:
							case CODE:
							case STATUS:
							case TYPE:
							case TIME:
							case RECOVERY:
							case SIMPLE:
							case LOG:
							case DATEDIFF:
							case SYSDATETIMEOFFSET:
							case SYSDATETIME:
							case CLUSTERED:
							case NONCLUSTERED:
							case USER:
							case ROLE:
							case STRING:
							case HEX_STRING:
							case NUMBER:
							case LPAREN:
							case DELIMITED_IDENTIFIER_BRACKET:
							case DELIMITED_IDENTIFIER_QUOTE:
							case USER_VARIABLE:
							case IDENTIFIER:
								{
								setState(1159);
								expression_list();
								}
								break;
							case SELECT:
								{
								setState(1160);
								select_statement();
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(1163);
							match(RPAREN);
							}
							break;
						case 2:
							{
							setState(1165);
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
						setState(1168);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1169);
						match(IS);
						setState(1171);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1170);
							match(NOT);
							}
						}

						setState(1173);
						match(NULL);
						}
						break;
					}
					} 
				}
				setState(1178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
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
		enterRule(_localctx, 126, RULE_when_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			match(WHEN);
			setState(1180);
			expression(0);
			setState(1181);
			match(THEN);
			setState(1182);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 128, RULE_primary_expression);
		try {
			setState(1194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1184);
				column_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1185);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1186);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1187);
				match(USER_VARIABLE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1188);
				function_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1189);
				match(LPAREN);
				setState(1190);
				expression(0);
				setState(1191);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1193);
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
		enterRule(_localctx, 130, RULE_table_source);
		int _la;
		try {
			setState(1211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELIMITED_IDENTIFIER_BRACKET:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1196);
				identifier_ref();
				setState(1201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==IDENTIFIER) {
					{
					setState(1198);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(1197);
						match(AS);
						}
					}

					setState(1200);
					table_alias();
					}
				}

				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1203);
				match(LPAREN);
				setState(1204);
				select_statement();
				setState(1205);
				match(RPAREN);
				setState(1207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1206);
					match(AS);
					}
				}

				setState(1209);
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
		enterRule(_localctx, 132, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
				{
				setState(1213);
				match(INNER);
				}
				break;
			case LEFT:
				{
				setState(1214);
				match(LEFT);
				setState(1216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1215);
					match(OUTER);
					}
				}

				}
				break;
			case RIGHT:
				{
				setState(1218);
				match(RIGHT);
				setState(1220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1219);
					match(OUTER);
					}
				}

				}
				break;
			case CROSS:
				{
				setState(1222);
				match(CROSS);
				}
				break;
			case JOIN:
				break;
			default:
				break;
			}
			setState(1225);
			match(JOIN);
			setState(1226);
			table_source();
			setState(1227);
			match(ON);
			setState(1228);
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
		enterRule(_localctx, 134, RULE_group_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1230);
			match(GROUP);
			setState(1231);
			match(BY);
			setState(1232);
			group_by_item();
			setState(1237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1233);
				match(COMMA);
				setState(1234);
				group_by_item();
				}
				}
				setState(1239);
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
		enterRule(_localctx, 136, RULE_group_by_item);
		try {
			setState(1257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FULL:
			case ON:
			case NOT:
			case NULL:
			case KEY:
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
			case QUOTENAME:
			case OBJECT_NAME:
			case DATEADD:
			case DAY:
			case GETDATE:
			case MONTH:
			case YEAR:
			case NEWID:
			case AS:
			case IF:
			case CASE:
			case TEXT:
			case DATE:
			case NAME:
			case VALUE:
			case ID:
			case CODE:
			case STATUS:
			case TYPE:
			case TIME:
			case RECOVERY:
			case SIMPLE:
			case LOG:
			case DATEDIFF:
			case SYSDATETIMEOFFSET:
			case SYSDATETIME:
			case CLUSTERED:
			case NONCLUSTERED:
			case USER:
			case ROLE:
			case STRING:
			case HEX_STRING:
			case NUMBER:
			case LPAREN:
			case DELIMITED_IDENTIFIER_BRACKET:
			case DELIMITED_IDENTIFIER_QUOTE:
			case USER_VARIABLE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1240);
				expression(0);
				}
				break;
			case ROLLUP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1241);
				match(ROLLUP);
				setState(1242);
				match(LPAREN);
				setState(1243);
				expression_list();
				setState(1244);
				match(RPAREN);
				}
				break;
			case CUBE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1246);
				match(CUBE);
				setState(1247);
				match(LPAREN);
				setState(1248);
				expression_list();
				setState(1249);
				match(RPAREN);
				}
				break;
			case GROUPING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1251);
				match(GROUPING);
				setState(1252);
				match(SETS);
				setState(1253);
				match(LPAREN);
				setState(1254);
				grouping_set_list();
				setState(1255);
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
		enterRule(_localctx, 138, RULE_grouping_set_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			grouping_set();
			setState(1264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1260);
				match(COMMA);
				setState(1261);
				grouping_set();
				}
				}
				setState(1266);
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
		enterRule(_localctx, 140, RULE_grouping_set);
		int _la;
		try {
			setState(1273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1267);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1268);
				match(LPAREN);
				setState(1270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9151455181991313408L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 27021597765411383L) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & 56228474955821059L) != 0) || ((((_la - 236)) & ~0x3f) == 0 && ((1L << (_la - 236)) & 125960203L) != 0)) {
					{
					setState(1269);
					expression_list();
					}
				}

				setState(1272);
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
		enterRule(_localctx, 142, RULE_order_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			match(ORDER);
			setState(1276);
			match(BY);
			setState(1277);
			order_by_expression();
			setState(1282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1278);
				match(COMMA);
				setState(1279);
				order_by_expression();
				}
				}
				setState(1284);
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
		enterRule(_localctx, 144, RULE_order_by_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1285);
			expression(0);
			setState(1287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1286);
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
		enterRule(_localctx, 146, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			_la = _input.LA(1);
			if ( !(((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 524415L) != 0) || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1290);
			match(LPAREN);
			setState(1293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(1291);
				match(STAR);
				}
				break;
			case FULL:
			case ON:
			case NOT:
			case NULL:
			case KEY:
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
			case QUOTENAME:
			case OBJECT_NAME:
			case DATEADD:
			case DAY:
			case GETDATE:
			case MONTH:
			case YEAR:
			case NEWID:
			case AS:
			case IF:
			case CASE:
			case TEXT:
			case DATE:
			case NAME:
			case VALUE:
			case ID:
			case CODE:
			case STATUS:
			case TYPE:
			case TIME:
			case RECOVERY:
			case SIMPLE:
			case LOG:
			case DATEDIFF:
			case SYSDATETIMEOFFSET:
			case SYSDATETIME:
			case CLUSTERED:
			case NONCLUSTERED:
			case USER:
			case ROLE:
			case STRING:
			case HEX_STRING:
			case NUMBER:
			case LPAREN:
			case DELIMITED_IDENTIFIER_BRACKET:
			case DELIMITED_IDENTIFIER_QUOTE:
			case USER_VARIABLE:
			case IDENTIFIER:
				{
				setState(1292);
				expression_list();
				}
				break;
			case RPAREN:
				break;
			default:
				break;
			}
			setState(1295);
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
		enterRule(_localctx, 148, RULE_scalar_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1297);
			match(LPAREN);
			setState(1298);
			select_statement();
			setState(1299);
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
		enterRule(_localctx, 150, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
			match(HAVING);
			setState(1302);
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
		enterRule(_localctx, 152, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1304);
			match(WHERE);
			setState(1305);
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
		enterRule(_localctx, 154, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1307);
			column_name();
			setState(1308);
			_la = _input.LA(1);
			if ( !(_la==EQUAL || _la==PLUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1309);
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
		enterRule(_localctx, 156, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
			expression(0);
			setState(1316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1312);
				match(COMMA);
				setState(1313);
				expression(0);
				}
				}
				setState(1318);
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
		enterRule(_localctx, 158, RULE_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1319);
			identifier_ref();
			setState(1324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1320);
				match(COMMA);
				setState(1321);
				identifier_ref();
				}
				}
				setState(1326);
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
		enterRule(_localctx, 160, RULE_identifier_ref);
		int _la;
		try {
			setState(1338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1327);
				match(IDENTIFIER);
				setState(1330);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1328);
					match(DOT);
					setState(1329);
					match(IDENTIFIER);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(1332);
					match(IDENTIFIER);
					setState(1333);
					match(DOT);
					}
				}

				setState(1336);
				match(DELIMITED_IDENTIFIER_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1337);
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
		enterRule(_localctx, 162, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1340);
			_la = _input.LA(1);
			if ( !(_la==NULL || ((((_la - 236)) & ~0x3f) == 0 && ((1L << (_la - 236)) & 11L) != 0)) ) {
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
		enterRule(_localctx, 164, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1342);
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
		enterRule(_localctx, 166, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1344);
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
		enterRule(_localctx, 168, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1346);
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
		enterRule(_localctx, 170, RULE_cursor_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348);
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
		enterRule(_localctx, 172, RULE_cursor_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
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
		case 62:
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
		"\u0004\u0001\u0107\u0549\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0001\u0000\u0001\u0000\u0003\u0000\u00b1"+
		"\b\u0000\u0001\u0000\u0005\u0000\u00b4\b\u0000\n\u0000\f\u0000\u00b7\t"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u00c5\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00ce\b\u0003\u0005"+
		"\u0003\u00d0\b\u0003\n\u0003\f\u0003\u00d3\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00db\b\u0004"+
		"\n\u0004\f\u0004\u00de\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00e4\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00ea\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u00ee"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00f2\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00f8\b\u0007\n\u0007"+
		"\f\u0007\u00fb\t\u0007\u0003\u0007\u00fd\b\u0007\u0001\u0007\u0003\u0007"+
		"\u0100\b\u0007\u0001\u0007\u0003\u0007\u0103\b\u0007\u0001\u0007\u0003"+
		"\u0007\u0106\b\u0007\u0001\u0007\u0003\u0007\u0109\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u010f\b\b\n\b\f\b\u0112\t\b\u0001\b\u0001\b"+
		"\u0003\b\u0116\b\b\u0001\b\u0003\b\u0119\b\b\u0001\b\u0001\b\u0005\b\u011d"+
		"\b\b\n\b\f\b\u0120\t\b\u0003\b\u0122\b\b\u0001\t\u0001\t\u0003\t\u0126"+
		"\b\t\u0001\t\u0003\t\u0129\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t"+
		"\u012f\b\t\u0001\n\u0001\n\u0003\n\u0133\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u013a\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0142\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u014a\b\u000b\n\u000b\f\u000b\u014d\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0152\b\u000b\n\u000b"+
		"\f\u000b\u0155\t\u000b\u0003\u000b\u0157\b\u000b\u0001\u000b\u0003\u000b"+
		"\u015a\b\u000b\u0001\f\u0001\f\u0003\f\u015e\b\f\u0001\f\u0001\f\u0003"+
		"\f\u0162\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u016a"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u0173\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u017c"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0182"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0187\b\u0010"+
		"\n\u0010\f\u0010\u018a\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u0190\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u0195\b\u0010\u0003\u0010\u0197\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u01a0\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01a5\b"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01aa\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u01ae\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0005\u0015\u01b3\b\u0015\n\u0015\f\u0015\u01b6\t\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01bd\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u01c4\b\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u01c8\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u01d0\b\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01d4\b\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u01db\b\u0016\u0001\u0016\u0003\u0016\u01de\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01eb\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u01f9\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u01fd\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0202\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0209\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u0210\b\u0017\u0001\u0017\u0003\u0017\u0213\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u0222\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0227"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u022c\b\u0017"+
		"\u0003\u0017\u022e\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0237\b\u0018\n\u0018"+
		"\f\u0018\u023a\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u023f\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0243\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u024e\b\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0255\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u0259\b\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u025f\b\u001b\u0005\u001b\u0261\b\u001b"+
		"\n\u001b\f\u001b\u0264\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u026d\b\u001c\u0001"+
		"\u001c\u0003\u001c\u0270\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0278\b\u001c\u0005\u001c\u027a"+
		"\b\u001c\n\u001c\f\u001c\u027d\t\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u0283\b\u001d\u0001\u001d\u0003\u001d\u0286\b"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0290\b\u001d\n\u001d\f\u001d"+
		"\u0293\t\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u0299\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u02a7\b"+
		" \n \f \u02aa\t \u0001!\u0001!\u0001!\u0003!\u02af\b!\u0001!\u0001!\u0003"+
		"!\u02b3\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u02bb\b!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u02c8\b\"\u0001#\u0001#\u0001#\u0001#\u0003#\u02ce"+
		"\b#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u02df\b%\u0001%\u0001%\u0003"+
		"%\u02e3\b%\u0001%\u0001%\u0001%\u0001%\u0003%\u02e9\b%\u0005%\u02eb\b"+
		"%\n%\f%\u02ee\t%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0003"+
		"&\u02f7\b&\u0001&\u0003&\u02fa\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0003&\u0302\b&\u0005&\u0304\b&\n&\f&\u0307\t&\u0001&\u0001&\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0311\b\'\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0003(\u0317\b(\u0001(\u0001(\u0001(\u0003(\u031c\b("+
		"\u0001(\u0001(\u0001(\u0001(\u0005(\u0322\b(\n(\f(\u0325\t(\u0001(\u0001"+
		"(\u0001(\u0001(\u0003(\u032b\b(\u0001(\u0001(\u0001(\u0001(\u0005(\u0331"+
		"\b(\n(\f(\u0334\t(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0005(\u033e\b(\n(\f(\u0341\t(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0005(\u034a\b(\n(\f(\u034d\t(\u0001(\u0001(\u0003(\u0351\b("+
		"\u0001(\u0001(\u0001(\u0003(\u0356\b(\u0001(\u0001(\u0001(\u0003(\u035b"+
		"\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0362\b(\u0001)\u0001)\u0001"+
		")\u0005)\u0367\b)\n)\f)\u036a\t)\u0001*\u0001*\u0003*\u036e\b*\u0001*"+
		"\u0001*\u0001*\u0003*\u0373\b*\u0001*\u0003*\u0376\b*\u0001+\u0001+\u0003"+
		"+\u037a\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003"+
		",\u0384\b,\u0001-\u0001-\u0001-\u0003-\u0389\b-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0005-\u0393\b-\n-\f-\u0396\t-\u0003-\u0398"+
		"\b-\u0001-\u0003-\u039b\b-\u0003-\u039d\b-\u0001.\u0001.\u0001.\u0001"+
		".\u0005.\u03a3\b.\n.\f.\u03a6\t.\u0003.\u03a8\b.\u0001/\u0001/\u0001/"+
		"\u0001/\u0003/\u03ae\b/\u00010\u00010\u00011\u00011\u00011\u00051\u03b5"+
		"\b1\n1\f1\u03b8\t1\u00012\u00012\u00012\u00052\u03bd\b2\n2\f2\u03c0\t"+
		"2\u00013\u00013\u00013\u00013\u00013\u00053\u03c7\b3\n3\f3\u03ca\t3\u0003"+
		"3\u03cc\b3\u00013\u00033\u03cf\b3\u00013\u00013\u00013\u00013\u00033\u03d5"+
		"\b3\u00014\u00014\u00014\u00034\u03da\b4\u00015\u00015\u00015\u00015\u0003"+
		"5\u03e0\b5\u00015\u00035\u03e3\b5\u00015\u00035\u03e6\b5\u00015\u0003"+
		"5\u03e9\b5\u00015\u00035\u03ec\b5\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00055\u03f6\b5\n5\f5\u03f9\t5\u00035\u03fb\b5\u00035"+
		"\u03fd\b5\u00016\u00016\u00036\u0401\b6\u00016\u00016\u00036\u0405\b6"+
		"\u00017\u00017\u00017\u00017\u00037\u040b\b7\u00017\u00037\u040e\b7\u0001"+
		"7\u00017\u00037\u0412\b7\u00017\u00017\u00017\u00017\u00057\u0418\b7\n"+
		"7\f7\u041b\t7\u00037\u041d\b7\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00038\u0427\b8\u00019\u00019\u00039\u042b\b9\u00019\u0001"+
		"9\u00039\u042f\b9\u0001:\u0001:\u0003:\u0433\b:\u0001:\u0001:\u0003:\u0437"+
		"\b:\u0001;\u0001;\u0001;\u0005;\u043c\b;\n;\f;\u043f\t;\u0001<\u0001<"+
		"\u0001<\u0001<\u0005<\u0445\b<\n<\f<\u0448\t<\u0001<\u0001<\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0003=\u0451\b=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0004>\u045e\b>\u000b>\f>"+
		"\u045f\u0001>\u0001>\u0003>\u0464\b>\u0001>\u0001>\u0003>\u0468\b>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0003>\u0475\b>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u0484\b>\u0001>\u0001>\u0001"+
		">\u0001>\u0003>\u048a\b>\u0001>\u0001>\u0001>\u0003>\u048f\b>\u0001>\u0001"+
		">\u0001>\u0003>\u0494\b>\u0001>\u0005>\u0497\b>\n>\f>\u049a\t>\u0001?"+
		"\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0001@\u0003@\u04ab\b@\u0001A\u0001A\u0003A\u04af"+
		"\bA\u0001A\u0003A\u04b2\bA\u0001A\u0001A\u0001A\u0001A\u0003A\u04b8\b"+
		"A\u0001A\u0001A\u0003A\u04bc\bA\u0001B\u0001B\u0001B\u0003B\u04c1\bB\u0001"+
		"B\u0001B\u0003B\u04c5\bB\u0001B\u0003B\u04c8\bB\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001C\u0005C\u04d4\bC\nC\fC\u04d7"+
		"\tC\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u04ea\bD\u0001"+
		"E\u0001E\u0001E\u0005E\u04ef\bE\nE\fE\u04f2\tE\u0001F\u0001F\u0001F\u0003"+
		"F\u04f7\bF\u0001F\u0003F\u04fa\bF\u0001G\u0001G\u0001G\u0001G\u0001G\u0005"+
		"G\u0501\bG\nG\fG\u0504\tG\u0001H\u0001H\u0003H\u0508\bH\u0001I\u0001I"+
		"\u0001I\u0001I\u0003I\u050e\bI\u0001I\u0001I\u0001J\u0001J\u0001J\u0001"+
		"J\u0001K\u0001K\u0001K\u0001L\u0001L\u0001L\u0001M\u0001M\u0001M\u0001"+
		"M\u0001N\u0001N\u0001N\u0005N\u0523\bN\nN\fN\u0526\tN\u0001O\u0001O\u0001"+
		"O\u0005O\u052b\bO\nO\fO\u052e\tO\u0001P\u0001P\u0001P\u0003P\u0533\bP"+
		"\u0001P\u0001P\u0003P\u0537\bP\u0001P\u0001P\u0003P\u053b\bP\u0001Q\u0001"+
		"Q\u0001R\u0001R\u0001S\u0001S\u0001T\u0001T\u0001U\u0001U\u0001V\u0001"+
		"V\u0001V\u0000\u0001|W\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u0000\u0018\u0002\u0000\u000b\u000b\u009b\u009b\u0003\u0000"+
		")*00\u00c9\u00cc\u0004\u0000HHyz}}\u00a8\u00a9\u0002\u0000<<\u00ef\u00ef"+
		"\u0002\u0000\u0081\u0081\u00c5\u00c5\u0002\u0000JJ\u00be\u00c0\u0001\u0000"+
		"\u00be\u00c0\u0001\u0000\u00db\u00dc\u0001\u0000\u00ca\u00cb\u0001\u0000"+
		"\b\t\u0002\u0000,,\u00ad\u00ad\u0001\u0000\u00cf\u00d0\u0010\u0000\u0017"+
		"\u0017\u001a\u001a\u001e\u001e//IKMNRRVVZZ~\u007f\u00aa\u00ab\u00b6\u00b9"+
		"\u00c4\u00c4\u00d1\u00d3\u00d8\u00dc\u00e0\u00e1\u0001\u0000\u0085\u0086"+
		"\u0001\u0000\u0087\u0088\u0001\u0000\u0089\u008c\u0001\u0000\u008d\u008f"+
		"\u0002\u0000\u00ef\u00ef\u0105\u0105\u0001\u0000\u00f8\u00fa\u0001\u0000"+
		"\u00f6\u00f7\u0002\u0000##\u00f0\u00f5\u0003\u00008>KK\u0106\u0106\u0002"+
		"\u0000\u00f0\u00f0\u00f6\u00f6\u0003\u0000\u001e\u001e\u00ec\u00ed\u00ef"+
		"\u00ef\u0604\u0000\u00b5\u0001\u0000\u0000\u0000\u0002\u00c4\u0001\u0000"+
		"\u0000\u0000\u0004\u00c6\u0001\u0000\u0000\u0000\u0006\u00ca\u0001\u0000"+
		"\u0000\u0000\b\u00d6\u0001\u0000\u0000\u0000\n\u00df\u0001\u0000\u0000"+
		"\u0000\f\u00e9\u0001\u0000\u0000\u0000\u000e\u00eb\u0001\u0000\u0000\u0000"+
		"\u0010\u0121\u0001\u0000\u0000\u0000\u0012\u012e\u0001\u0000\u0000\u0000"+
		"\u0014\u0130\u0001\u0000\u0000\u0000\u0016\u0143\u0001\u0000\u0000\u0000"+
		"\u0018\u015b\u0001\u0000\u0000\u0000\u001a\u0169\u0001\u0000\u0000\u0000"+
		"\u001c\u0172\u0001\u0000\u0000\u0000\u001e\u017b\u0001\u0000\u0000\u0000"+
		" \u0196\u0001\u0000\u0000\u0000\"\u0198\u0001\u0000\u0000\u0000$\u019c"+
		"\u0001\u0000\u0000\u0000&\u01a6\u0001\u0000\u0000\u0000(\u01ad\u0001\u0000"+
		"\u0000\u0000*\u01af\u0001\u0000\u0000\u0000,\u01f8\u0001\u0000\u0000\u0000"+
		".\u01fc\u0001\u0000\u0000\u00000\u022f\u0001\u0000\u0000\u00002\u0244"+
		"\u0001\u0000\u0000\u00004\u0248\u0001\u0000\u0000\u00006\u024f\u0001\u0000"+
		"\u0000\u00008\u0267\u0001\u0000\u0000\u0000:\u0280\u0001\u0000\u0000\u0000"+
		"<\u0296\u0001\u0000\u0000\u0000>\u029a\u0001\u0000\u0000\u0000@\u02a0"+
		"\u0001\u0000\u0000\u0000B\u02ba\u0001\u0000\u0000\u0000D\u02bc\u0001\u0000"+
		"\u0000\u0000F\u02c9\u0001\u0000\u0000\u0000H\u02d3\u0001\u0000\u0000\u0000"+
		"J\u02d9\u0001\u0000\u0000\u0000L\u02f1\u0001\u0000\u0000\u0000N\u030a"+
		"\u0001\u0000\u0000\u0000P\u0316\u0001\u0000\u0000\u0000R\u0363\u0001\u0000"+
		"\u0000\u0000T\u036d\u0001\u0000\u0000\u0000V\u0379\u0001\u0000\u0000\u0000"+
		"X\u0383\u0001\u0000\u0000\u0000Z\u039c\u0001\u0000\u0000\u0000\\\u03a7"+
		"\u0001\u0000\u0000\u0000^\u03ad\u0001\u0000\u0000\u0000`\u03af\u0001\u0000"+
		"\u0000\u0000b\u03b1\u0001\u0000\u0000\u0000d\u03b9\u0001\u0000\u0000\u0000"+
		"f\u03d4\u0001\u0000\u0000\u0000h\u03d9\u0001\u0000\u0000\u0000j\u03db"+
		"\u0001\u0000\u0000\u0000l\u03fe\u0001\u0000\u0000\u0000n\u0406\u0001\u0000"+
		"\u0000\u0000p\u0426\u0001\u0000\u0000\u0000r\u0428\u0001\u0000\u0000\u0000"+
		"t\u0430\u0001\u0000\u0000\u0000v\u0438\u0001\u0000\u0000\u0000x\u0440"+
		"\u0001\u0000\u0000\u0000z\u044b\u0001\u0000\u0000\u0000|\u0467\u0001\u0000"+
		"\u0000\u0000~\u049b\u0001\u0000\u0000\u0000\u0080\u04aa\u0001\u0000\u0000"+
		"\u0000\u0082\u04bb\u0001\u0000\u0000\u0000\u0084\u04c7\u0001\u0000\u0000"+
		"\u0000\u0086\u04ce\u0001\u0000\u0000\u0000\u0088\u04e9\u0001\u0000\u0000"+
		"\u0000\u008a\u04eb\u0001\u0000\u0000\u0000\u008c\u04f9\u0001\u0000\u0000"+
		"\u0000\u008e\u04fb\u0001\u0000\u0000\u0000\u0090\u0505\u0001\u0000\u0000"+
		"\u0000\u0092\u0509\u0001\u0000\u0000\u0000\u0094\u0511\u0001\u0000\u0000"+
		"\u0000\u0096\u0515\u0001\u0000\u0000\u0000\u0098\u0518\u0001\u0000\u0000"+
		"\u0000\u009a\u051b\u0001\u0000\u0000\u0000\u009c\u051f\u0001\u0000\u0000"+
		"\u0000\u009e\u0527\u0001\u0000\u0000\u0000\u00a0\u053a\u0001\u0000\u0000"+
		"\u0000\u00a2\u053c\u0001\u0000\u0000\u0000\u00a4\u053e\u0001\u0000\u0000"+
		"\u0000\u00a6\u0540\u0001\u0000\u0000\u0000\u00a8\u0542\u0001\u0000\u0000"+
		"\u0000\u00aa\u0544\u0001\u0000\u0000\u0000\u00ac\u0546\u0001\u0000\u0000"+
		"\u0000\u00ae\u00b0\u0003\u0002\u0001\u0000\u00af\u00b1\u0005\u00fc\u0000"+
		"\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b4\u0005W\u0000\u0000"+
		"\u00b3\u00ae\u0001\u0000\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\u0000\u0000\u0001"+
		"\u00b9\u0001\u0001\u0000\u0000\u0000\u00ba\u00c5\u0003\f\u0006\u0000\u00bb"+
		"\u00c5\u0003\u001a\r\u0000\u00bc\u00c5\u0003h4\u0000\u00bd\u00c5\u0003"+
		"\b\u0004\u0000\u00be\u00c5\u0003x<\u0000\u00bf\u00c5\u0003v;\u0000\u00c0"+
		"\u00c5\u0003r9\u0000\u00c1\u00c5\u0003t:\u0000\u00c2\u00c5\u0003\u0004"+
		"\u0002\u0000\u00c3\u00c5\u0003\u0006\u0003\u0000\u00c4\u00ba\u0001\u0000"+
		"\u0000\u0000\u00c4\u00bb\u0001\u0000\u0000\u0000\u00c4\u00bc\u0001\u0000"+
		"\u0000\u0000\u00c4\u00bd\u0001\u0000\u0000\u0000\u00c4\u00be\u0001\u0000"+
		"\u0000\u0000\u00c4\u00bf\u0001\u0000\u0000\u0000\u00c4\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u0003\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0005\\\u0000\u0000\u00c7\u00c8\u0003|>\u0000"+
		"\u00c8\u00c9\u0003\u0002\u0001\u0000\u00c9\u0005\u0001\u0000\u0000\u0000"+
		"\u00ca\u00d1\u0005X\u0000\u0000\u00cb\u00cd\u0003\u0002\u0001\u0000\u00cc"+
		"\u00ce\u0005\u00fc\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf"+
		"\u00cb\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0005Y\u0000\u0000\u00d5\u0007\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0005U\u0000\u0000\u00d7\u00dc\u0003\n\u0005\u0000\u00d8\u00d9\u0005"+
		"\u00fb\u0000\u0000\u00d9\u00db\u0003\n\u0005\u0000\u00da\u00d8\u0001\u0000"+
		"\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\t\u0001\u0000\u0000"+
		"\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0105\u0000"+
		"\u0000\u00e0\u00e3\u0003,\u0016\u0000\u00e1\u00e2\u0005\u00f0\u0000\u0000"+
		"\u00e2\u00e4\u0003|>\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e4\u000b\u0001\u0000\u0000\u0000\u00e5\u00ea"+
		"\u0003\u000e\u0007\u0000\u00e6\u00ea\u0003\u0014\n\u0000\u00e7\u00ea\u0003"+
		"\u0016\u000b\u0000\u00e8\u00ea\u0003\u0018\f\u0000\u00e9\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e9\u00e6\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea\r\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ed\u0005\u0001\u0000\u0000\u00ec\u00ee\u0007\u0000\u0000"+
		"\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000"+
		"\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\f\u0000\u0000"+
		"\u00f0\u00f2\u0005\u00ef\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f3\u00fc\u0003\u0010\b\u0000\u00f4\u00f5\u0005\u0002\u0000\u0000\u00f5"+
		"\u00f9\u0003\u0082A\u0000\u00f6\u00f8\u0003\u0084B\u0000\u00f7\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fd\u0001"+
		"\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00f4\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00ff\u0001"+
		"\u0000\u0000\u0000\u00fe\u0100\u0003\u0098L\u0000\u00ff\u00fe\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0102\u0001\u0000"+
		"\u0000\u0000\u0101\u0103\u0003\u0086C\u0000\u0102\u0101\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0105\u0001\u0000\u0000"+
		"\u0000\u0104\u0106\u0003\u0096K\u0000\u0105\u0104\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0108\u0001\u0000\u0000\u0000"+
		"\u0107\u0109\u0003\u008eG\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0108"+
		"\u0109\u0001\u0000\u0000\u0000\u0109\u000f\u0001\u0000\u0000\u0000\u010a"+
		"\u0122\u0005\u00f8\u0000\u0000\u010b\u0110\u0003\u0012\t\u0000\u010c\u010d"+
		"\u0005\u00fb\u0000\u0000\u010d\u010f\u0003\u0012\t\u0000\u010e\u010c\u0001"+
		"\u0000\u0000\u0000\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0122\u0001"+
		"\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0118\u0003"+
		"\u0092I\u0000\u0114\u0116\u0005V\u0000\u0000\u0115\u0114\u0001\u0000\u0000"+
		"\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000"+
		"\u0000\u0117\u0119\u0003\u00a6S\u0000\u0118\u0115\u0001\u0000\u0000\u0000"+
		"\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011e\u0001\u0000\u0000\u0000"+
		"\u011a\u011b\u0005\u00fb\u0000\u0000\u011b\u011d\u0003\u0012\t\u0000\u011c"+
		"\u011a\u0001\u0000\u0000\u0000\u011d\u0120\u0001\u0000\u0000\u0000\u011e"+
		"\u011c\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f"+
		"\u0122\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0121"+
		"\u010a\u0001\u0000\u0000\u0000\u0121\u010b\u0001\u0000\u0000\u0000\u0121"+
		"\u0113\u0001\u0000\u0000\u0000\u0122\u0011\u0001\u0000\u0000\u0000\u0123"+
		"\u0128\u0003|>\u0000\u0124\u0126\u0005V\u0000\u0000\u0125\u0124\u0001"+
		"\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0127\u0001"+
		"\u0000\u0000\u0000\u0127\u0129\u0003\u00a6S\u0000\u0128\u0125\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012f\u0001\u0000"+
		"\u0000\u0000\u012a\u012b\u0003\u00a6S\u0000\u012b\u012c\u0005\u00f0\u0000"+
		"\u0000\u012c\u012d\u0003|>\u0000\u012d\u012f\u0001\u0000\u0000\u0000\u012e"+
		"\u0123\u0001\u0000\u0000\u0000\u012e\u012a\u0001\u0000\u0000\u0000\u012f"+
		"\u0013\u0001\u0000\u0000\u0000\u0130\u0132\u0005\r\u0000\u0000\u0131\u0133"+
		"\u0005\u0012\u0000\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0132\u0133"+
		"\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0139"+
		"\u0003\u00a4R\u0000\u0135\u0136\u0005\u00fd\u0000\u0000\u0136\u0137\u0003"+
		"\u009eO\u0000\u0137\u0138\u0005\u00fe\u0000\u0000\u0138\u013a\u0001\u0000"+
		"\u0000\u0000\u0139\u0135\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000"+
		"\u0000\u0000\u013a\u0141\u0001\u0000\u0000\u0000\u013b\u013c\u0005\u0011"+
		"\u0000\u0000\u013c\u013d\u0005\u00fd\u0000\u0000\u013d\u013e\u0003\u009c"+
		"N\u0000\u013e\u013f\u0005\u00fe\u0000\u0000\u013f\u0142\u0001\u0000\u0000"+
		"\u0000\u0140\u0142\u0003\u000e\u0007\u0000\u0141\u013b\u0001\u0000\u0000"+
		"\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0142\u0015\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0005\u000f\u0000\u0000\u0144\u0145\u0003\u00a4R\u0000"+
		"\u0145\u0146\u0005\u0010\u0000\u0000\u0146\u014b\u0003\u009aM\u0000\u0147"+
		"\u0148\u0005\u00fb\u0000\u0000\u0148\u014a\u0003\u009aM\u0000\u0149\u0147"+
		"\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000\u0000\u0000\u014b\u0149"+
		"\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u0156"+
		"\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014e\u014f"+
		"\u0005\u0002\u0000\u0000\u014f\u0153\u0003\u0082A\u0000\u0150\u0152\u0003"+
		"\u0084B\u0000\u0151\u0150\u0001\u0000\u0000\u0000\u0152\u0155\u0001\u0000"+
		"\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000"+
		"\u0000\u0000\u0154\u0157\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000"+
		"\u0000\u0000\u0156\u014e\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000"+
		"\u0000\u0000\u0157\u0159\u0001\u0000\u0000\u0000\u0158\u015a\u0003\u0098"+
		"L\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000"+
		"\u0000\u015a\u0017\u0001\u0000\u0000\u0000\u015b\u015d\u0005\u000e\u0000"+
		"\u0000\u015c\u015e\u0005\u0002\u0000\u0000\u015d\u015c\u0001\u0000\u0000"+
		"\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000"+
		"\u0000\u015f\u0161\u0003\u00a4R\u0000\u0160\u0162\u0003\u0098L\u0000\u0161"+
		"\u0160\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162"+
		"\u0019\u0001\u0000\u0000\u0000\u0163\u016a\u0003\u001c\u000e\u0000\u0164"+
		"\u016a\u0003\u001e\u000f\u0000\u0165\u016a\u0003 \u0010\u0000\u0166\u016a"+
		"\u0003\"\u0011\u0000\u0167\u016a\u0003$\u0012\u0000\u0168\u016a\u0003"+
		"&\u0013\u0000\u0169\u0163\u0001\u0000\u0000\u0000\u0169\u0164\u0001\u0000"+
		"\u0000\u0000\u0169\u0165\u0001\u0000\u0000\u0000\u0169\u0166\u0001\u0000"+
		"\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u0168\u0001\u0000"+
		"\u0000\u0000\u016a\u001b\u0001\u0000\u0000\u0000\u016b\u0173\u00030\u0018"+
		"\u0000\u016c\u0173\u00032\u0019\u0000\u016d\u0173\u00034\u001a\u0000\u016e"+
		"\u0173\u00036\u001b\u0000\u016f\u0173\u00038\u001c\u0000\u0170\u0173\u0003"+
		":\u001d\u0000\u0171\u0173\u0003>\u001f\u0000\u0172\u016b\u0001\u0000\u0000"+
		"\u0000\u0172\u016c\u0001\u0000\u0000\u0000\u0172\u016d\u0001\u0000\u0000"+
		"\u0000\u0172\u016e\u0001\u0000\u0000\u0000\u0172\u016f\u0001\u0000\u0000"+
		"\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0172\u0171\u0001\u0000\u0000"+
		"\u0000\u0173\u001d\u0001\u0000\u0000\u0000\u0174\u017c\u0003@ \u0000\u0175"+
		"\u017c\u0003D\"\u0000\u0176\u017c\u0003F#\u0000\u0177\u017c\u0003H$\u0000"+
		"\u0178\u017c\u0003J%\u0000\u0179\u017c\u0003L&\u0000\u017a\u017c\u0003"+
		"N\'\u0000\u017b\u0174\u0001\u0000\u0000\u0000\u017b\u0175\u0001\u0000"+
		"\u0000\u0000\u017b\u0176\u0001\u0000\u0000\u0000\u017b\u0177\u0001\u0000"+
		"\u0000\u0000\u017b\u0178\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000"+
		"\u0000\u0000\u017b\u017a\u0001\u0000\u0000\u0000\u017c\u001f\u0001\u0000"+
		"\u0000\u0000\u017d\u017e\u0005(\u0000\u0000\u017e\u0181\u0007\u0001\u0000"+
		"\u0000\u017f\u0180\u0005Z\u0000\u0000\u0180\u0182\u0005%\u0000\u0000\u0181"+
		"\u017f\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182"+
		"\u0183\u0001\u0000\u0000\u0000\u0183\u0188\u0003b1\u0000\u0184\u0185\u0005"+
		"\u00fb\u0000\u0000\u0185\u0187\u0003b1\u0000\u0186\u0184\u0001\u0000\u0000"+
		"\u0000\u0187\u018a\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000\u0000"+
		"\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u0197\u0001\u0000\u0000"+
		"\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018b\u018c\u0005(\u0000\u0000"+
		"\u018c\u018f\u0005+\u0000\u0000\u018d\u018e\u0005Z\u0000\u0000\u018e\u0190"+
		"\u0005%\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u018f\u0190\u0001"+
		"\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0194\u0003"+
		"b1\u0000\u0192\u0193\u0005\u001a\u0000\u0000\u0193\u0195\u0003b1\u0000"+
		"\u0194\u0192\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000"+
		"\u0195\u0197\u0001\u0000\u0000\u0000\u0196\u017d\u0001\u0000\u0000\u0000"+
		"\u0196\u018b\u0001\u0000\u0000\u0000\u0197!\u0001\u0000\u0000\u0000\u0198"+
		"\u0199\u0005\u00d4\u0000\u0000\u0199\u019a\u0005)\u0000\u0000\u019a\u019b"+
		"\u0003b1\u0000\u019b#\u0001\u0000\u0000\u0000\u019c\u019f\u0005\u0010"+
		"\u0000\u0000\u019d\u01a0\u0003^/\u0000\u019e\u01a0\u0005\u0105\u0000\u0000"+
		"\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u019e\u0001\u0000\u0000\u0000"+
		"\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a4\u0005\u00f0\u0000\u0000"+
		"\u01a2\u01a5\u0003f3\u0000\u01a3\u01a5\u0003|>\u0000\u01a4\u01a2\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a5%\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a7\u0005\u00c7\u0000\u0000\u01a7\u01a9\u0003|>\u0000"+
		"\u01a8\u01aa\u0005\u00fc\u0000\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000"+
		"\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\'\u0001\u0000\u0000\u0000\u01ab"+
		"\u01ae\u0003*\u0015\u0000\u01ac\u01ae\u0003P(\u0000\u01ad\u01ab\u0001"+
		"\u0000\u0000\u0000\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ae)\u0001\u0000"+
		"\u0000\u0000\u01af\u01c3\u0003^/\u0000\u01b0\u01b4\u0003,\u0016\u0000"+
		"\u01b1\u01b3\u0003.\u0017\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b6\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b5\u0001\u0000\u0000\u0000\u01b5\u01bc\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b4\u0001\u0000\u0000\u0000\u01b7\u01b8\u0005V\u0000\u0000\u01b8\u01b9"+
		"\u0005\u00fd\u0000\u0000\u01b9\u01ba\u0003|>\u0000\u01ba\u01bb\u0005\u00fe"+
		"\u0000\u0000\u01bb\u01bd\u0001\u0000\u0000\u0000\u01bc\u01b7\u0001\u0000"+
		"\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01c4\u0001\u0000"+
		"\u0000\u0000\u01be\u01bf\u0005V\u0000\u0000\u01bf\u01c0\u0005\u00fd\u0000"+
		"\u0000\u01c0\u01c1\u0003|>\u0000\u01c1\u01c2\u0005\u00fe\u0000\u0000\u01c2"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c3\u01b0\u0001\u0000\u0000\u0000\u01c3"+
		"\u01be\u0001\u0000\u0000\u0000\u01c4+\u0001\u0000\u0000\u0000\u01c5\u01c7"+
		"\u0005\u00c2\u0000\u0000\u01c6\u01c8\u0005\u00c3\u0000\u0000\u01c7\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01f9"+
		"\u0001\u0000\u0000\u0000\u01c9\u01f9\u0005\u00ae\u0000\u0000\u01ca\u01f9"+
		"\u0005\u00af\u0000\u0000\u01cb\u01cf\u0007\u0002\u0000\u0000\u01cc\u01cd"+
		"\u0005\u00fd\u0000\u0000\u01cd\u01ce\u0007\u0003\u0000\u0000\u01ce\u01d0"+
		"\u0005\u00fe\u0000\u0000\u01cf\u01cc\u0001\u0000\u0000\u0000\u01cf\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d3\u0001\u0000\u0000\u0000\u01d1\u01d2"+
		"\u0005\u00b0\u0000\u0000\u01d2\u01d4\u0003^/\u0000\u01d3\u01d1\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01f9\u0001\u0000"+
		"\u0000\u0000\u01d5\u01dd\u0007\u0004\u0000\u0000\u01d6\u01d7\u0005\u00fd"+
		"\u0000\u0000\u01d7\u01da\u0005\u00ef\u0000\u0000\u01d8\u01d9\u0005\u00fb"+
		"\u0000\u0000\u01d9\u01db\u0005\u00ef\u0000\u0000\u01da\u01d8\u0001\u0000"+
		"\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000"+
		"\u0000\u0000\u01dc\u01de\u0005\u00fe\u0000\u0000\u01dd\u01d6\u0001\u0000"+
		"\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01f9\u0001\u0000"+
		"\u0000\u0000\u01df\u01f9\u0005{\u0000\u0000\u01e0\u01f9\u0005|\u0000\u0000"+
		"\u01e1\u01f9\u0005\u00a4\u0000\u0000\u01e2\u01f9\u0005\u00a5\u0000\u0000"+
		"\u01e3\u01f9\u0005\u00a6\u0000\u0000\u01e4\u01f9\u0005\u007f\u0000\u0000"+
		"\u01e5\u01f9\u0005\u0080\u0000\u0000\u01e6\u01ea\u0005\u00b1\u0000\u0000"+
		"\u01e7\u01e8\u0005\u00fd\u0000\u0000\u01e8\u01e9\u0005\u00ef\u0000\u0000"+
		"\u01e9\u01eb\u0005\u00fe\u0000\u0000\u01ea\u01e7\u0001\u0000\u0000\u0000"+
		"\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\u01f9\u0001\u0000\u0000\u0000"+
		"\u01ec\u01f9\u00054\u0000\u0000\u01ed\u01f9\u0005\u00c4\u0000\u0000\u01ee"+
		"\u01f9\u0005~\u0000\u0000\u01ef\u01f9\u0005\u0083\u0000\u0000\u01f0\u01f9"+
		"\u0005\u0082\u0000\u0000\u01f1\u01f9\u0005\u00b2\u0000\u0000\u01f2\u01f9"+
		"\u0005\u00b3\u0000\u0000\u01f3\u01f9\u0005\u00b4\u0000\u0000\u01f4\u01f5"+
		"\u0005\u00bd\u0000\u0000\u01f5\u01f6\u0007\u0005\u0000\u0000\u01f6\u01f7"+
		"\u0005\u00c1\u0000\u0000\u01f7\u01f9\u0007\u0006\u0000\u0000\u01f8\u01c5"+
		"\u0001\u0000\u0000\u0000\u01f8\u01c9\u0001\u0000\u0000\u0000\u01f8\u01ca"+
		"\u0001\u0000\u0000\u0000\u01f8\u01cb\u0001\u0000\u0000\u0000\u01f8\u01d5"+
		"\u0001\u0000\u0000\u0000\u01f8\u01df\u0001\u0000\u0000\u0000\u01f8\u01e0"+
		"\u0001\u0000\u0000\u0000\u01f8\u01e1\u0001\u0000\u0000\u0000\u01f8\u01e2"+
		"\u0001\u0000\u0000\u0000\u01f8\u01e3\u0001\u0000\u0000\u0000\u01f8\u01e4"+
		"\u0001\u0000\u0000\u0000\u01f8\u01e5\u0001\u0000\u0000\u0000\u01f8\u01e6"+
		"\u0001\u0000\u0000\u0000\u01f8\u01ec\u0001\u0000\u0000\u0000\u01f8\u01ed"+
		"\u0001\u0000\u0000\u0000\u01f8\u01ee\u0001\u0000\u0000\u0000\u01f8\u01ef"+
		"\u0001\u0000\u0000\u0000\u01f8\u01f0\u0001\u0000\u0000\u0000\u01f8\u01f1"+
		"\u0001\u0000\u0000\u0000\u01f8\u01f2\u0001\u0000\u0000\u0000\u01f8\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f8\u01f4\u0001\u0000\u0000\u0000\u01f9-\u0001"+
		"\u0000\u0000\u0000\u01fa\u01fb\u0005,\u0000\u0000\u01fb\u01fd\u0003^/"+
		"\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000"+
		"\u0000\u01fd\u022d\u0001\u0000\u0000\u0000\u01fe\u01ff\u0005-\u0000\u0000"+
		"\u01ff\u0201\u0005/\u0000\u0000\u0200\u0202\u0007\u0007\u0000\u0000\u0201"+
		"\u0200\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202"+
		"\u022e\u0001\u0000\u0000\u0000\u0203\u0204\u0005\u001d\u0000\u0000\u0204"+
		"\u022e\u0005\u001e\u0000\u0000\u0205\u022e\u0005\u001e\u0000\u0000\u0206"+
		"\u0208\u00052\u0000\u0000\u0207\u0209\u0007\u0007\u0000\u0000\u0208\u0207"+
		"\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209\u022e"+
		"\u0001\u0000\u0000\u0000\u020a\u0212\u0005\u00a1\u0000\u0000\u020b\u020c"+
		"\u0005\u00fd\u0000\u0000\u020c\u020f\u0005\u00ef\u0000\u0000\u020d\u020e"+
		"\u0005\u00fb\u0000\u0000\u020e\u0210\u0005\u00ef\u0000\u0000\u020f\u020d"+
		"\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210\u0211"+
		"\u0001\u0000\u0000\u0000\u0211\u0213\u0005\u00fe\u0000\u0000\u0212\u020b"+
		"\u0001\u0000\u0000\u0000\u0212\u0213\u0001\u0000\u0000\u0000\u0213\u022e"+
		"\u0001\u0000\u0000\u0000\u0214\u0215\u00055\u0000\u0000\u0215\u022e\u0003"+
		"Z-\u0000\u0216\u0217\u0005\u00e8\u0000\u0000\u0217\u0218\u0005\u00fd\u0000"+
		"\u0000\u0218\u0219\u0003|>\u0000\u0219\u021a\u0005\u00fe\u0000\u0000\u021a"+
		"\u022e\u0001\u0000\u0000\u0000\u021b\u021c\u00057\u0000\u0000\u021c\u0221"+
		"\u0003b1\u0000\u021d\u021e\u0005\u00fd\u0000\u0000\u021e\u021f\u0003^"+
		"/\u0000\u021f\u0220\u0005\u00fe\u0000\u0000\u0220\u0222\u0001\u0000\u0000"+
		"\u0000\u0221\u021d\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000"+
		"\u0000\u0222\u0226\u0001\u0000\u0000\u0000\u0223\u0224\u0005\u001a\u0000"+
		"\u0000\u0224\u0225\u0005\u000e\u0000\u0000\u0225\u0227\u0003X,\u0000\u0226"+
		"\u0223\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000\u0227"+
		"\u022b\u0001\u0000\u0000\u0000\u0228\u0229\u0005\u001a\u0000\u0000\u0229"+
		"\u022a\u0005\u000f\u0000\u0000\u022a\u022c\u0003X,\u0000\u022b\u0228\u0001"+
		"\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u022e\u0001"+
		"\u0000\u0000\u0000\u022d\u01fe\u0001\u0000\u0000\u0000\u022d\u0203\u0001"+
		"\u0000\u0000\u0000\u022d\u0205\u0001\u0000\u0000\u0000\u022d\u0206\u0001"+
		"\u0000\u0000\u0000\u022d\u020a\u0001\u0000\u0000\u0000\u022d\u0214\u0001"+
		"\u0000\u0000\u0000\u022d\u0216\u0001\u0000\u0000\u0000\u022d\u021b\u0001"+
		"\u0000\u0000\u0000\u022e/\u0001\u0000\u0000\u0000\u022f\u0230\u0005&\u0000"+
		"\u0000\u0230\u0231\u0005)\u0000\u0000\u0231\u0232\u0003b1\u0000\u0232"+
		"\u0233\u0005\u00fd\u0000\u0000\u0233\u0238\u0003(\u0014\u0000\u0234\u0235"+
		"\u0005\u00fb\u0000\u0000\u0235\u0237\u0003(\u0014\u0000\u0236\u0234\u0001"+
		"\u0000\u0000\u0000\u0237\u023a\u0001\u0000\u0000\u0000\u0238\u0236\u0001"+
		"\u0000\u0000\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u023b\u0001"+
		"\u0000\u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023b\u023e\u0005"+
		"\u00fe\u0000\u0000\u023c\u023d\u0005\u001a\u0000\u0000\u023d\u023f\u0003"+
		"V+\u0000\u023e\u023c\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000"+
		"\u0000\u023f\u0242\u0001\u0000\u0000\u0000\u0240\u0241\u0005\u00b5\u0000"+
		"\u0000\u0241\u0243\u0003V+\u0000\u0242\u0240\u0001\u0000\u0000\u0000\u0242"+
		"\u0243\u0001\u0000\u0000\u0000\u02431\u0001\u0000\u0000\u0000\u0244\u0245"+
		"\u0005&\u0000\u0000\u0245\u0246\u00050\u0000\u0000\u0246\u0247\u0003^"+
		"/\u0000\u02473\u0001\u0000\u0000\u0000\u0248\u0249\u0005&\u0000\u0000"+
		"\u0249\u024a\u0005\u00cc\u0000\u0000\u024a\u024d\u0003^/\u0000\u024b\u024c"+
		"\u0005\u00cd\u0000\u0000\u024c\u024e\u0003^/\u0000\u024d\u024b\u0001\u0000"+
		"\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e5\u0001\u0000\u0000"+
		"\u0000\u024f\u0250\u0005&\u0000\u0000\u0250\u0251\u0007\b\u0000\u0000"+
		"\u0251\u0258\u0003b1\u0000\u0252\u0254\u0005\u00fd\u0000\u0000\u0253\u0255"+
		"\u0003R)\u0000\u0254\u0253\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000"+
		"\u0000\u0000\u0255\u0256\u0001\u0000\u0000\u0000\u0256\u0259\u0005\u00fe"+
		"\u0000\u0000\u0257\u0259\u0003R)\u0000\u0258\u0252\u0001\u0000\u0000\u0000"+
		"\u0258\u0257\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000"+
		"\u0259\u025a\u0001\u0000\u0000\u0000\u025a\u025b\u0005V\u0000\u0000\u025b"+
		"\u0262\u0005X\u0000\u0000\u025c\u025e\u0003\u0002\u0001\u0000\u025d\u025f"+
		"\u0005\u00fc\u0000\u0000\u025e\u025d\u0001\u0000\u0000\u0000\u025e\u025f"+
		"\u0001\u0000\u0000\u0000\u025f\u0261\u0001\u0000\u0000\u0000\u0260\u025c"+
		"\u0001\u0000\u0000\u0000\u0261\u0264\u0001\u0000\u0000\u0000\u0262\u0260"+
		"\u0001\u0000\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u0265"+
		"\u0001\u0000\u0000\u0000\u0264\u0262\u0001\u0000\u0000\u0000\u0265\u0266"+
		"\u0005Y\u0000\u0000\u02667\u0001\u0000\u0000\u0000\u0267\u0268\u0005&"+
		"\u0000\u0000\u0268\u0269\u0005\u00c9\u0000\u0000\u0269\u026f\u0003b1\u0000"+
		"\u026a\u026c\u0005\u00fd\u0000\u0000\u026b\u026d\u0003R)\u0000\u026c\u026b"+
		"\u0001\u0000\u0000\u0000\u026c\u026d\u0001\u0000\u0000\u0000\u026d\u026e"+
		"\u0001\u0000\u0000\u0000\u026e\u0270\u0005\u00fe\u0000\u0000\u026f\u026a"+
		"\u0001\u0000\u0000\u0000\u026f\u0270\u0001\u0000\u0000\u0000\u0270\u0271"+
		"\u0001\u0000\u0000\u0000\u0271\u0272\u0005\u00c8\u0000\u0000\u0272\u0273"+
		"\u0003,\u0016\u0000\u0273\u0274\u0005V\u0000\u0000\u0274\u027b\u0005X"+
		"\u0000\u0000\u0275\u0277\u0003\u0002\u0001\u0000\u0276\u0278\u0005\u00fc"+
		"\u0000\u0000\u0277\u0276\u0001\u0000\u0000\u0000\u0277\u0278\u0001\u0000"+
		"\u0000\u0000\u0278\u027a\u0001\u0000\u0000\u0000\u0279\u0275\u0001\u0000"+
		"\u0000\u0000\u027a\u027d\u0001\u0000\u0000\u0000\u027b\u0279\u0001\u0000"+
		"\u0000\u0000\u027b\u027c\u0001\u0000\u0000\u0000\u027c\u027e\u0001\u0000"+
		"\u0000\u0000\u027d\u027b\u0001\u0000\u0000\u0000\u027e\u027f\u0005Y\u0000"+
		"\u0000\u027f9\u0001\u0000\u0000\u0000\u0280\u0282\u0005&\u0000\u0000\u0281"+
		"\u0283\u00052\u0000\u0000\u0282\u0281\u0001\u0000\u0000\u0000\u0282\u0283"+
		"\u0001\u0000\u0000\u0000\u0283\u0285\u0001\u0000\u0000\u0000\u0284\u0286"+
		"\u0007\u0007\u0000\u0000\u0285\u0284\u0001\u0000\u0000\u0000\u0285\u0286"+
		"\u0001\u0000\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u0287\u0288"+
		"\u0005+\u0000\u0000\u0288\u0289\u0003b1\u0000\u0289\u028a\u0005\u001a"+
		"\u0000\u0000\u028a\u028b\u0003b1\u0000\u028b\u028c\u0005\u00fd\u0000\u0000"+
		"\u028c\u0291\u0003<\u001e\u0000\u028d\u028e\u0005\u00fb\u0000\u0000\u028e"+
		"\u0290\u0003<\u001e\u0000\u028f\u028d\u0001\u0000\u0000\u0000\u0290\u0293"+
		"\u0001\u0000\u0000\u0000\u0291\u028f\u0001\u0000\u0000\u0000\u0291\u0292"+
		"\u0001\u0000\u0000\u0000\u0292\u0294\u0001\u0000\u0000\u0000\u0293\u0291"+
		"\u0001\u0000\u0000\u0000\u0294\u0295\u0005\u00fe\u0000\u0000\u0295;\u0001"+
		"\u0000\u0000\u0000\u0296\u0298\u0003^/\u0000\u0297\u0299\u0007\t\u0000"+
		"\u0000\u0298\u0297\u0001\u0000\u0000\u0000\u0298\u0299\u0001\u0000\u0000"+
		"\u0000\u0299=\u0001\u0000\u0000\u0000\u029a\u029b\u0005&\u0000\u0000\u029b"+
		"\u029c\u0005*\u0000\u0000\u029c\u029d\u0003b1\u0000\u029d\u029e\u0005"+
		"V\u0000\u0000\u029e\u029f\u0003\u000e\u0007\u0000\u029f?\u0001\u0000\u0000"+
		"\u0000\u02a0\u02a1\u0005\'\u0000\u0000\u02a1\u02a2\u0005)\u0000\u0000"+
		"\u02a2\u02a3\u0003b1\u0000\u02a3\u02a8\u0003B!\u0000\u02a4\u02a5\u0005"+
		"\u00fb\u0000\u0000\u02a5\u02a7\u0003B!\u0000\u02a6\u02a4\u0001\u0000\u0000"+
		"\u0000\u02a7\u02aa\u0001\u0000\u0000\u0000\u02a8\u02a6\u0001\u0000\u0000"+
		"\u0000\u02a8\u02a9\u0001\u0000\u0000\u0000\u02a9A\u0001\u0000\u0000\u0000"+
		"\u02aa\u02a8\u0001\u0000\u0000\u0000\u02ab\u02ae\u0005b\u0000\u0000\u02ac"+
		"\u02af\u0003*\u0015\u0000\u02ad\u02af\u0003P(\u0000\u02ae\u02ac\u0001"+
		"\u0000\u0000\u0000\u02ae\u02ad\u0001\u0000\u0000\u0000\u02af\u02bb\u0001"+
		"\u0000\u0000\u0000\u02b0\u02b2\u0005(\u0000\u0000\u02b1\u02b3\u0007\n"+
		"\u0000\u0000\u02b2\u02b1\u0001\u0000\u0000\u0000\u02b2\u02b3\u0001\u0000"+
		"\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4\u02bb\u0003^/\u0000"+
		"\u02b5\u02b6\u0005\'\u0000\u0000\u02b6\u02b7\u0005\u00ad\u0000\u0000\u02b7"+
		"\u02b8\u0003^/\u0000\u02b8\u02b9\u0003,\u0016\u0000\u02b9\u02bb\u0001"+
		"\u0000\u0000\u0000\u02ba\u02ab\u0001\u0000\u0000\u0000\u02ba\u02b0\u0001"+
		"\u0000\u0000\u0000\u02ba\u02b5\u0001\u0000\u0000\u0000\u02bbC\u0001\u0000"+
		"\u0000\u0000\u02bc\u02bd\u0005\'\u0000\u0000\u02bd\u02be\u00050\u0000"+
		"\u0000\u02be\u02c7\u0003^/\u0000\u02bf\u02c0\u0005\u00ce\u0000\u0000\u02c0"+
		"\u02c1\u0005\u00aa\u0000\u0000\u02c1\u02c2\u0005\u00f0\u0000\u0000\u02c2"+
		"\u02c8\u0003^/\u0000\u02c3\u02c4\u0005\u0010\u0000\u0000\u02c4\u02c5\u0003"+
		"^/\u0000\u02c5\u02c6\u0003^/\u0000\u02c6\u02c8\u0001\u0000\u0000\u0000"+
		"\u02c7\u02bf\u0001\u0000\u0000\u0000\u02c7\u02c3\u0001\u0000\u0000\u0000"+
		"\u02c8E\u0001\u0000\u0000\u0000\u02c9\u02ca\u0005\'\u0000\u0000\u02ca"+
		"\u02cd\u0005+\u0000\u0000\u02cb\u02ce\u0003^/\u0000\u02cc\u02ce\u0005"+
		"\u009b\u0000\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000\u02cd\u02cc\u0001"+
		"\u0000\u0000\u0000\u02ce\u02cf\u0001\u0000\u0000\u0000\u02cf\u02d0\u0005"+
		"\u001a\u0000\u0000\u02d0\u02d1\u0003b1\u0000\u02d1\u02d2\u0007\u000b\u0000"+
		"\u0000\u02d2G\u0001\u0000\u0000\u0000\u02d3\u02d4\u0005\'\u0000\u0000"+
		"\u02d4\u02d5\u0005*\u0000\u0000\u02d5\u02d6\u0003b1\u0000\u02d6\u02d7"+
		"\u0005V\u0000\u0000\u02d7\u02d8\u0003\u000e\u0007\u0000\u02d8I\u0001\u0000"+
		"\u0000\u0000\u02d9\u02da\u0005\'\u0000\u0000\u02da\u02db\u0007\b\u0000"+
		"\u0000\u02db\u02e2\u0003b1\u0000\u02dc\u02de\u0005\u00fd\u0000\u0000\u02dd"+
		"\u02df\u0003R)\u0000\u02de\u02dd\u0001\u0000\u0000\u0000\u02de\u02df\u0001"+
		"\u0000\u0000\u0000\u02df\u02e0\u0001\u0000\u0000\u0000\u02e0\u02e3\u0005"+
		"\u00fe\u0000\u0000\u02e1\u02e3\u0003R)\u0000\u02e2\u02dc\u0001\u0000\u0000"+
		"\u0000\u02e2\u02e1\u0001\u0000\u0000\u0000\u02e2\u02e3\u0001\u0000\u0000"+
		"\u0000\u02e3\u02e4\u0001\u0000\u0000\u0000\u02e4\u02e5\u0005V\u0000\u0000"+
		"\u02e5\u02ec\u0005X\u0000\u0000\u02e6\u02e8\u0003\u0002\u0001\u0000\u02e7"+
		"\u02e9\u0005\u00fc\u0000\u0000\u02e8\u02e7\u0001\u0000\u0000\u0000\u02e8"+
		"\u02e9\u0001\u0000\u0000\u0000\u02e9\u02eb\u0001\u0000\u0000\u0000\u02ea"+
		"\u02e6\u0001\u0000\u0000\u0000\u02eb\u02ee\u0001\u0000\u0000\u0000\u02ec"+
		"\u02ea\u0001\u0000\u0000\u0000\u02ec\u02ed\u0001\u0000\u0000\u0000\u02ed"+
		"\u02ef\u0001\u0000\u0000\u0000\u02ee\u02ec\u0001\u0000\u0000\u0000\u02ef"+
		"\u02f0\u0005Y\u0000\u0000\u02f0K\u0001\u0000\u0000\u0000\u02f1\u02f2\u0005"+
		"\'\u0000\u0000\u02f2\u02f3\u0005\u00c9\u0000\u0000\u02f3\u02f9\u0003b"+
		"1\u0000\u02f4\u02f6\u0005\u00fd\u0000\u0000\u02f5\u02f7\u0003R)\u0000"+
		"\u02f6\u02f5\u0001\u0000\u0000\u0000\u02f6\u02f7\u0001\u0000\u0000\u0000"+
		"\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8\u02fa\u0005\u00fe\u0000\u0000"+
		"\u02f9\u02f4\u0001\u0000\u0000\u0000\u02f9\u02fa\u0001\u0000\u0000\u0000"+
		"\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fb\u02fc\u0005\u00c8\u0000\u0000"+
		"\u02fc\u02fd\u0003,\u0016\u0000\u02fd\u02fe\u0005V\u0000\u0000\u02fe\u0305"+
		"\u0005X\u0000\u0000\u02ff\u0301\u0003\u0002\u0001\u0000\u0300\u0302\u0005"+
		"\u00fc\u0000\u0000\u0301\u0300\u0001\u0000\u0000\u0000\u0301\u0302\u0001"+
		"\u0000\u0000\u0000\u0302\u0304\u0001\u0000\u0000\u0000\u0303\u02ff\u0001"+
		"\u0000\u0000\u0000\u0304\u0307\u0001\u0000\u0000\u0000\u0305\u0303\u0001"+
		"\u0000\u0000\u0000\u0305\u0306\u0001\u0000\u0000\u0000\u0306\u0308\u0001"+
		"\u0000\u0000\u0000\u0307\u0305\u0001\u0000\u0000\u0000\u0308\u0309\u0005"+
		"Y\u0000\u0000\u0309M\u0001\u0000\u0000\u0000\u030a\u030b\u0005\'\u0000"+
		"\u0000\u030b\u030c\u0005\u00cc\u0000\u0000\u030c\u030d\u0003^/\u0000\u030d"+
		"\u0310\u0005\u00d5\u0000\u0000\u030e\u030f\u0005\u00d6\u0000\u0000\u030f"+
		"\u0311\u0005\u00d7\u0000\u0000\u0310\u030e\u0001\u0000\u0000\u0000\u0310"+
		"\u0311\u0001\u0000\u0000\u0000\u0311\u0312\u0001\u0000\u0000\u0000\u0312"+
		"\u0313\u0003b1\u0000\u0313O\u0001\u0000\u0000\u0000\u0314\u0315\u0005"+
		",\u0000\u0000\u0315\u0317\u0003^/\u0000\u0316\u0314\u0001\u0000\u0000"+
		"\u0000\u0316\u0317\u0001\u0000\u0000\u0000\u0317\u0361\u0001\u0000\u0000"+
		"\u0000\u0318\u0319\u0005-\u0000\u0000\u0319\u031b\u0005/\u0000\u0000\u031a"+
		"\u031c\u0007\u0007\u0000\u0000\u031b\u031a\u0001\u0000\u0000\u0000\u031b"+
		"\u031c\u0001\u0000\u0000\u0000\u031c\u031d\u0001\u0000\u0000\u0000\u031d"+
		"\u031e\u0005\u00fd\u0000\u0000\u031e\u0323\u0003^/\u0000\u031f\u0320\u0005"+
		"\u00fb\u0000\u0000\u0320\u0322\u0003^/\u0000\u0321\u031f\u0001\u0000\u0000"+
		"\u0000\u0322\u0325\u0001\u0000\u0000\u0000\u0323\u0321\u0001\u0000\u0000"+
		"\u0000\u0323\u0324\u0001\u0000\u0000\u0000\u0324\u0326\u0001\u0000\u0000"+
		"\u0000\u0325\u0323\u0001\u0000\u0000\u0000\u0326\u0327\u0005\u00fe\u0000"+
		"\u0000\u0327\u0362\u0001\u0000\u0000\u0000\u0328\u032a\u00052\u0000\u0000"+
		"\u0329\u032b\u0007\u0007\u0000\u0000\u032a\u0329\u0001\u0000\u0000\u0000"+
		"\u032a\u032b\u0001\u0000\u0000\u0000\u032b\u032c\u0001\u0000\u0000\u0000"+
		"\u032c\u032d\u0005\u00fd\u0000\u0000\u032d\u0332\u0003^/\u0000\u032e\u032f"+
		"\u0005\u00fb\u0000\u0000\u032f\u0331\u0003^/\u0000\u0330\u032e\u0001\u0000"+
		"\u0000\u0000\u0331\u0334\u0001\u0000\u0000\u0000\u0332\u0330\u0001\u0000"+
		"\u0000\u0000\u0332\u0333\u0001\u0000\u0000\u0000\u0333\u0335\u0001\u0000"+
		"\u0000\u0000\u0334\u0332\u0001\u0000\u0000\u0000\u0335\u0336\u0005\u00fe"+
		"\u0000\u0000\u0336\u0362\u0001\u0000\u0000\u0000\u0337\u0338\u0005.\u0000"+
		"\u0000\u0338\u0339\u0005/\u0000\u0000\u0339\u033a\u0005\u00fd\u0000\u0000"+
		"\u033a\u033f\u0003^/\u0000\u033b\u033c\u0005\u00fb\u0000\u0000\u033c\u033e"+
		"\u0003^/\u0000\u033d\u033b\u0001\u0000\u0000\u0000\u033e\u0341\u0001\u0000"+
		"\u0000\u0000\u033f\u033d\u0001\u0000\u0000\u0000\u033f\u0340\u0001\u0000"+
		"\u0000\u0000\u0340\u0342\u0001\u0000\u0000\u0000\u0341\u033f\u0001\u0000"+
		"\u0000\u0000\u0342\u0343\u0005\u00fe\u0000\u0000\u0343\u0344\u00057\u0000"+
		"\u0000\u0344\u0350\u0003b1\u0000\u0345\u0346\u0005\u00fd\u0000\u0000\u0346"+
		"\u034b\u0003^/\u0000\u0347\u0348\u0005\u00fb\u0000\u0000\u0348\u034a\u0003"+
		"^/\u0000\u0349\u0347\u0001\u0000\u0000\u0000\u034a\u034d\u0001\u0000\u0000"+
		"\u0000\u034b\u0349\u0001\u0000\u0000\u0000\u034b\u034c\u0001\u0000\u0000"+
		"\u0000\u034c\u034e\u0001\u0000\u0000\u0000\u034d\u034b\u0001\u0000\u0000"+
		"\u0000\u034e\u034f\u0005\u00fe\u0000\u0000\u034f\u0351\u0001\u0000\u0000"+
		"\u0000\u0350\u0345\u0001\u0000\u0000\u0000\u0350\u0351\u0001\u0000\u0000"+
		"\u0000\u0351\u0355\u0001\u0000\u0000\u0000\u0352\u0353\u0005\u001a\u0000"+
		"\u0000\u0353\u0354\u0005\u000e\u0000\u0000\u0354\u0356\u0003X,\u0000\u0355"+
		"\u0352\u0001\u0000\u0000\u0000\u0355\u0356\u0001\u0000\u0000\u0000\u0356"+
		"\u035a\u0001\u0000\u0000\u0000\u0357\u0358\u0005\u001a\u0000\u0000\u0358"+
		"\u0359\u0005\u000f\u0000\u0000\u0359\u035b\u0003X,\u0000\u035a\u0357\u0001"+
		"\u0000\u0000\u0000\u035a\u035b\u0001\u0000\u0000\u0000\u035b\u0362\u0001"+
		"\u0000\u0000\u0000\u035c\u035d\u0005\u00e8\u0000\u0000\u035d\u035e\u0005"+
		"\u00fd\u0000\u0000\u035e\u035f\u0003|>\u0000\u035f\u0360\u0005\u00fe\u0000"+
		"\u0000\u0360\u0362\u0001\u0000\u0000\u0000\u0361\u0318\u0001\u0000\u0000"+
		"\u0000\u0361\u0328\u0001\u0000\u0000\u0000\u0361\u0337\u0001\u0000\u0000"+
		"\u0000\u0361\u035c\u0001\u0000\u0000\u0000\u0362Q\u0001\u0000\u0000\u0000"+
		"\u0363\u0368\u0003T*\u0000\u0364\u0365\u0005\u00fb\u0000\u0000\u0365\u0367"+
		"\u0003T*\u0000\u0366\u0364\u0001\u0000\u0000\u0000\u0367\u036a\u0001\u0000"+
		"\u0000\u0000\u0368\u0366\u0001\u0000\u0000\u0000\u0368\u0369\u0001\u0000"+
		"\u0000\u0000\u0369S\u0001\u0000\u0000\u0000\u036a\u0368\u0001\u0000\u0000"+
		"\u0000\u036b\u036e\u0005\u0105\u0000\u0000\u036c\u036e\u0003^/\u0000\u036d"+
		"\u036b\u0001\u0000\u0000\u0000\u036d\u036c\u0001\u0000\u0000\u0000\u036e"+
		"\u036f\u0001\u0000\u0000\u0000\u036f\u0372\u0003,\u0016\u0000\u0370\u0371"+
		"\u0005\u00f0\u0000\u0000\u0371\u0373\u0003Z-\u0000\u0372\u0370\u0001\u0000"+
		"\u0000\u0000\u0372\u0373\u0001\u0000\u0000\u0000\u0373\u0375\u0001\u0000"+
		"\u0000\u0000\u0374\u0376\u0005\u00c6\u0000\u0000\u0375\u0374\u0001\u0000"+
		"\u0000\u0000\u0375\u0376\u0001\u0000\u0000\u0000\u0376U\u0001\u0000\u0000"+
		"\u0000\u0377\u037a\u0003^/\u0000\u0378\u037a\u0005-\u0000\u0000\u0379"+
		"\u0377\u0001\u0000\u0000\u0000\u0379\u0378\u0001\u0000\u0000\u0000\u037a"+
		"W\u0001\u0000\u0000\u0000\u037b\u0384\u0005\u00a2\u0000\u0000\u037c\u037d"+
		"\u0005\u00a7\u0000\u0000\u037d\u0384\u0005\u00a3\u0000\u0000\u037e\u037f"+
		"\u0005\u0010\u0000\u0000\u037f\u0384\u0005\u001e\u0000\u0000\u0380\u0381"+
		"\u0005\u0010\u0000\u0000\u0381\u0384\u00055\u0000\u0000\u0382\u0384\u0005"+
		"\u00ac\u0000\u0000\u0383\u037b\u0001\u0000\u0000\u0000\u0383\u037c\u0001"+
		"\u0000\u0000\u0000\u0383\u037e\u0001\u0000\u0000\u0000\u0383\u0380\u0001"+
		"\u0000\u0000\u0000\u0383\u0382\u0001\u0000\u0000\u0000\u0384Y\u0001\u0000"+
		"\u0000\u0000\u0385\u039d\u0005\u00ec\u0000\u0000\u0386\u039d\u0005\u00ef"+
		"\u0000\u0000\u0387\u0389\u0005\u00f7\u0000\u0000\u0388\u0387\u0001\u0000"+
		"\u0000\u0000\u0388\u0389\u0001\u0000\u0000\u0000\u0389\u038a\u0001\u0000"+
		"\u0000\u0000\u038a\u039d\u0005\u00ef\u0000\u0000\u038b\u039d\u0005\u001e"+
		"\u0000\u0000\u038c\u039d\u00056\u0000\u0000\u038d\u039a\u0003^/\u0000"+
		"\u038e\u0397\u0005\u00fd\u0000\u0000\u038f\u0394\u0003|>\u0000\u0390\u0391"+
		"\u0005\u00fb\u0000\u0000\u0391\u0393\u0003|>\u0000\u0392\u0390\u0001\u0000"+
		"\u0000\u0000\u0393\u0396\u0001\u0000\u0000\u0000\u0394\u0392\u0001\u0000"+
		"\u0000\u0000\u0394\u0395\u0001\u0000\u0000\u0000\u0395\u0398\u0001\u0000"+
		"\u0000\u0000\u0396\u0394\u0001\u0000\u0000\u0000\u0397\u038f\u0001\u0000"+
		"\u0000\u0000\u0397\u0398\u0001\u0000\u0000\u0000\u0398\u0399\u0001\u0000"+
		"\u0000\u0000\u0399\u039b\u0005\u00fe\u0000\u0000\u039a\u038e\u0001\u0000"+
		"\u0000\u0000\u039a\u039b\u0001\u0000\u0000\u0000\u039b\u039d\u0001\u0000"+
		"\u0000\u0000\u039c\u0385\u0001\u0000\u0000\u0000\u039c\u0386\u0001\u0000"+
		"\u0000\u0000\u039c\u0388\u0001\u0000\u0000\u0000\u039c\u038b\u0001\u0000"+
		"\u0000\u0000\u039c\u038c\u0001\u0000\u0000\u0000\u039c\u038d\u0001\u0000"+
		"\u0000\u0000\u039d[\u0001\u0000\u0000\u0000\u039e\u03a8\u0005\u00f8\u0000"+
		"\u0000\u039f\u03a4\u0003^/\u0000\u03a0\u03a1\u0005\u00fb\u0000\u0000\u03a1"+
		"\u03a3\u0003^/\u0000\u03a2\u03a0\u0001\u0000\u0000\u0000\u03a3\u03a6\u0001"+
		"\u0000\u0000\u0000\u03a4\u03a2\u0001\u0000\u0000\u0000\u03a4\u03a5\u0001"+
		"\u0000\u0000\u0000\u03a5\u03a8\u0001\u0000\u0000\u0000\u03a6\u03a4\u0001"+
		"\u0000\u0000\u0000\u03a7\u039e\u0001\u0000\u0000\u0000\u03a7\u039f\u0001"+
		"\u0000\u0000\u0000\u03a8]\u0001\u0000\u0000\u0000\u03a9\u03ae\u0005\u0106"+
		"\u0000\u0000\u03aa\u03ae\u0005\u0103\u0000\u0000\u03ab\u03ae\u0005\u0104"+
		"\u0000\u0000\u03ac\u03ae\u0003`0\u0000\u03ad\u03a9\u0001\u0000\u0000\u0000"+
		"\u03ad\u03aa\u0001\u0000\u0000\u0000\u03ad\u03ab\u0001\u0000\u0000\u0000"+
		"\u03ad\u03ac\u0001\u0000\u0000\u0000\u03ae_\u0001\u0000\u0000\u0000\u03af"+
		"\u03b0\u0007\f\u0000\u0000\u03b0a\u0001\u0000\u0000\u0000\u03b1\u03b6"+
		"\u0003^/\u0000\u03b2\u03b3\u0005\u00ff\u0000\u0000\u03b3\u03b5\u0003^"+
		"/\u0000\u03b4\u03b2\u0001\u0000\u0000\u0000\u03b5\u03b8\u0001\u0000\u0000"+
		"\u0000\u03b6\u03b4\u0001\u0000\u0000\u0000\u03b6\u03b7\u0001\u0000\u0000"+
		"\u0000\u03b7c\u0001\u0000\u0000\u0000\u03b8\u03b6\u0001\u0000\u0000\u0000"+
		"\u03b9\u03be\u0003f3\u0000\u03ba\u03bb\u0005\u00fb\u0000\u0000\u03bb\u03bd"+
		"\u0003f3\u0000\u03bc\u03ba\u0001\u0000\u0000\u0000\u03bd\u03c0\u0001\u0000"+
		"\u0000\u0000\u03be\u03bc\u0001\u0000\u0000\u0000\u03be\u03bf\u0001\u0000"+
		"\u0000\u0000\u03bfe\u0001\u0000\u0000\u0000\u03c0\u03be\u0001\u0000\u0000"+
		"\u0000\u03c1\u03ce\u0003^/\u0000\u03c2\u03cb\u0005\u00fd\u0000\u0000\u03c3"+
		"\u03c8\u0003|>\u0000\u03c4\u03c5\u0005\u00fb\u0000\u0000\u03c5\u03c7\u0003"+
		"|>\u0000\u03c6\u03c4\u0001\u0000\u0000\u0000\u03c7\u03ca\u0001\u0000\u0000"+
		"\u0000\u03c8\u03c6\u0001\u0000\u0000\u0000\u03c8\u03c9\u0001\u0000\u0000"+
		"\u0000\u03c9\u03cc\u0001\u0000\u0000\u0000\u03ca\u03c8\u0001\u0000\u0000"+
		"\u0000\u03cb\u03c3\u0001\u0000\u0000\u0000\u03cb\u03cc\u0001\u0000\u0000"+
		"\u0000\u03cc\u03cd\u0001\u0000\u0000\u0000\u03cd\u03cf\u0005\u00fe\u0000"+
		"\u0000\u03ce\u03c2\u0001\u0000\u0000\u0000\u03ce\u03cf\u0001\u0000\u0000"+
		"\u0000\u03cf\u03d5\u0001\u0000\u0000\u0000\u03d0\u03d5\u0005\u0105\u0000"+
		"\u0000\u03d1\u03d5\u0005\u00ef\u0000\u0000\u03d2\u03d5\u0005\u00ec\u0000"+
		"\u0000\u03d3\u03d5\u0005\u001e\u0000\u0000\u03d4\u03c1\u0001\u0000\u0000"+
		"\u0000\u03d4\u03d0\u0001\u0000\u0000\u0000\u03d4\u03d1\u0001\u0000\u0000"+
		"\u0000\u03d4\u03d2\u0001\u0000\u0000\u0000\u03d4\u03d3\u0001\u0000\u0000"+
		"\u0000\u03d5g\u0001\u0000\u0000\u0000\u03d6\u03da\u0003j5\u0000\u03d7"+
		"\u03da\u0003l6\u0000\u03d8\u03da\u0003n7\u0000\u03d9\u03d6\u0001\u0000"+
		"\u0000\u0000\u03d9\u03d7\u0001\u0000\u0000\u0000\u03d9\u03d8\u0001\u0000"+
		"\u0000\u0000\u03dai\u0001\u0000\u0000\u0000\u03db\u03dc\u0005U\u0000\u0000"+
		"\u03dc\u03dd\u0003\u00aaU\u0000\u03dd\u03df\u0005\u0084\u0000\u0000\u03de"+
		"\u03e0\u0007\r\u0000\u0000\u03df\u03de\u0001\u0000\u0000\u0000\u03df\u03e0"+
		"\u0001\u0000\u0000\u0000\u03e0\u03e2\u0001\u0000\u0000\u0000\u03e1\u03e3"+
		"\u0007\u000e\u0000\u0000\u03e2\u03e1\u0001\u0000\u0000\u0000\u03e2\u03e3"+
		"\u0001\u0000\u0000\u0000\u03e3\u03e5\u0001\u0000\u0000\u0000\u03e4\u03e6"+
		"\u0007\u000f\u0000\u0000\u03e5\u03e4\u0001\u0000\u0000\u0000\u03e5\u03e6"+
		"\u0001\u0000\u0000\u0000\u03e6\u03e8\u0001\u0000\u0000\u0000\u03e7\u03e9"+
		"\u0007\u0010\u0000\u0000\u03e8\u03e7\u0001\u0000\u0000\u0000\u03e8\u03e9"+
		"\u0001\u0000\u0000\u0000\u03e9\u03eb\u0001\u0000\u0000\u0000\u03ea\u03ec"+
		"\u0005\u0090\u0000\u0000\u03eb\u03ea\u0001\u0000\u0000\u0000\u03eb\u03ec"+
		"\u0001\u0000\u0000\u0000\u03ec\u03ed\u0001\u0000\u0000\u0000\u03ed\u03ee"+
		"\u0005\u0091\u0000\u0000\u03ee\u03fc\u0003\u000e\u0007\u0000\u03ef\u03f0"+
		"\u0005\u0091\u0000\u0000\u03f0\u03fa\u0005\u000f\u0000\u0000\u03f1\u03f2"+
		"\u0005\u0092\u0000\u0000\u03f2\u03f7\u0003\u00a6S\u0000\u03f3\u03f4\u0005"+
		"\u00fb\u0000\u0000\u03f4\u03f6\u0003\u00a6S\u0000\u03f5\u03f3\u0001\u0000"+
		"\u0000\u0000\u03f6\u03f9\u0001\u0000\u0000\u0000\u03f7\u03f5\u0001\u0000"+
		"\u0000\u0000\u03f7\u03f8\u0001\u0000\u0000\u0000\u03f8\u03fb\u0001\u0000"+
		"\u0000\u0000\u03f9\u03f7\u0001\u0000\u0000\u0000\u03fa\u03f1\u0001\u0000"+
		"\u0000\u0000\u03fa\u03fb\u0001\u0000\u0000\u0000\u03fb\u03fd\u0001\u0000"+
		"\u0000\u0000\u03fc\u03ef\u0001\u0000\u0000\u0000\u03fc\u03fd\u0001\u0000"+
		"\u0000\u0000\u03fdk\u0001\u0000\u0000\u0000\u03fe\u0404\u0005\u0093\u0000"+
		"\u0000\u03ff\u0401\u0005\u0086\u0000\u0000\u0400\u03ff\u0001\u0000\u0000"+
		"\u0000\u0400\u0401\u0001\u0000\u0000\u0000\u0401\u0402\u0001\u0000\u0000"+
		"\u0000\u0402\u0405\u0003\u00aaU\u0000\u0403\u0405\u0003\u00acV\u0000\u0404"+
		"\u0400\u0001\u0000\u0000\u0000\u0404\u0403\u0001\u0000\u0000\u0000\u0405"+
		"m\u0001\u0000\u0000\u0000\u0406\u040a\u0005u\u0000\u0000\u0407\u0408\u0003"+
		"p8\u0000\u0408\u0409\u0005\u0002\u0000\u0000\u0409\u040b\u0001\u0000\u0000"+
		"\u0000\u040a\u0407\u0001\u0000\u0000\u0000\u040a\u040b\u0001\u0000\u0000"+
		"\u0000\u040b\u0411\u0001\u0000\u0000\u0000\u040c\u040e\u0005\u0086\u0000"+
		"\u0000\u040d\u040c\u0001\u0000\u0000\u0000\u040d\u040e\u0001\u0000\u0000"+
		"\u0000\u040e\u040f\u0001\u0000\u0000\u0000\u040f\u0412\u0003\u00aaU\u0000"+
		"\u0410\u0412\u0005\u0105\u0000\u0000\u0411\u040d\u0001\u0000\u0000\u0000"+
		"\u0411\u0410\u0001\u0000\u0000\u0000\u0412\u041c\u0001\u0000\u0000\u0000"+
		"\u0413\u0414\u0005\u0012\u0000\u0000\u0414\u0419\u0005\u0105\u0000\u0000"+
		"\u0415\u0416\u0005\u00fb\u0000\u0000\u0416\u0418\u0005\u0105\u0000\u0000"+
		"\u0417\u0415\u0001\u0000\u0000\u0000\u0418\u041b\u0001\u0000\u0000\u0000"+
		"\u0419\u0417\u0001\u0000\u0000\u0000\u0419\u041a\u0001\u0000\u0000\u0000"+
		"\u041a\u041d\u0001\u0000\u0000\u0000\u041b\u0419\u0001\u0000\u0000\u0000"+
		"\u041c\u0413\u0001\u0000\u0000\u0000\u041c\u041d\u0001\u0000\u0000\u0000"+
		"\u041do\u0001\u0000\u0000\u0000\u041e\u0427\u0005v\u0000\u0000\u041f\u0427"+
		"\u0005\u0094\u0000\u0000\u0420\u0427\u0005\u0095\u0000\u0000\u0421\u0427"+
		"\u0005\u0096\u0000\u0000\u0422\u0423\u0005\u0097\u0000\u0000\u0423\u0427"+
		"\u0007\u0011\u0000\u0000\u0424\u0425\u0005\u0098\u0000\u0000\u0425\u0427"+
		"\u0007\u0011\u0000\u0000\u0426\u041e\u0001\u0000\u0000\u0000\u0426\u041f"+
		"\u0001\u0000\u0000\u0000\u0426\u0420\u0001\u0000\u0000\u0000\u0426\u0421"+
		"\u0001\u0000\u0000\u0000\u0426\u0422\u0001\u0000\u0000\u0000\u0426\u0424"+
		"\u0001\u0000\u0000\u0000\u0427q\u0001\u0000\u0000\u0000\u0428\u042e\u0005"+
		"\u0099\u0000\u0000\u0429\u042b\u0005\u0086\u0000\u0000\u042a\u0429\u0001"+
		"\u0000\u0000\u0000\u042a\u042b\u0001\u0000\u0000\u0000\u042b\u042c\u0001"+
		"\u0000\u0000\u0000\u042c\u042f\u0003\u00a0P\u0000\u042d\u042f\u0005\u0105"+
		"\u0000\u0000\u042e\u042a\u0001\u0000\u0000\u0000\u042e\u042d\u0001\u0000"+
		"\u0000\u0000\u042fs\u0001\u0000\u0000\u0000\u0430\u0436\u0005\u009a\u0000"+
		"\u0000\u0431\u0433\u0005\u0086\u0000\u0000\u0432\u0431\u0001\u0000\u0000"+
		"\u0000\u0432\u0433\u0001\u0000\u0000\u0000\u0433\u0434\u0001\u0000\u0000"+
		"\u0000\u0434\u0437\u0003\u00a0P\u0000\u0435\u0437\u0005\u0105\u0000\u0000"+
		"\u0436\u0432\u0001\u0000\u0000\u0000\u0436\u0435\u0001\u0000\u0000\u0000"+
		"\u0437u\u0001\u0000\u0000\u0000\u0438\u043d\u0005d\u0000\u0000\u0439\u043c"+
		"\u0003|>\u0000\u043a\u043c\u0005\u0105\u0000\u0000\u043b\u0439\u0001\u0000"+
		"\u0000\u0000\u043b\u043a\u0001\u0000\u0000\u0000\u043c\u043f\u0001\u0000"+
		"\u0000\u0000\u043d\u043b\u0001\u0000\u0000\u0000\u043d\u043e\u0001\u0000"+
		"\u0000\u0000\u043ew\u0001\u0000\u0000\u0000\u043f\u043d\u0001\u0000\u0000"+
		"\u0000\u0440\u0441\u0005q\u0000\u0000\u0441\u0446\u0003z=\u0000\u0442"+
		"\u0443\u0005\u00fb\u0000\u0000\u0443\u0445\u0003z=\u0000\u0444\u0442\u0001"+
		"\u0000\u0000\u0000\u0445\u0448\u0001\u0000\u0000\u0000\u0446\u0444\u0001"+
		"\u0000\u0000\u0000\u0446\u0447\u0001\u0000\u0000\u0000\u0447\u0449\u0001"+
		"\u0000\u0000\u0000\u0448\u0446\u0001\u0000\u0000\u0000\u0449\u044a\u0003"+
		"\u000e\u0007\u0000\u044ay\u0001\u0000\u0000\u0000\u044b\u0450\u0003\u00a0"+
		"P\u0000\u044c\u044d\u0005\u00fd\u0000\u0000\u044d\u044e\u0003\u009eO\u0000"+
		"\u044e\u044f\u0005\u00fe\u0000\u0000\u044f\u0451\u0001\u0000\u0000\u0000"+
		"\u0450\u044c\u0001\u0000\u0000\u0000\u0450\u0451\u0001\u0000\u0000\u0000"+
		"\u0451\u0452\u0001\u0000\u0000\u0000\u0452\u0453\u0005V\u0000\u0000\u0453"+
		"\u0454\u0005\u00fd\u0000\u0000\u0454\u0455\u0003\u000e\u0007\u0000\u0455"+
		"\u0456\u0005\u00fe\u0000\u0000\u0456{\u0001\u0000\u0000\u0000\u0457\u0458"+
		"\u0006>\uffff\uffff\u0000\u0458\u0468\u0003\u0080@\u0000\u0459\u045a\u0005"+
		"\u001d\u0000\u0000\u045a\u0468\u0003|>\u0004\u045b\u045d\u0005]\u0000"+
		"\u0000\u045c\u045e\u0003~?\u0000\u045d\u045c\u0001\u0000\u0000\u0000\u045e"+
		"\u045f\u0001\u0000\u0000\u0000\u045f\u045d\u0001\u0000\u0000\u0000\u045f"+
		"\u0460\u0001\u0000\u0000\u0000\u0460\u0463\u0001\u0000\u0000\u0000\u0461"+
		"\u0462\u0005[\u0000\u0000\u0462\u0464\u0003|>\u0000\u0463\u0461\u0001"+
		"\u0000\u0000\u0000\u0463\u0464\u0001\u0000\u0000\u0000\u0464\u0465\u0001"+
		"\u0000\u0000\u0000\u0465\u0466\u0005Y\u0000\u0000\u0466\u0468\u0001\u0000"+
		"\u0000\u0000\u0467\u0457\u0001\u0000\u0000\u0000\u0467\u0459\u0001\u0000"+
		"\u0000\u0000\u0467\u045b\u0001\u0000\u0000\u0000\u0468\u0498\u0001\u0000"+
		"\u0000\u0000\u0469\u046a\n\n\u0000\u0000\u046a\u046b\u0007\u0012\u0000"+
		"\u0000\u046b\u0497\u0003|>\u000b\u046c\u046d\n\t\u0000\u0000\u046d\u046e"+
		"\u0007\u0013\u0000\u0000\u046e\u0497\u0003|>\n\u046f\u0470\n\b\u0000\u0000"+
		"\u0470\u0471\u0007\u0014\u0000\u0000\u0471\u0497\u0003|>\t\u0472\u0474"+
		"\n\u0006\u0000\u0000\u0473\u0475\u0005\u001d\u0000\u0000\u0474\u0473\u0001"+
		"\u0000\u0000\u0000\u0474\u0475\u0001\u0000\u0000\u0000\u0475\u0476\u0001"+
		"\u0000\u0000\u0000\u0476\u0477\u0005$\u0000\u0000\u0477\u0478\u0003|>"+
		"\u0000\u0478\u0479\u0005\u001b\u0000\u0000\u0479\u047a\u0003|>\u0007\u047a"+
		"\u0497\u0001\u0000\u0000\u0000\u047b\u047c\n\u0003\u0000\u0000\u047c\u047d"+
		"\u0005\u001b\u0000\u0000\u047d\u0497\u0003|>\u0004\u047e\u047f\n\u0002"+
		"\u0000\u0000\u047f\u0480\u0005\u001c\u0000\u0000\u0480\u0497\u0003|>\u0003"+
		"\u0481\u0483\n\u0007\u0000\u0000\u0482\u0484\u0005\u001d\u0000\u0000\u0483"+
		"\u0482\u0001\u0000\u0000\u0000\u0483\u0484\u0001\u0000\u0000\u0000\u0484"+
		"\u0485\u0001\u0000\u0000\u0000\u0485\u048e\u0005\"\u0000\u0000\u0486\u0489"+
		"\u0005\u00fd\u0000\u0000\u0487\u048a\u0003\u009cN\u0000\u0488\u048a\u0003"+
		"\u000e\u0007\u0000\u0489\u0487\u0001\u0000\u0000\u0000\u0489\u0488\u0001"+
		"\u0000\u0000\u0000\u048a\u048b\u0001\u0000\u0000\u0000\u048b\u048c\u0005"+
		"\u00fe\u0000\u0000\u048c\u048f\u0001\u0000\u0000\u0000\u048d\u048f\u0003"+
		"|>\u0000\u048e\u0486\u0001\u0000\u0000\u0000\u048e\u048d\u0001\u0000\u0000"+
		"\u0000\u048f\u0497\u0001\u0000\u0000\u0000\u0490\u0491\n\u0005\u0000\u0000"+
		"\u0491\u0493\u0005!\u0000\u0000\u0492\u0494\u0005\u001d\u0000\u0000\u0493"+
		"\u0492\u0001\u0000\u0000\u0000\u0493\u0494\u0001\u0000\u0000\u0000\u0494"+
		"\u0495\u0001\u0000\u0000\u0000\u0495\u0497\u0005\u001e\u0000\u0000\u0496"+
		"\u0469\u0001\u0000\u0000\u0000\u0496\u046c\u0001\u0000\u0000\u0000\u0496"+
		"\u046f\u0001\u0000\u0000\u0000\u0496\u0472\u0001\u0000\u0000\u0000\u0496"+
		"\u047b\u0001\u0000\u0000\u0000\u0496\u047e\u0001\u0000\u0000\u0000\u0496"+
		"\u0481\u0001\u0000\u0000\u0000\u0496\u0490\u0001\u0000\u0000\u0000\u0497"+
		"\u049a\u0001\u0000\u0000\u0000\u0498\u0496\u0001\u0000\u0000\u0000\u0498"+
		"\u0499\u0001\u0000\u0000\u0000\u0499}\u0001\u0000\u0000\u0000\u049a\u0498"+
		"\u0001\u0000\u0000\u0000\u049b\u049c\u0005^\u0000\u0000\u049c\u049d\u0003"+
		"|>\u0000\u049d\u049e\u0005_\u0000\u0000\u049e\u049f\u0003|>\u0000\u049f"+
		"\u007f\u0001\u0000\u0000\u0000\u04a0\u04ab\u0003\u00a6S\u0000\u04a1\u04ab"+
		"\u0003\u00a2Q\u0000\u04a2\u04ab\u0003^/\u0000\u04a3\u04ab\u0005\u0105"+
		"\u0000\u0000\u04a4\u04ab\u0003\u0092I\u0000\u04a5\u04a6\u0005\u00fd\u0000"+
		"\u0000\u04a6\u04a7\u0003|>\u0000\u04a7\u04a8\u0005\u00fe\u0000\u0000\u04a8"+
		"\u04ab\u0001\u0000\u0000\u0000\u04a9\u04ab\u0003\u0094J\u0000\u04aa\u04a0"+
		"\u0001\u0000\u0000\u0000\u04aa\u04a1\u0001\u0000\u0000\u0000\u04aa\u04a2"+
		"\u0001\u0000\u0000\u0000\u04aa\u04a3\u0001\u0000\u0000\u0000\u04aa\u04a4"+
		"\u0001\u0000\u0000\u0000\u04aa\u04a5\u0001\u0000\u0000\u0000\u04aa\u04a9"+
		"\u0001\u0000\u0000\u0000\u04ab\u0081\u0001\u0000\u0000\u0000\u04ac\u04b1"+
		"\u0003\u00a0P\u0000\u04ad\u04af\u0005V\u0000\u0000\u04ae\u04ad\u0001\u0000"+
		"\u0000\u0000\u04ae\u04af\u0001\u0000\u0000\u0000\u04af\u04b0\u0001\u0000"+
		"\u0000\u0000\u04b0\u04b2\u0003\u00a8T\u0000\u04b1\u04ae\u0001\u0000\u0000"+
		"\u0000\u04b1\u04b2\u0001\u0000\u0000\u0000\u04b2\u04bc\u0001\u0000\u0000"+
		"\u0000\u04b3\u04b4\u0005\u00fd\u0000\u0000\u04b4\u04b5\u0003\u000e\u0007"+
		"\u0000\u04b5\u04b7\u0005\u00fe\u0000\u0000\u04b6\u04b8\u0005V\u0000\u0000"+
		"\u04b7\u04b6\u0001\u0000\u0000\u0000\u04b7\u04b8\u0001\u0000\u0000\u0000"+
		"\u04b8\u04b9\u0001\u0000\u0000\u0000\u04b9\u04ba\u0003\u00a8T\u0000\u04ba"+
		"\u04bc\u0001\u0000\u0000\u0000\u04bb\u04ac\u0001\u0000\u0000\u0000\u04bb"+
		"\u04b3\u0001\u0000\u0000\u0000\u04bc\u0083\u0001\u0000\u0000\u0000\u04bd"+
		"\u04c8\u0005\u0014\u0000\u0000\u04be\u04c0\u0005\u0015\u0000\u0000\u04bf"+
		"\u04c1\u0005\u0018\u0000\u0000\u04c0\u04bf\u0001\u0000\u0000\u0000\u04c0"+
		"\u04c1\u0001\u0000\u0000\u0000\u04c1\u04c8\u0001\u0000\u0000\u0000\u04c2"+
		"\u04c4\u0005\u0016\u0000\u0000\u04c3\u04c5\u0005\u0018\u0000\u0000\u04c4"+
		"\u04c3\u0001\u0000\u0000\u0000\u04c4\u04c5\u0001\u0000\u0000\u0000\u04c5"+
		"\u04c8\u0001\u0000\u0000\u0000\u04c6\u04c8\u0005\u0019\u0000\u0000\u04c7"+
		"\u04bd\u0001\u0000\u0000\u0000\u04c7\u04be\u0001\u0000\u0000\u0000\u04c7"+
		"\u04c2\u0001\u0000\u0000\u0000\u04c7\u04c6\u0001\u0000\u0000\u0000\u04c7"+
		"\u04c8\u0001\u0000\u0000\u0000\u04c8\u04c9\u0001\u0000\u0000\u0000\u04c9"+
		"\u04ca\u0005\u0013\u0000\u0000\u04ca\u04cb\u0003\u0082A\u0000\u04cb\u04cc"+
		"\u0005\u001a\u0000\u0000\u04cc\u04cd\u0003|>\u0000\u04cd\u0085\u0001\u0000"+
		"\u0000\u0000\u04ce\u04cf\u0005\u0004\u0000\u0000\u04cf\u04d0\u0005\u0005"+
		"\u0000\u0000\u04d0\u04d5\u0003\u0088D\u0000\u04d1\u04d2\u0005\u00fb\u0000"+
		"\u0000\u04d2\u04d4\u0003\u0088D\u0000\u04d3\u04d1\u0001\u0000\u0000\u0000"+
		"\u04d4\u04d7\u0001\u0000\u0000\u0000\u04d5\u04d3\u0001\u0000\u0000\u0000"+
		"\u04d5\u04d6\u0001\u0000\u0000\u0000\u04d6\u0087\u0001\u0000\u0000\u0000"+
		"\u04d7\u04d5\u0001\u0000\u0000\u0000\u04d8\u04ea\u0003|>\u0000\u04d9\u04da"+
		"\u0005\u009c\u0000\u0000\u04da\u04db\u0005\u00fd\u0000\u0000\u04db\u04dc"+
		"\u0003\u009cN\u0000\u04dc\u04dd\u0005\u00fe\u0000\u0000\u04dd\u04ea\u0001"+
		"\u0000\u0000\u0000\u04de\u04df\u0005\u009d\u0000\u0000\u04df\u04e0\u0005"+
		"\u00fd\u0000\u0000\u04e0\u04e1\u0003\u009cN\u0000\u04e1\u04e2\u0005\u00fe"+
		"\u0000\u0000\u04e2\u04ea\u0001\u0000\u0000\u0000\u04e3\u04e4\u0005\u009e"+
		"\u0000\u0000\u04e4\u04e5\u0005\u009f\u0000\u0000\u04e5\u04e6\u0005\u00fd"+
		"\u0000\u0000\u04e6\u04e7\u0003\u008aE\u0000\u04e7\u04e8\u0005\u00fe\u0000"+
		"\u0000\u04e8\u04ea\u0001\u0000\u0000\u0000\u04e9\u04d8\u0001\u0000\u0000"+
		"\u0000\u04e9\u04d9\u0001\u0000\u0000\u0000\u04e9\u04de\u0001\u0000\u0000"+
		"\u0000\u04e9\u04e3\u0001\u0000\u0000\u0000\u04ea\u0089\u0001\u0000\u0000"+
		"\u0000\u04eb\u04f0\u0003\u008cF\u0000\u04ec\u04ed\u0005\u00fb\u0000\u0000"+
		"\u04ed\u04ef\u0003\u008cF\u0000\u04ee\u04ec\u0001\u0000\u0000\u0000\u04ef"+
		"\u04f2\u0001\u0000\u0000\u0000\u04f0\u04ee\u0001\u0000\u0000\u0000\u04f0"+
		"\u04f1\u0001\u0000\u0000\u0000\u04f1\u008b\u0001\u0000\u0000\u0000\u04f2"+
		"\u04f0\u0001\u0000\u0000\u0000\u04f3\u04fa\u0003|>\u0000\u04f4\u04f6\u0005"+
		"\u00fd\u0000\u0000\u04f5\u04f7\u0003\u009cN\u0000\u04f6\u04f5\u0001\u0000"+
		"\u0000\u0000\u04f6\u04f7\u0001\u0000\u0000\u0000\u04f7\u04f8\u0001\u0000"+
		"\u0000\u0000\u04f8\u04fa\u0005\u00fe\u0000\u0000\u04f9\u04f3\u0001\u0000"+
		"\u0000\u0000\u04f9\u04f4\u0001\u0000\u0000\u0000\u04fa\u008d\u0001\u0000"+
		"\u0000\u0000\u04fb\u04fc\u0005\u0007\u0000\u0000\u04fc\u04fd\u0005\u0005"+
		"\u0000\u0000\u04fd\u0502\u0003\u0090H\u0000\u04fe\u04ff\u0005\u00fb\u0000"+
		"\u0000\u04ff\u0501\u0003\u0090H\u0000\u0500\u04fe\u0001\u0000\u0000\u0000"+
		"\u0501\u0504\u0001\u0000\u0000\u0000\u0502\u0500\u0001\u0000\u0000\u0000"+
		"\u0502\u0503\u0001\u0000\u0000\u0000\u0503\u008f\u0001\u0000\u0000\u0000"+
		"\u0504\u0502\u0001\u0000\u0000\u0000\u0505\u0507\u0003|>\u0000\u0506\u0508"+
		"\u0007\t\u0000\u0000\u0507\u0506\u0001\u0000\u0000\u0000\u0507\u0508\u0001"+
		"\u0000\u0000\u0000\u0508\u0091\u0001\u0000\u0000\u0000\u0509\u050a\u0007"+
		"\u0015\u0000\u0000\u050a\u050d\u0005\u00fd\u0000\u0000\u050b\u050e\u0005"+
		"\u00f8\u0000\u0000\u050c\u050e\u0003\u009cN\u0000\u050d\u050b\u0001\u0000"+
		"\u0000\u0000\u050d\u050c\u0001\u0000\u0000\u0000\u050d\u050e\u0001\u0000"+
		"\u0000\u0000\u050e\u050f\u0001\u0000\u0000\u0000\u050f\u0510\u0005\u00fe"+
		"\u0000\u0000\u0510\u0093\u0001\u0000\u0000\u0000\u0511\u0512\u0005\u00fd"+
		"\u0000\u0000\u0512\u0513\u0003\u000e\u0007\u0000\u0513\u0514\u0005\u00fe"+
		"\u0000\u0000\u0514\u0095\u0001\u0000\u0000\u0000\u0515\u0516\u0005\u0006"+
		"\u0000\u0000\u0516\u0517\u0003|>\u0000\u0517\u0097\u0001\u0000\u0000\u0000"+
		"\u0518\u0519\u0005\u0003\u0000\u0000\u0519\u051a\u0003|>\u0000\u051a\u0099"+
		"\u0001\u0000\u0000\u0000\u051b\u051c\u0003\u00a6S\u0000\u051c\u051d\u0007"+
		"\u0016\u0000\u0000\u051d\u051e\u0003|>\u0000\u051e\u009b\u0001\u0000\u0000"+
		"\u0000\u051f\u0524\u0003|>\u0000\u0520\u0521\u0005\u00fb\u0000\u0000\u0521"+
		"\u0523\u0003|>\u0000\u0522\u0520\u0001\u0000\u0000\u0000\u0523\u0526\u0001"+
		"\u0000\u0000\u0000\u0524\u0522\u0001\u0000\u0000\u0000\u0524\u0525\u0001"+
		"\u0000\u0000\u0000\u0525\u009d\u0001\u0000\u0000\u0000\u0526\u0524\u0001"+
		"\u0000\u0000\u0000\u0527\u052c\u0003\u00a0P\u0000\u0528\u0529\u0005\u00fb"+
		"\u0000\u0000\u0529\u052b\u0003\u00a0P\u0000\u052a\u0528\u0001\u0000\u0000"+
		"\u0000\u052b\u052e\u0001\u0000\u0000\u0000\u052c\u052a\u0001\u0000\u0000"+
		"\u0000\u052c\u052d\u0001\u0000\u0000\u0000\u052d\u009f\u0001\u0000\u0000"+
		"\u0000\u052e\u052c\u0001\u0000\u0000\u0000\u052f\u0532\u0005\u0106\u0000"+
		"\u0000\u0530\u0531\u0005\u00ff\u0000\u0000\u0531\u0533\u0005\u0106\u0000"+
		"\u0000\u0532\u0530\u0001\u0000\u0000\u0000\u0532\u0533\u0001\u0000\u0000"+
		"\u0000\u0533\u053b\u0001\u0000\u0000\u0000\u0534\u0535\u0005\u0106\u0000"+
		"\u0000\u0535\u0537\u0005\u00ff\u0000\u0000\u0536\u0534\u0001\u0000\u0000"+
		"\u0000\u0536\u0537\u0001\u0000\u0000\u0000\u0537\u0538\u0001\u0000\u0000"+
		"\u0000\u0538\u053b\u0005\u0103\u0000\u0000\u0539\u053b\u0005\u0103\u0000"+
		"\u0000\u053a\u052f\u0001\u0000\u0000\u0000\u053a\u0536\u0001\u0000\u0000"+
		"\u0000\u053a\u0539\u0001\u0000\u0000\u0000\u053b\u00a1\u0001\u0000\u0000"+
		"\u0000\u053c\u053d\u0007\u0017\u0000\u0000\u053d\u00a3\u0001\u0000\u0000"+
		"\u0000\u053e\u053f\u0003\u00a0P\u0000\u053f\u00a5\u0001\u0000\u0000\u0000"+
		"\u0540\u0541\u0003\u00a0P\u0000\u0541\u00a7\u0001\u0000\u0000\u0000\u0542"+
		"\u0543\u0005\u0106\u0000\u0000\u0543\u00a9\u0001\u0000\u0000\u0000\u0544"+
		"\u0545\u0005\u0106\u0000\u0000\u0545\u00ab\u0001\u0000\u0000\u0000\u0546"+
		"\u0547\u0005\u0105\u0000\u0000\u0547\u00ad\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b0\u00b3\u00b5\u00c4\u00cd\u00d1\u00dc\u00e3\u00e9\u00ed\u00f1\u00f9"+
		"\u00fc\u00ff\u0102\u0105\u0108\u0110\u0115\u0118\u011e\u0121\u0125\u0128"+
		"\u012e\u0132\u0139\u0141\u014b\u0153\u0156\u0159\u015d\u0161\u0169\u0172"+
		"\u017b\u0181\u0188\u018f\u0194\u0196\u019f\u01a4\u01a9\u01ad\u01b4\u01bc"+
		"\u01c3\u01c7\u01cf\u01d3\u01da\u01dd\u01ea\u01f8\u01fc\u0201\u0208\u020f"+
		"\u0212\u0221\u0226\u022b\u022d\u0238\u023e\u0242\u024d\u0254\u0258\u025e"+
		"\u0262\u026c\u026f\u0277\u027b\u0282\u0285\u0291\u0298\u02a8\u02ae\u02b2"+
		"\u02ba\u02c7\u02cd\u02de\u02e2\u02e8\u02ec\u02f6\u02f9\u0301\u0305\u0310"+
		"\u0316\u031b\u0323\u032a\u0332\u033f\u034b\u0350\u0355\u035a\u0361\u0368"+
		"\u036d\u0372\u0375\u0379\u0383\u0388\u0394\u0397\u039a\u039c\u03a4\u03a7"+
		"\u03ad\u03b6\u03be\u03c8\u03cb\u03ce\u03d4\u03d9\u03df\u03e2\u03e5\u03e8"+
		"\u03eb\u03f7\u03fa\u03fc\u0400\u0404\u040a\u040d\u0411\u0419\u041c\u0426"+
		"\u042a\u042e\u0432\u0436\u043b\u043d\u0446\u0450\u045f\u0463\u0467\u0474"+
		"\u0483\u0489\u048e\u0493\u0496\u0498\u04aa\u04ae\u04b1\u04b7\u04bb\u04c0"+
		"\u04c4\u04c7\u04d5\u04e9\u04f0\u04f6\u04f9\u0502\u0507\u050d\u0524\u052c"+
		"\u0532\u0536\u053a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}