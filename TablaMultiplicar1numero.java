import java.util.Scanner;

public class TablaMultiplicar1numero {
    public static void main(String[] args) {

        Scanner lr = new Scanner(System.in);
        System.out.println("Ingrese un numero para generar tabla de multiplicar");
        int num = lr.nextInt();

        int multiplicador = 1;

        while (multiplicador <= 10) {

            System.out.printf("%d x %d = %d", num, multiplicador, num * multiplicador);

            multiplicador+=1;

            System.out.print("\n");
        }
    }
}