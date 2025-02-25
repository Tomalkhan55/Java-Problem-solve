import java.util.Scanner;

public class PerfectNumber {

    public static boolean isPerfect(int number) {
        if (number == 1)
            return false;

        int sum = 1;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        if(sum == number)
            return true;
        
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if (isPerfect(number)) {
            System.out.println(number + " is perfect number.");
        }else{
            System.out.println(number + " is not perfect number.");
        }

        input.close();

    }
}
