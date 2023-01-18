package segundo_bimestre.Semana6;

import java.util.Scanner;

public class Cedula {
    public static void main(String[] args) {
        // Crear una matriz de 5 x 1 para almacenar las cédulas
        String[][] cedulas = new String[5][1];
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese las cédulas
        for (int i = 0; i < cedulas.length; i++) {
            System.out.print("Ingrese la cédula " + (i + 1) + ": ");
            cedulas[i][0] = sc.nextLine();
        }

        // Validar cada cédula utilizando el método 1
        for (int i = 0; i < cedulas.length; i++) {
            System.out.println("Cédula " + (i + 1) + ": " + validateCedula(cedulas[i][0]));
        }
    }

    // Método 1 para validar una cédula ecuatoriana
    public static String validateCedula(String cedula) {
        int[] factors = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
        int sum = 0;
        int expectedCheckDigit;

        // Validar que la cédula tenga 10 dígitos
        if (cedula.length() != 10) {
            return "inválida";
        }

        // Calcular el dígito verificador esperado
        for (int i = 0; i < cedula.length() - 1; i++) {
            int digit = Integer.parseInt(cedula.substring(i, i + 1));
            sum += digit * factors[i];
        }

        expectedCheckDigit = (10 - (sum % 10)) % 10;

        // Comparar el dígito verificador esperado con el actual
        int actualCheckDigit = Integer.parseInt(cedula.substring(9, 10));
        if (expectedCheckDigit == actualCheckDigit) {
            return "válida";
        } else {
            return "inválida";
        }
    }
}
