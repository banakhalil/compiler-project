package sql;

public class Alias extends ASTNode {
    private ASTNode identifier;
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
        StringBuilder sb = new StringBuilder();
        if (isString) {
            sb.append(indent).append("Alias (string): \"").append(stringValue).append("\"\n");
        } else {
            sb.append(indent).append("Alias:\n").append(identifier.prettyPrint(indent + "  "));
        }
        return sb.toString().trim();
    }
}
