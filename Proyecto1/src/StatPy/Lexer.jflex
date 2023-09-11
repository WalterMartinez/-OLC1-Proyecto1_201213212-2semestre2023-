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

%init{ 
    yyline = 1; 
    yychar = 1; 
%init} 
// ------> Expresiones Regulares 

D=[0-9]+
DD=[0-9]+("."[  |0-9]+)?
IDENTI = [A-Za-z]["_"0-9A-Za-z]*


COMENTARIO          =   ("//".*\r\n)|("//".*\n)|("//".*\r)
COMENTMULTILINEA    =   "/*""/"*([^*/]|[^*]"/"|"*"[^/])*"*"*"*/"

CADENACOMILLASDOBLES = [\"]([^\"\n]|(\\\"))*[\"]
CARACTER            =   [\']([^\t\'\"\n]|(\\\")|(\\n)|(\\\')|(\\t))?[\']  



%%
// ------------  Reglas Lexicas -------------------

{COMENTARIO}            {}
{COMENTMULTILINEA}      {}
{CADENACOMILLASDOBLES}  {return new Symbol(sym.CADENA,yyline,yychar, (yytext()).substring(1,yytext().length()-1));}

"int"                   {return new Symbol(sym.RINT,yyline,yychar, yytext());}
"double"                {return new Symbol(sym.RDOUBLE,yyline,yychar, yytext());}
"char"                  {return new Symbol(sym.RCHAR,yyline,yychar, yytext());}
"bool"                  {return new Symbol(sym.RBOOL,yyline,yychar, yytext());}
"string"                {return new Symbol(sym.RSTRING,yyline,yychar, yytext());}
"void"                  {return new Symbol(sym.RVOID,yyline,yychar, yytext());}
"main"                  {return new Symbol(sym.RMAIN,yyline,yychar, yytext());}
"if"                    {return new Symbol(sym.RIF,yyline,yychar, yytext());}
"else"                  {return new Symbol(sym.RELSE,yyline,yychar, yytext());}
"console"               {return new Symbol(sym.RCONSOLE,yyline,yychar, yytext());}
"write"                 {return new Symbol(sym.RWRITE,yyline,yychar, yytext());}
"switch"                {return new Symbol(sym.RSWITCH,yyline,yychar, yytext());}
"case"                  {return new Symbol(sym.RCASE,yyline,yychar, yytext());}
"break"                 {return new Symbol(sym.RBREAK,yyline,yychar, yytext());}
"default"               {return new Symbol(sym.RDEFAULT,yyline,yychar, yytext());}
"for"                   {return new Symbol(sym.RFOR,yyline,yychar, yytext());}
"while"                 {return new Symbol(sym.RWHILE,yyline,yychar, yytext());}
"do"                    {return new Symbol(sym.RDO,yyline,yychar, yytext());}
"definirglobales"       {return new Symbol(sym.RGLOBALES,yyline,yychar, yytext());}
"graficabarras"         {return new Symbol(sym.RBARRAS,yyline,yychar, yytext());}
"graficapie"            {return new Symbol(sym.RPIE,yyline,yychar, yytext());}

"=" {return new Symbol(sym.IGUAL,yyline,yychar, yytext());}
"+" {return new Symbol(sym.MAS,yyline,yychar, yytext());}
"-" {return new Symbol(sym.MENOS,yyline,yychar, yytext());}
"*" {return new Symbol(sym.POR,yyline,yychar, yytext());}
"/" {return new Symbol(sym.DIVIDIDO,yyline,yychar, yytext());}
"(" {return new Symbol(sym.PARD,yyline,yychar, yytext());}
")" {return new Symbol(sym.PARI,yyline,yychar, yytext());}
"{" {return new Symbol(sym.LLAVED,yyline,yychar, yytext());}
"}" {return new Symbol(sym.LLAVEI,yyline,yychar, yytext());}
"[" {return new Symbol(sym.CORD,yyline,yychar, yytext());}
"]" {return new Symbol(sym.CORI,yyline,yychar, yytext());}
";" {return new Symbol(sym.PUNTOYCOMA,yyline,yychar, yytext());}
":" {return new Symbol(sym.DOSPUNTOS,yyline,yychar, yytext());}
"<" {return new Symbol(sym.MENORQUE,yyline,yychar, yytext());}
">" {return new Symbol(sym.MAYORQUE,yyline,yychar, yytext());}
"$" {return new Symbol(sym.DOLAR,yyline,yychar, yytext());}
"<="    {return new Symbol(sym.MENOROIGUAL,yyline,yychar, yytext());}
">="    {return new Symbol(sym.MAYOROIGUAL,yyline,yychar, yytext());}
"=="    {return new Symbol(sym.IGUALQUE,yyline,yychar, yytext());}
"!="    {return new Symbol(sym.DISTINTOQUE,yyline,yychar, yytext());}
"&&"    {return new Symbol(sym.RAND,yyline,yychar, yytext());}
"||"    {return new Symbol(sym.ROR,yyline,yychar, yytext());}
"!"     {return new Symbol(sym.DISTINTO,yyline,yychar, yytext());}
"++"    {return new Symbol(sym.INCREMENTO,yyline,yychar, yytext());}
"--"    {return new Symbol(sym.DECREMENTO,yyline,yychar, yytext());}

\n {yychar=1;}

{CARACTER}  {return new Symbol(sym.CARACTER,yyline,yychar, yytext());}
{IDENTI}    {return new Symbol(sym.IDENTI,yyline,yychar, yytext());}
{D}     {return new Symbol(sym.ENTERO, yycolumn, yyline, yytext()); }
{DD}    {return new Symbol(sym.DECIMAL,yyline,yychar, yytext());}




//------> Ingorados 
[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}

//------> Errores Léxicos 
.           	{ System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn); }


