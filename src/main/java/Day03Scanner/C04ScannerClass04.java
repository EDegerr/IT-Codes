package Day03Scanner;

import java.util.Scanner;

public class C04ScannerClass04 {

    public static void main(String[] args) {

        //Example 4: Ask user to enter 5 digit integer.
        //Type code to print the sum of the first two and last two numbers

        Scanner input = new Scanner(System.in);

        System.out.println("Enter An Integer With 5 Digits");

        int num = input.nextInt();

        int firstTwo = num / 1000;

        //"%" is modulus operator,it returns the remainder in a division operation
        //If you need last digit in a n integer, use %10.
       int lastTwo = num % 100;

        System.out.println(firstTwo + "+" + lastTwo + "=" + (firstTwo + lastTwo));
    }
}
