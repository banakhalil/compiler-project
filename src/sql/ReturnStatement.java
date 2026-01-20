package sql;

public class ReturnStatement extends ASTNode {
    private ASTNode expression;

    public ReturnStatement(ASTNode expression) {
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
