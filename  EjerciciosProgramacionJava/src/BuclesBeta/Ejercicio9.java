/*
 * Proyecto UD3_ejercicios_bucles - Archivo Ejercicio8.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Beta;

/**
 *
 * @author Rubén Pérez <rpcausias@gmail.com>
 * @company DAW
 * @date 27 oct. 2021 20:46:27
 */
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        int s1 = 0, s2 = 0, s3 = 0, s4 = 0, s5 = 0, s6 = 0;
        int p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0, p6 = 0;

        for (int i = 1; i <= 100; i++) {
            int dado = (int) (Math.random() * 6 + 1);

            if (dado == 1) {
                s1++;
                p1++;
            } else if (dado == 2) {
                s2++;
                p2++;
            } else if (dado == 3) {
                s3++;
                p3++;
            } else if (dado == 4) {
                s4++;
                p4++;
            } else if (dado == 5) {
                s5++;
                p5++;
            } else {
                s6++;
                p6++;
            }
            

        }
        System.out.println("Datos 1 " + s1 + " veces" + " y porcentaje: " + p1+"%");
        System.out.println("Datos 2 " + s2 + " veces" + " y porcentaje: " + p2+"%");
        System.out.println("Datos 3 " + s3 + " veces" + " y porcentaje: " + p3+"%");
        System.out.println("Datos 4 " + s4 + " veces" + " y porcentaje: " + p4+"%");
        System.out.println("Datos 5 " + s5 + " veces" + " y porcentaje: " + p5+"%");
        System.out.println("Datos 6 " + s6 + " veces" + " y porcentaje: " + p6+"%");
    }
}
/*
Escribe un programa que tire un dado de 6 caras 100 veces (no es necesario mostrar 
los valores) y luego muestre el nº y % de veces que ha salido cada número.
 */
