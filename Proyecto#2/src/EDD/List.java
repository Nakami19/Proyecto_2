/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import javax.swing.JOptionPane;

/**

 * Esta clase es la estructuras de datos de una lista simplemenete enlazada

 * @author: Kevin Li, Tomás Gil y Natalia Rivas

 * @version: 29/03/2023

 */  
public class List<T> {
    //Campos de la clase 
    private Nodo first;
    private Nodo last;
    private int size;
    
    // Constructor para la creacion de listas simplemente enlazadas
   
    public List(){
        this.first = null;
        this.last = null;
        this.size = 0;
    } //Cierre del constructor

    /**
     * @return the head
     */
    public Nodo getFirst() {
        return first;
    }

    /**
     * @return the last
     */
    public Nodo getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(Nodo last) {
        this.last = last;
    }
    
    /**
     * @param head the head to set
     */
    public void setFirst(Nodo first) {
        this.first = first;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    /**
     * Método que confirma si la lista está vacía o no
     * @return Booleano que indica si la lista está vacia o no
     */
    public boolean isEmpty(){
        return getFirst() == null;
    } //Cierre metodo
    
    
    /**
     * Método que inserta un resumen a la lista de resúmenes, si es un resumen ya ingresado no lo introducirá
     * @param data Objeto Resumen
     * @return Booleano que indica si el resumen que se intenta insertar a existe en la lista o no
     */
    public boolean insertFinal_Resumenes(Resumenes data){        
        boolean repetidos = false;
        Nodo<Resumenes> node = new Nodo<Resumenes>(data);
        if (isEmpty()) {
            setFirst(node);
            setLast(node);
            size++;
        } else {
             repetidos = false;
            Nodo<Resumenes> pointer = getFirst();
            while (pointer != null) {
                
                if (pointer.getData().getTitle().equalsIgnoreCase (node.getData().getTitle())){
                    repetidos = true;
                    JOptionPane.showMessageDialog(null,"Error!! Resumen ya ingresado, por favor ingrese otro resumen ^_^ ");
                    return repetidos;
                }
                
                pointer = pointer.getNext();}
            
            if (repetidos == false){
                pointer=getLast();
                pointer.setNext(node);
                setLast(node);
                size++;
            } 
        }
        return repetidos;
    } //Cierre metodo
    
    /**
     * Método que inserta una palabra clave a la lista de palabras clave, si es una palabra clave ya ingresada no la introducirá
     * @param data Objeto Palabra clave
     */
    public void insertFinal_PalabraClave(PalabraClave data){

        boolean repetidos = false;
        Nodo<PalabraClave> node = new Nodo<PalabraClave>(data);
        if (isEmpty()) {

            setFirst(node);
            setLast(node);
            size++;
        } else {
            repetidos = false;
            Nodo<PalabraClave> pointer = getFirst();
            while (pointer != null) {
                if (pointer.getData().getPalabraclave().equalsIgnoreCase (node.getData().getPalabraclave())){
                    pointer.getData().getLista_resumen().insertFinal_Resumenes((Resumenes) node.getData().getLista_resumen().getFirst().getData());
                    repetidos = true;
                }
                
                pointer = pointer.getNext();}
            if (repetidos == false){
                pointer=getLast();
                pointer.setNext(node);
                setLast(node);
                size++;
            } 
        }
    } //Cierre metodo
    
    /**
     * Método que inserta un String al final de una lista de Strings, si el String ya existe dentro de la lista, no se introducirá
     * @param data String que se introducirá a la lista de Strings
     */
    public void insertFinal_String(String data){
         boolean repetidos = false;
        Nodo<String> node = new Nodo<String>(data);
        if (isEmpty()) {
            setFirst(node);
            setLast(node);
            size++;
        } else {
            repetidos = false;
            Nodo<String> pointer = getFirst();
            while (pointer != null) {
                
                if (pointer.getData().equalsIgnoreCase(node.getData())){
                    repetidos = true;
                }
                
                pointer = pointer.getNext();
            }
           
            if (repetidos == false){
               
                pointer=getLast();
                pointer.setNext(node);
                setLast(node);
                size++;
            } 
        }
    } //Cierre metodo
    
    /**
     * Método que va a Buscar una palabra clave a partir de un String dado 
     * @param PC String de la palabra clave que se va a buscar
     * @return Nodo Palabra clave que incluira el objeto palabra clave que se está buscando
     */
    public Nodo<PalabraClave> searchPC(String PC){
        
        Nodo<PalabraClave> aux = getFirst();
        Nodo<PalabraClave> nodo = null;

            while (aux != null){
                if(aux.getData().getPalabraclave().toLowerCase().equalsIgnoreCase(PC.toLowerCase())){
                    nodo = aux;
                }
                aux = aux.getNext();
            }
            
        return nodo;
    } //Cierre metodo
    
    /**
     * Método que va a buscar un resumen a partir de su título
     * @param titulo String que será el titulo del resumen
     * @return Objeto Nodo Resumenes en donde estará contenido el resumen que se busca
     */
    public Nodo<Resumenes> searchTitle(String titulo){
        
        Nodo<Resumenes> aux = getFirst();
        Nodo<Resumenes> nodo = null;
            if (getSize() == 1){
                nodo = aux;
            }else{
            while (aux != null){
                if(aux.getData().getTitle().equalsIgnoreCase(titulo)){
                    nodo = aux;
                }
                aux = aux.getNext();
            }}
        
        return nodo;
    } //Cierre metodo
    
    
    /**
     * Método que ordenará la lista de Strings de forma alfabética
     */
    public void Ordenar_Lista(){
        Nodo<String> aux = getFirst();
        Nodo<String> index;
        String temp;
        if (isEmpty()){
            JOptionPane.showMessageDialog(null,"Error!! La lista se encuentra vacia");
        } else{
            while (aux != null){
                index = aux.getNext();
                while (index!=null){
                    if(aux.getData().toLowerCase().compareTo(index.getData().toLowerCase()) > index.getData().toLowerCase().compareTo(aux.getData().toLowerCase())){
                        temp = aux.getData();
                        aux.setData(index.getData());
                        index.setData(temp);
                    }
                    index = index.getNext();
                }
                aux = aux.getNext();
            }
        }
    } //Cierre metodo
    

}
