package sql;

public class DeallocateCursor extends ASTNode {
    private ASTNode identifierRef;

    
    public DeallocateCursor(ASTNode identifierRef) {
        this.identifierRef = identifierRef ;
    }
    

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("DEALLOCATE CURSOR:\n");
        sb.append(identifierRef.prettyPrint(indent + "  ")).append("\n");
        
        return sb.toString();
    }
}
