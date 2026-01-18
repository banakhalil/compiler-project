package sql;

import java.util.List;
import java.util.ArrayList;

public class DeclareCursor extends ASTNode {
    private CursorName cursorName;
    private String scope;              // scope
    private String scrolling;      // scrolling
    private String sensitivity;
    private String concurrency;
    private boolean typeWarning;
    private SelectStatement selectStatement;
    private boolean forUpdate;         // is there an updating for the column ? yes / no
    private List<ColumnName> updateColumns;

    public DeclareCursor(CursorName cursorName, SelectStatement selectStatement) {
        this.cursorName = cursorName;
        this.selectStatement = selectStatement;
        this.updateColumns = new ArrayList<>();
    }


    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("DECLARE CURSOR:\n");
        sb.append(cursorName.prettyPrint(indent + "  "));
        sb.append("\n");
        if (scope != null)
            sb.append(indent).append("  Scope: ").append(scope).append("\n");
        if (scrolling != null)
            sb.append(indent).append("  Scrolling: ").append(scrolling).append("\n");
        if (sensitivity != null)
            sb.append(indent).append("  Sensitivity: ").append(sensitivity).append("\n");
        if (concurrency != null)
            sb.append(indent).append("  Concurrency: ").append(concurrency).append("\n");
        if (typeWarning)
            sb.append(indent).append("  Type Warning: enabled\n");
        sb.append(indent).append("  FOR:\n");
        sb.append(selectStatement.prettyPrint(indent + "    "));
        if (forUpdate) {
            sb.append("\n").append(indent).append("  FOR UPDATE");
            if (!updateColumns.isEmpty()) {
                sb.append(" OF:\n");
                for (ColumnName col : updateColumns) {
                    sb.append(col.prettyPrint(indent + "    ")).append("\n");
                }
            }
        }

        return sb.toString();
    }
}