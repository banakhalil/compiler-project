package sql;

public class VariableDeclaration extends ASTNode {
    private ASTNode variable;
    private ASTNode dataType;
    private ASTNode expression;

    public VariableDeclaration(ASTNode variable, ASTNode dataType) {
        this.variable = variable;
        this.dataType = dataType;
        this.expression = null;
    }

    public VariableDeclaration(ASTNode variable, ASTNode dataType, ASTNode expression) {
        this.variable = variable;
        this.dataType = dataType;
        this.expression = expression;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("VariableDeclaration: ");
        sb.append(variable.prettyPrint(""));
        sb.append(" ").append(dataType.prettyPrint(""));
        
        if (expression != null) {
            sb.append(" = ");
            sb.append(expression.prettyPrint(""));
        }
        
        return sb.toString();
    }
}
