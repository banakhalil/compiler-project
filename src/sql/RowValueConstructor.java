package sql;

public class RowValueConstructor extends ASTNode{
    private ExpressionList expressionList;

    public RowValueConstructor(ExpressionList expressionList){
        this.expressionList = expressionList;
    }

    @Override
    public String prettyPrint(String indent){
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("RowValueConstructor:\n");
        sb.append(indent).append("  Expression List:\n");
        sb.append(expressionList.prettyPrint(indent + "    "));
        return sb.toString();
    }
}
