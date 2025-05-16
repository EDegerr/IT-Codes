package Day04Statements;

import java.util.Scanner;

public class C08SwitchStatements1 {

    public static void main(String[] args) {

        //Example 1:
        //Ask user to type a day number than print the corresponding day to console

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day number...");
        int dayNum = input.nextInt();

        //Way 1

        if(dayNum==1){
            System.out.println("Monday");
        } else if (dayNum==2) {
            System.out.println("Tuesday");
        } else if (dayNum==3) {
            System.out.println("Wednesday");
        } else if (dayNum==4) {
            System.out.println("Thursday");
        } else if (dayNum == 5) {
            System.out.println("Friday");
        } else if (dayNum==6) {
            System.out.println("Saturday");
        } else if (dayNum==7) {
            System.out.println("Sunday");
        }else{
            System.out.println("Invalid number...");
        }

        //Way 2

        switch (dayNum){

            case 1:
                System.out.println("Monday.");
                break;

            case 2:
                System.out.println("Tuesday.");
                break;

            case 3:
                System.out.println("Wednwsday.");
                break;

            case 4:
                System.out.println("Thursday.");
                break;

            case 5:
                System.out.println("Friday.");
                break;

            case 6:
                System.out.println("Satruday.");
                break;

            case 7:
                System.out.println("Sunday.");
                break;

            default:
                System.out.println("Invalid Number.");
        }

    }

}
