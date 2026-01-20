package sql;

import java.util.ArrayList;
import java.util.List;

public class SelectStatement extends ASTNode {
    private boolean isDistinct = false;
    private boolean isAll = false;

    private ASTNode topNumber;
    private ASTNode selectList;
    private ASTNode fromTable;
    private List<ASTNode> joinClauses = new ArrayList<>();
    private ASTNode whereClause;
    private ASTNode groupByClause;
    private ASTNode havingClause;
    private ASTNode orderByClause;

    public SelectStatement(ASTNode selectList) {
        this.selectList = selectList;
    }

    public void setDistinct(boolean distinct) { isDistinct = distinct; }
    public void setAll(boolean all) { isAll = all; }
    public void setTopNumber(ASTNode topNumber) { this.topNumber = topNumber; }
    public void setFromTable(ASTNode fromTable) { this.fromTable = fromTable; }
    public void addJoinClause(ASTNode join) { this.joinClauses.add(join); }
    public void setWhereClause(ASTNode where) { this.whereClause = where; }
    public void setGroupByClause(ASTNode groupBy) { this.groupByClause = groupBy; }
    public void setHavingClause(ASTNode having) { this.havingClause = having; }
    public void setOrderByClause(ASTNode orderBy) { this.orderByClause = orderBy; }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("SELECT_STATEMENT");
        if (isDistinct) sb.append(" [DISTINCT]");
        if (isAll) sb.append(" [ALL]");
        sb.append(":\n");

        if (topNumber != null) {
            sb.append(indent).append("  TOP:\n");
            sb.append(topNumber.prettyPrint(indent + "    ")).append("\n");
        }

        sb.append(selectList.prettyPrint(indent + "  ")).append("\n");

        if (fromTable != null) {
            sb.append(fromTable.prettyPrint(indent + "  ")).append("\n");
        }

        for (ASTNode join : joinClauses) {
            sb.append(join.prettyPrint(indent + "  ")).append("\n");
        }

        if (whereClause != null) sb.append(whereClause.prettyPrint(indent + "  ")).append("\n");
        if (groupByClause != null) sb.append(groupByClause.prettyPrint(indent + "  ")).append("\n");
        if (havingClause != null) sb.append(havingClause.prettyPrint(indent + "  ")).append("\n");
        if (orderByClause != null) sb.append(orderByClause.prettyPrint(indent + "  ")).append("\n");

        return sb.toString().trim();
    }
}