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
  public Object visit(ASTFunctionList node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTDeclarationList node, Object data){
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
  public Object visit(ASTStatement_block node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTReturn node, Object data){
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
  public Object visit(ASTMinus_sign node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTBoolean node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTExp node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTAdd_Op node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTMinus_Op node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTLogical_Conjunction node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTLogical_Disjunction node, Object data){
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
  public Object visit(ASTNemp_arg_list node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTFunction_call_structure node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTStatement_Begin_Structure node, Object data){
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
/* JavaCC - OriginalChecksum=1a4850a69f8ddda0bfe42b1adab19fb8 (do not edit this line) */
