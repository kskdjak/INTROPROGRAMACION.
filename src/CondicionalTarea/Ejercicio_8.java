package CondicionalTarea;

import java.util.Scanner;

/**
 *  La tolerancia de componentes críticos en un sistema se determina por la aplicación de acuerdo con la siguiente tabla:
 * Usando esta información escribir un algoritmo que acepte la lectura de tolerancia de un componente y determine las
 * preferencias que deberían asignarse al componente.
 */
public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese la tolerancia");
        double tol= teclado.nextDouble();
        if (tol<0.1){
            System.out.println("Exploracion espacial");
        } else if ((tol >= 0.1)&&(tol < 1)) {
            System.out.println("Grado Militar");
        } else if ((tol >= 1) && (tol < 10)) {
            System.out.println("Grado comercial");
        } else if (tol>=10) {
            System.out.println("Grado juegete");
        }
    }
}
