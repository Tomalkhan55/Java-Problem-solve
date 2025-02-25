import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        int originalNum = num;
        int numOfDigit = 0;

        while (num >0 ) {
            num = num /10;
            numOfDigit++;
        }

        num = originalNum;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numOfDigit);
            num = num / 10;
        }

        if(sum == originalNum){
            System.out.println("the number is armstrong.");

        }else{
            System.out.println("not");
        }



        input.close();
    }
}
