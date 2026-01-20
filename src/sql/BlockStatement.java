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
                sb.append(stmt.prettyPrint(indent + "  ")).append("\n");
            }
        }
        return sb.toString().trim();
    }
}
