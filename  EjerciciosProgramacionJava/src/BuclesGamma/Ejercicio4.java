/*
 * Proyecto UD3_ejercicios_bucles - Archivo Ejercicio4.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package Gamma;

/**
 *
 * @author Rubén Pérez <rpcausias@gmail.com>
 * @company DAW
 * @date 3 nov. 2021 21:44:52
 */
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Dime n: ");
       int n = in.nextInt();
        
      for(int i=1;i<=n;i++){
          for(int j=1;j<=10;j++) {
              int producto=i*j;
              System.out.print(i+"*"+j+"="+producto);
              System.out.println("");
          }      
          
      } 
    }
}
