// _041_InsertionSort.java
// Demonstrates Insertion Sort on an array

import java.util.Arrays;

public class _041_InsertionSort {

    // Insertion Sort algorithm
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] data = {20, 12, 10, 15, 2};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(data));

        insertionSort(data);

        System.out.println("\nSorted array:");
        System.out.println(Arrays.toString(data));
    }
}
