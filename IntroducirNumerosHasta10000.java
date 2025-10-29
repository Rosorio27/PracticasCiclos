import java.util.Scanner;
public class IntroducirNumerosHasta10000 {
    public static void main (String[] args){

        Scanner lr = new Scanner(System.in);
        int num;
        int suma=0;
        int contador=0;

        while (true){

            System.out.println("Ingresa un numero");
            num = lr.nextInt();

            contador++;
            suma += num;

            if(suma>=10000){
                break;
            }
        }
        int media = suma/contador;
        System.out.println("Total de la suma es: "+suma);
        System.out.println("La media de los numeros es: "+media);
    }
}
