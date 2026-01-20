// Generated from C:/Users/LEGION/Desktop/compiler-project/src/SQLGrammarParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SQLGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

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
		RULE_sql_sdecript = 0, RULE_statement = 1, RULE_use_statement = 2, RULE_while_statement = 3, 
		RULE_if_statement = 4, RULE_block_statement = 5, RULE_declaration_statement = 6, 
		RULE_variable_declaration = 7, RULE_dml_statement = 8, RULE_select_statement = 9, 
		RULE_select_list = 10, RULE_select_element = 11, RULE_insert_statement = 12, 
		RULE_row_value_constructor_list = 13, RULE_row_value_constructor = 14, 
		RULE_update_statement = 15, RULE_delete_statement = 16, RULE_ddlStatement = 17, 
		RULE_createStatement = 18, RULE_alterStatement = 19, RULE_dropStatement = 20, 
		RULE_truncateStatement = 21, RULE_otherStatements = 22, RULE_returnStatement = 23, 
		RULE_tableElement = 24, RULE_columnDefinition = 25, RULE_dataType = 26, 
		RULE_columnConstraint = 27, RULE_createTable = 28, RULE_createDatabase = 29, 
		RULE_createSchema = 30, RULE_createProcedure = 31, RULE_createFunction = 32, 
		RULE_createIndex = 33, RULE_indexColumn = 34, RULE_createView = 35, RULE_alterTable = 36, 
		RULE_alterTableAction = 37, RULE_alterDatabase = 38, RULE_alterIndex = 39, 
		RULE_alterView = 40, RULE_alterProcedure = 41, RULE_alterFunction = 42, 
		RULE_alterSchema = 43, RULE_tableConstraint = 44, RULE_parameterList = 45, 
		RULE_parameter = 46, RULE_fileGroup = 47, RULE_action = 48, RULE_defaultValue = 49, 
		RULE_columnList = 50, RULE_identifier = 51, RULE_anyKeywordAsIdentifier = 52, 
		RULE_fullIdentifier = 53, RULE_valueList = 54, RULE_value = 55, RULE_cursor_statement = 56, 
		RULE_declare_cursor = 57, RULE_open_cursor = 58, RULE_fetch_statement = 59, 
		RULE_fetch_direction = 60, RULE_close_cursor = 61, RULE_deallocate_cursor = 62, 
		RULE_print_statement = 63, RULE_with_clause = 64, RULE_common_table_expression = 65, 
		RULE_expression = 66, RULE_exists_predicate = 67, RULE_subquery = 68, 
		RULE_when_clause = 69, RULE_primary_expression = 70, RULE_table_source = 71, 
		RULE_join_clause = 72, RULE_group_by_clause = 73, RULE_group_by_item = 74, 
		RULE_grouping_set_list = 75, RULE_grouping_set = 76, RULE_order_by_clause = 77, 
		RULE_order_by_expression = 78, RULE_function_call = 79, RULE_function_name = 80, 
		RULE_scalar_subquery = 81, RULE_having_clause = 82, RULE_where_clause = 83, 
		RULE_assignment = 84, RULE_expression_list = 85, RULE_column_list = 86, 
		RULE_identifier_ref = 87, RULE_constant = 88, RULE_table_name = 89, RULE_column_name = 90, 
		RULE_table_alias = 91, RULE_cursor_name = 92, RULE_cursor_variable_name = 93, 
		RULE_alias = 94;
	private static String[] makeRuleNames() {
		return new String[] {
			"sql_sdecript", "statement", "use_statement", "while_statement", "if_statement", 
			"block_statement", "declaration_statement", "variable_declaration", "dml_statement", 
			"select_statement", "select_list", "select_element", "insert_statement", 
			"row_value_constructor_list", "row_value_constructor", "update_statement", 
			"delete_statement", "ddlStatement", "createStatement", "alterStatement", 
			"dropStatement", "truncateStatement", "otherStatements", "returnStatement", 
			"tableElement", "columnDefinition", "dataType", "columnConstraint", "createTable", 
			"createDatabase", "createSchema", "createProcedure", "createFunction", 
			"createIndex", "indexColumn", "createView", "alterTable", "alterTableAction", 
			"alterDatabase", "alterIndex", "alterView", "alterProcedure", "alterFunction", 
			"alterSchema", "tableConstraint", "parameterList", "parameter", "fileGroup", 
			"action", "defaultValue", "columnList", "identifier", "anyKeywordAsIdentifier", 
			"fullIdentifier", "valueList", "value", "cursor_statement", "declare_cursor", 
			"open_cursor", "fetch_statement", "fetch_direction", "close_cursor", 
			"deallocate_cursor", "print_statement", "with_clause", "common_table_expression", 
			"expression", "exists_predicate", "subquery", "when_clause", "primary_expression", 
			"table_source", "join_clause", "group_by_clause", "group_by_item", "grouping_set_list", 
			"grouping_set", "order_by_clause", "order_by_expression", "function_call", 
			"function_name", "scalar_subquery", "having_clause", "where_clause", 
			"assignment", "expression_list", "column_list", "identifier_ref", "constant", 
			"table_name", "column_name", "table_alias", "cursor_name", "cursor_variable_name", 
			"alias"
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
	public static class Sql_sdecriptContext extends ParserRuleContext {
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
		public Sql_sdecriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_sdecript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterSql_sdecript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitSql_sdecript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitSql_sdecript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_sdecriptContext sql_sdecript() throws RecognitionException {
		Sql_sdecriptContext _localctx = new Sql_sdecriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sql_sdecript);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 564874098892802L) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 4611686022990823597L) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & 576531121047601155L) != 0)) {
				{
				setState(198);
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
				case USE:
				case DECLARE:
				case BEGIN:
				case IF:
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
					setState(190);
					statement();
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(191);
						match(SEMICOLON);
						}
					}

					}
					break;
				case GO:
					{
					setState(194);
					match(GO);
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(195);
						match(SEMICOLON);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
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
		public Use_statementContext use_statement() {
			return getRuleContext(Use_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
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
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				dml_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				ddlStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				cursor_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				declaration_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				with_clause();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(210);
				print_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(211);
				close_cursor();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(212);
				deallocate_cursor();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(213);
				while_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(214);
				block_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(215);
				use_statement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(216);
				if_statement();
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
	public static class Use_statementContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(SQLGrammarParser.USE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Use_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterUse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitUse_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitUse_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_statementContext use_statement() throws RecognitionException {
		Use_statementContext _localctx = new Use_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_use_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(USE);
			setState(220);
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
		enterRule(_localctx, 6, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(WHILE);
			setState(223);
			expression(0);
			setState(224);
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
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SQLGrammarParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SQLGrammarParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(IF);
			setState(227);
			expression(0);
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(228);
				statement();
				}
				break;
			}
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(231);
				match(ELSE);
				setState(232);
				statement();
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
		enterRule(_localctx, 10, RULE_block_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(BEGIN);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 564874098892802L) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 4611686022990823593L) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & 576531121047601155L) != 0)) {
				{
				{
				setState(236);
				statement();
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(237);
					match(SEMICOLON);
					}
				}

				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
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
		enterRule(_localctx, 12, RULE_declaration_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(DECLARE);
			setState(248);
			variable_declaration();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(249);
				match(COMMA);
				setState(250);
				variable_declaration();
				}
				}
				setState(255);
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
		enterRule(_localctx, 14, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(USER_VARIABLE);
			setState(257);
			dataType();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(258);
				match(EQUAL);
				setState(259);
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
		enterRule(_localctx, 16, RULE_dml_statement);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				select_statement();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				insert_statement();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				update_statement();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
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
		enterRule(_localctx, 18, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(SELECT);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(269);
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

			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOP) {
				{
				setState(272);
				match(TOP);
				setState(273);
				match(NUMBER);
				}
			}

			setState(276);
			select_list();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(277);
				match(FROM);
				setState(278);
				table_source();
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 49807360L) != 0)) {
					{
					{
					setState(279);
					join_clause();
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(287);
				where_clause();
				}
			}

			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(290);
				group_by_clause();
				}
			}

			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(293);
				having_clause();
				}
			}

			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(296);
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
		enterRule(_localctx, 20, RULE_select_list);
		int _la;
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(STAR);
				}
				break;
			case ASC:
			case DESC:
			case FULL:
			case ON:
			case NOT:
			case NULL:
			case EXISTS:
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
			case ACTION:
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
			case PLUS:
			case MINUS:
			case LPAREN:
			case DELIMITED_IDENTIFIER_BRACKET:
			case DELIMITED_IDENTIFIER_QUOTE:
			case USER_VARIABLE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				select_element();
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(301);
					match(COMMA);
					setState(302);
					select_element();
					}
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class Select_elementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLGrammarParser.AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_select_element);
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				expression(0);
				setState(315);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(312);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(311);
						match(AS);
						}
						break;
					}
					setState(314);
					alias();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				identifier();
				setState(318);
				match(EQUAL);
				setState(319);
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
		public Row_value_constructor_listContext row_value_constructor_list() {
			return getRuleContext(Row_value_constructor_listContext.class,0);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SQLGrammarParser.DEFAULT, 0); }
		public TerminalNode INTO() { return getToken(SQLGrammarParser.INTO, 0); }
		public TerminalNode LPAREN() { return getToken(SQLGrammarParser.LPAREN, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SQLGrammarParser.RPAREN, 0); }
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
		enterRule(_localctx, 24, RULE_insert_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(INSERT);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(324);
				match(INTO);
				}
			}

			setState(327);
			table_name();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(328);
				match(LPAREN);
				setState(329);
				column_list();
				setState(330);
				match(RPAREN);
				}
			}

			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES:
				{
				setState(334);
				match(VALUES);
				setState(335);
				row_value_constructor_list();
				}
				break;
			case SELECT:
				{
				setState(336);
				select_statement();
				}
				break;
			case DEFAULT:
				{
				setState(337);
				match(DEFAULT);
				setState(338);
				match(VALUES);
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
	public static class Row_value_constructor_listContext extends ParserRuleContext {
		public List<Row_value_constructorContext> row_value_constructor() {
			return getRuleContexts(Row_value_constructorContext.class);
		}
		public Row_value_constructorContext row_value_constructor(int i) {
			return getRuleContext(Row_value_constructorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLGrammarParser.COMMA, i);
		}
		public Row_value_constructor_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_value_constructor_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterRow_value_constructor_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitRow_value_constructor_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitRow_value_constructor_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Row_value_constructor_listContext row_value_constructor_list() throws RecognitionException {
		Row_value_constructor_listContext _localctx = new Row_value_constructor_listContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_row_value_constructor_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			row_value_constructor();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(342);
				match(COMMA);
				setState(343);
				row_value_constructor();
				}
				}
				setState(348);
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
	public static class Row_value_constructorContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SQLGrammarParser.LPAREN, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SQLGrammarParser.RPAREN, 0); }
		public Row_value_constructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_value_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterRow_value_constructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitRow_value_constructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitRow_value_constructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Row_value_constructorContext row_value_constructor() throws RecognitionException {
		Row_value_constructorContext _localctx = new Row_value_constructorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_row_value_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(LPAREN);
			setState(350);
			expression_list();
			setState(351);
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
		enterRule(_localctx, 30, RULE_update_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(UPDATE);
			setState(354);
			table_name();
			setState(355);
			match(SET);
			setState(356);
			assignment();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(357);
				match(COMMA);
				setState(358);
				assignment();
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(364);
				match(FROM);
				setState(365);
				table_source();
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 49807360L) != 0)) {
					{
					{
					setState(366);
					join_clause();
					}
					}
					setState(371);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(374);
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
		enterRule(_localctx, 32, RULE_delete_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(DELETE);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(378);
				match(FROM);
				}
			}

			setState(381);
			table_name();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(382);
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
		enterRule(_localctx, 34, RULE_ddlStatement);
		try {
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				createStatement();
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				alterStatement();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 3);
				{
				setState(387);
				dropStatement();
				}
				break;
			case TRUNCATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(388);
				truncateStatement();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 5);
				{
				setState(389);
				otherStatements();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(390);
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
		enterRule(_localctx, 36, RULE_createStatement);
		try {
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				createTable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				createDatabase();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				createSchema();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(396);
				createProcedure();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(397);
				createFunction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(398);
				createIndex();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(399);
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
		enterRule(_localctx, 38, RULE_alterStatement);
		try {
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				alterTable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				alterDatabase();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
				alterIndex();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(405);
				alterView();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(406);
				alterProcedure();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(407);
				alterFunction();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(408);
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
		enterRule(_localctx, 40, RULE_dropStatement);
		int _la;
		try {
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(DROP);
				setState(412);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 288072046477312L) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & 15L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(415);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(413);
					match(IF);
					setState(414);
					match(EXISTS);
					}
					break;
				}
				setState(417);
				fullIdentifier();
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(418);
					match(COMMA);
					setState(419);
					fullIdentifier();
					}
					}
					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				match(DROP);
				setState(426);
				match(INDEX);
				setState(429);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(427);
					match(IF);
					setState(428);
					match(EXISTS);
					}
					break;
				}
				setState(431);
				fullIdentifier();
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(432);
					match(ON);
					setState(433);
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
		enterRule(_localctx, 42, RULE_truncateStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(TRUNCATE);
			setState(439);
			match(TABLE);
			setState(440);
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
		enterRule(_localctx, 44, RULE_otherStatements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(SET);
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASC:
			case DESC:
			case FULL:
			case ON:
			case NULL:
			case KEY:
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
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
			case ACTION:
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
				setState(443);
				identifier();
				}
				break;
			case USER_VARIABLE:
				{
				setState(444);
				match(USER_VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(447);
			match(EQUAL);
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(448);
				value();
				}
				break;
			case 2:
				{
				setState(449);
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
		enterRule(_localctx, 46, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(RETURN);
			setState(453);
			expression(0);
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(454);
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
		enterRule(_localctx, 48, RULE_tableElement);
		try {
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASC:
			case DESC:
			case FULL:
			case ON:
			case NULL:
			case KEY:
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
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
			case ACTION:
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
				setState(457);
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
				setState(458);
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
		enterRule(_localctx, 50, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			((ColumnDefinitionContext)_localctx).columnName = identifier();
			setState(481);
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
				setState(462);
				dataType();
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 46214674349293568L) != 0) || _la==IDENTITY || _la==CHECK) {
					{
					{
					setState(463);
					columnConstraint();
					}
					}
					setState(468);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(469);
					match(AS);
					setState(470);
					match(LPAREN);
					setState(471);
					expression(0);
					setState(472);
					match(RPAREN);
					}
				}

				}
				}
				break;
			case AS:
				{
				{
				setState(476);
				match(AS);
				setState(477);
				match(LPAREN);
				setState(478);
				expression(0);
				setState(479);
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
		public List<TerminalNode> LPAREN() { return getTokens(SQLGrammarParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(SQLGrammarParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(SQLGrammarParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(SQLGrammarParser.RPAREN, i);
		}
		public TerminalNode COLLATE() { return getToken(SQLGrammarParser.COLLATE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SQLGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SQLGrammarParser.NUMBER, i);
		}
		public TerminalNode MAX() { return getToken(SQLGrammarParser.MAX, 0); }
		public TerminalNode AVG() { return getToken(SQLGrammarParser.AVG, 0); }
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
		enterRule(_localctx, 52, RULE_dataType);
		int _la;
		try {
			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				match(DOUBLE);
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRECISION) {
					{
					setState(484);
					match(PRECISION);
					}
				}

				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				match(FLOAT);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
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
				setState(489);
				_la = _input.LA(1);
				if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 10696049115004929L) != 0) || _la==VARBINARY || _la==BINARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(493);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(490);
					match(LPAREN);
					setState(491);
					_la = _input.LA(1);
					if ( !(_la==MAX || _la==NUMBER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(492);
					match(RPAREN);
					}
					break;
				}
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(495);
					match(LPAREN);
					setState(496);
					_la = _input.LA(1);
					if ( !(_la==AVG || _la==NUMBER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(497);
					match(RPAREN);
					}
				}

				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(500);
					match(COLLATE);
					setState(501);
					identifier();
					}
				}

				}
				break;
			case DECIMAL:
			case NUMERIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(504);
				_la = _input.LA(1);
				if ( !(_la==DECIMAL || _la==NUMERIC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(505);
					match(LPAREN);
					setState(506);
					match(NUMBER);
					setState(509);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(507);
						match(COMMA);
						setState(508);
						match(NUMBER);
						}
					}

					setState(511);
					match(RPAREN);
					}
				}

				}
				break;
			case INT:
				enterOuterAlt(_localctx, 6);
				{
				setState(514);
				match(INT);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 7);
				{
				setState(515);
				match(INTEGER);
				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 8);
				{
				setState(516);
				match(BIGINT);
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 9);
				{
				setState(517);
				match(SMALLINT);
				}
				break;
			case TINYINT:
				enterOuterAlt(_localctx, 10);
				{
				setState(518);
				match(TINYINT);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 11);
				{
				setState(519);
				match(DATE);
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 12);
				{
				setState(520);
				match(DATETIME);
				}
				break;
			case DATETIME2:
				enterOuterAlt(_localctx, 13);
				{
				setState(521);
				match(DATETIME2);
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(522);
					match(LPAREN);
					setState(523);
					match(NUMBER);
					setState(524);
					match(RPAREN);
					}
				}

				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 14);
				{
				setState(527);
				match(TIMESTAMP);
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 15);
				{
				setState(528);
				match(TIME);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 16);
				{
				setState(529);
				match(TEXT);
				}
				break;
			case BIT:
				enterOuterAlt(_localctx, 17);
				{
				setState(530);
				match(BIT);
				}
				break;
			case MONEY:
				enterOuterAlt(_localctx, 18);
				{
				setState(531);
				match(MONEY);
				}
				break;
			case UNIQUEIDENTIFIER:
				enterOuterAlt(_localctx, 19);
				{
				setState(532);
				match(UNIQUEIDENTIFIER);
				}
				break;
			case XML:
				enterOuterAlt(_localctx, 20);
				{
				setState(533);
				match(XML);
				}
				break;
			case JSON:
				enterOuterAlt(_localctx, 21);
				{
				setState(534);
				match(JSON);
				}
				break;
			case INTERVAL:
				enterOuterAlt(_localctx, 22);
				{
				setState(535);
				match(INTERVAL);
				setState(536);
				_la = _input.LA(1);
				if ( !(_la==DAY || ((((_la - 190)) & ~0x3f) == 0 && ((1L << (_la - 190)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(537);
				match(TO);
				setState(538);
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
		enterRule(_localctx, 54, RULE_columnConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(541);
				match(CONSTRAINT);
				setState(542);
				identifier();
				}
			}

			setState(592);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				{
				setState(545);
				match(PRIMARY);
				setState(546);
				match(KEY);
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTERED || _la==NONCLUSTERED) {
					{
					setState(547);
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
				setState(550);
				match(NOT);
				setState(551);
				match(NULL);
				}
				break;
			case NULL:
				{
				setState(552);
				match(NULL);
				}
				break;
			case UNIQUE:
				{
				setState(553);
				match(UNIQUE);
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTERED || _la==NONCLUSTERED) {
					{
					setState(554);
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
				setState(557);
				match(IDENTITY);
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(558);
					match(LPAREN);
					setState(559);
					match(NUMBER);
					setState(562);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(560);
						match(COMMA);
						setState(561);
						match(NUMBER);
						}
					}

					setState(564);
					match(RPAREN);
					}
				}

				}
				break;
			case DEFAULT:
				{
				setState(567);
				match(DEFAULT);
				setState(568);
				defaultValue();
				}
				break;
			case CHECK:
				{
				setState(569);
				match(CHECK);
				setState(570);
				match(LPAREN);
				setState(571);
				expression(0);
				setState(572);
				match(RPAREN);
				}
				break;
			case REFERENCES:
				{
				setState(574);
				match(REFERENCES);
				setState(575);
				fullIdentifier();
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(576);
					match(LPAREN);
					setState(577);
					identifier();
					setState(578);
					match(RPAREN);
					}
				}

				setState(585);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(582);
					match(ON);
					setState(583);
					match(DELETE);
					setState(584);
					action();
					}
					break;
				}
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(587);
					match(ON);
					setState(588);
					match(UPDATE);
					setState(589);
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
		enterRule(_localctx, 56, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(CREATE);
			setState(595);
			match(TABLE);
			setState(596);
			((CreateTableContext)_localctx).tableName = fullIdentifier();
			setState(597);
			match(LPAREN);
			setState(598);
			tableElement();
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(599);
				match(COMMA);
				setState(600);
				tableElement();
				}
				}
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(606);
			match(RPAREN);
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(607);
				match(ON);
				setState(608);
				fileGroup();
				}
			}

			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEXTIMAGE_ON) {
				{
				setState(611);
				match(TEXTIMAGE_ON);
				setState(612);
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
		enterRule(_localctx, 58, RULE_createDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(CREATE);
			setState(616);
			match(DATABASE);
			setState(617);
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
		enterRule(_localctx, 60, RULE_createSchema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(CREATE);
			setState(620);
			match(SCHEMA);
			setState(621);
			identifier();
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AUTHORIZATION) {
				{
				setState(622);
				match(AUTHORIZATION);
				setState(623);
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
		enterRule(_localctx, 62, RULE_createProcedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(CREATE);
			setState(627);
			_la = _input.LA(1);
			if ( !(_la==PROCEDURE || _la==PROC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(628);
			fullIdentifier();
			setState(635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(629);
				match(LPAREN);
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2233926153813361408L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 27021597764362807L) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & 7197244794345095553L) != 0) || ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & 15L) != 0)) {
					{
					setState(630);
					parameterList();
					}
				}

				setState(633);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(634);
				parameterList();
				}
				break;
			}
			setState(637);
			match(AS);
			setState(638);
			match(BEGIN);
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 564874098892802L) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 4611686022990823593L) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & 576531121047601155L) != 0)) {
				{
				{
				setState(639);
				statement();
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(640);
					match(SEMICOLON);
					}
				}

				}
				}
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(648);
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
		enterRule(_localctx, 64, RULE_createFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(CREATE);
			setState(651);
			match(FUNCTION);
			setState(652);
			fullIdentifier();
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(653);
				match(LPAREN);
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2233926153813361408L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 27021597764362807L) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & 7197244794345095553L) != 0) || ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & 15L) != 0)) {
					{
					setState(654);
					parameterList();
					}
				}

				setState(657);
				match(RPAREN);
				}
			}

			setState(660);
			match(RETURNS);
			setState(661);
			dataType();
			setState(662);
			match(AS);
			setState(663);
			match(BEGIN);
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 564874098892802L) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 4611686022990823593L) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & 576531121047601155L) != 0)) {
				{
				{
				setState(664);
				statement();
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(665);
					match(SEMICOLON);
					}
				}

				}
				}
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(673);
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
		enterRule(_localctx, 66, RULE_createIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(CREATE);
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(676);
				match(UNIQUE);
				}
			}

			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(679);
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

			setState(682);
			match(INDEX);
			setState(683);
			fullIdentifier();
			setState(684);
			match(ON);
			setState(685);
			fullIdentifier();
			setState(686);
			match(LPAREN);
			setState(687);
			indexColumn();
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(688);
				match(COMMA);
				setState(689);
				indexColumn();
				}
				}
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(695);
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
		enterRule(_localctx, 68, RULE_indexColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			identifier();
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(698);
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
		enterRule(_localctx, 70, RULE_createView);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(CREATE);
			setState(702);
			match(VIEW);
			setState(703);
			fullIdentifier();
			setState(704);
			match(AS);
			setState(705);
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
		enterRule(_localctx, 72, RULE_alterTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(ALTER);
			setState(708);
			match(TABLE);
			setState(709);
			fullIdentifier();
			setState(710);
			alterTableAction();
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(711);
				match(COMMA);
				setState(712);
				alterTableAction();
				}
				}
				setState(717);
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
		enterRule(_localctx, 74, RULE_alterTableAction);
		int _la;
		try {
			setState(733);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(718);
				match(ADD);
				setState(721);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASC:
				case DESC:
				case FULL:
				case ON:
				case NULL:
				case KEY:
				case COUNT:
				case SUM:
				case AVG:
				case MIN:
				case MAX:
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
				case ACTION:
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
					setState(719);
					columnDefinition();
					}
					break;
				case CONSTRAINT:
				case PRIMARY:
				case FOREIGN:
				case UNIQUE:
				case CHECK:
					{
					setState(720);
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
				setState(723);
				match(DROP);
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT || _la==COLUMN) {
					{
					setState(724);
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

				setState(727);
				identifier();
				}
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(728);
				match(ALTER);
				setState(729);
				match(COLUMN);
				setState(730);
				identifier();
				setState(731);
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
		enterRule(_localctx, 76, RULE_alterDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(ALTER);
			setState(736);
			match(DATABASE);
			setState(737);
			identifier();
			setState(746);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODIFY:
				{
				setState(738);
				match(MODIFY);
				setState(739);
				match(NAME);
				setState(740);
				match(EQUAL);
				setState(741);
				identifier();
				}
				break;
			case SET:
				{
				setState(742);
				match(SET);
				setState(743);
				identifier();
				setState(744);
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
		enterRule(_localctx, 78, RULE_alterIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			match(ALTER);
			setState(749);
			match(INDEX);
			setState(752);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASC:
			case DESC:
			case FULL:
			case ON:
			case NULL:
			case KEY:
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
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
			case ACTION:
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
				setState(750);
				identifier();
				}
				break;
			case ALL:
				{
				setState(751);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(754);
			match(ON);
			setState(755);
			fullIdentifier();
			setState(756);
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
		enterRule(_localctx, 80, RULE_alterView);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			match(ALTER);
			setState(759);
			match(VIEW);
			setState(760);
			fullIdentifier();
			setState(761);
			match(AS);
			setState(762);
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
		enterRule(_localctx, 82, RULE_alterProcedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			match(ALTER);
			setState(765);
			_la = _input.LA(1);
			if ( !(_la==PROCEDURE || _la==PROC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(766);
			fullIdentifier();
			setState(773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(767);
				match(LPAREN);
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2233926153813361408L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 27021597764362807L) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & 7197244794345095553L) != 0) || ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & 15L) != 0)) {
					{
					setState(768);
					parameterList();
					}
				}

				setState(771);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(772);
				parameterList();
				}
				break;
			}
			setState(775);
			match(AS);
			setState(776);
			match(BEGIN);
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 564874098892802L) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 4611686022990823593L) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & 576531121047601155L) != 0)) {
				{
				{
				setState(777);
				statement();
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(778);
					match(SEMICOLON);
					}
				}

				}
				}
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(786);
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
		enterRule(_localctx, 84, RULE_alterFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			match(ALTER);
			setState(789);
			match(FUNCTION);
			setState(790);
			fullIdentifier();
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(791);
				match(LPAREN);
				setState(793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2233926153813361408L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 27021597764362807L) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & 7197244794345095553L) != 0) || ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & 15L) != 0)) {
					{
					setState(792);
					parameterList();
					}
				}

				setState(795);
				match(RPAREN);
				}
			}

			setState(798);
			match(RETURNS);
			setState(799);
			dataType();
			setState(800);
			match(AS);
			setState(801);
			match(BEGIN);
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 564874098892802L) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 4611686022990823593L) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & 576531121047601155L) != 0)) {
				{
				{
				setState(802);
				statement();
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(803);
					match(SEMICOLON);
					}
				}

				}
				}
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(811);
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
		enterRule(_localctx, 86, RULE_alterSchema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(ALTER);
			setState(814);
			match(SCHEMA);
			setState(815);
			identifier();
			setState(816);
			match(TRANSFER);
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBJECT) {
				{
				setState(817);
				match(OBJECT);
				setState(818);
				match(DOUBLE_COLON);
				}
			}

			setState(821);
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
		enterRule(_localctx, 88, RULE_tableConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(823);
				match(CONSTRAINT);
				setState(824);
				identifier();
				}
			}

			setState(900);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				{
				setState(827);
				match(PRIMARY);
				setState(828);
				match(KEY);
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTERED || _la==NONCLUSTERED) {
					{
					setState(829);
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

				setState(832);
				match(LPAREN);
				setState(833);
				identifier();
				setState(838);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(834);
					match(COMMA);
					setState(835);
					identifier();
					}
					}
					setState(840);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(841);
				match(RPAREN);
				}
				break;
			case UNIQUE:
				{
				setState(843);
				match(UNIQUE);
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTERED || _la==NONCLUSTERED) {
					{
					setState(844);
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

				setState(847);
				match(LPAREN);
				setState(848);
				identifier();
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(849);
					match(COMMA);
					setState(850);
					identifier();
					}
					}
					setState(855);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(856);
				match(RPAREN);
				}
				break;
			case FOREIGN:
				{
				setState(858);
				match(FOREIGN);
				setState(859);
				match(KEY);
				setState(860);
				match(LPAREN);
				setState(861);
				identifier();
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(862);
					match(COMMA);
					setState(863);
					identifier();
					}
					}
					setState(868);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(869);
				match(RPAREN);
				setState(870);
				match(REFERENCES);
				setState(871);
				fullIdentifier();
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(872);
					match(LPAREN);
					setState(873);
					identifier();
					setState(878);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(874);
						match(COMMA);
						setState(875);
						identifier();
						}
						}
						setState(880);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(881);
					match(RPAREN);
					}
				}

				setState(888);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(885);
					match(ON);
					setState(886);
					match(DELETE);
					setState(887);
					action();
					}
					break;
				}
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(890);
					match(ON);
					setState(891);
					match(UPDATE);
					setState(892);
					action();
					}
				}

				}
				break;
			case CHECK:
				{
				setState(895);
				match(CHECK);
				setState(896);
				match(LPAREN);
				setState(897);
				expression(0);
				setState(898);
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
		enterRule(_localctx, 90, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			parameter();
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(903);
				match(COMMA);
				setState(904);
				parameter();
				}
				}
				setState(909);
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
		enterRule(_localctx, 92, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USER_VARIABLE:
				{
				setState(910);
				match(USER_VARIABLE);
				}
				break;
			case ASC:
			case DESC:
			case FULL:
			case ON:
			case NULL:
			case KEY:
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
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
			case ACTION:
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
				setState(911);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(914);
			dataType();
			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(915);
				match(EQUAL);
				setState(916);
				defaultValue();
				}
			}

			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUTPUT) {
				{
				setState(919);
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
		enterRule(_localctx, 94, RULE_fileGroup);
		try {
			setState(924);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASC:
			case DESC:
			case FULL:
			case ON:
			case NULL:
			case KEY:
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
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
			case ACTION:
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
				setState(922);
				identifier();
				}
				break;
			case PRIMARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(923);
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
		enterRule(_localctx, 96, RULE_action);
		try {
			setState(934);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(926);
				match(CASCADE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(927);
				match(NO);
				setState(928);
				match(ACTION);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(929);
				match(SET);
				setState(930);
				match(NULL);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(931);
				match(SET);
				setState(932);
				match(DEFAULT);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(933);
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
		enterRule(_localctx, 98, RULE_defaultValue);
		int _la;
		try {
			setState(959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(936);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(937);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(939);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(938);
					match(MINUS);
					}
				}

				setState(941);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(942);
				match(NULL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(943);
				match(CURRENT_TIMESTAMP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(944);
				identifier();
				setState(957);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(945);
					match(LPAREN);
					setState(954);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9151455319430267648L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 27021597765411383L) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & 7197244794345095553L) != 0) || ((((_la - 236)) & ~0x3f) == 0 && ((1L << (_la - 236)) & 125963275L) != 0)) {
						{
						setState(946);
						expression(0);
						setState(951);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(947);
							match(COMMA);
							setState(948);
							expression(0);
							}
							}
							setState(953);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(956);
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
		enterRule(_localctx, 100, RULE_columnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(961);
				match(STAR);
				}
				break;
			case ASC:
			case DESC:
			case FULL:
			case ON:
			case NULL:
			case KEY:
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
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
			case ACTION:
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
				setState(962);
				identifier();
				setState(967);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(963);
					match(COMMA);
					setState(964);
					identifier();
					}
					}
					setState(969);
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
		enterRule(_localctx, 102, RULE_identifier);
		try {
			setState(976);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(972);
				match(IDENTIFIER);
				}
				break;
			case DELIMITED_IDENTIFIER_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(973);
				match(DELIMITED_IDENTIFIER_BRACKET);
				}
				break;
			case DELIMITED_IDENTIFIER_QUOTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(974);
				match(DELIMITED_IDENTIFIER_QUOTE);
				}
				break;
			case ASC:
			case DESC:
			case FULL:
			case ON:
			case NULL:
			case KEY:
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
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
			case ACTION:
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
				setState(975);
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
		public TerminalNode AVG() { return getToken(SQLGrammarParser.AVG, 0); }
		public TerminalNode SUM() { return getToken(SQLGrammarParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(SQLGrammarParser.COUNT, 0); }
		public TerminalNode MIN() { return getToken(SQLGrammarParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(SQLGrammarParser.MAX, 0); }
		public TerminalNode DESC() { return getToken(SQLGrammarParser.DESC, 0); }
		public TerminalNode ASC() { return getToken(SQLGrammarParser.ASC, 0); }
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
		public TerminalNode ACTION() { return getToken(SQLGrammarParser.ACTION, 0); }
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
		enterRule(_localctx, 104, RULE_anyKeywordAsIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2233926153813361408L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 27021597764362807L) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & 7197244794345095553L) != 0)) ) {
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
		enterRule(_localctx, 106, RULE_fullIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			identifier();
			setState(985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(981);
				match(DOT);
				setState(982);
				identifier();
				}
				}
				setState(987);
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
		enterRule(_localctx, 108, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			value();
			setState(993);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(989);
				match(COMMA);
				setState(990);
				value();
				}
				}
				setState(995);
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
		enterRule(_localctx, 110, RULE_value);
		int _la;
		try {
			setState(1015);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(996);
				identifier();
				setState(1009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(997);
					match(LPAREN);
					setState(1006);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9151455319430267648L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 27021597765411383L) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & 7197244794345095553L) != 0) || ((((_la - 236)) & ~0x3f) == 0 && ((1L << (_la - 236)) & 125963275L) != 0)) {
						{
						setState(998);
						expression(0);
						setState(1003);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(999);
							match(COMMA);
							setState(1000);
							expression(0);
							}
							}
							setState(1005);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(1008);
					match(RPAREN);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1011);
				match(USER_VARIABLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1012);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1013);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1014);
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
		enterRule(_localctx, 112, RULE_cursor_statement);
		try {
			setState(1020);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1017);
				declare_cursor();
				}
				break;
			case OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1018);
				open_cursor();
				}
				break;
			case FETCH:
				enterOuterAlt(_localctx, 3);
				{
				setState(1019);
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
		enterRule(_localctx, 114, RULE_declare_cursor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1022);
			match(DECLARE);
			setState(1023);
			cursor_name();
			setState(1024);
			match(CURSOR);
			setState(1026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL || _la==GLOBAL) {
				{
				setState(1025);
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

			setState(1029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORWARD_ONLY || _la==SCROLL) {
				{
				setState(1028);
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

			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 15L) != 0)) {
				{
				setState(1031);
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

			setState(1035);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & 7L) != 0)) {
				{
				setState(1034);
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

			setState(1038);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE_WARNING) {
				{
				setState(1037);
				match(TYPE_WARNING);
				}
			}

			setState(1040);
			match(FOR);
			setState(1041);
			select_statement();
			setState(1055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(1042);
				match(FOR);
				setState(1043);
				match(UPDATE);
				setState(1053);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OF) {
					{
					setState(1044);
					match(OF);
					setState(1045);
					column_name();
					setState(1050);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1046);
						match(COMMA);
						setState(1047);
						column_name();
						}
						}
						setState(1052);
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
		enterRule(_localctx, 116, RULE_open_cursor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			match(OPEN);
			setState(1063);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL:
			case IDENTIFIER:
				{
				setState(1059);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(1058);
					match(GLOBAL);
					}
				}

				setState(1061);
				cursor_name();
				}
				break;
			case USER_VARIABLE:
				{
				setState(1062);
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
		enterRule(_localctx, 118, RULE_fetch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			match(FETCH);
			setState(1069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & 33285996545L) != 0)) {
				{
				setState(1066);
				fetch_direction();
				setState(1067);
				match(FROM);
				}
			}

			setState(1076);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL:
			case IDENTIFIER:
				{
				setState(1072);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(1071);
					match(GLOBAL);
					}
				}

				setState(1074);
				cursor_name();
				}
				break;
			case USER_VARIABLE:
				{
				setState(1075);
				match(USER_VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(1078);
				match(INTO);
				setState(1079);
				match(USER_VARIABLE);
				setState(1084);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1080);
					match(COMMA);
					setState(1081);
					match(USER_VARIABLE);
					}
					}
					setState(1086);
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
		enterRule(_localctx, 120, RULE_fetch_direction);
		int _la;
		try {
			setState(1097);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1089);
				match(NEXT);
				}
				break;
			case PRIOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1090);
				match(PRIOR);
				}
				break;
			case FIRST:
				enterOuterAlt(_localctx, 3);
				{
				setState(1091);
				match(FIRST);
				}
				break;
			case LAST:
				enterOuterAlt(_localctx, 4);
				{
				setState(1092);
				match(LAST);
				}
				break;
			case ABSOLUTE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1093);
				match(ABSOLUTE);
				setState(1094);
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
				setState(1095);
				match(RELATIVE);
				setState(1096);
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
		enterRule(_localctx, 122, RULE_close_cursor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			match(CLOSE);
			setState(1105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASC:
			case DESC:
			case FULL:
			case ON:
			case NULL:
			case KEY:
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
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
			case GLOBAL:
			case ACTION:
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
				setState(1101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(1100);
					match(GLOBAL);
					}
				}

				setState(1103);
				identifier_ref();
				}
				break;
			case USER_VARIABLE:
				{
				setState(1104);
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
		enterRule(_localctx, 124, RULE_deallocate_cursor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			match(DEALLOCATE);
			setState(1113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASC:
			case DESC:
			case FULL:
			case ON:
			case NULL:
			case KEY:
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
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
			case GLOBAL:
			case ACTION:
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
				setState(1109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(1108);
					match(GLOBAL);
					}
				}

				setState(1111);
				identifier_ref();
				}
				break;
			case USER_VARIABLE:
				{
				setState(1112);
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
		enterRule(_localctx, 126, RULE_print_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1115);
			match(PRINT);
			setState(1120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1118);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
					case 1:
						{
						setState(1116);
						expression(0);
						}
						break;
					case 2:
						{
						setState(1117);
						match(USER_VARIABLE);
						}
						break;
					}
					} 
				}
				setState(1122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
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
		enterRule(_localctx, 128, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			match(WITH);
			setState(1124);
			common_table_expression();
			setState(1129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1125);
				match(COMMA);
				setState(1126);
				common_table_expression();
				}
				}
				setState(1131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1132);
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
		enterRule(_localctx, 130, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134);
			identifier_ref();
			setState(1139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1135);
				match(LPAREN);
				setState(1136);
				column_list();
				setState(1137);
				match(RPAREN);
				}
			}

			setState(1141);
			match(AS);
			setState(1142);
			match(LPAREN);
			setState(1143);
			select_statement();
			setState(1144);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(SQLGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLGrammarParser.MINUS, 0); }
		public Exists_predicateContext exists_predicate() {
			return getRuleContext(Exists_predicateContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQLGrammarParser.NOT, 0); }
		public Scalar_subqueryContext scalar_subquery() {
			return getRuleContext(Scalar_subqueryContext.class,0);
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
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1147);
				primary_expression();
				}
				break;
			case 2:
				{
				setState(1148);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1149);
				expression(18);
				}
				break;
			case 3:
				{
				setState(1150);
				exists_predicate();
				}
				break;
			case 4:
				{
				setState(1151);
				match(NOT);
				setState(1152);
				exists_predicate();
				}
				break;
			case 5:
				{
				setState(1153);
				match(NOT);
				setState(1154);
				expression(5);
				}
				break;
			case 6:
				{
				setState(1155);
				scalar_subquery();
				}
				break;
			case 7:
				{
				setState(1156);
				match(CASE);
				setState(1158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1157);
					when_clause();
					}
					}
					setState(1160); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1162);
					match(ELSE);
					setState(1163);
					expression(0);
					}
				}

				setState(1166);
				match(END);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1228);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1170);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1171);
						_la = _input.LA(1);
						if ( !(((((_la - 248)) & ~0x3f) == 0 && ((1L << (_la - 248)) & 7L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1172);
						expression(18);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1173);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1174);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1175);
						expression(17);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1176);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1177);
						_la = _input.LA(1);
						if ( !(((((_la - 248)) & ~0x3f) == 0 && ((1L << (_la - 248)) & 7L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1178);
						expression(16);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1179);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1180);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1181);
						expression(15);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1182);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1183);
						_la = _input.LA(1);
						if ( !(_la==LIKE || ((((_la - 240)) & ~0x3f) == 0 && ((1L << (_la - 240)) & 63L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1184);
						expression(14);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1185);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1186);
						match(NOT);
						setState(1187);
						match(LIKE);
						setState(1188);
						expression(13);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1189);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1190);
						match(LIKE);
						setState(1191);
						expression(12);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1192);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1194);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1193);
							match(NOT);
							}
						}

						setState(1196);
						match(BETWEEN);
						setState(1197);
						expression(0);
						setState(1198);
						match(AND);
						setState(1199);
						expression(10);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1201);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1202);
						match(AND);
						setState(1203);
						expression(4);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1204);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1205);
						match(OR);
						setState(1206);
						expression(3);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1207);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1209);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1208);
							match(NOT);
							}
						}

						setState(1211);
						match(IN);
						setState(1220);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
						case 1:
							{
							setState(1212);
							match(LPAREN);
							setState(1215);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case ASC:
							case DESC:
							case FULL:
							case ON:
							case NOT:
							case NULL:
							case EXISTS:
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
							case ACTION:
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
							case PLUS:
							case MINUS:
							case LPAREN:
							case DELIMITED_IDENTIFIER_BRACKET:
							case DELIMITED_IDENTIFIER_QUOTE:
							case USER_VARIABLE:
							case IDENTIFIER:
								{
								setState(1213);
								expression_list();
								}
								break;
							case SELECT:
								{
								setState(1214);
								select_statement();
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(1217);
							match(RPAREN);
							}
							break;
						case 2:
							{
							setState(1219);
							expression(0);
							}
							break;
						}
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1222);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1223);
						match(IS);
						setState(1225);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1224);
							match(NOT);
							}
						}

						setState(1227);
						match(NULL);
						}
						break;
					}
					} 
				}
				setState(1232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
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
	public static class Exists_predicateContext extends ParserRuleContext {
		public TerminalNode EXISTS() { return getToken(SQLGrammarParser.EXISTS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQLGrammarParser.NOT, 0); }
		public Exists_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exists_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterExists_predicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitExists_predicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitExists_predicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exists_predicateContext exists_predicate() throws RecognitionException {
		Exists_predicateContext _localctx = new Exists_predicateContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_exists_predicate);
		try {
			setState(1238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXISTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1233);
				match(EXISTS);
				setState(1234);
				subquery();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1235);
				match(NOT);
				setState(1236);
				match(EXISTS);
				setState(1237);
				subquery();
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
	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SQLGrammarParser.LPAREN, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SQLGrammarParser.RPAREN, 0); }
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			match(LPAREN);
			setState(1241);
			select_statement();
			setState(1242);
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
		enterRule(_localctx, 138, RULE_when_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
			match(WHEN);
			setState(1245);
			expression(0);
			setState(1246);
			match(THEN);
			setState(1247);
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
		enterRule(_localctx, 140, RULE_primary_expression);
		try {
			setState(1259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1249);
				column_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1250);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1251);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1252);
				match(USER_VARIABLE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1253);
				function_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1254);
				match(LPAREN);
				setState(1255);
				expression(0);
				setState(1256);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1258);
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
		enterRule(_localctx, 142, RULE_table_source);
		int _la;
		try {
			setState(1276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASC:
			case DESC:
			case FULL:
			case ON:
			case NULL:
			case KEY:
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
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
			case ACTION:
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
				setState(1261);
				identifier_ref();
				setState(1266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==IDENTIFIER) {
					{
					setState(1263);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(1262);
						match(AS);
						}
					}

					setState(1265);
					table_alias();
					}
				}

				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1268);
				match(LPAREN);
				setState(1269);
				select_statement();
				setState(1270);
				match(RPAREN);
				setState(1272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1271);
					match(AS);
					}
				}

				setState(1274);
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
		public TerminalNode CROSS() { return getToken(SQLGrammarParser.CROSS, 0); }
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
		public TerminalNode FULL() { return getToken(SQLGrammarParser.FULL, 0); }
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
		enterRule(_localctx, 144, RULE_join_clause);
		int _la;
		try {
			setState(1293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CROSS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1278);
				match(CROSS);
				setState(1279);
				match(JOIN);
				setState(1280);
				table_source();
				}
				break;
			case JOIN:
			case INNER:
			case LEFT:
			case RIGHT:
			case FULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1286);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INNER:
					{
					setState(1281);
					match(INNER);
					}
					break;
				case LEFT:
				case RIGHT:
				case FULL:
					{
					setState(1282);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1284);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(1283);
						match(OUTER);
						}
					}

					}
					break;
				case JOIN:
					break;
				default:
					break;
				}
				setState(1288);
				match(JOIN);
				setState(1289);
				table_source();
				setState(1290);
				match(ON);
				setState(1291);
				expression(0);
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
		enterRule(_localctx, 146, RULE_group_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1295);
			match(GROUP);
			setState(1296);
			match(BY);
			setState(1297);
			group_by_item();
			setState(1302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1298);
				match(COMMA);
				setState(1299);
				group_by_item();
				}
				}
				setState(1304);
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
		enterRule(_localctx, 148, RULE_group_by_item);
		try {
			setState(1322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASC:
			case DESC:
			case FULL:
			case ON:
			case NOT:
			case NULL:
			case EXISTS:
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
			case ACTION:
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
			case PLUS:
			case MINUS:
			case LPAREN:
			case DELIMITED_IDENTIFIER_BRACKET:
			case DELIMITED_IDENTIFIER_QUOTE:
			case USER_VARIABLE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1305);
				expression(0);
				}
				break;
			case ROLLUP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1306);
				match(ROLLUP);
				setState(1307);
				match(LPAREN);
				setState(1308);
				expression_list();
				setState(1309);
				match(RPAREN);
				}
				break;
			case CUBE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1311);
				match(CUBE);
				setState(1312);
				match(LPAREN);
				setState(1313);
				expression_list();
				setState(1314);
				match(RPAREN);
				}
				break;
			case GROUPING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1316);
				match(GROUPING);
				setState(1317);
				match(SETS);
				setState(1318);
				match(LPAREN);
				setState(1319);
				grouping_set_list();
				setState(1320);
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
		enterRule(_localctx, 150, RULE_grouping_set_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			grouping_set();
			setState(1329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1325);
				match(COMMA);
				setState(1326);
				grouping_set();
				}
				}
				setState(1331);
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
		enterRule(_localctx, 152, RULE_grouping_set);
		int _la;
		try {
			setState(1338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1332);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1333);
				match(LPAREN);
				setState(1335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9151455319430267648L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 27021597765411383L) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & 7197244794345095553L) != 0) || ((((_la - 236)) & ~0x3f) == 0 && ((1L << (_la - 236)) & 125963275L) != 0)) {
					{
					setState(1334);
					expression_list();
					}
				}

				setState(1337);
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
		enterRule(_localctx, 154, RULE_order_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1340);
			match(ORDER);
			setState(1341);
			match(BY);
			setState(1342);
			order_by_expression();
			setState(1347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1343);
				match(COMMA);
				setState(1344);
				order_by_expression();
				}
				}
				setState(1349);
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
		enterRule(_localctx, 156, RULE_order_by_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			expression(0);
			setState(1352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1351);
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
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SQLGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SQLGrammarParser.RPAREN, 0); }
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
		enterRule(_localctx, 158, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1354);
			function_name();
			setState(1355);
			match(LPAREN);
			setState(1358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(1356);
				match(STAR);
				}
				break;
			case ASC:
			case DESC:
			case FULL:
			case ON:
			case NOT:
			case NULL:
			case EXISTS:
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
			case ACTION:
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
			case PLUS:
			case MINUS:
			case LPAREN:
			case DELIMITED_IDENTIFIER_BRACKET:
			case DELIMITED_IDENTIFIER_QUOTE:
			case USER_VARIABLE:
			case IDENTIFIER:
				{
				setState(1357);
				expression_list();
				}
				break;
			case RPAREN:
				break;
			default:
				break;
			}
			setState(1360);
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
	public static class Function_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLGrammarParser.IDENTIFIER, 0); }
		public TerminalNode AVG() { return getToken(SQLGrammarParser.AVG, 0); }
		public TerminalNode SUM() { return getToken(SQLGrammarParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(SQLGrammarParser.COUNT, 0); }
		public TerminalNode MIN() { return getToken(SQLGrammarParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(SQLGrammarParser.MAX, 0); }
		public TerminalNode GETDATE() { return getToken(SQLGrammarParser.GETDATE, 0); }
		public TerminalNode QUOTENAME() { return getToken(SQLGrammarParser.QUOTENAME, 0); }
		public TerminalNode OBJECT_NAME() { return getToken(SQLGrammarParser.OBJECT_NAME, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_function_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1362);
			_la = _input.LA(1);
			if ( !(((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 524415L) != 0) || _la==IDENTIFIER) ) {
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
		enterRule(_localctx, 162, RULE_scalar_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
			match(LPAREN);
			setState(1365);
			select_statement();
			setState(1366);
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
		enterRule(_localctx, 164, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1368);
			match(HAVING);
			setState(1369);
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
		enterRule(_localctx, 166, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			match(WHERE);
			setState(1372);
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
		enterRule(_localctx, 168, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1374);
			column_name();
			setState(1375);
			_la = _input.LA(1);
			if ( !(_la==EQUAL || _la==PLUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1376);
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
		enterRule(_localctx, 170, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1378);
			expression(0);
			setState(1383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1379);
				match(COMMA);
				setState(1380);
				expression(0);
				}
				}
				setState(1385);
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
		enterRule(_localctx, 172, RULE_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1386);
			identifier_ref();
			setState(1391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1387);
				match(COMMA);
				setState(1388);
				identifier_ref();
				}
				}
				setState(1393);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(SQLGrammarParser.DOT, 0); }
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
		enterRule(_localctx, 174, RULE_identifier_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1394);
			identifier();
			setState(1397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1395);
				match(DOT);
				setState(1396);
				identifier();
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
		enterRule(_localctx, 176, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1399);
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
		enterRule(_localctx, 178, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
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
		enterRule(_localctx, 180, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1403);
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
		enterRule(_localctx, 182, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1405);
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
		enterRule(_localctx, 184, RULE_cursor_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1407);
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
		enterRule(_localctx, 186, RULE_cursor_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1409);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SQLGrammarParser.STRING, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLGrammarParserListener ) ((SQLGrammarParserListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLGrammarParserVisitor ) return ((SQLGrammarParserVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_alias);
		try {
			setState(1413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASC:
			case DESC:
			case FULL:
			case ON:
			case NULL:
			case KEY:
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
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
			case ACTION:
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
				setState(1411);
				identifier();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1412);
				match(STRING);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 66:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 10);
		case 11:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0107\u0588\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0001\u0000\u0001\u0000\u0003\u0000\u00c1\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000\u00c5\b\u0000\u0005\u0000\u00c7\b\u0000\n\u0000\f\u0000"+
		"\u00ca\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00da\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00e6\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u00ea\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u00ef\b\u0005\u0005\u0005\u00f1\b\u0005\n\u0005\f\u0005\u00f4"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u00fc\b\u0006\n\u0006\f\u0006\u00ff\t\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0105\b\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u010b\b\b\u0001\t\u0001\t\u0003\t\u010f"+
		"\b\t\u0001\t\u0001\t\u0003\t\u0113\b\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0005\t\u0119\b\t\n\t\f\t\u011c\t\t\u0003\t\u011e\b\t\u0001\t\u0003\t"+
		"\u0121\b\t\u0001\t\u0003\t\u0124\b\t\u0001\t\u0003\t\u0127\b\t\u0001\t"+
		"\u0003\t\u012a\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0130\b\n\n"+
		"\n\f\n\u0133\t\n\u0003\n\u0135\b\n\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0139\b\u000b\u0001\u000b\u0003\u000b\u013c\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0142\b\u000b\u0001\f\u0001"+
		"\f\u0003\f\u0146\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u014d"+
		"\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0154\b\f\u0001\r"+
		"\u0001\r\u0001\r\u0005\r\u0159\b\r\n\r\f\r\u015c\t\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0168\b\u000f\n\u000f\f\u000f"+
		"\u016b\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0170\b"+
		"\u000f\n\u000f\f\u000f\u0173\t\u000f\u0003\u000f\u0175\b\u000f\u0001\u000f"+
		"\u0003\u000f\u0178\b\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u017c\b"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0180\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0188"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0191\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u019a"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01a0"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u01a5\b\u0014"+
		"\n\u0014\f\u0014\u01a8\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u01ae\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u01b3\b\u0014\u0003\u0014\u01b5\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u01be\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01c3\b"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01c8\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u01cc\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u01d1\b\u0019\n\u0019\f\u0019\u01d4\t\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01db\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u01e2\b\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u01e6\b\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u01ee\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01f3"+
		"\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01f7\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01fe\b\u001a"+
		"\u0001\u001a\u0003\u001a\u0201\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u020e\b\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u021c\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u0220\b\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0225\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u022c\b\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0233\b\u001b\u0001\u001b"+
		"\u0003\u001b\u0236\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0245\b\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u024a\b\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u024f\b\u001b\u0003\u001b\u0251\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0005\u001c\u025a\b\u001c\n\u001c\f\u001c\u025d\t\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u0262\b\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u0266\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u0271\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u0278\b\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u027c\b"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0282"+
		"\b\u001f\u0005\u001f\u0284\b\u001f\n\u001f\f\u001f\u0287\t\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0290\b "+
		"\u0001 \u0003 \u0293\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003"+
		" \u029b\b \u0005 \u029d\b \n \f \u02a0\t \u0001 \u0001 \u0001!\u0001!"+
		"\u0003!\u02a6\b!\u0001!\u0003!\u02a9\b!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0005!\u02b3\b!\n!\f!\u02b6\t!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0003\"\u02bc\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0005$\u02ca\b$\n$\f$\u02cd"+
		"\t$\u0001%\u0001%\u0001%\u0003%\u02d2\b%\u0001%\u0001%\u0003%\u02d6\b"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u02de\b%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003"+
		"&\u02eb\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u02f1\b\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0003)\u0302\b)\u0001)\u0001)\u0003)\u0306\b)\u0001"+
		")\u0001)\u0001)\u0001)\u0003)\u030c\b)\u0005)\u030e\b)\n)\f)\u0311\t)"+
		"\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u031a\b*\u0001"+
		"*\u0003*\u031d\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0325"+
		"\b*\u0005*\u0327\b*\n*\f*\u032a\t*\u0001*\u0001*\u0001+\u0001+\u0001+"+
		"\u0001+\u0001+\u0001+\u0003+\u0334\b+\u0001+\u0001+\u0001,\u0001,\u0003"+
		",\u033a\b,\u0001,\u0001,\u0001,\u0003,\u033f\b,\u0001,\u0001,\u0001,\u0001"+
		",\u0005,\u0345\b,\n,\f,\u0348\t,\u0001,\u0001,\u0001,\u0001,\u0003,\u034e"+
		"\b,\u0001,\u0001,\u0001,\u0001,\u0005,\u0354\b,\n,\f,\u0357\t,\u0001,"+
		"\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0005,\u0361\b,\n,\f"+
		",\u0364\t,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0005,\u036d"+
		"\b,\n,\f,\u0370\t,\u0001,\u0001,\u0003,\u0374\b,\u0001,\u0001,\u0001,"+
		"\u0003,\u0379\b,\u0001,\u0001,\u0001,\u0003,\u037e\b,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0003,\u0385\b,\u0001-\u0001-\u0001-\u0005-\u038a\b-\n"+
		"-\f-\u038d\t-\u0001.\u0001.\u0003.\u0391\b.\u0001.\u0001.\u0001.\u0003"+
		".\u0396\b.\u0001.\u0003.\u0399\b.\u0001/\u0001/\u0003/\u039d\b/\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00030\u03a7\b0\u0001"+
		"1\u00011\u00011\u00031\u03ac\b1\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00051\u03b6\b1\n1\f1\u03b9\t1\u00031\u03bb\b1\u00011"+
		"\u00031\u03be\b1\u00031\u03c0\b1\u00012\u00012\u00012\u00012\u00052\u03c6"+
		"\b2\n2\f2\u03c9\t2\u00032\u03cb\b2\u00013\u00013\u00013\u00013\u00033"+
		"\u03d1\b3\u00014\u00014\u00015\u00015\u00015\u00055\u03d8\b5\n5\f5\u03db"+
		"\t5\u00016\u00016\u00016\u00056\u03e0\b6\n6\f6\u03e3\t6\u00017\u00017"+
		"\u00017\u00017\u00017\u00057\u03ea\b7\n7\f7\u03ed\t7\u00037\u03ef\b7\u0001"+
		"7\u00037\u03f2\b7\u00017\u00017\u00017\u00017\u00037\u03f8\b7\u00018\u0001"+
		"8\u00018\u00038\u03fd\b8\u00019\u00019\u00019\u00019\u00039\u0403\b9\u0001"+
		"9\u00039\u0406\b9\u00019\u00039\u0409\b9\u00019\u00039\u040c\b9\u0001"+
		"9\u00039\u040f\b9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00059\u0419\b9\n9\f9\u041c\t9\u00039\u041e\b9\u00039\u0420\b9\u0001"+
		":\u0001:\u0003:\u0424\b:\u0001:\u0001:\u0003:\u0428\b:\u0001;\u0001;\u0001"+
		";\u0001;\u0003;\u042e\b;\u0001;\u0003;\u0431\b;\u0001;\u0001;\u0003;\u0435"+
		"\b;\u0001;\u0001;\u0001;\u0001;\u0005;\u043b\b;\n;\f;\u043e\t;\u0003;"+
		"\u0440\b;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003"+
		"<\u044a\b<\u0001=\u0001=\u0003=\u044e\b=\u0001=\u0001=\u0003=\u0452\b"+
		"=\u0001>\u0001>\u0003>\u0456\b>\u0001>\u0001>\u0003>\u045a\b>\u0001?\u0001"+
		"?\u0001?\u0005?\u045f\b?\n?\f?\u0462\t?\u0001@\u0001@\u0001@\u0001@\u0005"+
		"@\u0468\b@\n@\f@\u046b\t@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0003A\u0474\bA\u0001A\u0001A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0004"+
		"B\u0487\bB\u000bB\fB\u0488\u0001B\u0001B\u0003B\u048d\bB\u0001B\u0001"+
		"B\u0003B\u0491\bB\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0003B\u04ab\bB\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0003B\u04ba\bB\u0001B\u0001B\u0001B\u0001B\u0003B\u04c0\bB\u0001"+
		"B\u0001B\u0001B\u0003B\u04c5\bB\u0001B\u0001B\u0001B\u0003B\u04ca\bB\u0001"+
		"B\u0005B\u04cd\bB\nB\fB\u04d0\tB\u0001C\u0001C\u0001C\u0001C\u0001C\u0003"+
		"C\u04d7\bC\u0001D\u0001D\u0001D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001"+
		"E\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0003F\u04ec\bF\u0001G\u0001G\u0003G\u04f0\bG\u0001G\u0003G\u04f3\b"+
		"G\u0001G\u0001G\u0001G\u0001G\u0003G\u04f9\bG\u0001G\u0001G\u0003G\u04fd"+
		"\bG\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0003H\u0505\bH\u0003H\u0507"+
		"\bH\u0001H\u0001H\u0001H\u0001H\u0001H\u0003H\u050e\bH\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0005I\u0515\bI\nI\fI\u0518\tI\u0001J\u0001J\u0001J\u0001"+
		"J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001"+
		"J\u0001J\u0001J\u0001J\u0003J\u052b\bJ\u0001K\u0001K\u0001K\u0005K\u0530"+
		"\bK\nK\fK\u0533\tK\u0001L\u0001L\u0001L\u0003L\u0538\bL\u0001L\u0003L"+
		"\u053b\bL\u0001M\u0001M\u0001M\u0001M\u0001M\u0005M\u0542\bM\nM\fM\u0545"+
		"\tM\u0001N\u0001N\u0003N\u0549\bN\u0001O\u0001O\u0001O\u0001O\u0003O\u054f"+
		"\bO\u0001O\u0001O\u0001P\u0001P\u0001Q\u0001Q\u0001Q\u0001Q\u0001R\u0001"+
		"R\u0001R\u0001S\u0001S\u0001S\u0001T\u0001T\u0001T\u0001T\u0001U\u0001"+
		"U\u0001U\u0005U\u0566\bU\nU\fU\u0569\tU\u0001V\u0001V\u0001V\u0005V\u056e"+
		"\bV\nV\fV\u0571\tV\u0001W\u0001W\u0001W\u0003W\u0576\bW\u0001X\u0001X"+
		"\u0001Y\u0001Y\u0001Z\u0001Z\u0001[\u0001[\u0001\\\u0001\\\u0001]\u0001"+
		"]\u0001^\u0001^\u0003^\u0586\b^\u0001^\u0000\u0001\u0084_\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u0000\u001a\u0002\u0000\u000b\u000b\u009b\u009b\u0003"+
		"\u0000)*00\u00c9\u00cc\u0004\u0000HHyz}}\u00a8\u00a9\u0002\u0000<<\u00ef"+
		"\u00ef\u0002\u0000::\u00ef\u00ef\u0002\u0000\u0081\u0081\u00c5\u00c5\u0002"+
		"\u0000JJ\u00be\u00c0\u0001\u0000\u00be\u00c0\u0001\u0000\u00db\u00dc\u0001"+
		"\u0000\u00ca\u00cb\u0001\u0000\b\t\u0002\u0000,,\u00ad\u00ad\u0001\u0000"+
		"\u00cf\u00d0\u0013\u0000\b\t\u0017\u0017\u001a\u001a\u001e\u001e//8<I"+
		"KMNRRVVZZ~\u007f\u00a3\u00a3\u00aa\u00ab\u00b6\u00b9\u00c4\u00c4\u00d1"+
		"\u00d3\u00d8\u00dc\u00e0\u00e1\u0001\u0000\u0085\u0086\u0001\u0000\u0087"+
		"\u0088\u0001\u0000\u0089\u008c\u0001\u0000\u008d\u008f\u0002\u0000\u00ef"+
		"\u00ef\u0105\u0105\u0001\u0000\u00f6\u00f7\u0001\u0000\u00f8\u00fa\u0002"+
		"\u0000##\u00f0\u00f5\u0001\u0000\u0015\u0017\u0003\u00008>KK\u0106\u0106"+
		"\u0002\u0000\u00f0\u00f0\u00f6\u00f6\u0003\u0000\u001e\u001e\u00ec\u00ed"+
		"\u00ef\u00ef\u0644\u0000\u00c8\u0001\u0000\u0000\u0000\u0002\u00d9\u0001"+
		"\u0000\u0000\u0000\u0004\u00db\u0001\u0000\u0000\u0000\u0006\u00de\u0001"+
		"\u0000\u0000\u0000\b\u00e2\u0001\u0000\u0000\u0000\n\u00eb\u0001\u0000"+
		"\u0000\u0000\f\u00f7\u0001\u0000\u0000\u0000\u000e\u0100\u0001\u0000\u0000"+
		"\u0000\u0010\u010a\u0001\u0000\u0000\u0000\u0012\u010c\u0001\u0000\u0000"+
		"\u0000\u0014\u0134\u0001\u0000\u0000\u0000\u0016\u0141\u0001\u0000\u0000"+
		"\u0000\u0018\u0143\u0001\u0000\u0000\u0000\u001a\u0155\u0001\u0000\u0000"+
		"\u0000\u001c\u015d\u0001\u0000\u0000\u0000\u001e\u0161\u0001\u0000\u0000"+
		"\u0000 \u0179\u0001\u0000\u0000\u0000\"\u0187\u0001\u0000\u0000\u0000"+
		"$\u0190\u0001\u0000\u0000\u0000&\u0199\u0001\u0000\u0000\u0000(\u01b4"+
		"\u0001\u0000\u0000\u0000*\u01b6\u0001\u0000\u0000\u0000,\u01ba\u0001\u0000"+
		"\u0000\u0000.\u01c4\u0001\u0000\u0000\u00000\u01cb\u0001\u0000\u0000\u0000"+
		"2\u01cd\u0001\u0000\u0000\u00004\u021b\u0001\u0000\u0000\u00006\u021f"+
		"\u0001\u0000\u0000\u00008\u0252\u0001\u0000\u0000\u0000:\u0267\u0001\u0000"+
		"\u0000\u0000<\u026b\u0001\u0000\u0000\u0000>\u0272\u0001\u0000\u0000\u0000"+
		"@\u028a\u0001\u0000\u0000\u0000B\u02a3\u0001\u0000\u0000\u0000D\u02b9"+
		"\u0001\u0000\u0000\u0000F\u02bd\u0001\u0000\u0000\u0000H\u02c3\u0001\u0000"+
		"\u0000\u0000J\u02dd\u0001\u0000\u0000\u0000L\u02df\u0001\u0000\u0000\u0000"+
		"N\u02ec\u0001\u0000\u0000\u0000P\u02f6\u0001\u0000\u0000\u0000R\u02fc"+
		"\u0001\u0000\u0000\u0000T\u0314\u0001\u0000\u0000\u0000V\u032d\u0001\u0000"+
		"\u0000\u0000X\u0339\u0001\u0000\u0000\u0000Z\u0386\u0001\u0000\u0000\u0000"+
		"\\\u0390\u0001\u0000\u0000\u0000^\u039c\u0001\u0000\u0000\u0000`\u03a6"+
		"\u0001\u0000\u0000\u0000b\u03bf\u0001\u0000\u0000\u0000d\u03ca\u0001\u0000"+
		"\u0000\u0000f\u03d0\u0001\u0000\u0000\u0000h\u03d2\u0001\u0000\u0000\u0000"+
		"j\u03d4\u0001\u0000\u0000\u0000l\u03dc\u0001\u0000\u0000\u0000n\u03f7"+
		"\u0001\u0000\u0000\u0000p\u03fc\u0001\u0000\u0000\u0000r\u03fe\u0001\u0000"+
		"\u0000\u0000t\u0421\u0001\u0000\u0000\u0000v\u0429\u0001\u0000\u0000\u0000"+
		"x\u0449\u0001\u0000\u0000\u0000z\u044b\u0001\u0000\u0000\u0000|\u0453"+
		"\u0001\u0000\u0000\u0000~\u045b\u0001\u0000\u0000\u0000\u0080\u0463\u0001"+
		"\u0000\u0000\u0000\u0082\u046e\u0001\u0000\u0000\u0000\u0084\u0490\u0001"+
		"\u0000\u0000\u0000\u0086\u04d6\u0001\u0000\u0000\u0000\u0088\u04d8\u0001"+
		"\u0000\u0000\u0000\u008a\u04dc\u0001\u0000\u0000\u0000\u008c\u04eb\u0001"+
		"\u0000\u0000\u0000\u008e\u04fc\u0001\u0000\u0000\u0000\u0090\u050d\u0001"+
		"\u0000\u0000\u0000\u0092\u050f\u0001\u0000\u0000\u0000\u0094\u052a\u0001"+
		"\u0000\u0000\u0000\u0096\u052c\u0001\u0000\u0000\u0000\u0098\u053a\u0001"+
		"\u0000\u0000\u0000\u009a\u053c\u0001\u0000\u0000\u0000\u009c\u0546\u0001"+
		"\u0000\u0000\u0000\u009e\u054a\u0001\u0000\u0000\u0000\u00a0\u0552\u0001"+
		"\u0000\u0000\u0000\u00a2\u0554\u0001\u0000\u0000\u0000\u00a4\u0558\u0001"+
		"\u0000\u0000\u0000\u00a6\u055b\u0001\u0000\u0000\u0000\u00a8\u055e\u0001"+
		"\u0000\u0000\u0000\u00aa\u0562\u0001\u0000\u0000\u0000\u00ac\u056a\u0001"+
		"\u0000\u0000\u0000\u00ae\u0572\u0001\u0000\u0000\u0000\u00b0\u0577\u0001"+
		"\u0000\u0000\u0000\u00b2\u0579\u0001\u0000\u0000\u0000\u00b4\u057b\u0001"+
		"\u0000\u0000\u0000\u00b6\u057d\u0001\u0000\u0000\u0000\u00b8\u057f\u0001"+
		"\u0000\u0000\u0000\u00ba\u0581\u0001\u0000\u0000\u0000\u00bc\u0585\u0001"+
		"\u0000\u0000\u0000\u00be\u00c0\u0003\u0002\u0001\u0000\u00bf\u00c1\u0005"+
		"\u00fc\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c7\u0001\u0000\u0000\u0000\u00c2\u00c4\u0005"+
		"W\u0000\u0000\u00c3\u00c5\u0005\u00fc\u0000\u0000\u00c4\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c6\u00be\u0001\u0000\u0000\u0000\u00c6\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cb\u0001\u0000"+
		"\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u0000"+
		"\u0000\u0001\u00cc\u0001\u0001\u0000\u0000\u0000\u00cd\u00da\u0003\u0010"+
		"\b\u0000\u00ce\u00da\u0003\"\u0011\u0000\u00cf\u00da\u0003p8\u0000\u00d0"+
		"\u00da\u0003\f\u0006\u0000\u00d1\u00da\u0003\u0080@\u0000\u00d2\u00da"+
		"\u0003~?\u0000\u00d3\u00da\u0003z=\u0000\u00d4\u00da\u0003|>\u0000\u00d5"+
		"\u00da\u0003\u0006\u0003\u0000\u00d6\u00da\u0003\n\u0005\u0000\u00d7\u00da"+
		"\u0003\u0004\u0002\u0000\u00d8\u00da\u0003\b\u0004\u0000\u00d9\u00cd\u0001"+
		"\u0000\u0000\u0000\u00d9\u00ce\u0001\u0000\u0000\u0000\u00d9\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d0\u0001\u0000\u0000\u0000\u00d9\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d2\u0001\u0000\u0000\u0000\u00d9\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d4\u0001\u0000\u0000\u0000\u00d9\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d6\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u0003\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u00051\u0000\u0000\u00dc\u00dd\u0003f3"+
		"\u0000\u00dd\u0005\u0001\u0000\u0000\u0000\u00de\u00df\u0005\\\u0000\u0000"+
		"\u00df\u00e0\u0003\u0084B\u0000\u00e0\u00e1\u0003\u0002\u0001\u0000\u00e1"+
		"\u0007\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005Z\u0000\u0000\u00e3\u00e5"+
		"\u0003\u0084B\u0000\u00e4\u00e6\u0003\u0002\u0001\u0000\u00e5\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0005[\u0000\u0000\u00e8\u00ea\u0003\u0002"+
		"\u0001\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ea\t\u0001\u0000\u0000\u0000\u00eb\u00f2\u0005X\u0000"+
		"\u0000\u00ec\u00ee\u0003\u0002\u0001\u0000\u00ed\u00ef\u0005\u00fc\u0000"+
		"\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f1\u0001\u0000\u0000\u0000\u00f0\u00ec\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005Y\u0000\u0000"+
		"\u00f6\u000b\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005U\u0000\u0000\u00f8"+
		"\u00fd\u0003\u000e\u0007\u0000\u00f9\u00fa\u0005\u00fb\u0000\u0000\u00fa"+
		"\u00fc\u0003\u000e\u0007\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc"+
		"\u00ff\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0001\u0000\u0000\u0000\u00fe\r\u0001\u0000\u0000\u0000\u00ff\u00fd"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u0105\u0000\u0000\u0101\u0104"+
		"\u00034\u001a\u0000\u0102\u0103\u0005\u00f0\u0000\u0000\u0103\u0105\u0003"+
		"\u0084B\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000"+
		"\u0000\u0000\u0105\u000f\u0001\u0000\u0000\u0000\u0106\u010b\u0003\u0012"+
		"\t\u0000\u0107\u010b\u0003\u0018\f\u0000\u0108\u010b\u0003\u001e\u000f"+
		"\u0000\u0109\u010b\u0003 \u0010\u0000\u010a\u0106\u0001\u0000\u0000\u0000"+
		"\u010a\u0107\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000"+
		"\u010a\u0109\u0001\u0000\u0000\u0000\u010b\u0011\u0001\u0000\u0000\u0000"+
		"\u010c\u010e\u0005\u0001\u0000\u0000\u010d\u010f\u0007\u0000\u0000\u0000"+
		"\u010e\u010d\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000"+
		"\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u0111\u0005\f\u0000\u0000\u0111"+
		"\u0113\u0005\u00ef\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114"+
		"\u011d\u0003\u0014\n\u0000\u0115\u0116\u0005\u0002\u0000\u0000\u0116\u011a"+
		"\u0003\u008eG\u0000\u0117\u0119\u0003\u0090H\u0000\u0118\u0117\u0001\u0000"+
		"\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000"+
		"\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011e\u0001\u0000"+
		"\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011d\u0115\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u0120\u0001\u0000"+
		"\u0000\u0000\u011f\u0121\u0003\u00a6S\u0000\u0120\u011f\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0123\u0001\u0000\u0000"+
		"\u0000\u0122\u0124\u0003\u0092I\u0000\u0123\u0122\u0001\u0000\u0000\u0000"+
		"\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0126\u0001\u0000\u0000\u0000"+
		"\u0125\u0127\u0003\u00a4R\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0126"+
		"\u0127\u0001\u0000\u0000\u0000\u0127\u0129\u0001\u0000\u0000\u0000\u0128"+
		"\u012a\u0003\u009aM\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u0129\u012a"+
		"\u0001\u0000\u0000\u0000\u012a\u0013\u0001\u0000\u0000\u0000\u012b\u0135"+
		"\u0005\u00f8\u0000\u0000\u012c\u0131\u0003\u0016\u000b\u0000\u012d\u012e"+
		"\u0005\u00fb\u0000\u0000\u012e\u0130\u0003\u0016\u000b\u0000\u012f\u012d"+
		"\u0001\u0000\u0000\u0000\u0130\u0133\u0001\u0000\u0000\u0000\u0131\u012f"+
		"\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0135"+
		"\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0134\u012b"+
		"\u0001\u0000\u0000\u0000\u0134\u012c\u0001\u0000\u0000\u0000\u0135\u0015"+
		"\u0001\u0000\u0000\u0000\u0136\u013b\u0003\u0084B\u0000\u0137\u0139\u0005"+
		"V\u0000\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000"+
		"\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013c\u0003\u00bc"+
		"^\u0000\u013b\u0138\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000"+
		"\u0000\u013c\u0142\u0001\u0000\u0000\u0000\u013d\u013e\u0003f3\u0000\u013e"+
		"\u013f\u0005\u00f0\u0000\u0000\u013f\u0140\u0003\u0084B\u0000\u0140\u0142"+
		"\u0001\u0000\u0000\u0000\u0141\u0136\u0001\u0000\u0000\u0000\u0141\u013d"+
		"\u0001\u0000\u0000\u0000\u0142\u0017\u0001\u0000\u0000\u0000\u0143\u0145"+
		"\u0005\r\u0000\u0000\u0144\u0146\u0005\u0012\u0000\u0000\u0145\u0144\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0001"+
		"\u0000\u0000\u0000\u0147\u014c\u0003\u00b2Y\u0000\u0148\u0149\u0005\u00fd"+
		"\u0000\u0000\u0149\u014a\u0003\u00acV\u0000\u014a\u014b\u0005\u00fe\u0000"+
		"\u0000\u014b\u014d\u0001\u0000\u0000\u0000\u014c\u0148\u0001\u0000\u0000"+
		"\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u0153\u0001\u0000\u0000"+
		"\u0000\u014e\u014f\u0005\u0011\u0000\u0000\u014f\u0154\u0003\u001a\r\u0000"+
		"\u0150\u0154\u0003\u0012\t\u0000\u0151\u0152\u00055\u0000\u0000\u0152"+
		"\u0154\u0005\u0011\u0000\u0000\u0153\u014e\u0001\u0000\u0000\u0000\u0153"+
		"\u0150\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0154"+
		"\u0019\u0001\u0000\u0000\u0000\u0155\u015a\u0003\u001c\u000e\u0000\u0156"+
		"\u0157\u0005\u00fb\u0000\u0000\u0157\u0159\u0003\u001c\u000e\u0000\u0158"+
		"\u0156\u0001\u0000\u0000\u0000\u0159\u015c\u0001\u0000\u0000\u0000\u015a"+
		"\u0158\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b"+
		"\u001b\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015d"+
		"\u015e\u0005\u00fd\u0000\u0000\u015e\u015f\u0003\u00aaU\u0000\u015f\u0160"+
		"\u0005\u00fe\u0000\u0000\u0160\u001d\u0001\u0000\u0000\u0000\u0161\u0162"+
		"\u0005\u000f\u0000\u0000\u0162\u0163\u0003\u00b2Y\u0000\u0163\u0164\u0005"+
		"\u0010\u0000\u0000\u0164\u0169\u0003\u00a8T\u0000\u0165\u0166\u0005\u00fb"+
		"\u0000\u0000\u0166\u0168\u0003\u00a8T\u0000\u0167\u0165\u0001\u0000\u0000"+
		"\u0000\u0168\u016b\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000"+
		"\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u0174\u0001\u0000\u0000"+
		"\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016c\u016d\u0005\u0002\u0000"+
		"\u0000\u016d\u0171\u0003\u008eG\u0000\u016e\u0170\u0003\u0090H\u0000\u016f"+
		"\u016e\u0001\u0000\u0000\u0000\u0170\u0173\u0001\u0000\u0000\u0000\u0171"+
		"\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172"+
		"\u0175\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0174"+
		"\u016c\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175"+
		"\u0177\u0001\u0000\u0000\u0000\u0176\u0178\u0003\u00a6S\u0000\u0177\u0176"+
		"\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u001f"+
		"\u0001\u0000\u0000\u0000\u0179\u017b\u0005\u000e\u0000\u0000\u017a\u017c"+
		"\u0005\u0002\u0000\u0000\u017b\u017a\u0001\u0000\u0000\u0000\u017b\u017c"+
		"\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017f"+
		"\u0003\u00b2Y\u0000\u017e\u0180\u0003\u00a6S\u0000\u017f\u017e\u0001\u0000"+
		"\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180!\u0001\u0000\u0000"+
		"\u0000\u0181\u0188\u0003$\u0012\u0000\u0182\u0188\u0003&\u0013\u0000\u0183"+
		"\u0188\u0003(\u0014\u0000\u0184\u0188\u0003*\u0015\u0000\u0185\u0188\u0003"+
		",\u0016\u0000\u0186\u0188\u0003.\u0017\u0000\u0187\u0181\u0001\u0000\u0000"+
		"\u0000\u0187\u0182\u0001\u0000\u0000\u0000\u0187\u0183\u0001\u0000\u0000"+
		"\u0000\u0187\u0184\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000"+
		"\u0000\u0187\u0186\u0001\u0000\u0000\u0000\u0188#\u0001\u0000\u0000\u0000"+
		"\u0189\u0191\u00038\u001c\u0000\u018a\u0191\u0003:\u001d\u0000\u018b\u0191"+
		"\u0003<\u001e\u0000\u018c\u0191\u0003>\u001f\u0000\u018d\u0191\u0003@"+
		" \u0000\u018e\u0191\u0003B!\u0000\u018f\u0191\u0003F#\u0000\u0190\u0189"+
		"\u0001\u0000\u0000\u0000\u0190\u018a\u0001\u0000\u0000\u0000\u0190\u018b"+
		"\u0001\u0000\u0000\u0000\u0190\u018c\u0001\u0000\u0000\u0000\u0190\u018d"+
		"\u0001\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u018f"+
		"\u0001\u0000\u0000\u0000\u0191%\u0001\u0000\u0000\u0000\u0192\u019a\u0003"+
		"H$\u0000\u0193\u019a\u0003L&\u0000\u0194\u019a\u0003N\'\u0000\u0195\u019a"+
		"\u0003P(\u0000\u0196\u019a\u0003R)\u0000\u0197\u019a\u0003T*\u0000\u0198"+
		"\u019a\u0003V+\u0000\u0199\u0192\u0001\u0000\u0000\u0000\u0199\u0193\u0001"+
		"\u0000\u0000\u0000\u0199\u0194\u0001\u0000\u0000\u0000\u0199\u0195\u0001"+
		"\u0000\u0000\u0000\u0199\u0196\u0001\u0000\u0000\u0000\u0199\u0197\u0001"+
		"\u0000\u0000\u0000\u0199\u0198\u0001\u0000\u0000\u0000\u019a\'\u0001\u0000"+
		"\u0000\u0000\u019b\u019c\u0005(\u0000\u0000\u019c\u019f\u0007\u0001\u0000"+
		"\u0000\u019d\u019e\u0005Z\u0000\u0000\u019e\u01a0\u0005%\u0000\u0000\u019f"+
		"\u019d\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a6\u0003j5\u0000\u01a2\u01a3\u0005"+
		"\u00fb\u0000\u0000\u01a3\u01a5\u0003j5\u0000\u01a4\u01a2\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a8\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01b5\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005(\u0000\u0000"+
		"\u01aa\u01ad\u0005+\u0000\u0000\u01ab\u01ac\u0005Z\u0000\u0000\u01ac\u01ae"+
		"\u0005%\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001"+
		"\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b2\u0003"+
		"j5\u0000\u01b0\u01b1\u0005\u001a\u0000\u0000\u01b1\u01b3\u0003j5\u0000"+
		"\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b5\u0001\u0000\u0000\u0000\u01b4\u019b\u0001\u0000\u0000\u0000"+
		"\u01b4\u01a9\u0001\u0000\u0000\u0000\u01b5)\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b7\u0005\u00d4\u0000\u0000\u01b7\u01b8\u0005)\u0000\u0000\u01b8\u01b9"+
		"\u0003j5\u0000\u01b9+\u0001\u0000\u0000\u0000\u01ba\u01bd\u0005\u0010"+
		"\u0000\u0000\u01bb\u01be\u0003f3\u0000\u01bc\u01be\u0005\u0105\u0000\u0000"+
		"\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000"+
		"\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c2\u0005\u00f0\u0000\u0000"+
		"\u01c0\u01c3\u0003n7\u0000\u01c1\u01c3\u0003\u0084B\u0000\u01c2\u01c0"+
		"\u0001\u0000\u0000\u0000\u01c2\u01c1\u0001\u0000\u0000\u0000\u01c3-\u0001"+
		"\u0000\u0000\u0000\u01c4\u01c5\u0005\u00c7\u0000\u0000\u01c5\u01c7\u0003"+
		"\u0084B\u0000\u01c6\u01c8\u0005\u00fc\u0000\u0000\u01c7\u01c6\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8/\u0001\u0000\u0000"+
		"\u0000\u01c9\u01cc\u00032\u0019\u0000\u01ca\u01cc\u0003X,\u0000\u01cb"+
		"\u01c9\u0001\u0000\u0000\u0000\u01cb\u01ca\u0001\u0000\u0000\u0000\u01cc"+
		"1\u0001\u0000\u0000\u0000\u01cd\u01e1\u0003f3\u0000\u01ce\u01d2\u0003"+
		"4\u001a\u0000\u01cf\u01d1\u00036\u001b\u0000\u01d0\u01cf\u0001\u0000\u0000"+
		"\u0000\u01d1\u01d4\u0001\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01da\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d5\u01d6\u0005V\u0000\u0000"+
		"\u01d6\u01d7\u0005\u00fd\u0000\u0000\u01d7\u01d8\u0003\u0084B\u0000\u01d8"+
		"\u01d9\u0005\u00fe\u0000\u0000\u01d9\u01db\u0001\u0000\u0000\u0000\u01da"+
		"\u01d5\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db"+
		"\u01e2\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005V\u0000\u0000\u01dd\u01de"+
		"\u0005\u00fd\u0000\u0000\u01de\u01df\u0003\u0084B\u0000\u01df\u01e0\u0005"+
		"\u00fe\u0000\u0000\u01e0\u01e2\u0001\u0000\u0000\u0000\u01e1\u01ce\u0001"+
		"\u0000\u0000\u0000\u01e1\u01dc\u0001\u0000\u0000\u0000\u01e23\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e5\u0005\u00c2\u0000\u0000\u01e4\u01e6\u0005\u00c3"+
		"\u0000\u0000\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e6\u021c\u0001\u0000\u0000\u0000\u01e7\u021c\u0005\u00ae"+
		"\u0000\u0000\u01e8\u021c\u0005\u00af\u0000\u0000\u01e9\u01ed\u0007\u0002"+
		"\u0000\u0000\u01ea\u01eb\u0005\u00fd\u0000\u0000\u01eb\u01ec\u0007\u0003"+
		"\u0000\u0000\u01ec\u01ee\u0005\u00fe\u0000\u0000\u01ed\u01ea\u0001\u0000"+
		"\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee\u01f2\u0001\u0000"+
		"\u0000\u0000\u01ef\u01f0\u0005\u00fd\u0000\u0000\u01f0\u01f1\u0007\u0004"+
		"\u0000\u0000\u01f1\u01f3\u0005\u00fe\u0000\u0000\u01f2\u01ef\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f4\u01f5\u0005\u00b0\u0000\u0000\u01f5\u01f7\u0003f3\u0000"+
		"\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000"+
		"\u01f7\u021c\u0001\u0000\u0000\u0000\u01f8\u0200\u0007\u0005\u0000\u0000"+
		"\u01f9\u01fa\u0005\u00fd\u0000\u0000\u01fa\u01fd\u0005\u00ef\u0000\u0000"+
		"\u01fb\u01fc\u0005\u00fb\u0000\u0000\u01fc\u01fe\u0005\u00ef\u0000\u0000"+
		"\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000"+
		"\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff\u0201\u0005\u00fe\u0000\u0000"+
		"\u0200\u01f9\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000"+
		"\u0201\u021c\u0001\u0000\u0000\u0000\u0202\u021c\u0005{\u0000\u0000\u0203"+
		"\u021c\u0005|\u0000\u0000\u0204\u021c\u0005\u00a4\u0000\u0000\u0205\u021c"+
		"\u0005\u00a5\u0000\u0000\u0206\u021c\u0005\u00a6\u0000\u0000\u0207\u021c"+
		"\u0005\u007f\u0000\u0000\u0208\u021c\u0005\u0080\u0000\u0000\u0209\u020d"+
		"\u0005\u00b1\u0000\u0000\u020a\u020b\u0005\u00fd\u0000\u0000\u020b\u020c"+
		"\u0005\u00ef\u0000\u0000\u020c\u020e\u0005\u00fe\u0000\u0000\u020d\u020a"+
		"\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e\u021c"+
		"\u0001\u0000\u0000\u0000\u020f\u021c\u00054\u0000\u0000\u0210\u021c\u0005"+
		"\u00c4\u0000\u0000\u0211\u021c\u0005~\u0000\u0000\u0212\u021c\u0005\u0083"+
		"\u0000\u0000\u0213\u021c\u0005\u0082\u0000\u0000\u0214\u021c\u0005\u00b2"+
		"\u0000\u0000\u0215\u021c\u0005\u00b3\u0000\u0000\u0216\u021c\u0005\u00b4"+
		"\u0000\u0000\u0217\u0218\u0005\u00bd\u0000\u0000\u0218\u0219\u0007\u0006"+
		"\u0000\u0000\u0219\u021a\u0005\u00c1\u0000\u0000\u021a\u021c\u0007\u0007"+
		"\u0000\u0000\u021b\u01e3\u0001\u0000\u0000\u0000\u021b\u01e7\u0001\u0000"+
		"\u0000\u0000\u021b\u01e8\u0001\u0000\u0000\u0000\u021b\u01e9\u0001\u0000"+
		"\u0000\u0000\u021b\u01f8\u0001\u0000\u0000\u0000\u021b\u0202\u0001\u0000"+
		"\u0000\u0000\u021b\u0203\u0001\u0000\u0000\u0000\u021b\u0204\u0001\u0000"+
		"\u0000\u0000\u021b\u0205\u0001\u0000\u0000\u0000\u021b\u0206\u0001\u0000"+
		"\u0000\u0000\u021b\u0207\u0001\u0000\u0000\u0000\u021b\u0208\u0001\u0000"+
		"\u0000\u0000\u021b\u0209\u0001\u0000\u0000\u0000\u021b\u020f\u0001\u0000"+
		"\u0000\u0000\u021b\u0210\u0001\u0000\u0000\u0000\u021b\u0211\u0001\u0000"+
		"\u0000\u0000\u021b\u0212\u0001\u0000\u0000\u0000\u021b\u0213\u0001\u0000"+
		"\u0000\u0000\u021b\u0214\u0001\u0000\u0000\u0000\u021b\u0215\u0001\u0000"+
		"\u0000\u0000\u021b\u0216\u0001\u0000\u0000\u0000\u021b\u0217\u0001\u0000"+
		"\u0000\u0000\u021c5\u0001\u0000\u0000\u0000\u021d\u021e\u0005,\u0000\u0000"+
		"\u021e\u0220\u0003f3\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u021f\u0220"+
		"\u0001\u0000\u0000\u0000\u0220\u0250\u0001\u0000\u0000\u0000\u0221\u0222"+
		"\u0005-\u0000\u0000\u0222\u0224\u0005/\u0000\u0000\u0223\u0225\u0007\b"+
		"\u0000\u0000\u0224\u0223\u0001\u0000\u0000\u0000\u0224\u0225\u0001\u0000"+
		"\u0000\u0000\u0225\u0251\u0001\u0000\u0000\u0000\u0226\u0227\u0005\u001d"+
		"\u0000\u0000\u0227\u0251\u0005\u001e\u0000\u0000\u0228\u0251\u0005\u001e"+
		"\u0000\u0000\u0229\u022b\u00052\u0000\u0000\u022a\u022c\u0007\b\u0000"+
		"\u0000\u022b\u022a\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000"+
		"\u0000\u022c\u0251\u0001\u0000\u0000\u0000\u022d\u0235\u0005\u00a1\u0000"+
		"\u0000\u022e\u022f\u0005\u00fd\u0000\u0000\u022f\u0232\u0005\u00ef\u0000"+
		"\u0000\u0230\u0231\u0005\u00fb\u0000\u0000\u0231\u0233\u0005\u00ef\u0000"+
		"\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000"+
		"\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234\u0236\u0005\u00fe\u0000"+
		"\u0000\u0235\u022e\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000"+
		"\u0000\u0236\u0251\u0001\u0000\u0000\u0000\u0237\u0238\u00055\u0000\u0000"+
		"\u0238\u0251\u0003b1\u0000\u0239\u023a\u0005\u00e8\u0000\u0000\u023a\u023b"+
		"\u0005\u00fd\u0000\u0000\u023b\u023c\u0003\u0084B\u0000\u023c\u023d\u0005"+
		"\u00fe\u0000\u0000\u023d\u0251\u0001\u0000\u0000\u0000\u023e\u023f\u0005"+
		"7\u0000\u0000\u023f\u0244\u0003j5\u0000\u0240\u0241\u0005\u00fd\u0000"+
		"\u0000\u0241\u0242\u0003f3\u0000\u0242\u0243\u0005\u00fe\u0000\u0000\u0243"+
		"\u0245\u0001\u0000\u0000\u0000\u0244\u0240\u0001\u0000\u0000\u0000\u0244"+
		"\u0245\u0001\u0000\u0000\u0000\u0245\u0249\u0001\u0000\u0000\u0000\u0246"+
		"\u0247\u0005\u001a\u0000\u0000\u0247\u0248\u0005\u000e\u0000\u0000\u0248"+
		"\u024a\u0003`0\u0000\u0249\u0246\u0001\u0000\u0000\u0000\u0249\u024a\u0001"+
		"\u0000\u0000\u0000\u024a\u024e\u0001\u0000\u0000\u0000\u024b\u024c\u0005"+
		"\u001a\u0000\u0000\u024c\u024d\u0005\u000f\u0000\u0000\u024d\u024f\u0003"+
		"`0\u0000\u024e\u024b\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000\u0000"+
		"\u0000\u024f\u0251\u0001\u0000\u0000\u0000\u0250\u0221\u0001\u0000\u0000"+
		"\u0000\u0250\u0226\u0001\u0000\u0000\u0000\u0250\u0228\u0001\u0000\u0000"+
		"\u0000\u0250\u0229\u0001\u0000\u0000\u0000\u0250\u022d\u0001\u0000\u0000"+
		"\u0000\u0250\u0237\u0001\u0000\u0000\u0000\u0250\u0239\u0001\u0000\u0000"+
		"\u0000\u0250\u023e\u0001\u0000\u0000\u0000\u02517\u0001\u0000\u0000\u0000"+
		"\u0252\u0253\u0005&\u0000\u0000\u0253\u0254\u0005)\u0000\u0000\u0254\u0255"+
		"\u0003j5\u0000\u0255\u0256\u0005\u00fd\u0000\u0000\u0256\u025b\u00030"+
		"\u0018\u0000\u0257\u0258\u0005\u00fb\u0000\u0000\u0258\u025a\u00030\u0018"+
		"\u0000\u0259\u0257\u0001\u0000\u0000\u0000\u025a\u025d\u0001\u0000\u0000"+
		"\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025b\u025c\u0001\u0000\u0000"+
		"\u0000\u025c\u025e\u0001\u0000\u0000\u0000\u025d\u025b\u0001\u0000\u0000"+
		"\u0000\u025e\u0261\u0005\u00fe\u0000\u0000\u025f\u0260\u0005\u001a\u0000"+
		"\u0000\u0260\u0262\u0003^/\u0000\u0261\u025f\u0001\u0000\u0000\u0000\u0261"+
		"\u0262\u0001\u0000\u0000\u0000\u0262\u0265\u0001\u0000\u0000\u0000\u0263"+
		"\u0264\u0005\u00b5\u0000\u0000\u0264\u0266\u0003^/\u0000\u0265\u0263\u0001"+
		"\u0000\u0000\u0000\u0265\u0266\u0001\u0000\u0000\u0000\u02669\u0001\u0000"+
		"\u0000\u0000\u0267\u0268\u0005&\u0000\u0000\u0268\u0269\u00050\u0000\u0000"+
		"\u0269\u026a\u0003f3\u0000\u026a;\u0001\u0000\u0000\u0000\u026b\u026c"+
		"\u0005&\u0000\u0000\u026c\u026d\u0005\u00cc\u0000\u0000\u026d\u0270\u0003"+
		"f3\u0000\u026e\u026f\u0005\u00cd\u0000\u0000\u026f\u0271\u0003f3\u0000"+
		"\u0270\u026e\u0001\u0000\u0000\u0000\u0270\u0271\u0001\u0000\u0000\u0000"+
		"\u0271=\u0001\u0000\u0000\u0000\u0272\u0273\u0005&\u0000\u0000\u0273\u0274"+
		"\u0007\t\u0000\u0000\u0274\u027b\u0003j5\u0000\u0275\u0277\u0005\u00fd"+
		"\u0000\u0000\u0276\u0278\u0003Z-\u0000\u0277\u0276\u0001\u0000\u0000\u0000"+
		"\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000"+
		"\u0279\u027c\u0005\u00fe\u0000\u0000\u027a\u027c\u0003Z-\u0000\u027b\u0275"+
		"\u0001\u0000\u0000\u0000\u027b\u027a\u0001\u0000\u0000\u0000\u027b\u027c"+
		"\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000\u0000\u027d\u027e"+
		"\u0005V\u0000\u0000\u027e\u0285\u0005X\u0000\u0000\u027f\u0281\u0003\u0002"+
		"\u0001\u0000\u0280\u0282\u0005\u00fc\u0000\u0000\u0281\u0280\u0001\u0000"+
		"\u0000\u0000\u0281\u0282\u0001\u0000\u0000\u0000\u0282\u0284\u0001\u0000"+
		"\u0000\u0000\u0283\u027f\u0001\u0000\u0000\u0000\u0284\u0287\u0001\u0000"+
		"\u0000\u0000\u0285\u0283\u0001\u0000\u0000\u0000\u0285\u0286\u0001\u0000"+
		"\u0000\u0000\u0286\u0288\u0001\u0000\u0000\u0000\u0287\u0285\u0001\u0000"+
		"\u0000\u0000\u0288\u0289\u0005Y\u0000\u0000\u0289?\u0001\u0000\u0000\u0000"+
		"\u028a\u028b\u0005&\u0000\u0000\u028b\u028c\u0005\u00c9\u0000\u0000\u028c"+
		"\u0292\u0003j5\u0000\u028d\u028f\u0005\u00fd\u0000\u0000\u028e\u0290\u0003"+
		"Z-\u0000\u028f\u028e\u0001\u0000\u0000\u0000\u028f\u0290\u0001\u0000\u0000"+
		"\u0000\u0290\u0291\u0001\u0000\u0000\u0000\u0291\u0293\u0005\u00fe\u0000"+
		"\u0000\u0292\u028d\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000"+
		"\u0000\u0293\u0294\u0001\u0000\u0000\u0000\u0294\u0295\u0005\u00c8\u0000"+
		"\u0000\u0295\u0296\u00034\u001a\u0000\u0296\u0297\u0005V\u0000\u0000\u0297"+
		"\u029e\u0005X\u0000\u0000\u0298\u029a\u0003\u0002\u0001\u0000\u0299\u029b"+
		"\u0005\u00fc\u0000\u0000\u029a\u0299\u0001\u0000\u0000\u0000\u029a\u029b"+
		"\u0001\u0000\u0000\u0000\u029b\u029d\u0001\u0000\u0000\u0000\u029c\u0298"+
		"\u0001\u0000\u0000\u0000\u029d\u02a0\u0001\u0000\u0000\u0000\u029e\u029c"+
		"\u0001\u0000\u0000\u0000\u029e\u029f\u0001\u0000\u0000\u0000\u029f\u02a1"+
		"\u0001\u0000\u0000\u0000\u02a0\u029e\u0001\u0000\u0000\u0000\u02a1\u02a2"+
		"\u0005Y\u0000\u0000\u02a2A\u0001\u0000\u0000\u0000\u02a3\u02a5\u0005&"+
		"\u0000\u0000\u02a4\u02a6\u00052\u0000\u0000\u02a5\u02a4\u0001\u0000\u0000"+
		"\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6\u02a8\u0001\u0000\u0000"+
		"\u0000\u02a7\u02a9\u0007\b\u0000\u0000\u02a8\u02a7\u0001\u0000\u0000\u0000"+
		"\u02a8\u02a9\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000"+
		"\u02aa\u02ab\u0005+\u0000\u0000\u02ab\u02ac\u0003j5\u0000\u02ac\u02ad"+
		"\u0005\u001a\u0000\u0000\u02ad\u02ae\u0003j5\u0000\u02ae\u02af\u0005\u00fd"+
		"\u0000\u0000\u02af\u02b4\u0003D\"\u0000\u02b0\u02b1\u0005\u00fb\u0000"+
		"\u0000\u02b1\u02b3\u0003D\"\u0000\u02b2\u02b0\u0001\u0000\u0000\u0000"+
		"\u02b3\u02b6\u0001\u0000\u0000\u0000\u02b4\u02b2\u0001\u0000\u0000\u0000"+
		"\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b7\u0001\u0000\u0000\u0000"+
		"\u02b6\u02b4\u0001\u0000\u0000\u0000\u02b7\u02b8\u0005\u00fe\u0000\u0000"+
		"\u02b8C\u0001\u0000\u0000\u0000\u02b9\u02bb\u0003f3\u0000\u02ba\u02bc"+
		"\u0007\n\u0000\u0000\u02bb\u02ba\u0001\u0000\u0000\u0000\u02bb\u02bc\u0001"+
		"\u0000\u0000\u0000\u02bcE\u0001\u0000\u0000\u0000\u02bd\u02be\u0005&\u0000"+
		"\u0000\u02be\u02bf\u0005*\u0000\u0000\u02bf\u02c0\u0003j5\u0000\u02c0"+
		"\u02c1\u0005V\u0000\u0000\u02c1\u02c2\u0003\u0012\t\u0000\u02c2G\u0001"+
		"\u0000\u0000\u0000\u02c3\u02c4\u0005\'\u0000\u0000\u02c4\u02c5\u0005)"+
		"\u0000\u0000\u02c5\u02c6\u0003j5\u0000\u02c6\u02cb\u0003J%\u0000\u02c7"+
		"\u02c8\u0005\u00fb\u0000\u0000\u02c8\u02ca\u0003J%\u0000\u02c9\u02c7\u0001"+
		"\u0000\u0000\u0000\u02ca\u02cd\u0001\u0000\u0000\u0000\u02cb\u02c9\u0001"+
		"\u0000\u0000\u0000\u02cb\u02cc\u0001\u0000\u0000\u0000\u02ccI\u0001\u0000"+
		"\u0000\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000\u02ce\u02d1\u0005b\u0000"+
		"\u0000\u02cf\u02d2\u00032\u0019\u0000\u02d0\u02d2\u0003X,\u0000\u02d1"+
		"\u02cf\u0001\u0000\u0000\u0000\u02d1\u02d0\u0001\u0000\u0000\u0000\u02d2"+
		"\u02de\u0001\u0000\u0000\u0000\u02d3\u02d5\u0005(\u0000\u0000\u02d4\u02d6"+
		"\u0007\u000b\u0000\u0000\u02d5\u02d4\u0001\u0000\u0000\u0000\u02d5\u02d6"+
		"\u0001\u0000\u0000\u0000\u02d6\u02d7\u0001\u0000\u0000\u0000\u02d7\u02de"+
		"\u0003f3\u0000\u02d8\u02d9\u0005\'\u0000\u0000\u02d9\u02da\u0005\u00ad"+
		"\u0000\u0000\u02da\u02db\u0003f3\u0000\u02db\u02dc\u00034\u001a\u0000"+
		"\u02dc\u02de\u0001\u0000\u0000\u0000\u02dd\u02ce\u0001\u0000\u0000\u0000"+
		"\u02dd\u02d3\u0001\u0000\u0000\u0000\u02dd\u02d8\u0001\u0000\u0000\u0000"+
		"\u02deK\u0001\u0000\u0000\u0000\u02df\u02e0\u0005\'\u0000\u0000\u02e0"+
		"\u02e1\u00050\u0000\u0000\u02e1\u02ea\u0003f3\u0000\u02e2\u02e3\u0005"+
		"\u00ce\u0000\u0000\u02e3\u02e4\u0005\u00aa\u0000\u0000\u02e4\u02e5\u0005"+
		"\u00f0\u0000\u0000\u02e5\u02eb\u0003f3\u0000\u02e6\u02e7\u0005\u0010\u0000"+
		"\u0000\u02e7\u02e8\u0003f3\u0000\u02e8\u02e9\u0003f3\u0000\u02e9\u02eb"+
		"\u0001\u0000\u0000\u0000\u02ea\u02e2\u0001\u0000\u0000\u0000\u02ea\u02e6"+
		"\u0001\u0000\u0000\u0000\u02ebM\u0001\u0000\u0000\u0000\u02ec\u02ed\u0005"+
		"\'\u0000\u0000\u02ed\u02f0\u0005+\u0000\u0000\u02ee\u02f1\u0003f3\u0000"+
		"\u02ef\u02f1\u0005\u009b\u0000\u0000\u02f0\u02ee\u0001\u0000\u0000\u0000"+
		"\u02f0\u02ef\u0001\u0000\u0000\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000"+
		"\u02f2\u02f3\u0005\u001a\u0000\u0000\u02f3\u02f4\u0003j5\u0000\u02f4\u02f5"+
		"\u0007\f\u0000\u0000\u02f5O\u0001\u0000\u0000\u0000\u02f6\u02f7\u0005"+
		"\'\u0000\u0000\u02f7\u02f8\u0005*\u0000\u0000\u02f8\u02f9\u0003j5\u0000"+
		"\u02f9\u02fa\u0005V\u0000\u0000\u02fa\u02fb\u0003\u0012\t\u0000\u02fb"+
		"Q\u0001\u0000\u0000\u0000\u02fc\u02fd\u0005\'\u0000\u0000\u02fd\u02fe"+
		"\u0007\t\u0000\u0000\u02fe\u0305\u0003j5\u0000\u02ff\u0301\u0005\u00fd"+
		"\u0000\u0000\u0300\u0302\u0003Z-\u0000\u0301\u0300\u0001\u0000\u0000\u0000"+
		"\u0301\u0302\u0001\u0000\u0000\u0000\u0302\u0303\u0001\u0000\u0000\u0000"+
		"\u0303\u0306\u0005\u00fe\u0000\u0000\u0304\u0306\u0003Z-\u0000\u0305\u02ff"+
		"\u0001\u0000\u0000\u0000\u0305\u0304\u0001\u0000\u0000\u0000\u0305\u0306"+
		"\u0001\u0000\u0000\u0000\u0306\u0307\u0001\u0000\u0000\u0000\u0307\u0308"+
		"\u0005V\u0000\u0000\u0308\u030f\u0005X\u0000\u0000\u0309\u030b\u0003\u0002"+
		"\u0001\u0000\u030a\u030c\u0005\u00fc\u0000\u0000\u030b\u030a\u0001\u0000"+
		"\u0000\u0000\u030b\u030c\u0001\u0000\u0000\u0000\u030c\u030e\u0001\u0000"+
		"\u0000\u0000\u030d\u0309\u0001\u0000\u0000\u0000\u030e\u0311\u0001\u0000"+
		"\u0000\u0000\u030f\u030d\u0001\u0000\u0000\u0000\u030f\u0310\u0001\u0000"+
		"\u0000\u0000\u0310\u0312\u0001\u0000\u0000\u0000\u0311\u030f\u0001\u0000"+
		"\u0000\u0000\u0312\u0313\u0005Y\u0000\u0000\u0313S\u0001\u0000\u0000\u0000"+
		"\u0314\u0315\u0005\'\u0000\u0000\u0315\u0316\u0005\u00c9\u0000\u0000\u0316"+
		"\u031c\u0003j5\u0000\u0317\u0319\u0005\u00fd\u0000\u0000\u0318\u031a\u0003"+
		"Z-\u0000\u0319\u0318\u0001\u0000\u0000\u0000\u0319\u031a\u0001\u0000\u0000"+
		"\u0000\u031a\u031b\u0001\u0000\u0000\u0000\u031b\u031d\u0005\u00fe\u0000"+
		"\u0000\u031c\u0317\u0001\u0000\u0000\u0000\u031c\u031d\u0001\u0000\u0000"+
		"\u0000\u031d\u031e\u0001\u0000\u0000\u0000\u031e\u031f\u0005\u00c8\u0000"+
		"\u0000\u031f\u0320\u00034\u001a\u0000\u0320\u0321\u0005V\u0000\u0000\u0321"+
		"\u0328\u0005X\u0000\u0000\u0322\u0324\u0003\u0002\u0001\u0000\u0323\u0325"+
		"\u0005\u00fc\u0000\u0000\u0324\u0323\u0001\u0000\u0000\u0000\u0324\u0325"+
		"\u0001\u0000\u0000\u0000\u0325\u0327\u0001\u0000\u0000\u0000\u0326\u0322"+
		"\u0001\u0000\u0000\u0000\u0327\u032a\u0001\u0000\u0000\u0000\u0328\u0326"+
		"\u0001\u0000\u0000\u0000\u0328\u0329\u0001\u0000\u0000\u0000\u0329\u032b"+
		"\u0001\u0000\u0000\u0000\u032a\u0328\u0001\u0000\u0000\u0000\u032b\u032c"+
		"\u0005Y\u0000\u0000\u032cU\u0001\u0000\u0000\u0000\u032d\u032e\u0005\'"+
		"\u0000\u0000\u032e\u032f\u0005\u00cc\u0000\u0000\u032f\u0330\u0003f3\u0000"+
		"\u0330\u0333\u0005\u00d5\u0000\u0000\u0331\u0332\u0005\u00d6\u0000\u0000"+
		"\u0332\u0334\u0005\u00d7\u0000\u0000\u0333\u0331\u0001\u0000\u0000\u0000"+
		"\u0333\u0334\u0001\u0000\u0000\u0000\u0334\u0335\u0001\u0000\u0000\u0000"+
		"\u0335\u0336\u0003j5\u0000\u0336W\u0001\u0000\u0000\u0000\u0337\u0338"+
		"\u0005,\u0000\u0000\u0338\u033a\u0003f3\u0000\u0339\u0337\u0001\u0000"+
		"\u0000\u0000\u0339\u033a\u0001\u0000\u0000\u0000\u033a\u0384\u0001\u0000"+
		"\u0000\u0000\u033b\u033c\u0005-\u0000\u0000\u033c\u033e\u0005/\u0000\u0000"+
		"\u033d\u033f\u0007\b\u0000\u0000\u033e\u033d\u0001\u0000\u0000\u0000\u033e"+
		"\u033f\u0001\u0000\u0000\u0000\u033f\u0340\u0001\u0000\u0000\u0000\u0340"+
		"\u0341\u0005\u00fd\u0000\u0000\u0341\u0346\u0003f3\u0000\u0342\u0343\u0005"+
		"\u00fb\u0000\u0000\u0343\u0345\u0003f3\u0000\u0344\u0342\u0001\u0000\u0000"+
		"\u0000\u0345\u0348\u0001\u0000\u0000\u0000\u0346\u0344\u0001\u0000\u0000"+
		"\u0000\u0346\u0347\u0001\u0000\u0000\u0000\u0347\u0349\u0001\u0000\u0000"+
		"\u0000\u0348\u0346\u0001\u0000\u0000\u0000\u0349\u034a\u0005\u00fe\u0000"+
		"\u0000\u034a\u0385\u0001\u0000\u0000\u0000\u034b\u034d\u00052\u0000\u0000"+
		"\u034c\u034e\u0007\b\u0000\u0000\u034d\u034c\u0001\u0000\u0000\u0000\u034d"+
		"\u034e\u0001\u0000\u0000\u0000\u034e\u034f\u0001\u0000\u0000\u0000\u034f"+
		"\u0350\u0005\u00fd\u0000\u0000\u0350\u0355\u0003f3\u0000\u0351\u0352\u0005"+
		"\u00fb\u0000\u0000\u0352\u0354\u0003f3\u0000\u0353\u0351\u0001\u0000\u0000"+
		"\u0000\u0354\u0357\u0001\u0000\u0000\u0000\u0355\u0353\u0001\u0000\u0000"+
		"\u0000\u0355\u0356\u0001\u0000\u0000\u0000\u0356\u0358\u0001\u0000\u0000"+
		"\u0000\u0357\u0355\u0001\u0000\u0000\u0000\u0358\u0359\u0005\u00fe\u0000"+
		"\u0000\u0359\u0385\u0001\u0000\u0000\u0000\u035a\u035b\u0005.\u0000\u0000"+
		"\u035b\u035c\u0005/\u0000\u0000\u035c\u035d\u0005\u00fd\u0000\u0000\u035d"+
		"\u0362\u0003f3\u0000\u035e\u035f\u0005\u00fb\u0000\u0000\u035f\u0361\u0003"+
		"f3\u0000\u0360\u035e\u0001\u0000\u0000\u0000\u0361\u0364\u0001\u0000\u0000"+
		"\u0000\u0362\u0360\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000\u0000"+
		"\u0000\u0363\u0365\u0001\u0000\u0000\u0000\u0364\u0362\u0001\u0000\u0000"+
		"\u0000\u0365\u0366\u0005\u00fe\u0000\u0000\u0366\u0367\u00057\u0000\u0000"+
		"\u0367\u0373\u0003j5\u0000\u0368\u0369\u0005\u00fd\u0000\u0000\u0369\u036e"+
		"\u0003f3\u0000\u036a\u036b\u0005\u00fb\u0000\u0000\u036b\u036d\u0003f"+
		"3\u0000\u036c\u036a\u0001\u0000\u0000\u0000\u036d\u0370\u0001\u0000\u0000"+
		"\u0000\u036e\u036c\u0001\u0000\u0000\u0000\u036e\u036f\u0001\u0000\u0000"+
		"\u0000\u036f\u0371\u0001\u0000\u0000\u0000\u0370\u036e\u0001\u0000\u0000"+
		"\u0000\u0371\u0372\u0005\u00fe\u0000\u0000\u0372\u0374\u0001\u0000\u0000"+
		"\u0000\u0373\u0368\u0001\u0000\u0000\u0000\u0373\u0374\u0001\u0000\u0000"+
		"\u0000\u0374\u0378\u0001\u0000\u0000\u0000\u0375\u0376\u0005\u001a\u0000"+
		"\u0000\u0376\u0377\u0005\u000e\u0000\u0000\u0377\u0379\u0003`0\u0000\u0378"+
		"\u0375\u0001\u0000\u0000\u0000\u0378\u0379\u0001\u0000\u0000\u0000\u0379"+
		"\u037d\u0001\u0000\u0000\u0000\u037a\u037b\u0005\u001a\u0000\u0000\u037b"+
		"\u037c\u0005\u000f\u0000\u0000\u037c\u037e\u0003`0\u0000\u037d\u037a\u0001"+
		"\u0000\u0000\u0000\u037d\u037e\u0001\u0000\u0000\u0000\u037e\u0385\u0001"+
		"\u0000\u0000\u0000\u037f\u0380\u0005\u00e8\u0000\u0000\u0380\u0381\u0005"+
		"\u00fd\u0000\u0000\u0381\u0382\u0003\u0084B\u0000\u0382\u0383\u0005\u00fe"+
		"\u0000\u0000\u0383\u0385\u0001\u0000\u0000\u0000\u0384\u033b\u0001\u0000"+
		"\u0000\u0000\u0384\u034b\u0001\u0000\u0000\u0000\u0384\u035a\u0001\u0000"+
		"\u0000\u0000\u0384\u037f\u0001\u0000\u0000\u0000\u0385Y\u0001\u0000\u0000"+
		"\u0000\u0386\u038b\u0003\\.\u0000\u0387\u0388\u0005\u00fb\u0000\u0000"+
		"\u0388\u038a\u0003\\.\u0000\u0389\u0387\u0001\u0000\u0000\u0000\u038a"+
		"\u038d\u0001\u0000\u0000\u0000\u038b\u0389\u0001\u0000\u0000\u0000\u038b"+
		"\u038c\u0001\u0000\u0000\u0000\u038c[\u0001\u0000\u0000\u0000\u038d\u038b"+
		"\u0001\u0000\u0000\u0000\u038e\u0391\u0005\u0105\u0000\u0000\u038f\u0391"+
		"\u0003f3\u0000\u0390\u038e\u0001\u0000\u0000\u0000\u0390\u038f\u0001\u0000"+
		"\u0000\u0000\u0391\u0392\u0001\u0000\u0000\u0000\u0392\u0395\u00034\u001a"+
		"\u0000\u0393\u0394\u0005\u00f0\u0000\u0000\u0394\u0396\u0003b1\u0000\u0395"+
		"\u0393\u0001\u0000\u0000\u0000\u0395\u0396\u0001\u0000\u0000\u0000\u0396"+
		"\u0398\u0001\u0000\u0000\u0000\u0397\u0399\u0005\u00c6\u0000\u0000\u0398"+
		"\u0397\u0001\u0000\u0000\u0000\u0398\u0399\u0001\u0000\u0000\u0000\u0399"+
		"]\u0001\u0000\u0000\u0000\u039a\u039d\u0003f3\u0000\u039b\u039d\u0005"+
		"-\u0000\u0000\u039c\u039a\u0001\u0000\u0000\u0000\u039c\u039b\u0001\u0000"+
		"\u0000\u0000\u039d_\u0001\u0000\u0000\u0000\u039e\u03a7\u0005\u00a2\u0000"+
		"\u0000\u039f\u03a0\u0005\u00a7\u0000\u0000\u03a0\u03a7\u0005\u00a3\u0000"+
		"\u0000\u03a1\u03a2\u0005\u0010\u0000\u0000\u03a2\u03a7\u0005\u001e\u0000"+
		"\u0000\u03a3\u03a4\u0005\u0010\u0000\u0000\u03a4\u03a7\u00055\u0000\u0000"+
		"\u03a5\u03a7\u0005\u00ac\u0000\u0000\u03a6\u039e\u0001\u0000\u0000\u0000"+
		"\u03a6\u039f\u0001\u0000\u0000\u0000\u03a6\u03a1\u0001\u0000\u0000\u0000"+
		"\u03a6\u03a3\u0001\u0000\u0000\u0000\u03a6\u03a5\u0001\u0000\u0000\u0000"+
		"\u03a7a\u0001\u0000\u0000\u0000\u03a8\u03c0\u0005\u00ec\u0000\u0000\u03a9"+
		"\u03c0\u0005\u00ef\u0000\u0000\u03aa\u03ac\u0005\u00f7\u0000\u0000\u03ab"+
		"\u03aa\u0001\u0000\u0000\u0000\u03ab\u03ac\u0001\u0000\u0000\u0000\u03ac"+
		"\u03ad\u0001\u0000\u0000\u0000\u03ad\u03c0\u0005\u00ef\u0000\u0000\u03ae"+
		"\u03c0\u0005\u001e\u0000\u0000\u03af\u03c0\u00056\u0000\u0000\u03b0\u03bd"+
		"\u0003f3\u0000\u03b1\u03ba\u0005\u00fd\u0000\u0000\u03b2\u03b7\u0003\u0084"+
		"B\u0000\u03b3\u03b4\u0005\u00fb\u0000\u0000\u03b4\u03b6\u0003\u0084B\u0000"+
		"\u03b5\u03b3\u0001\u0000\u0000\u0000\u03b6\u03b9\u0001\u0000\u0000\u0000"+
		"\u03b7\u03b5\u0001\u0000\u0000\u0000\u03b7\u03b8\u0001\u0000\u0000\u0000"+
		"\u03b8\u03bb\u0001\u0000\u0000\u0000\u03b9\u03b7\u0001\u0000\u0000\u0000"+
		"\u03ba\u03b2\u0001\u0000\u0000\u0000\u03ba\u03bb\u0001\u0000\u0000\u0000"+
		"\u03bb\u03bc\u0001\u0000\u0000\u0000\u03bc\u03be\u0005\u00fe\u0000\u0000"+
		"\u03bd\u03b1\u0001\u0000\u0000\u0000\u03bd\u03be\u0001\u0000\u0000\u0000"+
		"\u03be\u03c0\u0001\u0000\u0000\u0000\u03bf\u03a8\u0001\u0000\u0000\u0000"+
		"\u03bf\u03a9\u0001\u0000\u0000\u0000\u03bf\u03ab\u0001\u0000\u0000\u0000"+
		"\u03bf\u03ae\u0001\u0000\u0000\u0000\u03bf\u03af\u0001\u0000\u0000\u0000"+
		"\u03bf\u03b0\u0001\u0000\u0000\u0000\u03c0c\u0001\u0000\u0000\u0000\u03c1"+
		"\u03cb\u0005\u00f8\u0000\u0000\u03c2\u03c7\u0003f3\u0000\u03c3\u03c4\u0005"+
		"\u00fb\u0000\u0000\u03c4\u03c6\u0003f3\u0000\u03c5\u03c3\u0001\u0000\u0000"+
		"\u0000\u03c6\u03c9\u0001\u0000\u0000\u0000\u03c7\u03c5\u0001\u0000\u0000"+
		"\u0000\u03c7\u03c8\u0001\u0000\u0000\u0000\u03c8\u03cb\u0001\u0000\u0000"+
		"\u0000\u03c9\u03c7\u0001\u0000\u0000\u0000\u03ca\u03c1\u0001\u0000\u0000"+
		"\u0000\u03ca\u03c2\u0001\u0000\u0000\u0000\u03cbe\u0001\u0000\u0000\u0000"+
		"\u03cc\u03d1\u0005\u0106\u0000\u0000\u03cd\u03d1\u0005\u0103\u0000\u0000"+
		"\u03ce\u03d1\u0005\u0104\u0000\u0000\u03cf\u03d1\u0003h4\u0000\u03d0\u03cc"+
		"\u0001\u0000\u0000\u0000\u03d0\u03cd\u0001\u0000\u0000\u0000\u03d0\u03ce"+
		"\u0001\u0000\u0000\u0000\u03d0\u03cf\u0001\u0000\u0000\u0000\u03d1g\u0001"+
		"\u0000\u0000\u0000\u03d2\u03d3\u0007\r\u0000\u0000\u03d3i\u0001\u0000"+
		"\u0000\u0000\u03d4\u03d9\u0003f3\u0000\u03d5\u03d6\u0005\u00ff\u0000\u0000"+
		"\u03d6\u03d8\u0003f3\u0000\u03d7\u03d5\u0001\u0000\u0000\u0000\u03d8\u03db"+
		"\u0001\u0000\u0000\u0000\u03d9\u03d7\u0001\u0000\u0000\u0000\u03d9\u03da"+
		"\u0001\u0000\u0000\u0000\u03dak\u0001\u0000\u0000\u0000\u03db\u03d9\u0001"+
		"\u0000\u0000\u0000\u03dc\u03e1\u0003n7\u0000\u03dd\u03de\u0005\u00fb\u0000"+
		"\u0000\u03de\u03e0\u0003n7\u0000\u03df\u03dd\u0001\u0000\u0000\u0000\u03e0"+
		"\u03e3\u0001\u0000\u0000\u0000\u03e1\u03df\u0001\u0000\u0000\u0000\u03e1"+
		"\u03e2\u0001\u0000\u0000\u0000\u03e2m\u0001\u0000\u0000\u0000\u03e3\u03e1"+
		"\u0001\u0000\u0000\u0000\u03e4\u03f1\u0003f3\u0000\u03e5\u03ee\u0005\u00fd"+
		"\u0000\u0000\u03e6\u03eb\u0003\u0084B\u0000\u03e7\u03e8\u0005\u00fb\u0000"+
		"\u0000\u03e8\u03ea\u0003\u0084B\u0000\u03e9\u03e7\u0001\u0000\u0000\u0000"+
		"\u03ea\u03ed\u0001\u0000\u0000\u0000\u03eb\u03e9\u0001\u0000\u0000\u0000"+
		"\u03eb\u03ec\u0001\u0000\u0000\u0000\u03ec\u03ef\u0001\u0000\u0000\u0000"+
		"\u03ed\u03eb\u0001\u0000\u0000\u0000\u03ee\u03e6\u0001\u0000\u0000\u0000"+
		"\u03ee\u03ef\u0001\u0000\u0000\u0000\u03ef\u03f0\u0001\u0000\u0000\u0000"+
		"\u03f0\u03f2\u0005\u00fe\u0000\u0000\u03f1\u03e5\u0001\u0000\u0000\u0000"+
		"\u03f1\u03f2\u0001\u0000\u0000\u0000\u03f2\u03f8\u0001\u0000\u0000\u0000"+
		"\u03f3\u03f8\u0005\u0105\u0000\u0000\u03f4\u03f8\u0005\u00ef\u0000\u0000"+
		"\u03f5\u03f8\u0005\u00ec\u0000\u0000\u03f6\u03f8\u0005\u001e\u0000\u0000"+
		"\u03f7\u03e4\u0001\u0000\u0000\u0000\u03f7\u03f3\u0001\u0000\u0000\u0000"+
		"\u03f7\u03f4\u0001\u0000\u0000\u0000\u03f7\u03f5\u0001\u0000\u0000\u0000"+
		"\u03f7\u03f6\u0001\u0000\u0000\u0000\u03f8o\u0001\u0000\u0000\u0000\u03f9"+
		"\u03fd\u0003r9\u0000\u03fa\u03fd\u0003t:\u0000\u03fb\u03fd\u0003v;\u0000"+
		"\u03fc\u03f9\u0001\u0000\u0000\u0000\u03fc\u03fa\u0001\u0000\u0000\u0000"+
		"\u03fc\u03fb\u0001\u0000\u0000\u0000\u03fdq\u0001\u0000\u0000\u0000\u03fe"+
		"\u03ff\u0005U\u0000\u0000\u03ff\u0400\u0003\u00b8\\\u0000\u0400\u0402"+
		"\u0005\u0084\u0000\u0000\u0401\u0403\u0007\u000e\u0000\u0000\u0402\u0401"+
		"\u0001\u0000\u0000\u0000\u0402\u0403\u0001\u0000\u0000\u0000\u0403\u0405"+
		"\u0001\u0000\u0000\u0000\u0404\u0406\u0007\u000f\u0000\u0000\u0405\u0404"+
		"\u0001\u0000\u0000\u0000\u0405\u0406\u0001\u0000\u0000\u0000\u0406\u0408"+
		"\u0001\u0000\u0000\u0000\u0407\u0409\u0007\u0010\u0000\u0000\u0408\u0407"+
		"\u0001\u0000\u0000\u0000\u0408\u0409\u0001\u0000\u0000\u0000\u0409\u040b"+
		"\u0001\u0000\u0000\u0000\u040a\u040c\u0007\u0011\u0000\u0000\u040b\u040a"+
		"\u0001\u0000\u0000\u0000\u040b\u040c\u0001\u0000\u0000\u0000\u040c\u040e"+
		"\u0001\u0000\u0000\u0000\u040d\u040f\u0005\u0090\u0000\u0000\u040e\u040d"+
		"\u0001\u0000\u0000\u0000\u040e\u040f\u0001\u0000\u0000\u0000\u040f\u0410"+
		"\u0001\u0000\u0000\u0000\u0410\u0411\u0005\u0091\u0000\u0000\u0411\u041f"+
		"\u0003\u0012\t\u0000\u0412\u0413\u0005\u0091\u0000\u0000\u0413\u041d\u0005"+
		"\u000f\u0000\u0000\u0414\u0415\u0005\u0092\u0000\u0000\u0415\u041a\u0003"+
		"\u00b4Z\u0000\u0416\u0417\u0005\u00fb\u0000\u0000\u0417\u0419\u0003\u00b4"+
		"Z\u0000\u0418\u0416\u0001\u0000\u0000\u0000\u0419\u041c\u0001\u0000\u0000"+
		"\u0000\u041a\u0418\u0001\u0000\u0000\u0000\u041a\u041b\u0001\u0000\u0000"+
		"\u0000\u041b\u041e\u0001\u0000\u0000\u0000\u041c\u041a\u0001\u0000\u0000"+
		"\u0000\u041d\u0414\u0001\u0000\u0000\u0000\u041d\u041e\u0001\u0000\u0000"+
		"\u0000\u041e\u0420\u0001\u0000\u0000\u0000\u041f\u0412\u0001\u0000\u0000"+
		"\u0000\u041f\u0420\u0001\u0000\u0000\u0000\u0420s\u0001\u0000\u0000\u0000"+
		"\u0421\u0427\u0005\u0093\u0000\u0000\u0422\u0424\u0005\u0086\u0000\u0000"+
		"\u0423\u0422\u0001\u0000\u0000\u0000\u0423\u0424\u0001\u0000\u0000\u0000"+
		"\u0424\u0425\u0001\u0000\u0000\u0000\u0425\u0428\u0003\u00b8\\\u0000\u0426"+
		"\u0428\u0003\u00ba]\u0000\u0427\u0423\u0001\u0000\u0000\u0000\u0427\u0426"+
		"\u0001\u0000\u0000\u0000\u0428u\u0001\u0000\u0000\u0000\u0429\u042d\u0005"+
		"u\u0000\u0000\u042a\u042b\u0003x<\u0000\u042b\u042c\u0005\u0002\u0000"+
		"\u0000\u042c\u042e\u0001\u0000\u0000\u0000\u042d\u042a\u0001\u0000\u0000"+
		"\u0000\u042d\u042e\u0001\u0000\u0000\u0000\u042e\u0434\u0001\u0000\u0000"+
		"\u0000\u042f\u0431\u0005\u0086\u0000\u0000\u0430\u042f\u0001\u0000\u0000"+
		"\u0000\u0430\u0431\u0001\u0000\u0000\u0000\u0431\u0432\u0001\u0000\u0000"+
		"\u0000\u0432\u0435\u0003\u00b8\\\u0000\u0433\u0435\u0005\u0105\u0000\u0000"+
		"\u0434\u0430\u0001\u0000\u0000\u0000\u0434\u0433\u0001\u0000\u0000\u0000"+
		"\u0435\u043f\u0001\u0000\u0000\u0000\u0436\u0437\u0005\u0012\u0000\u0000"+
		"\u0437\u043c\u0005\u0105\u0000\u0000\u0438\u0439\u0005\u00fb\u0000\u0000"+
		"\u0439\u043b\u0005\u0105\u0000\u0000\u043a\u0438\u0001\u0000\u0000\u0000"+
		"\u043b\u043e\u0001\u0000\u0000\u0000\u043c\u043a\u0001\u0000\u0000\u0000"+
		"\u043c\u043d\u0001\u0000\u0000\u0000\u043d\u0440\u0001\u0000\u0000\u0000"+
		"\u043e\u043c\u0001\u0000\u0000\u0000\u043f\u0436\u0001\u0000\u0000\u0000"+
		"\u043f\u0440\u0001\u0000\u0000\u0000\u0440w\u0001\u0000\u0000\u0000\u0441"+
		"\u044a\u0005v\u0000\u0000\u0442\u044a\u0005\u0094\u0000\u0000\u0443\u044a"+
		"\u0005\u0095\u0000\u0000\u0444\u044a\u0005\u0096\u0000\u0000\u0445\u0446"+
		"\u0005\u0097\u0000\u0000\u0446\u044a\u0007\u0012\u0000\u0000\u0447\u0448"+
		"\u0005\u0098\u0000\u0000\u0448\u044a\u0007\u0012\u0000\u0000\u0449\u0441"+
		"\u0001\u0000\u0000\u0000\u0449\u0442\u0001\u0000\u0000\u0000\u0449\u0443"+
		"\u0001\u0000\u0000\u0000\u0449\u0444\u0001\u0000\u0000\u0000\u0449\u0445"+
		"\u0001\u0000\u0000\u0000\u0449\u0447\u0001\u0000\u0000\u0000\u044ay\u0001"+
		"\u0000\u0000\u0000\u044b\u0451\u0005\u0099\u0000\u0000\u044c\u044e\u0005"+
		"\u0086\u0000\u0000\u044d\u044c\u0001\u0000\u0000\u0000\u044d\u044e\u0001"+
		"\u0000\u0000\u0000\u044e\u044f\u0001\u0000\u0000\u0000\u044f\u0452\u0003"+
		"\u00aeW\u0000\u0450\u0452\u0005\u0105\u0000\u0000\u0451\u044d\u0001\u0000"+
		"\u0000\u0000\u0451\u0450\u0001\u0000\u0000\u0000\u0452{\u0001\u0000\u0000"+
		"\u0000\u0453\u0459\u0005\u009a\u0000\u0000\u0454\u0456\u0005\u0086\u0000"+
		"\u0000\u0455\u0454\u0001\u0000\u0000\u0000\u0455\u0456\u0001\u0000\u0000"+
		"\u0000\u0456\u0457\u0001\u0000\u0000\u0000\u0457\u045a\u0003\u00aeW\u0000"+
		"\u0458\u045a\u0005\u0105\u0000\u0000\u0459\u0455\u0001\u0000\u0000\u0000"+
		"\u0459\u0458\u0001\u0000\u0000\u0000\u045a}\u0001\u0000\u0000\u0000\u045b"+
		"\u0460\u0005d\u0000\u0000\u045c\u045f\u0003\u0084B\u0000\u045d\u045f\u0005"+
		"\u0105\u0000\u0000\u045e\u045c\u0001\u0000\u0000\u0000\u045e\u045d\u0001"+
		"\u0000\u0000\u0000\u045f\u0462\u0001\u0000\u0000\u0000\u0460\u045e\u0001"+
		"\u0000\u0000\u0000\u0460\u0461\u0001\u0000\u0000\u0000\u0461\u007f\u0001"+
		"\u0000\u0000\u0000\u0462\u0460\u0001\u0000\u0000\u0000\u0463\u0464\u0005"+
		"q\u0000\u0000\u0464\u0469\u0003\u0082A\u0000\u0465\u0466\u0005\u00fb\u0000"+
		"\u0000\u0466\u0468\u0003\u0082A\u0000\u0467\u0465\u0001\u0000\u0000\u0000"+
		"\u0468\u046b\u0001\u0000\u0000\u0000\u0469\u0467\u0001\u0000\u0000\u0000"+
		"\u0469\u046a\u0001\u0000\u0000\u0000\u046a\u046c\u0001\u0000\u0000\u0000"+
		"\u046b\u0469\u0001\u0000\u0000\u0000\u046c\u046d\u0003\u0012\t\u0000\u046d"+
		"\u0081\u0001\u0000\u0000\u0000\u046e\u0473\u0003\u00aeW\u0000\u046f\u0470"+
		"\u0005\u00fd\u0000\u0000\u0470\u0471\u0003\u00acV\u0000\u0471\u0472\u0005"+
		"\u00fe\u0000\u0000\u0472\u0474\u0001\u0000\u0000\u0000\u0473\u046f\u0001"+
		"\u0000\u0000\u0000\u0473\u0474\u0001\u0000\u0000\u0000\u0474\u0475\u0001"+
		"\u0000\u0000\u0000\u0475\u0476\u0005V\u0000\u0000\u0476\u0477\u0005\u00fd"+
		"\u0000\u0000\u0477\u0478\u0003\u0012\t\u0000\u0478\u0479\u0005\u00fe\u0000"+
		"\u0000\u0479\u0083\u0001\u0000\u0000\u0000\u047a\u047b\u0006B\uffff\uffff"+
		"\u0000\u047b\u0491\u0003\u008cF\u0000\u047c\u047d\u0007\u0013\u0000\u0000"+
		"\u047d\u0491\u0003\u0084B\u0012\u047e\u0491\u0003\u0086C\u0000\u047f\u0480"+
		"\u0005\u001d\u0000\u0000\u0480\u0491\u0003\u0086C\u0000\u0481\u0482\u0005"+
		"\u001d\u0000\u0000\u0482\u0491\u0003\u0084B\u0005\u0483\u0491\u0003\u00a2"+
		"Q\u0000\u0484\u0486\u0005]\u0000\u0000\u0485\u0487\u0003\u008aE\u0000"+
		"\u0486\u0485\u0001\u0000\u0000\u0000\u0487\u0488\u0001\u0000\u0000\u0000"+
		"\u0488\u0486\u0001\u0000\u0000\u0000\u0488\u0489\u0001\u0000\u0000\u0000"+
		"\u0489\u048c\u0001\u0000\u0000\u0000\u048a\u048b\u0005[\u0000\u0000\u048b"+
		"\u048d\u0003\u0084B\u0000\u048c\u048a\u0001\u0000\u0000\u0000\u048c\u048d"+
		"\u0001\u0000\u0000\u0000\u048d\u048e\u0001\u0000\u0000\u0000\u048e\u048f"+
		"\u0005Y\u0000\u0000\u048f\u0491\u0001\u0000\u0000\u0000\u0490\u047a\u0001"+
		"\u0000\u0000\u0000\u0490\u047c\u0001\u0000\u0000\u0000\u0490\u047e\u0001"+
		"\u0000\u0000\u0000\u0490\u047f\u0001\u0000\u0000\u0000\u0490\u0481\u0001"+
		"\u0000\u0000\u0000\u0490\u0483\u0001\u0000\u0000\u0000\u0490\u0484\u0001"+
		"\u0000\u0000\u0000\u0491\u04ce\u0001\u0000\u0000\u0000\u0492\u0493\n\u0011"+
		"\u0000\u0000\u0493\u0494\u0007\u0014\u0000\u0000\u0494\u04cd\u0003\u0084"+
		"B\u0012\u0495\u0496\n\u0010\u0000\u0000\u0496\u0497\u0007\u0013\u0000"+
		"\u0000\u0497\u04cd\u0003\u0084B\u0011\u0498\u0499\n\u000f\u0000\u0000"+
		"\u0499\u049a\u0007\u0014\u0000\u0000\u049a\u04cd\u0003\u0084B\u0010\u049b"+
		"\u049c\n\u000e\u0000\u0000\u049c\u049d\u0007\u0013\u0000\u0000\u049d\u04cd"+
		"\u0003\u0084B\u000f\u049e\u049f\n\r\u0000\u0000\u049f\u04a0\u0007\u0015"+
		"\u0000\u0000\u04a0\u04cd\u0003\u0084B\u000e\u04a1\u04a2\n\f\u0000\u0000"+
		"\u04a2\u04a3\u0005\u001d\u0000\u0000\u04a3\u04a4\u0005#\u0000\u0000\u04a4"+
		"\u04cd\u0003\u0084B\r\u04a5\u04a6\n\u000b\u0000\u0000\u04a6\u04a7\u0005"+
		"#\u0000\u0000\u04a7\u04cd\u0003\u0084B\f\u04a8\u04aa\n\t\u0000\u0000\u04a9"+
		"\u04ab\u0005\u001d\u0000\u0000\u04aa\u04a9\u0001\u0000\u0000\u0000\u04aa"+
		"\u04ab\u0001\u0000\u0000\u0000\u04ab\u04ac\u0001\u0000\u0000\u0000\u04ac"+
		"\u04ad\u0005$\u0000\u0000\u04ad\u04ae\u0003\u0084B\u0000\u04ae\u04af\u0005"+
		"\u001b\u0000\u0000\u04af\u04b0\u0003\u0084B\n\u04b0\u04cd\u0001\u0000"+
		"\u0000\u0000\u04b1\u04b2\n\u0003\u0000\u0000\u04b2\u04b3\u0005\u001b\u0000"+
		"\u0000\u04b3\u04cd\u0003\u0084B\u0004\u04b4\u04b5\n\u0002\u0000\u0000"+
		"\u04b5\u04b6\u0005\u001c\u0000\u0000\u04b6\u04cd\u0003\u0084B\u0003\u04b7"+
		"\u04b9\n\n\u0000\u0000\u04b8\u04ba\u0005\u001d\u0000\u0000\u04b9\u04b8"+
		"\u0001\u0000\u0000\u0000\u04b9\u04ba\u0001\u0000\u0000\u0000\u04ba\u04bb"+
		"\u0001\u0000\u0000\u0000\u04bb\u04c4\u0005\"\u0000\u0000\u04bc\u04bf\u0005"+
		"\u00fd\u0000\u0000\u04bd\u04c0\u0003\u00aaU\u0000\u04be\u04c0\u0003\u0012"+
		"\t\u0000\u04bf\u04bd\u0001\u0000\u0000\u0000\u04bf\u04be\u0001\u0000\u0000"+
		"\u0000\u04c0\u04c1\u0001\u0000\u0000\u0000\u04c1\u04c2\u0005\u00fe\u0000"+
		"\u0000\u04c2\u04c5\u0001\u0000\u0000\u0000\u04c3\u04c5\u0003\u0084B\u0000"+
		"\u04c4\u04bc\u0001\u0000\u0000\u0000\u04c4\u04c3\u0001\u0000\u0000\u0000"+
		"\u04c5\u04cd\u0001\u0000\u0000\u0000\u04c6\u04c7\n\b\u0000\u0000\u04c7"+
		"\u04c9\u0005!\u0000\u0000\u04c8\u04ca\u0005\u001d\u0000\u0000\u04c9\u04c8"+
		"\u0001\u0000\u0000\u0000\u04c9\u04ca\u0001\u0000\u0000\u0000\u04ca\u04cb"+
		"\u0001\u0000\u0000\u0000\u04cb\u04cd\u0005\u001e\u0000\u0000\u04cc\u0492"+
		"\u0001\u0000\u0000\u0000\u04cc\u0495\u0001\u0000\u0000\u0000\u04cc\u0498"+
		"\u0001\u0000\u0000\u0000\u04cc\u049b\u0001\u0000\u0000\u0000\u04cc\u049e"+
		"\u0001\u0000\u0000\u0000\u04cc\u04a1\u0001\u0000\u0000\u0000\u04cc\u04a5"+
		"\u0001\u0000\u0000\u0000\u04cc\u04a8\u0001\u0000\u0000\u0000\u04cc\u04b1"+
		"\u0001\u0000\u0000\u0000\u04cc\u04b4\u0001\u0000\u0000\u0000\u04cc\u04b7"+
		"\u0001\u0000\u0000\u0000\u04cc\u04c6\u0001\u0000\u0000\u0000\u04cd\u04d0"+
		"\u0001\u0000\u0000\u0000\u04ce\u04cc\u0001\u0000\u0000\u0000\u04ce\u04cf"+
		"\u0001\u0000\u0000\u0000\u04cf\u0085\u0001\u0000\u0000\u0000\u04d0\u04ce"+
		"\u0001\u0000\u0000\u0000\u04d1\u04d2\u0005%\u0000\u0000\u04d2\u04d7\u0003"+
		"\u0088D\u0000\u04d3\u04d4\u0005\u001d\u0000\u0000\u04d4\u04d5\u0005%\u0000"+
		"\u0000\u04d5\u04d7\u0003\u0088D\u0000\u04d6\u04d1\u0001\u0000\u0000\u0000"+
		"\u04d6\u04d3\u0001\u0000\u0000\u0000\u04d7\u0087\u0001\u0000\u0000\u0000"+
		"\u04d8\u04d9\u0005\u00fd\u0000\u0000\u04d9\u04da\u0003\u0012\t\u0000\u04da"+
		"\u04db\u0005\u00fe\u0000\u0000\u04db\u0089\u0001\u0000\u0000\u0000\u04dc"+
		"\u04dd\u0005^\u0000\u0000\u04dd\u04de\u0003\u0084B\u0000\u04de\u04df\u0005"+
		"_\u0000\u0000\u04df\u04e0\u0003\u0084B\u0000\u04e0\u008b\u0001\u0000\u0000"+
		"\u0000\u04e1\u04ec\u0003\u00b4Z\u0000\u04e2\u04ec\u0003\u00b0X\u0000\u04e3"+
		"\u04ec\u0003f3\u0000\u04e4\u04ec\u0005\u0105\u0000\u0000\u04e5\u04ec\u0003"+
		"\u009eO\u0000\u04e6\u04e7\u0005\u00fd\u0000\u0000\u04e7\u04e8\u0003\u0084"+
		"B\u0000\u04e8\u04e9\u0005\u00fe\u0000\u0000\u04e9\u04ec\u0001\u0000\u0000"+
		"\u0000\u04ea\u04ec\u0003\u00a2Q\u0000\u04eb\u04e1\u0001\u0000\u0000\u0000"+
		"\u04eb\u04e2\u0001\u0000\u0000\u0000\u04eb\u04e3\u0001\u0000\u0000\u0000"+
		"\u04eb\u04e4\u0001\u0000\u0000\u0000\u04eb\u04e5\u0001\u0000\u0000\u0000"+
		"\u04eb\u04e6\u0001\u0000\u0000\u0000\u04eb\u04ea\u0001\u0000\u0000\u0000"+
		"\u04ec\u008d\u0001\u0000\u0000\u0000\u04ed\u04f2\u0003\u00aeW\u0000\u04ee"+
		"\u04f0\u0005V\u0000\u0000\u04ef\u04ee\u0001\u0000\u0000\u0000\u04ef\u04f0"+
		"\u0001\u0000\u0000\u0000\u04f0\u04f1\u0001\u0000\u0000\u0000\u04f1\u04f3"+
		"\u0003\u00b6[\u0000\u04f2\u04ef\u0001\u0000\u0000\u0000\u04f2\u04f3\u0001"+
		"\u0000\u0000\u0000\u04f3\u04fd\u0001\u0000\u0000\u0000\u04f4\u04f5\u0005"+
		"\u00fd\u0000\u0000\u04f5\u04f6\u0003\u0012\t\u0000\u04f6\u04f8\u0005\u00fe"+
		"\u0000\u0000\u04f7\u04f9\u0005V\u0000\u0000\u04f8\u04f7\u0001\u0000\u0000"+
		"\u0000\u04f8\u04f9\u0001\u0000\u0000\u0000\u04f9\u04fa\u0001\u0000\u0000"+
		"\u0000\u04fa\u04fb\u0003\u00b6[\u0000\u04fb\u04fd\u0001\u0000\u0000\u0000"+
		"\u04fc\u04ed\u0001\u0000\u0000\u0000\u04fc\u04f4\u0001\u0000\u0000\u0000"+
		"\u04fd\u008f\u0001\u0000\u0000\u0000\u04fe\u04ff\u0005\u0019\u0000\u0000"+
		"\u04ff\u0500\u0005\u0013\u0000\u0000\u0500\u050e\u0003\u008eG\u0000\u0501"+
		"\u0507\u0005\u0014\u0000\u0000\u0502\u0504\u0007\u0016\u0000\u0000\u0503"+
		"\u0505\u0005\u0018\u0000\u0000\u0504\u0503\u0001\u0000\u0000\u0000\u0504"+
		"\u0505\u0001\u0000\u0000\u0000\u0505\u0507\u0001\u0000\u0000\u0000\u0506"+
		"\u0501\u0001\u0000\u0000\u0000\u0506\u0502\u0001\u0000\u0000\u0000\u0506"+
		"\u0507\u0001\u0000\u0000\u0000\u0507\u0508\u0001\u0000\u0000\u0000\u0508"+
		"\u0509\u0005\u0013\u0000\u0000\u0509\u050a\u0003\u008eG\u0000\u050a\u050b"+
		"\u0005\u001a\u0000\u0000\u050b\u050c\u0003\u0084B\u0000\u050c\u050e\u0001"+
		"\u0000\u0000\u0000\u050d\u04fe\u0001\u0000\u0000\u0000\u050d\u0506\u0001"+
		"\u0000\u0000\u0000\u050e\u0091\u0001\u0000\u0000\u0000\u050f\u0510\u0005"+
		"\u0004\u0000\u0000\u0510\u0511\u0005\u0005\u0000\u0000\u0511\u0516\u0003"+
		"\u0094J\u0000\u0512\u0513\u0005\u00fb\u0000\u0000\u0513\u0515\u0003\u0094"+
		"J\u0000\u0514\u0512\u0001\u0000\u0000\u0000\u0515\u0518\u0001\u0000\u0000"+
		"\u0000\u0516\u0514\u0001\u0000\u0000\u0000\u0516\u0517\u0001\u0000\u0000"+
		"\u0000\u0517\u0093\u0001\u0000\u0000\u0000\u0518\u0516\u0001\u0000\u0000"+
		"\u0000\u0519\u052b\u0003\u0084B\u0000\u051a\u051b\u0005\u009c\u0000\u0000"+
		"\u051b\u051c\u0005\u00fd\u0000\u0000\u051c\u051d\u0003\u00aaU\u0000\u051d"+
		"\u051e\u0005\u00fe\u0000\u0000\u051e\u052b\u0001\u0000\u0000\u0000\u051f"+
		"\u0520\u0005\u009d\u0000\u0000\u0520\u0521\u0005\u00fd\u0000\u0000\u0521"+
		"\u0522\u0003\u00aaU\u0000\u0522\u0523\u0005\u00fe\u0000\u0000\u0523\u052b"+
		"\u0001\u0000\u0000\u0000\u0524\u0525\u0005\u009e\u0000\u0000\u0525\u0526"+
		"\u0005\u009f\u0000\u0000\u0526\u0527\u0005\u00fd\u0000\u0000\u0527\u0528"+
		"\u0003\u0096K\u0000\u0528\u0529\u0005\u00fe\u0000\u0000\u0529\u052b\u0001"+
		"\u0000\u0000\u0000\u052a\u0519\u0001\u0000\u0000\u0000\u052a\u051a\u0001"+
		"\u0000\u0000\u0000\u052a\u051f\u0001\u0000\u0000\u0000\u052a\u0524\u0001"+
		"\u0000\u0000\u0000\u052b\u0095\u0001\u0000\u0000\u0000\u052c\u0531\u0003"+
		"\u0098L\u0000\u052d\u052e\u0005\u00fb\u0000\u0000\u052e\u0530\u0003\u0098"+
		"L\u0000\u052f\u052d\u0001\u0000\u0000\u0000\u0530\u0533\u0001\u0000\u0000"+
		"\u0000\u0531\u052f\u0001\u0000\u0000\u0000\u0531\u0532\u0001\u0000\u0000"+
		"\u0000\u0532\u0097\u0001\u0000\u0000\u0000\u0533\u0531\u0001\u0000\u0000"+
		"\u0000\u0534\u053b\u0003\u0084B\u0000\u0535\u0537\u0005\u00fd\u0000\u0000"+
		"\u0536\u0538\u0003\u00aaU\u0000\u0537\u0536\u0001\u0000\u0000\u0000\u0537"+
		"\u0538\u0001\u0000\u0000\u0000\u0538\u0539\u0001\u0000\u0000\u0000\u0539"+
		"\u053b\u0005\u00fe\u0000\u0000\u053a\u0534\u0001\u0000\u0000\u0000\u053a"+
		"\u0535\u0001\u0000\u0000\u0000\u053b\u0099\u0001\u0000\u0000\u0000\u053c"+
		"\u053d\u0005\u0007\u0000\u0000\u053d\u053e\u0005\u0005\u0000\u0000\u053e"+
		"\u0543\u0003\u009cN\u0000\u053f\u0540\u0005\u00fb\u0000\u0000\u0540\u0542"+
		"\u0003\u009cN\u0000\u0541\u053f\u0001\u0000\u0000\u0000\u0542\u0545\u0001"+
		"\u0000\u0000\u0000\u0543\u0541\u0001\u0000\u0000\u0000\u0543\u0544\u0001"+
		"\u0000\u0000\u0000\u0544\u009b\u0001\u0000\u0000\u0000\u0545\u0543\u0001"+
		"\u0000\u0000\u0000\u0546\u0548\u0003\u0084B\u0000\u0547\u0549\u0007\n"+
		"\u0000\u0000\u0548\u0547\u0001\u0000\u0000\u0000\u0548\u0549\u0001\u0000"+
		"\u0000\u0000\u0549\u009d\u0001\u0000\u0000\u0000\u054a\u054b\u0003\u00a0"+
		"P\u0000\u054b\u054e\u0005\u00fd\u0000\u0000\u054c\u054f\u0005\u00f8\u0000"+
		"\u0000\u054d\u054f\u0003\u00aaU\u0000\u054e\u054c\u0001\u0000\u0000\u0000"+
		"\u054e\u054d\u0001\u0000\u0000\u0000\u054e\u054f\u0001\u0000\u0000\u0000"+
		"\u054f\u0550\u0001\u0000\u0000\u0000\u0550\u0551\u0005\u00fe\u0000\u0000"+
		"\u0551\u009f\u0001\u0000\u0000\u0000\u0552\u0553\u0007\u0017\u0000\u0000"+
		"\u0553\u00a1\u0001\u0000\u0000\u0000\u0554\u0555\u0005\u00fd\u0000\u0000"+
		"\u0555\u0556\u0003\u0012\t\u0000\u0556\u0557\u0005\u00fe\u0000\u0000\u0557"+
		"\u00a3\u0001\u0000\u0000\u0000\u0558\u0559\u0005\u0006\u0000\u0000\u0559"+
		"\u055a\u0003\u0084B\u0000\u055a\u00a5\u0001\u0000\u0000\u0000\u055b\u055c"+
		"\u0005\u0003\u0000\u0000\u055c\u055d\u0003\u0084B\u0000\u055d\u00a7\u0001"+
		"\u0000\u0000\u0000\u055e\u055f\u0003\u00b4Z\u0000\u055f\u0560\u0007\u0018"+
		"\u0000\u0000\u0560\u0561\u0003\u0084B\u0000\u0561\u00a9\u0001\u0000\u0000"+
		"\u0000\u0562\u0567\u0003\u0084B\u0000\u0563\u0564\u0005\u00fb\u0000\u0000"+
		"\u0564\u0566\u0003\u0084B\u0000\u0565\u0563\u0001\u0000\u0000\u0000\u0566"+
		"\u0569\u0001\u0000\u0000\u0000\u0567\u0565\u0001\u0000\u0000\u0000\u0567"+
		"\u0568\u0001\u0000\u0000\u0000\u0568\u00ab\u0001\u0000\u0000\u0000\u0569"+
		"\u0567\u0001\u0000\u0000\u0000\u056a\u056f\u0003\u00aeW\u0000\u056b\u056c"+
		"\u0005\u00fb\u0000\u0000\u056c\u056e\u0003\u00aeW\u0000\u056d\u056b\u0001"+
		"\u0000\u0000\u0000\u056e\u0571\u0001\u0000\u0000\u0000\u056f\u056d\u0001"+
		"\u0000\u0000\u0000\u056f\u0570\u0001\u0000\u0000\u0000\u0570\u00ad\u0001"+
		"\u0000\u0000\u0000\u0571\u056f\u0001\u0000\u0000\u0000\u0572\u0575\u0003"+
		"f3\u0000\u0573\u0574\u0005\u00ff\u0000\u0000\u0574\u0576\u0003f3\u0000"+
		"\u0575\u0573\u0001\u0000\u0000\u0000\u0575\u0576\u0001\u0000\u0000\u0000"+
		"\u0576\u00af\u0001\u0000\u0000\u0000\u0577\u0578\u0007\u0019\u0000\u0000"+
		"\u0578\u00b1\u0001\u0000\u0000\u0000\u0579\u057a\u0003\u00aeW\u0000\u057a"+
		"\u00b3\u0001\u0000\u0000\u0000\u057b\u057c\u0003\u00aeW\u0000\u057c\u00b5"+
		"\u0001\u0000\u0000\u0000\u057d\u057e\u0005\u0106\u0000\u0000\u057e\u00b7"+
		"\u0001\u0000\u0000\u0000\u057f\u0580\u0005\u0106\u0000\u0000\u0580\u00b9"+
		"\u0001\u0000\u0000\u0000\u0581\u0582\u0005\u0105\u0000\u0000\u0582\u00bb"+
		"\u0001\u0000\u0000\u0000\u0583\u0586\u0003f3\u0000\u0584\u0586\u0005\u00ec"+
		"\u0000\u0000\u0585\u0583\u0001\u0000\u0000\u0000\u0585\u0584\u0001\u0000"+
		"\u0000\u0000\u0586\u00bd\u0001\u0000\u0000\u0000\u00b9\u00c0\u00c4\u00c6"+
		"\u00c8\u00d9\u00e5\u00e9\u00ee\u00f2\u00fd\u0104\u010a\u010e\u0112\u011a"+
		"\u011d\u0120\u0123\u0126\u0129\u0131\u0134\u0138\u013b\u0141\u0145\u014c"+
		"\u0153\u015a\u0169\u0171\u0174\u0177\u017b\u017f\u0187\u0190\u0199\u019f"+
		"\u01a6\u01ad\u01b2\u01b4\u01bd\u01c2\u01c7\u01cb\u01d2\u01da\u01e1\u01e5"+
		"\u01ed\u01f2\u01f6\u01fd\u0200\u020d\u021b\u021f\u0224\u022b\u0232\u0235"+
		"\u0244\u0249\u024e\u0250\u025b\u0261\u0265\u0270\u0277\u027b\u0281\u0285"+
		"\u028f\u0292\u029a\u029e\u02a5\u02a8\u02b4\u02bb\u02cb\u02d1\u02d5\u02dd"+
		"\u02ea\u02f0\u0301\u0305\u030b\u030f\u0319\u031c\u0324\u0328\u0333\u0339"+
		"\u033e\u0346\u034d\u0355\u0362\u036e\u0373\u0378\u037d\u0384\u038b\u0390"+
		"\u0395\u0398\u039c\u03a6\u03ab\u03b7\u03ba\u03bd\u03bf\u03c7\u03ca\u03d0"+
		"\u03d9\u03e1\u03eb\u03ee\u03f1\u03f7\u03fc\u0402\u0405\u0408\u040b\u040e"+
		"\u041a\u041d\u041f\u0423\u0427\u042d\u0430\u0434\u043c\u043f\u0449\u044d"+
		"\u0451\u0455\u0459\u045e\u0460\u0469\u0473\u0488\u048c\u0490\u04aa\u04b9"+
		"\u04bf\u04c4\u04c9\u04cc\u04ce\u04d6\u04eb\u04ef\u04f2\u04f8\u04fc\u0504"+
		"\u0506\u050d\u0516\u052a\u0531\u0537\u053a\u0543\u0548\u054e\u0567\u056f"+
		"\u0575\u0585";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}