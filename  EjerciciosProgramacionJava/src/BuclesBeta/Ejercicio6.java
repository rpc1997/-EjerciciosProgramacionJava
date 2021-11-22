/*
 * Proyecto UD3_ejercicios_bucles - Archivo Ejercicio6.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package Beta;

/**
 *
 * @author Rubén Pérez <rpcausias@gmail.com>
 * @company DAW
 * @date 27 oct. 2021 16:55:26
 */
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        int a,b;
        int total=1;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Dime a: ");
        a = in.nextInt();
        System.out.print("Dime b: ");
        b = in.nextInt();
        
        for (int i = b; i >= 1; i--) {
            total *= a;
        }
        
        System.out.println("El resultado es: "+total);
    }
}

/*
Escribe un programa que calcule y muestre el valor de A elevado a B (valores que 
introduce el usuario) sin hacer uso de la clase Math. Es decir, mediante un bucle que 
paso a paso multiplica A tantas veces como B.
*/