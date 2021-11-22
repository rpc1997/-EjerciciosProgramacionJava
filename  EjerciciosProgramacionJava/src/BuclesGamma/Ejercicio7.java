/*
 * Proyecto UD3_ejercicios_bucles - Archivo Ejercicio7.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Gamma;

/**
 *
 * @author Rubén Pérez <rpcausias@gmail.com>
 * @company DAW
 * @date 4 nov. 2021 19:08:01
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        // Para cada hora h de 0 a 23
        for (int h = 0; h <= 23; h++) {
            for (int m = 0; m <= 59; m++) 
            for (int s = 0; s <= 59; s++)  
            System.out.println(h + ":" + m + ":" + s);    
            }
    }
}



/*
Escribe un programa que muestre por pantalla todas los horas, minutos y segundos 
de un día desde 0:0:0 hasta 23:59:59
*/
