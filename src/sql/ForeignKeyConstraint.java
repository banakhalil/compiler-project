package sql;


import java.util.List;
import java.util.ArrayList;

public class ForeignKeyConstraint extends TableConstraint {

    private List<String> columnNames;
    private String referencedTableName;
    private List<String> referencedColumnNames;

    public ForeignKeyConstraint() {
        this.columnNames = new ArrayList<>();
        this.referencedTableName = null;
        this.referencedColumnNames = new ArrayList<>();
    }

    public ForeignKeyConstraint(List<String> columnNames, String referencedTableName, List<String> referencedColumnNames) {
        this.columnNames = (columnNames != null) ? new ArrayList<>(columnNames) : new ArrayList<>();
        this.referencedTableName = referencedTableName;
        this.referencedColumnNames = (referencedColumnNames != null) ? new ArrayList<>(referencedColumnNames) : new ArrayList<>();
    }

    // Getters
    public List<String> getColumnNames() { return columnNames; }
    public String getReferencedTableName() { return referencedTableName; }
    public List<String> getReferencedColumnNames() { return referencedColumnNames; }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("CONSTRAINT: FOREIGN KEY (");
        sb.append(String.join(", ", columnNames));
        sb.append(") REFERENCES ");
        sb.append(referencedTableName);
        sb.append("(");
        sb.append(String.join(", ", referencedColumnNames));
        sb.append(")");
        return sb.toString();
    }
}

