package Day02DataTypes;

public class C03Wrapper {

    public static void main(String[] args) {

        //Wrapper Classes:Java created a new data structure by adding some useful methods to primitive data types.
        //                This new data structure is called "Wrapper Classes"


        /*

             Primitive      Wrapper Class
              byte    ===>    Byte
              short   ===>    Short
              int     ===>    Integer
              long    ===>    Long
              float   ===>    Float
              char    ===>    Character
              double     ===> Double
              boolean ===>    Boolean
         */

        //Following one is wrapper class it has many useful methods.
        Integer age = 21;

        //Following one is primitive it does not have any method.
        int weight = 100;

        //If you use wrapper class name , you will be able to use more methods.
        System.out.println(Integer.MIN_VALUE); //-2147483648
        System.out.println(Integer.MAX_VALUE); //2147483648

        //Find the min and max value of the short data type:
        System.out.println(Short.MIN_VALUE); //-32768
        System.out.println(Short.MAX_VALUE); //32768

        //How to convert "primitive" to "wrapper":
        char ch = 'E';

        Character chWraper = ch; // Autoboxing

        //How to convert "wrapper" to "primitive":
        Boolean honda = true;

        boolean bestCar = honda; //Unboxing
    }

}