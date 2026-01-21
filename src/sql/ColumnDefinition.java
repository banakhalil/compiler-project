//package sql;
//
//public class ColumnDefinition extends ASTNode {
//
//    private String columnName;
//    private String dataType;
//
//    public ColumnDefinition(String columnName, String dataType) {
//        this.columnName = columnName;
//        this.dataType = dataType;
//    }
//
//    @Override
//    public String prettyPrint(String indent) {
//        return indent + "COLUMN " + columnName + " : " + dataType;
//    }
//}

package sql;

import sql.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class ColumnDefinition extends ASTNode {
    private String columnName;
    private String dataType;
    private List<String> constraints; // للقيود يلي بتكون على مستوى العمود بشكل مباشر: ["NOT NULL", "DEFAULT 0"]

    public ColumnDefinition(String columnName, String dataType, List<String> constraints) {
        this.columnName = columnName;
        this.dataType = dataType;
        this.constraints = (constraints != null) ? new ArrayList<>(constraints) : new ArrayList<>();
    }

    public String getColumnName() {
        return columnName;
    }

    public String getDataType() {
        return dataType;
    }

    public List<String> getConstraints() {
        return constraints;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("COLUMN: ").append(columnName).append(" TYPE: ").append(dataType);

        if (!constraints.isEmpty()) {
            sb.append("[");
            for (int i = 0; i < constraints.size(); i++) {
                sb.append(constraints.get(i));
                if (i < constraints.size() - 1) {
                    sb.append(",");
                }
            }
            sb.append("]");
        }
        return sb.toString();
    }
}
//        if (constraints != null && !constraints.isEmpty()) {
//            sb.append(" CONSTRAINTS: [").append(String.join(", ", constraints)).append("]");
//        }
//        return sb.toString();
