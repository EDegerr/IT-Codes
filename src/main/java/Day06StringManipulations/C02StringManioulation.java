package Day06StringManipulations;

public class C02StringManioulation {

    public static void main(String[] args) {

        //Example 3 : Count the unique characters in a string
        //      "Hello"--> Heo

        String s = "Hello";

       int indexOfH = s.indexOf("H");
        System.out.println(indexOfH);

        int lastIndexOfH = s.lastIndexOf("H");
        System.out.println(lastIndexOfH);

        int indexOfE = s.indexOf("e");
        System.out.println(indexOfE);

        int lastIndexOfE = s.lastIndexOf("e");
        System.out.println(lastIndexOfE);

        int indexOfL = s.indexOf("l");
        System.out.println(indexOfL);

        int lastIndexOfL = s.lastIndexOf("l");
        System.out.println(lastIndexOfL);

        int indexOfO = s.indexOf("o");
        System.out.println(indexOfO);

        int lastIndexOfO = s.lastIndexOf("o");
        System.out.println(lastIndexOfO);

        if (indexOfH==lastIndexOfH){
            System.out.print("H");
        }

        if (indexOfE==lastIndexOfE){
            System.out.print("E");
        }

        if (indexOfL==lastIndexOfL){
            System.out.print("L");
        }

        if (indexOfO==lastIndexOfO){
            System.out.print("O");
        }

    }
}
