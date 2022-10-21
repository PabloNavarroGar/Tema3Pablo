/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apuntesClase;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class EjemploDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //El Dowhile entre 1 y N veces
        //imprimir del 0 a 10
        int numero = 0;
        do{
            System.out.println(numero);
            numero++;
            
        } while(numero <=10);
          
        
        System.out.println(" sale del bucle ");
        
        numero = 10;
        
        do{
            System.out.println(numero);
            numero--;
            
        }  while (numero >=0);      
        
        Scanner teclado = new Scanner(System.in);
        int valor =0;
       
        do{
            System.out.println("Introduce un numero entre 100 y 200");
            valor = teclado.nextInt();
            
                    
        } while(valor<100|| valor>200);
        
        
        
        
        
        
        
        
    }
    
}
