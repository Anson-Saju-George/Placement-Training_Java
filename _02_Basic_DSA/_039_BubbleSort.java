// _039_BubbleSort.java
// Demonstrates Bubble Sort on an array

import java.util.Arrays;

public class _039_BubbleSort {

    // Bubble Sort algorithm
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no two elements were swapped in the inner loop, break
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(data));

        bubbleSort(data);

        System.out.println("\nSorted array:");
        System.out.println(Arrays.toString(data));
    }
}
