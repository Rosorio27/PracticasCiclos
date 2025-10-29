import java.time.Year;
import java.util.Scanner;

public class Piramide1caracterHueca {
    public static void main (String[] args){
        Scanner lr = new Scanner(System.in);
        System.out.println("Ingresa la altura de la piramide");
        int altura = lr.nextInt();

        System.out.println("Ingresa un caracter para imprimir");
        char caracter = lr.next().charAt(0);

        for(int i = 0; i<altura; i++){
            for (int a=1; a<altura-i; a++){
                System.out.print(" ");
            }

            for (int x=0; x<(i*2)+1; x++){
                System.out.print(caracter);
                for (int y=2; y<x; y++){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
