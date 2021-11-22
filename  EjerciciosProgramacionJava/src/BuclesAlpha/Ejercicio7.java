/*
 * Proyecto UD3_ejercicios_bucles - Archivo Ejercicio7.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3.ejercicios.bucles;

/**
 *
 * @author Rubén Pérez <rpcausias@gmail.com>
 * @company DAW
 * @date 25 oct. 2021 20:50:58
 */
import java.util.Scanner;

public class Ejercicio7 {
    
    
    public static void main(String[] args) {
        int A;
        int B;

        Scanner in = new Scanner(System.in);

        System.out.print("Dime A: ");
        A = in.nextInt();
        System.out.print("Dime B: ");
        B = in.nextInt();
        
        int total=0;

       for(int i=A;i<=B;i++){
           total = total+i;
       } 
        System.out.println("El total es: "+total);
    }
}
/*
Escribe un programa que muestre por pantalla la suma de todos los números desde A
hasta B (valores que se le piden al usuario).
*/
