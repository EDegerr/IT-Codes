package Day02DataTypes;

public class C01Variables {

    public static void main(String[] args) {
        byte stdAge = 13; //Data
        System.out.println(stdAge); // Code:Data and code shold be seperated.

        short numOfStdInHıghSchool = 3245;
        System.out.println(numOfStdInHıghSchool);

        int populationOfMiami = 1200000;
        System.out.println(populationOfMiami);

        //Use L at the end of the value when the value is out of the int rage
        long populationOfTheWorld = 7000000000L; //Even if we use long java wouldnt use long. Because long takes more memory than int.By placing L we will tell java that we need to used it long.
        System.out.println(populationOfTheWorld);

        //No need to use L at the end when the value is within the int rage.
        long populationOfChina = 1500000000; //Here Java accepted this code as int,this number is within the int range.If value is in the int range we don have to use "L"
        System.out.println(populationOfChina);

        float  shirtPrice = 23.99F;
        System.out.println(shirtPrice);

        double weightOfACell = 00000000000.12;
        System.out.println(weightOfACell);

        boolean isRetired = false;
        System.out.println(isRetired);

        char initial = 'B';
        System.out.println(initial);

        String stdName = "Astoria";
        System.out.println(stdName);

    }
}
