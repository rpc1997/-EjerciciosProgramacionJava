/*
 * Proyecto UD3_ejercicios_bucles - Archivo Ejercicio11.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3.ejercicios.bucles;

/**
 *
 * @author Rubén Pérez <rpcausias@gmail.com>
 * @company DAW
 * @date 25 oct. 2021 21:31:01
 */
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        double precio;
        double total = 0;

        Scanner in = new Scanner(System.in);

        for (int i = 0; i <= 0; i++) {

            System.out.print("Dime precio: ");
            precio = in.nextInt();
            total += precio;
        }
        System.out.println("El precio es: " + total);
    }

}

/*
Escribe   un   programa   que   pida   precios   al   usuario   hasta   que   introduza   un   número
negativo, y muestre la suma total.
*/
