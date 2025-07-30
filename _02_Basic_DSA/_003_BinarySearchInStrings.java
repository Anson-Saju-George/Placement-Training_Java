 // _003_BinarySearchInStrings.java
// Binary Search on a sorted array of strings (case-sensitive)

import java.util.Arrays;

public class _003_BinarySearchInStrings {

    public static int binarySearch(String[] arr, String target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int comparison = arr[mid].compareTo(target);

            if (comparison == 0) return mid;
            else if (comparison < 0) start = mid + 1;
            else end = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "grape", "kiwi", "mango"};
        String target = "grape";

        int result = binarySearch(words, target);

        if (result == -1) {
            System.out.println("String not found.");
        } else {
            System.out.println("String found at index: " + result);
        }

        // Print the array
        System.out.println("Array: " + Arrays.toString(words));
    }
}
