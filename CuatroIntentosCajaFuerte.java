import java.util.Scanner;

public class CuatroIntentosCajaFuerte {
    public static void main(String[] args){

        int intentos= 4;
        int codigo= 1234;
        Scanner lr = new Scanner(System.in);

        do{
            System.out.println("Ingrese el codigo");
            int contra = lr.nextInt();

            if (contra >=1000 && contra <=9999){
                if (contra == codigo){
                    System.out.println("Has abierto la caja fuerte");
                }else {
                    System.out.println("Contraseña incorrecta");
                    intentos -=1;
                }
            }else{
                System.out.println("Ingrese contraseña valida");
                intentos -= 1;
            }
        }while(intentos !=0);
    }
}
