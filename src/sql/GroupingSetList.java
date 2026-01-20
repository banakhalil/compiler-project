// GroupingSetList.java
package sql;
import java.util.ArrayList;
import java.util.List;

public class GroupingSetList extends ASTNode {
    private List<ASTNode> sets = new ArrayList<>();
    public void addSet(ASTNode set) { this.sets.add(set); }

    @Override
    public String prettyPrint(String indent) {
        return indent + "GROUPING_SET_LIST";
    }
}