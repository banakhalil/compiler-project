package sql;

public class WhileStatement extends ASTNode {
   private ASTNode condition;  // لسا ما انعمل
   private ASTNode body;        // لسا ما انعمل

   public WhileStatement(ASTNode condition, ASTNode body) {
       this.condition = condition;
       this.body = body;
   }

   @Override
   public String prettyPrint(String indent) {
       StringBuilder sb = new StringBuilder();
       sb.append(indent).append("WhileStatement:\n");
       sb.append(indent).append("  Condition:\n");
       sb.append(condition.prettyPrint(indent + "    ")).append("\n");
       sb.append(indent).append("  Body:\n");
       sb.append(body.prettyPrint(indent + "    "));
       return sb.toString();
   }
}
