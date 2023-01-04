package segundo_bimestre.ArregloTiempo;

public class Insercion {
    public static void main(String[] args) throws InterruptedException {
        int arreglo[]=new int[5000];
        int ind=0;
        for (int indice = 5000; indice > 0; indice--) {
            arreglo[ind]=indice;
            ind++;
        }
        long inicio= System.currentTimeMillis();
        for (int indice = 0; indice < arreglo.length; indice++) {
            int pos=indice;
            int aux= arreglo[indice];
            while ((pos>0)&&(arreglo[pos-1]>aux)){
                arreglo[pos]=arreglo[pos-1];
                pos--;
            }
            arreglo[pos]=aux;
        }
        for (int indice = 0; indice < arreglo.length; indice++) {
            System.out.println(arreglo[indice]);
        }
        long fin = System.currentTimeMillis();
        double tiempo= (double) ((fin-inicio));
        System.out.println(tiempo/1000+" segundos");
    }
}
