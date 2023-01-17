package segundo_bimestre.Semana6;

import java.util.Scanner;

/**
 * Programa para verificar atraves de metodos si un numero es primo y si es par o impar
 */
public class Verificacion {
    int num_a_verificar;
    public boolean verificar_primo(int num_a_verificar) {
        int contador_divisor = 0;
        for (int contador = 1; contador <= num_a_verificar; contador++) {
            if (num_a_verificar % contador == 0) {//detectamos un nuevo divisor
                contador_divisor++;
            }
        }
        if (contador_divisor == 2) {// verificamos si es primo
            return true;
        } else
            return false;
    }

    public boolean verificar_par(int num_a_verificar) {
        if (num_a_verificar % 2 == 0) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
       // Verificacion mivaraiable = new Verificacion();
        //if (mivaraiable.verificar_primo(5) == true)
         //   System.out.println("Si es primo");
        //else
          //  System.out.println("No es primo ");
        //if (mivaraiable.verificar_par(7) == true)
           // System.out.println("Si es par");
        //else
        //  System.out.println("Es impar");
        Verificacion mivariable=new Verificacion();
        mivariable.ejecutar();
    }

    public void ejecutar() {
        Scanner teclado = new Scanner(System.in);
        boolean interruptor = true;
        while (interruptor) {
            System.out.println("Digite 1 para verificar si es un numero primo");
            System.out.println("Digite 2 para verificar si es par o impar");
            System.out.println("Digite 0 para salir");
            int opcion = teclado.nextInt();
            switch (opcion){
                case 0:
                    interruptor=false;
                    System.out.println("SALIR");
                    break;
                case 1:
                    ingresar_numeros();

                    if (verificar_primo(num_a_verificar) == true)
                           System.out.println("Si es primo");
                        else
                          System.out.println("No es primo ");
                    break;
                case 2:
                    ingresar_numeros();
                    if ( verificar_par(num_a_verificar) == true)
                        System.out.println("Si es par");
                    else
                        System.out.println("Es impar");
                    break;
                default:
                    System.out.println("Datos incorrectos");
            }
        }
    }
    public void ingresar_numeros(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el  numero");
        num_a_verificar= teclado.nextInt();
    }
}