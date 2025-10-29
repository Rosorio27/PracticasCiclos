import java.util.Scanner;

public class MultiplosDe3 {
    public static void main (String[] args){

    Scanner lr = new Scanner(System.in);

    System.out.println("Ingrese un numero para comprobar si es multiplo de 3");
    int num = lr.nextInt();
    int i=0;
    int contador=0;
    int suma=0;

    for (i=1; i<num; i++){
        if ( i % 3 ==0){
            System.out.println("numero "+i+" Es multiplo de 3");
            contador++;
            suma += i;
        }
    }

    System.out.println("Conteo de los numeros es: "+contador);
    System.out.println("Conteo de los numeros es: "+suma);
    }
}
