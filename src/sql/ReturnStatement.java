package sql;

public class ReturnStatement extends ASTNode {
    private Expression expression;

    public ReturnStatement(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("ReturnStatement:\n");
        sb.append(expression.prettyPrint(indent + "  "));
        return sb.toString();
    }
}
