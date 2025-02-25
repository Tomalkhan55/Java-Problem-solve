import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int N = input.nextInt();
        int num1 = 0, num2 = 1;
        for (int i = 0; i < N; i++) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;

            num1 = num2;
            num2 = num3;
        }

        input.close();
    }
}
