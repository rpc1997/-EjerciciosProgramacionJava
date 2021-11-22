/*
 * Proyecto UD3_ejercicios_bucles - Archivo Ejercicio5.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package Beta;

/**
 *
 * @author Rubén Pérez <rpcausias@gmail.com>
 * @company DAW
 * @date 27 oct. 2021 16:46:03
 */
 
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        int a,b;
        int sp=0,si=0;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Dime a: ");
            a = in.nextInt();
            System.out.print("Dime b: ");
            b = in.nextInt();
            
        for (int i = a; i <= b; i++) {
            
        if(i%2==0)
            sp=sp+i;
            else
            si=si+i;
        }
        System.out.println("La suma de impares es: " + si+" La suma de pares es: "+sp);
    }
}

/*
Escribe un programa que sume independientemente los pares y los impares de los 
números comprendidos entre A y B (valores que introduce el usuario), y luego 
muestre por pantalla ambas sumas.
*/