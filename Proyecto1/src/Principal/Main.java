/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

import Interfaz.Principal;
import java.io.StringReader;

/**
 *
 * @author walte
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    Principal p = new Principal();
    p.setVisible(true);
   // ANALIZADOR DE STATPY 
   analizadores("src/StatPy/", "Lexer.jflex","Parser.cup");
   
   //analizador JSON
   //analizadores("src/Json/", "Lexer2.jflex","Parser2.cup");
     
   String entrada2 = """
                     // Comentario Simple
                     /* Comentario
                     Multilinea*/
                        
                        
                     {
                     	"titulo":"Reporte 1",
                     	"ejex1":"Reprobado",
                     	"ejex2":"Aprobado",
                     	"val1": 60.0,
                     	"val2": 61.0
                     }
                     """;
   
    //analizar2(entrada2);
    
    for (String i : data.Info.listavariables.keySet()){
        System.out.println("key: " + i + " value: " + data.Info.listavariables.get(i) );
    }
        String variable100 = "\"titulo\"";
        System.out.println(" el valor del registro val1 "+ data.Info.listavariables.get(variable100));    
    
    System.out.println("\n### Errores ###");
    data.Info.listaErrores.forEach((t) -> {
        System.out.println(t.toString());
    });
    
    }
    public static void analizadores(String ruta, String jflexFile, String cupFile){
        try {
            String opcionesJflex[] =  {ruta+jflexFile,"-d",ruta};
            jflex.Main.generate(opcionesJflex);

            String opcionesCup[] =  {"-destdir", ruta,"-parser","Parser",ruta+cupFile};
            java_cup.Main.main(opcionesCup);
            
        } catch (Exception e) {
            System.out.println("No se ha podido generar los analizadores");
            System.out.println(e);
        }
    }
    
        // Realizar Analisis
    public static void analizar2 (String entrada){
        try {
            Json.Lexer lexer = new Json.Lexer(new StringReader(entrada)); 
            Json.Parser parser = new Json.Parser(lexer);
            parser.parse();
        } catch (Exception e) {
            System.out.println("Error fatal en compilación de entrada.");
            System.out.println(e);
        } 
    }
   
}
