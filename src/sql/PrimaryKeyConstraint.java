package sql;


import java.util.List;
import java.util.ArrayList;

public class PrimaryKeyConstraint extends TableConstraint {

    private List<String> columnNames;

    public PrimaryKeyConstraint() {
        this.columnNames = new ArrayList<>();
    }

    public PrimaryKeyConstraint(List<String> columnNames) {
        this.columnNames = (columnNames != null) ? new ArrayList<>(columnNames) : new ArrayList<>();
    }

    public List<String> getColumnNames() {
        return columnNames;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("CONSTRAINT: PRIMARY KEY (");

        // نستخدم String.join لربط أسماء الأعمدة بفاصلة ومسافة
        sb.append(String.join(", ", columnNames));

        sb.append(")");
        return sb.toString();
    }
}




