package sql;

public class TruncateTableStatement extends DDLStatement {

    private String tableName;

    public TruncateTableStatement(String tableName) {
        this.tableName = tableName;
    }

    @Override
    public String prettyPrint(String indent) {
        return indent + "TRUNCATE_TABLE: " + tableName;
    }
}