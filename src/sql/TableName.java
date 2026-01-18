package sql;

public class TableName extends ASTNode {
    public IdentifierRef identifierRef;
    
    public TableName(IdentifierRef identifierRef) {
        this.identifierRef = identifierRef;
    }
    
    @Override
    public String prettyPrint(String indent) {
        return indent + "Table name:\n" + identifierRef.prettyPrint(indent + "  ");
    }
}
