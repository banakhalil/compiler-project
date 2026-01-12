// Generated from C:/Users/batoo/IdeaProjects/compiler-project/src/SQLGrammarParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLGrammarParser}.
 */
public interface SQLGrammarParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#sql_script}.
	 * @param ctx the parse tree
	 */
	void enterSql_script(SQLGrammarParser.Sql_scriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#sql_script}.
	 * @param ctx the parse tree
	 */
	void exitSql_script(SQLGrammarParser.Sql_scriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SQLGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SQLGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(SQLGrammarParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(SQLGrammarParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(SQLGrammarParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(SQLGrammarParser.Block_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_statement(SQLGrammarParser.Declaration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_statement(SQLGrammarParser.Declaration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(SQLGrammarParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(SQLGrammarParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#dml_statement}.
	 * @param ctx the parse tree
	 */
	void enterDml_statement(SQLGrammarParser.Dml_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#dml_statement}.
	 * @param ctx the parse tree
	 */
	void exitDml_statement(SQLGrammarParser.Dml_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(SQLGrammarParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(SQLGrammarParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(SQLGrammarParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(SQLGrammarParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#select_element}.
	 * @param ctx the parse tree
	 */
	void enterSelect_element(SQLGrammarParser.Select_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#select_element}.
	 * @param ctx the parse tree
	 */
	void exitSelect_element(SQLGrammarParser.Select_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement(SQLGrammarParser.Insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement(SQLGrammarParser.Insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(SQLGrammarParser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(SQLGrammarParser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(SQLGrammarParser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(SQLGrammarParser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#ddlStatement}.
	 * @param ctx the parse tree
	 */
	void enterDdlStatement(SQLGrammarParser.DdlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#ddlStatement}.
	 * @param ctx the parse tree
	 */
	void exitDdlStatement(SQLGrammarParser.DdlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#createStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateStatement(SQLGrammarParser.CreateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#createStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateStatement(SQLGrammarParser.CreateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#alterStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterStatement(SQLGrammarParser.AlterStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#alterStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterStatement(SQLGrammarParser.AlterStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#dropStatement}.
	 * @param ctx the parse tree
	 */
	void enterDropStatement(SQLGrammarParser.DropStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#dropStatement}.
	 * @param ctx the parse tree
	 */
	void exitDropStatement(SQLGrammarParser.DropStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#truncateStatement}.
	 * @param ctx the parse tree
	 */
	void enterTruncateStatement(SQLGrammarParser.TruncateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#truncateStatement}.
	 * @param ctx the parse tree
	 */
	void exitTruncateStatement(SQLGrammarParser.TruncateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#otherStatements}.
	 * @param ctx the parse tree
	 */
	void enterOtherStatements(SQLGrammarParser.OtherStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#otherStatements}.
	 * @param ctx the parse tree
	 */
	void exitOtherStatements(SQLGrammarParser.OtherStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(SQLGrammarParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(SQLGrammarParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void enterTableElement(SQLGrammarParser.TableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void exitTableElement(SQLGrammarParser.TableElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(SQLGrammarParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(SQLGrammarParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(SQLGrammarParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(SQLGrammarParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterColumnConstraint(SQLGrammarParser.ColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitColumnConstraint(SQLGrammarParser.ColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(SQLGrammarParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(SQLGrammarParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(SQLGrammarParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(SQLGrammarParser.CreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#createSchema}.
	 * @param ctx the parse tree
	 */
	void enterCreateSchema(SQLGrammarParser.CreateSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#createSchema}.
	 * @param ctx the parse tree
	 */
	void exitCreateSchema(SQLGrammarParser.CreateSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#createProcedure}.
	 * @param ctx the parse tree
	 */
	void enterCreateProcedure(SQLGrammarParser.CreateProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#createProcedure}.
	 * @param ctx the parse tree
	 */
	void exitCreateProcedure(SQLGrammarParser.CreateProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(SQLGrammarParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(SQLGrammarParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndex(SQLGrammarParser.CreateIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndex(SQLGrammarParser.CreateIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#indexColumn}.
	 * @param ctx the parse tree
	 */
	void enterIndexColumn(SQLGrammarParser.IndexColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#indexColumn}.
	 * @param ctx the parse tree
	 */
	void exitIndexColumn(SQLGrammarParser.IndexColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#createView}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(SQLGrammarParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#createView}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(SQLGrammarParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTable(SQLGrammarParser.AlterTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTable(SQLGrammarParser.AlterTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#alterTableAction}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableAction(SQLGrammarParser.AlterTableActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#alterTableAction}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableAction(SQLGrammarParser.AlterTableActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void enterAlterDatabase(SQLGrammarParser.AlterDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void exitAlterDatabase(SQLGrammarParser.AlterDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#alterIndex}.
	 * @param ctx the parse tree
	 */
	void enterAlterIndex(SQLGrammarParser.AlterIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#alterIndex}.
	 * @param ctx the parse tree
	 */
	void exitAlterIndex(SQLGrammarParser.AlterIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#alterView}.
	 * @param ctx the parse tree
	 */
	void enterAlterView(SQLGrammarParser.AlterViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#alterView}.
	 * @param ctx the parse tree
	 */
	void exitAlterView(SQLGrammarParser.AlterViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#alterProcedure}.
	 * @param ctx the parse tree
	 */
	void enterAlterProcedure(SQLGrammarParser.AlterProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#alterProcedure}.
	 * @param ctx the parse tree
	 */
	void exitAlterProcedure(SQLGrammarParser.AlterProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#alterFunction}.
	 * @param ctx the parse tree
	 */
	void enterAlterFunction(SQLGrammarParser.AlterFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#alterFunction}.
	 * @param ctx the parse tree
	 */
	void exitAlterFunction(SQLGrammarParser.AlterFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#alterSchema}.
	 * @param ctx the parse tree
	 */
	void enterAlterSchema(SQLGrammarParser.AlterSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#alterSchema}.
	 * @param ctx the parse tree
	 */
	void exitAlterSchema(SQLGrammarParser.AlterSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTableConstraint(SQLGrammarParser.TableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTableConstraint(SQLGrammarParser.TableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(SQLGrammarParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(SQLGrammarParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(SQLGrammarParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(SQLGrammarParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#fileGroup}.
	 * @param ctx the parse tree
	 */
	void enterFileGroup(SQLGrammarParser.FileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#fileGroup}.
	 * @param ctx the parse tree
	 */
	void exitFileGroup(SQLGrammarParser.FileGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(SQLGrammarParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(SQLGrammarParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(SQLGrammarParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(SQLGrammarParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#columnList}.
	 * @param ctx the parse tree
	 */
	void enterColumnList(SQLGrammarParser.ColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#columnList}.
	 * @param ctx the parse tree
	 */
	void exitColumnList(SQLGrammarParser.ColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SQLGrammarParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SQLGrammarParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#anyKeywordAsIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterAnyKeywordAsIdentifier(SQLGrammarParser.AnyKeywordAsIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#anyKeywordAsIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitAnyKeywordAsIdentifier(SQLGrammarParser.AnyKeywordAsIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#fullIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFullIdentifier(SQLGrammarParser.FullIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#fullIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFullIdentifier(SQLGrammarParser.FullIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#valueList}.
	 * @param ctx the parse tree
	 */
	void enterValueList(SQLGrammarParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#valueList}.
	 * @param ctx the parse tree
	 */
	void exitValueList(SQLGrammarParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SQLGrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SQLGrammarParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#cursor_statement}.
	 * @param ctx the parse tree
	 */
	void enterCursor_statement(SQLGrammarParser.Cursor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#cursor_statement}.
	 * @param ctx the parse tree
	 */
	void exitCursor_statement(SQLGrammarParser.Cursor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#declare_cursor}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_cursor(SQLGrammarParser.Declare_cursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#declare_cursor}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_cursor(SQLGrammarParser.Declare_cursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#open_cursor}.
	 * @param ctx the parse tree
	 */
	void enterOpen_cursor(SQLGrammarParser.Open_cursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#open_cursor}.
	 * @param ctx the parse tree
	 */
	void exitOpen_cursor(SQLGrammarParser.Open_cursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#fetch_statement}.
	 * @param ctx the parse tree
	 */
	void enterFetch_statement(SQLGrammarParser.Fetch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#fetch_statement}.
	 * @param ctx the parse tree
	 */
	void exitFetch_statement(SQLGrammarParser.Fetch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#fetch_direction}.
	 * @param ctx the parse tree
	 */
	void enterFetch_direction(SQLGrammarParser.Fetch_directionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#fetch_direction}.
	 * @param ctx the parse tree
	 */
	void exitFetch_direction(SQLGrammarParser.Fetch_directionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#close_cursor}.
	 * @param ctx the parse tree
	 */
	void enterClose_cursor(SQLGrammarParser.Close_cursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#close_cursor}.
	 * @param ctx the parse tree
	 */
	void exitClose_cursor(SQLGrammarParser.Close_cursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#deallocate_cursor}.
	 * @param ctx the parse tree
	 */
	void enterDeallocate_cursor(SQLGrammarParser.Deallocate_cursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#deallocate_cursor}.
	 * @param ctx the parse tree
	 */
	void exitDeallocate_cursor(SQLGrammarParser.Deallocate_cursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(SQLGrammarParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(SQLGrammarParser.Print_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(SQLGrammarParser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(SQLGrammarParser.With_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(SQLGrammarParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(SQLGrammarParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SQLGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SQLGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#when_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhen_clause(SQLGrammarParser.When_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#when_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhen_clause(SQLGrammarParser.When_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(SQLGrammarParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(SQLGrammarParser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#table_source}.
	 * @param ctx the parse tree
	 */
	void enterTable_source(SQLGrammarParser.Table_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#table_source}.
	 * @param ctx the parse tree
	 */
	void exitTable_source(SQLGrammarParser.Table_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(SQLGrammarParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(SQLGrammarParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_clause(SQLGrammarParser.Group_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_clause(SQLGrammarParser.Group_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#group_by_item}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_item(SQLGrammarParser.Group_by_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#group_by_item}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_item(SQLGrammarParser.Group_by_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#grouping_set_list}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_set_list(SQLGrammarParser.Grouping_set_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#grouping_set_list}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_set_list(SQLGrammarParser.Grouping_set_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#grouping_set}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_set(SQLGrammarParser.Grouping_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#grouping_set}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_set(SQLGrammarParser.Grouping_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(SQLGrammarParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(SQLGrammarParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#order_by_expression}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_expression(SQLGrammarParser.Order_by_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#order_by_expression}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_expression(SQLGrammarParser.Order_by_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(SQLGrammarParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(SQLGrammarParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#scalar_subquery}.
	 * @param ctx the parse tree
	 */
	void enterScalar_subquery(SQLGrammarParser.Scalar_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#scalar_subquery}.
	 * @param ctx the parse tree
	 */
	void exitScalar_subquery(SQLGrammarParser.Scalar_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(SQLGrammarParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(SQLGrammarParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(SQLGrammarParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(SQLGrammarParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SQLGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SQLGrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(SQLGrammarParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(SQLGrammarParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#column_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_list(SQLGrammarParser.Column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#column_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_list(SQLGrammarParser.Column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#identifier_ref}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_ref(SQLGrammarParser.Identifier_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#identifier_ref}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_ref(SQLGrammarParser.Identifier_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(SQLGrammarParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(SQLGrammarParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(SQLGrammarParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(SQLGrammarParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(SQLGrammarParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(SQLGrammarParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(SQLGrammarParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(SQLGrammarParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void enterCursor_name(SQLGrammarParser.Cursor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void exitCursor_name(SQLGrammarParser.Cursor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGrammarParser#cursor_variable_name}.
	 * @param ctx the parse tree
	 */
	void enterCursor_variable_name(SQLGrammarParser.Cursor_variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGrammarParser#cursor_variable_name}.
	 * @param ctx the parse tree
	 */
	void exitCursor_variable_name(SQLGrammarParser.Cursor_variable_nameContext ctx);
}