package sql;
import java.util.ArrayList;
import java.util.List;

public class WithClause extends ASTNode{
    private List<CommonTableExpression> commonTableExpressionList;
    private SelectStatement selectStatement;

    // اذا متغير واحد منساويه بهاد ومنرجع منضيفو
    public WithClause(SelectStatement selectStatement) {
        this.commonTableExpressionList = new ArrayList<>();
        this.selectStatement = selectStatement;
    }

    //اذا اكتر من متغير فورا منحطن هون
    public WithClause(List<CommonTableExpression> commonTableExpressionList, SelectStatement selectStatement) {
        this.commonTableExpressionList = commonTableExpressionList;
        this.selectStatement = selectStatement;
    }

    public void addCommonTableExpression(CommonTableExpression commonTableExpression) {
        commonTableExpressionList.add(commonTableExpression);
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("WithClause:\n");
        
        sb.append(indent).append("  Common Table Expressions:\n");
        for (CommonTableExpression commonTableExpression : commonTableExpressionList) {
            sb.append(commonTableExpression.prettyPrint(indent + "    ")).append("\n");
        }
        
        sb.append(indent).append("  Select Statement:\n");
        sb.append(selectStatement.prettyPrint(indent + "    "));
        
        return sb.toString();
    }
}
