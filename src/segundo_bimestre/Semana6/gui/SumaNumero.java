package segundo_bimestre.Semana6.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumaNumero {
    private JPanel panelPrincipal;
    private JTextField txt_n1;
    private JTextField txt_n2;
    private JButton btn_suma;
    private JLabel lbl_resultado;
    private JButton restarButton;
    private JButton btn_multiplicacion;
    private JButton btn_dividir;

    public SumaNumero() {
        btn_suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int suma=Integer.parseInt(txt_n1.getText())
                        +Integer.parseInt(txt_n2.getText());
                lbl_resultado.setText(String.valueOf(suma));
            }
        });
        restarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resta=Integer.parseInt(txt_n1.getText())
                        -Integer.parseInt(txt_n2.getText());
                lbl_resultado.setText(String.valueOf(resta));
            }
        });
        btn_multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int multiplicacion=Integer.parseInt(txt_n1.getText())
                        *Integer.parseInt(txt_n2.getText());
                lbl_resultado.setText(String.valueOf(multiplicacion));
            }
        });
        btn_dividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1=0;
                double n2=0;
                double divicion=0;
                 try{
                     n1=Double.parseDouble(txt_n1.getText());
                     n2=Double.parseDouble(txt_n2.getText());
                     divicion=n1/n2;
                     lbl_resultado.setText(String.valueOf(divicion));
                 }catch (Exception error){
                     String mesange="ERROR";
                     lbl_resultado.setText(String.valueOf(mesange));
                 }
            }
        });
    }

    public static void main(String[] args) {
        JFrame inicio=new JFrame("SumaNumero");
        inicio.setContentPane(new SumaNumero().panelPrincipal);
        inicio.pack();
        inicio.setVisible(true);
    }
}
