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

            }
        });
    }
}
