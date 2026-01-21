package sql;



public class ModifyColumnAction extends AlterTableAction {
    private String columnName;
    private String newDataType;

    public ModifyColumnAction(String columnName, String newDataType) {
        this.columnName = columnName;
        this.newDataType = newDataType;
    }

    @Override
    public String prettyPrint(String indent) {
        return indent + "ALTER COLUMN " + this.columnName + " " + this.newDataType;
    }
}
