
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
        if (identifierNode instanceof Identifier) {
            Identifier id = (Identifier) identifierNode;
            databaseName = id.getName();
        } else {
            databaseName = ctx.identifier().getText();
        }
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

//    @Override
//    public ASTNode visitDeclaration_statement(SQLGrammarParser.Declaration_statementContext ctx) {
//        List<VariableDeclaration> declarations = new ArrayList<>();
//        for (SQLGrammarParser.Variable_declarationContext varCtx : ctx.variable_declaration()) {
//            ASTNode varNode = visit(varCtx);
//            VariableDeclaration varDecl = (VariableDeclaration) varNode;
//            declarations.add(varDecl);
//        }
//        return new DeclarationStatement(declarations);
//    }

    @Override
    public ASTNode visitSql_sdecript(SQLGrammarParser.Sql_sdecriptContext ctx) {
        List<ASTNode> statements = new ArrayList<>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i).getText().equals("<EOF>")) {
                continue;
            }
            ASTNode child = visit(ctx.getChild(i));
            if (child != null) {
                statements.add(child);
            }
        }
        return visitChildren(ctx);
    }

}
