package sql;

import java.util.List;
import java.util.ArrayList;

public class DeclareCursor extends ASTNode {
    private ASTNode cursorName;
    private ASTNode selectStatement;
    private boolean forUpdate;         // is there an updating for the column ? yes / no
    private List<ASTNode> columns;

    public DeclareCursor(ASTNode cursorName, ASTNode selectStatement, boolean forUpdate) {
        this.cursorName = cursorName;
        this.selectStatement = selectStatement;
        this.forUpdate = forUpdate;
        this.columns = new ArrayList<>();
    }


    public void addChild(ASTNode node){
        columns.add(node);
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("DECLARE CURSOR:\n");
        sb.append(cursorName.prettyPrint(indent + "  ")).append("\n");
        sb.append(selectStatement.prettyPrint(indent + "  ")).append("\n");
        if(forUpdate){
            sb.append(indent).append("  FOR UPDATE\n");
            for (ASTNode column : columns) {
                sb.append(column.prettyPrint(indent + "  ")).append("\n");
            }
        }
        return sb.toString().trim();
    }
}