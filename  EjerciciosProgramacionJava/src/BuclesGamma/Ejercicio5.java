/*
 * Proyecto UD3_ejercicios_bucles - Archivo Ejercicio5.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package Gamma;

/**
 *
 * @author Rubén Pérez <rpcausias@gmail.com>
 * @company DAW
 * @date 4 nov. 2021 18:35:55
 */
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Dime n: ");
       int n = in.nextInt();
        int total=0;
      for(int i=1;i<=n;i++){
          for(int j=1;j<=10;j++) {
              int producto=i*j;
              System.out.print(i+"*"+j+"="+producto);
              System.out.println("");
              total+=producto;
          }  
          System.out.println("El sumatorio es: "+total);
      } 
    }
}


/*
Haz una copia del programa del ejercicio anterior y modifícalo para mostrar al final la 
suma de todas las multiplicaciones de las tablas de multiplicar. Por ejemplo, para X=1 
la suma es 55, para X=2 la suma es 165 y para X=3 la suma es 330.
*/