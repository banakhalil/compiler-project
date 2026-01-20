package sql;

public class InsertStatement extends ASTNode {
    private ASTNode tableName;
    private ASTNode columnList;
    private ASTNode insertSource;
    private boolean isDefaultValues = false;

    public InsertStatement(ASTNode tableName) {
        this.tableName = tableName;
    }

    public void setColumnList(ASTNode columnList) { this.columnList = columnList; }
    public void setInsertSource(ASTNode source) { this.insertSource = source; }
    public void setDefaultValues(boolean defaultValues) { isDefaultValues = defaultValues; }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("INSERT_STATEMENT:\n");
        sb.append(tableName.prettyPrint(indent + "  ")).append("\n");

        if (columnList != null) {
            sb.append(indent).append("  TARGET_COLUMNS:\n");
            sb.append(columnList.prettyPrint(indent + "    ")).append("\n");
        }

        if (isDefaultValues) {
            sb.append(indent).append("  SOURCE: DEFAULT VALUES");
        } else if (insertSource != null) {
            sb.append(indent).append("  SOURCE:\n");
            sb.append(insertSource.prettyPrint(indent + "    "));
        }

        return sb.toString();
    }
}