package sql;

public class Constant extends ASTNode {
    private String value;
    private String type;
    
    public Constant(String value, String type) {
        this.value = value;
        this.type = type;
    }

    
    public boolean isNull() {
        return "NULL".equals(type);
    }
    public boolean isNumber() {
        return "NUMBER".equals(type);
    }
    public boolean isString() {
        return "STRING".equals(type);
    }
    public boolean isHexString() {
        return "HEX_STRING".equals(type);
    }
    
    @Override
    public String prettyPrint(String indent) {
        if (isNull()) {
            return indent + "Constant: NULL";
        } else if (isString()) {
            return indent + "Constant (string): \"" + value + "\"";
        } else if (isHexString()) {
            return indent + "Constant (hex): " + value;
        } else {
            return indent + "Constant (number): " + value;
        }
    }
}
