package AICodeTesting;

public class q3 {

        public static void main(String[] args) {
            // Declare and initialize a String variable
            String myString = "Hello";
            // You can change this string to test with different values
            // String myString = "Java";
            // String myString = "A"; // Test with a single character string
            // String myString = ""; // Test with an empty string

            // Check if the string is null or empty before processing
            if (myString == null || myString.isEmpty()) {
                System.out.println("The input string is empty or null. Cannot find first or last character.");
            } else {
                // Get the first character of the string
                char firstChar = myString.charAt(0);

                // Get the last character of the string
                // string.length() gives the total number of characters
                // We subtract 1 because string indices are 0-based
                char lastChar = myString.charAt(myString.length() - 1);

                // Convert the characters to their integer (ASCII) values
                int firstAsciiValue = (int) firstChar;
                int lastAsciiValue = (int) lastChar;

                // Calculate the sum of the ASCII values
                int sumOfAsciiValues = firstAsciiValue + lastAsciiValue;

                // Print the results
                System.out.println("Original String: \"" + myString + "\"");
                System.out.println("First character: '" + firstChar + "' (ASCII: " + firstAsciiValue + ")");
                System.out.println("Last character: '" + lastChar + "' (ASCII: " + lastAsciiValue + ")");
                System.out.println("Sum of ASCII values of first and last characters: " + sumOfAsciiValues);
            }
        }
    }