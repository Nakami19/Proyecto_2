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
        List <String> astr = new List<String>();
        List <String> bstr = new List<String>();
        astr.insertFinal_String("a");
        bstr.insertFinal_String("b");
        Resumenes aresumen = new Resumenes("a",astr,"si se pudo",astr);
        Resumenes bresumen = new Resumenes("b",bstr,"b",bstr);
        
        alista.insertFinal_Resumenes(aresumen);
        blista.insertFinal_Resumenes(bresumen);
        
        HashTable prueba1 = new HashTable();
        prueba1.Insert(prueba1.Hash("a"),aresumen);
        System.out.println(prueba1.Search_Title(prueba1.Hash("a"), "a").getData().getContent());
        
    }
    
}
