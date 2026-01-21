package sql;


import java.util.List;
import java.util.ArrayList;

public class UniqueConstraint extends TableConstraint {

    private List<String> columnNames;

    public UniqueConstraint() {
        this.columnNames = new ArrayList<>();
    }

    public UniqueConstraint(List<String> columnNames) {
        // نفس النمط في حماية القائمة
        this.columnNames = (columnNames != null) ? new ArrayList<>(columnNames) : new ArrayList<>();
    }

    // Getter إذا احتجته لاحقاً
    public List<String> getColumnNames() {
        return columnNames;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("CONSTRAINT: UNIQUE (");

        // نفس طريقة طباعة أسماء الأعمدة
        sb.append(String.join(", ", columnNames));

        sb.append(")");
        return sb.toString();
    }
}


