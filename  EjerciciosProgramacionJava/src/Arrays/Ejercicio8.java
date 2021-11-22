/*
 * Proyecto Arrays - Archivo Ejercicio8.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Arrays;

import java.util.*;

public class Ejercicio8 {

    public static void main(String[] args) {
        //Declaramos variables
        double r;
        double[] numeros = new double[100];
        int total = 0;
        //Creamos scanner
        Scanner in = new Scanner(System.in);
        System.out.println("Dime R: ");
        r = in.nextDouble();
        //Generar los 100 aleatorios
        for (int i = 0; i < 100; i++) {
            numeros[i] = Math.random();
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= r) {
                total++;
            }
            
        }
        System.out.println(total);
    }
}

/*
Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y
1.0, utilizando Math.random(), y luego le pida al usuario un valor real R. Por último,
mostrará cuántos valores del array son igual o superiores a R.
*/
