import java.util.Scanner;

public class ContarDigitosPares {
    public static void main (String[] args){

        Scanner lr= new Scanner(System.in);

        System.out.println("Ingrese un numero ");
        long num = lr.nextInt();
        long invertido=0;
        long modulo=0;
        long suma=0;

        while (num !=0){
            modulo = num % 10;
            num = num /10;
            invertido = invertido *10 + modulo;

            if( modulo % 2 ==0){
                suma += modulo;
                System.out.println("Digitos pares: "+modulo);

            }

        }
        System.out.println("La suma de digitos pares es: "+suma);

    }
}
