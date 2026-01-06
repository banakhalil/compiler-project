// Generated from C:/Users/Lenovo/Documents/GitHub/compiler-project/src/SQLGrammarParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLGrammarParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#sql_script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_script(SQLGrammarParser.Sql_scriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SQLGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#dml_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_statement(SQLGrammarParser.Dml_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(SQLGrammarParser.Select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(SQLGrammarParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#select_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_element(SQLGrammarParser.Select_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#insert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_statement(SQLGrammarParser.Insert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#update_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statement(SQLGrammarParser.Update_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#delete_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statement(SQLGrammarParser.Delete_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#cursor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_statement(SQLGrammarParser.Cursor_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#declare_cursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_cursor(SQLGrammarParser.Declare_cursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#open_cursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_cursor(SQLGrammarParser.Open_cursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#fetch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_statement(SQLGrammarParser.Fetch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#fetch_direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_direction(SQLGrammarParser.Fetch_directionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#close_cursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_cursor(SQLGrammarParser.Close_cursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#deallocate_cursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeallocate_cursor(SQLGrammarParser.Deallocate_cursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statement(SQLGrammarParser.Print_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_clause(SQLGrammarParser.With_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(SQLGrammarParser.Common_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SQLGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#when_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen_clause(SQLGrammarParser.When_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(SQLGrammarParser.Primary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#table_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_source(SQLGrammarParser.Table_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(SQLGrammarParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#group_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_clause(SQLGrammarParser.Group_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#group_by_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_item(SQLGrammarParser.Group_by_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#grouping_set_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_set_list(SQLGrammarParser.Grouping_set_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#grouping_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_set(SQLGrammarParser.Grouping_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(SQLGrammarParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#order_by_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_expression(SQLGrammarParser.Order_by_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(SQLGrammarParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#scalar_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_subquery(SQLGrammarParser.Scalar_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(SQLGrammarParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(SQLGrammarParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SQLGrammarParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(SQLGrammarParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_list(SQLGrammarParser.Column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#identifier_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_ref(SQLGrammarParser.Identifier_refContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(SQLGrammarParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(SQLGrammarParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SQLGrammarParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(SQLGrammarParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#cursor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_name(SQLGrammarParser.Cursor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLGrammarParser#cursor_variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_variable_name(SQLGrammarParser.Cursor_variable_nameContext ctx);
}