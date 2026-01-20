import org.antlr.v4.runtime.*;
import sql.ASTNode;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\batoo\\IdeaProjects\\compiler-project\\src\\test\\test.txt";
        SQLGrammarParser parser = getParser(fileName);
        SQLGrammarParser.Sql_sdecriptContext tree = parser.sql_sdecript();
        ASTBuilderVisitor visitor = new ASTBuilderVisitor();
        System.out.println("Hi, this is working fine");
        ASTNode astNode = visitor.visit(tree);
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
            e.printStackTrace();
        }
        return parser;
    }

}
