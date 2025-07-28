//package Fundamentals;
import java.util.*;

public class _004_Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        int[] freq = new int[256]; // ASCII range

        // Count frequency of each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            freq[ch]++;
        }

        System.out.println("Character Frequencies:");
        for (int i = 0; i < 127; i++) {
            if (freq[i] > 0) {
                System.out.println("'" + (char)i + "' occurs " + freq[i] + " time(s)");
            }
        }

        sc.close();
    }
}
