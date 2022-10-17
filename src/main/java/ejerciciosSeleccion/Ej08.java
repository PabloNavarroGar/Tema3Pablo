/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosSeleccion;

/**
 *
 * @author samue
 */
public class Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        char departamento = 'B';

        switch (departamento) {
            case 'A':
                System.out.println("Desarrollo");
                break;
            case 'B':
                System.out.println("Recursos Humanos");
             
            break;
            case 'C':
                System.out.println("Finanzas");
                break;
            case 'D':
                System.out.println("Mercado");
            default:
                System.out.println("Departamento no válido");
        
      }
      System.out.println(
        "Código para el departamento es " + departamento);
      //Es un Switch que dada el char segun la letra que le pondremos, nos monstrara 
      //el resultado del nombre de ese departamiento
      // siempre para en el break
      // A=Desarrollo, B=Recursos Humanos, C=Finanzas, D=Mercado 
      //y no no podemos nada pues sale no valido
   }

    }
