
import java.io.InputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
 
public class SnotMain
{
  public static void main(String[] args) throws Exception
  {
    ANTLRInputStream input = new ANTLRInputStream(System.in);
    SnotLexer lexer = new SnotLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    SnotParser p = new SnotParser(tokens);
    
    ParseTree tree = p.program();
    
    ParseTreeWalker walker = new ParseTreeWalker();
    MySnotListener m = new MySnotListener();
    walker.walk(m, tree);
    System.out.println(m.jasminCode);
    
    
    Process proc = Runtime.getRuntime().exec("java -jar A.jar");
 
    //System.out.println(tree.toStringTree(p));
    //p.setBuildParseTree(true);
    //p.addParseListener(new MySnotListener());
    //ParserRuleContext<Token> t = p.program();
  }
}
