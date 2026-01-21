package sql;

import java.util.ArrayList;
import java.util.List;

public class ExpressionList extends ASTNode{
    private List<ASTNode> children = new ArrayList<>();
    public ExpressionList(List<ASTNode> children) {
        this.children = children;
    }

    public void addChild(ASTNode node){
        children.add(node);
    }
    public List<ASTNode> getExpressions() {
        return children;
    }
    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("EXPRESSION LIST:\n");
        for (ASTNode child : children) {
            String childOutput = child.prettyPrint(indent + "  ");
            sb.append(childOutput);
            if (!childOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
