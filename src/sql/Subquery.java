package sql;

public class Subquery extends ASTNode{
    private ASTNode selectStatement;
    public Subquery(ASTNode selectStatement) {
        this.selectStatement = selectStatement;
    }
    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("SUBQUERY:\n");
        sb.append(selectStatement.prettyPrint(indent + "  ")).append("\n");
        return sb.toString().trim();
    }
}
