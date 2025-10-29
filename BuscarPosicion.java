import java.util.Scanner;

public class BuscarPosicion {
    public static void main (String[] args){

        Scanner lr = new Scanner(System.in);
        System.out.println("ingresa un numero ");
        int num = lr.nextInt();

        System.out.println("Ingresa el digito que queres buscar");
        int digito = lr.nextInt();
        int contador=1;
        int segundoNumero=0;

        boolean esDigito = false;

        while (num!=0){

            int nuevo = num % 10;
            num= num /10;
            segundoNumero = (segundoNumero*10)+nuevo;
        }


        while (segundoNumero !=0){
            int nuevoNumero = segundoNumero % 10;
            segundoNumero = segundoNumero /10;

            if (nuevoNumero == digito){
                esDigito= true;
                System.out.println("Este numero esta en la posicion "+contador);
            }
            contador++;
        }
    }
}
