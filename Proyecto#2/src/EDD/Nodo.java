/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**

 * Esta clase son los nodos de tipo T

 * @author: Kevin Li, Tomás Gil y Natalia Rivas

 * @version: 29/03/2023

 */  
public class Nodo<T>{
    //Campos de la clase 
    private T data;
    private Nodo<T> next;
    

    // Constructor para Nodos de tipo T   
  
    public Nodo(T data){
        this.data = data;
        this.next = null;
    } //Cierre del constructor

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @return the next
     */
    public Nodo<T> getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Nodo<T> next) {
        this.next = next;
    }
        
}
