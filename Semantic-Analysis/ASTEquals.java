/* Generated By:JJTree: Do not edit this line. ASTEquals.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTEquals extends SimpleNode {
  public ASTEquals(int id) {
    super(id);
  }

  public ASTEquals(AssignmentTwo p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AssignmentTwoVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=3dd7db607ed2645e203765848df30a8d (do not edit this line) */
