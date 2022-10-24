/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosRepeticion;

/**
 *
 * @author samue
 */
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int numero = 1;
         
          while (numero < 11)
          {
               System.out.println("Número: " + numero);
               numero++;
          }
          do {
               System.out.println("Número: " + --numero);
          } while(numero > 1);
   	  }

        // Dado un numero entero 1, mientras el numero sea menor que 11, que va a ser hasta 10,
        //dese el 1 al 10, y despues con el do while,poniendo --numero, que sale 10 en vez de 11,
        //va a ser desde el 10 al 1, como su condicion es
        // que numero  mayor a 1 y como es 1 se quedara en 1.
        
        
        
        
        
    }
    

