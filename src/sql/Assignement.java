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
        sb.append(columnName.prettyPrint(indent + "  ")).append("\n");
        sb.append(expression.prettyPrint(indent + "  ")).append("\n");
        return sb.toString().trim();
    }
}
