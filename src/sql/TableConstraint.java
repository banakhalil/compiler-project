package sql;

import java.util.ArrayList;
import java.util.List;

public class TableConstraint extends ASTNode {
    private ASTNode constraintName;  
    private String constraintType;    // PRIMARY KEY, UNIQUE, FOREIGN KEY, CHECK
    private boolean clustered;      
    private boolean nonClustered;
    private List<ASTNode> columns;   // For PRIMARY KEY, UNIQUE, FOREIGN KEY
    private ASTNode checkExpression; 
    private ASTNode referencesTable; 
    private List<ASTNode> referencedColumns; 
    private ASTNode onDeleteAction;  
    private ASTNode onUpdateAction;  

    // Default constructor
    public TableConstraint() {
        this.constraintType = "";
        this.columns = new ArrayList<>();
        this.clustered = false;
        this.nonClustered = false;
        this.referencedColumns = new ArrayList<>();
    }

    // PRIMARY KEY or UNIQUE
    public TableConstraint(String constraintType, List<ASTNode> columns) {
        this.constraintType = constraintType;
        this.columns = columns != null ? columns : new ArrayList<>();
        this.clustered = false;
        this.nonClustered = false;
    }

    //  CHECK
    public TableConstraint(ASTNode checkExpression) {
        this.constraintType = "CHECK";
        this.checkExpression = checkExpression;
        this.columns = new ArrayList<>();
    }

    // FOREIGN KEY
    public TableConstraint(List<ASTNode> columns, ASTNode referencesTable) {
        this.constraintType = "FOREIGN KEY";
        this.columns = columns != null ? columns : new ArrayList<>();
        this.referencesTable = referencesTable;
        this.referencedColumns = new ArrayList<>();
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

    public void setReferencedColumns(List<ASTNode> referencedColumns) {
        this.referencedColumns = referencedColumns;
    }

    public void setOnDeleteAction(ASTNode action) {
        this.onDeleteAction = action;
    }

    public void setOnUpdateAction(ASTNode action) {
        this.onUpdateAction = action;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("TableConstraint: ").append(constraintType).append("\n");
        
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
        
        if (!columns.isEmpty()) {
            sb.append(indent).append("  Columns:\n");
            for (ASTNode col : columns) {
                String colOutput = col.prettyPrint(indent + "    ");
                sb.append(colOutput);
                if (!colOutput.endsWith("\n")) {
                    sb.append("\n");
                }
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
        
        if (referencedColumns != null && !referencedColumns.isEmpty()) {
            sb.append(indent).append("  Referenced Columns:\n");
            for (ASTNode col : referencedColumns) {
                String colOutput = col.prettyPrint(indent + "    ");
                sb.append(colOutput);
                if (!colOutput.endsWith("\n")) {
                    sb.append("\n");
                }
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
