package Segundo_deber;

import java.util.Scanner;

public class Ecuacion_cuadratica {
    public static void main(String[] args) {
        System.out.println("Programa para resolver una ecuación cuadrática aplicando la fórmula general");
        Scanner teclado=new Scanner(System.in);

        System.out.println("ingrese termino_cuadratico: ");
        double t_c=teclado.nextDouble();
        System.out.println("ingrese termino lineal: ");
        double t_l=teclado.nextDouble();
        System.out.println("ingrese termino independiente: ");
        double t_i=teclado.nextDouble();
        double determinante=(t_l*t_l)-(4*t_c*t_i);
        double ecuacion_uno=(-t_l+ Math.sqrt(determinante))/2*t_c;
        double ecuacion_dos=(-t_l- Math.sqrt(determinante))/2*t_c;
        System.out.println("La ecuacion_uno cuadratica  es: "+ecuacion_uno);
        System.out.println("La ecuacion_dos cuadratica  es: "+ecuacion_dos);
    }
}
