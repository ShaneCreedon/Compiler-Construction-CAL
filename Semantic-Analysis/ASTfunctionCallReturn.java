/* Generated By:JJTree: Do not edit this line. ASTfunctionCallReturn.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTfunctionCallReturn extends SimpleNode {
  public ASTfunctionCallReturn(int id) {
    super(id);
  }

  public ASTfunctionCallReturn(AssignmentTwo p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AssignmentTwoVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=62074729a089492b991a3bfb8463af88 (do not edit this line) */
