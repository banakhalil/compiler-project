package sql;

public class OtherStatements extends ASTNode{
    private Identifier identifier;
    private UserVariable variable;
    private Value value;
    private Expression expression;

    public OtherStatements(Identifier identifier, Value value){
        this.identifier = identifier;
        this.value = value;
        this.variable = null;
        this.expression = null;
    }
    public OtherStatements(UserVariable variable, Value value){
        this.identifier = null;
        this.value = value;
        this.variable = variable;
        this.expression = null;
    }
    public OtherStatements(Identifier identifier, Expression expression){
        this.identifier = identifier;
        this.value = null;
        this.variable = null;
        this.expression = expression;
    }

    public OtherStatements(UserVariable variable, Expression expression){
        this.identifier = null;
        this.value = null;
        this.variable = variable;
        this.expression = expression;
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
