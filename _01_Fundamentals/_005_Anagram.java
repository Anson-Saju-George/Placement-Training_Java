//package Fundamentals;
import java.util.Scanner;

class _005_Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Remove whitespace and convert to lowercase (optional)
        str1 = str1.replace(" ", "").toLowerCase();
        str2 = str2.replace(" ", "").toLowerCase();

        // Check length first
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams (Different lengths)");
        } else {
            int[] freq1 = new int[26]; // Frequency for str1
            int[] freq2 = new int[26]; // Frequency for str2

            // Count character frequency of str1
            for (int i = 0; i < str1.length(); i++) {
                char ch = str1.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    freq1[ch - 'a']++;
                }
            }

            // Count character frequency of str2
            for (int i = 0; i < str2.length(); i++) {
                char ch = str2.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    freq2[ch - 'a']++;
                }
            }

            // Compare frequency arrays
            boolean isAnagram = true;
            for (int i = 0; i < 26; i++) {
                if (freq1[i] != freq2[i]) {
                    isAnagram = false;
                    break;
                }
            }

            if (isAnagram) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        }

        sc.close();
    }
}
