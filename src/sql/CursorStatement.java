package sql;

public class CursorStatement extends ASTNode {
    private ASTNode declareCursor;
    private ASTNode openCursor;
    private ASTNode fetchStatement;

    public CursorStatement(ASTNode declareCursor, ASTNode openCursor, ASTNode fetchStatement) {
        this.declareCursor = declareCursor;
        this.openCursor = openCursor;
        this.fetchStatement = fetchStatement;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("CURSOR STATEMENT:\n");
        sb.append(declareCursor.prettyPrint(indent + "  ")).append("\n");
        sb.append(openCursor.prettyPrint(indent + "  ")).append("\n");
        sb.append(fetchStatement.prettyPrint(indent + "  ")).append("\n");
        return sb.toString();
    }
}
