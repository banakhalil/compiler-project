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
            String topOutput = topNumber.prettyPrint(indent + "    ");
            sb.append(topOutput);
            if (!topOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }

        if (selectList != null) {
            String selectListOutput = selectList.prettyPrint(indent + "  ");
            sb.append(selectListOutput);
            if (!selectListOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }

        if (fromTable != null) {
            String fromTableOutput = fromTable.prettyPrint(indent + "  ");
            sb.append(fromTableOutput);
            if (!fromTableOutput.endsWith("\n")) {
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
        if (groupByClause != null) {
            String groupByOutput = groupByClause.prettyPrint(indent + "  ");
            sb.append(groupByOutput);
            if (!groupByOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        if (havingClause != null) {
            String havingOutput = havingClause.prettyPrint(indent + "  ");
            sb.append(havingOutput);
            if (!havingOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        if (orderByClause != null) {
            String orderByOutput = orderByClause.prettyPrint(indent + "  ");
            sb.append(orderByOutput);
            if (!orderByOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }

        return sb.toString();
    }
}