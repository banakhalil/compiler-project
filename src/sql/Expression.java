package sql;

import java.util.ArrayList;
import java.util.List;

public class Expression extends ASTNode{
    private ASTNode primaryExpression;
    private ASTNode expressionList;
    private ASTNode selectStatment;
    private ASTNode exitPredicate;
    private ASTNode scalarSubquery;
    private List<ASTNode> whenClauseChildren = new ArrayList<>();

    public Expression(ASTNode primaryExpression, ASTNode expressionList, ASTNode selectStatment, ASTNode exitPredicate, ASTNode scalarSubquery, List<ASTNode> whenClauseChildren) {
        this.primaryExpression = primaryExpression;
        this.expressionList = expressionList;
        this.selectStatment = selectStatment;
        this.exitPredicate = exitPredicate;
        this.scalarSubquery = scalarSubquery;
        this.whenClauseChildren = whenClauseChildren;
    }

    public void addChild(ASTNode node){
        whenClauseChildren.add(node);
    }


    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("EXPRESSION:\n");
        sb.append(primaryExpression.prettyPrint(indent + "  ")).append("\n");
        sb.append(expressionList.prettyPrint(indent + "  ")).append("\n");
        sb.append(selectStatment.prettyPrint(indent + "  ")).append("\n");
        sb.append(exitPredicate.prettyPrint(indent + "  ")).append("\n");
        sb.append(scalarSubquery.prettyPrint(indent + "  ")).append("\n");
        for (ASTNode whenClauseChild : whenClauseChildren) {
            sb.append(whenClauseChild.prettyPrint(indent + "  ")).append("\n");
        }
        return sb.toString().trim();
    }
}
