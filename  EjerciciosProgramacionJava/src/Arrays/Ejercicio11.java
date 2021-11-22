/*
 * Proyecto Arrays - Archivo Ejercicio11.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Arrays;

public class Ejercicio11 {

    public static void main(String[] args) {
        //VARIABLES
        int[] numero1 = new int[10];
        int[] numero2 = new int[10];

        //BUCLE NÚMEROS
        for (int i = 0; i < 10; i++) {
            numero1[i] = i + 1;
            System.out.println(numero1[i]);
        }
        //BUCLE INVERSO
        for (int i = 0; i < 10; i++) {
            numero2[i] = 10 - i;
            System.out.println(numero2[i]);
        }
    }

}
/*
Crea un programa que cree dos arrays de enteros de tamaño 10. Luego introducirá en
el primer array todos los valores del 1 al 10. Por último, deberá copiar todos los
valores del primer array al segundo array en orden inverso, y mostrar ambos por
pantalla.
 */
