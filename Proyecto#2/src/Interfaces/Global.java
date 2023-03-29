/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;
import EDD.HashTable;
import EDD.List;
import EDD.Nodo;

/**

 * Esta clase es la clase clase en donde se almacenan las variables globales de edd

 * @author: Kevin Li, Tomás Gil y Natalia Rivas

 * @version: 29/03/2023

 */  
public class Global {
    //Parámetros de la clase Global
    private static HashTable hashtable = new HashTable(16);
    private static List<Nodo<String>> listaTitulos = new List();
    private static HashTable keytable = new HashTable(32);
    
    public static List<Nodo<String>> getListaTitulos() {
        return listaTitulos;
    }

    public static void setListaTitulos(List<Nodo<String>> listaTitulos) {
        Global.listaTitulos = listaTitulos;
    }

    public static HashTable getHashtable() {
        return hashtable;
    }

    public static void setHashtable(HashTable hashtable) {
        Global.hashtable = hashtable;
    }

    public static HashTable getKeytable() {
        return keytable;
    }

    public static void setKeytable(HashTable keytable) {
        Global.keytable = keytable;
    }
    

}

