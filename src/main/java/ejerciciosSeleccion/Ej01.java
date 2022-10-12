/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosSeleccion;

import java.util.Scanner;

/**
 *
 * @author samue
 */

  
  public class Ej01 {
        public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Introduce tu edad:");

                int edad = scanner.nextInt();

                if (edad >= 18) {
                        System.out.println("Es mayor de edad");
                } else {
                        System.out.println("No es mayor de edad");
                }

                System.out.print("Mostrar la edad: ");
                System.out.println(edad);
        }
        
        //- Implementa el siguiente programa y realiza ejecuciones para los 
        //siguientes datos de edad: 15,18 y 60. ¿Cuáles son los resultados
        // Con 15 años el programa dices que es menor de edad
        // con 18 y 60 mayor de edad y omite el mensaje de No es mayor de edad
        // solo aparece el de mayor de edad
        
        
        
        
        
        
        
        
        
        
  }

