//package sql;
//
//
//public class IndexColumn extends ASTNode {
//    private String columnName;
//    private boolean isAscending;
//
//    public IndexColumn(String columnName, boolean isAscending) {
//        this.columnName = columnName;
//        this.isAscending = isAscending;
//    }
//
//    @Override
//    public String prettyPrint(String indent) {
//        return indent + this.columnName + " " + (this.isAscending ? "ASC" : "DESC");
//    }
//}
package sql;

public class IndexColumn extends ASTNode {
    private ASTNode identifier;
    private String sortOrder;

    public IndexColumn(ASTNode identifier, String sortOrder) {
        this.identifier = identifier;
        this.sortOrder = sortOrder;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("INDEX_COLUMN (Order: ").append(sortOrder).append("):\n");
        String idOutput = identifier.prettyPrint(indent + "  ");
        sb.append(idOutput);
        if (!idOutput.endsWith("\n")) {
            sb.append("\n");
        }
        return sb.toString();
    }
}