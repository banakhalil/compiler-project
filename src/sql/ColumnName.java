package sql;

public class ColumnName extends ASTNode {
    public ASTNode identifierRef;

    public ColumnName(ASTNode identifierRef) {
        this.identifierRef = identifierRef;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("ColumnName: ").append(identifierRef.prettyPrint("")).append("\n");
        return sb.toString();
    }
}
