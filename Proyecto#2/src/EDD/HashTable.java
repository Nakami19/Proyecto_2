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
    private List<Nodo> [] table;
    private Integer size;

    public HashTable(int size) {
        this.size = size;
        this.table = new List [this.size];
        
        for (int i = 0 ; i < size; i++){
            List<Nodo> lista = new List();
            table[i]= lista;
        }
    }
    
    public int Hash(String reference){
        int hash = 0;
        for(int i = 0; i < reference.length(); i++) {
            hash = (hash * 31 + reference.charAt(i)) % getSize();}
    
        return hash;
    }
    
    public boolean Insert_Resumen(int hash,Resumenes data){
        boolean repetidos=this.table[hash].insertFinal_Resumenes(data);
        return repetidos;
    }
    
    public void Insert_PC(int hash,PalabraClave data){
         this.table[hash].insertFinal_PalabraClave(data);
    }
    

    public Nodo<Resumenes> SearchTitle(int hash, String Title){
        Nodo <Resumenes> nodo = this.table[hash].searchTitle(Title);
        return nodo;
    }
    
    public Nodo<PalabraClave> SearchPalabraClave(int hash, String PC){
        Nodo <PalabraClave> nodo = this.table[hash].searchPC(PC);
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

