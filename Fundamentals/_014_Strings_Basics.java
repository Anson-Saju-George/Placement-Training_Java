// _014_Strings_Basics.java
// Demonstrates basic string operations in Java

public class _014_Strings_Basics {
    public static void main(String[] args) {
        System.out.println("=== String Basics ===");

        // Creating strings
        String s1 = "Hello";
        String s2 = new String("World");

        // String concatenation
        String result = s1 + " " + s2 + "!";
        System.out.println("Concatenated: " + result);

        // Length of a string
        System.out.println("Length of result: " + result.length());

        // Accessing characters
        System.out.println("First character: " + result.charAt(0));
        System.out.println("Last character: " + result.charAt(result.length() - 1));

        // Comparing strings
        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println("a == b? " + (a == b));           // true (same reference)
        System.out.println("a == c? " + (a == c));           // false (different reference)
        System.out.println("a.equals(c)? " + a.equals(c));   // true (same content)

        // Case conversion
        System.out.println("Uppercase: " + result.toUpperCase());
        System.out.println("Lowercase: " + result.toLowerCase());

        // Trimming spaces
        String spaced = "   Hello World   ";
        System.out.println("Trimmed: '" + spaced.trim() + "'");

        // Substring
        System.out.println("Substring(0,5): " + result.substring(0, 5));
        System.out.println("Substring from index 6: " + result.substring(6));

        // Checking prefix/suffix
        System.out.println("Starts with 'Hel': " + result.startsWith("Hel"));
        System.out.println("Ends with '!': " + result.endsWith("!"));

        // Contains and indexOf
        System.out.println("Contains 'lo Wo': " + result.contains("lo Wo"));
        System.out.println("Index of 'World': " + result.indexOf("World"));
    }
}
