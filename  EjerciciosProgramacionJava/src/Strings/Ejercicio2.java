/*
 * Proyecto UD4_Estructuras_de_Datos - Archivo Ejercicio2.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Strings;

/**
 *
 * @author Rubén Pérez <rpcausias@gmail.com>
 * @company DAW
 * @date 4 nov. 2021 20:41:55
 */
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el texto: ");
        String f1=in.nextLine();
        System.out.println("Introduce el texto: ");
        String f2=in.nextLine();
        System.out.println(f1.equals(f2));
        System.out.println(f1.equalsIgnoreCase(f2));
    }
}

/*
Crea un programa que pida dos cadenas de texto por teclado y luego indique si son
iguales o no, además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
*/
