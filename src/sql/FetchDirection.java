package sql;

public class FetchDirection extends ASTNode {
    private String directionType;
    private String value;
    private boolean isVariable;
    
    public FetchDirection(String directionType) {
        this.directionType = directionType;
        this.value = null;
        this.isVariable = false;
    }
    
    public FetchDirection(String directionType, String value, boolean isVariable) {
        this.directionType = directionType;
        this.value = value;
        this.isVariable = isVariable;
    }

    public boolean isVariable() {
        return isVariable;
    }
    
    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("Fetch direction: ").append(directionType);
        
        if (value != null) {
            sb.append(" ").append(value);
            if (isVariable) {
                sb.append(" (variable)");
            } else {
                sb.append(" (number)");
            }
        }
        
        return sb.toString();
    }
}
