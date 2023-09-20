/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import java.io.StringReader;
import java.util.LinkedList;

/**
 *
 * @author walte
 */
public class Funcion {
    public LinkedList lista = new LinkedList();
    
    public static int contador = 0;
    public static LinkedList<String> traduccion = new LinkedList<>();
    
    
    
    public static String traducciontexto = "";

public static void imprimirlista (){

            
            try {
            // Código que puede arrojar una excepción
            traduccion.forEach((valor) -> {
                System.out.println(valor);
                
            });
                System.out.println("se imprimio bien la traduccion");
                
            } catch(Exception e) {
            // Manejo de la excepción
            System.err.println("ERROR NO SE PUEDE IMPRIMIR LA LISTA " + e.getMessage());
            }

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
     public static void analizar1 (String entrada){
        try {
            StatPy.Lexer lexer = new StatPy.Lexer(new StringReader(entrada)); 
            StatPy.Parser parser = new StatPy.Parser(lexer);
            parser.parse();
        } catch (Exception e) {
            System.out.println("Error fatal en compilación de entrada.");
            System.out.println(e);
        } 
    }
     public static LinkedList<String> tabulaciones (LinkedList<String> lista){
         String tabs = "";
         for(int i = 0; i < contador; i++){
             tabs = "\t"+tabs;
         }
         
         for(int i =0; i< lista.size(); i++){
             lista.set(i, tabs+lista.get(i));
         }
         return lista;
     }
     
     
}


