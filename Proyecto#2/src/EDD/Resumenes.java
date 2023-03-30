/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**

 * Esta clase es de objetos de tipo Resumenes

 * @author: Kevin Li, Tomás Gil y Natalia Rivas

 * @version: 29/03/2023

 */  
public class Resumenes {
    //Campos de la clase 
    private String title;
    private String authors;
    private String content;
    private String keywords;

    // Constructor para Objetos de tipo Resumenes
    
    public Resumenes(String title, String authors, String content, String keywords) {
        this.title = title;
        this.authors = authors;
        this.content = content;
        this.keywords = keywords;
    } //Cierre del constructor

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
   
    /**
     * Método que retorna un string con todos los datos de un resúmen: titulo, autores, palabras clave y su frecuencia en el texto
     * @return String de los datos
     */
    public String print(){
        String resumen = "";
        int i = 1;        
        resumen += getTitle() + "\n"
                + "Autores: " +"\n"+ getAuthors() + "\n";
        
        String[] words = getKeywords().toLowerCase().split(",");
        int counter=1;
        for(int index = 0; index < words.length; index++){
            resumen += "Palabra clave "+counter+": " + words[index] + ", " + " Frecuencia en el texto: "+ Integer.toString(wordAmmount(words[index])) + "\n"; 
            counter++;
        }
        return resumen.trim();
    }
    
   /**
    * Método que devuelve la cantidad de veces que una palabra aparece en un texto
    * @param word La palabra que se va a analizar
    * @return El número que indica la cantidad de veces que la palabra aparece en el texto
    */
   
    public int wordAmmount(String word){
        String text = getContent().toLowerCase();
        return text.split(word).length -1;
    }
    
    
    /**
     * Metodo que guarda en un String la informacion contenida en el resumen 
     * @return String que contiene la informacion del resumen 
     */
    public String guardar() {
    String resumen = "";       
        resumen += getTitle() + "\n"+"\n"
                + "Autores "+"\n" + getAuthors() +"\n"+ "\n"+"Resumen"+"\n"+getContent()+"\n"+"\n"+"Palabra clave:"+getKeywords();
        return resumen.trim();
   }
    
}
