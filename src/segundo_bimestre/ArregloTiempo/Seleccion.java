package segundo_bimestre.ArregloTiempo;

public class Seleccion {
    public static void main(String[] args) throws InterruptedException {
        int arreglo[]=new int[5000];
        int ind=0;
        for (int indice = 5000; indice > 0; indice--) {
            arreglo[ind]=indice;
            ind++;
        }
        long inicio= System.currentTimeMillis();
        for (int indice = 0; indice < arreglo.length; indice++) {
            int min=indice;
            for (int indice2 = indice+1; indice2 < arreglo.length; indice2++) {
                if(arreglo[indice2]<arreglo[min]){
                    min=indice2;
                }
            }
            int aux = arreglo[indice];
            arreglo[indice]=arreglo[min];
            arreglo[min]=aux;
        }
        for (int indice = 0; indice < arreglo.length; indice++) {
            System.out.println(arreglo[indice]);
        }
        long fin = System.currentTimeMillis();
        double tiempo= (double) ((fin-inicio));
        System.out.println(tiempo/1000+" segundos");
    }
}
