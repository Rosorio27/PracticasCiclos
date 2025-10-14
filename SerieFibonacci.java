import java.util.Scanner;

public class SerieFibonacci {
    public static void main (String[] args){

        Scanner lr = new Scanner(System.in);
        System.out.println("Ingresa un numero para controlar la serie de numeros");
        int num = lr.nextInt();
        int p=0;
        int s=1;
        System.out.println(p);
        System.out.println(s);

        for (int i=0; i<=num; i++){
           int nuevo  = p+s;
           p=s;
           s=nuevo;

            System.out.println(nuevo);
        }
    }
}
