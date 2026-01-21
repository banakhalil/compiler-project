package sql;

import java.util.ArrayList;
import java.util.List;

public class BlockStatement extends ASTNode {
    private List<ASTNode> statements;

    public BlockStatement() {
        this.statements = new ArrayList<>();
    }

    public BlockStatement(List<ASTNode> statements) {
        this.statements = statements;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("BlockStatement:\n");
        if (!statements.isEmpty()) {
            for (ASTNode stmt : statements) {
                String stmtOutput = stmt.prettyPrint(indent + "  ");
                sb.append(stmtOutput);
                if (!stmtOutput.endsWith("\n")) {
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }
}
