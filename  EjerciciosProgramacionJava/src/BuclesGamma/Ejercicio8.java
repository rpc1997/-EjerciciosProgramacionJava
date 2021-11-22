/*
 * Proyecto UD3_ejercicios_bucles - Archivo Ejercicio8.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Gamma;

/**
 *
 * @author Rubén Pérez <rpcausias@gmail.com>
 * @company DAW
 * @date 4 nov. 2021 19:13:14
 */
public class Ejercicio8 {

    public static void main(String[] args) {

        // variables
        int diasDelMes;
        
        // Para cada mes m de 1 a 12
        for (int mes = 1; mes <= 12; mes++) {

            // Días a mostrar según el mes
            switch (mes) {
                
                // Meses de 28 días
                case 2:
                    diasDelMes = 28;
                    break;
                
                // Meses de 30 días
                case 4: case 6: case 9: case 11:
                    diasDelMes = 30;
                    break;
                    
                // Meses de 31 días
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    diasDelMes = 31;
                    break;
                
                // Error (no debería ejecutarse nunca)
                default:
                    System.out.println("ERROR: mes " + mes);
                    diasDelMes = 0;
            }
            
            // Mostramos las fechas del mes
            for (int dia = 1; dia <= diasDelMes; dia++) {
                System.out.println(dia + "/" + mes);
            }
            
        }
    }
}


/*
Escribe un programa que muestre todas las fechas de un año en formato numérico. 
Es decir, empezará en 1/1 y acabará en 31/12. Recuerda que hay meses de 30 días, 
meses de 31 días y febrero tiene 28 días (supondremos que no hay años bisiestos).
 */
