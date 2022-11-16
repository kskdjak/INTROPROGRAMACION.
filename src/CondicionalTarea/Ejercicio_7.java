package CondicionalTarea;

import java.util.Scanner;

/**
 * Escriba un algoritmo que le pida al usuario que introduzca dos números. Si el primer número introducido es mayor que
 * el segundo, el programa deberá imprimir el mensaje “El primer número es mayor”; de lo contrario deberá imprimir el
 * mensaje “El primer número es menor”. Pruebe su algoritmo introduciendo los números 5 y 8 y luego usando los números
 * 11 y 2. ¿Qué piensa que desplegará su algoritmo si los dos números introducidos son iguales? Prueba este caso.
 */
public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1= teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2= teclado.nextInt();
        if (num1>num2){
            System.out.println("El primer numero es mayor");
        }else{
            System.out.println("El primer número es menor");
        }
    }
}
