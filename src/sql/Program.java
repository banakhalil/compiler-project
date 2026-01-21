package sql;

import java.util.ArrayList;
import java.util.List;

public class Program extends ASTNode {
    private List<ASTNode> statements;

    public Program() {
        this.statements = new ArrayList<>();
    }

    public Program(List<ASTNode> statements) {
        this.statements = statements;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append("Program:\n");
        if (!statements.isEmpty()) {
            for (ASTNode stmt : statements) {
                String stmtOutput = stmt.prettyPrint("  ");
                sb.append(stmtOutput);
                if (!stmtOutput.endsWith("\n")) {
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }
}
