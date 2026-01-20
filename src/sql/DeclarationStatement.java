package sql;

import java.util.ArrayList;
import java.util.List;

public class DeclarationStatement extends ASTNode {
    private List<ASTNode> declarations;

    // اذا متغير واحد منساويه بهاد ومنرجع منضيفو
    public DeclarationStatement() {
        this.declarations = new ArrayList<>();
    }

    //اذا اكتر من متغير فورا منحطن هون
    public DeclarationStatement(List<ASTNode> declarations) {
        this.declarations = declarations;
    }

    public void addDeclaration(ASTNode decl) {
        declarations.add(decl);
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("Declare Statement:\n");
        for (ASTNode decl : declarations) {
            sb.append(decl.prettyPrint(indent + "  ")).append("\n");
        }
        return sb.toString();
    }
}
