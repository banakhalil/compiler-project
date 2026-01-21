package sql;


import java.util.ArrayList;
import java.util.List;

public class AlterFunctionStatement extends DDLStatement {
    private String functionName;
    private ASTNode parameters;
    private String returnType;
    private List<ASTNode> body;

    public AlterFunctionStatement(String name, ASTNode params, String returnType, List<ASTNode> body) {
        this.functionName = name;
        this.parameters = params;
        this.returnType = returnType;
        this.body = (body != null) ? new ArrayList<>(body) : new ArrayList<>();
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("ALTER_FUNCTION: ").append(this.functionName).append("\n");
        sb.append(indent).append("  RETURNS: ").append(this.returnType).append("\n");
        if (this.parameters != null) {
            sb.append(this.parameters.prettyPrint(indent + "  ")).append("\n");
        }
        sb.append(indent).append("BODY:\n");
        for (ASTNode stmt : this.body) {
            sb.append(stmt.prettyPrint(indent + "  ")).append("\n");
        }
        return sb.toString().trim();
    }
}
