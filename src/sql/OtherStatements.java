package sql;

public class OtherStatements extends ASTNode{
    private ASTNode identifier;
    private ASTNode variable;
    private ASTNode value;
    private ASTNode expression;

    public OtherStatements(ASTNode leftSide, ASTNode rightSide, boolean isVariable, boolean isExpression){
        if (isVariable) {
            this.variable = leftSide;
            this.identifier = null;
        } else {
            this.identifier = leftSide;
            this.variable = null;
        }
        
        if (isExpression) {
            this.expression = rightSide;
            this.value = null;
        } else {
            this.value = rightSide;
            this.expression = null;
        }
    }
    
    @Override
    public String prettyPrint(String indent){
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("OtherStatements (SET):\n");
        

        sb.append(indent).append("  Left side:\n");
        if (identifier != null) {
            sb.append(identifier.prettyPrint(indent + "    ")).append("\n");
        } else if (variable != null) {
            sb.append(variable.prettyPrint(indent + "    ")).append("\n");
        }
        
        sb.append(indent).append("  Right side:\n");
        if (value != null) {
            sb.append(value.prettyPrint(indent + "    "));
        } else if (expression != null) {
            sb.append(expression.prettyPrint(indent + "    "));
        }
        
        return sb.toString();
    }
}
