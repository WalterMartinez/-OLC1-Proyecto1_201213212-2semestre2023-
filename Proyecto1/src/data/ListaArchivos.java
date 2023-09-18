/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author walte
 */
public class ListaArchivos {
    public static List<Archivo> listaarchivos = new ArrayList<>();
    
    public static void mostrarinfo(){
    
        for (Archivo arch : listaarchivos) {
            System.out.println("Ruta: " + arch.ruta+"    Identificador: " + arch.nombre+"     Valor: " + arch.valor);
            System.out.println();
        }
        
    }
}
    //Archivo archivo1 = new Archivo(Interfaz.Principal.nombrearchivo,a.toString(),b.toString());
    //data.ListaArchivos.listaarchivos.add(archivo1);


/*public class ListaDePersonas {
    public static void main(String[] args) {
        // Crear una lista para almacenar personas
        List<Persona> listaDePersonas = new ArrayList<>();

        // Agregar instancias de Persona a la lista
        Persona persona1 = new Persona("Juan", 30, "Calle A");
        Persona persona2 = new Persona("Maria", 25, "Calle B");

        listaDePersonas.add(persona1);
        listaDePersonas.add(persona2);

        // Puedes seguir agregando más personas a la lista si es necesario
    }
}*/
