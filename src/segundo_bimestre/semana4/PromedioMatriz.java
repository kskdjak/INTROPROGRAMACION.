package segundo_bimestre.semana4;

import java.util.Scanner;

/**
 * Programa para calcular el promedio de los elementos de una matriz dada
 */
public class PromedioMatriz {
    public static void main(String[] args) {
        int numeros[][]={
                {5,6},
                {2,7},
                {7,1},
                {3,4}
        };
        int suma_total=0;
        for (int fila = 0; fila < numeros.length; fila++) {
            for (int col = 0; col < numeros[0].length; col++) {
                //suma_total=suma_total+numeros[fila][col];
                suma_total+=numeros[fila][col];

            }
        }
        int nro_elementos= (numeros.length*numeros[0].length);
        double promedio=(double) suma_total/(double) nro_elementos;
        System.out.println("suma" + suma_total);
        System.out.println("El promedio es: "+promedio);
    }
}
