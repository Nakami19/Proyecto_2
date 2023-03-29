/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**

 * Esta clase de objetos tipo PalabraClave

 * @author: Kevin Li, Tomás Gil y Natalia Rivas

 * @version: 29/03/2023

 */  
public class PalabraClave {
    //Campos de la clase 
    private String palabraclave;
    private List<Nodo<Resumenes>> lista_resumen;

    // Constructor para Objetos de tipo palabra clave   
    
    public PalabraClave(String palabraclave, List<Nodo<Resumenes>> lista_resumen) {
        this.palabraclave = palabraclave;
        this.lista_resumen = lista_resumen;
    } //Cierre del constructor

    /**
     * @return the palabraclave
     */
    public String getPalabraclave() {
        return palabraclave;
    }

    /**
     * @param palabraclave the palabraclave to set
     */
    public void setPalabraclave(String palabraclave) {
        this.palabraclave = palabraclave;
    }

    /**
     * @return the lista_resumen
     */
    public List<Nodo<Resumenes>> getLista_resumen() {
        return lista_resumen;
    }

    /**
     * @param lista_resumen the lista_resumen to set
     */
    public void setLista_resumen(List<Nodo<Resumenes>> lista_resumen) {
        this.lista_resumen = lista_resumen;
    }



}
