package CondicionalTarea; /**
 * Haga un algoritmo que dado una fecha entre 01/01/1990 al 31/12/2010
 * determine si es correcto o incorrecto. Tenga en cuenta los años bisiestos.
 */

import java.util.Scanner;

public class Condicional_tarea {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el dia");
        int dia= teclado.nextInt();
        System.out.println("Ingrese el mes");
        int mes= teclado.nextInt();
        System.out.println("ingrese el año");
        int año= teclado.nextInt();
        if (año>1990 && año<2010 && dia<=31 && mes <=12){
            System.out.println("si es correcto");
        } else if (año<1990 && año>2010 || dia<=31 || mes <=12) {
            System.out.println("No es correcto");
        }

    }

}
