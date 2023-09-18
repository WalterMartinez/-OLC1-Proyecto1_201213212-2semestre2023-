/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author walte
 */
public class Info {
    public static LinkedList<Error> listaErrores = new LinkedList<>();
    public static HashMap<String, String> listavariables = new HashMap<>();
    public static Map<String, Map<String, String>> informacion = new HashMap<>();
    public static Map<String, String> ajson = new HashMap<>();
  
    public static void mostrarinfo(){  
        for (Map.Entry<String, Map<String, String>> e : informacion.entrySet()){
            System.out.println(e);
        
        }
        System.out.println("");
    }
    
 
    //data.Info.listavariables.put(a.toString(),b.toString()); 
    //public Map<String, String> ajson = new HashMap<>();
    //Ajson.put(a.toString(),b.toString());
    //data.Info.informacion.put(Interfaz.Principal.nombrearchivo,ajson);
}