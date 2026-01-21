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
        String nameOutput = parameterName.prettyPrint(indent + "    ");
        sb.append(nameOutput);
        if (!nameOutput.endsWith("\n")) {
            sb.append("\n");
        }
        
        sb.append(indent).append("  Data Type:\n");
        String typeOutput = dataType.prettyPrint(indent + "    ");
        sb.append(typeOutput);
        if (!typeOutput.endsWith("\n")) {
            sb.append("\n");
        }
        
        if (defaultValue != null) {
            sb.append(indent).append("  Default Value:\n");
            String defaultOutput = defaultValue.prettyPrint(indent + "    ");
            sb.append(defaultOutput);
            if (!defaultOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        
        if (isOutput) {
            sb.append(indent).append("  OUTPUT\n");
        }
        
        return sb.toString();
    }
}
