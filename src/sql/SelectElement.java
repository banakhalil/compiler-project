package sql;

public class SelectElement extends ASTNode {
    private ASTNode expression;
    private ASTNode alias;
    private ASTNode identifier;
    private boolean isAssignment;

    public SelectElement(ASTNode expression, ASTNode alias) {
        this.expression = expression;
        this.alias = alias;
        this.isAssignment = false;
    }

    public SelectElement(ASTNode identifier, ASTNode expression, boolean isAssignment) {
        this.identifier = identifier;
        this.expression = expression;
        this.isAssignment = isAssignment;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        if (isAssignment) {
            sb.append(indent).append("SELECT_ELEMENT (Assignment Style):\n");
            if (identifier != null) sb.append(identifier.prettyPrint(indent + "  ")).append("\n");
            sb.append(indent).append("  =\n");
            if (expression != null) sb.append(expression.prettyPrint(indent + "  "));
        } else {
            sb.append(indent).append("SELECT_ELEMENT:\n");
            if (expression != null) sb.append(expression.prettyPrint(indent + "  "));
            if (alias != null) {
                sb.append("\n").append(alias.prettyPrint(indent + "  "));
            }
        }
        return sb.toString();
    }
}