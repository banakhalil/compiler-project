package sql;

import java.util.ArrayList;
import java.util.List;

public class RowValueConstructorList extends ASTNode{
    private List<RowValueConstructor> rowValueConstructorList;

    // اذا متغير واحد منساويه بهاد ومنرجع منضيفو
    public RowValueConstructorList() {
        this.rowValueConstructorList = new ArrayList<>();
    }

    //اذا اكتر من متغير فورا منحطن هون
    public RowValueConstructorList(List<RowValueConstructor> rowValueConstructorList) {
        this.rowValueConstructorList = rowValueConstructorList;
    }

    public void addRowValueConstructor(RowValueConstructor rowValueConstructor) {
        rowValueConstructorList.add(rowValueConstructor);
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("RowValueConstructorList:\n");
        for (RowValueConstructor rvl : rowValueConstructorList) {
            sb.append(rvl.prettyPrint(indent + "  ")).append("\n");
        }
        return sb.toString();
    }
}

