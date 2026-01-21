package sql;

public class Value extends ASTNode {
    private ASTNode valueNode; // Can be Identifier, UserVariable, NumberNode, Constant, or FunctionCall
    
    public Value(ASTNode valueNode) {
        this.valueNode = valueNode;
    }
    
    public ASTNode getValueNode() {
        return valueNode;
    }
    
    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("Value:\n");
        if (valueNode != null) {
            sb.append(valueNode.prettyPrint(indent + "  "));
        }
        return sb.toString();
    }
}
