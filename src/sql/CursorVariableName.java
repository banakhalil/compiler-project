package sql;

public class CursorVariableName extends ASTNode{
    private String cursorVariableName;
    public CursorVariableName (String cursorVariableName)
    {
        this.cursorVariableName = cursorVariableName;
    }
    @Override
    public String prettyPrint(String indent) {
        return indent + "Cursor variable name: " + cursorVariableName;
    }
}
