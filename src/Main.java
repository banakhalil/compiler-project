import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
//            String fileName = "testing.sql";
            String fileName = "test.txt";
            SQLGrammarLexer lexer = new SQLGrammarLexer(CharStreams.fromFileName(fileName));

            while (true) {
                Token token = lexer.nextToken();
                if (token.getType() == Token.EOF) {
                    break;
                }
                String tokenType = lexer.getVocabulary().getSymbolicName(token.getType());
                String tokenText = token.getText();
                int line = token.getLine();
                int charPosition = token.getCharPositionInLine();
                
                System.out.printf("%-20s | %-20s | Line: %-4d | Col: %-4d%n",
                        tokenText, tokenType, line, charPosition);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
