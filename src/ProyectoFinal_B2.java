import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ProyectoFinal_B2 {
    private JPanel panelprincipal;
    private JTextArea txt_m1;
    private JTextArea txt_m2;
    private JButton Multi;
    private JLabel lbl_resultado;
    private JButton btn;
    private JLabel lbl;

    public ProyectoFinal_B2() {

        Multi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int suma = Integer.parseInt(txt_m1.getText())
                        + Integer.parseInt(txt_m2.getText());
               lbl_resultado.setText(String.valueOf(suma));
            }
        });

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero = String.valueOf(txt_m1);
                String[] numbers = numero.split(",");
                int[] intNumbers = new int[numbers.length];
                for (int i = 0; i < numbers.length; i++) {
                    intNumbers[i] = Integer.parseInt(numbers[i].trim());
                }
                for (int num : intNumbers) {
                    lbl.setText(String.valueOf(num));
                }
            }
        });
    }


    public static void main(String[] args) {
        JFrame inicio=new JFrame("Multiplicacion Matriz");
        inicio.setContentPane(new ProyectoFinal_B2().panelprincipal);
        inicio.pack();
        inicio.setVisible(true);
    }
}
