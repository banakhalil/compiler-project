import org.antlr.v4.runtime.*;
import sql.ASTNode;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "src/test/test.txt";
        SQLGrammarParser parser = getParser(fileName);
        
        if (parser == null) {
            System.err.println("Error: Failed to create parser. Check if the file exists: " + fileName);
            System.exit(1);
        }
        
        SQLGrammarParser.Sql_sdecriptContext tree = parser.sql_sdecript();
        ASTBuilderVisitor visitor = new ASTBuilderVisitor();
        System.out.println("Hi, this is working fine");
        ASTNode astNode = visitor.visit(tree);
        
        if (astNode == null) {
            System.err.println("Error: AST is null. Check if the input was parsed correctly.");
            System.exit(1);
        }
        
        System.out.println(astNode.prettyPrint(" "));
        if(visitor.semanticsErrors.isEmpty()){
            System.out.println("No semantic errors found.");
        }else {
            for (String error : visitor.semanticsErrors) {
                System.out.println(error);
            }
        }

    }

    private static SQLGrammarParser getParser(String fileName)  {
        SQLGrammarParser parser = null;
        try {
            CharStream input = CharStreams.fromFileName(fileName);
            SQLGrammarLexer lexer = new SQLGrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new SQLGrammarParser(tokens);
        } catch (IOException e) {
            System.err.println("Error reading file: " + fileName);
            System.err.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }
        return parser;
    }
//    albatool
    @Override
    public ASTNode visitCreateTable(SQLGrammarParser.CreateTableContext ctx) {

        String tableName = ctx.tableName.getText();
        List<ASTNode> columns = new ArrayList<>();

        for (SQLGrammarParser.TableElementContext el : ctx.tableElement()) {
            if (el.columnDefinition() != null) {
                String colName = el.columnDefinition().columnName.getText();
                String type = el.columnDefinition().dataType().getText();
                columns.add(new ColumnDefinition(colName, type));
            }
        }

        return new CreateTableStatement(tableName, columns);
    }

    @Override
    public ASTNode visitDropStatement(SQLGrammarParser.DropStatementContext ctx) {

        List<String> tables = new ArrayList<>();
        for (SQLGrammarParser.FullIdentifierContext id : ctx.fullIdentifier()) {
            tables.add(id.getText());
        }

        return new DropTableStatement(tables);
    }

    @Override
    public ASTNode visitTruncateStatement(SQLGrammarParser.TruncateStatementContext ctx) {
        return new TruncateTableStatement(ctx.fullIdentifier().getText());
    }
}
