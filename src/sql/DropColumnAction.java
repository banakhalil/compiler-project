package sql;


public class DropColumnAction extends AlterTableAction {
    private String columnName;

    public DropColumnAction(String columnName) {
        this.columnName = columnName;
    }

    @Override
    public String prettyPrint(String indent) {
        return indent + "DROP COLUMN " + this.columnName;
    }
}

