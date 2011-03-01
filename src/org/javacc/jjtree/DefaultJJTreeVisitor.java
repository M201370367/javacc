/* Generated By:JavaCC: Do not edit this line. JJTreeParserVisitor.java Version 4.1d1 */
package org.javacc.jjtree;

public class DefaultJJTreeVisitor implements JJTreeParserVisitor
{
  public Object defaultVisit(SimpleNode node, Object data){
    return node.childrenAccept(this, data);
  }
  public Object visit(SimpleNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTGrammar node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTCompilationUnit node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTProductions node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTOptions node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTOptionBinding node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTJavacode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTJavacodeBody node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTBNF node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTBNFDeclaration node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTBNFNodeScope node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTRE node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTTokenDecls node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTRESpec node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTBNFChoice node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTBNFSequence node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTBNFLookahead node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTExpansionNodeScope node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTBNFAction node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTBNFZeroOrOne node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTBNFTryBlock node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTBNFNonTerminal node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTBNFAssignment node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTBNFOneOrMore node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTBNFZeroOrMore node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTBNFParenthesized node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTREStringLiteral node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTRENamed node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTREReference node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTREEOF node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTREChoice node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTRESequence node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTREOneOrMore node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTREZeroOrMore node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTREZeroOrOne node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTRRepetitionRange node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTREParenthesized node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTRECharList node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTCharDescriptor node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTNodeDescriptor node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTNodeDescriptorExpression node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTPrimaryExpression node, Object data){
    return defaultVisit(node, data);
  }
}
/* JavaCC - OriginalChecksum=3b7689ed0de9c57e70ae4a27c1480635 (do not edit this line) */
