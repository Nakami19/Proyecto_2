/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author kevin
 */
public class HashTable {
    private List<Nodo<Resumenes>> [] table;
    private Integer size;

    public HashTable() {
        this.size = 17;
        this.table = new List [this.size];
        
        for (int i = 0 ; i < 17; i++){
            List<Nodo<Resumenes>> lista = new List();
            table[i]= lista;
        }
    }
    
    public int Hash(String reference){
        int hash = 0;
        for(int i = 0; i < reference.length(); i++) {
            hash = (hash * 31 + reference.charAt(i)) % getSize();}
    
        return hash;
    }
    
    public void Insert(int hash,Resumenes data){
        this.table[hash].insertFinal_Resumenes(data);
    }
    
    public Nodo<Resumenes> Search_Title(int hash, String title){
        Nodo<Resumenes> nodo = this.table[hash].Search_Title(title);
        return nodo;
    }
    
    public List[] getTable() {
        return table;
    }

    public void setTable(List[] table) {
        this.table = table;
    }

    public Integer getSize() {
        return size;
    }
    
}
