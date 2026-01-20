package sql;

public class FetchDirection extends ASTNode {
    private String fetchDirection;
    
    public FetchDirection(String fetchDirection) {
        this.fetchDirection = fetchDirection;}
    

    @Override
    public String prettyPrint(String indent) {
        return indent + "Fetch Direction: " + fetchDirection;
    }

}
