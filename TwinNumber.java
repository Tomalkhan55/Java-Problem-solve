import java.util.Scanner;

public class TwinNumber {
    public static boolean isPrime(int num){
        if(num <= 1)
            return false;
        

        for(int i = 2; i < num; i++){
            if (num % i ==0) {
                return false;
            }
        }
        return true;

        
    }

    public static boolean isTwinPrime(int num1, int num2){

        return(isPrime(num1) && isPrime(num2) && Math.abs(num1 - num2) == 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter second number: ");
        int num2 = input.nextInt();

        if (isTwinPrime(num1, num2)) {
            System.out.println("twin prime");
        }else{
            System.out.println("not twin prime");
        }

        input.close();
    }
}
