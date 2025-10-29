import java.util.Scanner;

public class NumerosEntre2numeros {
    public static void main (String[] args){

        Scanner lr = new Scanner(System.in);

        System.out.println("Ingrese 2 numeros que sean distintos");
        System.out.print("Numero 1: " );
        int num1 = lr.nextInt();
        System.out.print("Numero 2: " );
        int num2 = lr.nextInt();

        if (num1 == num2){
            System.out.println("Fin del ejercicio");
            System.exit(0);
        }else if (num1<num2){
            for (int i =num1; i<=num2; i+=7){
                System.out.println(i);
            }
        }else{
            for (int i =num2; i<=num1; i+=7){
                System.out.println(i);
            }
        }
    }
}
