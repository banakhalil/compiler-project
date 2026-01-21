package sql;


import java.util.ArrayList;
import java.util.List;

public class CreateIndexStatement extends DDLStatement {
    private String indexName;
    private boolean isUnique;
    private String tableName;
    private List<ASTNode> columns;

    public CreateIndexStatement(String indexName, boolean isUnique, String tableName, List<ASTNode> columns) {
        this.indexName = indexName;
        this.isUnique = isUnique;
        this.tableName = tableName;
        this.columns = (columns != null) ? new ArrayList<>(columns) : new ArrayList<>();
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("CREATE_INDEX: ").append(this.indexName).append("\n");
        sb.append(indent).append("  TYPE: ").append(this.isUnique ? "UNIQUE" : "NON-UNIQUE").append("\n");
        sb.append(indent).append("  ON TABLE: ").append(this.tableName).append("\n");
        sb.append(indent).append("  COLUMNS:\n");
        for (ASTNode col : this.columns) {
            sb.append(col.prettyPrint(indent + "    ")).append("\n");
        }
        return sb.toString().trim();
    }
}

