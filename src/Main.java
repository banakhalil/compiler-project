import org.antlr.v4.runtime.*;
import sql.ASTNode;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        String fileName = "src/test/test.txt";
        String fileName = "src/test/train.sql";
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

}
