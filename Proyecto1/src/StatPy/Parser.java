
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package StatPy;

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\046\000\002\002\004\000\002\002\003\000\002\003" +
    "\011\000\002\004\004\000\002\004\003\000\002\005\003" +
    "\000\002\005\003\000\002\005\003\000\002\006\005\000" +
    "\002\006\007\000\002\011\011\000\002\012\011\000\002" +
    "\012\015\000\002\012\013\000\002\007\003\000\002\007" +
    "\003\000\002\007\003\000\002\007\003\000\002\007\003" +
    "\000\002\010\005\000\002\010\005\000\002\010\005\000" +
    "\002\010\005\000\002\010\005\000\002\010\005\000\002" +
    "\010\005\000\002\010\005\000\002\010\005\000\002\010" +
    "\005\000\002\010\005\000\002\010\005\000\002\010\004" +
    "\000\002\010\003\000\002\010\003\000\002\010\003\000" +
    "\002\010\003\000\002\010\003\000\002\010\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\116\000\004\004\005\001\002\000\004\002\000\001" +
    "\002\000\004\005\010\001\002\000\004\002\007\001\002" +
    "\000\004\002\001\001\002\000\004\006\011\001\002\000" +
    "\004\007\012\001\002\000\004\010\013\001\002\000\020" +
    "\015\025\016\016\017\027\020\015\021\030\045\017\050" +
    "\020\001\002\000\022\011\ufffa\015\ufffa\016\ufffa\017\ufffa" +
    "\020\ufffa\021\ufffa\045\ufffa\050\ufffa\001\002\000\004\012" +
    "\ufff0\001\002\000\004\012\ufff2\001\002\000\004\047\113" +
    "\001\002\000\004\006\100\001\002\000\022\011\ufffb\015" +
    "\ufffb\016\ufffb\017\ufffb\020\ufffb\021\ufffb\045\ufffb\050\ufffb" +
    "\001\002\000\022\011\ufffd\015\ufffd\016\ufffd\017\ufffd\020" +
    "\ufffd\021\ufffd\045\ufffd\050\ufffd\001\002\000\022\011\077" +
    "\015\025\016\016\017\027\020\015\021\030\045\017\050" +
    "\020\001\002\000\022\011\ufffc\015\ufffc\016\ufffc\017\ufffc" +
    "\020\ufffc\021\ufffc\045\ufffc\050\ufffc\001\002\000\004\012" +
    "\ufff3\001\002\000\004\012\031\001\002\000\004\012\ufff1" +
    "\001\002\000\004\012\uffef\001\002\000\006\013\032\014" +
    "\033\001\002\000\022\011\ufff9\015\ufff9\016\ufff9\017\ufff9" +
    "\020\ufff9\021\ufff9\045\ufff9\050\ufff9\001\002\000\020\026" +
    "\041\027\040\030\042\031\036\032\034\033\035\044\037" +
    "\001\002\000\036\007\uffdd\013\uffdd\022\uffdd\023\uffdd\024" +
    "\uffdd\025\uffdd\034\uffdd\035\uffdd\036\uffdd\037\uffdd\040\uffdd" +
    "\041\uffdd\042\uffdd\043\uffdd\001\002\000\036\007\uffdc\013" +
    "\uffdc\022\uffdc\023\uffdc\024\uffdc\025\uffdc\034\uffdc\035\uffdc" +
    "\036\uffdc\037\uffdc\040\uffdc\041\uffdc\042\uffdc\043\uffdc\001" +
    "\002\000\036\007\uffde\013\uffde\022\uffde\023\uffde\024\uffde" +
    "\025\uffde\034\uffde\035\uffde\036\uffde\037\uffde\040\uffde\041" +
    "\uffde\042\uffde\043\uffde\001\002\000\020\026\041\027\040" +
    "\030\042\031\036\032\034\033\035\044\037\001\002\000" +
    "\036\007\uffe0\013\uffe0\022\uffe0\023\uffe0\024\uffe0\025\uffe0" +
    "\034\uffe0\035\uffe0\036\uffe0\037\uffe0\040\uffe0\041\uffe0\042" +
    "\uffe0\043\uffe0\001\002\000\036\007\uffe1\013\uffe1\022\uffe1" +
    "\023\uffe1\024\uffe1\025\uffe1\034\uffe1\035\uffe1\036\uffe1\037" +
    "\uffe1\040\uffe1\041\uffe1\042\uffe1\043\uffe1\001\002\000\036" +
    "\007\uffdf\013\uffdf\022\uffdf\023\uffdf\024\uffdf\025\uffdf\034" +
    "\uffdf\035\uffdf\036\uffdf\037\uffdf\040\uffdf\041\uffdf\042\uffdf" +
    "\043\uffdf\001\002\000\034\013\060\022\052\023\045\024" +
    "\047\025\050\034\046\035\054\036\044\037\051\040\055" +
    "\041\056\042\053\043\057\001\002\000\020\026\041\027" +
    "\040\030\042\031\036\032\034\033\035\044\037\001\002" +
    "\000\020\026\041\027\040\030\042\031\036\032\034\033" +
    "\035\044\037\001\002\000\020\026\041\027\040\030\042" +
    "\031\036\032\034\033\035\044\037\001\002\000\020\026" +
    "\041\027\040\030\042\031\036\032\034\033\035\044\037" +
    "\001\002\000\020\026\041\027\040\030\042\031\036\032" +
    "\034\033\035\044\037\001\002\000\020\026\041\027\040" +
    "\030\042\031\036\032\034\033\035\044\037\001\002\000" +
    "\020\026\041\027\040\030\042\031\036\032\034\033\035" +
    "\044\037\001\002\000\020\026\041\027\040\030\042\031" +
    "\036\032\034\033\035\044\037\001\002\000\020\026\041" +
    "\027\040\030\042\031\036\032\034\033\035\044\037\001" +
    "\002\000\020\026\041\027\040\030\042\031\036\032\034" +
    "\033\035\044\037\001\002\000\020\026\041\027\040\030" +
    "\042\031\036\032\034\033\035\044\037\001\002\000\020" +
    "\026\041\027\040\030\042\031\036\032\034\033\035\044" +
    "\037\001\002\000\022\011\ufff8\015\ufff8\016\ufff8\017\ufff8" +
    "\020\ufff8\021\ufff8\045\ufff8\050\ufff8\001\002\000\036\007" +
    "\uffe3\013\uffe3\022\052\023\045\024\047\025\050\034\046" +
    "\035\054\036\044\037\051\040\055\041\056\042\uffe3\043" +
    "\uffe3\001\002\000\036\007\uffe5\013\uffe5\022\052\023\045" +
    "\024\047\025\050\034\uffe5\035\uffe5\036\uffe5\037\uffe5\040" +
    "\uffe5\041\uffe5\042\uffe5\043\uffe5\001\002\000\036\007\uffe6" +
    "\013\uffe6\022\052\023\045\024\047\025\050\034\uffe6\035" +
    "\uffe6\036\uffe6\037\uffe6\040\uffe6\041\uffe6\042\uffe6\043\uffe6" +
    "\001\002\000\036\007\uffe9\013\uffe9\022\052\023\045\024" +
    "\047\025\050\034\uffe9\035\uffe9\036\uffe9\037\uffe9\040\uffe9" +
    "\041\uffe9\042\uffe9\043\uffe9\001\002\000\036\007\uffe4\013" +
    "\uffe4\022\052\023\045\024\047\025\050\034\046\035\054" +
    "\036\044\037\051\040\055\041\056\042\uffe4\043\uffe4\001" +
    "\002\000\036\007\uffee\013\uffee\022\uffee\023\uffee\024\047" +
    "\025\050\034\uffee\035\uffee\036\uffee\037\uffee\040\uffee\041" +
    "\uffee\042\uffee\043\uffee\001\002\000\036\007\uffe7\013\uffe7" +
    "\022\052\023\045\024\047\025\050\034\uffe7\035\uffe7\036" +
    "\uffe7\037\uffe7\040\uffe7\041\uffe7\042\uffe7\043\uffe7\001\002" +
    "\000\036\007\uffeb\013\uffeb\022\uffeb\023\uffeb\024\uffeb\025" +
    "\uffeb\034\uffeb\035\uffeb\036\uffeb\037\uffeb\040\uffeb\041\uffeb" +
    "\042\uffeb\043\uffeb\001\002\000\036\007\uffec\013\uffec\022" +
    "\uffec\023\uffec\024\uffec\025\uffec\034\uffec\035\uffec\036\uffec" +
    "\037\uffec\040\uffec\041\uffec\042\uffec\043\uffec\001\002\000" +
    "\036\007\uffea\013\uffea\022\052\023\045\024\047\025\050" +
    "\034\uffea\035\uffea\036\uffea\037\uffea\040\uffea\041\uffea\042" +
    "\uffea\043\uffea\001\002\000\036\007\uffed\013\uffed\022\uffed" +
    "\023\uffed\024\047\025\050\034\uffed\035\uffed\036\uffed\037" +
    "\uffed\040\uffed\041\uffed\042\uffed\043\uffed\001\002\000\036" +
    "\007\uffe8\013\uffe8\022\052\023\045\024\047\025\050\034" +
    "\uffe8\035\uffe8\036\uffe8\037\uffe8\040\uffe8\041\uffe8\042\uffe8" +
    "\043\uffe8\001\002\000\036\007\uffe2\013\uffe2\022\052\023" +
    "\045\024\047\025\050\034\046\035\054\036\044\037\051" +
    "\040\055\041\056\042\uffe2\043\uffe2\001\002\000\022\011" +
    "\ufffe\015\ufffe\016\ufffe\017\ufffe\020\ufffe\021\ufffe\045\ufffe" +
    "\050\ufffe\001\002\000\004\002\uffff\001\002\000\020\026" +
    "\041\027\040\030\042\031\036\032\034\033\035\044\037" +
    "\001\002\000\034\007\102\022\052\023\045\024\047\025" +
    "\050\034\046\035\054\036\044\037\051\040\055\041\056" +
    "\042\053\043\057\001\002\000\004\010\103\001\002\000" +
    "\020\015\025\016\016\017\027\020\015\021\030\045\017" +
    "\050\020\001\002\000\022\011\105\015\025\016\016\017" +
    "\027\020\015\021\030\045\017\050\020\001\002\000\024" +
    "\011\ufff6\015\ufff6\016\ufff6\017\ufff6\020\ufff6\021\ufff6\045" +
    "\ufff6\050\ufff6\051\106\001\002\000\006\010\107\050\020" +
    "\001\002\000\020\015\025\016\016\017\027\020\015\021" +
    "\030\045\017\050\020\001\002\000\022\011\ufff4\015\ufff4" +
    "\016\ufff4\017\ufff4\020\ufff4\021\ufff4\045\ufff4\050\ufff4\001" +
    "\002\000\022\011\112\015\025\016\016\017\027\020\015" +
    "\021\030\045\017\050\020\001\002\000\022\011\ufff5\015" +
    "\ufff5\016\ufff5\017\ufff5\020\ufff5\021\ufff5\045\ufff5\050\ufff5" +
    "\001\002\000\004\046\114\001\002\000\004\006\115\001" +
    "\002\000\020\026\041\027\040\030\042\031\036\032\034" +
    "\033\035\044\037\001\002\000\034\007\117\022\052\023" +
    "\045\024\047\025\050\034\046\035\054\036\044\037\051" +
    "\040\055\041\056\042\053\043\057\001\002\000\004\013" +
    "\120\001\002\000\022\011\ufff7\015\ufff7\016\ufff7\017\ufff7" +
    "\020\ufff7\021\ufff7\045\ufff7\050\ufff7\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\116\000\006\002\005\003\003\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\016\004\022\005\021\006\023\007\025\011\020\012\013" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\014\005\075\006\023\007\025\011" +
    "\020\012\013\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\010\042\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\010\074\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\010\073\001" +
    "\001\000\004\010\072\001\001\000\004\010\071\001\001" +
    "\000\004\010\070\001\001\000\004\010\067\001\001\000" +
    "\004\010\066\001\001\000\004\010\065\001\001\000\004" +
    "\010\064\001\001\000\004\010\063\001\001\000\004\010" +
    "\062\001\001\000\004\010\061\001\001\000\004\010\060" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\010\100\001\001\000\002\001\001\000\002" +
    "\001\001\000\016\004\103\005\021\006\023\007\025\011" +
    "\020\012\013\001\001\000\014\005\075\006\023\007\025" +
    "\011\020\012\013\001\001\000\002\001\001\000\004\012" +
    "\107\001\001\000\016\004\110\005\021\006\023\007\025" +
    "\011\020\012\013\001\001\000\002\001\001\000\014\005" +
    "\075\006\023\007\025\011\020\012\013\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\010" +
    "\115\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public static String resultado = ""; 

    public void syntax_error(Symbol s)
    {
            System.err.println("Error Sintactico: "+ s.value + " - Fila: " + s.right + " - Columna: " + s.left + ". Recuperado" );
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception
    {
            System.err.println("Error Sintactico: "+ s.value + " - Fila: " + s.right + " - Columna: " + s.left + ". Sin recuperacion." );
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {

  
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // inicio ::= instatpy 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // instatpy ::= RVOID RMAIN PARI PARD LLAVEI listainstruccion LLAVED 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instatpy",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // listainstruccion ::= listainstruccion instruccion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("listainstruccion",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // listainstruccion ::= instruccion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("listainstruccion",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // instruccion ::= declaracion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instruccion",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // instruccion ::= imprimir 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instruccion",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // instruccion ::= if 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instruccion",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // declaracion ::= tipodato IDENTI PUNTOYCOMA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declaracion",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // declaracion ::= tipodato IDENTI IGUAL expresion PUNTOYCOMA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declaracion",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // imprimir ::= RCONSOLE PUNTO RWRITE PARI expresion PARD PUNTOYCOMA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("imprimir",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // if ::= RIF PARI expresion PARD LLAVEI listainstruccion LLAVED 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("if",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // if ::= RIF PARI expresion PARD LLAVEI listainstruccion LLAVED RELSE LLAVEI listainstruccion LLAVED 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("if",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // if ::= RIF PARI expresion PARD LLAVEI listainstruccion LLAVED RELSE if 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("if",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // tipodato ::= RINT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tipodato",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // tipodato ::= RDOUBLE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tipodato",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // tipodato ::= RCHAR 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tipodato",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // tipodato ::= RBOOL 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tipodato",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // tipodato ::= RSTRING 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tipodato",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expresion ::= expresion MAS expresion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expresion ::= expresion MENOS expresion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expresion ::= expresion POR expresion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expresion ::= expresion DIVIDIDO expresion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // expresion ::= expresion MENOR expresion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // expresion ::= expresion MAYOR expresion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // expresion ::= expresion MENORIGUAL expresion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // expresion ::= expresion MAYORIGUAL expresion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // expresion ::= expresion IGUALIGUAL expresion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // expresion ::= expresion DISTINTO expresion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // expresion ::= expresion RAND expresion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // expresion ::= expresion ROR expresion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // expresion ::= NEGADO expresion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // expresion ::= ENTERO 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // expresion ::= DECIMAL 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // expresion ::= CADENA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // expresion ::= CARACTER 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // expresion ::= RTRUE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // expresion ::= RFALSE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
