/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;
import EDD.HashTable;

/**
 *
 * @author kevin
 */
public class Global {
    //Parámetros de la clase Global
    private static HashTable hashtable = new HashTable();

    public static HashTable getHashtable() {
        return hashtable;
    }

    public static void setHashtable(HashTable hashtable) {
        Global.hashtable = hashtable;
    }
    

}
