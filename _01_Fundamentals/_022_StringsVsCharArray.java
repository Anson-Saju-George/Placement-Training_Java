// _022_StringsVsCharArray.java
// Demonstrates the difference between Strings and character arrays in Java

public class _022_StringsVsCharArray {
    public static void main(String[] args) {

        System.out.println("=== String vs Char Array ===");

        // Using String
        String str = "HelloWorld";
        System.out.println("String: " + str);
        System.out.println("Character at index 1: " + str.charAt(1));
        System.out.println("Length of String: " + str.length());

        // Convert to char array
        char[] charArr = str.toCharArray();
        System.out.print("Char Array: ");
        for (char c : charArr) {
            System.out.print(c + " ");
        }

        // Modify using char array
        charArr[0] = 'J';  // change H to J
        System.out.print("\nModified Char Array: ");
        for (char c : charArr) {
            System.out.print(c + " ");
        }

        // Strings are immutable: original string is not changed
        System.out.println("\nOriginal String remains: " + str);

        // Create new string from modified char array
        String newStr = new String(charArr);
        System.out.println("New String from char array: " + newStr);

        // Mutable vs Immutable
        System.out.println("\nStrings are immutable, char[] is mutable.");
    }
}
