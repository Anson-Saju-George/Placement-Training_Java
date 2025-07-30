// _044_CountingSort.java
// Demonstrates Counting Sort algorithm (non-negative integers only)

import java.util.Arrays;

public class _044_CountingSort {

    public static void countingSort(int[] arr) {
        if (arr.length == 0) return;

        // Find max element
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }

        // Create count array
        int[] count = new int[max + 1];

        // Count occurrences
        for (int num : arr) {
            count[num]++;
        }

        // Rebuild the sorted array
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i]-- > 0) {
                arr[index++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));

        countingSort(arr);

        System.out.println("\nSorted array:");
        System.out.println(Arrays.toString(arr));
    }
}
