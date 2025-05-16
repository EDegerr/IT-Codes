package Day02DataTypes;

import java.util.Scanner;

public class C04Scanner01 {

    //Scanner Class:Its used to get data from user.

    public static void main(String[] args) {

       //Tobe aable to get data from user follow the steps.

       //1.Step:Create a Scanner Class first
        Scanner input = new Scanner(System.in);

        //2.Step:Give a message to the user.
        System.out.println("Enter your age...");

        //3.Step:Get the data user entered.
        int userAge = input.nextInt();

        System.out.println(userAge);

    }

}
