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
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad:");

        int edad = scanner.nextInt();

        /* if (edad >= 18) {
                        System.out.println("Es mayor de edad");
                } else {
                        System.out.println("No es mayor de edad");
                }

                System.out.print("mostrar la edad: ");
                System.out.println(edad);
                
         */
        //Pasamos el ejercicio con Operandos ?:
        // Los operadores ternarios se declara el operador entre parentesis el ?
        //equivale a algo junto a las comillas con 2 pisible resultados
        String resultado;
        resultado = (edad >= 18) ? " Eres mayor de edad" : " Eres menor de Edad";

        System.out.println(resultado);
        

    }

}
