// Palindrome Number

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;//1
            reversedNum = reversedNum * 10 + digit;//12
            num = num /10;
        }

        if(originalNum == reversedNum){
            System.out.println("The number is palindrom.");
        }else{
            System.out.println("The number is not palindrom.");
        }

        input.close();

    }
}
