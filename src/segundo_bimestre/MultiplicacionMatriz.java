package segundo_bimestre;

import java.util.Scanner;

public class MultiplicacionMatriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese las dimenciones de la primera matriz");
        System.out.println("Ingrese numero de filas");
        int filasa = teclado.nextInt();
        System.out.println("Ingrese numero de columnas");
        int colsa = teclado.nextInt();
        teclado.nextLine();
        int matrizA[][] = new int[filasa][colsa];

        System.out.println("Ingrese las dimenciones de la Segunda matriz");
        System.out.println("Ingrese numero de filas");
        int filasb = teclado.nextInt();
        System.out.println("Ingrese numero de columnas");
        int colsb = teclado.nextInt();
        teclado.nextLine();
        int matrizB[][] = new int[filasb][colsb];

        if (filasa == colsb) {
            for (int filas = 0; filas < filasa; filas++) {
                for (int colum = 0; colum < colsa; colum++) {
                    System.out.println("Ingrese el valor para posicion de la primera matriz: [" + filas + "][" + colum + "]");
                    matrizA[filas][colum] = teclado.nextInt();
                }
            }
            System.out.println("INGRESE LOS DATOS DE LA SEGUNDA MATRIZ");
            for (int fil = 0; fil < filasb; fil++) {
                for (int col = 0; col < colsb; col++) {
                    System.out.println("Ingrese el valor para posicion para segunda matriz: [" + fil + "][" + col + "]");
                    matrizB[fil][col] = teclado.nextInt();
                }
            }
            int matrizC[][] = new int[filasa][colsb];
            for (int fi = 0; fi < filasa; fi++) {
                for (int colA = 0; colA < colsb; colA++) {
                    for (int colB = 0; colB < colsa; colB++) {
                        matrizC[fi][colA] += matrizA[fi][colB] * matrizB[colB][colA];
                    }
                    System.out.println(matrizC[fi][colA]+" ");
                }
            }
            System.out.println("Resultado:");
            for (int fi = 0; fi < filasa; fi++) {
                for (int colA = 0; colA < colsb; colA++) {
                    System.out.print(matrizC[fi][colA] + "\t");
                }
                System.out.println();
            }
        }else
        System.out.println("dimension erroneas");
    }
}
