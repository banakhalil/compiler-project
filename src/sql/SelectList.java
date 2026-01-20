package sql;
import java.util.ArrayList;
import java.util.List;

public class SelectList extends ASTNode {
    private boolean isStar;
    private List<ASTNode> elements = new ArrayList<>();

    public SelectList(boolean isStar) {
        this.isStar = isStar;
    }

    public void addElement(ASTNode element) {
        this.elements.add(element);
    }

    @Override
    public String prettyPrint(String indent) {
        if (isStar) return indent + "SelectList: *";
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("SELECT_LIST:\n");
        for (ASTNode node : elements) {
            sb.append(node.prettyPrint(indent + "  ")).append("\n");
        }
        return sb.toString().trim();
    }
}