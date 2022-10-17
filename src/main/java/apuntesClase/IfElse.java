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
public class IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println(" Cual es tu Nombre");
        
        String nombre = teclado.nextLine();
        
        System.out.println(" Introduce la letra que quieres buscar");
        
        String letraBuscar= teclado.nextLine();
        
        
        // Si la letra esta contenida en el nombre
        //monstrar el numero de caracteres que tiene el nombre y la
        // posicion donde esta la letra 
        //En otro caso mostrar el numero de letras del nombre y decir si es par 
        // o impar
        
        //boolean letraContenida = nombre.contains(letraBuscar);
        // en vez de guardarlo en una variable (==true) con ponerlo en el if ya se queda
        //if (letraContenida){
            //Pare del true
        //}
        
        
        //Esto equivale igual a lo de arriba
        //if (nombre.contains(letraBuscar)== true){
            //System.out.println("hola");
        //}
            
       /* if (nombre.contains(letraBuscar)){
            //tamaño de la cadena de texto
            System.out.println("El numero de caracteres es de "+nombre.length());
            //posicion donde esta la letra
            int posicion = nombre.indexOf(letraBuscar);
            //Empiezan con el 0 1 2 3 4 .
            //                P e p e
            // Las variables que se crean en el if, son locales, dentro del if no globales
            System.out.println(" La posicion es "+posicion);
        } else{
            
            if (nombre.length()%2 ==0){// Si el string es par
                System.out.println(" El numero de caracteres es par");
                
                
                
            }else{                  //Si el numero es impar
                System.out.println(" El numero de caracteres es impar");
            }
        }
            
           System.out.println("Adiós" );
            
           
            
        
    }
    
    */
       //V2 on else if
    
    
   /* if (nombre.contains(letraBuscar)){
            //tamaño de la cadena de texto
            System.out.println("El numero de caracteres es de "+nombre.length());
            //posicion donde esta la letra
            int posicion = nombre.indexOf(letraBuscar);
            //Empiezan con el 0 1 2 3 4 .
            //                P e p e
            // Las variables que se crean en el if, son locales, dentro del if no globales
            System.out.println(" La posicion es "+posicion);
        } else if
             (nombre.length()%2 ==0){// Si el string es par
              System.out.println(" El numero de caracteres es par");
                
                
                
            }else{                  //Si el numero es impar
                System.out.println(" El numero de caracteres es impar");
            }
                System.out.println("Adiós");
        }
            
         */ 
            
   if (nombre.contains(letraBuscar)){
            //tamaño de la cadena de texto
            System.out.println("El numero de caracteres es de "+nombre.length());
            //posicion donde esta la letra
            int posicion = nombre.indexOf(letraBuscar);
            //Empiezan con el 0 1 2 3 4 .
            //                P e p e
            // Las variables que se crean en el if, son locales, dentro del if no globales
            System.out.println(" La posicion es "+posicion);
        } else if
             (nombre.length()%2 ==0){// Si el string es par
              System.out.println(" El numero de caracteres es par");
                
                
                
            }else{                  //string
                String textoResultado = (nombre.length()%2 ==0)?
                                       "El caracter es par":
                                       "El caracter es impar";
                System.out.println(textoResultado);
                                       
                System.out.println(" El numero de caracteres es impar");
            }
               
        }
           
            
        
    
    
}
