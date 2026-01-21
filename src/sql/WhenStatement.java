package sql;

public class WhenStatement extends ASTNode{
    private ASTNode whenExpression;
    private ASTNode thenExpression;


    public WhenStatement(ASTNode whenExpression, ASTNode thenExpression) {
        this.whenExpression = whenExpression;
        this.thenExpression = thenExpression;
    }


    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("WHEN STATEMENT:\n");
        sb.append(indent).append("  WHEN:\n");
        sb.append(whenExpression.prettyPrint(indent + "    ")).append("\n");
        if (thenExpression != null) {
            sb.append(indent).append("  THEN:\n");
            sb.append(thenExpression.prettyPrint(indent + "    ")).append("\n");
        }
        return sb.toString().trim();
    }
}