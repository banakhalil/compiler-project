package sql;



import java.util.ArrayList;
import java.util.List;

public class AlterTableStatement extends DDLStatement {
    private String tableName;
    private List<ASTNode> actions;

    public AlterTableStatement(String tableName, List<ASTNode> actions) {
        this.tableName = tableName;
        this.actions = (actions != null) ? new ArrayList<>(actions) : new ArrayList<>();
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("ALTER_TABLE: ").append(this.tableName).append("\n");
        sb.append(indent).append("ACTIONS:\n");
        for (ASTNode action : this.actions) {
            String actionOutput = action.prettyPrint(indent + "  ");
            sb.append(actionOutput);
            if (!actionOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}

