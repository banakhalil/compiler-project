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
        return indent + expression.prettyPrint("") + " [" + direction + "]";
    }
}