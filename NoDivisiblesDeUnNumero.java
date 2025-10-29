import java.util.Scanner;

public class NoDivisiblesDeUnNumero {

    public static void main (String[] args){

            Scanner lr = new Scanner(System.in);
            System.out.println("INGRESE UN NUMERO ");
            int num = lr.nextInt();

            System.out.println("Ingrese un numero para comprobar divisibilidad: ");
            int divisor = lr.nextInt();

            for (int i = 1; i<num; i++){

                if (i % divisor !=0){
                    System.out.println(i);
                }
            }
    }
}
