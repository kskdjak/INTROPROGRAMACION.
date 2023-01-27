import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProyectoFinal_B2 {
    private JPanel panelprincipal;
    private JTextArea matriz1;
    private JTextArea txt_m2;
    private JButton Multi;
    private JTextArea lbl_resultado;
    private JTextField datosm1;
    private JTextField datosm2;
    private JTextArea matriz2;
    private JButton btn_m1;
    private JButton btn_m2;
    private JButton btn_limpiar;
    private JTextArea result;
    private JLabel columnas;

    public ProyectoFinal_B2() {
        //int matrizA[][]=new int[0][0];
        //int matrizB[][];
        int matrizC[][];
        int orden;
        final int[][][] matriz = new int[1][1][1];
        btn_m1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String filas_separados[]= datosm1.getText().split(" ");//´"1,2", "3,4"
                int num=0;
                int acu=0;
                System.out.println("filas de la matriz: " + filas_separados.length);
                for (int i = 0; i < filas_separados.length; i++) {
                    String col_separadas [] = filas_separados[i].split(",");//"1","2"
                   acu=col_separadas.length;
                }
                int matrizA[][]=new int[filas_separados.length][acu];
                System.out.println("numero de columnas de la fila = "+ acu);
                String numeros = datosm1.getText().replaceAll(" ", "\n").replaceAll(",", " ");
                matriz1.setText(numeros);
            }
        });
        btn_limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                datosm1.setText(" ");
                datosm2.setText(" ");
                matriz1.setText(" ");
                matriz2.setText(" ");
                datosm1.requestFocus();
            }
        });

        btn_m2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int acum=0;
                String colme = "";
                String filas_separados[]= datosm2.getText().split(" ");//´"1,2", "3,4"
                System.out.println(filas_separados[0]+" "+filas_separados[1]);
                System.out.println("filas de la matriz: " + filas_separados.length);
                for (int i = 0; i < filas_separados.length; i++) {
                    String col_separadas [] = filas_separados[i].split(",");//"1","2"
                    acum=col_separadas.length;
                    System.out.println(col_separadas[0]+" "+col_separadas[1]);
                }
                System.out.println("numero de columnas de la fila = "+ acum);
               String numeros = datosm2.getText().replaceAll(" ", "\n").replaceAll(",", " ");
               matriz2.setText(numeros);
                System.out.println(numeros);
                System.out.println();
                int matrizB[][] =new int[filas_separados.length][acum];
                for (int i = 0; i < matrizB.length; i++) {
                    for (int j = 0; j < matrizB[0].length; j++) {
                        System.out.print(matrizB[i][j]+" ");
                    }
                    System.out.println();
                }
            }
        });

        Multi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
