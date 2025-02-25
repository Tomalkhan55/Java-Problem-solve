// Write a Java program that takes three integer inputs from the user and determines the largest number among them using the ternary operator.

// Solution:

import java.util.Scanner;

class LargestNumberTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // take user input
        System.out.print("Enter First Number: ");
        int a = input.nextInt();
        System.out.print("Enter Second Number: ");
        int b = input.nextInt();
        System.out.print("Enter third Number: ");
        int c = input.nextInt();

        //largest number check using if esle condition
        // if (a > b && a > c) {
        //     System.out.println(a);
        // } else if (b > a && b > c) {
        //     System.out.println(b);
        // } else {
        //     System.out.println(c);
        // }

        // use ternary operator
        int largestNumber = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("The Largest number is: " + largestNumber);
        input.close();
    }
}