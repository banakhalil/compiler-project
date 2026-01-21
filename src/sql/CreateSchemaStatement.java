package sql;


public class CreateSchemaStatement extends DDLStatement {
    private String schemaName;
    private String authorizationName;

    public CreateSchemaStatement(String schemaName, String authorizationName) {
        this.schemaName = schemaName;
        this.authorizationName = authorizationName;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("CREATE_SCHEMA: ").append(this.schemaName);
        if (this.authorizationName != null) {
            sb.append(" AUTHORIZATION ").append(this.authorizationName);
        }
        return sb.toString();
    }
}

