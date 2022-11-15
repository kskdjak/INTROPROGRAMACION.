import java.util.Scanner;

/**
 *  Construya un algoritmo que reciba como datos de entrada tres números enteros,
 *  y regrese como dato de salida un mensaje que diga si esos tres números enteros pueden
 *  ser las medidas de los lados de un triángulo rectángulo.
 * Entrada: Tres números enteros.
 * Salida: No pueden ser los lados de un triángulos rectángulo.
 */
public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese tres numero enteros");
        System.out.println("Primer numero entero");
        int num1 = teclado.nextInt();
        System.out.println("segundo numero entero");
        int num2 = teclado.nextInt();
        System.out.println("tercer numero entero");
        int num3 = teclado.nextInt();
        int hipotenusa=(num1*num1)+(num2*num2);
        int numm3=(num3*num3);
        if (hipotenusa==numm3){
                System.out.println("Son lados de un triangulo rectangulo");
            }else
            System.out.println("No son lados de un triangulo rectangulo");
        }
}


