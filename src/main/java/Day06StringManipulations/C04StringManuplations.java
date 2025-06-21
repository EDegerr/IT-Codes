package Day06StringManipulations;

public class C04StringManuplations {

    public static void main(String[] args){

        // Example 5
        //              String shirtPrice ="$12,99"
        //              String bookPrice ="$35,99"
        //              Type code the sum of the shirt and book price

        String shirtPrice ="$12,99";
        String bookPrice ="$35,99";

        //1.Step remove any symbols expect "Digits" and "."
        String newShirtPrice = shirtPrice.replaceAll("[^0-9,]" , "");
        System.out.println(newShirtPrice);

        String newBookPrice = bookPrice.replaceAll("[^0-9,]","");
        System.out.println(newBookPrice);


    }

}
