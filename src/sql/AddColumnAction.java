package sql;

public class AddColumnAction extends AlterTableAction {
    private ASTNode columnDefinition; // نعيد استخدام كلاس ColumnDefinition

    public AddColumnAction(ASTNode columnDefinition) {
        this.columnDefinition = columnDefinition;
    }

    @Override
    public String prettyPrint(String indent) {
        return indent + "ADD " + this.columnDefinition.prettyPrint("");
    }
}

