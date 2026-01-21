package sql;

import java.util.ArrayList;
import java.util.List;

public class ColumnConstraint extends ASTNode {
    private ASTNode constraintName;  
    private String constraintType;   // PRIMARY KEY, NOT NULL, NULL, UNIQUE, IDENTITY, DEFAULT, CHECK, REFERENCES
    private boolean clustered;
    private boolean nonClustered;
    private String identityParams;  // "(NUMBER, NUMBER)" or "(NUMBER)"
    private ASTNode defaultValue;
    private ASTNode checkExpression;
    private ASTNode referencesTable;
    private ASTNode referencedColumn;
    private ASTNode onDeleteAction;
    private ASTNode onUpdateAction;

    public ColumnConstraint(String constraintType) {
        this.constraintType = constraintType;
    }

    public void setConstraintName(ASTNode constraintName) {
        this.constraintName = constraintName;
    }

    public void setClustered(boolean clustered) {
        this.clustered = clustered;
    }

    public void setNonClustered(boolean nonClustered) {
        this.nonClustered = nonClustered;
    }

    public void setIdentityParams(String params) {
        this.identityParams = params;
    }

    public void setDefaultValue(ASTNode defaultValue) {
        this.defaultValue = defaultValue;
    }

    public void setCheckExpression(ASTNode checkExpression) {
        this.checkExpression = checkExpression;
    }

    public void setReferencesTable(ASTNode referencesTable) {
        this.referencesTable = referencesTable;
    }

    public void setReferencedColumn(ASTNode referencedColumn) {
        this.referencedColumn = referencedColumn;
    }

    public void setOnDeleteAction(ASTNode action) {
        this.onDeleteAction = action;
    }

    public void setOnUpdateAction(ASTNode action) {
        this.onUpdateAction = action;
    }

    public String getConstraintType() {
        return constraintType;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("ColumnConstraint: ").append(constraintType).append("\n");
        
        if (constraintName != null) {
            sb.append(indent).append("  Constraint Name:\n");
            sb.append(constraintName.prettyPrint(indent + "    ")).append("\n");
        }
        
        if (clustered) {
            sb.append(indent).append("  CLUSTERED\n");
        } else if (nonClustered) {
            sb.append(indent).append("  NONCLUSTERED\n");
        }
        
        if (identityParams != null) {
            sb.append(indent).append("  Identity Params: ").append(identityParams).append("\n");
        }
        
        if (defaultValue != null) {
            sb.append(indent).append("  Default Value:\n");
            sb.append(defaultValue.prettyPrint(indent + "    ")).append("\n");
        }
        
        if (checkExpression != null) {
            sb.append(indent).append("  Check Expression:\n");
            sb.append(checkExpression.prettyPrint(indent + "    ")).append("\n");
        }
        
        if (referencesTable != null) {
            sb.append(indent).append("  References Table:\n");
            sb.append(referencesTable.prettyPrint(indent + "    ")).append("\n");
        }
        
        if (referencedColumn != null) {
            sb.append(indent).append("  Referenced Column:\n");
            sb.append(referencedColumn.prettyPrint(indent + "    ")).append("\n");
        }
        
        if (onDeleteAction != null) {
            sb.append(indent).append("  ON DELETE:\n");
            sb.append(onDeleteAction.prettyPrint(indent + "    ")).append("\n");
        }
        
        if (onUpdateAction != null) {
            sb.append(indent).append("  ON UPDATE:\n");
            sb.append(onUpdateAction.prettyPrint(indent + "    "));
        }
        
        return sb.toString().trim();
    }
}
