// ------------  Paquete e importaciones ------------
package StatPy; 

import java_cup.runtime.*;

%%	
//-------> Directivas (No tocar)

%public 
%class Lexer
%cup
%char
%column
%line
%unicode
%ignorecase

%{  
%}
// ------> Expresiones Regulares 

D=[0-9]+
DD=[0-9]+("."[  |0-9]+)?
IDENTI = [A-Za-z]["_"0-9A-Za-z]*


COMENTARIO          =   ("//".*\r\n)|("//".*\n)|("//".*\r)
COMENTMULTILINEA    =   "/*""/"*([^*/]|[^*]"/"|"*"[^/])*"*"*"*/"





%%
// ------------  Reglas Lexicas -------------------

{COMENTARIO}            {}
{COMENTMULTILINEA}      {}

"int"                   {return new Symbol(sym.RINT,yycolumn,yyline, yytext());}
"double"                {return new Symbol(sym.RDOUBLE,yycolumn,yyline, yytext());}
"char"                  {return new Symbol(sym.RCHAR,yycolumn,yyline, yytext());}
"bool"                  {return new Symbol(sym.RBOOL,yycolumn,yyline, yytext());}
"string"                {return new Symbol(sym.RSTRING,yycolumn,yyline, yytext());}
"void"                  {return new Symbol(sym.RVOID,yycolumn,yyline, yytext());}
"main"                  {return new Symbol(sym.RMAIN,yycolumn,yyline, yytext());}


"=" {return new Symbol(sym.IGUAL,yycolumn,yyline, yytext());}
"+" {return new Symbol(sym.MAS,yycolumn,yyline, yytext());}
"-" {return new Symbol(sym.MENOS,yycolumn,yyline, yytext());}


"*" {return new Symbol(sym.POR,yycolumn,yyline, yytext());}
"/" {return new Symbol(sym.DIVIDIDO,yycolumn,yyline, yytext());}
"(" {return new Symbol(sym.PARI,yycolumn,yyline, yytext());}
")" {return new Symbol(sym.PARD,yycolumn,yyline, yytext());}
"{" {return new Symbol(sym.LLAVEI,yycolumn,yyline, yytext());}
"}" {return new Symbol(sym.LLAVED,yycolumn,yyline, yytext());}
";" {return new Symbol(sym.PUNTOYCOMA,yycolumn,yyline, yytext());}



\n {yychar=1;}


{IDENTI}    {return new Symbol(sym.IDENTI,yycolumn,yyline, yytext());}
{D}     {return new Symbol(sym.ENTERO, yycolumn, yyline, yytext()); }
{DD}    {return new Symbol(sym.DECIMAL,yycolumn,yyline, yytext());}




//------> Ingorados 
[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}

//------> Errores Léxicos 
.           	{ System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn); }


