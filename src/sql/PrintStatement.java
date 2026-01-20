package sql;
import java.util.ArrayList;
import java.util.List;

public class PrintStatement extends ASTNode {
    private List<ASTNode> items;  // Expression or UserVariable

    public PrintStatement() {
        this.items = new ArrayList<>();
    }

    public PrintStatement(List<ASTNode> items) {
        this.items = items;
    }

    public void addItem(ASTNode item) {
        items.add(item);
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("PrintStatement:\n");
        if (!items.isEmpty()) {
            for (ASTNode item : items) {
                sb.append(item.prettyPrint(indent + "  ")).append("\n");
            }
        }
        return sb.toString();
    }
}
