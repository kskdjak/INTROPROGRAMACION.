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
        // Implementar la lógica de validación de cédula
        // ...
        // Si la cédula es válida, devolver "válida"
        // Si la cédula es inválida, devolver "inválida"
    }
}
