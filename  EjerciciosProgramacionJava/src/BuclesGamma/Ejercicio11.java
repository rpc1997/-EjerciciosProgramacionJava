/*
 * Proyecto UD3_ejercicios_bucles - Archivo Ejercicio11.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package Gamma;

/**
 *
 * @author Rubén Pérez <rpcausias@gmail.com>
 * @company DAW
 * @date 4 nov. 2021 19:55:50
 */
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        // variables
        int x;
        
        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos x
        System.out.print("Dime x: ");
        x = in.nextInt();
        
        // Cuadrado de tamaño == 1
        if (x == 1) {
            System.out.println("*");
        }
        // Cuadrados de tamaño > 1
        else {
            
            // Creamos el string de la Primera y Última fila (ambas son iguales)
            String filaPrimUlt = "";
            for (int i = 1; i <= x; i++)
                filaPrimUlt += "* ";
            
            // Creamos el String de las filas Intermedias (son todas iguales)
            String filaInt = "* ";
            for (int i = 2; i < x; i++) {
                filaInt += "  ";
            }
            filaInt += "* ";
            
            // Mostramos la fila 1
            System.out.println(filaPrimUlt);
            
            // Mostramos las filas intermedias
            for (int i = 2; i < x; i++) {
                System.out.println(filaInt);
            }
            
            // Mostramos la fila x
            System.out.println(filaPrimUlt);
            
        }
        
        
    }
}