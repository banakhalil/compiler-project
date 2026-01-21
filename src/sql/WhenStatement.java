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
        String whenOutput = whenExpression.prettyPrint(indent + "    ");
        sb.append(whenOutput);
        if (!whenOutput.endsWith("\n")) {
            sb.append("\n");
        }
        if (thenExpression != null) {
            sb.append(indent).append("  THEN:\n");
            String thenOutput = thenExpression.prettyPrint(indent + "    ");
            sb.append(thenOutput);
            if (!thenOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}