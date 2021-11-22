/*
 * Proyecto UD3_ejercicios_bucles - Archivo Ejercicio7.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package Beta;

/**
 *
 * @author Rubén Pérez <rpcausias@gmail.com>
 * @company DAW
 * @date 27 oct. 2021 17:25:24
 */
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        int n;
        int fact=1;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Dime n: ");
        n = in.nextInt();
        
        for (int i = n; i > 0; i--) {
            fact=fact*i;
        }
        
        System.out.println("El resultado es: "+fact);
    }
}

/*
Escribe un programa que lea un número positivo N y calcule y visualice su factorial N!
Siendo el factorial: 0! = 1, 1! = 1, 2! = 2 * 1, 3! = 3 * 2* 1, N! = N * (N-1) * (N-2) * ... * 1
*/

/*
int m = lector.nextInt(); //factorial de m
int fact = 1;
for (n = m; n > 0; n--)
fact*= n;
*/