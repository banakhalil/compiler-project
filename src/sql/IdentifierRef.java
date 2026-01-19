package sql;

public class IdentifierRef extends ASTNode {
    private Identifier identifier;
    private Identifier qualifier;
    
    public IdentifierRef(Identifier identifier) {
        this.identifier = identifier;
        this.qualifier = null;
    }
    
    public IdentifierRef(Identifier qualifier, Identifier identifier) {
        this.qualifier = qualifier;
        this.identifier = identifier;
    }
    

    public boolean isQualified() {
        return qualifier != null;
    }
    
    @Override
    public String prettyPrint(String indent) {
        if (isQualified()) {
            return indent + "IdentifierRef: " + qualifier.prettyPrint("") + "." + identifier.prettyPrint("");
        } else {
            return indent + "IdentifierRef: " + identifier.prettyPrint("");
        }
    }
}
