// _016_Strings_Advanced.java
// Covers advanced methods and utilities in String and StringBuilder

public class _016_Strings_Advanced {
    public static void main(String[] args) {
        System.out.println("=== Advanced String Methods ===");

        String s = "   Java Programming Language   ";

        // Trim
        String trimmed = s.trim();
        System.out.println("Trimmed: '" + trimmed + "'");

        // To Upper / Lower
        System.out.println("Uppercase: " + trimmed.toUpperCase());
        System.out.println("Lowercase: " + trimmed.toLowerCase());

        // Substring
        String sub = trimmed.substring(5, 16); // from index 5 to 15
        System.out.println("Substring (5–15): " + sub);

        // Contains
        System.out.println("Contains 'Programming'? " + trimmed.contains("Programming"));

        // StartsWith / EndsWith
        System.out.println("Starts with 'Java'? " + trimmed.startsWith("Java"));
        System.out.println("Ends with 'Language'? " + trimmed.endsWith("Language"));

        // IndexOf / LastIndexOf
        System.out.println("First index of 'a': " + trimmed.indexOf('a'));
        System.out.println("Last index of 'a': " + trimmed.lastIndexOf('a'));

        // Equals vs equalsIgnoreCase
        String a = "Java";
        String b = "java";
        System.out.println("Equals: " + a.equals(b));
        System.out.println("Equals Ignore Case: " + a.equalsIgnoreCase(b));

        // CompareTo
        System.out.println("CompareTo (Java vs java): " + a.compareTo(b)); // Lexicographic comparison

        // ReplaceAll using Regex
        String dirty = "Java123 is 456fun!";
        String cleaned = dirty.replaceAll("[0-9]", ""); // remove all digits
        System.out.println("Cleaned: " + cleaned);

        // Split with regex (split on spaces and digits)
        String[] parts = dirty.split("[0-9 ]+");
        System.out.println("Split using regex:");
        for (String part : parts) {
            System.out.println(part);
        }

        // StringBuilder capacity and efficiency
        StringBuilder sb = new StringBuilder(50);
        sb.append("Efficient ");
        sb.append("String ");
        sb.append("Manipulation");
        System.out.println("StringBuilder with capacity 50: " + sb.toString());
        System.out.println("Capacity: " + sb.capacity());

        // Insert, Delete, Replace
        sb.insert(10, "Java ");
        sb.replace(0, 9, "Fast ");
        sb.delete(20, 32);
        System.out.println("Modified SB: " + sb.toString());
    }
}
