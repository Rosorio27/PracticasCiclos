import java.util.Scanner;

public class UnNumeroAlreves {
    public static void main (String[] args){

        Scanner lr = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num = lr.nextInt();
        int contador=0;
        int aux= num;

        while (num != 0){
            num=num/10;
            contador++;
        }

        for (int i=0; i<contador; i++){

            int numNuevo = aux / 10;
            int residuo = aux % 10;

        }
    }
}
