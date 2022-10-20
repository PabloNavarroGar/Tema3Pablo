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
        //Control+R para cmabiar el nombre de una variable y se cambiene en todas
        final double COSTEMANOOBRAM1T1 = 0.15;

        //Polvorones,turron clasico y mazapanes
        final double COSTEMANOOBRAM2T2P1 = 0.22;

        //Variables
        double costeMateriaPrima;//Introducir en el panel entre 0,1 y 1€
        double costeProduccionUnidad;
        double precioVenta;
        double beneficio;
        double objetivo;

        //FORMULA PRECIO VENTA
        //Artículos M1, M2 y P1. 
        //Precio de venta unitario = coste de producción +50 % del coste de producción
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
                //Panel Introduccion de datos
                String costeString = JOptionPane.showInputDialog("Introduce el "
                        + "coste de la materia prima(entre 0.1€ y 1€)");
                //Parse del string a double
                costeMateriaPrima = Double.parseDouble(costeString);
                //Salida de datos
                JOptionPane.showMessageDialog(null, "El coste de la"
                        + " materia es de " + costeMateriaPrima);
                //Comienzo del if con la condicion 
                if (costeMateriaPrima >= 0.1 && costeMateriaPrima <= 1) {

                    //Calculo coste unidad
                    costeProduccionUnidad = COSTEMANOOBRAM1T1 + costeMateriaPrima;

                    //Calculo del precio de venta
                    precioVenta = costeProduccionUnidad + (costeProduccionUnidad * 0.5);

                    //Calculo beneficio
                    beneficio = precioVenta - costeProduccionUnidad;
                    //salida de datos
                    String resultado = """
                                        Un Mantecado de Limon (M1) nos cuesta : %.2f Centimos
                                        El precio de venta es de: %.2f Centimos
                                        El beneficio es de: %.2f Centimos
                                     """.formatted(costeProduccionUnidad, precioVenta, beneficio);
                    JOptionPane.showMessageDialog(null, resultado);
                    //Calculo del objetivo de 2500 euros
                    JOptionPane.showMessageDialog(null, "Se va a calcular "
                            + "cuantos unidades a producir para que haya un "
                            + "beneficio de al menos 2500€");
                    objetivo = 2500 * 1 / beneficio;
                    //(int para declarar el double en int y el ceil para redondear hacia arriba)
                    JOptionPane.showMessageDialog(null, " Necesitamos "
                            + "fabricar " + (int) Math.ceil(objetivo) + " Mantecados ");
                    //Fin
                } else {
                    JOptionPane.showMessageDialog(null, " Error, "
                            + "precio no permitido");

                }

                break;

            case "2":

                //Turron Chococate---> T1
                //coste producción = materia prima + mano de obra
                //Introduccion de datos
                String coste2String = JOptionPane.showInputDialog("Introduce "
                        + "el coste de la materia prima(entre 0.1€ y 1€)");
                //Parse string a double
                costeMateriaPrima = Double.parseDouble(coste2String);
                //Salida de datos
                JOptionPane.showMessageDialog(null, "El coste de la"
                        + " materia es de " + costeMateriaPrima);
                //Comienzo if con la condicion
                if (costeMateriaPrima >= 0.1 && costeMateriaPrima <= 1) {

                    //Calculo coste unidad
                    costeProduccionUnidad = COSTEMANOOBRAM1T1 + costeMateriaPrima;

                    //Calculo del precio de venta
                    precioVenta = costeProduccionUnidad + (costeProduccionUnidad * 0.65);

                    //Calculo beneficio
                    beneficio = precioVenta - costeProduccionUnidad;

                    String resultado = """
                                        Un Turron de chocolate (T1) nos cuesta : %.2f Centimos
                                        El precio de venta es de: %.2f Centimos
                                        El beneficio es de: %.2f Centimos
                                     """.formatted(costeProduccionUnidad,
                                             precioVenta, beneficio);
                    
                    JOptionPane.showMessageDialog(null, resultado);

                    JOptionPane.showMessageDialog(null, "Se va a"
                            + " calcular cuantos "
                            + "unidades a producir para que haya un"
                            + " beneficio de al menos 2500€");
                    objetivo = 2500 * 1 / beneficio;
                    //(int para declarar el double en int y el ceil para redondear hacia arriba)
                    JOptionPane.showMessageDialog(null, " Necesitamos"
                            + " fabricar " + 
                            (int) Math.ceil(objetivo) + " Turrones ");
                    //Pase
                } else {
                    JOptionPane.showMessageDialog(null, " Error,"
                            + " precio no permitido");

                }

                break;

            case "3":

                //Polvorones--->M2
                //coste producción = materia prima + mano de obra
                //Introduccion de datos
                String coste3String = JOptionPane.showInputDialog("Introduce"
                        + " el coste de la materia prima(entre 0.1€ y 1€)");
                //Parse de double string
                costeMateriaPrima = Double.parseDouble(coste3String);

                JOptionPane.showMessageDialog(null, "El coste de la"
                        + " materia es de " + costeMateriaPrima);

                if (costeMateriaPrima >= 0.1 && costeMateriaPrima <= 1) {

                    //Calculo coste unidad
                    costeProduccionUnidad = COSTEMANOOBRAM2T2P1 + costeMateriaPrima;

                    //Calculo del precio de venta
                    precioVenta = costeProduccionUnidad + 
                            (costeProduccionUnidad * 0.5);

                    //Calculo beneficio
                    beneficio = precioVenta - costeProduccionUnidad;

                    String resultado = """
                                        Un Polvoron (M2) nos cuesta : %.2f Centimos
                                        El precio de venta es de: %.2f Centimos
                                        El beneficio es de: %.2f Centimos
                                     """.formatted(costeProduccionUnidad, 
                                             precioVenta, beneficio);
                    
                    JOptionPane.showMessageDialog(null, resultado);

                    JOptionPane.showMessageDialog(null, "Se va a "
                            + "calcular cuantos unidades a producir para que haya un "
                            + "beneficio de al menos 2500€ ");
                    objetivo = 2500 * 1 / beneficio;
                    JOptionPane.showMessageDialog(null, " Necesitamos"
                            + " fabricar " + (int) Math.ceil(objetivo) + " Polvorones");
                    //Pase
                } else {
                    JOptionPane.showMessageDialog(null, " Error,"
                            + " precio no permitido");

                }

                break;

            case "4":

                //Turron clasico---> T2
                //coste producción = materia prima + mano de obra
                String coste4String = JOptionPane.showInputDialog("Introduce"
                        + " el coste de la materia prima(entre 0.1€ y 1€)");

                costeMateriaPrima = Double.parseDouble(coste4String);

                JOptionPane.showMessageDialog(null, "El coste de la"
                        + " materia es de " + costeMateriaPrima);

                if (costeMateriaPrima >= 0.1 && costeMateriaPrima <= 1) {

                    //Calculo coste unidad
                    costeProduccionUnidad = COSTEMANOOBRAM2T2P1 + costeMateriaPrima;

                    //Calculo del precio de venta
                    precioVenta = costeProduccionUnidad + 
                            (costeProduccionUnidad * 0.65);

                    //Calculo beneficio
                    beneficio = precioVenta - costeProduccionUnidad;
                    //salida de datos
                    String resultado = """
                                        Un Turron clasico (T2) nos cuesta : %.2f Centimos
                                        El precio de venta es de: %.2f Centimos
                                        El beneficio es de: %.2f Centimos
                                     """.formatted(costeProduccionUnidad, precioVenta, beneficio);
                    JOptionPane.showMessageDialog(null, resultado);
                    
                    JOptionPane.showMessageDialog(null, "Se va"
                            + " a calcular cuantos unidades a producir para que"
                            + " haya un beneficio de al menos 2500€");
                    objetivo = 2500 * 1 / beneficio;
                    
                    //(int para declarar el double en int y el ceil
                    //para redondear hacia arriba)
                    JOptionPane.showMessageDialog(null, " Necesitamos"
                            + "fabricar " + (int) Math.ceil(objetivo) + " Turrones clasicos ");
                    //Pase
                    
                } else {
                    JOptionPane.showMessageDialog(null, " Error,"
                            + " precio no permitido");

                }

                break;

            case "5":
                //Mazapanes---> P1
                //coste producción = materia prima + mano de obra
                
                String coste5String = JOptionPane.showInputDialog("Introduce"
                        + " el coste de la materia prima(entre 0.1 y 1)");

                costeMateriaPrima = Double.parseDouble(coste5String);

                JOptionPane.showMessageDialog(null, "El coste de la"
                        + " materia es de " + costeMateriaPrima);

                if (costeMateriaPrima >= 0.1 && costeMateriaPrima <= 1) {

                    //Calculo coste unidad
                    costeProduccionUnidad = COSTEMANOOBRAM2T2P1 
                            + costeMateriaPrima;

                    //Calculo del precio de venta
                    precioVenta = costeProduccionUnidad + (costeProduccionUnidad * 0.5);

                    //Calculo beneficio
                    beneficio = precioVenta - costeProduccionUnidad;

                    String resultado = """
                                        Un Polvoron (M2) nos cuesta : %.2f Centimos
                                        El precio de venta es de: %.2f Centimos
                                        El beneficio es de: %.2f Centimos
                                     """.formatted(costeProduccionUnidad, 
                                             precioVenta, beneficio);
                    JOptionPane.showMessageDialog(null, resultado);

                    JOptionPane.showMessageDialog(null, "Se va"
                            + " a calcular cuantos unidades a producir para que"
                            + " haya un beneficio de al menos 2500€");
                    objetivo = 2500 * 1 / beneficio;
                    //Int para declarar la variable se muestre en int y ceil para redondear hacia arriba
                    JOptionPane.showMessageDialog(null, " Necesitamos"
                            + " fabricar " + (int) Math.ceil(objetivo) + " Mazapanes");
                    //Pase
                } else {
                    JOptionPane.showMessageDialog(null, " Error"
                            + ", precio no permitido");

                }

                break;

            default:
                JOptionPane.showMessageDialog(null, " No "
                        + "existe esteco codigo de producto producto");
        }

    }

}
