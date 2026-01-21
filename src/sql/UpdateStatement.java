package sql;

import java.util.ArrayList;
import java.util.List;

public class UpdateStatement extends ASTNode {
    private ASTNode tableName;
    private List<ASTNode> assignments = new ArrayList<>();
    private ASTNode fromSource;
    private List<ASTNode> joinClauses = new ArrayList<>();
    private ASTNode whereClause;

    public UpdateStatement(ASTNode tableName) {
        this.tableName = tableName;
    }

    public void addAssignment(ASTNode assignment) {
        this.assignments.add(assignment);
    }

    public void setFromSource(ASTNode fromSource) {
        this.fromSource = fromSource;
    }

    public void addJoinClause(ASTNode join) {
        this.joinClauses.add(join);
    }

    public void setWhereClause(ASTNode where) {
        this.whereClause = where;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("UPDATE_STATEMENT:\n");
        String tableNameOutput = tableName.prettyPrint(indent + "  ");
        sb.append(tableNameOutput);
        if (!tableNameOutput.endsWith("\n")) {
            sb.append("\n");
        }

        sb.append(indent).append("  SET:\n");
        for (ASTNode assign : assignments) {
            String assignOutput = assign.prettyPrint(indent + "    ");
            sb.append(assignOutput);
            if (!assignOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }

        if (fromSource != null) {
            sb.append(indent).append("  FROM_SOURCE:\n");
            String fromOutput = fromSource.prettyPrint(indent + "    ");
            sb.append(fromOutput);
            if (!fromOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }

        for (ASTNode join : joinClauses) {
            String joinOutput = join.prettyPrint(indent + "  ");
            sb.append(joinOutput);
            if (!joinOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }

        if (whereClause != null) {
            String whereOutput = whereClause.prettyPrint(indent + "  ");
            sb.append(whereOutput);
            if (!whereOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }

        return sb.toString();
    }
}