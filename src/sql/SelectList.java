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
        if (isStar) {
            return indent + "SelectList: *\n";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("SELECT_LIST:\n");
        for (ASTNode node : elements) {
            String elementOutput = node.prettyPrint(indent + "  ");
            sb.append(elementOutput);
            if (!elementOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}