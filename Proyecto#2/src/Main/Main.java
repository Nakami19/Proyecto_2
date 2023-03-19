/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Interfaces.Ventana;

/**
 *
 * @author Tomas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String string = "El adelanto tecnológico presente hoy en día ha traído una gran cantidad de herramientas útiles para los\n" +
"ingenieros, incorporando el uso de sistemas de información para la toma de decisiones en los procesos\n" +
"de cálculo y la visualización de materiales creados a través de los cálculos; así como avanza las\n" +
"tecnologías a usar, también deben actualizarse las herramientas para asegurar su durabilidad y\n" +
"fiabilidad en el tiempo. El siguiente trabajo presenta una herramienta que, con ayuda de métodos de\n" +
"cálculo existentes para fundaciones directas e indirectas, genera el diseño de las mismas en conjunto a\n" +
"través de valores ingresados por el usuario, estableciendo así un medio en el que pueda visualizarse de\n" +
"manera eficiente y sencilla los resultados del cálculo previamente establecido, pues automatiza el\n" +
"proceso de dibujo y cálculo en AutoCAD. Dicha herramienta se implementó como un complemento o\n" +
"extensión de software que permite el diseño y dibujo de las fundaciones con base en las librerías,\n" +
"funciones y modelos de AutoCAD. La extensión obtenida puede ser modificada en el tiempo para\n" +
"extender sus funcionalidades. La misma implementa diversos métodos para diseño de fundaciones,\n" +
"entre los que se cuenta Caquot-Kerisel y Meyerhof, aplicado en las fundaciones indirectas. En el caso\n" +
"de las fundaciones directas, implementa el método de Terzaghi y Vesic. Igualmente, se realizó un\n" +
"modelo de cálculo para el diseño de todas las fundaciones de la estructura, el cual fue implementado en\n" +
"el complemento obtenido en este trabajo de investigación.";
        
        string = string.replaceAll("\\p{Punct}", "");
        System.out.println(string);
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
    }
    
}
