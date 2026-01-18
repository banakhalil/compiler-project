package sql;

public class IdentifierRef extends ASTNode {
    private String identifier;
    private String qualifier;
    
    public IdentifierRef(String identifier) {
        this.identifier = identifier;
        this.qualifier = null;
    }
    
    public IdentifierRef(String qualifier, String identifier) {
        this.qualifier = qualifier;
        this.identifier = identifier;
    }
    

    public boolean isQualified() {
        return qualifier != null;
    }
    
    @Override
    public String prettyPrint(String indent) {
        if (isQualified()) {
            return indent + "Identifier: " + qualifier + "." + identifier;
        } else {
            return indent + "Identifier: " + identifier;
        }
    }
}
