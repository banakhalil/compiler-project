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
        sb.append(tableName.prettyPrint(indent + "  ")).append("\n");

        sb.append(indent).append("  SET:\n");
        for (ASTNode assign : assignments) {
            sb.append(assign.prettyPrint(indent + "    ")).append("\n");
        }

        if (fromSource != null) {
            sb.append(indent).append("  FROM_SOURCE:\n");
            sb.append(fromSource.prettyPrint(indent + "    ")).append("\n");
        }

        for (ASTNode join : joinClauses) {
            sb.append(join.prettyPrint(indent + "  ")).append("\n");
        }

        if (whereClause != null) {
            sb.append(whereClause.prettyPrint(indent + "  "));
        }

        return sb.toString().trim();
    }
}