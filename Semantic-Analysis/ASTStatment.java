/* Generated By:JJTree: Do not edit this line. ASTStatment.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTStatment extends SimpleNode {
  public ASTStatment(int id) {
    super(id);
  }

  public ASTStatment(AssignmentTwo p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AssignmentTwoVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=c42b10f9ffcdaddd70047051616fdaeb (do not edit this line) */
