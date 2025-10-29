import java.util.Scanner;

public class PiramideDeNumeros {
    public static void main (String[] args){
        Scanner lr = new Scanner(System.in);
        System.out.println("Ingresa la altura de la piramide");
        int altura = lr.nextInt();

        for(int i = 0; i<altura; i++){

            for (int a=1; a<altura-i; a++){
                System.out.print(" ");
            }

            for (int x=1; x<=i; x++){
                System.out.print(x);
            }

            for (int b=i-1; b>=1; b--){
                System.out.print(b);
            }

            System.out.println();
        }
    }
}