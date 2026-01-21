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
            String colOutput = columnName.prettyPrint(indent + "  ");
            sb.append(colOutput);
            if (!colOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        if (constant != null) {
            String constOutput = constant.prettyPrint(indent + "  ");
            sb.append(constOutput);
            if (!constOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        if (identifier != null) {
            String idOutput = identifier.prettyPrint(indent + "  ");
            sb.append(idOutput);
            if (!idOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        if (functionCall != null) {
            String funcOutput = functionCall.prettyPrint(indent + "  ");
            sb.append(funcOutput);
            if (!funcOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        if (expression != null) {
            String exprOutput = expression.prettyPrint(indent + "  ");
            sb.append(exprOutput);
            if (!exprOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        if (subquery != null) {
            String subqueryOutput = subquery.prettyPrint(indent + "  ");
            sb.append(subqueryOutput);
            if (!subqueryOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

}
