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
        sb.append(subquery.prettyPrint(indent + "  ")).append("\n");
        return sb.toString().trim();
    }
}
