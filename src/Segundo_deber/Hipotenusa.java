package Segundo_deber;

import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        System.out.println("Programa para calcular el valor de la hipotenusa (emplear teorema de pitágoras)");
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el cateto_uno: ");
        double cateto_uno= teclado.nextDouble();
        System.out.println("Ingrese el cateto_dos: ");
        double cateto_dos= teclado.nextDouble();
        double hipotenusa=Math.sqrt((cateto_uno*cateto_uno)+(cateto_dos*cateto_dos));
        System.out.println("La hipotenusa tiene el valor de: "+hipotenusa);
    }
}
