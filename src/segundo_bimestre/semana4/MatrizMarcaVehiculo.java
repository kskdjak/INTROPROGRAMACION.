package segundo_bimestre.semana4;

import java.util.Scanner;

/**
 * programa para crear una matriz con valores recibidos desde el teclado y luego poder realizar
 * repertitivamente operaciones de:
 * 1. Buqueda
 * 2. Modificacion
 * 3. Eliminacion
 * 4. Visualizacion
 * 5. salida
 */
public class MatrizMarcaVehiculo {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese las dimenciones de la matriz");
        System.out.println("Ingrese numero de filas");
        int filas= teclado.nextInt();
        System.out.println("Ingrese numero de columnas");
        int cols=teclado.nextInt();
        teclado.nextLine();
        String marcas[][]=new String[filas][cols];//establecemos dimencion de la matriz
        //llenado de la mariz operacion de escritura
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < cols; col++) {
                System.out.println("Ingrese el valor para posicion: ["+fila+"]["+col+"]");
                marcas[fila][col]= teclado.nextLine().toLowerCase();
            }

        }
        boolean salir=false;
        while (!salir){//salir==false
            System.out.println("Digite 1 para realizar la busqueda: ");
            System.out.println("Digite 2 para modificar un valor: ");
            System.out.println("Digite 3 para eliminar un valor: ");
            System.out.println("Digite 4 para vizualizar matriz: ");
            System.out.println("Digite 5 para salir: ");
            int opcion= teclado.nextInt();
            switch (opcion){
                case 1:
                    teclado.nextLine();
                    System.out.println("HAS SELECCIONADAO LA OPERACION BUSQUEDA");
                    System.out.println("¿Que marca busca: ?");
                    String marca_buscada= teclado.nextLine().toLowerCase();
                    boolean encontrado=false;
                    for (int fila = 0; fila < filas; fila++) {
                        for (int col = 0; col < cols; col++) {
                            if (marcas[fila][col].equals(marca_buscada)){
                                System.out.println("Si se encontro la marca: "+marca_buscada);
                                System.out.println("En la posicion: ["+fila+"]["+col+"]");
                                encontrado=true;
                                break;
                            }
                        }
                    }
                    if (encontrado==false)
                        System.out.println("Marca no encontrada");
                    break;
                case 2:
                    System.out.println("HAS SELECCIONADO LA OPERACION DE MODIFICACION");
                    System.out.println("Ingrese que fila desea modificar");
                    int fil= teclado.nextInt();
                    System.out.println("Ingrese que columna desea modificar");
                    int colum= teclado.nextInt();
                    System.out.println("Cual es la nueva marca a ingresar");
                    teclado.nextLine();
                    String nueva_marca= teclado.nextLine();
                    marcas[fil][colum]=nueva_marca;
                    break;
                case 3:
                    System.out.println("HAS SELECIONADO LA OPERECION DE ELEMINACION");
                    System.out.println("que marcas va a eliminar");
                    teclado.nextLine();
                    String marca_a_eliminar= teclado.nextLine().toLowerCase();
                    for (int fila = 0; fila < filas; fila++) {
                        for (int col = 0; col < cols; col++) {
                         if (marcas[fila][col].equals(marca_a_eliminar)){
                             marcas[fila][col]= "";
                            }
                        }

                    }
                    break;
                case 4:
                    System.out.println("HAS SELECIONADO LA OPERACION DE LECTURA");
                    for (int fila = 0; fila < filas; fila++) {
                        for (int col = 0; col < cols; col++) {
                            System.out.print(marcas[fila][col]+"\t");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("HASTA PRONTO");
                    salir=true;
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
            }
        }
    }
}
