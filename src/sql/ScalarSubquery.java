package sql;

public class ScalarSubquery extends ASTNode{
    private ASTNode subquery;
    private ASTNode selectStatement;

    public ScalarSubquery(ASTNode subquery, ASTNode selectStatement) {
        this.subquery = subquery;
        this.selectStatement = selectStatement;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("SCALAR SUBQUERY:\n");
        sb.append(subquery.prettyPrint(indent + "  ")).append("\n");
        sb.append(selectStatement.prettyPrint(indent + "  ")).append("\n");
        return sb.toString().trim();
    }
}
