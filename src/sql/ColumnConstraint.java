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
            String nameOutput = constraintName.prettyPrint(indent + "    ");
            sb.append(nameOutput);
            if (!nameOutput.endsWith("\n")) {
                sb.append("\n");
            }
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
            String defaultOutput = defaultValue.prettyPrint(indent + "    ");
            sb.append(defaultOutput);
            if (!defaultOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        
        if (checkExpression != null) {
            sb.append(indent).append("  Check Expression:\n");
            String checkOutput = checkExpression.prettyPrint(indent + "    ");
            sb.append(checkOutput);
            if (!checkOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        
        if (referencesTable != null) {
            sb.append(indent).append("  References Table:\n");
            String refTableOutput = referencesTable.prettyPrint(indent + "    ");
            sb.append(refTableOutput);
            if (!refTableOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        
        if (referencedColumn != null) {
            sb.append(indent).append("  Referenced Column:\n");
            String refColOutput = referencedColumn.prettyPrint(indent + "    ");
            sb.append(refColOutput);
            if (!refColOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        
        if (onDeleteAction != null) {
            sb.append(indent).append("  ON DELETE:\n");
            String deleteOutput = onDeleteAction.prettyPrint(indent + "    ");
            sb.append(deleteOutput);
            if (!deleteOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        
        if (onUpdateAction != null) {
            sb.append(indent).append("  ON UPDATE:\n");
            String updateOutput = onUpdateAction.prettyPrint(indent + "    ");
            sb.append(updateOutput);
            if (!updateOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        
        return sb.toString();
    }
}
