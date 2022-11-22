package estructura_for;

import java.util.Scanner;

public class TrianguloAsterisco {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el numero filas");
        int filas= teclado.nextInt();
        //System.out.println("Ingre el numero de columnas");
        //int columnas= teclado.nextInt();
        for (int fila=1;fila<=filas;fila++){// Se controlan las filas
            String fila_asterisco="";
            for (int col=1;col<=fila;col++){// Se controlan el numero de columnas
                fila_asterisco=fila_asterisco+"*";
            }
            System.out.println(fila_asterisco);
        }
    }
}
