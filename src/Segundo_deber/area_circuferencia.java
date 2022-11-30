package Segundo_deber;

import java.util.Scanner;

public class area_circuferencia {
    public static void main(String[] args) {
        System.out.println("Programa para obtener el área de una circunferencia");
        Scanner teclado=new Scanner(System.in);
        System.out.println("Calcular el area de una circuferencia");
        System.out.println("ingrese el valor del radio: ");
        double radio=teclado.nextDouble();
        double pi=3.141592;
        double area=pi*(radio * radio);
        System.out.println("El area de la circuferencia es: "+area);
    }
}
