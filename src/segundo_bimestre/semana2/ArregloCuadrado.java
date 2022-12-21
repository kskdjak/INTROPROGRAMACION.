package segundo_bimestre.semana2;

public class ArregloCuadrado {
    public static void main(String[] args) {
        int num[]={2,3,5,7,9,11,13};
        double cuadrado[]=new  double[num.length];
        for (int indice = 0; indice < num.length; indice++) {
            cuadrado[indice]=num[indice]*num[indice];
            // cuadrado[indice]=Math.pow(num[indice], 2);
        }
        for (int indice = 0; indice < num.length; indice++) {
            System.out.println(cuadrado[indice]);
        }

    }
}
