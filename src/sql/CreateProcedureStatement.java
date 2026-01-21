package sql;



import java.util.ArrayList;
import java.util.List;

public class CreateProcedureStatement extends DDLStatement {
    private String procedureName;
    private ASTNode parameters;
    private List<ASTNode> body;

    public CreateProcedureStatement(String name, ASTNode params, List<ASTNode> body) {
        this.procedureName = name;
        this.parameters = params;
        this.body = (body != null) ? new ArrayList<>(body) : new ArrayList<>();
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("CREATE_PROCEDURE: ").append(this.procedureName).append("\n");

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
