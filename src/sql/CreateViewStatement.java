package sql;


public class CreateViewStatement extends DDLStatement {
    private String viewName;
    private ASTNode selectStatement;

    public CreateViewStatement(String viewName, ASTNode selectStatement) {
        this.viewName = viewName;
        this.selectStatement = selectStatement;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("CREATE_VIEW: ").append(this.viewName).append(" AS\n");
        sb.append(this.selectStatement.prettyPrint(indent + "  "));
        return sb.toString();
    }
}

