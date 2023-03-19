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
        
        List <Nodo<Resumenes>> alista = new List<>();
        List <Nodo<Resumenes>> blista = new List<>();

        Resumenes aresumen = new Resumenes("a","a","si se pudo","a");
        Resumenes bresumen = new Resumenes("b","a","b","a");
        
        alista.insertFinal_Resumenes(aresumen);
        blista.insertFinal_Resumenes(bresumen);
        
        HashTable prueba1 = new HashTable();
        prueba1.Insert(prueba1.Hash("a"),aresumen);
        System.out.println(prueba1.Search_Title(prueba1.Hash("a"), "a").getData().getContent());
        
    }
    
}
