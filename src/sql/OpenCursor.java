package sql;

public class OpenCursor extends ASTNode {
    private boolean isGlobal;
    private ASTNode cursorName;
    private ASTNode cursorVariableName;
    private boolean usesCursorVariable;

    public OpenCursor(CursorName cursorName, boolean isGlobal) {
        this.cursorName = cursorName;
        this.isGlobal = isGlobal;

    }

    public OpenCursor(CursorVariableName cursorVariableName) {
        this.cursorVariableName = cursorVariableName;
        this.isGlobal = false;
        this.usesCursorVariable = true;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("OPEN CURSOR:\n");
        if (usesCursorVariable) {
            sb.append(cursorVariableName.prettyPrint(indent + "  ")).append("\n");
        } else {
            if (isGlobal) {
                sb.append(indent).append("  Scope: GLOBAL\n");
            }
            sb.append(cursorName.prettyPrint(indent + "  ")).append("\n");
        }
        
        return sb.toString();
    }
}
