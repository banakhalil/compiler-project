package sql;


public class AddConstraintAction extends AlterTableAction {
    private ASTNode tableConstraint; // نعيد استخدام كلاسات TableConstraint

    public AddConstraintAction(ASTNode tableConstraint) {
        this.tableConstraint = tableConstraint;
    }

    @Override
    public String prettyPrint(String indent) {
        return indent + "ADD " + this.tableConstraint.prettyPrint("");
    }
}

