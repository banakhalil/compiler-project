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

    public void addChild(ASTNode node){
        expressionsList.add(node);
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("FUNCTION CALL:\n");
        String funcNameOutput = functionName.prettyPrint(indent + "  ");
        sb.append(funcNameOutput);
        if (!funcNameOutput.endsWith("\n")) {
            sb.append("\n");
        }
        for (ASTNode expression : expressionsList) {
            String exprOutput = expression.prettyPrint(indent + "  ");
            sb.append(exprOutput);
            if (!exprOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
