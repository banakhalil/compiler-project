package sql;

public class ColumnName extends ASTNode {
    public ASTNode identifierRef;

    public ColumnName(ASTNode identifierRef) {
        this.identifierRef = identifierRef;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("ColumnName:\n");
        if (identifierRef != null) {
            String idRefOutput = identifierRef.prettyPrint(indent + "  ");
            sb.append(idRefOutput);
            if (!idRefOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
