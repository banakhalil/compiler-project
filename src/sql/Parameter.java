package sql;

public class Parameter extends ASTNode {
    private ASTNode parameterName;  // USER_VARIABLE or identifier
    private ASTNode dataType;
    private ASTNode defaultValue;
    private boolean isOutput;

    public Parameter(ASTNode parameterName, ASTNode dataType) {
        this.parameterName = parameterName;
        this.dataType = dataType;
        this.defaultValue = null;
        this.isOutput = false;
    }

    public void setDefaultValue(ASTNode defaultValue) {
        this.defaultValue = defaultValue;
    }

    public void setOutput(boolean isOutput) {
        this.isOutput = isOutput;
    }

    public ASTNode getParameterName() {
        return parameterName;
    }

    public ASTNode getDataType() {
        return dataType;
    }

    public ASTNode getDefaultValue() {
        return defaultValue;
    }

    public boolean isOutput() {
        return isOutput;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("Parameter:\n");
        
        sb.append(indent).append("  Name:\n");
        sb.append(parameterName.prettyPrint(indent + "    ")).append("\n");
        
        sb.append(indent).append("  Data Type:\n");
        sb.append(dataType.prettyPrint(indent + "    ")).append("\n");
        
        if (defaultValue != null) {
            sb.append(indent).append("  Default Value:\n");
            sb.append(defaultValue.prettyPrint(indent + "    ")).append("\n");
        }
        
        if (isOutput) {
            sb.append(indent).append("  OUTPUT");
        }
        
        return sb.toString().trim();
    }
}
