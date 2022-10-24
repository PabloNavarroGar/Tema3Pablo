/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosRepeticion;

/**
 *
 * @author samue
 */
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Modifica el programa del ejercicio 11 para que se vea el código
        // numérico (número entero) de cada una de las letras.
        
        char letra = 'A';
         
         do{
             System.out.println("Letra " + letra+" y su numero numerico es " +(int)letra);
             letra++;
         
         }while(letra<='Z');
        
        
    }
    
}
