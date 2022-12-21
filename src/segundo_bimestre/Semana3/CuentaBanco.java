package segundo_bimestre.Semana3;

import java.util.Scanner;

public class CuentaBanco {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String socio[]={"Pablo","Ivan","Richar","Andy","David"};
        int cuenta[]={1234,4567,8910,1112,1214};
        int saldo[]={1200,5000,3000,2500,10000};
        int aux=0;
        int interruptor=1;
        for (int indice = 0; indice <= cuenta.length; indice++) {
            System.out.println("Ingrese el numero de cuenta que desea buscar");
           int cuent= teclado.nextInt();
            if (cuenta[indice]==cuent){
                System.out.println("Ingrese las opciones que desea");
                System.out.println("Ingrese 1 si desea hacer un deposito");
                System.out.println("Ingrese 2 si desea hacer un retiro");
                System.out.println("Ingrese 3 si desea hacer una consulta de saldo");
                System.out.println("Ingrese 4 si desea salir");
                int opcion= teclado.nextInt();
                while (interruptor==1){
                    switch (opcion){
                        case 1:
                            System.out.println("Va a realizar un deposito");
                            System.out.println("Ingrese la cantidad de deposito");
                            int deposito= teclado.nextInt();
                            if (cuenta[indice]>0){
                                int depo=saldo[indice]+deposito;
                                System.out.println("Su saldo actual es: "+depo);
                            }
                            break;
                        case 2:
                            System.out.println("Va a realizar un retiro");
                            System.out.println("Ingrese la cantidad a retirar");
                            int retiro= teclado.nextInt();
                            if (retiro<saldo[indice]){
                                int ret=saldo[indice]-retiro;
                                System.out.println("Su saldo actual es: "+ret);
                            }

                            break;
                        case 3:
                            System.out.println("Consulta de saldo");
                            System.out.println("Su saldo es: "+saldo[indice]);
                            System.out.println("Nombre: "+socio[indice]);
                            break;
                        case 4:
                            System.out.println("Gracias por preferirnos");
                            break;
                    }
                }

            }
        }

    }
}
