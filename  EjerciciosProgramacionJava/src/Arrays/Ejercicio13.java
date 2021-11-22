/*
 * Proyecto Arrays - Archivo Ejercicio13.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Arrays;

import java.util.*;

public class Ejercicio13 {

    public static void main(String[] args) {
        //Variables
        int i;
        int v;
        int n;
        int total;
        //Scanner
        Scanner in = new Scanner(System.in);
        System.out.println("Dime V: ");
        v = in.nextInt();
        System.out.println("Dime I: ");
        i = in.nextInt();
        System.out.println("Dime N: ");
        n = in.nextInt();
        int[] numeros = new int[n];
        total=v;
        //Bucle de llenar
        for (int j = 0; j < numeros.length; j++) {
            numeros[j] = total;
            total=n+i;
        }
        //Bucle de mostrar
        for (int j = 0; j < numeros.length; j++) {
            System.out.println(numeros[j]);
        }
    }
}

/*
13.Crea un programa que permita al usuario almacenar una secuencia aritmética en un
array y luego mostrarla. Una secuencia aritmética es una serie de números que
comienza por un valor inicial V, y continúa con incrementos de I. Por ejemplo, con
V=1 e I=2, la secuencia sería 1, 3, 5, 7, 9... Con V=7 e I=10, la secuencia sería 7, 17,
27, 37... El programa solicitará al usuario V, I además de N (nº de valores a crear).
 */
