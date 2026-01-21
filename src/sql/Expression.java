package sql;

import java.util.ArrayList;
import java.util.List;

public class Expression extends ASTNode{
    // For binary expressions: left operator right
    private ASTNode leftOperand;
    private ASTNode operator;
    private ASTNode rightOperand;
    
    // For unary expressions: operator operand
    private ASTNode operand;
    
    // For special cases
    private ASTNode primaryExpression;
    private ASTNode expressionList;
    private ASTNode selectStatment;
    private ASTNode exitPredicate;
    private ASTNode scalarSubquery;
    private List<ASTNode> whenClauseChildren = new ArrayList<>();
    
    // Expression type: BINARY, UNARY, PRIMARY, CASE, EXISTS, etc.
    private String expressionType;

    // Binary 
    public Expression(ASTNode left, ASTNode operator, ASTNode right) {
        this.leftOperand = left;
        this.operator = operator;
        this.rightOperand = right;
        this.expressionType = "BINARY";
    }
    
    // Unary 
    public Expression(ASTNode operator, ASTNode operand) {
        this.operator = operator;
        this.operand = operand;
        this.expressionType = "UNARY";
    }
    
    // Primary 
    public Expression(ASTNode primaryExpression) {
        this.primaryExpression = primaryExpression;
        this.expressionType = "PRIMARY";
    }
    
    // Special cases 
    public Expression(ASTNode primaryExpression, ASTNode expressionList, ASTNode selectStatment, ASTNode exitPredicate, ASTNode scalarSubquery, List<ASTNode> whenClauseChildren) {
        this.primaryExpression = primaryExpression;
        this.expressionList = expressionList;
        this.selectStatment = selectStatment;
        this.exitPredicate = exitPredicate;
        this.scalarSubquery = scalarSubquery;
        this.whenClauseChildren = (whenClauseChildren != null) ? whenClauseChildren : new ArrayList<>();
        this.expressionType = "SPECIAL";
    }
    
    // Case expression constructor
    public Expression(List<ASTNode> whenClauses, ASTNode elseExpr) {
        this.whenClauseChildren = (whenClauses != null) ? whenClauses : new ArrayList<>();
        this.rightOperand = elseExpr; // reuse rightOperand for ELSE
        this.expressionType = "CASE";
    }

    public void addChild(ASTNode node){
        if (whenClauseChildren == null) {
            whenClauseChildren = new ArrayList<>();
        }
        whenClauseChildren.add(node);
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("EXPRESSION");
        if (expressionType != null) {
            sb.append(" [").append(expressionType).append("]");
        }
        sb.append(":\n");
        
        // Binary expression
        if ("BINARY".equals(expressionType)) {
            // Print left operand
            if (leftOperand != null) {
                sb.append(indent).append("  Left:\n");
                String leftOutput = leftOperand.prettyPrint(indent + "    ");
                sb.append(leftOutput);
                if (!leftOutput.endsWith("\n")) {
                    sb.append("\n");
                }
            }
            // Print operator
            if (operator != null) {
                sb.append(indent).append("  Operator:\n");
                String opOutput = operator.prettyPrint(indent + "    ");
                sb.append(opOutput);
                if (!opOutput.endsWith("\n")) {
                    sb.append("\n");
                }
            }
            // Print right operand
            if (rightOperand != null) {
                sb.append(indent).append("  Right:\n");
                String rightOutput = rightOperand.prettyPrint(indent + "    ");
                sb.append(rightOutput);
                if (!rightOutput.endsWith("\n")) {
                    sb.append("\n");
                }
            }
        }
        // Unary expression
        else if ("UNARY".equals(expressionType)) {
            if (operator != null) {
                sb.append(indent).append("  Operator:\n");
                String opOutput = operator.prettyPrint(indent + "    ");
                sb.append(opOutput);
                if (!opOutput.endsWith("\n")) {
                    sb.append("\n");
                }
            }
            if (operand != null) {
                sb.append(indent).append("  Operand:\n");
                String operandOutput = operand.prettyPrint(indent + "    ");
                sb.append(operandOutput);
                if (!operandOutput.endsWith("\n")) {
                    sb.append("\n");
                }
            }
        }
        // Primary expression
        else if ("PRIMARY".equals(expressionType)) {
            if (primaryExpression != null) {
                String primaryOutput = primaryExpression.prettyPrint(indent + "  ");
                sb.append(primaryOutput);
                if (!primaryOutput.endsWith("\n")) {
                    sb.append("\n");
                }
            }
        }
        // Case expression
        else if ("CASE".equals(expressionType)) {
            sb.append(indent).append("  CASE:\n");
            if (whenClauseChildren != null) {
                for (ASTNode whenClauseChild : whenClauseChildren) {
                    String whenOutput = whenClauseChild.prettyPrint(indent + "    ");
                    sb.append(whenOutput);
                    if (!whenOutput.endsWith("\n")) {
                        sb.append("\n");
                    }
                }
            }
            if (rightOperand != null) {
                sb.append(indent).append("  ELSE:\n");
                String elseOutput = rightOperand.prettyPrint(indent + "    ");
                sb.append(elseOutput);
                if (!elseOutput.endsWith("\n")) {
                    sb.append("\n");
                }
            }
        }
        // Special/legacy format
        else {
            if (primaryExpression != null) {
                String primaryOutput = primaryExpression.prettyPrint(indent + "  ");
                sb.append(primaryOutput);
                if (!primaryOutput.endsWith("\n")) {
                    sb.append("\n");
                }
            }
            if (expressionList != null) {
                String exprListOutput = expressionList.prettyPrint(indent + "  ");
                sb.append(exprListOutput);
                if (!exprListOutput.endsWith("\n")) {
                    sb.append("\n");
                }
            }
            if (selectStatment != null) {
                String selectOutput = selectStatment.prettyPrint(indent + "  ");
                sb.append(selectOutput);
                if (!selectOutput.endsWith("\n")) {
                    sb.append("\n");
                }
            }
            if (exitPredicate != null) {
                String exitOutput = exitPredicate.prettyPrint(indent + "  ");
                sb.append(exitOutput);
                if (!exitOutput.endsWith("\n")) {
                    sb.append("\n");
                }
            }
            if (scalarSubquery != null) {
                String scalarOutput = scalarSubquery.prettyPrint(indent + "  ");
                sb.append(scalarOutput);
                if (!scalarOutput.endsWith("\n")) {
                    sb.append("\n");
                }
            }
            if (whenClauseChildren != null) {
                for (ASTNode whenClauseChild : whenClauseChildren) {
                    String whenOutput = whenClauseChild.prettyPrint(indent + "  ");
                    sb.append(whenOutput);
                    if (!whenOutput.endsWith("\n")) {
                        sb.append("\n");
                    }
                }
            }
        }
        
        return sb.toString();
    }
}
