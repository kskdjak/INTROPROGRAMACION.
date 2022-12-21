package segundo_bimestre.Semana3;

import java.util.Scanner;

public class FichaDato {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean interruptor = true;
        String nombres[] = new String[100];
        int edades[] = new int[100];
        String univ[] = new String[100];
        int indice = 0;
        while (interruptor) {
            System.out.println("INGRESE DATOS DEL ESTUDIANTE");
            System.out.println("Ingrese su nombre:");
            nombres[indice] = teclado.nextLine();
            System.out.println("Ingrese su edad: ");
            edades[indice] = teclado.nextInt();
            teclado.nextLine();//para leer el enter luego de ingresar edad
            System.out.println("Ingrese universidad");
            univ[indice] = teclado.nextLine();
            indice++;
            System.out.println("Desea ingresar un nuevo estudiante si/no?");
            String resp = teclado.nextLine().toLowerCase();//convertido en minusculas
            if (resp.equals("no")) {
                interruptor = false;
            }
        }
        //proceso para arreglar arreglos pro edad
        System.out.println("ORDENAR ARREGLO POR EDAD");
        for (int indice2 = 1; indice2 <= edades.length - 1; indice2++) {
            for (int elemento = 0; elemento <= edades.length - 2; elemento++) {
                //Verificar si realizamos un intercambio
                if (edades[elemento] > edades[elemento + 1]) {
                    int aux = edades[elemento];
                    edades[elemento] = edades[elemento + 1];
                    edades[elemento + 1] = aux;
                    //proceso de intercambio arreglos nombres
                    String aux_n = nombres[elemento];
                    nombres[elemento] = nombres[elemento + 1];
                    nombres[elemento + 1] = aux_n;
                    //proceso de intercambio arreglos univ.
                    String aux_u = univ[elemento];
                    univ[elemento] = univ[elemento + 1];
                    univ[elemento + 1] = aux_u;
                }
            }
        }
        //presentar de los estudantes
        for (int pos = 0; pos < nombres.length; pos++) {
            if (nombres[pos]!=null) {
                System.out.println("Nombres: " + nombres[pos]);
                System.out.println("edades: " + edades[pos]);
                System.out.println("Universidades: " + univ[pos]);
            }
        }

    }
}
