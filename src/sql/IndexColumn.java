package sql;


public class IndexColumn extends ASTNode {
    private String columnName;
    private boolean isAscending;

    public IndexColumn(String columnName, boolean isAscending) {
        this.columnName = columnName;
        this.isAscending = isAscending;
    }

    @Override
    public String prettyPrint(String indent) {
        return indent + this.columnName + " " + (this.isAscending ? "ASC" : "DESC");
    }
}
