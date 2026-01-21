package sql;

public class FileGroup extends ASTNode {
    private ASTNode identifier;
    private boolean isPrimary;

    public FileGroup(ASTNode identifier) {
        this.identifier = identifier;
        this.isPrimary = false;
    }

    public FileGroup(boolean isPrimary) {
        this.isPrimary = isPrimary;
        this.identifier = null;
    }

    @Override
    public String prettyPrint(String indent) {
        if (isPrimary) {
            return indent + "FileGroup: PRIMARY";
        }
        return indent + "FileGroup:\n" + identifier.prettyPrint(indent + "  ");
    }
}