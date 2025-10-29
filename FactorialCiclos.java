import java.util.Scanner;

public class FactorialCiclos{
 public static void main (String[] args){

     Scanner lr = new Scanner(System.in);

     System.out.print("Ingrese un numero:");
     int num = lr.nextInt();
     int factorial=0;
     int factor = num;

     for (int i=num-1; i>0; i--){

        factorial =num *i;
        num = factorial;

        System.out.println(factorial);
     }

     System.out.println("El factorial de "+factor+" es: !"+factorial);

 }

}
