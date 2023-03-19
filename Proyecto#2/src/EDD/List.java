/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Tomas
 */
public class List<T> {
    private Nodo<T> head;
    private int size;
    
    public List(){
        this.head = null;
        this.size = 0;
    }

    /**
     * @return the head
     */
    public Nodo<T> getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(Nodo<T> head) {
        this.head = head;
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
        return getHead() == null;
    }
    
    public Nodo<T> insertEnd(T data){
        Nodo<T> node = new Nodo<T>(data);
        if (isEmpty()) {
            setHead(node);
        } else {
            Nodo pointer = getHead();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(node);
        }
        size++;
        return node;
    }
}
