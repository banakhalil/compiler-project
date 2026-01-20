package sql;

public class DeleteStatement extends ASTNode{
    private ASTNode tableName;
    private boolean hasWhere;
    private ASTNode clause;

    public DeleteStatement(ASTNode tableName){
        this.tableName = tableName;
        this.hasWhere = false;
        this.clause = null;
    }
    public DeleteStatement(ASTNode tableName,  ASTNode clause){
        this.tableName = tableName;
        this.hasWhere = true;
        this.clause = clause;
    }

    @Override
    public String prettyPrint(String indent){
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("Delete Statement:\n");
        sb.append(indent).append("  Table Name:\n");
        sb.append(tableName.prettyPrint(indent + "    ")).append("\n");
        if (hasWhere) {
            sb.append(indent).append("  WHERE:\n");
            sb.append(clause.prettyPrint(indent + "    ")).append("\n");
        }
        return sb.toString();
    }

}
