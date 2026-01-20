package sql;

import java.util.ArrayList;
import java.util.List;

public class FetchStatement extends ASTNode {
    private ASTNode fetchDirection;
    private boolean isGlobal;
    private ASTNode cursorName;
    private ASTNode cursorVariable;
    private boolean usesCursorVariable; // true if USER_VARIABLE is used
    private List<ASTNode> intoVariables = new ArrayList<>();

    public FetchStatement(ASTNode fetchDirection, boolean isGlobal, ASTNode cursorName, ASTNode cursorVariable, List<ASTNode> intoVariables) {
        this.fetchDirection = fetchDirection;
        this.isGlobal = isGlobal;
        this.cursorName = cursorName;
        this.cursorVariable = cursorVariable;
        this.usesCursorVariable = cursorVariable != null;
        this.intoVariables = intoVariables;
    }

    public void addChild(ASTNode node){
        intoVariables.add(node);
    }

    
    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("FETCH STATEMENT:\n");
        if (fetchDirection != null)
            sb.append(fetchDirection.prettyPrint(indent + "  ")).append("\n");
        if (usesCursorVariable)
            sb.append(cursorVariable.prettyPrint(indent + "  ")).append("\n");
        if (isGlobal) {
            sb.append(indent).append("  Scope: GLOBAL\n");
            sb.append(cursorName.prettyPrint(indent + "  ")).append("\n");
        }
        if (!intoVariables.isEmpty()) {
            sb.append(indent).append("  INTO:\n");
            for (ASTNode var : intoVariables) {
                sb.append(var.prettyPrint(indent + "    ")).append("\n");
            }
        }
        return sb.toString().trim();
    }
}
