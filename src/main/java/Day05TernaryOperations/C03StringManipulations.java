package Day05TernaryOperations;

public class C03StringManipulations {

    public static void main(String[] args) {

        //Example 1:Count the alphabetical characters in a given String
        //Tom12 Hanks!... ==>8

        //Remove non alphabetical characters // Count the remaining characters.

        //Non-alphabetical charaters are a group of data

        //To work witth a group of data we use "REGULAR EXPRESSIONS"

        /*

            /Upper case letters [A-Z]
            /Lower case letters [a-z]
            /All letters [A-Za-z]
            /All digits [0-9]
            /letters from m to v [m-v]
            /Regex for a,b,e,d,g,z [abegdz]

            // All characters different from uppercase letters[^A-Z]
            // All characters different from lowercase letters [^a-z]
            // All characters different from all letters [^A-Za-z]
            // All characters different from all digits [^0-9]
            // All symbols different from all letters and digits [^A-Za-z0-9]

            // All punctuation marks:\p{Punct}

         */

        String s1 = "Tom12 Hanks!...";

        int numOfChar = s1.replaceAll("[ ^A-Za-z ]" ,"").length();

        System.out.println(numOfChar);
    }

}