package sql;

public class CursorName extends ASTNode{
    private String cursorName ;
    public CursorName(String cursorName){
        this.cursorName = cursorName;
    }

    @Override
    public String prettyPrint(String indent) {
        return indent + "Cursor name: " + cursorName;
    }
}

