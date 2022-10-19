/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosPracticosVico;

import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class FabricaDulcesNavideños {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Variables constantes
        //MantecadosLimon y Turronchocolate
        final double COSTEMANOOBRAM1, COSTEMANOOBRAT1 = 0.15;
        //Polvorones,turron clasico y mazapanes
        final double COSTEMANOOBRAM2, COSTEMANOOBRAT2, COSTEMANOOBRAP1 = 0.22;
        //Variables
        double costeMateriaPrima;//Introducir en el panel entre 0,1 y 1€
        double costeProduccion;
        //FORMULA PRECIO VENTA
        //Artículos M1, M2 y P1. 
        //Precio de venta unitario = coste de producción + 50 % del coste de producción
        //Resto de artículos(T1 y T2).
        //Precio de venta unitario = coste de producción + 65 % del coste de producción

        String menu = """
                                "La Esteponera Turronera"
                    -----------------------------------------------------------------
                    Introduce el Codigo que quieres calcular
                    -----------------------------------------------------------------
                                1.Mantecadosde limon---> M1
                                2.Turron de chocolate--> T1
                                3.Polvorones-----------> M2
                                4.Turron clasico-------> T2
                                5.Mazapanes------------> P1
                    """;

        String opcion = JOptionPane.showInputDialog(null, menu);

        switch (opcion) {

            case "1":
                //Mantecadosde limon---> M1
                //coste producción = materia prima + mano de obra
                JOptionPane.showMessageDialog(null, " "
                        + "A continuacion tienes que meter el precio entre 0.1€ "
                        + "o 1€ si no, no sera valido");
                String costeMateriaString = JOptionPane.showInputDialog(" Introduce el peso");
                //Pase

                break;

            default:

        }

    }

}
