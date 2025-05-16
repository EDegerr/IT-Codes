package AICodeTesting;

public class Q4 {
    public static void main(String[] args) {
        // Test cases provided by the user and additional cases
        String testString1 = "Ali Can"; // Should be false (space is not the only one, and not strictly "middle" in a general sense, though the logic checks for exactly one space not at ends)
        String testString2 = "Hello World"; // Should be false (two spaces)
        String testString3 = " Java "; // Should be false (space at the end)
        String testString4 = "Single Space"; // Should be true (one space, not at ends)
        String testString5 = "NoSpace"; // Should be false (no spaces)
        String testString6 = " SpaceAtStart"; // Should be false (space at start)
        String testString7 = "A B"; // Should be true (one space, not at ends)
        String testString8 = "A"; // Should be false (too short)
        String testString9 = "  "; // Should be false (multiple spaces)
        String testString10 = ""; // Should be false (empty)
        String testString11 = null; // Should be false (null)

        System.out.println("Checking string: \"" + testString1 + "\" -> " + hasSingleMiddleSpace(testString1));
        System.out.println("Checking string: \"" + testString2 + "\" -> " + hasSingleMiddleSpace(testString2));
        System.out.println("Checking string: \"" + testString3 + "\" -> " + hasSingleMiddleSpace(testString3));
        System.out.println("Checking string: \"" + testString4 + "\" -> " + hasSingleMiddleSpace(testString4));
        System.out.println("Checking string: \"" + testString5 + "\" -> " + hasSingleMiddleSpace(testString5));
        System.out.println("Checking string: \"" + testString6 + "\" -> " + hasSingleMiddleSpace(testString6));
        System.out.println("Checking string: \"" + testString7 + "\" -> " + hasSingleMiddleSpace(testString7));
        System.out.println("Checking string: \"" + testString8 + "\" -> " + hasSingleMiddleSpace(testString8));
        System.out.println("Checking string: \"" + testString9 + "\" -> " + hasSingleMiddleSpace(testString9));
        System.out.println("Checking string: \"" + testString10 + "\" -> " + hasSingleMiddleSpace(testString10));
        System.out.println("Checking string: " + testString11 + " -> " + hasSingleMiddleSpace(testString11));
    }
}
