/* Generated By:JJTree: Do not edit this line. ASTConst_decl.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTConst_decl extends SimpleNode {
  public ASTConst_decl(int id) {
    super(id);
  }

  public ASTConst_decl(AssignmentTwo p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AssignmentTwoVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=67cdfa037513b7d3e53d230abbcf31d9 (do not edit this line) */