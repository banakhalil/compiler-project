package sql;

import java.util.ArrayList;
import java.util.List;

public class FunctionCall extends ASTNode{
    private ASTNode functionName;
    private List<ASTNode> expressionsList = new ArrayList<>();

    public FunctionCall(ASTNode functionName, List<ASTNode> expressionsList){
        this.functionName = functionName;
        this.expressionsList = expressionsList;
    }
    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("FUNCTION CALL:\n");
        sb.append(functionName.prettyPrint(indent + "  ")).append("\n");
        for (ASTNode expression : expressionsList) {
            sb.append(expression.prettyPrint(indent + "  ")).append("\n");
        }
        return sb.toString().trim();
    }
}
