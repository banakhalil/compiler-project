package sql;

public class GroupByItem extends ASTNode {
    private String type; // "EXPRESSION", "ROLLUP", "CUBE", "GROUPING_SETS"
    private ASTNode content;

    public GroupByItem(String type, ASTNode content) {
        this.type = type;
        this.content = content;
    }

    @Override
    public String prettyPrint(String indent) {
        return indent + type + " (" + content.prettyPrint("") + ")";
    }
}