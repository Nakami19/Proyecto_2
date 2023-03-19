/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import javax.swing.JOptionPane;

/**
 *
 * @author Tomas
 */
public class List<T> {
    private Nodo first;
    private Nodo last;
    private int size;
    
    public List(){
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    /**
     * @return the head
     */
    public Nodo getFirst() {
        return first;
    }

    public Nodo getLast() {
        return last;
    }

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
    
    public boolean isEmpty(){
        return getFirst() == null;
    }
    
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
    }
    
    public boolean insertFinal_String(String data){
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
                    return repetidos;
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
        return repetidos;
    }   
    
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
    }
    
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
    }
    
    public String showResumes(List<Nodo<Resumenes>> resumenes, String texto){
        for(Nodo<Resumenes> node = resumenes.getFirst(); node != null; node = node.getNext()){
            texto += node.getData().print();
            texto += "\n";
        }
        return texto;
    }
}
