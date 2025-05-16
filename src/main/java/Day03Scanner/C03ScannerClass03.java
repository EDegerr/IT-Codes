package Day03Scanner;

import java.util.Scanner;

public class C03ScannerClass03 {

    public static void main(String[] args) {

        //Example 3:Ask user to enter ; Full name Age Height Martial Status
        // Then print them on the console.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Name And Surname...");
        String name = input.nextLine();

        System.out.println("Enter Your Age...");
        byte age = input.nextByte();

        System.out.println("Enter Your Height In CMs...");
        float height = input.nextFloat();

        System.out.println("Enter Your Martial Status");
        String martialStatus = input.next();

        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Height:" + height);
        System.out.println("Martial Status:" + martialStatus);

    }
}
