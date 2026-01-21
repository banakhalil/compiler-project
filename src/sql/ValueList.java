package sql;

import java.util.ArrayList;
import java.util.List;

public class ValueList extends ASTNode {
    private List<ASTNode> values = new ArrayList<>();

    public ValueList() {
    }

    public void addValue(ASTNode value) {
        this.values.add(value);
    }

    public List<ASTNode> getValues() {
        return values;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("VALUE_LIST:\n");

        for (ASTNode val : values) {
            if (val != null) {
                String valOutput = val.prettyPrint(indent + "  ");
                sb.append(valOutput);
                if (!valOutput.endsWith("\n")) {
                    sb.append("\n");
                }
            }
        }

        return sb.toString();
    }
}