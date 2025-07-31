//package Fundamentals;
import java.util.Scanner;

class _010_ReverseWordsInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Use regex to split on any number of whitespace characters
        String[] words = sentence.trim().split("\\s+");

        System.out.println("Reversed sentence:");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i != 0) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}
