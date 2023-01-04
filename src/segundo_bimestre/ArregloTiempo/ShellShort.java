package segundo_bimestre.ArregloTiempo;

public class ShellShort {
    public static void main(String[] args) throws InterruptedException {
        long inicio= System.currentTimeMillis();
        int arreglo[]=new int[5000];
        int ind=0;
        for (int indice = 5000; indice > 0; indice--) {
            arreglo[ind]=indice;
            ind++;
        }
        for (int salto = arreglo.length / 2; salto != 0; salto /= 2) {
            boolean cambios = true;
            while (cambios) {
                cambios = false;
                for (int indice = salto; indice < arreglo.length; indice++)
                {
                    if (arreglo[indice - salto] > arreglo[indice]) {
                        int aux = arreglo[indice];
                        arreglo[indice] = arreglo[indice - salto];
                        arreglo[indice - salto] = aux;
                        cambios = true;
                    }
                }
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
