package sql;


public class JoinClause extends ASTNode{
    private ASTNode tableSource;
    private ASTNode expression;

    public JoinClause(ASTNode tableSource){
        this.tableSource = tableSource;
    }

    public JoinClause(ASTNode tableSource, ASTNode expression){
        this.tableSource = tableSource;
        this.expression = expression;
    }

    @Override
    public String prettyPrint(String indent){
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("JoinClause:\n");
        
        if (expression == null) {
            sb.append(indent).append("  CROSS JOIN\n");
        } else {
            sb.append(indent).append("  JOIN (INNER/LEFT/RIGHT/FULL)\n");
        }
        
        sb.append(indent).append("  Table Source:\n");
        String tableOutput = tableSource.prettyPrint(indent + "    ");
        sb.append(tableOutput);
        if (!tableOutput.endsWith("\n")) {
            sb.append("\n");
        }
        
        if (expression != null) {
            sb.append(indent).append("  ON Condition:\n");
            String exprOutput = expression.prettyPrint(indent + "    ");
            sb.append(exprOutput);
            if (!exprOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        
        return sb.toString();
    }
}
