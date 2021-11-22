/*
 * Proyecto UD3_ejercicios_bucles - Archivo Ejercicio9.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package Gamma;

/**
 *
 * @author Rubén Pérez <rpcausias@gmail.com>
 * @company DAW
 * @date 4 nov. 2021 19:31:20
 */
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        // variables
        int x;
        
        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos x
        System.out.print("Dime x: ");
        x = in.nextInt();
        
        // Para cada fila f de 1 a x
        for (int f = 1; f <= x; f++) {
            
            // Calculamos cuantos espacios y asteriscos tendrá la fila
            int espacios = x - f;
            int asteriscos = f;
            
            // Imprimimos los espacios
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }
            
            // Imprimimos los asteriscos
            for (int i = 1; i <= asteriscos; i++) {
                System.out.print("*");
            }
            
            // Nueva línea
            System.out.println("");
            
        }
        
    }
}

/*
Escribe un programa que pida al usuario un número entero X y luego muestre por 
pantalla un triángulo de asteriscos como en el ejemplo de abajo. Para X = 5:
*/