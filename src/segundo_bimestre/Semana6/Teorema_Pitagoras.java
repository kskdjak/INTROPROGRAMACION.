package segundo_bimestre.Semana6;

import java.util.Scanner;

public class Teorema_Pitagoras {
    /**
     * Metodo para indentificar el tipo de triangulo
     * @param cateto1
     * @param cateto2
     * @param hipotenusa
     * @return
     */
    public static String tipoTriangulo(double cateto1, double cateto2, double hipotenusa) {
        if (Math.pow(hipotenusa, 2) == Math.pow(cateto1, 2) + Math.pow(cateto2, 2)) {
            return "Triángulo rectángulo";
        } else if (Math.pow(hipotenusa, 2) < Math.pow(cateto1, 2) + Math.pow(cateto2, 2)) {
            return "Triángulo acutángulo";
        } else {
            return "Triángulo obtusángulo";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor del primer cateto: ");
        double cateto1 = scanner.nextDouble();
        System.out.println("Ingrese el valor del segundo cateto: ");
        double cateto2 = scanner.nextDouble();
        System.out.println("Ingrese el valor de la hipotenusa: ");
        double hipotenusa = scanner.nextDouble();

        System.out.println("Tipo de triángulo: " + tipoTriangulo(cateto1, cateto2, hipotenusa));
    }
}
