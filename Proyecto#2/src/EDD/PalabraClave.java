/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author kevin
 */
public class PalabraClave {
    private String palabraclave;
    private List<Nodo<Resumenes>> lista_resumen;

    public PalabraClave(String palabraclave, List<Nodo<Resumenes>> lista_resumen) {
        this.palabraclave = palabraclave;
        this.lista_resumen = lista_resumen;
    }

    public String getPalabraclave() {
        return palabraclave;
    }

    public void setPalabraclave(String palabraclave) {
        this.palabraclave = palabraclave;
    }

    public List<Nodo<Resumenes>> getLista_resumen() {
        return lista_resumen;
    }

    public void setLista_resumen(List<Nodo<Resumenes>> lista_resumen) {
        this.lista_resumen = lista_resumen;
    }


}
