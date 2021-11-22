/*
 * Proyecto UD3_ejercicios_bucles - Archivo Ejercicio3.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package ud3.ejercicios.bucles;

/**
 *
 * @author Rubén Pérez <rpcausias@gmail.com>
 * @company DAW
 * @date 25 oct. 2021 20:22:19
 */
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        int A;
        int B;
        Scanner in = new Scanner(System.in);

        System.out.print("Dime A: ");
        A = in.nextInt();
        System.out.print("Dime B: ");
        B = in.nextInt();

        for (int i = A; i <= B; i += 2) {
            System.out.println(i);
        }

    }
}



/*
Escribe un programa que muestre los números enteros de A a B (valores que se le
piden al usuario) en pasos de dos. Por ejemplo, si A=5 y B=21, entonces mostraría 5,
7, 9, 11... hasta 21.
*/
