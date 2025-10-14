import java.util.Scanner;

public class MediaConBandera {
    public static void main (String[] args) {

        Scanner lr = new Scanner(System.in);
        int num;
        int contador=0;
        int suma=0;

        do {
            System.out.println("Bienvenido ingrese los datos: ");
            System.out.println("Escriba [-1] para salir");
            num = lr.nextInt();

            suma += num;
            contador += 1;

        } while (num != -1);

        int media = suma / contador;
        System.out.println("La suma de las notas fue: "+suma);
        System.out.println("El total de ingresos fueron: "+contador);
        System.out.println("La media total es: "+media);

    }
}
