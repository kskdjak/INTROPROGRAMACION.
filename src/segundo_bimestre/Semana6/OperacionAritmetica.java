package segundo_bimestre.Semana6;

import java.awt.*;
import java.util.Scanner;

/**
 * Programa para crear metodos para realizar operacines aritmeticas
 */
public class OperacionAritmetica {
    //creacion de variable globales
    int n1;
    int n2;

    /**
     * Metodo para realzar la suma de dos numeros enteros
     * @param n1
     * @param n2
     * @return
     */
    public int sumar(int n1, int n2){
        return (n1+n2);
    }

    /**
     * Metodo para realzar la resta de dos numeros enteros
     * @param n1
     * @param n2
     * @return
     */
    public int restar(int n1, int n2){
        return (n1-n2);
    }

    /**
     * Metodo para realizar la multiplicaciion de dos numero enteros, no retornan valor
     * @param n1
     * @param n2
     */
    public void  multiplicar(int n1, int n2){
        System.out.println("La multiplicacion es: "+(n1*n2));
    }

    /**
     *
     */
    public void dividir(){
        if (n2>0){
            System.out.println("La divicion es: "+((double)n1/(double) n2));
        }else {
            System.out.println("Division por cero no existe");
        }

    }
    public void ejecutar(){
        Scanner teclado=new Scanner(System.in);
        boolean interruptor=true;
        while (interruptor){
            System.out.println("Digite 1 para sumar dos numeros");
            System.out.println("Digite 2 para restar dos numeros");
            System.out.println("Digite 3 para multiplicar dos numeros");
            System.out.println("Digite 4 para dividir dos numeros");
            System.out.println("Digite 0 para salir");
            int opcion= teclado.nextInt();
            switch (opcion){
                case 0:
                    interruptor=false;
                    System.out.println("SALIR");
                    break;
                case 1:
                    ingresar_numeros();
                    System.out.println("La suma es: "+sumar(n1,n2));
                    break;
                case 2:
                    ingresar_numeros();
                    System.out.println("La resta es: "+restar(n1,n2));
                    break;
                case 3:
                    ingresar_numeros();
                    multiplicar(n1,n2);
                    break;
                case 4:
                    ingresar_numeros();
                    dividir();
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

        }
    }
    public void ingresar_numeros(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        n1= teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2= teclado.nextInt();
    }

    public static void main(String[] args) {
        OperacionAritmetica mivariable=new OperacionAritmetica();
        mivariable.ejecutar();
    }
}
