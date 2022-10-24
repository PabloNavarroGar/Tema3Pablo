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
                      -----------------------------------------
                      1. Pasar numero decimal (1 al 10) a Romano.
                      2. Contar las vocales que quiere un nombre.   
                      3. Salir
                      
                      """;
        
        //Inicio del bucle, Todo lo que esta dentro del do vuelve al principio del progama
        do {
        String opcion = JOptionPane.showInputDialog(null, menu);
        

        
            switch (opcion) {

                case "1":
                    String decimalString = JOptionPane.showInputDialog("Introduce el "
                            + "numero que quieres pasar a Romano");
                    //Pase del int
                    numeroDecimal = Integer.parseInt(decimalString);

                    JOptionPane.showMessageDialog(null, "Vamos a pasar "
                            + numeroDecimal
                            + " a numeros romanos");

                    //Si el numero es entre 1 y 10 pasa a romano si no error volver al menu
                    if (numeroDecimal >= 1 && numeroDecimal <= 10) {
                        //Convertir numero del 1 al romano
                        if (numeroDecimal == 9) {
                            romano = "IX";
                            JOptionPane.showMessageDialog(null, "En romano "
                                    + numeroDecimal + " es " + romano);
                        } else if (numeroDecimal == 8) {
                            romano = "VIII";
                            JOptionPane.showMessageDialog(null, "En romano "
                                    + numeroDecimal + " es " + romano);
                        } else if (numeroDecimal == 7) {
                            romano = "VII";
                            JOptionPane.showMessageDialog(null, "En romano "
                                    + numeroDecimal + " es " + romano);

                        } else if(numeroDecimal == 6){
                            romano = "VI";
                            JOptionPane.showMessageDialog(null, "En romano "
                                    + numeroDecimal + " es " + romano);
                            
                        } else if(numeroDecimal == 5){
                            romano = "V";
                            JOptionPane.showMessageDialog(null, "En romano "
                                    + numeroDecimal + " es " + romano);
                        } else if(numeroDecimal == 4){
                            romano = "IV";
                            JOptionPane.showMessageDialog(null, "En romano "
                                    + numeroDecimal + " es " + romano);
                            
                        } else if (numeroDecimal == 3){
                            romano = "III";
                            JOptionPane.showMessageDialog(null, "En romano "
                                    + numeroDecimal + " es " + romano);
                            
                        } else if (numeroDecimal == 2) {
                            romano = "II";
                            JOptionPane.showMessageDialog(null, "En romano "
                                    + numeroDecimal + " es " + romano);
                        } else if (numeroDecimal == 1){
                            romano = "I";
                            JOptionPane.showMessageDialog(null, "En romano "
                                    + numeroDecimal + " es " + romano);
                        }
                            
                    } else {
                        JOptionPane.showMessageDialog(null,
                                " Error, numero no permitido");

                    }
                    break;

                default:

            }
        } while (menu.equals(1)==false && menu.equals(2)==false );

    }

}
