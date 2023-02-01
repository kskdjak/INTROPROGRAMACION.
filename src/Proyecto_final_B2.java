import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Proyecto_final_B2 {
    private JTextField fila1;
    private JTextField col1;
    private JTextField txt_fil2;
    private JTextField txt_col2;
    private JTable tbl_m1;
    private JTable table2;
    private JTable procedi;
    private JTable table3;
    private JButton crear;
    private JButton mul;
    private JPanel panel_principal;
    private JLabel cordena;
    private JButton Limpiar;
    private JButton salir;

    public Proyecto_final_B2() {
        crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (col1.getText().equals(txt_fil2.getText())) {
                    int fila = Integer.valueOf(fila1.getText());
                    int col = Integer.valueOf(col1.getText());
                    DefaultTableModel moderl = (DefaultTableModel) tbl_m1.getModel();
                    moderl.setRowCount(fila);
                    moderl.setColumnCount(col);

                    int fila2 = Integer.valueOf(txt_fil2.getText());
                    int col2 = Integer.valueOf(txt_col2.getText());
                    DefaultTableModel moderl1 = (DefaultTableModel) table2.getModel();
                    moderl1.setRowCount(fila2);
                    moderl1.setColumnCount(col2);
                }else {
                    JOptionPane.showMessageDialog(null,"Es imposible multiplicar entre si tales matrices, así que\n el número de columnas de la matriz A no\n equivale al número de filas de la matriz B.");
                }
            }
        });
        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (col1.getText().equals(txt_fil2.getText())){
                    int fila= Integer.valueOf(fila1.getText());
                    int  col = Integer.valueOf(col1.getText());
                    DefaultTableModel moderl= (DefaultTableModel) tbl_m1.getModel();
                    moderl.setRowCount(fila);
                    moderl.setColumnCount(col);

                    int fila2= Integer.valueOf(txt_fil2.getText());
                    int  col2 = Integer.valueOf(txt_col2.getText());
                    DefaultTableModel moderl1= (DefaultTableModel) table2.getModel();
                    moderl1.setRowCount(fila2);
                    moderl1.setColumnCount(col2);
                    DefaultTableModel model3 = (DefaultTableModel) table3.getModel();
                    int r, i, j;
                    int S=0;
                    String pro=" ";
                    int FilaA= Integer.parseInt(fila1.getText());
                    int ColA= Integer.parseInt(col1.getText());
                    int FilaB= Integer.parseInt(txt_fil2.getText());
                    int ColB = Integer.parseInt(txt_col2.getText());
                    int matrizC[][]=new int [FilaA][ColB];
                    model3.setRowCount(FilaA);
                    model3.setColumnCount(ColB);
                    String matriz_proce[][]=new String[FilaA][ColB];
                    for ( i = 0; i < FilaA; i++) {
                        for ( j = 0; j < ColB; j++) {
                            S=0;
                            pro=" ";
                            for ( r = 0; r < ColA; r++) {
                                pro +=tbl_m1.getValueAt(i, r).toString() +"x"+ table2.getValueAt(r, j).toString()+ "+";
                                S=S+Integer.parseInt(tbl_m1.getValueAt(i,r).toString())*Integer.parseInt(table2.getValueAt(r,j).toString());
                            }
                            table3.setValueAt(S+"",i,j);
                            matriz_proce[i][j]=pro;
                            System.out.println(pro);
                            System.out.println(S);
                        }
                    }
                    DefaultTableModel proced=(DefaultTableModel) procedi.getModel();
                    proced.setRowCount(matriz_proce.length);
                    proced.setColumnCount(matriz_proce[0].length);
                    for (int k = 0; k < matriz_proce.length; k++) {
                        for (int l = 0; l < matriz_proce[0].length; l++) {
                            procedi.setValueAt(matriz_proce[k][l],k,l);
                        }
                    }
                }
            }
        });
        Limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fila1.setText(" ");
                col1.setText(" ");
                txt_fil2.setText(" ");
                txt_col2.setText(" ");
                DefaultTableModel model1=(DefaultTableModel) table2.getModel();
                model1.setRowCount(0);
                model1.setColumnCount(0);
                String matriza_vacia[][]=new String[0][0];
                for (int i = 0; i < 0; i++) {
                    for (int j = 0; j < 0; j++) {
                        table2.setValueAt(matriza_vacia[i][j],i,j);
                    }
                }
                DefaultTableModel model2=(DefaultTableModel) tbl_m1.getModel();
                model2.setRowCount(0);
                model2.setColumnCount(0);
                String matrizb_vacia[][]=new String[0][0];
                for (int i = 0; i < 0; i++) {
                    for (int j = 0; j < 0; j++) {
                        table2.setValueAt(matrizb_vacia[i][j],i,j);
                    }
                }
                DefaultTableModel model_proce=(DefaultTableModel) procedi.getModel();
                model_proce.setRowCount(0);
                model_proce.setColumnCount(0);
                String matrizc_vacia[][]=new String[0][0];
                for (int i = 0; i < 0; i++) {
                    for (int j = 0; j < 0; j++) {
                        table2.setValueAt(matrizc_vacia[i][j],i,j);
                    }
                }
                DefaultTableModel model_resul=(DefaultTableModel) table3.getModel();
                model_resul.setRowCount(0);
                model_resul.setColumnCount(0);
                String matrizd_vacia[][]=new String[0][0];
                for (int i = 0; i < 0; i++) {
                    for (int j = 0; j < 0; j++) {
                        table2.setValueAt(matrizd_vacia[i][j],i,j);
                    }
                }
            }
        });
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        ProyectoFinal_B2 obj=new ProyectoFinal_B2();
        obj.iniciar_proyecto_B2();
    }
    public void iniciar_proyecto_B2(){
        JFrame inicio=new JFrame("Multiplicacion Matriz");
        inicio.setContentPane(new Proyecto_final_B2().panel_principal);
        inicio.pack();
        inicio.setVisible(true);
    }
}

