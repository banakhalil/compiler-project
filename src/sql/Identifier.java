package sql;

public class Identifier extends ASTNode {
    private String name;
    private String type;
    
    public Identifier(String name) {
        this.name = name;
        this.type = "REGULAR";
    }
    
    public Identifier(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName(){
        return this.name;
    }
    
    @Override
    public String prettyPrint(String indent) {
        return indent + "Identifier: " + name + (type.equals("REGULAR") ? "" : " [" + type + "]") + "\n";
    }
}
