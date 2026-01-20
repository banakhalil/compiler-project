package sql;

public class WhileStatement extends ASTNode {
   private Expression condition;  // لسا ما انعمل
   private Statement body;        // لسا ما انعمل

   public WhileStatement(Expression condition, Statement body) {
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
