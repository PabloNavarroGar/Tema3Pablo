/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosRepeticion;

/**
 *
 * @author samue
 */
public class Ej09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int i = 0;
        int j = 6;
        while (i < 0) {
            i++;
            j++;
        }
        System.out.println(j);
        // Dado i = 0 j j = 6, co un while: mientras i sea menor que 0,se le suma 0,
        //no se suma porque no se cumple, j que en este caso se suma 0 por parte de i y luego 6 
        // por 'j' por lo que el resultado es 6.
    }

}
