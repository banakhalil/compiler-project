package sql;

public class Assignement extends ASTNode{
    private ASTNode columnName;
    private ASTNode expression;

    public Assignement(ASTNode columnName, ASTNode expression) {
        this.columnName = columnName;
        this.expression = expression;
    }
    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("ASSIGNMENT:\n");
        String colOutput = columnName.prettyPrint(indent + "  ");
        sb.append(colOutput);
        if (!colOutput.endsWith("\n")) {
            sb.append("\n");
        }
        String exprOutput = expression.prettyPrint(indent + "  ");
        sb.append(exprOutput);
        if (!exprOutput.endsWith("\n")) {
            sb.append("\n");
        }
        return sb.toString();
    }
}
