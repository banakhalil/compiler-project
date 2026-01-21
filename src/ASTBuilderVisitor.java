
import org.antlr.v4.runtime.Token;
import sql.*;
import java.util.ArrayList;
import java.util.List;

public class ASTBuilderVisitor extends SQLGrammarParserBaseVisitor<ASTNode> {

    public List<String> semanticsErrors = new ArrayList<>();
// bana
    @Override
    public ASTNode visitUse_statement(SQLGrammarParser.Use_statementContext ctx) {
        ASTNode identifierNode = visit(ctx.identifier());
        String databaseName;
        // Extract the string value from the identifier
        if (identifierNode instanceof Identifier) {
            Identifier id = (Identifier) identifierNode;
            databaseName = id.getName();
        } else {
            databaseName = ctx.identifier().getText();
        }
        // Return leaf node with primitive string value
        return new UseStatement(databaseName);
    }

    @Override
    public ASTNode visitIdentifier(SQLGrammarParser.IdentifierContext ctx) {
        String name;
        String type;
        Token token = null;
        if (ctx.IDENTIFIER() != null) {
            token = ctx.IDENTIFIER().getSymbol();
            name = ctx.IDENTIFIER().getText();
            type = "REGULAR";
        } else if (ctx.DELIMITED_IDENTIFIER_BRACKET() != null) {
            token = ctx.DELIMITED_IDENTIFIER_BRACKET().getSymbol();
            name = ctx.DELIMITED_IDENTIFIER_BRACKET().getText();
            name = name.substring(1, name.length() - 1);
            type = "BRACKET";
        } else if (ctx.DELIMITED_IDENTIFIER_QUOTE() != null) {
            token = ctx.DELIMITED_IDENTIFIER_QUOTE().getSymbol();
            name = ctx.DELIMITED_IDENTIFIER_QUOTE().getText();
            name = name.substring(1, name.length() - 1);
            type = "QUOTE";
        } else if (ctx.anyKeywordAsIdentifier() != null) {
            name = ctx.anyKeywordAsIdentifier().getText();
            type = "KEYWORD";
        } else {
            name = ctx.getText();
            type = "REGULAR";
        }

        return new Identifier(name, type);
    }

    @Override
    public ASTNode visitReturnStatement(SQLGrammarParser.ReturnStatementContext ctx) {
        ASTNode expressionNode = visit(ctx.expression());
        return new ReturnStatement(expressionNode);
    }

    @Override
    public ASTNode visitDelete_statement(SQLGrammarParser.Delete_statementContext ctx) {
        ASTNode tableNameNode = visit(ctx.table_name());
        TableName tableName = (TableName) tableNameNode;
        if (ctx.where_clause() != null) {
            ASTNode whereClauseNode = visit(ctx.where_clause());
            WhereClause whereClause = (WhereClause) whereClauseNode;
            return new DeleteStatement(tableName, whereClause);
        } else {
            return new DeleteStatement(tableName);
        }
    }

    @Override
    public ASTNode visitBlock_statement(SQLGrammarParser.Block_statementContext ctx) {
        List<ASTNode> statements = new ArrayList<>();
        if (ctx.statement() != null) {
            for (SQLGrammarParser.StatementContext stmtCtx : ctx.statement()) {
                ASTNode stmt = visit(stmtCtx);
                if (stmt != null) {
                    statements.add(stmt);
                }
            }
        }
        return new BlockStatement(statements);
    }

    @Override
    public ASTNode visitWhile_statement(SQLGrammarParser.While_statementContext ctx) {
        // Visit the condition (expression)
        ASTNode condition = visit(ctx.expression());

        // Visit the body (statement)
        ASTNode body = visit(ctx.statement());

        return new WhileStatement(condition, body);
    }

    @Override
    public ASTNode visitPrint_statement(SQLGrammarParser.Print_statementContext ctx) {
        List<ASTNode> items = new ArrayList<>();

        // Visit all expressions
        if (ctx.expression() != null) {
            for (SQLGrammarParser.ExpressionContext exprCtx : ctx.expression()) {
                ASTNode expr = visit(exprCtx);
                if (expr != null) {
                    items.add(expr);
                }
            }
        }

        // Visit all USER_VARIABLE tokens
        if (ctx.USER_VARIABLE() != null && !ctx.USER_VARIABLE().isEmpty()) {
            for (org.antlr.v4.runtime.tree.TerminalNode varNode : ctx.USER_VARIABLE()) {
                String varText = varNode.getText();
                // Remove @ or @@ prefix
                String varName = varText.startsWith("@@") ? varText.substring(2) : varText.substring(1);
                items.add(new UserVariable(varName));
            }
        }

        return new PrintStatement(items);
    }

    @Override
    public ASTNode visitJoin_clause(SQLGrammarParser.Join_clauseContext ctx) {
        // Visit table_source
        ASTNode tableSource = visit(ctx.table_source());
        
        // Check if it's CROSS JOIN (no ON expression) or regular JOIN (with ON expression)
        if (ctx.CROSS() != null) {
            // CROSS JOIN - no ON condition
            return new JoinClause(tableSource);
        } else if (ctx.ON() != null && ctx.expression() != null) {
            // Regular JOIN with ON condition
            ASTNode onExpression = visit(ctx.expression());
            return new JoinClause(tableSource, onExpression);
        } else {
            // Fallback: just table source (shouldn't happen, but handle it)
            return new JoinClause(tableSource);
        }
    }

    @Override
    public ASTNode visitDataType(SQLGrammarParser.DataTypeContext ctx) {
        DataType dataType;
        
        // Handle DOUBLE (PRECISION)?
        if (ctx.DOUBLE() != null) {
            dataType = new DataType("DOUBLE");
            if (ctx.PRECISION() != null) {
                dataType.setHasPrecision(true);
            }
            return dataType;
        }
        
        // Handle FLOAT, REAL
        if (ctx.FLOAT() != null) {
            return new DataType("FLOAT");
        }
        if (ctx.REAL() != null) {
            return new DataType("REAL");
        }
        
        // Handle VARCHAR | NVARCHAR | CHAR | NCHAR | BINARY | VARBINARY with optional parameters and collation
        if (ctx.VARCHAR() != null || ctx.NVARCHAR() != null || ctx.CHAR() != null || 
            ctx.NCHAR() != null || ctx.BINARY() != null || ctx.VARBINARY() != null) {
            String typeName;
            if (ctx.VARCHAR() != null) typeName = "VARCHAR";
            else if (ctx.NVARCHAR() != null) typeName = "NVARCHAR";
            else if (ctx.CHAR() != null) typeName = "CHAR";
            else if (ctx.NCHAR() != null) typeName = "NCHAR";
            else if (ctx.BINARY() != null) typeName = "BINARY";
            else typeName = "VARBINARY";
            
            // Build parameters string from LPAREN...RPAREN parts
            StringBuilder params = new StringBuilder();
            // The grammar has two optional LPAREN parts - handle them
            // For now, just get the text representation of parameters
            String fullText = ctx.getText();
            int firstParen = fullText.indexOf('(');
            if (firstParen != -1) {
                // Extract everything from first ( to last )
                int lastParen = fullText.lastIndexOf(')');
                if (lastParen != -1) {
                    params.append(fullText.substring(firstParen, lastParen + 1));
                }
            }
            
            dataType = params.length() > 0 ? new DataType(typeName, params.toString()) : new DataType(typeName);
            
            // Handle COLLATE identifier
            if (ctx.identifier() != null && ctx.getText().toUpperCase().contains("COLLATE")) {
                ASTNode collateId = visit(ctx.identifier());
                dataType.setCollateName(collateId);
            }
            
            return dataType;
        }
        
        // Handle DECIMAL | NUMERIC with optional precision/scale
        if (ctx.DECIMAL() != null || ctx.NUMERIC() != null) {
            String typeName = ctx.DECIMAL() != null ? "DECIMAL" : "NUMERIC";
            // Extract parameters if present: (NUMBER, NUMBER) or (NUMBER)
            String fullText = ctx.getText();
            int firstParen = fullText.indexOf('(');
            if (firstParen != -1) {
                int lastParen = fullText.lastIndexOf(')');
                if (lastParen != -1) {
                    String params = fullText.substring(firstParen, lastParen + 1);
                    return new DataType(typeName, params);
                }
            }
            return new DataType(typeName);
        }
        
        // Handle INT | INTEGER | BIGINT | SMALLINT | TINYINT
        if (ctx.INT() != null || ctx.INTEGER() != null || ctx.BIGINT() != null || 
            ctx.SMALLINT() != null || ctx.TINYINT() != null) {
            if (ctx.INT() != null) return new DataType("INT");
            if (ctx.INTEGER() != null) return new DataType("INTEGER");
            if (ctx.BIGINT() != null) return new DataType("BIGINT");
            if (ctx.SMALLINT() != null) return new DataType("SMALLINT");
            return new DataType("TINYINT");
        }
        
        // Handle DATE | DATETIME | DATETIME2 | TIMESTAMP | TIME
        if (ctx.DATE() != null) return new DataType("DATE");
        if (ctx.DATETIME() != null) return new DataType("DATETIME");
        if (ctx.DATETIME2() != null) {
            // DATETIME2 can have (NUMBER) parameter
            String fullText = ctx.getText();
            int paren = fullText.indexOf('(');
            if (paren != -1) {
                int closeParen = fullText.indexOf(')');
                if (closeParen != -1) {
                    return new DataType("DATETIME2", fullText.substring(paren, closeParen + 1));
                }
            }
            return new DataType("DATETIME2");
        }
        if (ctx.TIMESTAMP() != null) return new DataType("TIMESTAMP");
        if (ctx.TIME() != null) return new DataType("TIME");
        
        // Handle TEXT | BIT | MONEY
        if (ctx.TEXT() != null) return new DataType("TEXT");
        if (ctx.BIT() != null) return new DataType("BIT");
        if (ctx.MONEY() != null) return new DataType("MONEY");
        
        // Handle UNIQUEIDENTIFIER | XML | JSON
        if (ctx.UNIQUEIDENTIFIER() != null) return new DataType("UNIQUEIDENTIFIER");
        if (ctx.XML() != null) return new DataType("XML");
        if (ctx.JSON() != null) return new DataType("JSON");
        
        // Handle INTERVAL ... TO ...
        if (ctx.INTERVAL() != null) {
            dataType = new DataType("INTERVAL");
            // Extract interval parts
            String fullText = ctx.getText().toUpperCase();
            if (fullText.contains("DAY")) dataType.setIntervalFrom("DAY");
            else if (fullText.contains("HOUR")) dataType.setIntervalFrom("HOUR");
            else if (fullText.contains("MINUTE")) dataType.setIntervalFrom("MINUTE");
            else if (fullText.contains("SECOND")) dataType.setIntervalFrom("SECOND");
            
            if (fullText.contains("TO SECOND")) dataType.setIntervalTo("SECOND");
            else if (fullText.contains("TO MINUTE")) dataType.setIntervalTo("MINUTE");
            else if (fullText.contains("TO HOUR")) dataType.setIntervalTo("HOUR");
            
            return dataType;
        }
        
        // Fallback: use the text as type name
        return new DataType(ctx.getText().toUpperCase());
    }

    @Override
    public ASTNode visitVariable_declaration(SQLGrammarParser.Variable_declarationContext ctx) {
        // Get USER_VARIABLE token text (e.g., "@var" or "@@var")
        String varText = ctx.USER_VARIABLE().getText();
        // Remove @ or @@ prefix to get the variable name
        String varName = varText.startsWith("@@") ? varText.substring(2) : varText.substring(1);
        UserVariable userVar = new UserVariable(varName);
        
        // Visit dataType
        ASTNode dataTypeNode = visit(ctx.dataType());
        DataType dataType = (DataType) dataTypeNode;
        
        // Optionally visit expression if present
        ASTNode expressionNode = null;
        if (ctx.expression() != null) {
            expressionNode = visit(ctx.expression());
        }
        
        // Create VariableDeclaration
        if (expressionNode != null) {
            return new VariableDeclaration(userVar, dataType, expressionNode);
        } else {
            return new VariableDeclaration(userVar, dataType);
        }
    }

    @Override
    public ASTNode visitDeclaration_statement(SQLGrammarParser.Declaration_statementContext ctx) {
        List<ASTNode> declarations = new ArrayList<>();
        // Visit all variable_declaration contexts
        if (ctx.variable_declaration() != null) {
            for (SQLGrammarParser.Variable_declarationContext varCtx : ctx.variable_declaration()) {
                ASTNode varNode = visit(varCtx);
                if (varNode != null) {
                    declarations.add(varNode);
                }
            }
        }
        return new DeclarationStatement(declarations);
    }

    @Override
    public ASTNode visitTable_source(SQLGrammarParser.Table_sourceContext ctx) {
        ASTNode identifierRef = null;
        ASTNode selectStatement = null;
        ASTNode tableAlias = null;
        
        // Check if it's identifier_ref or subquery
        if (ctx.identifier_ref() != null) {
            identifierRef = visit(ctx.identifier_ref());
        } else if (ctx.select_statement() != null) {
            selectStatement = visit(ctx.select_statement());
        }
        
        // Visit optional table_alias
        if (ctx.table_alias() != null) {
            tableAlias = visit(ctx.table_alias());
        }
        
        return new TableSource(identifierRef, selectStatement, tableAlias);
    }

    @Override
    public ASTNode visitOtherStatements(SQLGrammarParser.OtherStatementsContext ctx) {
        // SET (identifier | USER_VARIABLE) EQUAL (value | expression)
        ASTNode leftSide = null;
        ASTNode rightSide = null;
        boolean isVariable = false;
        boolean isExpression = false;
        
        // Determine left side: identifier or USER_VARIABLE
        if (ctx.identifier() != null) {
            leftSide = visit(ctx.identifier());
            isVariable = false;
        } else if (ctx.USER_VARIABLE() != null) {
            String varText = ctx.USER_VARIABLE().getText();
            String varName = varText.startsWith("@@") ? varText.substring(2) : varText.substring(1);
            leftSide = new UserVariable(varName);
            isVariable = true;
        }
        
        // Determine right side: value or expression
        if (ctx.expression() != null) {
            rightSide = visit(ctx.expression());
            isExpression = true;
        } else if (ctx.value() != null) {
            rightSide = visit(ctx.value());
            isExpression = false;
        }
        
        return new OtherStatements(leftSide, rightSide, isVariable, isExpression);
    }
    
    @Override
    public ASTNode visitWith_clause(SQLGrammarParser.With_clauseContext ctx) {
        List<ASTNode> commonTableExpressions = new ArrayList<>();
        
        // Visit all common_table_expression contexts
        if (ctx.common_table_expression() != null) {
            for (SQLGrammarParser.Common_table_expressionContext cteCtx : ctx.common_table_expression()) {
                ASTNode cte = visit(cteCtx);
                if (cte != null) {
                    commonTableExpressions.add(cte);
                }
            }
        }
        
        // Visit select_statement
        ASTNode selectStatement = visit(ctx.select_statement());
        
        // WithClause constructor takes (List<ASTNode>, ASTNode) or (ASTNode) - use the list version
        return new WithClause(commonTableExpressions, selectStatement);
    }
    
    @Override
    public ASTNode visitCommon_table_expression(SQLGrammarParser.Common_table_expressionContext ctx) {
        // Visit identifier_ref
        ASTNode identifierRef = visit(ctx.identifier_ref());
        
        // Visit optional column_list
        ASTNode columnList = null;
        if (ctx.column_list() != null) {
            columnList = visit(ctx.column_list());
        }
        
        // Visit select_statement
        ASTNode selectStatement = visit(ctx.select_statement());
        
        if (columnList != null) {
            return new CommonTableExpression(identifierRef, columnList, selectStatement);
        } else {
            return new CommonTableExpression(identifierRef, selectStatement);
        }
    }
    
    @Override
    public ASTNode visitValue(SQLGrammarParser.ValueContext ctx) {
        // value: identifier (LPAREN (expression (COMMA expression)*)? RPAREN)? | USER_VARIABLE | NUMBER | STRING | NULL
        ASTNode valueNode = null;
        
        if (ctx.identifier() != null) {
            ASTNode identifier = visit(ctx.identifier());
            // If there are expressions (function call), create a function call node
            if (ctx.expression() != null && !ctx.expression().isEmpty()) {
                List<ASTNode> args = new ArrayList<>();
                for (SQLGrammarParser.ExpressionContext exprCtx : ctx.expression()) {
                    args.add(visit(exprCtx));
                }
                // Create FunctionCall if identifier has arguments
                // Extract function name from identifier
                String funcName = identifier.prettyPrint("").trim();
                if (identifier instanceof Identifier) {
                    funcName = ((Identifier) identifier).getName();
                }
                FunctionName functionName = new FunctionName(funcName);
                valueNode = new FunctionCall(functionName, args);
            } else {
                valueNode = identifier;
            }
        } else if (ctx.USER_VARIABLE() != null) {
            String varText = ctx.USER_VARIABLE().getText();
            String varName = varText.startsWith("@@") ? varText.substring(2) : varText.substring(1);
            valueNode = new UserVariable(varName);
        } else if (ctx.NUMBER() != null) {
            valueNode = new NumberNode(ctx.NUMBER().getText());
        } else if (ctx.STRING() != null) {
            valueNode = new Constant(ctx.STRING().getText(), "STRING");
        } else if (ctx.NULL() != null) {
            valueNode = new Constant("NULL", "NULL");
        } else {
            // Fallback
            valueNode = new Constant(ctx.getText(), "UNKNOWN");
        }
        
        return new Value(valueNode);
    }



    // batool
    @Override
    public ASTNode visitDeclare_cursor(SQLGrammarParser.Declare_cursorContext ctx) {
        ASTNode cursorNameNode = visit(ctx.cursor_name());
        ASTNode selectStatementNode = visit(ctx.select_statement());
        boolean forUpdate = false;
        int childCount = ctx.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (ctx.getChild(i).getText().equalsIgnoreCase("UPDATE")) {
                forUpdate = true;
                break;
            }
        }
        DeclareCursor declareCursor = new DeclareCursor(cursorNameNode, selectStatementNode, forUpdate);
        if (forUpdate && ctx.column_name() != null && !ctx.column_name().isEmpty()) {
            for (SQLGrammarParser.Column_nameContext columnCtx : ctx.column_name()) {
                ASTNode columnNode = visit(columnCtx);
                declareCursor.addChild(columnNode);
            }
        }

        return declareCursor;
    }

    @Override
    public ASTNode visitOpen_cursor(SQLGrammarParser.Open_cursorContext ctx) {
        if (ctx.cursor_name() != null) {
            CursorName cursorName = (CursorName) visit(ctx.cursor_name());
            boolean isGlobal = false;
            for (int i = 0; i < ctx.getChildCount(); i++) {
                if (ctx.getChild(i).getText().equalsIgnoreCase("GLOBAL")) {
                    isGlobal = true;
                    break;
                }
            }
            return new OpenCursor(cursorName, isGlobal);
        } else {
            CursorVariableName cursorVariableName = (CursorVariableName) visit(ctx.cursor_variable_name());
            return new OpenCursor(cursorVariableName);
        }
    }

    @Override
    public ASTNode visitFetch_direction(SQLGrammarParser.Fetch_directionContext ctx) {
        String direction = ctx.getText();
        return new FetchDirection(direction);
    }

    @Override
    public ASTNode visitFetch_statement(SQLGrammarParser.Fetch_statementContext ctx) {
        ASTNode fetchDirection = null;
        if (ctx.fetch_direction() != null) {
            fetchDirection = visit(ctx.fetch_direction());
        }
        boolean isGlobal = false;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i).getText().equalsIgnoreCase("GLOBAL")) {
                isGlobal = true;
                break;
            }
        }
        ASTNode cursorName = null;
        ASTNode cursorVariable = null;

        if (ctx.cursor_name() != null) {
            cursorName = visit(ctx.cursor_name());
        } else if (ctx.USER_VARIABLE() != null && ctx.USER_VARIABLE().size() > 0) {
            cursorVariable = new UserVariable(ctx.USER_VARIABLE(0).getText());
        }
        List<ASTNode> intoVariables = new ArrayList<>();
        if (ctx.USER_VARIABLE() != null && ctx.USER_VARIABLE().size() > 0) {
            int startIndex = (cursorVariable != null) ? 1 : 0;
            for (int i = startIndex; i < ctx.USER_VARIABLE().size(); i++) {
                intoVariables.add(new UserVariable(ctx.USER_VARIABLE(i).getText()));
            }
        }

        return new FetchStatement(fetchDirection, isGlobal, cursorName, cursorVariable, intoVariables);
    }

    @Override
    public ASTNode visitClose_cursor(SQLGrammarParser.Close_cursorContext ctx) {
        boolean isGlobal = false;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i).getText().equalsIgnoreCase("GLOBAL")) {
                isGlobal = true;
                break;
            }
        }
        ASTNode identifierRef = null;
        if (ctx.identifier_ref() != null) {
            identifierRef = visit(ctx.identifier_ref());
        } else if (ctx.USER_VARIABLE() != null) {
            identifierRef = new UserVariable(ctx.USER_VARIABLE().getText());
        }

        return new CloseCursor(identifierRef, isGlobal);
    }

    @Override
    public ASTNode visitDeallocate_cursor(SQLGrammarParser.Deallocate_cursorContext ctx) {
        ASTNode identifierRef = null;
        if (ctx.identifier_ref() != null) {
            identifierRef = visit(ctx.identifier_ref());
        } else if (ctx.USER_VARIABLE() != null) {
            identifierRef = new UserVariable(ctx.USER_VARIABLE().getText());
        }
        return new DeallocateCursor(identifierRef);
    }

    @Override
    public ASTNode visitAlias(SQLGrammarParser.AliasContext ctx) {
        if (ctx.identifier() != null) {
            Identifier identifier = (Identifier) visit(ctx.identifier());
            return new Alias(identifier);
        } else {
            return new Alias(ctx.STRING().getText());
        }
    }

    @Override
    public ASTNode visitColumn_name(SQLGrammarParser.Column_nameContext ctx) {
        IdentifierRef identifierRef = (IdentifierRef) visit(ctx.identifier_ref());
        return new ColumnName(identifierRef);
    }

    @Override
    public ASTNode visitCursor_name(SQLGrammarParser.Cursor_nameContext ctx) {
        String cursorName = ctx.getChild(0).getText();
        return new CursorName(cursorName);
    }
    @Override
    public ASTNode visitCursor_variable_name(SQLGrammarParser.Cursor_variable_nameContext ctx) {
        String cursorVariableName = ctx.getChild(0).getText();
        return new CursorVariableName(cursorVariableName);
    }

    @Override
    public ASTNode visitTable_alias(SQLGrammarParser.Table_aliasContext ctx) {
        String tableAlias = ctx.getChild(0).getText();
        return new TableAlias(tableAlias);
    }

    @Override
    public ASTNode visitCursor_statement(SQLGrammarParser.Cursor_statementContext ctx) {
        if (ctx.declare_cursor() != null) {
            return visit(ctx.declare_cursor());
        } else if (ctx.open_cursor() != null) {
            return visit(ctx.open_cursor());
        } else if (ctx.fetch_statement() != null) {
            return visit(ctx.fetch_statement());
        }
        return null;
    }

    @Override
    public ASTNode visitFunction_name(SQLGrammarParser.Function_nameContext ctx) {
        return new FunctionName(ctx.getText());
    }

    @Override
    public ASTNode visitFunction_call(SQLGrammarParser.Function_callContext ctx) {
        ASTNode functionName = visit(ctx.function_name());
        List<ASTNode> arguments = new ArrayList<>();
        
        if (ctx.STAR() != null) {
            arguments.add(new Identifier("*", "STAR"));
        } else if (ctx.expression_list() != null) {
            ASTNode expressionListNode = visit(ctx.expression_list());
            if (expressionListNode instanceof ExpressionList) {
                ExpressionList exprList = (ExpressionList) expressionListNode;
                arguments = exprList.getExpressions();
            }
        }
        return new FunctionCall(functionName, arguments);
    }

    @Override
    public ASTNode visitWhen_clause(SQLGrammarParser.When_clauseContext ctx) {
        ASTNode whenExpression = visit(ctx.expression(0));
        ASTNode thenExpression = visit(ctx.expression(1));
        WhenStatement whenStmt = new WhenStatement(whenExpression);
        whenStmt.addChild(thenExpression);
        return whenStmt;
    }

    @Override
    public ASTNode visitSubquery(SQLGrammarParser.SubqueryContext ctx) {
        ASTNode selectStatement = visit(ctx.select_statement());
        return new Subquery(selectStatement);
    }

    @Override
    public ASTNode visitScalar_subquery(SQLGrammarParser.Scalar_subqueryContext ctx) {
        ASTNode selectStatement = visit(ctx.select_statement());
        Subquery subquery = new Subquery(selectStatement);
        return new ScalarSubquery(subquery, selectStatement);
    }

    @Override
    public ASTNode visitExists_predicate(SQLGrammarParser.Exists_predicateContext ctx) {
        ASTNode subquery = visit(ctx.subquery());
        return new ExistPredicate(subquery);
    }

    //sara
    @Override
    public ASTNode visitOrder_by_expression(SQLGrammarParser.Order_by_expressionContext ctx) {

        ASTNode expr = visit(ctx.expression());

        String direction = "ASC";
        if (ctx.DESC() != null) {
            direction = "DESC";
        } else if (ctx.ASC() != null) {
            direction = "ASC";
        }

        return new OrderByExpression(expr, direction);
    }

    @Override
    public ASTNode visitSelect_list(SQLGrammarParser.Select_listContext ctx) {
        if (ctx.STAR() != null) {
            return new SelectList(true);
        }

        List<ASTNode> elements = new ArrayList<>();
        for (SQLGrammarParser.Select_elementContext elCtx : ctx.select_element()) {
            elements.add(visit(elCtx));
        }
        return new SelectList(elements);
    }

    @Override
    public ASTNode visitSelect_element(SQLGrammarParser.Select_elementContext ctx) {
        if (ctx.expression() != null) {
            ASTNode expr = visit(ctx.expression());
            if (ctx.alias() != null) {
                ASTNode aliasNode = visit(ctx.alias());
                return new SelectElement(expr, aliasNode);
            }
            return new SelectElement(expr, null);
        }

        return new SelectElement(visit(ctx.identifier()), visit(ctx.expression()));
    }
    @Override
    public ASTNode visitExpression(SQLGrammarParser.ExpressionContext ctx) {
        if (ctx.primary_expression() != null) {
            return visit(ctx.primary_expression());
        }
        if (ctx.getChildCount() == 3 && ctx.expression().size() == 2) {
            ASTNode left = visit(ctx.expression(0));
            ASTNode right = visit(ctx.expression(1));
            ASTNode opNode = new Identifier(ctx.getChild(1).getText(), "OPERATOR");
            return new Expression(left, opNode, right, null, null, null);
        }
        if (ctx.BETWEEN() != null) {
            ASTNode expr = visit(ctx.expression(0));
            ASTNode start = visit(ctx.expression(1));
            ASTNode end = visit(ctx.expression(2));
            ASTNode opNode = new Identifier("BETWEEN", "KEYWORD");

            return new Expression(expr, opNode, null, start, end, null);
        }

        return super.visitExpression(ctx);
    }
    @Override
    public ASTNode visitOrder_by_clause(SQLGrammarParser.Order_by_clauseContext ctx) {
        OrderByClause orderByClause = new OrderByClause();
        for (SQLGrammarParser.Order_by_expressionContext exprCtx : ctx.order_by_expression()) {
            ASTNode node = visit(exprCtx);
            if (node != null) {
                orderByClause.addExpression(node);
            }
        }

        return orderByClause;
    }
    @Override
    public ASTNode visitDropStatement(SQLGrammarParser.DropStatementContext ctx) {
        List<String> tableNames = new ArrayList<>();

        for (SQLGrammarParser.FullIdentifierContext idCtx : ctx.fullIdentifier()) {
            tableNames.add(idCtx.getText());
        }

        return new DropTableStatement(tableNames);
    }
    @Override
    public ASTNode visitInsert_statement(SQLGrammarParser.Insert_statementContext ctx) {
        ASTNode tableName = visit(ctx.table_name());
        InsertStatement insert = new InsertStatement(tableName);
        if (ctx.column_list() != null) {
            insert.setColumnList(visit(ctx.column_list()));
        }
        if (ctx.VALUES() != null && ctx.row_value_constructor_list() != null) {
            insert.setInsertSource(visit(ctx.row_value_constructor_list()));
        }
        else if (ctx.select_statement() != null) {
            insert.setInsertSource(visit(ctx.select_statement()));
        }
        else if (ctx.DEFAULT() != null) {
            insert.setDefaultValues(true);
        }

        return insert;
    }

    @Override
    public ASTNode visitUpdate_statement(SQLGrammarParser.Update_statementContext ctx) {
        ASTNode tableName = visit(ctx.table_name());
        UpdateStatement update = new UpdateStatement(tableName);
        for (SQLGrammarParser.AssignmentContext assignCtx : ctx.assignment()) {
            update.addAssignment(visit(assignCtx));
        }
        if (ctx.where_clause() != null) {
            update.setWhereClause(visit(ctx.where_clause()));
        }
        return update;
    }
    @Override
    public ASTNode visitRow_value_constructor_list(SQLGrammarParser.Row_value_constructor_listContext ctx) {
        List<ASTNode> rows = new ArrayList<>();
        for (SQLGrammarParser.Row_value_constructorContext rowCtx : ctx.row_value_constructor()) {
            rows.add(visit(rowCtx));
        }
        return new ExpressionList(rows);
    }

    @Override
    public ASTNode visitRow_value_constructor(SQLGrammarParser.Row_value_constructorContext ctx) {
        return visit(ctx.expression_list());
    }

    @Override
    public ASTNode visitExpression_list(SQLGrammarParser.Expression_listContext ctx) {
        List<ASTNode> exprs = new ArrayList<>();
        for (SQLGrammarParser.ExpressionContext eCtx : ctx.expression()) {
            exprs.add(visit(eCtx));
        }
        return new ExpressionList(exprs);
    }
    @Override
    public ASTNode visitPrimary_expression(SQLGrammarParser.Primary_expressionContext ctx) {
        if (ctx.column_name() != null) return visit(ctx.column_name());
        if (ctx.constant() != null) return visit(ctx.constant());
        if (ctx.identifier() != null) return visit(ctx.identifier());
        if (ctx.USER_VARIABLE() != null) {
            String name = ctx.USER_VARIABLE().getText();
            return new UserVariable(name.startsWith("@@") ? name.substring(2) : name.substring(1));
        }
        if (ctx.expression() != null) return visit(ctx.expression());

        return super.visitPrimary_expression(ctx);
    }
    @Override
    public ASTNode visitColumnList(SQLGrammarParser.ColumnListContext ctx) {
        if (ctx.STAR() != null) {
            return new Identifier("*", "STAR");
        }

        List<ASTNode> columns = new ArrayList<>();
        if (ctx.identifier() != null) {
            for (SQLGrammarParser.IdentifierContext idCtx : ctx.identifier()) {
                columns.add(visit(idCtx));
            }
        }
        return new ColumnList(columns);
    }
    @Override
    public ASTNode visitConstant(SQLGrammarParser.ConstantContext ctx) {
        if (ctx.NUMBER() != null) return new NumberNode(ctx.NUMBER().getText());
        if (ctx.STRING() != null) return new Identifier(ctx.STRING().getText(), "STRING");
        if (ctx.NULL() != null) return new Identifier("NULL", "NULL");
        return new Identifier(ctx.getText(), "CONSTANT");
    }
    @Override
    public ASTNode visitTable_name(SQLGrammarParser.Table_nameContext ctx) {
        return visit(ctx.identifier_ref());
    }

    @Override
    public ASTNode visitIdentifier_ref(SQLGrammarParser.Identifier_refContext ctx) {
        if (ctx.DOT() != null) {
            return new Identifier(ctx.getText(), "REFERENCE");
        }
        return visit(ctx.identifier(0));
    }
    @Override
    public ASTNode visitAssignment(SQLGrammarParser.AssignmentContext ctx) {
        ASTNode column = visit(ctx.column_name());
        ASTNode value = visit(ctx.expression());
        return new Expression(column, new Identifier("=", "OPERATOR"), value, null, null, null);
    }

    @Override
    public ASTNode visitSql_sdecript(SQLGrammarParser.Sql_sdecriptContext ctx) {
        List<ASTNode> statements = new ArrayList<>();
        // Visit all statement children
        if (ctx.statement() != null) {
            for (SQLGrammarParser.StatementContext stmtCtx : ctx.statement()) {
                ASTNode stmt = visit(stmtCtx);
                if (stmt != null) {
                    statements.add(stmt);
                }
            }
        }
        // wrapper for everything
        return new Program(statements);
    }

}

