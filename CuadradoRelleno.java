public class CuadradoRelleno {
    public static void main (String[] args){
        int altura=5;
        int anchura=5;

        for (int i=0; i<altura; i++){
            for(int z=0; z<anchura; z++){

                if (i==0 || i==altura-1 || z==0 || z==anchura-1 ){
                    System.out.print(" * ");
                } else{
                    System.out.print("   ");
                }
            }
            System.out.print("\n");
            }
        }
    }
