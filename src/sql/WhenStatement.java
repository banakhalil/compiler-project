package sql;

public class WhenStatement extends ASTNode{
    private ASTNode expression;

    public WhenStatement(ASTNode expression) {
        this.expression = expression;
    }
    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("WHEN STATEMENT:\n");
        sb.append(expression.prettyPrint(indent + "  ")).append("\n");
        return sb.toString().trim();
    }
}
