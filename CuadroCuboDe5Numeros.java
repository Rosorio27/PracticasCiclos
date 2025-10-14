import java.util.Scanner;

public class CuadroCuboDe5Numeros {
    public static void main (String[] args){

        Scanner lr = new Scanner(System.in);
        int cuadrado=0;
        int cubo=0;
        int i;

       System.out.println("Ingrese un numero:");
       int num = lr.nextInt();

       System.out.println("Numero\tCuadrado\tCubo");
        for (i=num; i<=num+4; i++){

            cuadrado = i*i;
            cubo = i*i*i;
            System.out.printf("\t%d\t\t%d\t\t%d\n",i,cuadrado,cubo);

        }
    }
}
