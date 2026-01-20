package sql;

public class UseStatement extends ASTNode {
    private String databaseName;

    public UseStatement(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public String prettyPrint(String indent) {
        return indent + "UseStatement: " + databaseName;
    }
}

