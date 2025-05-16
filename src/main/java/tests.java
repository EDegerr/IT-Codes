public class tests {

    public static void main(String[] args) {

        String s = "Java is Java";

        System.out.println(s.indexOf("Java"));
        //Prints 0 on the console

        System.out.println(s.indexOf("va,2"));
        // Prints 10 on the console

        System.out.println(s.indexOf('a'));
        //prints 2 on the console

        System.out.println(s.indexOf('a', 4));
        //prints 10 on the console,

        System.out.println(s.toLowerCase().lastIndexOf("j")); //prints 8 on the console

        System.out.println(s.toUpperCase().lastIndexOf("V")); //prints -1 on the console

        System.out.println(s.lastIndexOf('v')); //prints 11 on the console


    }
}
