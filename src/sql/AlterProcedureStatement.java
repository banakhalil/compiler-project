package sql;


import java.util.ArrayList;
import java.util.List;

public class AlterProcedureStatement extends DDLStatement {
    private String procedureName;
    private ASTNode parameters;
    private List<ASTNode> body;

    public AlterProcedureStatement(String name, ASTNode params, List<ASTNode> body) {
        this.procedureName = name;
        this.parameters = params;
        this.body = (body != null) ? new ArrayList<>(body) : new ArrayList<>();
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("ALTER_PROCEDURE: ").append(this.procedureName).append("\n");
        if (this.parameters != null) {
            sb.append(this.parameters.prettyPrint(indent + "  ")).append("\n");
        }
        sb.append(indent).append("BODY:\n");
        for (ASTNode stmt : this.body) {
            sb.append(stmt.prettyPrint(indent + "  ")).append("\n");
        }
        return sb.toString();
    }
}

