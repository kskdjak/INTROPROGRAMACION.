package segundo_bimestre.semana4;

import java.util.Scanner;

/**
 * PROGRAMA PARA ELEVAR A UNA POTENCIA DADA LOS ELEMENTOS
 */
public class PotenciaMatriz {
    public static void main(String[] args) {
        int numeros[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };//dimencion de la matriz 3x3
        int filas= numeros.length;
        int cols=numeros[0].length;
        int mat_potencia[][]=new int[filas][cols];
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el valor de la potencia");
        int potencia= teclado.nextInt();
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < cols; col++) {
                mat_potencia[fila][col]= (int) Math.pow(numeros[fila][col], potencia);
                System.out.print(mat_potencia[fila][col]+"\t");
            }
            System.out.println("\n");
        }
    }
}
