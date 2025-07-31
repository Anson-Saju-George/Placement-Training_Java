// _015_Strings_Manipulation.java
// Demonstrates advanced string manipulations in Java

public class _015_Strings_Manipulation {
    public static void main(String[] args) {
        System.out.println("=== String Manipulation ===");

        String sentence = "Java is a powerful programming language.";

        // Replace
        String replaced = sentence.replace("powerful", "versatile");
        System.out.println("Replaced: " + replaced);

        // Split into words
        String[] words = sentence.split(" ");
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }

        // Join strings
        String joined = String.join(" | ", words);
        System.out.println("Joined with '|': " + joined);

        // Reversing a string
        String original = "Hello";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        // Palindrome check
        String pal = "madam";
        boolean isPalindrome = pal.equals(new StringBuilder(pal).reverse().toString());
        System.out.println("Is '" + pal + "' a palindrome? " + isPalindrome);

        // Convert to char array and manipulate
        char[] chars = sentence.toCharArray();
        System.out.print("Characters: ");
        for (char ch : chars) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // StringBuilder usage
        StringBuilder sb = new StringBuilder();
        sb.append("Java");
        sb.append(" is");
        sb.append(" cool!");
        System.out.println("StringBuilder result: " + sb.toString());

        // Delete and insert with StringBuilder
        sb.delete(4, 7);  // removes " is"
        sb.insert(4, " and Python are"); 
        System.out.println("Modified StringBuilder: " + sb.toString());
    }
}
