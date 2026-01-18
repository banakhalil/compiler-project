package sql;

public class TableAlias extends ASTNode {
    public String alias;
    
    public TableAlias(String alias) {
        this.alias = alias;
    }
    
    @Override
    public String prettyPrint(String indent) {
        return indent + "Table alias: " + alias;
    }
}
