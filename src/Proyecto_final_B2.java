import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Proyecto_final_B2 {
    private JTextField txt_fila1;
    private JTextField txt_col1;
    private JTextField txt_fila2;
    private JTextField txt_col2;
    private JTable tbl_m1;
    private JTable tbl_m2;
    private JTable tbl_proce;
    private JTable tbl_result;
    private JButton btn_crear;
    private JButton btn_mul;
    private JPanel panel_principal;
    private JButton btn_Limpiar;
    private JButton btn_salir;

    public Proyecto_final_B2() {
        btn_mul.setEnabled(false);
        btn_crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (txt_col1.getText().equals(txt_fila2.getText())) {
                        int fila = Integer.valueOf(txt_fila1.getText());
                        int col = Integer.valueOf(txt_col1.getText());
                        DefaultTableModel moderl = (DefaultTableModel) tbl_m1.getModel();
                        moderl.setRowCount(fila);
                        moderl.setColumnCount(col);

                        int fila2 = Integer.valueOf(Proyecto_final_B2.this.txt_fila2.getText());
                        int col2 = Integer.valueOf(txt_col2.getText());
                        DefaultTableModel moderl1 = (DefaultTableModel) tbl_m2.getModel();
                        moderl1.setRowCount(fila2);
                        moderl1.setColumnCount(col2);
                        btn_mul.setEnabled(true);
                    }else {
                        JOptionPane.showMessageDialog(null,"Es imposible multiplicar entre si tales " +
                                "matrices, así que\n" + " el número de columnas de la matriz A no\n equivale al número de filas" +
                                " de la matriz B.");
                    }
                }catch (Exception error){
                    JOptionPane.showMessageDialog(null,"Porfavor verifique los datos");
                }

            }
        });
        btn_mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (txt_col1.getText().equals(txt_fila2.getText())){
                        int fila= Integer.valueOf(txt_fila1.getText());
                        int  col = Integer.valueOf(txt_col1.getText());
                        DefaultTableModel moderl= (DefaultTableModel) tbl_m1.getModel();
                        moderl.setRowCount(fila);
                        moderl.setColumnCount(col);

                        int fila2= Integer.valueOf(Proyecto_final_B2.this.txt_fila2.getText());
                        int  col2 = Integer.valueOf(txt_col2.getText());
                        DefaultTableModel moderl1= (DefaultTableModel) tbl_m2.getModel();
                        moderl1.setRowCount(fila2);
                        moderl1.setColumnCount(col2);
                        DefaultTableModel model3 = (DefaultTableModel) tbl_result.getModel();
                        int r, i, j;
                        int S=0;
                        String pro=" ";
                        int FilaA= Integer.parseInt(txt_fila1.getText());
                        int ColA= Integer.parseInt(txt_col1.getText());
                        int FilaB= Integer.parseInt(Proyecto_final_B2.this.txt_fila2.getText());
                        int ColB = Integer.parseInt(txt_col2.getText());
                        int matrizC[][]=new int [FilaA][ColB];
                        model3.setRowCount(FilaA);
                        model3.setColumnCount(ColB);
                        String matriz_proce[][]=new String[FilaA][ColB];
                        String suma="+";
                        for ( i = 0; i < FilaA; i++) {
                            for ( j = 0; j < ColB; j++) {
                                S=0;
                                pro=" ";
                                for ( r = 0; r < ColA; r++) {
                                    if (r==FilaB-1){
                                        suma="";
                                    }
                                    pro +=tbl_m1.getValueAt(i, r).toString() +"x"+ tbl_m2.getValueAt(r, j).toString()+ suma;
                                    S=S+Integer.parseInt(tbl_m1.getValueAt(i,r).toString())*Integer.parseInt(tbl_m2.getValueAt(r,j).toString());
                                        suma="+";
                                }
                                tbl_result.setValueAt(S+"",i,j);
                                matriz_proce[i][j]=pro;
                            }
                        }
                        DefaultTableModel proced=(DefaultTableModel) tbl_proce.getModel();
                        proced.setRowCount(matriz_proce.length);
                        proced.setColumnCount(matriz_proce[0].length);
                        for (int k = 0; k < matriz_proce.length; k++) {
                            for (int l = 0; l < matriz_proce[0].length; l++) {
                                tbl_proce.setValueAt(matriz_proce[k][l],k,l);
                            }
                        }
                    }
                }catch (Exception error_let){
                    JOptionPane.showMessageDialog(null,"Porfavor ingrese solo numeros");
                }

            }
        });
        btn_Limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn_mul.setEnabled(false);
                txt_fila1.setText("");
                txt_col1.setText("");
                txt_fila2.setText("");
                txt_col2.setText("");
                DefaultTableModel model1=(DefaultTableModel) tbl_m2.getModel();
                model1.setRowCount(0);
                model1.setColumnCount(0);
                String matriza_vacia[][]=new String[0][0];
                for (int i = 0; i < 0; i++) {
                    for (int j = 0; j < 0; j++) {
                        tbl_m2.setValueAt(matriza_vacia[i][j],i,j);
                    }
                }
                DefaultTableModel model2=(DefaultTableModel) tbl_m1.getModel();
                model2.setRowCount(0);
                model2.setColumnCount(0);
                String matrizb_vacia[][]=new String[0][0];
                for (int i = 0; i < 0; i++) {
                    for (int j = 0; j < 0; j++) {
                        tbl_m2.setValueAt(matrizb_vacia[i][j],i,j);
                    }
                }
                DefaultTableModel model_proce=(DefaultTableModel) tbl_proce.getModel();
                model_proce.setRowCount(0);
                model_proce.setColumnCount(0);
                String matrizc_vacia[][]=new String[0][0];
                for (int i = 0; i < 0; i++) {
                    for (int j = 0; j < 0; j++) {
                        tbl_m2.setValueAt(matrizc_vacia[i][j],i,j);
                    }
                }
                DefaultTableModel model_resul=(DefaultTableModel) tbl_result.getModel();
                model_resul.setRowCount(0);
                model_resul.setColumnCount(0);
                String matrizd_vacia[][]=new String[0][0];
                for (int i = 0; i < 0; i++) {
                    for (int j = 0; j < 0; j++) {
                        tbl_m2.setValueAt(matrizd_vacia[i][j],i,j);
                    }
                }
            }
        });
        btn_salir.addActionListener(new ActionListener() {
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

