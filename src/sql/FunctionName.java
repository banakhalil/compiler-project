package sql;

public class FunctionName extends ASTNode {
    private String functionName;

    public FunctionName(String name) {
        this.functionName = name;
    }


    @Override
    public String prettyPrint(String indent) {
            return indent + "Function name: " + functionName;
    }
}
