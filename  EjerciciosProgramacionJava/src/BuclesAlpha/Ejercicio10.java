/*
 * Proyecto UD3_ejercicios_bucles - Archivo Ejercicio10.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package ud3.ejercicios.bucles;

/**
 *
 * @author Rubén Pérez <rpcausias@gmail.com>
 * @company DAW
 * @date 25 oct. 2021 20:59:40
 */
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        double precio;
        double total = 0;

        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.print("Dime precio: ");
            precio = in.nextInt();
            total += precio;
        }
        System.out.println("El precio es: " + total);
    }

}
