/*
 * Proyecto UD4_Estructuras_de_Datos - Archivo UD4EstructurasDeDatos.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Strings;

/**
 *
 * @author Rubén Pérez <rpcausias@gmail.com>
 */
import java.util.Scanner;
public class Ejercicio1 {
  
    public static void main(String[] args) {
        
        Scanner pepe = new Scanner(System.in);
        System.out.println("Introduce el texto: ");
        String lectura=pepe.nextLine();
        System.out.println(lectura.toUpperCase());
        System.out.println(lectura.toLowerCase());
    }  
}

/*
Crea un programa que pida una cadena de texto y luego la muestre tanto en
mayúsculas como en minúsculas.
*/