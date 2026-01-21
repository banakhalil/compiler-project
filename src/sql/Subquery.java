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
        if (selectStatement != null) {
            String selectOutput = selectStatement.prettyPrint(indent + "  ");
            sb.append(selectOutput);
            if (!selectOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
