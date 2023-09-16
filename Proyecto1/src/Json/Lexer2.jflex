// ------------  Paquete e importaciones ------------
package Json; 

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

COMENTARIO          =   ("//".*\r\n)|("//".*\n)|("//".*\r)
COMENTMULTILINEA    =   "/*""/"*([^*/]|[^*]"/"|"*"[^/])*"*"*"*/"
D=[0-9]+
DD=[0-9]+("."[  |0-9]+)?
CADENACOMILLASDOBLES = [\"]([^\"\n]|(\\\"))*[\"]


%%
// ------------  Reglas Lexicas -------------------

{COMENTARIO}            {System.out.println(yytext());}
{COMENTMULTILINEA}      {System.out.println(yytext());}
{CADENACOMILLASDOBLES}  {return new Symbol(sym.CADENA,yycolumn,yyline, yytext());}

"{"     {return new Symbol(sym.LLAVEI,yycolumn,yyline, yytext());}
"}"     {return new Symbol(sym.LLAVED,yycolumn,yyline, yytext());}
":"     {return new Symbol(sym.DOSPUNTOS,yycolumn,yyline, yytext());}
","     {return new Symbol(sym.COMA,yycolumn,yyline, yytext());}

{D}  { return new Symbol(sym.ENTERO, yycolumn, yyline, yytext()); }
{DD}  { return new Symbol(sym.DECIMAL, yycolumn, yyline, yytext()); }




//------> Ingorados 
[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}

//------> Errores Léxicos 
.           	{ System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn); 
                data.Info.listaErrores.add(new data.Error("Error Léxico", "No reconocido el caracter " + yytext(), yyline, yycolumn));
   
}


