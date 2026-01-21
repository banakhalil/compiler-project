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
            if (identifier != null) {
                String idOutput = identifier.prettyPrint(indent + "  ");
                sb.append(idOutput);
                if (!idOutput.endsWith("\n")) {
                    sb.append("\n");
                }
            }
            sb.append(indent).append("  =\n");
            if (expression != null) {
                String exprOutput = expression.prettyPrint(indent + "  ");
                sb.append(exprOutput);
                if (!exprOutput.endsWith("\n")) {
                    sb.append("\n");
                }
            }
        } else {
            sb.append(indent).append("SELECT_ELEMENT:\n");
            if (expression != null) {
                String exprOutput = expression.prettyPrint(indent + "  ");
                sb.append(exprOutput);
                if (!exprOutput.endsWith("\n")) {
                    sb.append("\n");
                }
            }
            if (alias != null) {
                String aliasOutput = alias.prettyPrint(indent + "  ");
                sb.append(aliasOutput);
                if (!aliasOutput.endsWith("\n")) {
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }
}