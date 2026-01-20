package sql;

public class CommonTableExpression extends ASTNode{
    IdentifierRef identifierRef;
    ColumnList columnList;
    SelectStatement selectStatement;

    public CommonTableExpression(IdentifierRef identifierRef, SelectStatement selectStatement){
        this.identifierRef = identifierRef;
        this.selectStatement = selectStatement;
    }

    public CommonTableExpression(IdentifierRef identifierRef, ColumnList columnList, SelectStatement selectStatement){
        this.identifierRef = identifierRef;
        this.columnList = columnList;
        this.selectStatement = selectStatement;
    }
    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("CommonTableExpression:\n");
        
        sb.append(indent).append("  IdentifierRef:\n");
        sb.append(identifierRef.prettyPrint(indent + "    ")).append("\n");
        
        if (columnList != null) {
            sb.append(indent).append("  Column List:\n");
            sb.append(columnList.prettyPrint(indent + "    ")).append("\n");
        }
        
        sb.append(indent).append("  Select Statement:\n");
        sb.append(selectStatement.prettyPrint(indent + "    "));
        
        return sb.toString();
    }
}
