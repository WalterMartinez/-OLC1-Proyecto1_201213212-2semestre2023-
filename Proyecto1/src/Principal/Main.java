/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

import Interfaz.Principal;

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
    
   analizadores("src/StatPy/", "Lexer.jflex","Parser.cup");
   
    
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
    
}
