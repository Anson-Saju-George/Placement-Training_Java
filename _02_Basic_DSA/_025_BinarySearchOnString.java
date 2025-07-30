// _025_BinarySearchOnString.java
// Binary search on a sorted array of strings

import java.util.Arrays;
import java.util.Scanner;

public class _025_BinarySearchOnString {
    public static int binarySearch(String[] arr, String key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int compare = arr[mid].compareToIgnoreCase(key);

            if (compare == 0) {
                return mid;
            } else if (compare < 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] words = new String[n];
        System.out.println("Enter " + n + " words (unsorted):");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        Arrays.sort(words);  // must be sorted for binary search
        System.out.println("Sorted words: " + Arrays.toString(words));

        System.out.print("Enter word to search: ");
        String key = sc.nextLine();

        int index = binarySearch(words, key);
        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Word not found.");
        }

        sc.close();
    }
}
