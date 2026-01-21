package sql;



public class AlterViewStatement extends DDLStatement {
    private String viewName;
    private ASTNode selectStatement; // يعيد استخدام SelectStatement

    public AlterViewStatement(String viewName, ASTNode selectStatement) {
        this.viewName = viewName;
        this.selectStatement = selectStatement;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("ALTER_VIEW: ").append(this.viewName).append(" AS\n");
        sb.append(this.selectStatement.prettyPrint(indent + "  "));
        return sb.toString();
    }
}
