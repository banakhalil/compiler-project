package sql;

public class TableSource extends ASTNode{
    private ASTNode identifierRef;
    private ASTNode tableAlias;
    private ASTNode selectStatement;

    public TableSource(ASTNode identifierRef, ASTNode selectStatement, ASTNode tableAlias){
        this.identifierRef = identifierRef;
        this.selectStatement = selectStatement;
        this.tableAlias = tableAlias;
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
