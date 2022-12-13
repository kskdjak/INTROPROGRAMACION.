package segundo_bimestre.semana2;

import java.util.Scanner;

/**
 * Programa que solicite el nombre de n marcas de vehiculos y las almacenes un arreglo finalmente el programa debe mostrar
 * el nombres de las maracas almacenadas en el arreglo
 */
public class ArregloMarca {
    public static void main(String[] args) {
        String marcas[];
        System.out.println("Cuantas marcas de vehiculos va a ingresar");
        Scanner teclado=new Scanner(System.in);
        int n= teclado.nextInt();
        teclado.nextLine();//cada que se encuentran para leer dos numero enteros es para que se detenga el enter
        marcas=new String[n];//creamos el arreglo con n elementos
        //OPERACION ESCRITURA DEL ARREGLO
        for (int indice = 0; indice < n; indice++) {
            System.out.println("ingrese el nombre de la marca"+(indice+1)+": ");
            String marca= teclado.nextLine();
            marcas[indice]= marca.toUpperCase();
        }
        System.out.println("Lista de marcas ingresadas: ");
        //OPERACION LECTURA DEL ARREGLO
        for (int indice = 0; indice < marcas.length; indice++) {
            System.out.println(marcas[indice]+"\t");
        }
        //OPERACION DE BUSQUEDA
        System.out.println("¿Que noobre de maraca dessea busacar: ");
        //.toUpperCase()= Es una funcion que siempre nos convierte a mayusculas
        //.toLowerCase()= Es una funcion que siempre nos convierte a minusculas
        String marca_busqueda= teclado.nextLine().toUpperCase();
        System.out.println("marca_busacada: "+ marca_busqueda);
        for (int indice = 0; indice < n; indice++) {
            if (marca_busqueda.equals(marcas[indice])){
                System.out.println("marca encontrada");
                System.out.println("Se encuentra en el indice"+ indice);
                break;
            }
        }
    }
}

