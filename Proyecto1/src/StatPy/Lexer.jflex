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

{COMENTARIO}            {System.out.println(yytext());}
{COMENTMULTILINEA}      {System.out.println(yytext());}
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

"while"                 {return new Symbol(sym.RWHILE,yycolumn,yyline, yytext());}
"do"                    {return new Symbol(sym.RDO,yycolumn,yyline, yytext());}
"for"                   {return new Symbol(sym.RFOR,yycolumn,yyline, yytext());}
"++"                    {return new Symbol(sym.INCREMENTO,yycolumn,yyline, yytext());}
"--"                    {return new Symbol(sym.DECREMENTO,yycolumn,yyline, yytext());}

"switch"                {return new Symbol(sym.RSWITCH,yycolumn,yyline, yytext());}
"case"                  {return new Symbol(sym.RCASE,yycolumn,yyline, yytext());}
"break"                 {return new Symbol(sym.RBREAK,yycolumn,yyline, yytext());}
"default"               {return new Symbol(sym.RDEFAULT,yycolumn,yyline, yytext());}

"definirglobales"       {return new Symbol(sym.RGLOBALES,yycolumn,yyline, yytext());}
"graficabarras"         {return new Symbol(sym.RBARRAS,yycolumn,yyline, yytext());}
"graficapie"            {return new Symbol(sym.RPIE,yycolumn,yyline, yytext());}
"newvalor"              {return new Symbol(sym.RNEWVAL,yycolumn,yyline, yytext());}

"titulo"                {return new Symbol(sym.RTITULO,yycolumn,yyline, yytext());}
"ejex"                  {return new Symbol(sym.REJEX,yycolumn,yyline, yytext());}
"valores"               {return new Symbol(sym.RVALORES,yycolumn,yyline, yytext());}
"titulox"               {return new Symbol(sym.RTITULOX,yycolumn,yyline, yytext());}
"tituloy"               {return new Symbol(sym.RTITULOY,yycolumn,yyline, yytext());}
    


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

":"     {return new Symbol(sym.DOSPUNTOS,yycolumn,yyline, yytext());}

"["     {return new Symbol(sym.CORI,yycolumn,yyline, yytext());}
"]"     {return new Symbol(sym.CORD,yycolumn,yyline, yytext());}
"$"     {return new Symbol(sym.DOLAR,yycolumn,yyline, yytext());}
","     {return new Symbol(sym.COMA,yycolumn,yyline, yytext());}


\n {yychar=1;}


{IDENTI}    {return new Symbol(sym.IDENTI,yycolumn,yyline, yytext());}
{D}     {return new Symbol(sym.ENTERO, yycolumn, yyline, yytext()); }
{DD}    {return new Symbol(sym.DECIMAL,yycolumn,yyline, yytext());}




//------> Ingorados 
[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}

//------> Errores Léxicos 
.           	{ System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn); }


