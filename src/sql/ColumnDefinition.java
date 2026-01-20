package sql;

public class ColumnDefinition extends ASTNode {

    private String columnName;
    private String dataType;

    public ColumnDefinition(String columnName, String dataType) {
        this.columnName = columnName;
        this.dataType = dataType;
    }

    @Override
    public String prettyPrint(String indent) {
        return indent + "COLUMN " + columnName + " : " + dataType;
    }
}