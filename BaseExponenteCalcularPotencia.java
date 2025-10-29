import java.util.Scanner;

public class BaseExponenteCalcularPotencia {
    public static void main (String[] args){

        Scanner lr = new Scanner(System.in);

        System.out.println("Bienvenidos a la caluladora de potencias");
        System.out.print("Ingrese un base");
        int base = lr.nextInt();
        System.out.println("Ingrese el exponente no negativo");
        int exponente = lr.nextInt();

        if (exponente<0) {
            System.out.println("Numero invalido, vuelva a ingresar");
            System.exit(0);
        }else{
            int calculo=1;
            for (int i = 0; i<exponente; i++ ){
                calculo *= base;
            }
            System.out.println("El resultado es: "+calculo);
        }
    }
}
