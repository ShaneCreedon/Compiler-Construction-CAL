/* Generated By:JJTree: Do not edit this line. ASTBoolean.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTBoolean extends SimpleNode {
  public ASTBoolean(int id) {
    super(id);
  }

  public ASTBoolean(AssignmentTwo p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AssignmentTwoVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=bb7ec88c7effbd08622b27a5ff6d657d (do not edit this line) */