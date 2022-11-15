package TrabajoClases;

import java.util.Scanner;

/**
 * Crear un algoritmo con el swtitch  que depende las 3 opciones se de los casos
 * opcion 1 calcular el ares de un triangulo
 * opcion 2 calcular el area de una circuferencia
 * opcion3 cacular el area de un cuadrado
 */

public class SwitchArea {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("ingrese un numero del 1 al 3");
        int opcion= teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Encontrar el area de un triangulo");
                System.out.println("ingrese la base");
                double base=teclado.nextDouble();
                System.out.println("ingrese la altura");
                double altura= teclado.nextDouble();
                double area= (base*altura)/2;
                System.out.println("El area del triangulo: "+ area);
                break;
            case 2:
                System.out.println("Encontrar el area de una circuferencia");
                System.out.println("ingrese el radio");
                double radio=teclado.nextDouble();
                double area2 =Math.PI*(radio*radio);
                System.out.println("El area de la circuferencia es: "+ area2);
                break;
            case 3:
                System.out.println("Encontrar el area del cuadrado");
                System.out.println("ingrese el lado");
                double lado=teclado.nextDouble();
                double area3=lado*lado;
                System.out.println("El area de la circuferencia es: "+ area3);
                break;
        }
        System.out.println("fin del switch");
    }
}
