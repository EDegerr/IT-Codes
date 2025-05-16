package Day06StringManipulations;

public class C01StringManipulation {

    public static void main(String[] args) {

        //Example 1: Make all digits expect last 4 invisible by using '*'
        //          1111 2222 3333 1234 ==> **** **** **** 1234

        String ccNum = "1111 2222 3333 1234";

        String first = ccNum.substring(0,15).replaceAll("[0-9]","*");
        System.out.println(first);

        String last = ccNum.substring(15);
        System.out.println(last);

        String result = first + last;
        System.out.println(result);

        String result1 = first.concat(last);
        System.out.println(result1);

        //Example 2: Count the number of characters different from space in a string
        //          Tom Hanks was born in 1975

        String ex2 = "Tom Hanks Was Born In 1975.";
        int numOfCharDifferentFromSpace = ex2.replace(" ","").length();
        System.out.println(numOfCharDifferentFromSpace);


        /*
            Note 1:
            "concat()" method is for joining two Strings like "+" sign

            Note 2:


         */
    }

}
