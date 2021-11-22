/*
 * Proyecto UD3_ejercicios_bucles - Archivo Ejercicio4.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3.ejercicios.bucles;

/**
 *
 * @author Rubén Pérez <rpcausias@gmail.com>
 * @company DAW
 * @date 25 oct. 2021 20:28:17
 */
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        

        int A;
        int B;
        
        Scanner in = new Scanner(System.in);

        System.out.print("Dime A: ");
        A = in.nextInt();
        System.out.print("Dime B: ");
        B = in.nextInt();

        for (int i = B; i >=A; i--) {
            System.out.println(i);
        }
    }
}
/*Escribe un programa que muestre los números enteros de A a B (valores que se le
piden   al   usuario)   en   orden   inverso.   Es   decir,   debe   empezar   por   B   (el   mayor)   y
terminar por A (el menor).
*/