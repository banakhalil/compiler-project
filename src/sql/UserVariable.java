package sql;

public class UserVariable extends ASTNode {
    private String variableName;
    
    public UserVariable(String variableName) {
        this.variableName = variableName;
    }

    
    @Override
    public String prettyPrint(String indent) {
        return indent + "User variable: " + variableName + "\n";
    }
}
