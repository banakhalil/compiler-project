package sql;

import java.util.ArrayList;
import java.util.List;

public class OrderByClause extends ASTNode {
    private List<ASTNode> expressions = new ArrayList<>();

    public void addExpression(ASTNode expr) {
        this.expressions.add(expr);
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("ORDER_BY:\n");
        for (ASTNode expr : expressions) {
            sb.append(expr.prettyPrint(indent + "  ")).append("\n");
        }
        return sb.toString().trim();
    }
}