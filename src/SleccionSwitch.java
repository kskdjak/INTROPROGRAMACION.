import java.util.Scanner;

/**
 * Programa para devolver el dia de la semana en letras dado un numero del 1 al 7
 * Programa creado por Lenin Cuenca
 */
public class SleccionSwitch {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("ingrese un numero del 1 al 7");
        int opcion= teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Lunes");
                break;//SALTA AL FINAL DE LA ESTRUCTURA SWITCH
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
        System.out.println("Fin del switch");
    }
}
