package repeticion_while;

import javax.swing.*;

/**
 * Generar la tabla de multiplicar hasta el 10 de un numero ingresa por teclado
 */
public class TablaMultiplicacion {
    public static void main(String[] args) {
        //System.out.println("Programa para generar la tabla de multiplicar");
        JOptionPane.showMessageDialog(null,"Programa para generar la tabla de multiplicar");
        //System.out.println("ingrese un numero");
        String num=JOptionPane.showInputDialog("Ingrese un numero");
        int contador=1;
        String acumulador="";
        while (contador<=10){
            int mult=Integer.parseInt(num)*contador;//convertimos valor string a valor entero
            String salida= num+"x"+String.valueOf(contador)+"="+String.valueOf(mult)+"\n";
            acumulador=acumulador+salida;
            contador=contador+1;
        }
        JOptionPane.showMessageDialog(null, acumulador);
    }
}
