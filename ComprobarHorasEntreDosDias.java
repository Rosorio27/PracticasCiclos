import java.util.Scanner;

public class ComprobarHorasEntreDosDias {
    public static void main (String[] args){

        Scanner lr = new Scanner(System.in);
        System.out.println("Ingrese el primer dia entre [1] / [7]");
        int primerdia = lr.nextInt();
        System.out.println("Ingrese la hora del primer dia en enteros");
        int horasPrimerDia = lr.nextInt();

        System.out.println("Ingrese el segundo dia entre [1] / [7]");
        int segundodia = lr.nextInt();
        System.out.println("Ingrese la hora del primer dia en enteros");
        int horasSegundoDia = lr.nextInt();
        int respuesta=0;
        int horasDeDias=0;

        if (segundodia< primerdia){
            System.out.println("Saliendo del sistema");
            System.exit(0);
        }else{

            for (int i = primerdia; i < segundodia; i++){
                horasDeDias = horasDeDias + 24;
                System.out.println(horasDeDias);
                respuesta = (horasDeDias - horasPrimerDia) + horasSegundoDia;
            }

      System.out.println("El total de horas que trascurrieron fueron: "+respuesta);

            }
        }
    }

