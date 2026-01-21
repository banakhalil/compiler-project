package sql;

public class IfStatement extends ASTNode {
    private ASTNode expression;        
    private ASTNode ifStatement;      
    private ASTNode elseStatement;     

    public IfStatement(ASTNode expression) {
        this.expression = expression;
        this.ifStatement = null;
        this.elseStatement = null;
    }

    public IfStatement(ASTNode expression, ASTNode ifStatement) {
        this.expression = expression;
        this.ifStatement = ifStatement;
        this.elseStatement = null;
    }

    public IfStatement(ASTNode expression, ASTNode ifStatement, ASTNode elseStatement) {
        this.expression = expression;
        this.ifStatement = ifStatement;
        this.elseStatement = elseStatement;
    }

    public ASTNode getExpression() {
        return expression;
    }

    public ASTNode getIfStatement() {
        return ifStatement;
    }

    public ASTNode getElseStatement() {
        return elseStatement;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("IfStatement:\n");
        
        // Condition
        sb.append(indent).append("  Condition:\n");
        if (expression != null) {
            String exprOutput = expression.prettyPrint(indent + "    ");
            sb.append(exprOutput);
            if (!exprOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        
        // If body 
        if (ifStatement != null) {
            sb.append(indent).append("  If Body:\n");
            String ifBodyOutput = ifStatement.prettyPrint(indent + "    ");
            sb.append(ifBodyOutput);
            if (!ifBodyOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        
        // Else body 
        if (elseStatement != null) {
            sb.append(indent).append("  Else Body:\n");
            String elseBodyOutput = elseStatement.prettyPrint(indent + "    ");
            sb.append(elseBodyOutput);
            if (!elseBodyOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        
        return sb.toString();
    }
}
