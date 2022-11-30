package EjerciciosFinales;

import java.util.Scanner;

/**
 * Realizar un programa que genere y grafique
 * con  asteriscos  la  serie  fibonacci.    Se  debe
 * recibir un número por teclado que indicará
 * el total de números generados para la serie
 */
public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el limite de la serie");
        int limite= teclado.nextInt();
        int contador=1;
        String nu1="*";
        String nu2="*";
        while (contador<=limite){
            System.out.println(nu1);
            String fibo=nu2+nu1;
            nu1=nu2;
            nu2=fibo;
            contador=contador+1;
            System.out.println();
        }
    }
}
