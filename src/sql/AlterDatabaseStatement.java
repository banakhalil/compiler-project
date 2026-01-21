package sql;


public class AlterDatabaseStatement extends DDLStatement {
    private String databaseName;
    private String action; // مثال: "MODIFY NAME = newdb" أو "SET SINGLE_USER"

    public AlterDatabaseStatement(String databaseName, String action) {
        this.databaseName = databaseName;
        this.action = action;
    }

    @Override
    public String prettyPrint(String indent) {
        return indent + "ALTER_DATABASE: " + this.databaseName + " (" + this.action + ")";
    }
}


