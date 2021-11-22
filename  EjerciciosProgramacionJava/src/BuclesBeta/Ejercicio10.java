/*
 * Proyecto UD3_ejercicios_bucles - Archivo Ejercicio10.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package Beta;

/**
 *
 * @author Rubén Pérez <rpcausias@gmail.com>
 * @company DAW
 * @date 27 oct. 2021 21:22:28
 */
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        int x;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Dime x: ");
        x = in.nextInt();
        
        if(x%x==0 || x%1==0)
            System.out.println("Es primo");
        else
            System.out.println("No es primo");
    }
}

/*
Escribe un programa que pregunte un número X al usuario y diga si es primo o no. 
Más información: https://
*/