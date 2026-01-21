package sql;

import java.util.ArrayList;
import java.util.List;

public class ParameterList extends ASTNode {
    private List<ASTNode> parameters;

    public ParameterList() {
        this.parameters = new ArrayList<>();
    }

    public ParameterList(List<ASTNode> parameters) {
        this.parameters = parameters != null ? parameters : new ArrayList<>();
    }

    public void addParameter(ASTNode parameter) {
        this.parameters.add(parameter);
    }

    public List<ASTNode> getParameters() {
        return parameters;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("ParameterList:\n");
        for (ASTNode param : parameters) {
            sb.append(param.prettyPrint(indent + "  ")).append("\n");
        }
        return sb.toString().trim();
    }
}