import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args){

        Scanner lr = new Scanner(System.in);

        System.out.println("Ingresa un numero para calcular");
        int num = lr.nextInt();

        for (int i=2; i<num; i++){

            if(num % i ==0){
                System.out.println("No es numero primo, tiene divisor:"+i);
                break; 
            }else{
                System.out.println("Es un numero primo");
                break;
            }
        }
    }
}
