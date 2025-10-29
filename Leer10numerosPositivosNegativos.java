import java.util.Scanner;

public class Leer10numerosPositivosNegativos {
    public static void main (String[] args){

        Scanner lr = new Scanner(System.in);

        System.out.println("Ingrese 10 numeros positivos o negativos");

        int positivos=0;
        int negativos=0;

        for(int i = 0; i <10; i++){
            System.out.println("Ingrese un numero: ");
            double num = lr.nextDouble();

            if (num >0){
                positivos++;
            }
            if (num<0){
                 negativos++;
            }
        }

        System.out.println("Numeros positivos ingresados :"+positivos);
        System.out.println("Numeros negativos ingresados :"+positivos);
    }
}
