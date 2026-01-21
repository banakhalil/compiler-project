package sql;

public class ExistPredicate extends ASTNode{
    private ASTNode subquery;

    public ExistPredicate(ASTNode subquery) {
        this.subquery = subquery;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("EXIST PREDICATE:\n");
        if (subquery != null) {
            String subqueryOutput = subquery.prettyPrint(indent + "  ");
            sb.append(subqueryOutput);
            if (!subqueryOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
