package sql;

public class HavingClause extends ASTNode{
    private ASTNode expression;
    public HavingClause(ASTNode expression) {
        this.expression = expression;
    }
    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("HAVING CLAUSE:\n");
        sb.append(expression.prettyPrint(indent + "  ")).append("\n");
        return sb.toString();
    }
}
