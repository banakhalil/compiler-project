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
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("GroupByItem: ").append(type).append("\n");
        String contentOutput = content.prettyPrint(indent + "  ");
        sb.append(contentOutput);
        if (!contentOutput.endsWith("\n")) {
            sb.append("\n");
        }
        return sb.toString();
    }
}