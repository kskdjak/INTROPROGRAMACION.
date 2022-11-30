package EjerciciosFinales;

import java.util.Scanner;
/**
 *   Realice  un  programa  que  solicite  una
 * fecha  de  nacimiento  (años,  meses  y  días)  y
 * en base a la fecha y hora actual, realizar el
 * cálculo  de  la  edad  en:  años,  meses,  días,
 * horas.  Tener en cuenta años bisiestos.
 */
public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese su año de nacimiento: dd/mm/año");
        System.out.println("Ingrese el dia");
        int dia= teclado.nextInt();
        System.out.println("Ingrese el mes");
        int mes= teclado.nextInt();
        System.out.println("ingrese el año");
        int año= teclado.nextInt();
        int año_ac=2022;
        int mes_ac=11;
        int dia_ac=28;
        if (año>año_ac || mes>12 || dia>31){
            System.out.println("Datos ingresasdos incorrectos");
        }else{
            int años=año_ac-año;
            double meses=mes_ac-mes;
            double dias=dia_ac-dia;

            if(dias<0){
                meses=meses+1;
                dias=dias+30;
            }if (meses<0){
                años=años-1;
                meses=meses+12;
            }
            double año_mes=meses/12;
            double año_dia=dias/365;
            double horas=(años+año_dia+año_mes)*8760;
            int horass;
            horass=(int) Math.round(horas);
            int mesess;
            mesess=(int) Math.round(meses);
            int diass;
            diass=(int) Math.round(dias);
            System.out.println("Usted tiene\t"+años+"\taños\t"+mesess+"\tmeses\t"+diass+"\tdias\t"+horass+"\thoras\t");
        }

    }

}


