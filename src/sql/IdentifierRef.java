package sql;

public class IdentifierRef extends ASTNode {
    private ASTNode identifier;
    private Identifier qualifier;
    
    public IdentifierRef(ASTNode identifier) {
        this.identifier = identifier;
        this.qualifier = null;
    }
    
    public IdentifierRef(Identifier qualifier, ASTNode identifier) {
        this.qualifier = qualifier;
        this.identifier = identifier;
    }
    

    public boolean isQualified() {
        return qualifier != null;
    }
    
    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        if (isQualified()) {
            sb.append(indent).append("IdentifierRef: ").append(qualifier.prettyPrint("")).append(".").append(identifier.prettyPrint("")).append("\n");
        } else {
            sb.append(indent).append("IdentifierRef: ").append(identifier.prettyPrint("")).append("\n");
        }
        return sb.toString();
    }
}
