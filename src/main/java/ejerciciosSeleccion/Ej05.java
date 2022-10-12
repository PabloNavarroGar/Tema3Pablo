/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosSeleccion;

import java.util.Scanner;

public class Ej05 {

    /*
    
    
    
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;
        double areaCuadrado;
        double ladoCuadrado;
        double areaTriangulo;
        double BaseTriangulo;
        double alturaTriangulo;
        double areaCirculo;
        double radioCirculo;

        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");

        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular el área de un cuadrado...");

            System.out.println(" ¿Cuanto mide el lado de tu cuadrado?");

            ladoCuadrado = entrada.nextDouble();

            areaCuadrado = Math.sqrt(ladoCuadrado);

            String resultadoCuadrado = """
                                      
                                      EL area del cuadrado es de : %.2f 
                                      """.formatted(areaCuadrado);
            System.out.println(resultadoCuadrado);

        } else {

            if (opcion == 2) {
                System.out.println("Ha seleccionado calcular el 	área de un triángulo...");

                System.out.println("Ha seleccionado calcular el área de un Triangulo...");

                System.out.println(" ¿Cuanto mide la base de tu triangulo?");

                BaseTriangulo = entrada.nextDouble();

                System.out.println(" ¿Cuanto mide la altura de tu triangulo?");

                alturaTriangulo = entrada.nextInt();

                areaTriangulo = BaseTriangulo * alturaTriangulo / 2;

                String resultadoTriangulo = """
                                      
                                      EL area del triangulo  es de : %.2f 
                                      """.formatted(areaTriangulo);
                System.out.println(resultadoTriangulo);

            } else {

                if (opcion == 3) {
                    System.out.println("Ha seleccionado calcular el área de un círculo...");

                    System.out.println("Ha seleccionado calcular el área de un ciruclo...");

                    System.out.println(" ¿Cuanto mide el radio del circulo?");

                    radioCirculo = entrada.nextDouble();

                    areaCirculo = Math.PI * Math.sqrt(radioCirculo);

                    String resultadoCirculo = """
                                      
                                      EL area del triangulo  es de : %.2f 
                                      """.formatted(areaCirculo);
                    System.out.println(resultadoCirculo);

                } else {
                    System.out.println("Ha seleccionado terminar");
                }
            }
        }
    }
}
