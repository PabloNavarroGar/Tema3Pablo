/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosRepeticion;

/**
 *
 * @author pablo
 */
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declaracion variable
       //Realizar un programa que imprima 25 términos de la serie 
       //15 - 30 - 60 - 120, etc. No se introducen valores por teclado.
      final int NUMERO_DE_REPETICIONES = 25;
        int contador=15;
        int iterador =0;
       while(iterador<=NUMERO_DE_REPETICIONES){
           contador*=2; 
           System.out.println(contador);
           iterador++; //actualizacion
            
        }
       
      
        
        
    }
    
}
