/*
 * Proyecto Arrays - Archivo Ejercicio2.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package Arrays;
import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Variables
        int [] numeros = new int[10];
        int total=0;
        //Creamos scanner
        Scanner in = new Scanner(System.in);
        //Bucle para solicitar los 10 nums
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Dime número: ");
            numeros[i] = in.nextInt();
            total+=numeros[i];
        }
        System.out.println(total);
        
        
        //Bucle para mostrar los 10 nums
    }
}

/*
Crea un programa que pida diez números reales por teclado, los almacene en un
array, y luego muestre la suma de todos los valores.
*/