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
        boolean repetidos = false;
        Nodo<Resumenes> node = new Nodo<Resumenes>(data);
        if (isEmpty()) {
            setFirst(node);
            setLast(node);
        } else {
            Nodo<Resumenes> pointer = getFirst();
            while (pointer.getNext() != null) {
                
                if (pointer.getData().getTitle() == node.getData().getTitle()){
                repetidos = true;
                JOptionPane.showMessageDialog(null,"Error!! Resumen ya ingresado, por favor ingrese otro resumen");
                }
                
                pointer = pointer.getNext();}
            
            if (repetidos = false){
            pointer.setNext(node);
            setLast(pointer);}
        }
        size++;
    }
    
    public void insertFinal_String(T data){
        Nodo node = new Nodo(data);
        if (isEmpty()) {
            setFirst(node);
            setLast(node);
            
        } else {
            Nodo pointer = getFirst();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();}
            
            pointer.setNext(node);
            setLast(pointer);}
        
        size++;
    }
    
    public Nodo<Resumenes> Search_Title (String title){
        Nodo<Resumenes> pointer = getFirst();
        Nodo<Resumenes> nodo = null;
        while (pointer != null){
            if (pointer.getData().getTitle() == title){
                nodo = pointer;
                break;
            }
            pointer = pointer.getNext();
        }

        return nodo;
        
    }
    
    public void Imprimir(){
        Nodo<Resumenes> pointer = getFirst();
        while (pointer!=null){
            System.out.println(pointer.getData().getTitle());
            pointer = pointer.getNext();
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
