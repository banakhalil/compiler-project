package sql;

import java.util.ArrayList;
import java.util.List;

public class ColumnList extends ASTNode{
    private List<ASTNode> chlidren = new ArrayList<>();

    public ColumnList(List<ASTNode> children){
        this.chlidren = children;
    }

    public void addChild(ASTNode node){chlidren.add(node);}

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("COLUMN LIST:\n");
        for (ASTNode child : chlidren) {
            String childOutput = child.prettyPrint(indent + "  ");
            sb.append(childOutput);
            if (!childOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
