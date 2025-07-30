// _007_CharacterSearch.java
// Search for a character in a string and return its index (first occurrence)

public class _007_CharacterSearch {

    public static int searchChar(String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return i;
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        String text = "placement";
        char target1 = 'e';
        char target2 = 'z';

        System.out.println("Index of '" + target1 + "': " + searchChar(text, target1)); // 5
        System.out.println("Index of '" + target2 + "': " + searchChar(text, target2)); // -1
    }
}
