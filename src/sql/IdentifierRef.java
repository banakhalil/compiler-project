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
            sb.append(indent).append("IdentifierRef:\n");
            String qualifierOutput = qualifier.prettyPrint(indent + "  ");
            sb.append(qualifierOutput);
            if (!qualifierOutput.endsWith("\n")) {
                sb.append("\n");
            }
            sb.append(indent).append("  .\n");
            String idOutput = identifier.prettyPrint(indent + "  ");
            sb.append(idOutput);
            if (!idOutput.endsWith("\n")) {
                sb.append("\n");
            }
        } else {
            sb.append(indent).append("IdentifierRef:\n");
            if (identifier != null) {
                String idOutput = identifier.prettyPrint(indent + "  ");
                sb.append(idOutput);
                if (!idOutput.endsWith("\n")) {
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }
}
