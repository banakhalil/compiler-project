package sql;

public class Alias extends ASTNode {
    private Identifier identifier;
    private String stringValue;
    private boolean isString;
    
    public Alias(Identifier identifier) {
        this.identifier = identifier;
        this.isString = false;
    }
    
    public Alias(String stringValue) {
        this.stringValue = stringValue;
        this.isString = true;
    }
    
    public boolean isString() {
        return isString;
    }
    
    @Override
    public String prettyPrint(String indent) {
        if (isString) {
            return indent + "Alias (string): \"" + stringValue + "\"";
        } else {
            return indent + "Alias:\n" + identifier.prettyPrint(indent + "  ");
        }
    }
}
