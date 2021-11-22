/*
 * Proyecto UD3_ejercicios_bucles - Archivo Ejercicio2.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package Gamma;

/**
 *
 * @author Rubén Pérez <rpcausias@gmail.com>
 * @company DAW
 * @date 3 nov. 2021 21:38:19
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        
      for(int i=0;i<=9;i++){
          for(int j=1;j<=i;j++) {
              System.out.print(j);
          }
          System.out.println("");
              
      } 
    }
}


/*
scribe un programa que muestre por pantalla 9 líneas de texto con 10 números cada
una. La primera línea tendrá el 1 diez veces, la siguiente el 2 diez veces, la siguiente 
el 3 diez veces... hasta la última línea que tendrá el 9 diez veces.
111111111122222222223333333333444444444455555555556666666666777777777788888888889999999999
*/