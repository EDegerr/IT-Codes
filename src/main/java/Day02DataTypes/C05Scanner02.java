package Day02DataTypes;

import java.time.LocalDate;
import java.util.Scanner;

public class C05Scanner02 {

    public static void main(String[] args) {

        //1.Step:Get user's name.

        //1.Step:Create a Scanner Class Obejct
        Scanner input = new Scanner(System.in);

        //2.Step:Give a message to user.
        System.out.println("Enter your name...");

        //3.Step:Get the data from user.
        String userName = input.nextLine();
        System.out.println(userName);

        System.out.println("Enter your parent's first name...");

        String parentFirstName = input.next();

        System.out.println(parentFirstName);
    }
}
