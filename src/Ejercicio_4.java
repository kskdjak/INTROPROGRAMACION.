import java.util.Scanner;

/**
 * Escriba un algoritmo para calcular el valor de la presión en libras por pulgada
 * cuadrada (psi) de una onda descrita como sigue:
 *  Para tiempo, t, igual a o menor que 35 segundos, la presión es 0.46t psi, y para tiempo mayor que 35 segundos
 *  la presión es 0.19t + 9.45 psi.
 * El programa deberá pedir el tiempo como entrada y deberá desplegar la presión como salida
 */
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el tiempo");
        int tiempo= teclado.nextInt();
        if (tiempo<=35){
            double presion=0.46*tiempo;
            System.out.println("La presion es: "+ presion);
        } else if (tiempo>35) {
            double presion=0.19*tiempo+9.45;
            System.out.println("La presion es: "+ presion);
        }
    }
}
