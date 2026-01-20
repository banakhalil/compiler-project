package sql;

import java.util.ArrayList;
import java.util.List;

public class GroupByClause extends ASTNode {
    private List<ASTNode> items = new ArrayList<>();

    public void addItem(ASTNode item) {
        this.items.add(item);
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("GROUP_BY:\n");
        for (ASTNode item : items) {
            sb.append(item.prettyPrint(indent + "  ")).append("\n");
        }
        return sb.toString().trim();
    }
}