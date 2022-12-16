package segundo_bimestre.semana2;

import java.nio.charset.CharsetDecoder;
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra= teclado.nextLine().toLowerCase();
        int tam_palabra=palabra.length();
        char palabra_arr[]=new char[tam_palabra];
        //pasamos los caracteres de palabra al arreglo palabra_arr
        for (int indice = 0; indice < tam_palabra; indice++) {
            palabra_arr[indice]=palabra.charAt(indice);
        }
        //lectura del arreglo de derecha a izquierda
        String palabra_invertida="";
        for (int indice = tam_palabra-1; indice >=0; indice--) {
            palabra_invertida=palabra_invertida+palabra_arr[indice];
        }
        //determinamos si es palindromo
        if (palabra.equals(palabra_invertida)){
            System.out.println("Si es palindromo");
        }else{
            System.out.println("No es palindromo");
        }

       //for (int indice = 0; indice < tam_palabra; indice++) {
        //    System.out.println(palabra_arr[indice]);
        //}

    }
}
