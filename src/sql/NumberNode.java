package sql;

public class NumberNode extends ASTNode {
    private String value;

    public NumberNode(String value) {
        this.value = value;
    }

    @Override
    public String prettyPrint(String indent) {
        return indent + "Number: " + value;
    }
}