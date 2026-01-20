
import org.antlr.v4.runtime.Token;
import sql.*;
import java.util.ArrayList;
import java.util.List;

public class ASTBuilderVisitor extends SQLGrammarParserBaseVisitor<ASTNode> {

    public List<String> semanticsErrors = new ArrayList<>();

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

//    @Override
//    public ASTNode visitWhile_statement(SQLGrammarParser.While_statementContext ctx) {
//        // Visit the condition (expression)
//        ASTNode condition = visit(ctx.expression());
//
//        // Visit the body (statement)
//        ASTNode body = visit(ctx.statement());
//
//        return new WhileStatement(condition, body);
//    }
//
//    @Override
//    public ASTNode visitPrint_statement(SQLGrammarParser.Print_statementContext ctx) {
//        List<ASTNode> items = new ArrayList<>();
//
//        // Visit all expressions
//        if (ctx.expression() != null) {
//            for (SQLGrammarParser.ExpressionContext exprCtx : ctx.expression()) {
//                ASTNode expr = visit(exprCtx);
//                if (expr != null) {
//                    items.add(expr);
//                }
//            }
//        }
//
//        // Visit all USER_VARIABLE tokens
//        if (ctx.USER_VARIABLE() != null) {
//            for (org.antlr.v4.runtime.Token varToken : ctx.USER_VARIABLE()) {
//                String varText = varToken.getText();
//                // Remove @ or @@ prefix
//                String varName = varText.startsWith("@@") ? varText.substring(2) : varText.substring(1);
//                items.add(new UserVariable(varName));
//            }
//        }
//
//        return new PrintStatement(items);
//    }

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
