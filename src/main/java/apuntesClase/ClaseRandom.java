/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apuntesClase;

import java.util.Random;

/**
 *
 * @author samue
 */
public class ClaseRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Random numAleatorio = new Random();
            //El +1 al final del parentesis es para que entre el 100, ya que si no es de 0 al 99
        int numero1 = numAleatorio.nextInt(100)+1;

        System.out.println("El numero Aleatorio es :" + numero1);

        for (int i = 0; i < 5; i++) {
            System.out.println(numAleatorio.nextInt());
        }
        
        
        double numero2= numAleatorio.nextDouble(10)+1;
        
            System.out.printf("El numero decimal aleatorio entre 0 y 10 es :"+"%.2f",numero2);
    }
    
    

}
