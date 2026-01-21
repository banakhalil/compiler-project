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
        if (expression != null) {
            String exprOutput = expression.prettyPrint(indent + "  ");
            sb.append(exprOutput);
            if (!exprOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
