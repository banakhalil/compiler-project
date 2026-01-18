package sql;

public class OpenCursor extends ASTNode {
    private boolean isGlobal;
    private CursorName cursorName;
    private CursorVariableName cursorVariableName;
    private boolean usesCursorVariable;
    
    public OpenCursor(CursorName cursorName, boolean isGlobal) {
        this.cursorName = cursorName;
        this.isGlobal = isGlobal;
        this.usesCursorVariable = false;
    }
    
    public OpenCursor(CursorVariableName cursorVariableName) {
        this.cursorVariableName = cursorVariableName;
        this.usesCursorVariable = true;
        this.isGlobal = false;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("OPEN CURSOR:\n");
        
        if (usesCursorVariable) {
            sb.append(cursorVariableName.prettyPrint(indent + "  "));
        } else {
            if (isGlobal) {
                sb.append(indent).append("  Scope: GLOBAL\n");
            }
            sb.append(cursorName.prettyPrint(indent + "  "));
        }
        
        return sb.toString();
    }
}
