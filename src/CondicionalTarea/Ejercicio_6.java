package CondicionalTarea;

import java.util.Scanner;

/**
 * Crear un algortimo en el que dado un tiempo en minutos calcule los dias, horas que le corresponden
 */
public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("ingrese el tiempo en minutos");
        int tiempo= teclado.nextInt();
        int dias=0;
        int horas=0;
        int minutos=0;
        while (tiempo>0){
            if (tiempo>=1140){
                dias=dias+1;
                tiempo=tiempo-1140;
            } else if (tiempo>=60) {
                horas=horas+1;
                tiempo=tiempo-60;
            } else {
                minutos=minutos+1;
                tiempo=tiempo-1;
                
            }
        }
        System.out.println("Dias: " +dias);
        System.out.println("Horas: " +horas);
        System.out.println("Minutos: " +minutos);
    }
}
