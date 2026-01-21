package sql;

public class DataType extends ASTNode {
    private String typeName;        
    private String parameters;       // "(100)", "(10,2)", "(7)", "(100)(50)"
    private boolean hasPrecision;   // For DOUBLE PRECISION keyword
    private ASTNode collateName;
    private String intervalFrom;     
    private String intervalTo;       

   
    public DataType(String typeName) {
        this.typeName = typeName;
    }

    public DataType(String typeName, String parameters) {
        this.typeName = typeName;
        this.parameters = parameters;
    }

    public void setHasPrecision(boolean hasPrecision) {
        this.hasPrecision = hasPrecision;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public void setCollateName(ASTNode collateName) {
        this.collateName = collateName;
    }

    public void setIntervalFrom(String intervalFrom) {
        this.intervalFrom = intervalFrom;
    }

    public void setIntervalTo(String intervalTo) {
        this.intervalTo = intervalTo;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("DataType: ").append(typeName);
        
        if (hasPrecision) {
            sb.append(" PRECISION");
        }
        
        if (parameters != null) {
            sb.append(parameters);
        }
        
        if (intervalFrom != null && intervalTo != null) {
            sb.append(" ").append(intervalFrom).append(" TO ").append(intervalTo);
        }
        
        if (collateName != null) {
            sb.append(" COLLATE ");
            String collateOutput = collateName.prettyPrint("");
            sb.append(collateOutput);
        }
        
        sb.append("\n");
        return sb.toString();
    }
}


// in visitor 
// DataType dt = new DataType("VARCHAR", "(100)");
// dt.setHasPrecision(true);  
// dt.setCollateName(identifier); 
// dt.setIntervalFrom("DAY");  
// dt.setIntervalTo("SECOND");