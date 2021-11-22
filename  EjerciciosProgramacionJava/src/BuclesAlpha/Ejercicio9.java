/*
 * Proyecto UD3_ejercicios_bucles - Archivo Ejercicio9.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3.ejercicios.bucles;

/**
 *
 * @author Rubén Pérez <rpcausias@gmail.com>
 * @company DAW
 * @date 25 oct. 2021 20:56:11
 */
import java.util.Scanner;

public class Ejercicio9 {
    
    
    public static void main(String[] args) {
        int A;
        int B;

        Scanner in = new Scanner(System.in);

        System.out.print("Dime A: ");
        A = in.nextInt();
        System.out.print("Dime B: ");
        B = in.nextInt();
        
        int total=1;

       for(int i=A;i<=B;i++){
           total = total*i;
       } 
        System.out.println("El total es: "+total);
    }
}
/*
Escribe un programa que muestre por pantalla la multiplicación de todos los números
desde A hasta B (valores que se le piden al usuario)
*/
