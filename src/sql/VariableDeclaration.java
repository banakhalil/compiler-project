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
        sb.append(indent).append("VariableDeclaration:\n");
        
        sb.append(indent).append("  Variable:\n");
        String varOutput = variable.prettyPrint(indent + "    ");
        sb.append(varOutput);
        if (!varOutput.endsWith("\n")) {
            sb.append("\n");
        }
        
        sb.append(indent).append("  DataType:\n");
        String typeOutput = dataType.prettyPrint(indent + "    ");
        sb.append(typeOutput);
        if (!typeOutput.endsWith("\n")) {
            sb.append("\n");
        }
        
        if (expression != null) {
            sb.append(indent).append("  Initial Value:\n");
            String exprOutput = expression.prettyPrint(indent + "    ");
            sb.append(exprOutput);
            if (!exprOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        
        return sb.toString();
    }
}
