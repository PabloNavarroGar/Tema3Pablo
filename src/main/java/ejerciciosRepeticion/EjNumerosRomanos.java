/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosRepeticion;

import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class EjNumerosRomanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Variables
        int numeroDecimal = 0;

        String romano;
        // Conversion de las unidades y decenas.

        //Menu
        String menu = """
                           ¿Que es lo que quieres hacer?
                      /-----------------------------------------\
                      1. Pasar numero decimal (1 al 10) a Romano.
                      2. Contar las vocales que quiere un nombre.   
                      3. Salir
                      ------------------------------------------
                      """;

        //Inicio del bucle, Todo lo que esta dentro del do vuelve al principio del menu
        do {
            String opcion = JOptionPane.showInputDialog(null, menu);

            //Inicio del Switch
            switch (opcion) {

                case "1":
                    //Introduccion de datos
                    String decimalString = JOptionPane.showInputDialog("Introduce el "
                            + "numero que quieres pasar a Romano(1 al 10)");
                    //Parse del int para el String
                    numeroDecimal = Integer.parseInt(decimalString);
                    //Salida de datos
                    JOptionPane.showMessageDialog(null, "Vamos a pasar "
                            + numeroDecimal
                            + " a numeros romanos");
                    //Comenzamos el if, 
                    //Si el numero es entre 1 y 10 pasa a romano si no error volver al menu
                    if (numeroDecimal >= 1 && numeroDecimal <= 10) {
                        //Convertir numero del 1 al romano
                        if (numeroDecimal == 9) {
                            //declaracion del string a romano
                            romano = "IX";
                            //salida de datos
                            JOptionPane.showMessageDialog(null, "En romano "
                                    + numeroDecimal + " es " + romano);
                            //else if para seguir con los numeros
                        } else if (numeroDecimal == 8) {
                            romano = "VIII";
                            JOptionPane.showMessageDialog(null, "En romano "
                                    + numeroDecimal + " es " + romano);
                        } else if (numeroDecimal == 7) {
                            romano = "VII";
                            JOptionPane.showMessageDialog(null, "En romano "
                                    + numeroDecimal + " es " + romano);

                        } else if (numeroDecimal == 6) {
                            romano = "VI";
                            JOptionPane.showMessageDialog(null, "En romano "
                                    + numeroDecimal + " es " + romano);

                        } else if (numeroDecimal == 5) {
                            romano = "V";
                            JOptionPane.showMessageDialog(null, "En romano "
                                    + numeroDecimal + " es " + romano);
                        } else if (numeroDecimal == 4) {
                            romano = "IV";
                            JOptionPane.showMessageDialog(null, "En romano "
                                    + numeroDecimal + " es " + romano);

                        } else if (numeroDecimal == 3) {
                            romano = "III";
                            JOptionPane.showMessageDialog(null, "En romano "
                                    + numeroDecimal + " es " + romano);

                        } else if (numeroDecimal == 2) {
                            romano = "II";
                            JOptionPane.showMessageDialog(null, "En romano "
                                    + numeroDecimal + " es " + romano);
                        } else if (numeroDecimal == 1) {
                            romano = "I";
                            JOptionPane.showMessageDialog(null, "En romano "
                                    + numeroDecimal + " es " + romano);
                        } else if (numeroDecimal == 10) {
                            romano = "IX";
                            JOptionPane.showMessageDialog(null, "En romano "
                                    + numeroDecimal + " es " + romano);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null,
                                " Error, numero no permitido");

                    }
                    break;

                case "2":
                    //La segunda debe contar las vocales que tiene un nombre.

                    //Panel introductorio de datos
                    String nombre = JOptionPane.showInputDialog("Introduce el "
                            + "nombre que quieres ver sus vocales").toLowerCase();
                    //Variables 
                    char letra;
                    //contador para el iteradio
                    int contador = 0;
                    //en este for ponemos que el i=0, y que si i es menor al la longitud del nombre(panel) y vaya sumando
                    for (int i = 0; i < nombre.length(); i++) {
                        // la letra es igual a los caracteres del nombre con i
                        letra = nombre.charAt(i);
                        //declaracion de un if con la condicion de que si la letra es igual a `x` con cada caso logico ||
                        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                            //Actualizacion del bucle para que no entre en infinito
                            contador = contador + 1;

                        }

                    }
                    //Salida de datos
                    JOptionPane.showMessageDialog(null,
                            "El nombre contiene " + contador + " vocales. ");

                    break;

                case "3":
                    //Opcion de salida
                    JOptionPane.showMessageDialog(null,
                            "Has decidido salir del programa");

                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                            "Error,opcion no disponible");

            }
            //Para que se ejecute el do while, tenemos que marcar las opciones 1 y 2 por falsas, ya que asi nunca se cerrara el programa si
            //seleccionamos estas, la 3 al ponerla en true en el momento que la marquemos, al ser true la condicion dejara de ejecutarse
        } while (menu.equals(1) == false && menu.equals(2) == false && menu.equals(3) == true);

    }

}
