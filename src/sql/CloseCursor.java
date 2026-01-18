package sql;

public class CloseCursor extends ASTNode {
    private boolean isGlobal;
    private IdentifierRef identifierRef;
    private UserVariable userVariable;
    private boolean usesUserVariable; // true if USER_VARIABLE is used, false if identifier_ref is used
    
    public CloseCursor(IdentifierRef identifierRef, boolean isGlobal) {
        this.identifierRef = identifierRef;
        this.isGlobal = isGlobal;
        this.usesUserVariable = false;
    }
    
    public CloseCursor(UserVariable userVariable) {
        this.userVariable = userVariable;
        this.usesUserVariable = true;
        this.isGlobal = false;
    }
    
    public boolean isGlobal() {
        return isGlobal;
    }
    
    public boolean usesUserVariable() {
        return usesUserVariable;
    }
    

    
    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("CLOSE CURSOR:\n");
        
        if (usesUserVariable) {
            sb.append(userVariable.prettyPrint(indent + "  "));
        } else {
            if (isGlobal) {
                sb.append(indent).append("  Scope: GLOBAL\n");
            }
            sb.append(identifierRef.prettyPrint(indent + "  "));
        }
        
        return sb.toString();
    }
}
