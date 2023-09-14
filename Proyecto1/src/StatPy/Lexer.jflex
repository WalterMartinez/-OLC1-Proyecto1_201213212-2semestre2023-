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
CARACTER            =   [\']([^\t\'\"\n]|(\\\")|(\\n)|(\\\')|(\\t))?[\']  
CADENACOMILLASDOBLES = [\"]([^\"\n]|(\\\"))*[\"]




%%
// ------------  Reglas Lexicas -------------------

{COMENTARIO}            {}
{COMENTMULTILINEA}      {}
{CADENACOMILLASDOBLES}  {return new Symbol(sym.CADENA,yycolumn,yyline, yytext());}
{CARACTER}              {return new Symbol(sym.CARACTER,yycolumn,yyline, yytext());}

"int"                   {return new Symbol(sym.RINT,yycolumn,yyline, yytext());}
"double"                {return new Symbol(sym.RDOUBLE,yycolumn,yyline, yytext());}
"char"                  {return new Symbol(sym.RCHAR,yycolumn,yyline, yytext());}
"bool"                  {return new Symbol(sym.RBOOL,yycolumn,yyline, yytext());}
"string"                {return new Symbol(sym.RSTRING,yycolumn,yyline, yytext());}
"void"                  {return new Symbol(sym.RVOID,yycolumn,yyline, yytext());}
"main"                  {return new Symbol(sym.RMAIN,yycolumn,yyline, yytext());}
"true"                  {return new Symbol(sym.RTRUE,yycolumn,yyline, yytext());}
"false"                 {return new Symbol(sym.RFALSE,yycolumn,yyline, yytext());}

"console"               {return new Symbol(sym.RCONSOLE,yycolumn,yyline, yytext());}
"write"                 {return new Symbol(sym.RWRITE,yycolumn,yyline, yytext());}

"if"                    {return new Symbol(sym.RIF,yycolumn,yyline, yytext());}
"else"                  {return new Symbol(sym.RELSE,yycolumn,yyline, yytext());}


"="     {return new Symbol(sym.IGUAL,yycolumn,yyline, yytext());}
"+"     {return new Symbol(sym.MAS,yycolumn,yyline, yytext());}
"-"     {return new Symbol(sym.MENOS,yycolumn,yyline, yytext());}
"*"     {return new Symbol(sym.POR,yycolumn,yyline, yytext());}
"/"     {return new Symbol(sym.DIVIDIDO,yycolumn,yyline, yytext());}
"("     {return new Symbol(sym.PARI,yycolumn,yyline, yytext());}
")"     {return new Symbol(sym.PARD,yycolumn,yyline, yytext());}
"{"     {return new Symbol(sym.LLAVEI,yycolumn,yyline, yytext());}
"}"     {return new Symbol(sym.LLAVED,yycolumn,yyline, yytext());}
";"     {return new Symbol(sym.PUNTOYCOMA,yycolumn,yyline, yytext());}

"<"     {return new Symbol(sym.MENOR,yycolumn,yyline, yytext());}
">"     {return new Symbol(sym.MAYOR,yycolumn,yyline, yytext());}
"<="    {return new Symbol(sym.MENORIGUAL,yycolumn,yyline, yytext());}
">="    {return new Symbol(sym.MAYORIGUAL,yycolumn,yyline, yytext());}
"=="    {return new Symbol(sym.IGUALIGUAL,yycolumn,yyline, yytext());}
"!="    {return new Symbol(sym.DISTINTO,yycolumn,yyline, yytext());}

"&&"    {return new Symbol(sym.RAND,yycolumn,yyline, yytext());}
"||"    {return new Symbol(sym.ROR,yycolumn,yyline, yytext());}

"!"     {return new Symbol(sym.NEGADO,yycolumn,yyline, yytext());}

"."     {return new Symbol(sym.PUNTO,yycolumn,yyline, yytext());}

\n {yychar=1;}


{IDENTI}    {return new Symbol(sym.IDENTI,yycolumn,yyline, yytext());}
{D}     {return new Symbol(sym.ENTERO, yycolumn, yyline, yytext()); }
{DD}    {return new Symbol(sym.DECIMAL,yycolumn,yyline, yytext());}




//------> Ingorados 
[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}

//------> Errores Léxicos 
.           	{ System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn); }


