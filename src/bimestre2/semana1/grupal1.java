package bimestre2.semana1;

import java.util.Scanner;

public class grupal1 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int interruptor=1;
        while (interruptor==1){
            System.out.println("Digite 1 si desea hacer la coversion de MB a KB");
            System.out.println("Digite 2 si desea hacer la coversion de kB a MB");
            System.out.println("Digite 3 si desea hacer la coversion de MB a Bits");
            System.out.println("Digite 4 para salir");
            int opcion= teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Se realiza la coversion de MB a KB");
                    System.out.println("Ingrese el valor de MB");
                    double MB= teclado.nextDouble();
                    double conversion1=MB*1024;
                    System.out.println("La conversion a KB es: "+conversion1);
                    break;
                case 2:
                    System.out.println("Se realiza la coversion de KB a MB");
                    System.out.println("Ingrese el valor de KB");
                    double KB= teclado.nextDouble();
                    double conversion2=KB/1024;
                    System.out.println("La conversion a KB es: "+conversion2);
                    break;
                case 3:
                    System.out.println("Se realiza la coversion de MB a Bits");
                    System.out.println("Ingrese el valor de MB");
                    double MB2= teclado.nextDouble();
                    double conversion3=MB2*1024*1024*8;
                    System.out.println("La conversion a KB es: "+conversion3);
                    break;
                case 4:
                    System.out.println("Salir");
                     interruptor=0;
                     break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }
    }
}
