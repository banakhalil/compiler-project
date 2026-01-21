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
            String idRefOutput = identifierRef.prettyPrint(indent + "    ");
            sb.append(idRefOutput);
            if (!idRefOutput.endsWith("\n")) {
                sb.append("\n");
            }
        } else if (selectStatement != null) {
            sb.append(indent).append("  Subquery:\n");
            String subqueryOutput = selectStatement.prettyPrint(indent + "    ");
            sb.append(subqueryOutput);
            if (!subqueryOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        
        if (tableAlias != null) {
            sb.append(indent).append("  Alias:\n");
            String aliasOutput = tableAlias.prettyPrint(indent + "    ");
            sb.append(aliasOutput);
            if (!aliasOutput.endsWith("\n")) {
                sb.append("\n");
            }
        }
        
        return sb.toString();
    }
}
