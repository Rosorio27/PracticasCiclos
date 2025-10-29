import java.util.Scanner;

public class SumarLosSiguiente100numeros {
    public static void main (String[] args){

        Scanner lr = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = lr.nextInt();

        if (num<0){
            System.out.println("Saliendo de sistema");
            System.exit(0);
        }

        int suma=0;
        int i;

        for (i=num+1; i<=num+100; i++){
            suma +=i;
        }
        System.out.println("El numero "+num+" mas 100 mas es: "+suma);
    }
}
