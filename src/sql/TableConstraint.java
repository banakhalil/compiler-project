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
            sb.append(constraintName.prettyPrint(indent + "    ")).append("\n");
        }
        
        if (clustered) {
            sb.append(indent).append("  CLUSTERED\n");
        } else if (nonClustered) {
            sb.append(indent).append("  NONCLUSTERED\n");
        }
        
        if (!columns.isEmpty()) {
            sb.append(indent).append("  Columns:\n");
            for (ASTNode col : columns) {
                sb.append(col.prettyPrint(indent + "    ")).append("\n");
            }
        }
        
        if (checkExpression != null) {
            sb.append(indent).append("  Check Expression:\n");
            sb.append(checkExpression.prettyPrint(indent + "    ")).append("\n");
        }
        
        if (referencesTable != null) {
            sb.append(indent).append("  References Table:\n");
            sb.append(referencesTable.prettyPrint(indent + "    ")).append("\n");
        }
        
        if (referencedColumns != null && !referencedColumns.isEmpty()) {
            sb.append(indent).append("  Referenced Columns:\n");
            for (ASTNode col : referencedColumns) {
                sb.append(col.prettyPrint(indent + "    ")).append("\n");
            }
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
