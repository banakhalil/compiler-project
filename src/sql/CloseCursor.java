package sql;

public class CloseCursor extends ASTNode {
    private boolean isGlobal;
    private ASTNode identifierRef;

    public CloseCursor(ASTNode identifierRef, boolean isGlobal) {
        this.identifierRef = identifierRef;
        this.isGlobal = isGlobal;
    }
    

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("CLOSE CURSOR:\n");
        sb.append(identifierRef.prettyPrint(indent + "  ")).append("\n");
        return sb.toString();
    }
}
