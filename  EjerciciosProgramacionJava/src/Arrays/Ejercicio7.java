package Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

public class Ejercicio7 {

    public static void main(String[] args) {
        //VARIABLES
        int p;
        int q;
        int[] numeros;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Dime P");
        p = in.nextInt();
        System.out.println("Dime Q");
        q = in.nextInt();
        int c = q;

        for (int i = q; q <= p; q++) {
            c = c + 1;     
        }
int[] numeros = new int[c];
System.out.println(numeros[c]);
    }
}
/*
Crea un programa que pida dos valores enteros P y Q, luego cree un array que
contenga todos los valores desde P hasta Q, y lo muestre por pantalla.
 */
