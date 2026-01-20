package sql;
import java.util.ArrayList;
import java.util.List;
public class GroupingSet extends ASTNode {
    private ASTNode expressionList; // يمكن أن تكون null في حال ()

    public GroupingSet(ASTNode expressionList) { this.expressionList = expressionList; }

    @Override
    public String prettyPrint(String indent) {
        return indent + "SET: " + (expressionList != null ? expressionList.prettyPrint("") : "()");
    }
}