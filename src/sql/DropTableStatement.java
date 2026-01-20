package sql;

import java.util.List;

public class DropTableStatement extends DDLStatement {

    private List<String> tableNames;

    public DropTableStatement(List<String> tableNames) {
        this.tableNames = tableNames;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("DROP_TABLE\n");
        for (String name : tableNames) {
            sb.append(indent).append("  ").append(name).append("\n");
        }
        return sb.toString().trim();
    }
}