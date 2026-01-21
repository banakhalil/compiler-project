package sql;

import java.util.List;

public class CreateTableStatement extends DDLStatement {

    private String tableName;
    private List<ASTNode> columns;

    public CreateTableStatement(String tableName, List<ASTNode> columns) {
        this.tableName = tableName;
        this.columns = columns;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("CREATE_TABLE\n");
        sb.append(indent).append("  TABLE: ").append(tableName).append("\n");
        sb.append(indent).append("  COLUMNS:\n");

        for (ASTNode col : columns) {
            sb.append(col.prettyPrint(indent + "    ")).append("\n");
        }

        return sb.toString().trim();
    }
}


