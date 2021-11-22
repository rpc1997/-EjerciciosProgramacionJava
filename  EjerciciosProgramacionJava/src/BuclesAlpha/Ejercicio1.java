/*
 * Proyecto UD3_ejercicios_bucles - Archivo Ejercicio1.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3.ejercicios.bucles;

/**
 *
 * @author Rubén Pérez <rpcausias@gmail.com>
 * @company DAW
 * @date 25 oct. 2021 19:26:24
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
      /*1-10
       for(int i=1;i<=10;i++){
           System.out.println(i);
       } 
       */
      /* 10-1
       for(int i=10;i>=1;i--){
           System.out.println(i);
          */
     
      for(double i=-999.999;i<=999.999;i+=0.001){
           System.out.println(i);
       } 
    }

}

/*
Escribe un programa que muestre los números enteros del 1 al 10. Luego modifícalo
para que muestre los números del 10 al 1. Por último, modifícalo para que muestre los
número del -999.999 al 999.999.
*/