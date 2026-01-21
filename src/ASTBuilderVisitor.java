
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

        ASTNode condition = visit(ctx.expression());

        ASTNode body = visit(ctx.statement());

        return new WhileStatement(condition, body);
    }

    @Override
    public ASTNode visitPrint_statement(SQLGrammarParser.Print_statementContext ctx) {
        List<ASTNode> items = new ArrayList<>();

        if (ctx.expression() != null) {
            for (SQLGrammarParser.ExpressionContext exprCtx : ctx.expression()) {
                ASTNode expr = visit(exprCtx);
                if (expr != null) {
                    items.add(expr);
                }
            }
        }

        if (ctx.USER_VARIABLE() != null && !ctx.USER_VARIABLE().isEmpty()) {
            for (org.antlr.v4.runtime.tree.TerminalNode varNode : ctx.USER_VARIABLE()) {
                String varText = varNode.getText();
                // Remove @ or @@ 
                String varName = varText.startsWith("@@") ? varText.substring(2) : varText.substring(1);
                items.add(new UserVariable(varName));
            }
        }

        return new PrintStatement(items);
    }

    @Override
    public ASTNode visitJoin_clause(SQLGrammarParser.Join_clauseContext ctx) {

        ASTNode tableSource = visit(ctx.table_source());

        if (ctx.CROSS() != null) {
            return new JoinClause(tableSource);
        } else if (ctx.ON() != null && ctx.expression() != null) {
          
            ASTNode onExpression = visit(ctx.expression());
            return new JoinClause(tableSource, onExpression);
        } else {
            return new JoinClause(tableSource);
        }
    }

    @Override
    public ASTNode visitDataType(SQLGrammarParser.DataTypeContext ctx) {
        DataType dataType;
        
        //  DOUBLE (PRECISION)?
        if (ctx.DOUBLE() != null) {
            dataType = new DataType("DOUBLE");
            if (ctx.PRECISION() != null) {
                dataType.setHasPrecision(true);
            }
            return dataType;
        }
        
        //  FLOAT, REAL
        if (ctx.FLOAT() != null) {
            return new DataType("FLOAT");
        }
        if (ctx.REAL() != null) {
            return new DataType("REAL");
        }
        
        //  VARCHAR | NVARCHAR | CHAR | NCHAR | BINARY | VARBINARY 
        if (ctx.VARCHAR() != null || ctx.NVARCHAR() != null || ctx.CHAR() != null || 
            ctx.NCHAR() != null || ctx.BINARY() != null || ctx.VARBINARY() != null) {
            String typeName;
            if (ctx.VARCHAR() != null) typeName = "VARCHAR";
            else if (ctx.NVARCHAR() != null) typeName = "NVARCHAR";
            else if (ctx.CHAR() != null) typeName = "CHAR";
            else if (ctx.NCHAR() != null) typeName = "NCHAR";
            else if (ctx.BINARY() != null) typeName = "BINARY";
            else typeName = "VARBINARY";
         
            StringBuilder params = new StringBuilder();
            String fullText = ctx.getText();
            int firstParen = fullText.indexOf('(');
            if (firstParen != -1) {
                int lastParen = fullText.lastIndexOf(')');
                if (lastParen != -1) {
                    params.append(fullText.substring(firstParen, lastParen + 1));
                }
            }
            
            dataType = params.length() > 0 ? new DataType(typeName, params.toString()) : new DataType(typeName);
            
            //  COLLATE 
            if (ctx.identifier() != null && ctx.getText().toUpperCase().contains("COLLATE")) {
                ASTNode collateId = visit(ctx.identifier());
                dataType.setCollateName(collateId);
            }
            
            return dataType;
        }
        
        //  DECIMAL | NUMERIC 
        if (ctx.DECIMAL() != null || ctx.NUMERIC() != null) {
            String typeName = ctx.DECIMAL() != null ? "DECIMAL" : "NUMERIC";
            // (NUMBER, NUMBER) or (NUMBER)
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
        
        //  INT | INTEGER | BIGINT | SMALLINT | TINYINT
        if (ctx.INT() != null || ctx.INTEGER() != null || ctx.BIGINT() != null || 
            ctx.SMALLINT() != null || ctx.TINYINT() != null) {
            if (ctx.INT() != null) return new DataType("INT");
            if (ctx.INTEGER() != null) return new DataType("INTEGER");
            if (ctx.BIGINT() != null) return new DataType("BIGINT");
            if (ctx.SMALLINT() != null) return new DataType("SMALLINT");
            return new DataType("TINYINT");
        }
        
        //  DATE | DATETIME | DATETIME2 | TIMESTAMP | TIME
        if (ctx.DATE() != null) return new DataType("DATE");
        if (ctx.DATETIME() != null) return new DataType("DATETIME");
        if (ctx.DATETIME2() != null) {
            // DATETIME2 (NUMBER) 
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
        
        //  TEXT | BIT | MONEY
        if (ctx.TEXT() != null) return new DataType("TEXT");
        if (ctx.BIT() != null) return new DataType("BIT");
        if (ctx.MONEY() != null) return new DataType("MONEY");
        
        //  UNIQUEIDENTIFIER | XML | JSON
        if (ctx.UNIQUEIDENTIFIER() != null) return new DataType("UNIQUEIDENTIFIER");
        if (ctx.XML() != null) return new DataType("XML");
        if (ctx.JSON() != null) return new DataType("JSON");
        
        //  INTERVAL ... TO ...
        if (ctx.INTERVAL() != null) {
            dataType = new DataType("INTERVAL");

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

        return new DataType(ctx.getText().toUpperCase());
    }

    @Override
    public ASTNode visitVariable_declaration(SQLGrammarParser.Variable_declarationContext ctx) {
        // Get USER_VARIABLE  "@var" or "@@var"
        String varText = ctx.USER_VARIABLE().getText();
        // Remove @ or @@
        String varName = varText.startsWith("@@") ? varText.substring(2) : varText.substring(1);
        UserVariable userVar = new UserVariable(varName);
       
        ASTNode dataTypeNode = visit(ctx.dataType());
        DataType dataType = (DataType) dataTypeNode;
        
        ASTNode expressionNode = null;
        if (ctx.expression() != null) {
            expressionNode = visit(ctx.expression());
        }
       
        if (expressionNode != null) {
            return new VariableDeclaration(userVar, dataType, expressionNode);
        } else {
            return new VariableDeclaration(userVar, dataType);
        }
    }

    @Override
    public ASTNode visitDeclaration_statement(SQLGrammarParser.Declaration_statementContext ctx) {
        List<ASTNode> declarations = new ArrayList<>();

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
        
        if (ctx.identifier_ref() != null) {
            identifierRef = visit(ctx.identifier_ref());
        } else if (ctx.select_statement() != null) {
            selectStatement = visit(ctx.select_statement());
        }
        
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
        
        //  left 
        if (ctx.identifier() != null) {
            leftSide = visit(ctx.identifier());
            isVariable = false;
        } else if (ctx.USER_VARIABLE() != null) {
            String varText = ctx.USER_VARIABLE().getText();
            String varName = varText.startsWith("@@") ? varText.substring(2) : varText.substring(1);
            leftSide = new UserVariable(varName);
            isVariable = true;
        }
        
        //  right 
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
        
        if (ctx.common_table_expression() != null) {
            for (SQLGrammarParser.Common_table_expressionContext cteCtx : ctx.common_table_expression()) {
                ASTNode cte = visit(cteCtx);
                if (cte != null) {
                    commonTableExpressions.add(cte);
                }
            }
        }

        ASTNode selectStatement = visit(ctx.select_statement());
        
        return new WithClause(commonTableExpressions, selectStatement);
    }
    
    @Override
    public ASTNode visitCommon_table_expression(SQLGrammarParser.Common_table_expressionContext ctx) {

        ASTNode identifierRef = visit(ctx.identifier_ref());

        ASTNode columnList = null;
        if (ctx.column_list() != null) {
            columnList = visit(ctx.column_list());
        }
        
        ASTNode selectStatement = visit(ctx.select_statement());
        
        if (columnList != null) {
            return new CommonTableExpression(identifierRef, columnList, selectStatement);
        } else {
            return new CommonTableExpression(identifierRef, selectStatement);
        }
    }
    
    @Override
    public ASTNode visitValue(SQLGrammarParser.ValueContext ctx) {
        //  identifier (LPAREN (expression (COMMA expression)*)? RPAREN)? | USER_VARIABLE | NUMBER | STRING | NULL
        ASTNode valueNode = null;
        
        if (ctx.identifier() != null) {
            ASTNode identifier = visit(ctx.identifier());
            if (ctx.expression() != null && !ctx.expression().isEmpty()) {
                List<ASTNode> args = new ArrayList<>();
                for (SQLGrammarParser.ExpressionContext exprCtx : ctx.expression()) {
                    args.add(visit(exprCtx));
                }
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
            valueNode = new Constant(ctx.getText(), "UNKNOWN");
        }
        
        return new Value(valueNode);
    }
    @Override
    public ASTNode visitIf_statement(SQLGrammarParser.If_statementContext ctx) {
        ASTNode expression = visit(ctx.expression());
        ASTNode ifStatement = null;
        ASTNode elseStatement = null;
        //if
        if (ctx.statement() != null && ctx.statement().size() > 0) {
            ifStatement = visit(ctx.statement(0));
        }

        // else
        if (ctx.statement() != null && ctx.statement().size() > 1) {
            elseStatement = visit(ctx.statement(1));
        } else if (ctx.ELSE() != null && ctx.statement() != null && ctx.statement().size() == 1) {
            
            elseStatement = visit(ctx.statement(0));
        }

        if (ifStatement != null && elseStatement != null) {
            return new IfStatement(expression, ifStatement, elseStatement);
        } else if (ifStatement != null) {
            return new IfStatement(expression, ifStatement);
        } else {
            return new IfStatement(expression);
        }
    }

    @Override
    public ASTNode visitTableConstraint(SQLGrammarParser.TableConstraintContext ctx) {
        TableConstraint constraint = null;
        ASTNode constraintName = null;
        
        if (ctx.identifier() != null && ctx.getText().toUpperCase().contains("CONSTRAINT")) {
            //  constraint name 
            for (SQLGrammarParser.IdentifierContext idCtx : ctx.identifier()) {
                String text = ctx.getText().toUpperCase();
                int constraintPos = text.indexOf("CONSTRAINT");
                int idPos = ctx.getStart().getStartIndex();
                if (text.indexOf(idCtx.getText().toUpperCase()) > constraintPos) {
                    constraintName = visit(idCtx);
                    break;
                }
            }
        }

        // PRIMARY KEY
        if (ctx.PRIMARY() != null && ctx.KEY() != null) {
            List<ASTNode> columns = new ArrayList<>();
            for (SQLGrammarParser.IdentifierContext idCtx : ctx.identifier()) {
                columns.add(visit(idCtx));
            }
            constraint = new TableConstraint("PRIMARY KEY", columns);
            if (ctx.CLUSTERED() != null) {
                constraint.setClustered(true);
            } else if (ctx.NONCLUSTERED() != null) {
                constraint.setNonClustered(true);
            }
        }
        // UNIQUE
        else if (ctx.UNIQUE() != null) {
            List<ASTNode> columns = new ArrayList<>();
            for (SQLGrammarParser.IdentifierContext idCtx : ctx.identifier()) {
                columns.add(visit(idCtx));
            }
            constraint = new TableConstraint("UNIQUE", columns);
            if (ctx.CLUSTERED() != null) {
                constraint.setClustered(true);
            } else if (ctx.NONCLUSTERED() != null) {
                constraint.setNonClustered(true);
            }
        }
        // FOREIGN KEY
        else if (ctx.FOREIGN() != null && ctx.KEY() != null) {
            List<ASTNode> columns = new ArrayList<>();
            // Get columns before REFERENCES
            String text = ctx.getText().toUpperCase();
            int refPos = text.indexOf("REFERENCES");
            for (SQLGrammarParser.IdentifierContext idCtx : ctx.identifier()) {
                int idPos = idCtx.getStart().getStartIndex();
                if (idPos < refPos || refPos == -1) {
                    columns.add(visit(idCtx));
                }
            }
            ASTNode referencesTable = visit(ctx.fullIdentifier());
            constraint = new TableConstraint(columns, referencesTable);

            // Referenced columns 
            if (ctx.fullIdentifier() != null) {
                List<ASTNode> refColumns = new ArrayList<>();
                for (SQLGrammarParser.IdentifierContext idCtx : ctx.identifier()) {
                    int idPos = idCtx.getStart().getStartIndex();
                    String fullText = ctx.getText().toUpperCase();
                    int refIdx = fullText.indexOf("REFERENCES");
                    if (refIdx != -1 && idPos > refIdx) {
                        refColumns.add(visit(idCtx));
                    }
                }
                if (!refColumns.isEmpty()) {
                    constraint.setReferencedColumns(refColumns);
                }
            }

            //  ON DELETE + ON UPDATE 
            if (ctx.DELETE() != null && ctx.action() != null && !ctx.action().isEmpty()) {
                // Find action that comes immediately after DELETE
                int deleteStart = ctx.DELETE().getSymbol().getStartIndex();
                SQLGrammarParser.ActionContext deleteAction = null;
                int minDistance = Integer.MAX_VALUE;
                
                for (SQLGrammarParser.ActionContext actionCtx : ctx.action()) {
                    int actionStart = actionCtx.getStart().getStartIndex();
                    if (actionStart > deleteStart) {
                        int distance = actionStart - deleteStart;
                        if (distance < minDistance) {
                            minDistance = distance;
                            deleteAction = actionCtx;
                        }
                    }
                }
                
                if (deleteAction != null) {
                    ASTNode action = visit(deleteAction);
                    constraint.setOnDeleteAction(action);
                }
            }
            
            if (ctx.UPDATE() != null && ctx.action() != null && !ctx.action().isEmpty()) {
                // Find action that comes immediately after UPDATE
                int updateStart = ctx.UPDATE().getSymbol().getStartIndex();
                SQLGrammarParser.ActionContext updateAction = null;
                int minDistance = Integer.MAX_VALUE;
                
                for (SQLGrammarParser.ActionContext actionCtx : ctx.action()) {
                    int actionStart = actionCtx.getStart().getStartIndex();
                    if (actionStart > updateStart) {
                        int distance = actionStart - updateStart;
                        if (distance < minDistance) {
                            minDistance = distance;
                            updateAction = actionCtx;
                        }
                    }
                }
                
                if (updateAction != null) {
                    ASTNode action = visit(updateAction);
                    constraint.setOnUpdateAction(action);
                }
            }
        }
        // CHECK
        else if (ctx.CHECK() != null && ctx.expression() != null) {
            ASTNode checkExpression = visit(ctx.expression());
            constraint = new TableConstraint(checkExpression);
        }

        if (constraint != null && constraintName != null) {
            constraint.setConstraintName(constraintName);
        }

        return constraint != null ? constraint : new TableConstraint(new ArrayList<>(), null);
    }

    @Override
    public ASTNode visitTableElement(SQLGrammarParser.TableElementContext ctx) {
        if (ctx.columnDefinition() != null) {
            ASTNode columnDef = visit(ctx.columnDefinition());
            return new TableElement(columnDef);
        } else if (ctx.tableConstraint() != null) {
            ASTNode tableConstraint = visit(ctx.tableConstraint());
            return new TableElement(tableConstraint);
        }
        return null;
    }

    @Override
    public ASTNode visitColumnConstraint(SQLGrammarParser.ColumnConstraintContext ctx) {
        ColumnConstraint constraint = null;
        ASTNode constraintName = null;

        //  constraint name
        if (ctx.identifier() != null) {
            String text = ctx.getText().toUpperCase();
            if (text.contains("CONSTRAINT")) {
                constraintName = visit(ctx.identifier(0));
            }
        }

        // PRIMARY KEY
        if (ctx.PRIMARY() != null && ctx.KEY() != null) {
            constraint = new ColumnConstraint("PRIMARY KEY");
            if (ctx.CLUSTERED() != null) {
                constraint.setClustered(true);
            } else if (ctx.NONCLUSTERED() != null) {
                constraint.setNonClustered(true);
            }
        }
        // NOT NULL
        else if (ctx.NOT() != null && ctx.NULL() != null) {
            constraint = new ColumnConstraint("NOT NULL");
        }
        // NULL
        else if (ctx.NULL() != null && ctx.NOT() == null) {
            constraint = new ColumnConstraint("NULL");
        }
        // UNIQUE
        else if (ctx.UNIQUE() != null) {
            constraint = new ColumnConstraint("UNIQUE");
            if (ctx.CLUSTERED() != null) {
                constraint.setClustered(true);
            } else if (ctx.NONCLUSTERED() != null) {
                constraint.setNonClustered(true);
            }
        }
        // IDENTITY
        else if (ctx.IDENTITY() != null) {
            constraint = new ColumnConstraint("IDENTITY");
            if (ctx.NUMBER() != null) {

                String params = "(";
                List<org.antlr.v4.runtime.tree.TerminalNode> numbers = ctx.NUMBER();
                for (int i = 0; i < numbers.size(); i++) {
                    params += numbers.get(i).getText();
                    if (i < numbers.size() - 1) {
                        params += ", ";
                    }
                }
                params += ")";
                constraint.setIdentityParams(params);
            }
        }
        // DEFAULT
        else if (ctx.DEFAULT() != null && ctx.defaultValue() != null) {
            constraint = new ColumnConstraint("DEFAULT");
            ASTNode defaultValue = visit(ctx.defaultValue());
            constraint.setDefaultValue(defaultValue);
        }
        // CHECK
        else if (ctx.CHECK() != null && ctx.expression() != null) {
            constraint = new ColumnConstraint("CHECK");
            ASTNode checkExpression = visit(ctx.expression());
            constraint.setCheckExpression(checkExpression);
        }
        // REFERENCES
        else if (ctx.REFERENCES() != null) {
            constraint = new ColumnConstraint("REFERENCES");
            ASTNode referencesTable = visit(ctx.fullIdentifier());
            constraint.setReferencesTable(referencesTable);

            //  referenced column
            if (ctx.identifier() != null) {

                String text = ctx.getText().toUpperCase();
                int refPos = text.indexOf("REFERENCES");
                for (SQLGrammarParser.IdentifierContext idCtx : ctx.identifier()) {
                    int idPos = idCtx.getStart().getStartIndex();
                    if (idPos > refPos) {
                        constraint.setReferencedColumn(visit(idCtx));
                        break;
                    }
                }
            }

            // ON DELETE + ON UPDATE 
            if (ctx.DELETE() != null && ctx.action() != null && !ctx.action().isEmpty()) {
                // Find action that comes immediately after DELETE
                int deleteStart = ctx.DELETE().getSymbol().getStartIndex();
                SQLGrammarParser.ActionContext deleteAction = null;
                int minDistance = Integer.MAX_VALUE;
                
                for (SQLGrammarParser.ActionContext actionCtx : ctx.action()) {
                    int actionStart = actionCtx.getStart().getStartIndex();
                    if (actionStart > deleteStart) {
                        int distance = actionStart - deleteStart;
                        if (distance < minDistance) {
                            minDistance = distance;
                            deleteAction = actionCtx;
                        }
                    }
                }
                
                if (deleteAction != null) {
                    ASTNode action = visit(deleteAction);
                    constraint.setOnDeleteAction(action);
                }
            }
            
            if (ctx.UPDATE() != null && ctx.action() != null && !ctx.action().isEmpty()) {
                // Find action that comes immediately after UPDATE
                int updateStart = ctx.UPDATE().getSymbol().getStartIndex();
                SQLGrammarParser.ActionContext updateAction = null;
                int minDistance = Integer.MAX_VALUE;
                
                for (SQLGrammarParser.ActionContext actionCtx : ctx.action()) {
                    int actionStart = actionCtx.getStart().getStartIndex();
                    if (actionStart > updateStart) {
                        int distance = actionStart - updateStart;
                        if (distance < minDistance) {
                            minDistance = distance;
                            updateAction = actionCtx;
                        }
                    }
                }
                
                if (updateAction != null) {
                    ASTNode action = visit(updateAction);
                    constraint.setOnUpdateAction(action);
                }
            }
        }

        if (constraint == null) {
            constraint = new ColumnConstraint("UNKNOWN");
        }

        if (constraintName != null) {
            constraint.setConstraintName(constraintName);
        }

        return constraint;
    }

    @Override
    public ASTNode visitParameter(SQLGrammarParser.ParameterContext ctx) {
        ASTNode parameterName = null;
        ASTNode dataType = null;
        ASTNode defaultValue = null;
        boolean isOutput = false;

        // USER_VARIABLE or identifier
        if (ctx.USER_VARIABLE() != null) {
            String varText = ctx.USER_VARIABLE().getText();
            String varName = varText.startsWith("@@") ? varText.substring(2) : varText.substring(1);
            parameterName = new UserVariable(varName);
        } else if (ctx.identifier() != null) {
            parameterName = visit(ctx.identifier());
        }

        if (ctx.dataType() != null) {
            dataType = visit(ctx.dataType());
        }

        if (ctx.defaultValue() != null) {
            defaultValue = visit(ctx.defaultValue());
        }

        if (ctx.OUTPUT() != null) {
            isOutput = true;
        }

        Parameter param = new Parameter(parameterName, dataType);
        if (defaultValue != null) {
            param.setDefaultValue(defaultValue);
        }
        if (isOutput) {
            param.setOutput(true);
        }

        return param;
    }

    @Override
    public ASTNode visitParameterList(SQLGrammarParser.ParameterListContext ctx) {
        ParameterList paramList = new ParameterList();
        if (ctx.parameter() != null) {
            for (SQLGrammarParser.ParameterContext paramCtx : ctx.parameter()) {
                ASTNode param = visit(paramCtx);
                paramList.addParameter(param);
            }
        }
        return paramList;
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
        ASTNode whenExpression = visit(ctx.expression(1));
        ASTNode thenExpression = visit(ctx.expression(3));
        return new WhenStatement(whenExpression, thenExpression);
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

    @Override
    public ASTNode visitFileGroup(SQLGrammarParser.FileGroupContext ctx) {
        if (ctx.PRIMARY() != null) {
            return new FileGroup(true);
        } else if (ctx.identifier() != null) {
            ASTNode identifier = visit(ctx.identifier());
            return new FileGroup(identifier);
        }
        return null;
    }
    @Override
    public ASTNode visitAction(SQLGrammarParser.ActionContext ctx) {
        String actionType = ctx.getText().toUpperCase();
        return new Action(actionType);
    }
    @Override
    public ASTNode visitFullIdentifier(SQLGrammarParser.FullIdentifierContext ctx) {
        List<ASTNode> identifiers = new ArrayList<>();
        if (ctx.identifier() != null) {
            for (SQLGrammarParser.IdentifierContext idCtx : ctx.identifier()) {
                ASTNode identifier = visit(idCtx);
                identifiers.add(identifier);
            }
        }
        return new FullIdentifier(identifiers);
    }

    //sara
//    @Override
//    public ASTNode visitOrder_by_expression(SQLGrammarParser.Order_by_expressionContext ctx) {
//
//        ASTNode expr = visit(ctx.expression());
//
//        String direction = "ASC";
//        if (ctx.DESC() != null) {
//            direction = "DESC";
//        } else if (ctx.ASC() != null) {
//            direction = "ASC";
//        }
//
//        return new OrderByExpression(expr, direction);
//    }

//    @Override
//    public ASTNode visitSelect_list(SQLGrammarParser.Select_listContext ctx) {
//        if (ctx.STAR() != null) {
//            return new SelectList(true);
//        }
//
//        List<ASTNode> elements = new ArrayList<>();
//        for (SQLGrammarParser.Select_elementContext elCtx : ctx.select_element()) {
//            elements.add(visit(elCtx));
//        }
//        return new SelectList(elements);
//    }

//    @Override
//    public ASTNode visitSelect_element(SQLGrammarParser.Select_elementContext ctx) {
//        if (ctx.expression() != null) {
//            ASTNode expr = visit(ctx.expression());
//            if (ctx.alias() != null) {
//                ASTNode aliasNode = visit(ctx.alias());
//                return new SelectElement(expr, aliasNode);
//            }
//            return new SelectElement(expr, null);
//        }
//
//        return new SelectElement(visit(ctx.identifier()), visit(ctx.expression()));
//    }
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
//    @Override
//    public ASTNode visitInsert_statement(SQLGrammarParser.Insert_statementContext ctx) {
//        ASTNode tableName = visit(ctx.table_name());
//        InsertStatement insert = new InsertStatement(tableName);
//        if (ctx.column_list() != null) {
//            insert.setColumnList(visit(ctx.column_list()));
//        }
//        if (ctx.VALUES() != null && ctx.row_value_constructor_list() != null) {
//            insert.setInsertSource(visit(ctx.row_value_constructor_list()));
//        }
//        else if (ctx.select_statement() != null) {
//            insert.setInsertSource(visit(ctx.select_statement()));
//        }
//        else if (ctx.DEFAULT() != null) {
//            insert.setDefaultValues(true);
//        }
//
//        return insert;
//    }

//    @Override
//    public ASTNode visitUpdate_statement(SQLGrammarParser.Update_statementContext ctx) {
//        ASTNode tableName = visit(ctx.table_name());
//        UpdateStatement update = new UpdateStatement(tableName);
//        for (SQLGrammarParser.AssignmentContext assignCtx : ctx.assignment()) {
//            update.addAssignment(visit(assignCtx));
//        }
//        if (ctx.where_clause() != null) {
//            update.setWhereClause(visit(ctx.where_clause()));
//        }
//        return update;
//    }
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


    /// halaaaaaaaaaaaa
    @Override
    public ASTNode visitSelect_statement(SQLGrammarParser.Select_statementContext ctx) {
        ASTNode selectList = visit(ctx.select_list());
        SelectStatement selectStmt = new SelectStatement(selectList);

        if (ctx.DISTINCT() != null) {
            selectStmt.setDistinct(true);
        } else if (ctx.ALL() != null) {
            selectStmt.setAll(true);
        }

        if (ctx.TOP() != null && ctx.NUMBER() != null) {
            selectStmt.setTopNumber(new Constant(ctx.NUMBER().getText(), "NUMBER"));
        }

        if (ctx.table_source() != null) {
            selectStmt.setFromTable(visit(ctx.table_source()));
        }

        if (ctx.join_clause() != null) {
            for (SQLGrammarParser.Join_clauseContext joinCtx : ctx.join_clause()) {
                selectStmt.addJoinClause(visit(joinCtx));
            }
        }

        if (ctx.where_clause() != null) {
            selectStmt.setWhereClause(visit(ctx.where_clause()));
        }

        if (ctx.group_by_clause() != null) {
            selectStmt.setGroupByClause(visit(ctx.group_by_clause()));
        }

        if (ctx.having_clause() != null) {
            selectStmt.setHavingClause(visit(ctx.having_clause()));
        }

        if (ctx.order_by_clause() != null) {
            selectStmt.setOrderByClause(visit(ctx.order_by_clause()));
        }

        return selectStmt;
    }


    @Override
    public ASTNode visitSelect_list(SQLGrammarParser.Select_listContext ctx) {
        if (ctx.STAR() != null) {
            return new SelectList(true);
        }

        SelectList selectList = new SelectList(false);
        if (ctx.select_element() != null) {
            for (SQLGrammarParser.Select_elementContext elementCtx : ctx.select_element()) {
                selectList.addElement(visit(elementCtx));
            }
        }
        return selectList;
    }


    @Override
    public ASTNode visitSelect_element(SQLGrammarParser.Select_elementContext ctx) {
        if (ctx.EQUAL() != null) {
            ASTNode identifier = visit(ctx.identifier());
            ASTNode expression = visit(ctx.expression());
            return new SelectElement(identifier, expression, true);
        } else {
            ASTNode expression = visit(ctx.expression());
            ASTNode alias = null;
            if (ctx.alias() != null) {
                alias = visit(ctx.alias());
            }
            return new SelectElement(expression, alias);
        }}
    @Override
    public ASTNode visitInsert_statement(SQLGrammarParser.Insert_statementContext ctx) {
        ASTNode tableName = (ASTNode) visit(ctx.table_name());
        InsertStatement insertStmt = new InsertStatement(tableName);

        if (ctx.column_list() != null) {
            insertStmt.setColumnList((ASTNode) visit(ctx.column_list()));
        }

        if (ctx.DEFAULT() != null) {
            insertStmt.setDefaultValues(true);
        } else if (ctx.row_value_constructor_list() != null) {
            insertStmt.setInsertSource((ASTNode) visit(ctx.row_value_constructor_list()));
        } else if (ctx.select_statement() != null) {
            insertStmt.setInsertSource((ASTNode) visit(ctx.select_statement()));
        }

        return insertStmt;
    }



    @Override
    public ASTNode visitUpdate_statement(SQLGrammarParser.Update_statementContext ctx) {
        ASTNode tableName = visit(ctx.table_name());
        UpdateStatement updateStmt = new UpdateStatement(tableName);

        if (ctx.assignment() != null) {
            for (SQLGrammarParser.AssignmentContext assignCtx : ctx.assignment()) {
                updateStmt.addAssignment(visit(assignCtx));
            }
        }

        if (ctx.table_source() != null) {
            updateStmt.setFromSource(visit(ctx.table_source()));
        }

        if (ctx.join_clause() != null) {
            for (SQLGrammarParser.Join_clauseContext joinCtx : ctx.join_clause()) {
                updateStmt.addJoinClause(visit(joinCtx));
            }
        }

        if (ctx.where_clause() != null) {
            updateStmt.setWhereClause(visit(ctx.where_clause()));
        }

        return updateStmt;
    }







    @Override
    public ASTNode visitGroup_by_clause(SQLGrammarParser.Group_by_clauseContext ctx) {
        GroupByClause groupBy = new GroupByClause();

        if (ctx.group_by_item() != null) {
            for (SQLGrammarParser.Group_by_itemContext itemCtx : ctx.group_by_item()) {
                groupBy.addItem(visit(itemCtx));
            }
        }

        return groupBy;
    }

    @Override
    public ASTNode visitGroup_by_item(SQLGrammarParser.Group_by_itemContext ctx) {
        if (ctx.expression() != null) {
            return new GroupByItem("EXPRESSION", visit(ctx.expression()));
        } else if (ctx.ROLLUP() != null) {
            return new GroupByItem("ROLLUP", visit(ctx.expression_list()));
        } else if (ctx.CUBE() != null) {
            return new GroupByItem("CUBE", visit(ctx.expression_list()));
        } else if (ctx.grouping_set_list() != null) {
            return new GroupByItem("GROUPING_SETS", visit(ctx.grouping_set_list()));
        }

        return null;
    }

    @Override
    public ASTNode visitGrouping_set_list(SQLGrammarParser.Grouping_set_listContext ctx) {
        GroupingSetList groupingList = new GroupingSetList();

        if (ctx.grouping_set() != null) {
            for (SQLGrammarParser.Grouping_setContext setCtx : ctx.grouping_set()) {
                groupingList.addSet(visit(setCtx));
            }
        }

        return groupingList;
    }

    @Override
    public ASTNode visitGrouping_set(SQLGrammarParser.Grouping_setContext ctx) {
        ASTNode expressionList = null;

        if (ctx.expression_list() != null) {
            expressionList = visit(ctx.expression_list());
        } else if (ctx.expression() != null) {
            expressionList = visit(ctx.expression());
        }

        return new GroupingSet(expressionList);
    }

    @Override
    public ASTNode visitOrder_by_expression(SQLGrammarParser.Order_by_expressionContext ctx) {
        ASTNode expression = visit(ctx.expression());
        String direction = "ASC";

        if (ctx.DESC() != null) {
            direction = "DESC";
        } else if (ctx.ASC() != null) {
            direction = "ASC";
        }

        return new OrderByExpression(expression, direction);
    }

}







