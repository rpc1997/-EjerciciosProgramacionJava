/*
 * Proyecto UD3_ejercicios_bucles - Archivo Ejercicio6.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package Gamma;

/**
 *
 * @author Rubén Pérez <rpcausias@gmail.com>
 * @company DAW
 * @date 4 nov. 2021 18:46:36
 */
public class Ejercicio6 {
     public static void main(String[] args) {

        // Para cada hora h de 0 a 23
        for (int h = 0; h <= 23; h++) {

            // Para cada minuto m de 0 a 59
            for (int m = 0; m <= 59; m++) {
                
                // Mostramos h:m
                System.out.println(h + ":" + m);
            }
        }
    }
}



/*
Escribe un programa que muestre por pantalla todas las horas y minutos de un día 
desde 0:0 hasta 23:59. Es decir: 0:0, 0:1, 0:2... 0:58, 0:59, 1:0, 1:1, 1:2... hasta 23:59.
*/
