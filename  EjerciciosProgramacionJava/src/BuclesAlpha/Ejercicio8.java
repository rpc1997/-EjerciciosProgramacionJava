/*
 * Proyecto UD3_ejercicios_bucles - Archivo Ejercicio8.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3.ejercicios.bucles;

/**
 *
 * @author Rubén Pérez <rpcausias@gmail.com>
 * @company DAW
 * @date 25 oct. 2021 20:54:18
 */
public class Ejercicio8 {
    
    
    public static void main(String[] args) {
        int total=1;

       for(int i=1;i<=10;i++){
           total = total*i;
       } 
        System.out.println("El total es: "+total);
    }
}

/*
Escribe un programa que muestre por pantalla la multiplicación de todos los números
desde 1 hasta 10.
*/