package sql;

public class PrimaryExpression extends ASTNode{
    private ASTNode columnName;
    private ASTNode constant;
    private ASTNode identifier;
    private ASTNode functionCall;
    private ASTNode expression;
    private ASTNode subquery;

    public PrimaryExpression(ASTNode columnName, ASTNode constant, ASTNode identifier, ASTNode functionCall, ASTNode expression, ASTNode subquery)
    {
        this.columnName = columnName;
        this.constant = constant;
        this.identifier = identifier;
        this.functionCall = functionCall;
        this.expression = expression;
        this.subquery = subquery;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("PRIMARY EXPRESSION:\n");
        if (columnName != null) {
            sb.append(columnName.prettyPrint(indent + "  ")).append("\n");
        }
        if (constant != null) {
            sb.append(constant.prettyPrint(indent + "  ")).append("\n");
        }
        if (identifier != null) {
            sb.append(identifier.prettyPrint(indent + "  ")).append("\n");
        }
        if (functionCall != null) {
            sb.append(functionCall.prettyPrint(indent + "  ")).append("\n");
        }
        if (expression != null) {
            sb.append(expression.prettyPrint(indent + "  ")).append("\n");
        }
        if (subquery != null) {
            sb.append(subquery.prettyPrint(indent + "  ")).append("\n");
        }
        return sb.toString().trim();
    }

}
