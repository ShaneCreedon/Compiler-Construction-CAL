/* Generated By:JavaCC: Do not edit this line. AssignmentTwoDefaultVisitor.java Version 7.0.2 */
public class AssignmentTwoDefaultVisitor implements AssignmentTwoVisitor{
  public Object defaultVisit(SimpleNode node, Object data){
    node.childrenAccept(this, data);
    return data;
  }
  public Object visit(SimpleNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTProgram node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTVarDecl node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTConstDecl node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTFunction node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTReturnValue node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTParameter_list node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTParameter node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTStatement node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTAssignment node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTMinus_sign node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTBoolean node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTAdd_Op node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTFunctionCall node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTLogicalAND node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTLogicalOR node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTCompare node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTEquals node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTNot_Equals node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTLess_Than node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTLess_Than_Or_Equal node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTGreater_Than node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTGreater_Than_Or_Equal node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTArg_list node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTNumber node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTIdentifier node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTType node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTMain node, Object data){
    return defaultVisit(node, data);
  }
}
/* JavaCC - OriginalChecksum=be7c2433862315f29823ec5483f220d0 (do not edit this line) */
