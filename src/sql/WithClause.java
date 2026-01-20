package sql;
import java.util.ArrayList;
import java.util.List;

public class WithClause extends ASTNode{
    private List<ASTNode> commonTableExpressionList;
    private ASTNode selectStatement;

    // اذا متغير واحد منساويه بهاد ومنرجع منضيفو
    public WithClause(ASTNode selectStatement) {
        this.commonTableExpressionList = new ArrayList<>();
        this.selectStatement = selectStatement;
    }

    //اذا اكتر من متغير فورا منحطن هون
    public WithClause(List<ASTNode> commonTableExpressionList, ASTNode selectStatement) {
        this.commonTableExpressionList = commonTableExpressionList;
        this.selectStatement = selectStatement;
    }

    public void addCommonTableExpression(ASTNode commonTableExpression) {
        commonTableExpressionList.add(commonTableExpression);
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("WithClause:\n");
        
        sb.append(indent).append("  Common Table Expressions:\n");
        for (ASTNode commonTableExpression : commonTableExpressionList) {
            sb.append(commonTableExpression.prettyPrint(indent + "    ")).append("\n");
        }
        
        sb.append(indent).append("  Select Statement:\n");
        sb.append(selectStatement.prettyPrint(indent + "    "));
        
        return sb.toString();
    }
}
