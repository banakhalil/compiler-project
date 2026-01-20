package sql;

import java.util.ArrayList;
import java.util.List;

public class BlockStatement extends ASTNode {
    private List<Statement> statements;

    public BlockStatement() {
        this.statements = new ArrayList<>();
    }

    public BlockStatement(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("BlockStatement:\n");
        if (!statements.isEmpty()) {
            for (Statement stmt : statements) {
                sb.append(stmt.prettyPrint(indent + "  ")).append("\n");
            }
        }
        return sb.toString().trim();
    }
}
