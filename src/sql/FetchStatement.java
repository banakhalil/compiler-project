package sql;

import java.util.ArrayList;
import java.util.List;

public class FetchStatement extends ASTNode {
    private FetchDirection fetchDirection;
    private boolean isGlobal;
    private CursorName cursorName;
    private UserVariable cursorVariable;
    private boolean usesCursorVariable; // true if USER_VARIABLE is used
    private List<UserVariable> intoVariables;

    
    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("FETCH STATEMENT:\n");
        if (fetchDirection != null)
            sb.append(fetchDirection.prettyPrint(indent + "  ")).append("\n");
        if (usesCursorVariable)
            sb.append(cursorVariable.prettyPrint(indent + "  ")).append("\n");
        else {
            if (isGlobal)
                sb.append(indent).append("  Scope: GLOBAL\n");
            sb.append(cursorName.prettyPrint(indent + "  ")).append("\n");
        }
        
        if (!intoVariables.isEmpty()) {
            sb.append(indent).append("  INTO:\n");
            for (UserVariable var : intoVariables) {
                sb.append(var.prettyPrint(indent + "    ")).append("\n");
            }
        }
        
        return sb.toString().trim();
    }
}
