import java.util.Scanner;

public class PidaNumeroYdigImpares {
    public static void main(String[] args){

        Scanner lr = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        System.out.println("Presione un numero negativo si desea salir");
        int num = lr.nextInt();

        int contador=0;
        int contadorImpares=0;
        int sumaImpares=0;
        int mayor=0;
        int aux=0;

        if(num>0){
            while (num >0){
                contador++;
                aux = num;

                if (num % 2 !=0){
                    sumaImpares += num;
                    contadorImpares++;
                }

                System.out.println("Ingrese otro numero");
                System.out.println("Presione un numero negativo si desea salir");
                num = lr.nextInt();

                if (num % 2 == 0 ){
                    if ( num > aux){
                        mayor =num;
                    }else{
                        mayor = aux;
                    }
                }
            }
            System.out.println("Numeros introducidos son: "+contador);
            System.out.println("La media de impares es: "+sumaImpares/contadorImpares);
            System.out.println("El mayor de los numeros pares es: "+mayor);
        }else{
            System.exit(0);
        }
    }
}
