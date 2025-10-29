public class TrianguloDesplazado {
    public static void main(String[] args){

        for (int i=0; i<5; i++){
            for (int a=0; a<5-i; a++){
                System.out.print(" ");
            }

            for (int x = 0; x<i; x++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
