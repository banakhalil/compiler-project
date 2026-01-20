package sql;

public class TableName extends ASTNode {
    public ASTNode identifierRef;
    
    public TableName(IdentifierRef identifierRef) {
        this.identifierRef = identifierRef;
    }
    
    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("TableName: ").append(identifierRef.prettyPrint("")).append("\n");
        return sb.toString();
    }
}
