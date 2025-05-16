package Day03Scanner;

public class C06Concatenation01 {

    //Concatenation:An operation to join Strings with Strings or to join String with other data types.
    //Symbol of concatenation is "+" sign.
    //Java will try to do additon first.

    public static void main(String[] args) {

        System.out.println("Astoria" + "Hazel"); //AstoriaHazel

        //1.Option
        System.out.println("Astoria " + "Hazel"); //Astoria Hazel

        //2.Option
        System.out.println("Astoria" + " Hazel"); //Astoria Hazel

        //3.Option
        System.out.println("Astoria" + " " + "Hazel"); //Astoria Hazel

        //Astoria34 because first come String for this doesn't take "+" as addition java takes it as concatenation
        System.out.println("Astoria" + 3 + 4); //Astoria34
        System.out.println("Astoria" + (3 + 4));//Astoria7

        //Multiplication is done before addition That is why the result is Astoria12
        System.out.println("Astoria" + 3 * 4);

        System.out.println(3 + 4 + "Astoria");//1Astoria

        System.out.println(1 * 34 + " Astoria " + 3 + 4);

    }
}