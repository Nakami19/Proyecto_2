/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import EDD.HashTable;
import EDD.List;
import EDD.Nodo;
import EDD.Resumenes;
import Interfaces.Ventana;

/**
 *
 * @author Tomas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
        

        Resumenes aresumen = new Resumenes("a","a","si se pudo","a");
        Resumenes bresumen = new Resumenes("b","a","aleluya","a");
        Resumenes cresumen = new Resumenes("a","d","si se pudo","a");
        
        HashTable prueba1 = new HashTable();
        prueba1.Insert(12,aresumen);
        prueba1.Insert(12,bresumen);
        
        System.out.println(prueba1.Hash("Complemento de software para el diseño de fundaciones."));
        System.out.println(prueba1.Hash("Arquitectura referencial para mecanismos de Internacionalización y localización en PHP."));
        System.out.println(prueba1.Hash("Sistema de diseño basado en Grid"));
        System.out.println(prueba1.Hash("GraphQL vs REST: una comparación desde la perspectiva de eficiencia de desempeño."));
        
        
        System.out.println(prueba1.Search_Title(12, "b").getData().getContent());
        
    }
    
}
