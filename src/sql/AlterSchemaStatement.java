package sql;


public class AlterSchemaStatement extends DDLStatement {
    private String schemaName;
    private String action;

    public AlterSchemaStatement(String schemaName, String action) {
        this.schemaName = schemaName;
        this.action = action;
    }

    @Override
    public String prettyPrint(String indent) {
        return indent + "ALTER_SCHEMA: " + this.schemaName + " (" + this.action + ")";
    }
}
