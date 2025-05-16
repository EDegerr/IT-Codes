package Day03Scanner;

import java.util.Scanner;

public class C05ScannerClass05 {

    public static void main(String[] args) {

        //Example 5: Get mile from user then convert it to kilometer.
        //         1 mile is 1.6 kms

        Scanner input = new Scanner(System.in);

        System.out.println("Enter A Mile Value To Convert To Kilometer...");

        double mile = input.nextDouble();

        System.out.println(mile + "mile is" + mile*1.6 + "Km");
    }
}
