import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class borrador {
    private JPanel panelrpincipal;
    private JTextField txt_fil2;
    private JTextField txt_col2;
    private JButton crear;
    private JTable tbl_m1;
    private JTable table2;
    private JTable table3;
    private JButton mul;
    private JTextField fila1;
    private JTextField col1;
    private JLabel cordena;
    private JTable procedi;

    public borrador() {

        crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (col1.getText().equals(txt_fil2.getText())){
                    int fila= Integer.valueOf(fila1.getText());
                    int  col = Integer.valueOf(col1.getText());
                    DefaultTableModel moderl= (DefaultTableModel) tbl_m1.getModel();
                    moderl.setRowCount(fila);
                    moderl.setColumnCount(col);
                    int matriz [][]= new int[fila][col];
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[0].length; j++) {
                            tbl_m1.setValueAt(matriz[i][j],i,j);
                            System.out.println(matriz[i][j]);
                        }

                    }
                    int fila2= Integer.valueOf(txt_fil2.getText());
                    int  col2 = Integer.valueOf(txt_col2.getText());
                    DefaultTableModel moderl1= (DefaultTableModel) table2.getModel();
                    moderl1.setRowCount(fila2);
                    moderl1.setColumnCount(col2);
                    int matrizB [][]= new int[fila2][col2];
                    for (int i = 0; i < matrizB.length; i++) {
                        for (int j = 0; j < matrizB[0].length; j++) {
                            table2.setValueAt(matrizB[i][j],i,j);
                        }
                        System.out.println(table2);
                    }
                }else {
                    cordena.setText("filas y columnas erroneas");
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
                    int matrizC[][]=new int [ColA][FilaB];
                    model3.setRowCount(ColA);
                    model3.setColumnCount(FilaB);
                    String matriz_proce[][]=new String[ColA][FilaB];
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
    }
    public static void main(String[] args) {
        JFrame inicio=new JFrame("Multiplicacion Matriz");
        inicio.setContentPane(new borrador().panelrpincipal);
        inicio.pack();
        inicio.setVisible(true);
    }
}
