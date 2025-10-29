public class TrianguloRectanguloSinRelleno {
    public static void main (String[] args){

        for (int i=0; i<7; i++){
            for (int a=0; a<i; a++){
                if ( a==0 || a==i-1 || i==7-1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
