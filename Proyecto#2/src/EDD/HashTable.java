/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**

 * Esta clase es la estructuras de datos de la tabla hash

 * @author: Kevin Li, Tomás Gil y Natalia Rivas

 * @version: 29/03/2023

 */  
public class HashTable {
    //Campos de la clase 
    private List<Nodo> [] table;
    private Integer size;
   
    // Constructor para la creacion de tablas hash  

    public HashTable(int size) {
        this.size = size;
        this.table = new List [this.size];
        
        for (int i = 0 ; i < size; i++){
            List<Nodo> lista = new List();
            table[i]= lista;
        } 
    } //Cierre del constructor
    
    
    /**
     * Método para buscar un indice de un elemento en una tabla hash
     * @param reference String que será la referencia al que se le buscará el índice
     * @return Integer que es el índice a donde será ingresado en la tabla hash
     */
    public int Hash(String reference){
        int hash = 0;
        for(int i = 0; i < reference.length(); i++) {
            hash = (hash * 31 + reference.charAt(i)) % getSize();}
    
        return hash; 
    } //Cierre metodo
    
    /**
     * Método de inserción de un Objeto Resumenes en una tabla Hash
     * @param Hash Integer que es el índice a donde será ingresado en la tabla hash
     * @param data Objeto Resumenes que será el objeto al que se le realizará la inserción
     * @return Booleano que verifica si el elemento ha sido ingresado correctamente o es un elemento repetido
     */
    public boolean Insert_Resumen(int hash,Resumenes data){
        boolean repetidos=this.getTable()[hash].insertFinal_Resumenes(data);
        return repetidos;
    } //Cierre metodo
    
    /**
     * Método de inserción de un Objeto PalabraClave en una tabla Hash
     * @param Hash Integer que es el índice a donde será ingresado en la tabla hash
     * @param data Objeto PalabraClave que será el objeto al que se le realizará la inserción
     */
    public void Insert_PC(int hash,PalabraClave data){
        this.getTable()[hash].insertFinal_PalabraClave(data);
    } //Cierre metodo
    
    /**
     * Método de búsquea de uno nodo con datos de tipo Resumenes en una tabla Hash
     * @param Hash Integer que es el índice en donde se ubica en la tabla hash
     * @param Title String que es el título de un resumen que se desea buscar su Nodo Resumenes
     * @return Nodo de Tipo Resumenes que es el Nodo Buscado de acuerdo al título ingresado
     */
    public Nodo<Resumenes> SearchTitle(int hash, String Title){
        Nodo <Resumenes> nodo = this.getTable()[hash].searchTitle(Title);
        return nodo;
    } //Cierre metodo
    
    /**
     * Método de búsquea de uno nodo con datos de tipo PalabraClave en una tabla Hash
     * @param Hash Integer que es el índice en donde se ubica en la tabla hash
     * @param PC String que es la palabra clave de un resumen que se desea buscar su Nodo PalabraClave
     * @return Nodo de Tipo PalabraClave que es el Nodo Buscado de acuerdo a la Palabra Clave ingresada
     */
    public Nodo<PalabraClave> SearchPalabraClave(int hash, String PC){
        Nodo <PalabraClave> nodo = this.getTable()[hash].searchPC(PC);
        return nodo;
    } //Cierre metodo

    /**
     * @return the table
     */
    public List<Nodo>[] getTable() {
        return table;
    }

    /**
     * @param table the table to set
     */
    public void setTable(List<Nodo>[] table) {
        this.table = table;
    }

    /**
     * @return the size
     */
    public Integer getSize() {
        return size;
    }
    
}

