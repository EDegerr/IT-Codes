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

        String s2 = "Java is Java";

        System.out.println(s2.toLowerCase().lastIndexOf("j")); //prints 8 on the console

        System.out.println(s2.toUpperCase().lastIndexOf("V")); //prints -1 on the console

        System.out.println(s2.lastIndexOf('v')); //prints 11 on the console

        System.out.println(s2.lastIndexOf("va")); //prints 10 on the console

        String str1 = "";
        System.out.println(str1.isEmpty());

        String str2 = "Hello";
        System.out.println(str2.isEmpty());

        String str3 = " ";
        System.out.println(str3.isBlank());

        String str4 = null;
        System.out.println(str4.isBlank());
    }
}
