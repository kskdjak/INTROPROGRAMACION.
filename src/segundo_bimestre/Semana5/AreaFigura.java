package segundo_bimestre.Semana5;

import java.util.Scanner;

public class AreaFigura {

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         System.out.println("Digite 1 para obtener area de una circuferencia");
         System.out.println("Digite 2 para obtener area de un cuadrado");
         System.out.println("Digite 3 para obtener area de un cilindrio");
         int opcion = teclado.nextInt();
         Selecionar_figura(opcion);
    }
    /**
     * Metodo para determinar la opcion
     * @param opcion
     */
    public static void Selecionar_figura(int opcion){
        Scanner teclado=new Scanner(System.in);
        switch (opcion){
            case 1:
                System.out.println("Ingresar el valor del radio");
                double radio= teclado.nextInt();
                double area=obtener_area_circuferencia(radio);
                System.out.println("El area es: "+area);
                break;
        }
    }

    /**
     * Metodo para obtener el area de una circuferencia
     * @param radio
     * @return
     */
    public double obtener_area_circuferencia(double radio){
        double area=Math.PI*Math.pow(radio,2);
        return area;
    }

    /**
     * Metodo para obtener el area
     * @param lado
     * @return
     */
    public double obtener_area_cuadrado(double lado){
        double area= lado*lado;
        return area;
    }


    public double obtener_area_de_un_cilindro(){

    }


}
