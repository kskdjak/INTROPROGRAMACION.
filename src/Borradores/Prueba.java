package Borradores;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Prueba {
    private JPanel panelprincipal;
    private JTable table1;
    private JTextField txt_fil;
    private JTextField txt_col;


    public Prueba() {
        table1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                DefaultTableModel model = (DefaultTableModel) table1.getModel();
                int fila = Integer.parseInt(txt_fil.getText());
                int col = Integer.parseInt(txt_col.getText());
                model.setRowCount(fila);
                model.setColumnCount(col);
                int matriz [][]= new int[fila][col];
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[0].length; j++) {
                        table1.setValueAt(matriz[i][j],i,j);
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame inicio=new JFrame("Multiplicacion Matriz");
        inicio.setContentPane(new Prueba().panelprincipal);
        inicio.pack();
        inicio.setVisible(true);
    }
}
