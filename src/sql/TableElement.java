package sql;

public class TableElement extends ASTNode {
    private ASTNode element;  //  ColumnDefinition or TableConstraint

    public TableElement(ASTNode element) {
        this.element = element;
    }

    public ASTNode getElement() {
        return element;
    }

    public boolean isColumnDefinition() {
        return element instanceof ColumnDefinition;
    }

    public boolean isTableConstraint() {
        return element instanceof TableConstraint;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("TableElement:\n");
        String elementOutput = element.prettyPrint(indent + "  ");
        sb.append(elementOutput);
        if (!elementOutput.endsWith("\n")) {
            sb.append("\n");
        }
        return sb.toString();
    }
}
