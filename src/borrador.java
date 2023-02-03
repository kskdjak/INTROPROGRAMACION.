import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

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
                try {
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
                    }
                }catch (Exception eror){
                    JOptionPane.showMessageDialog(null,"Porfavor ingrese solo numeros");
                }

            }
        });
        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
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
                                    String suma="+";
                                    if (r==ColB-1){
                                        suma="";
                                    }
                                    pro =pro+tbl_m1.getValueAt(i, r).toString() +"x"+ table2.getValueAt(r, j).toString()+suma;
                                    S=S+Integer.parseInt(tbl_m1.getValueAt(i,r).toString())*Integer.parseInt(table2.getValueAt(r,j).toString());
                                    if (r==0){
                                        suma="+";
                                    }
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
                }catch (Exception error){
                    JOptionPane.showMessageDialog(null,"Error corrigalo");
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
