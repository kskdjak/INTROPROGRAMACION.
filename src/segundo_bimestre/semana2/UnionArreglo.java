package segundo_bimestre.semana2;

import java.util.Scanner;

public class UnionArreglo {
    public static void main(String[] args) {
        String maracas1[]={"hp","dell","assus","lenovo","toshiba"};
        String maracas2[]={"Samsung","huawei","dere"};
        int tam_arr_resultado = maracas1.length+ maracas2.length;
        String res[]=new String[tam_arr_resultado];//arreglo cuando conocemos sus tamaños
        for (int indice = 0; indice < maracas1.length ; indice++) {
            res[indice]=maracas1[indice];
        }
        //copiamos los valores del arreglo marcas2 en el arreglo res
        for (int indice = maracas1.length, indice2=0; indice < res.length; indice++,indice2++) {
            res[indice]=maracas2[indice2];
        }
        for (int indice = 0; indice < res.length ; indice++) {
            System.out.println(res[indice]);
        }


    }
}