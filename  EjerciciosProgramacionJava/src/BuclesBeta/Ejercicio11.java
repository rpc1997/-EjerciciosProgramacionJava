/*
 * Proyecto UD3_ejercicios_bucles - Archivo Ejercicio11.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Beta;

/**
 *
 * @author Rubén Pérez <rpcausias@gmail.com>
 * @company DAW
 * @date 28 oct. 2021 19:53:18
 */
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        int n;
        int b500 = 0;
        int b200 = 0;
        int b100 = 0;
        int b50 = 0;
        int b20 = 0;
        int b10 = 0;
        int b5 = 0;
        int total =0;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Dime n: ");
        n = in.nextInt();
        
        for (int i = n; i >= 0; i = i - total) {
            if (i >= 500) {
                b500++;
                total = 0 + 500;
            } else if (i >= 200) {
                b200++;
                total = 0 + 200;
            } else if (i >= 100) {
                b100++;
                total = 0 + 100;
            } else if (i >= 50) {
                b50++;
                total = 0 + 50;
            } else if (i >= 20) {
                b20++;
                total = 0 + 20;
            } else if (i >= 10) {
                b10++;
                total = 0 + 10;
            } else if (i >= 5) {
                b5++;
                total = 0 + 5;
            }
        }

        System.out.println(
                "B500: " + b500 + " B200: " + b200 + " B100: " + b100 + " B50: " + b50 + " B20: " + b20 + " B10: " + b10 + " B5: " + b5);

    }
}


/*
Escribe un programa que dada una cantidad de euros que el usuario introduce por 
teclado (múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para 
alcanzar dicha cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que 
indicar el mínimo de billetes posible. Por ejemplo, si el usuario introduce 145 el 
programa indicará que será necesario 1 billete de 100 €, 2 billetes de 20 € y 1 billete 
de 5 € (no será válido por ejemplo 29 billetes de 5, que aunque sume 145 € no es el 
mínimo número de billetes posible).
 */
