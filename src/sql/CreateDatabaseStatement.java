package sql;

public class CreateDatabaseStatement extends DDLStatement {
    private String databaseName;

    public CreateDatabaseStatement(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public String prettyPrint(String indent) {
        return indent + "CREATE_DATABASE: " + databaseName;
    }
}
