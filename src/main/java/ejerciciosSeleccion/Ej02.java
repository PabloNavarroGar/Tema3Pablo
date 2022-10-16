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
public class Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
        Utilizando el operador ternario ?: de Java, implementa las siguientes s
        entencias:
        Si el número “x” es mayor o igual que 135 se devolverá “mayor”, si es
        menor se devolverá “menor”. Las cadenas que se devuelven se guardarán 
        en una variable llamada resultado.
        Si el número “x” es menor o igual que cero se imprimirá en pantalla 
        “Menor que cero”, si no se imprimirá “Mayor que cero”.
        Guardar el valor absoluto de un número entero en una variable entera
        (sin usar la función Math.abs())

        
        
        
        
        
        
         */
        //variables
        Scanner teclado = new Scanner(System.in);

        System.out.println(" ¿Que numero quieres comparar con 135?");

        int numero = teclado.nextInt();
        String resultado;

        String resultado2;
        resultado = (numero >= 135) ? " Es mayor de 135 " : " Es mayor a 135";

        System.out.println(resultado);

        resultado2 = (numero <= 0) ? "Menor que cero " : " Mayor que cero";

        System.out.println(resultado2);

    }

}
