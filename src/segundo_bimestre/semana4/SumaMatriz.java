package segundo_bimestre.semana4;

public class SumaMatriz {
    public static void main(String[] args) {
        int matrizA[][]={
                {1,2,3},
                {4,0,7},
                {1,6,5}
        };
        int matrizB [][]={
                {0,1,3},
                {9,3,2},
                {1,9,5}
        };
        int filas=matrizA.length;
        int columna=matrizA[0].length;
        int matrizC[][]=new int[filas][columna];
        //SUMA DE MATRICES A+B=C
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < columna; col++) {
                matrizC[fila][col]=matrizA[fila][col]+matrizB[fila][col];

            }
        }
        //mostrar elementos de la matrizC
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < columna; col++) {
                System.out.print(matrizC[fila][col]+"\t");
            }
            System.out.println("\n");
        }
    }
}
