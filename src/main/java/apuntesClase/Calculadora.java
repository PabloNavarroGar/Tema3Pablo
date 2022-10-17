/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apuntesClase;

import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double resultado;

        double operando1 = Double.parseDouble(JOptionPane
                .showInputDialog(" Introduce el operando 1"));

        double operando2 = Double.parseDouble(JOptionPane
                .showInputDialog(" Introduce el operando 2"));

        //Menu calculadora
        String menu = """
                     ----------------------------------------------
                        Seleccione que Operacion quiere realizar:
                     ----------------------------------------------
                        1.Sumar
                        2.Restar
                        3.Multiplicar
                        4.Dividir
                     ----------------------------------------------
                     """;
        //Declarar e inicializar en string para que aparacezca
        String opcion = JOptionPane.showInputDialog(null, menu);
        //Logica de la aplicacion
        //Si es opcion 1 -->Sumar
        //Poner entre comillas el objetto que es el string
        /* if (opcion.equals("1")) {
            resultado = operando1 + operando2;
            System.out.printf(" El resultado es %.2f", resultado);
        } else {
            //Si es opcion 2 -->restar
            if (opcion.equals("2")) {
                resultado = operando1 - operando2;
                System.out.printf(" El resultado es %.2f", resultado);
            } else {
                //Si es opcion 3 -->Multiplicar
                if (opcion.equals("3")) {
                    resultado = operando1 * operando2;
                    System.out.printf(" El resultado es %.2f", resultado);
                } else {

                    //Si es opcion 4 -->Dividir
                    if (opcion.equals("4")) {
                        resultado = operando1 / operando2;
                        System.out.printf(" El resultado es %.2f", resultado);
                    }
                }

               

            }

        }

    }
    
         */
        
        /*
        //else if va despue sde un if, y todo junto, queda mas compactado y no tan separado
        if (opcion.equals("1")) {
            resultado = operando1 + operando2;
            System.out.printf(" El resultado es %.2f", resultado);
        } else if (opcion.equals("2")) {
            resultado = operando1 - operando2;
            System.out.printf(" El resultado es %.2f", resultado);
        } else if (opcion.equals("3")) {
            resultado = operando1 * operando2;
            System.out.printf(" El resultado es %.2f", resultado);
        } else if (opcion.equals("4")) {
            resultado = operando1 / operando2;
            System.out.printf(" El resultado es %.2f", resultado);
        }
        */
    }

}


    
    
    
    
    


