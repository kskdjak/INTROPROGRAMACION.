package repeticion_while;

/**
 * Programa para realizar la suma de los numero pares que esxisten del 1 al 100
 */
public class SumaPares {
    public static void main(String[] args) {
        System.out.println("Suma de numeros pares");
        int suma_pares=0;
        int num=1;
        while (num<=100){
            if (num%2==0){
                suma_pares=suma_pares+num;
            }
            num=num+1;
        }
        System.out.println("La suma de los numeros pares es: "+suma_pares);
    }
}
