package sql;

public class DeleteStatement extends ASTNode{
    private TableName tableName;
    private boolean hasWhere;
    private WhereClause clause;

    public DeleteStatement(TableName tableName){
        this.tableName = tableName;
        this.hasWhere = false;
        this.clause = null;
    }
    public DeleteStatement(TableName tableName,  WhereClause clause){
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
