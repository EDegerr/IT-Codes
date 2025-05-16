package Day05TernaryOperations;

public class c01TernaryOperator {

    // Or Operator Here --->  ||

    public static void main(String[] args) {

        //Example 1: Type a code to tell if an integer is even or odd

        int m = -23;

        //Condition     ?   Code 1  :   Code 2;
        String resultM = m % 2 == 0 ? "Even" : "Odd";
        System.out.println(resultM);

        //Example 2:Type code to check if the integer has 3 numbers or not

        int e = 004;

        String resultE = e > 99 && e < 1000 ? e + " has three numbers" : e + " doesnt have 3 numbers";
        System.out.println(resultE);


        //Example 3:Type code to calculate the absolute value of a number
        //      5-->5       0-->0       -3~~~>-3*1=3
        double c = 0;
        double result3 = c < 0 ? -1 * c : c;
        System.out.print(result3);

        //Example 4:Type code to find the multiplation of two integers,if the signs are same.
        //      Give a message like "I dont know how to multiply" if signs are different.
        //      5 and 4 = 5*4       -3 and -2 = -3*-2

        int a =5;
        int b =4;
        Object resultMalak = (a<0 && b<0) || (a>0 && b>0) ?  a*b : "I don t know multiply";
        System.out.println(resultMalak);
    }
}
