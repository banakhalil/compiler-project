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
        String subqueryOutput = subquery.prettyPrint(indent + "  ");
        sb.append(subqueryOutput);
        if (!subqueryOutput.endsWith("\n")) {
            sb.append("\n");
        }
        String selectOutput = selectStatement.prettyPrint(indent + "  ");
        sb.append(selectOutput);
        if (!selectOutput.endsWith("\n")) {
            sb.append("\n");
        }
        return sb.toString();
    }
}
