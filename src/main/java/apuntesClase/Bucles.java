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
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            //El bucle while entre 0 y N veces
        Scanner teclado = new Scanner(System.in);
        System.out.println(" Introduce el numero");
        int num = teclado.nextInt(); //1 variable de control
        //Pedir un numero hasta que sea conrrecto 100 ente 200

        while (num < 100 || num > 200) {

            System.out.println(" Te has equicocado vuelve a introducir");
            num = teclado.nextInt();//Actualizacion del bucle

        }

        //bucle while,do-while y for
        //Contiene partes
        //Inicializacion de la variable de control
        int numero = 0;

        //Condicion del bucle
        //Mientras la condicion del bucle sea true se repite el codigo entre {
        //Si quiero que sea 10 = si no 11
        while (numero <= 10) {

            System.out.println(numero);
            //SIEMPRE DENTRO DEL BUCLE HAY QUE ACTUALIZAR LA VARIABLE DE CONTROL

            numero++; //actualizacion variable de control

        }

        System.out.println("El bucle a terminado");

        //Del 20 al 0
        System.out.println("-----------------------------------");
        //1.Incializacion variable
        numero = 20;
        //2. condicionVARIABLE
        while (numero >= 0) {
            System.out.println(numero);

            numero--; //3.actualizacion variable de control sirve para que no entre infinuto

        }
        System.out.println("--------------------------------");
        //del 50 al 70 de tres en tres

        numero = 50;

        while (numero <= 70) {
            System.out.println(numero);
            numero += 3;//mirar apuntes tema 2 sobre esto

        }

    }

}
