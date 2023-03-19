/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Tomas
 */
public class Resumenes {
    private String title;
    private String authors;
    private String content;
    private String keywords;

    public Resumenes(String title, String authors, String content, String keywords) {
        this.title = title;
        this.authors = authors;
        this.content = content;
        this.keywords = keywords;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the authors
     */
    public String getAuthors() {
        return authors;
    }

    /**
     * @param authors the authors to set
     */
    public void setAuthors(String authors) {
        this.authors = authors;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the keywords
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * @param keywords the keywords to set
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
    
    public String print(){
        String resumen = "";
        int i = 1;        
        resumen += getTitle() + "\n"
                + "Autores: " + getAuthors() + "\n";
        
        String[] words = getKeywords().split("\n");
        for(int index = 0; index < words.length; index++){
            resumen += "Palabra clave: " + words[index] + ": " + " Frecuencia en el texto: "+ Integer.toString(wordAmmount(words[index])) + "\n"; 
        }
        /*for(Nodo<String> nodo = getKeywords().getHead(); nodo != null;){
            resumen += "Palabra clave " + Integer.toString(i) + ": " + nodo.getData() +" Frecuencia en el texto: "+ Integer.toString(wordAmmount(nodo.getData()));
            i++;
        }*/
        return resumen;
    }
    
    public int wordAmmount(String word){
        int wordCount = 0;
        
        String text = getContent();
        String[] words = text.replaceAll("\\p{Punct}", "").split(" ");

        for(int i=0; i < words.length; i++){
            if(words[i].equals(word)){
                wordCount++;
            }
        }
        return wordCount;
    }
}
