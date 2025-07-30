// _040_SelectionSort.java
// Demonstrates Selection Sort on an array

import java.util.Arrays;

public class _040_SelectionSort {

    // Selection Sort algorithm
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element in remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap if needed
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {29, 10, 14, 37, 13};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(data));

        selectionSort(data);

        System.out.println("\nSorted array:");
        System.out.println(Arrays.toString(data));
    }
}
