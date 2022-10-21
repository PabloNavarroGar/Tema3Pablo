/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apuntesClase;

/**
 *
 * @author pablo
 */
public class For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Al for tenemos que saber el numero de veces que vamos a realizarlo
        //del 0 al 10
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            
            
        }
        System.out.println("-------------------------");
        //del 0 al 20 de 2 en 2
        for (int i = 0; i < 20; i+=2) {
            System.out.println(i);
        }
        
        System.out.println("---------------------------");
        
        //20 a 0
        
        for (int i = 20; i >= 0; i--) {
            System.out.println(i);
            
        }
        
        
        
    }
    
}
