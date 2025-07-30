// _079_SubsetsRecursion.java
public class _079_SubsetsRecursion {

    static void generateSubsets(String str, int index, String current) {
        if (index == str.length()) {
            System.out.println(current);
            return;
        }

        // Include current character
        generateSubsets(str, index + 1, current + str.charAt(index));

        // Exclude current character
        generateSubsets(str, index + 1, current);
    }

    public static void main(String[] args) {
        String input = "abc";
        generateSubsets(input, 0, "");
    }
}
