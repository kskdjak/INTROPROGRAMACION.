import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProyectoFinal_B2 {
    private JButton siguiente;
    private JPanel Panel_Principal;

    public ProyectoFinal_B2() {
        siguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Proyecto_final_B2 obj=new Proyecto_final_B2();
                obj.iniciar_proyecto_B2();
            }
        });
    }

    public static void main(String[] args) {
        JFrame inicio=new JFrame("Multiplicacion Matriz");
        inicio.setContentPane(new ProyectoFinal_B2().Panel_Principal);
        inicio.pack();
        inicio.setVisible(true);
    }

    public void iniciar_proyecto_B2() {
    }
}
