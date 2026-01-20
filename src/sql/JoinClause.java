package sql;


public class JoinClause extends ASTNode{
    private TableSource tableSource;
    private Expression expression;

    public JoinClause(TableSource tableSource){
        this.tableSource = tableSource;
    }

    public JoinClause(TableSource tableSource, Expression expression){
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
        sb.append(tableSource.prettyPrint(indent + "    ")).append("\n");
        
        if (expression != null) {
            sb.append(indent).append("  ON Condition:\n");
            sb.append(expression.prettyPrint(indent + "    "));
        }
        
        return sb.toString();
    }
}
