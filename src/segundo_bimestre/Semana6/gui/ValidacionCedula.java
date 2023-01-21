package segundo_bimestre.Semana6.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class ValidacionCedula extends Container {
    private JLabel txt_cedula;
    private JTextField txt_n1;
    private JButton btn_validar;
    private JLabel btn_resultado;
    private JPanel PanelPrincipal;

    public ValidacionCedula() {
        btn_validar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txt_n1.getText().length() == 10) {
                    int cedula[] = new int[10];
                    String ced = txt_n1.getText();
                    System.out.println(ced);
                    for (int indice = 0; indice < cedula.length; indice++) {
                        cedula[indice] = Character.getNumericValue(ced.charAt(indice));
                        //System.out.println(ced.charAt(indice));
                        System.out.println(cedula[indice] + " ");
                    }

                    ValidacionCedula asd = new ValidacionCedula();
                    for (int indice = 0; indice < 9; indice = indice + 2) {
                        cedula[indice] = cedula[indice] * 2;
                    }
                    for (int indice = 0; indice < 9; indice++) {
                        if (cedula[indice] >= 10) {
                            cedula[indice] = cedula[indice] - 9;
                        }
                    }
                    int acumulador = 0;
                    for (int indice = 0; indice < 9; indice++) {
                        acumulador = cedula[indice] + acumulador;
                    }
                    int decena = 0;
                    while (acumulador < 99 || acumulador < 1000) {
                        decena = acumulador / 10;
                        break;
                    }
                    System.out.println(decena);
                    decena = (decena * 10) + 10;
                    System.out.println(decena);
                    int resultadoresta = 0;
                    resultadoresta = decena - acumulador;

                    if (resultadoresta == cedula[9]) {
                        String mensaje1 = "Cedula Valida";
                        btn_resultado.setText(mensaje1);
                    } else {
                        String mensaje2 = "Cedula invalidad";
                        btn_resultado.setText(mensaje2);
                    }
                }else{
                    String mensaje4= "Cedula Incorrecta";
                    btn_resultado.setText(mensaje4);
                }
            }
        });
    }
    public static void main(String[] args) {
        JFrame inicio = new JFrame("Validacion");
        inicio.setContentPane(new ValidacionCedula().PanelPrincipal);
        inicio.pack();
        inicio.setVisible(true);
    }

}
