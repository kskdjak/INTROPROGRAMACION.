package segundo_bimestre.semana2;

public class Arreglo2 {
    public static void main(String[] args) {
        //creacion de arreglos sin valores predefinidos
        String universisdades[] = new String[5];
        System.out.println("arreglos universidades: ");
        for (int indice = 0; indice < universisdades.length; indice++) {
            System.out.print(universisdades[indice] + "\t");
        }
        System.out.println("\n");
        int notas[] = new int[4];
        System.out.print("arreglo notas" + "\t");
        for (int indice = 0; indice < notas.length; indice++) {
            System.out.print(notas[indice] + "\t");
        }
        System.out.println("\n");
        boolean valores[] = new boolean[10];
        for (int indice = 0; indice < valores.length; indice++) {
            System.out.print(valores[indice] + "\t");
        }
        //creacion de un arreglo cuando desde un inicio no conocemos su tamaño
        String nombres[];//creamos un arreglo de nombres
        nombres = new String[10];//creacion de un arreglo de 10 elementos
    }
}
