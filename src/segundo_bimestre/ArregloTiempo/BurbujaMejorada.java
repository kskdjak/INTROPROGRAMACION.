package segundo_bimestre.ArregloTiempo;

public class BurbujaMejorada {
    public static void main(String[] args) throws InterruptedException {
        boolean cambio;
        int arreglo[]=new int[5000];
        int ind=0;
        for (int indice = 5000; indice > 0; indice--) {
            arreglo[ind]=indice;
            ind++;
        }
        long inicio= System.currentTimeMillis();

        for (int indice = 0; indice < arreglo.length-1; indice++) {
            cambio=false;
            for (int indice2 = 0; indice2 < arreglo.length-indice-1; indice2++) {
                if (arreglo[indice2]>arreglo[indice2+1]) {
                    int aux=arreglo[indice2];
                    arreglo[indice2]=arreglo[indice2+1];
                    arreglo[indice2+1]=aux;
                    cambio=true;
                }
            }
            if (!cambio) {
                break;
            }
        }
        for (int indice = 0; indice < arreglo.length; indice++) {
            System.out.println(arreglo[indice]);
        }
        long fin = System.currentTimeMillis();
        double tiempo= (double) ((fin-inicio));
        System.out.println(tiempo/1000+" segundos");
    }
}
