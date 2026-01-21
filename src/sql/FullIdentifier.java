package sql;

import java.util.ArrayList;
import java.util.List;

public class FullIdentifier extends ASTNode {
    private List<ASTNode> identifiers;

    public FullIdentifier(List<ASTNode> identifiers) {
        this.identifiers = identifiers;
    }

    public void add(ASTNode node) {
        identifiers.add(node);
    }

    public List<ASTNode> getIdentifiers() {
        return identifiers;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("FullIdentifier: ");
        for (int i = 0; i < identifiers.size(); i++) {
            if (identifiers.get(i) instanceof Identifier) {
                sb.append(((Identifier) identifiers.get(i)).getName());
            } else {
                sb.append(identifiers.get(i).prettyPrint(""));
            }
            if (i < identifiers.size() - 1) {
                sb.append(".");
            }
        }
        return sb.toString();
    }
}