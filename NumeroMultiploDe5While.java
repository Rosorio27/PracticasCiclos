
public class NumeroMultiploDe5While {
    public static void main(String[] args){
        int num =0;
        System.out.println("Multiplos de 5 del 0-100");
        while (num <= 100){
            if(num % 5 ==0){
                System.out.println("El valor es: "+num);
            }
            num+=5;
        }
    }
}
