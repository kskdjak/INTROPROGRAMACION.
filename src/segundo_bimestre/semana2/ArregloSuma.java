package segundo_bimestre.semana2;

import java.util.Scanner;

public class ArregloSuma {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese la cantiadad de arreglos que desea ingresar");
        int arreglo= teclado.nextInt();
        int arreglo1[]=new int[arreglo];
        int arreglo2[]=new int[arreglo];
        System.out.println("Ingrese los datos del primer arreglo");
        for (int indice = 0; indice < arreglo; indice++) {
            System.out.println("ingrese numeros"+ (indice+1));
            int numero= teclado.nextInt();
            arreglo1[indice]=numero;
        }
        System.out.println("Ingrese los datos del segundo arreglo");
        for (int indice = 0; indice < arreglo2.length; indice++) {
            System.out.println("Ingrese los nunmeros"+(indice+1));
            int numero1= teclado.nextInt();
            arreglo2[indice]=numero1;
        }
        int suma[]=new int[arreglo];
        for (int indice = 0; indice < arreglo; indice++) {
            suma[indice]=arreglo1[indice]+arreglo2[indice];
        }
        for (int indice = 0; indice < arreglo; indice++) {
            System.out.println(suma[indice]);
        }
    }
}
