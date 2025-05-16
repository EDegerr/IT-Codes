package Day02DataTypes;

public class C02TypeCasting {
    public static void main(String[] args) {

        //Type Casting:If you assign a a value of a primitive data type,
        //it is called typecasting.

        //To put small data type into large data type is easy and java will do it automatically
        //The name of this process is "Auto Widening"
        byte myAge = 21;
        int age = myAge;

        //To put large data type into small data type has risk that is why java does not do it automatically
        //You have to type small data type in front of the name of the large data explicitly.
        //Then name of this process is "Explicit Narrowing"
        long value1 =3400;
        short value2 = (short)value1;

        //Note:
        int numOfStd = 12;
        int amountOfMoney = 500;

        //If all values are int in an mathematical operation, the result will be int as well.
        //If the result is decimal in math, java converts it to int by removing decimal part of the result.
        System.out.println(amountOfMoney / numOfStd); //41.6666....

        //Note 2:
        int numOfStudents = 12;
        float moneyAmount = 500.0F;

        //If you use different data types ina mathemetical opreation, the result will be in the largest data type
        //you used in the matemathical operation.
        System.out.println(moneyAmount / numOfStudents); //41.66666666...

    }



}

