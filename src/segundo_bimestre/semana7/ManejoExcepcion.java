package segundo_bimestre.semana7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * programa para realizar la division de dos numeros
 */
public class ManejoExcepcion {
    //Creacion de variables globales
    double n1;
    double n2;
    public static void main(String[] args) {
        ManejoExcepcion mivar=new ManejoExcepcion();
        mivar.ejecutar();
    }
    public void ejecutar(){
        ingresar_datos();
        System.out.println("Resultado= "+ dividir());
    }
    public  void ingresar_datos(){
        //El bloque try nos ayuda a captar o detectar si ocurre una excepcion
        try {//Este codigo tiene la posiblididad de presentar una excepcion
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese el numerador");
            n1 = teclado.nextDouble();
            System.out.println("Ingrese denominador");
            n2 = teclado.nextDouble();
        }catch (Exception error_de_teclado){
            System.out.println("Manejo de la excepcion de tipo aritmetico");
            System.out.println(error_de_teclado.getMessage());
        }
    }
    public double dividir(){
        double resultado=0;
        try {
            //codigo en el que posiblemente puede ocurrir una excepcion
            resultado=n1/n2;
            return resultado;
        }catch (Exception error){
            //Este codigo se ejecuta solo si ocurre una excepcion
            System.out.println("Error de tipo aritmetico");
            System.out.println(error.getMessage());
        }finally {
            //Este codigo se ejecuta ocurra o no la excepcion
            System.out.println("ingreso a finally");
        }
        System.out.println("Resultado= "+ resultado);
        return resultado;
    }
}
