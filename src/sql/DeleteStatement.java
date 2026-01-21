package sql;

public class DeleteStatement extends ASTNode{
    private ASTNode tableName;
    private boolean hasWhere;
    private ASTNode WhereClause;

    public DeleteStatement(ASTNode tableName){
        this.tableName = tableName;
        this.hasWhere = false;
        this.WhereClause = null;
    }
    public DeleteStatement(ASTNode tableName,  ASTNode WhereClause){
        this.tableName = tableName;
        this.hasWhere = true;
        this.WhereClause = WhereClause;
    }

    @Override
    public String prettyPrint(String indent){
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("Delete Statement:\n");
        sb.append(indent).append("  Table Name:\n");
        String tableNameOutput = tableName.prettyPrint(indent + "    ");
        sb.append(tableNameOutput);
        if (!tableNameOutput.endsWith("\n")) {
            sb.append("\n");
        }
        if (hasWhere) {
            sb.append(indent).append("  WHERE:\n");
            String whereOutput = WhereClause.prettyPrint(indent + "    ");
            sb.append(whereOutput);
            if (!whereOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

}
