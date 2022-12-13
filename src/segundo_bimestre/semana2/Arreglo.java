package segundo_bimestre.semana2;

public class Arreglo {
    public static void main(String[] args) {
        //creacion de arreglos con valores predefinidos
        String universidades []={"utpl","unl","espol","ucuneca","usfq","uide"};
        int tam=universidades.length;//obtenemos el tamaño del arreglo
        System.out.println("El tamaño del arreglo es igual a: "+tam);
        for (int indice = 0; indice < tam; indice++) {
            System.out.print(universidades [indice] + "\t");
        }
        System.out.println("\n");
        //creacion de un arreglo de tipo entero
        int notas []={7,8,5,4,10};
        for (int indice = 0; indice < notas.length ; indice++) {
            System.out.print(notas[indice]+"\t");
        }
        System.out.println("\n");
        //creacion de un arrglo de tipo char
        char vocales[]={'a','e','i','o','u'};
        for (int indice = 0; indice < vocales.length ; indice++) {
            System.out.print(vocales[indice]+"\t");
        }
        System.out.println("\n");
        //creacion de un arreglo de tipo boleaan
        boolean valores[]={true,false,true,false,true};
        for (int indice = 0; indice < valores.length ; indice++) {
            System.out.print(valores[indice]+"\t");
        }
        System.out.println("\n");
        //creacion de un arreglo de tipo decimal
        double numeros[]={1.0,2.5,3.1};
        for (int indice = 0; indice < numeros.length ; indice++) {
            System.out.print(numeros[indice]+"\t");

        }
    }
}
