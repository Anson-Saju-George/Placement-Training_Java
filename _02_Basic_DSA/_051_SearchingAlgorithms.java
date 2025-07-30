// _051_SearchingAlgorithms.java
// Demonstrates Linear Search and Binary Search in Java

import java.util.Arrays;

public class _051_SearchingAlgorithms {

    // Linear Search
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    // Binary Search (array must be sorted)
    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 6, 2, 9, 1};
        int key = 6;

        System.out.println("Array: " + Arrays.toString(arr));

        int linIndex = linearSearch(arr, key);
        System.out.println("Linear Search: Element " + key + " found at index " + linIndex);

        Arrays.sort(arr);  // Binary Search needs sorted array
        int binIndex = binarySearch(arr, key);
        System.out.println("Binary Search (on sorted array): Element " + key + " found at index " + binIndex);
    }
}
