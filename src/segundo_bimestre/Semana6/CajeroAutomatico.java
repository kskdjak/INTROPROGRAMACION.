package segundo_bimestre.Semana6;

import java.util.Scanner;

public class CajeroAutomatico {
    // Variable global
    static double saldoCuenta = 0;

    /**
     * Metodo para iniciar el saldo de la cuenta
     * @param saldoInicial
     */
    public static void iniciar_cuenta(double saldoInicial) {
        saldoCuenta = saldoInicial;
    }

    /**
     * Metodo para consultar el saldo
     * @return
     */
    public static double consultar_saldo() {
        return saldoCuenta;
    }

    /**
     * Metodo para retirar dinero
     * @param cantidad
     * @return
     */
    public static double retirar_dinero(double cantidad) {
        if (cantidad > saldoCuenta) {
            return Integer.parseInt("Saldo insuficiente");
        } else {
            saldoCuenta -= cantidad;
            return saldoCuenta;
        }
    }

    /**
     * Metodo para deposotar dinero
     * @param cantidad
     * @return
     */
    public static double depositar_dinero(double cantidad) {
        saldoCuenta += cantidad;
        return saldoCuenta;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el saldo inicial: ");
        double saldoInicial = scanner.nextDouble();
        iniciar_cuenta(saldoInicial);

        while (true) {
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("Saldo: " + consultar_saldo());
            } else if (opcion == 2) {
                System.out.println("Ingrese la cantidad a retirar: ");
                double cantidad = scanner.nextDouble();
                System.out.println(retirar_dinero(cantidad));
            } else if (opcion == 3) {
                System.out.println("Ingrese la cantidad a depositar: ");
                double cantidad = scanner.nextDouble();
                System.out.println(depositar_dinero(cantidad));
            } else if (opcion == 4) {
                System.out.println("Gracias por usar el cajero automático.");
                break;
            } else {
                System.out.println("Opción inválida.");
            }
        }
    }

}
