package Day03Scanner;

import java.util.Scanner;

public class C02ScannerClass02 {

    public static void main(String[] args) {

    //Exapmle 2 :Ask user to enter the length and width of a rectagle,then print the are and preimeter on the console.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the width and length of the rectangle to calculate the preimeter and area...");
        double width = input.nextDouble();
        double length = input.nextDouble();

        System.out.println(width*length);
        System.out.println(2*(width+length));

    }
}
