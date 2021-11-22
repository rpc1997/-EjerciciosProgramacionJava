/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.*;
public class Ejercicio5 {
    public static void main(String[] args) {
        //VARIABLES
        double []numeros=new double [3];
        double media=0;
        //Creamos scanner
       Scanner in = new Scanner(System.in);
       //Bucle de numeros
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Dime numero: ");
            numeros[i]=in.nextDouble();
            
    }
        for (int i = 0; i < numeros.length; i++) {
                media=media+numeros[i];
        }
        media=media/3;
        System.out.println("La media es: "+media);
    }  
}

/*
Crea un programa que pida veinte números reales por teclado, los almacene en un
array y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de
valores. 
*/