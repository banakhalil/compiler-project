package sql;

public class ColumnName extends ASTNode {
    private String columnName;
    
    public ColumnName(String columnName) {
        this.columnName = columnName;
    }
    
    public String getColumnName() {
        return columnName;
    }
    
    @Override
    public String prettyPrint(String indent) {
        return indent + "Column name: " + columnName;
    }
}
