/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosRepeticion;

/**
 *
 * @author samue
 */
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Modifica el programa del ejercicio 10 para que se vea el código numérico (número entero) de cada una de las letras.

        for (int letra = 'a'; letra <= 'z'; letra++) {
            //MIRAR bien las condiciones <=!!!
            System.out.println(" Letra " + (char) letra +" , su codigo numérico "
                    + "(entero) es " +letra);

        }
    }
    
}
