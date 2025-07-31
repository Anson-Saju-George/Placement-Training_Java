//package Fundamentals;
import java.util.Scanner;

class _010_RemoveDuplicatesFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Frequency array for ASCII (assuming only lowercase/uppercase letters)
        int[] freq = new int[256];

        System.out.print("String after removing duplicates: ");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // If character has not occurred before, print and mark it
            if (freq[ch] == 0) {
                System.out.print(ch);
                freq[ch] = 1;
            }
        }

        sc.close();
    }
}
