package Day05TernaryOperations;

public class C02NestedTernary {

    public static void main(String[] args) {

        //Example 5: Type code to check if an integer is odd and if it is even it shpuld be divisible by 3
        //      7==>Odd     12==>Even==>Divisible by 3      14==>Even==>Not divisible by 3
        int m = 12;
        String result1 = m%2!=0 ? "Odd" : m%3==0 ? "Even and divisible by 3" : "Even but not divisible by 3";
        System.out.println(result1);

        //Example 6:Tyoe Java code by using nested ternary.
        //Write a program to check if a year is leap year or not.
        //If the year is divisible by 1100 than it mus be divisible by 400.
        //If a year is not divisible by 100 than it must be divisible b 4.

        int year = 1996;
        String result2 = (year%100==0) ? (year%400==0 ? "Leap" : "Not Leap") : (year%4==0 ? "Leap" : "Not Leap");
        System.out.println(result2);

    }

}
