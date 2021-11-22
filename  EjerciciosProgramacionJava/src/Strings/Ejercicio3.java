/*
 * Proyecto UD4_Estructuras_de_Datos - Archivo Ejercicio3.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package Strings;

/**
 *
 * @author Rubén Pérez <rpcausias@gmail.com>
 * @company DAW
 * @date 4 nov. 2021 20:52:38
 */
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el texto: ");
        String f1=in.nextLine();
        System.out.println("Introduce el texto: ");
        String f2=in.nextLine();
        System.out.println(f1.compareToIgnoreCase(f2));  
    }
}

/*
Crea un programa que pida dos cadenas de texto y luego las muestre en orden
alfabético (sin diferenciar entre mayúsculas y minúsculas).
*/