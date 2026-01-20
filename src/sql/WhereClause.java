package sql;

public class WhereClause extends ASTNode{
    private ASTNode expression;

    public WhereClause(ASTNode expression) {
        this.expression = expression;
    }
    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("WHERE CLAUSE:\n");
        sb.append(expression.prettyPrint(indent + "  ")).append("\n");
        return sb.toString();
    }
}
