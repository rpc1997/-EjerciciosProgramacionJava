/*
 * Proyecto Arrays - Archivo Ejercicio1.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Arrays;

import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {
        //Variables
        int[] numeros = new int[10];
        //Creamos scanner
        Scanner in = new Scanner(System.in);
        //Bucle para pedir los números
        for (int i = 0; i < 10; i++) {
            System.out.println("Dime número: ");
            numeros[i] = in.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
        }

    }
}


/*
Crea un programa que pida diez números reales por teclado, los almacene en un
array, y luego muestre todos sus valores.
*/
