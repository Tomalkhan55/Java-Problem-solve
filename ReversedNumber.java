import java.util.Scanner;

public class ReversedNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int reversed = 0;

        while (number>0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number/10;
        }

        System.out.println("The reversed number is: " + reversed);

        input.close();
    }
}
