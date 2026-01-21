package sql;


import java.util.ArrayList;
import java.util.List;

public class CreateFunctionStatement extends DDLStatement {
    private String functionName;
    private ASTNode parameters;
    private String returnType;
    private List<ASTNode> body;

    public CreateFunctionStatement(String name, ASTNode params, String returnType, List<ASTNode> body) {
        this.functionName = name;
        this.parameters = params;
        this.returnType = returnType;
        this.body = (body != null) ? new ArrayList<>(body) : new ArrayList<>();
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("CREATE_FUNCTION: ").append(this.functionName).append("\n");
        sb.append(indent).append("  RETURNS: ").append(this.returnType).append("\n");

        if (this.parameters != null) {
            String paramsOutput = this.parameters.prettyPrint(indent + "  ");
            sb.append(paramsOutput);
            if (!paramsOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }

        sb.append(indent).append("BODY:\n");
        for (ASTNode stmt : this.body) {
            String stmtOutput = stmt.prettyPrint(indent + "  ");
            sb.append(stmtOutput);
            if (!stmtOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }

        return sb.toString();
    }
}

