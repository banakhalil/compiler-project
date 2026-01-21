package sql;

public class Action extends ASTNode {
    private String actionType;

    public Action(String actionType) {
        this.actionType = actionType;
    }

    public String getActionType() {
        return actionType;
    }

    @Override
    public String prettyPrint(String indent) {
        return indent + "Action: " + actionType;
    }
}