// _068_CharacterPatterns.java
public class _068_CharacterPatterns {
    public static void main(String[] args) {
        int n = 5;

        // Alphabet triangle
        System.out.println("Alphabet Triangle:");
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

        // Same char in row
        System.out.println("\nRepeated Alphabet Rows:");
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
