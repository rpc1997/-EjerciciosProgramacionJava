/*
 * Proyecto Arrays - Archivo Ejercicio12.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Arrays;

import java.util.*;

public class Ejercicio12 {

    public static void main(String[] args) {
        //Variables

        int[] numeros = new int[10];
        char caracter;
        boolean salir=false;
        
        //Scanner opción elegida
Scanner in = new Scanner(System.in);
        //Switch
        while (salir==false){   

            
            System.out.println("A) Mostrar valores.\n"
                    + "B). Introducir valor.\n"
                    + "C). Salir.");
            caracter = in.next().charAt(0);

            switch (caracter) {
                case 'A':
                    System.out.print("Vector: ");
                    for (int j = 0; j < numeros.length; j++) {
                        System.out.print(numeros[j] + " ");
                        
                              
                    }
                    System.out.println();
                    break;

                case 'B':
                    System.out.println("Dime un valor V: ");
                    int V = in.nextInt();
                    System.out.println("Dime una posicion: ");
                    int P = in.nextInt();
                    numeros[P] = V;
                    System.out.println();
                    break;
                case 'C':
                        salir=true;
            }
        }

    }

    //Bucles dentro de cada caso
}

/*
Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú
con distintas opciones:
◦a. Mostrar valores.
◦b. Introducir valor.
◦c. Salir.
La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y
una posición P, luego escribirá V en la posición P del array. El menú se repetirá
indefinidamente hasta que el usuario elija la opción ‘c’ que terminará el programa.
 */
