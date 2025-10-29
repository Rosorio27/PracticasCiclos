import java.util.Scanner;

public class LetraL {
    public static void main (String[] args){

        Scanner lr = new Scanner(System.in);
        int altura= 5;

        for (int i = 0; i<altura; i++){
            for (int a =0; a<altura; a++) {
                if (a == 0 || i==altura-1 && a<altura/2+1 ) {
                    System.out.print(" * ");
                }else{
                    System.out.print("  ");
                }
            }
System.out.println();
        }
    }
}
