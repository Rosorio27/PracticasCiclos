public class UnaUasteriscos {
    public static void main (String[] args){

        int altura = 5;

for (int i =1; i<=altura; i++){
    for (int a=0; a<altura; a++){
        if (a==0 && i<=4 || a==altura-1 && i<=4 || i==altura && a>0 && a<4){
            System.out.print(" * ");
        }else{
            System.out.print("   ");
        }
    }
    System.out.println();
}

    }
}
