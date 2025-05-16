package AICodeTesting;

public class Q1 {
    public static void main(String[] args){
        String str = "Java is a programming language";

        // Task 1: Print the index of the first occurrence of character 'a'
        System.out.println("Task 1: " + str.indexOf('a'));

        // Task 2: Print the index of the first occurrence of the substring "Java"
        System.out.println("Task 2: " + str.indexOf("Java"));

        // Task 3: Print the index of the first occurrence of character 'a', starting from index 4
        System.out.println("Task 3: " + str.indexOf('a', 4));

        // Task 4: Print the index of the first occurrence of the substring "va", starting from index 2
        System.out.println("Task 4: " + str.indexOf("va", 2));
    }
}