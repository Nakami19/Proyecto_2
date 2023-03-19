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
    
    public void insertFinal_Resumenes(Resumenes data){
        Nodo<Resumenes> node = new Nodo<Resumenes>(data);
        if (isEmpty()) {
            setFirst(node);
            setLast(node);
            size++;
        } else {
            boolean repetidos = false;
            Nodo<Resumenes> pointer = getFirst();
            while (pointer != null) {
                
                if (pointer.getData().getTitle() == node.getData().getTitle()){
                    repetidos = true;
                    JOptionPane.showMessageDialog(null,"Error!! Resumen ya ingresado, por favor ingrese otro resumen ^_^ ");
                }
                
                pointer = pointer.getNext();}
            
            if (repetidos == false){
                pointer=getLast();
                pointer.setNext(node);
                setLast(node);
                size++;
            } 
        }
        
    }   
    
    public void Ordenar_Lista(){
        Nodo<Resumenes> aux = getFirst();
        Nodo<Resumenes> index;
        Resumenes temp;
        if (isEmpty()){
            JOptionPane.showMessageDialog(null,"Error!! La lista se encuentra vacia");
        } else{
            while (aux != null){
                index = aux.getNext();
                while (index!=null){
                    if(aux.getData().getTitle().toLowerCase().compareTo(index.getData().getTitle().toLowerCase()) > index.getData().getTitle().toLowerCase().compareTo(aux.getData().getTitle().toLowerCase())){
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
    
    public Nodo<Resumenes> searchNodo(int index){
        Nodo <Resumenes> aux = getFirst();
        Nodo <Resumenes> nodo = null;
        Integer i = 1;
        if (isEmpty()){
            JOptionPane.showMessageDialog(null,"Error!! La lista se encuentra vacia");
        }
        else if (index > getSize()){
            JOptionPane.showMessageDialog(null,"Error!! por favor ingrese un numero mostrado en pantalla");
        } else if (index <= getSize()){
            while (aux!=null){
                if (i == index){
                    nodo = aux;
                    break;
                }
                aux=aux.getNext();
                i++;
            }
        }
        return nodo;
    }
    
    public String showResumes(List<Nodo<Resumenes>> resumenes, String texto){
        for(Nodo<Resumenes> node = resumenes.getFirst(); node != null; node = node.getNext()){
            texto += node.getData().print();
            texto += "\n";
        }
        return texto;
    }
}
