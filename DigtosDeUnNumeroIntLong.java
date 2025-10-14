import java.util.Scanner;

public class DigtosDeUnNumeroIntLong {
    public static void main (String[] args){

        Scanner lr = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        long num = lr.nextLong();
        int contador=0;


    while (num !=0){
        num = num /10;
        contador +=1;
    }

    System.out.println("Los digitos de este numero son: " +contador);
    }
}
