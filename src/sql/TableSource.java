package sql;

public class TableSource extends ASTNode{
    private IdentifierRef identifierRef;
    private TableAlias tableAlias;
    private SelectStatement selectStatement;

    public TableSource(IdentifierRef identifierRef){
        this.identifierRef = identifierRef;
        this.tableAlias = null;
        this.selectStatement = null;

    }
    public TableSource(IdentifierRef identifierRef, TableAlias tableAlias){
        this.identifierRef = identifierRef;
        this.tableAlias = tableAlias;
        this.selectStatement = null;

    }
    public TableSource(SelectStatement selectStatement, TableAlias tableAlias){
        this.identifierRef = null;
        this.tableAlias = tableAlias;
        this.selectStatement = selectStatement;

    }


    @Override
    public String prettyPrint(String indent){
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("TableSource:\n");
        
        if (identifierRef != null) {
            sb.append(indent).append("  IdentifierRef:\n");
            sb.append(identifierRef.prettyPrint(indent + "    ")).append("\n");
        } else if (selectStatement != null) {
            sb.append(indent).append("  Subquery:\n");
            sb.append(selectStatement.prettyPrint(indent + "    ")).append("\n");
        }
        
        if (tableAlias != null) {
            sb.append(indent).append("  Alias:\n");
            sb.append(tableAlias.prettyPrint(indent + "    "));
        }
        
        return sb.toString();
    }
}
