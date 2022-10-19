/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apuntesClase;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class EjemploSwitchRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Si el usuari introduce A,B o C se debe guardar
        //un aleatorio entre 1 y 10
        //Si introduce D,guardar aleatorio entre 11 y 25
        //Si introduce E, aleatorio entre 25 y 33.
        // En otro caso , aleatorio entre 34 y 100
        Scanner teclado = new Scanner(System.in);
        //Crear un pbjeto de tipo Random para generar aleatorios
        //con el constructor de Random
        Random generadorAleatorio = new Random();
        int numAleatorio;

        System.out.println("Introduce una letra(A,B,C,D,E)");

        String letraString = teclado.nextLine();

        System.out.println(" La letra es " + letraString);

        switch (letraString) {

            case "A","B","C":
                //Numero entre 1 y 10
                numAleatorio=generadorAleatorio.nextInt(10)+1;
                //System.out.println(" El numero Aleatorio es "+numAleatorio);
                break;
            case "D":
                //D,guardar aleatorio entre 11 y 25
                numAleatorio=generadorAleatorio.nextInt(25-11+1)+11;
                //System.out.println(" El numero Aleatorio es "+numAleatorio);
                break;
            case "E":
                //E 34 y 100
                numAleatorio=generadorAleatorio.nextInt(33-26+1)+26;
                //System.out.println(" El numero Aleatorio es "+numAleatorio);
                break;
            default:
                numAleatorio=generadorAleatorio.nextInt(100-34+1)+34;
                //System.out.println(" El numero Aleatorio es "+numAleatorio);
        }
        
            System.out.println(" El numero generador es  "+numAleatorio);

        /* //generar numero aleatorio dentro del rango
            numAleatorio=generadorAleatorio.nextInt();
            System.out.println("El numero aleatorio es:"+numAleatorio);
            
            //generar numero de 0 y 9,se pone +1 porque si no el 10 no sale
             numAleatorio=generadorAleatorio.nextInt(10)+1;
            System.out.println("El numero aleatorio es:"+numAleatorio);
            
            //generar numero entre 1 y 19, 0 pasa a 1 y 18 a 19.
             numAleatorio=generadorAleatorio.nextInt(19)+1;
            System.out.println("El numero aleatorio es:"+numAleatorio);
            //genear rango ente 12 u 18
            //nextInt(Mayor - Menor +1)+Menor
           numAleatorio=generadorAleatorio.nextInt(7)+12;*/
    }

}
