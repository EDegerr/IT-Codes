package Day06StringManipulations;

public class C03StringManipulation {

    public static void main(String[] args) {

        /*
            Check if a password has the following conditions
            1)It should not be empty.
            2)It should not be just a single space.
            3)It should not have spaces at the beginning an at the end.
            4)'i' should be a character in the password and first appereance of 'i' should be at index 4.
            5)'K' should be a character in the password and first appereance of 'K' should be at index 5
         */

        String pwd = "HazeiKl"; //He12iK

        boolean first = pwd.isEmpty(); //isEmpty() returns true if the string is empty otherwise it returns false.
        System.out.println(first);

        boolean second = pwd.isBlank(); //isBlank() returns true if all characters is empty otherwie it returns false
                                        //Note:isBlank also turns true for empty string as well.
        System.out.println(second);

       boolean third = pwd.trim().equals(pwd);
        System.out.println(third);

       boolean fourth = pwd.indexOf("i")==4;
        System.out.println(fourth);

       boolean fifth = pwd.lastIndexOf("K")==5;
        System.out.println(fifth);

        if( !first && !second && third && fourth && fifth){
            System.out.println("The Password is valid.");
        }else{
            System.out.println("The Pasword is invalid.");
        }

        //2. Way to give message to user
        if(first){
            System.out.println("Empty password is not accepted");
        }else if(second){
            System.out.println("Password needs visible characters");
        }else if(!third){
            System.out.println("Do not use space at the beginning and at the end");
        }else if(!fourth){
            System.out.println("Fifth character should be i");
        }else if(!fifth){
            System.out.println("Sixth character should be K");
        }else{
            System.out.println("Password is valid.");
        }

        // 3.Way to give msg to user
        if (first) {
            System.out.println("Empty password is not accepted");
        }
        if (second) {
            System.out.println("Password needs visible characters");
        }
        if (!third) {
            System.out.println("Do not use space at the beginning and at the end");
        }
        if (!fourth) {
            System.out.println("Fifth character should be i");
        }
        if (!fifth) {
            System.out.println("Sixth character should be K");
        }
    }
}
