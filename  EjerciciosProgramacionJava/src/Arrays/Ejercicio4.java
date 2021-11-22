package Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
public class Ejercicio4 {
    public static void main(String[] args) {
        //Variables
        int [] numeros=new int[3];
        int totalp=0;
        int totaln=0;
        //Creamos scanner
        Scanner in = new Scanner(System.in);
        
        //Bucle de numeros
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Dime numero: ");
            numeros [i] = in.nextInt();
            if (numeros[i]>=0) 
                totalp+=numeros[i];
            else 
            totaln+=numeros[i];
        }
        System.out.println("Total positivos: "+totalp+" total negativos: "+totaln);
    }
  
}

/*
Crea un programa que pida veinte números enteros por teclado, los almacene en un
array y luego muestre por separado la suma de todos los valores positivos y
negativos.
*/
