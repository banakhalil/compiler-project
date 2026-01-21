package sql;

public class OrderByExpression extends ASTNode {
    private ASTNode expression;
    private String direction; // "ASC" or "DESC"

    public OrderByExpression(ASTNode expression, String direction) {
        this.expression = expression;
        this.direction = (direction != null) ? direction : "ASC";
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("OrderByExpression [").append(direction).append("]:\n");
        String exprOutput = expression.prettyPrint(indent + "  ");
        sb.append(exprOutput);
        if (!exprOutput.endsWith("\n")) {
            sb.append("\n");
        }
        return sb.toString();
    }
}