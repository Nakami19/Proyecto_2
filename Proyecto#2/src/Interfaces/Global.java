/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;
import EDD.HashTable;
import EDD.List;
import EDD.Nodo;

/**
 *
 * @author kevin
 */
public class Global {
    //Parámetros de la clase Global
    private static HashTable hashtable = new HashTable();
    private static List<Nodo<String>> listaTitulos = new List();

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
    

}

