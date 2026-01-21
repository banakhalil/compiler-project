package sql;


public class AlterIndexStatement extends DDLStatement {
    private String indexName;
    private String tableName;
    private String action; // "REBUILD" أو "DISABLE"

    public AlterIndexStatement(String indexName, String tableName, String action) {
        this.indexName = indexName;
        this.tableName = tableName;
        this.action = action;
    }

    @Override
    public String prettyPrint(String indent) {
        return indent + "ALTER_INDEX: " + this.indexName + " ON " + this.tableName + " (" + this.action + ")";
    }
}
