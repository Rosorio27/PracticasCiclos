import java.util.Scanner;

public class NumerosPrimosEntre2_100 {
    public  static void main (String[] args){

        for (int i=2; i<=13; i++ ){
            int numPrimo;
            int numActual;

                for (int x=i; x>=1; x--){
                    numActual = i;
                    numPrimo = i /x;

                    if (numPrimo % x ==0 || numPrimo % x == numActual){
                        System.out.println("Es numero primo: "+numPrimo);
                    }
                }
        }
    }
}
