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
        String tableNameOutput = tableName.prettyPrint(indent + "  ");
        sb.append(tableNameOutput);
        if (!tableNameOutput.endsWith("\n")) {
            sb.append("\n");
        }

        if (columnList != null) {
            sb.append(indent).append("  TARGET_COLUMNS:\n");
            String colListOutput = columnList.prettyPrint(indent + "    ");
            sb.append(colListOutput);
            if (!colListOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }

        if (isDefaultValues) {
            sb.append(indent).append("  SOURCE: DEFAULT VALUES\n");
        } else if (insertSource != null) {
            sb.append(indent).append("  SOURCE:\n");
            String sourceOutput = insertSource.prettyPrint(indent + "    ");
            sb.append(sourceOutput);
            if (!sourceOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }

        return sb.toString();
    }
}