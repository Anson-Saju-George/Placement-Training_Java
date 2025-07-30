// _042_QuickSort.java
// Demonstrates Quick Sort algorithm

import java.util.Arrays;

public class _042_QuickSort {

    // Partition function using Lomuto partition scheme
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // last element as pivot
        int i = low - 1;  // index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and pivot
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // pivot index
    }

    // QuickSort recursive function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // pi is partitioning index
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] data = {30, 10, 80, 90, 40, 50, 70};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(data));

        quickSort(data, 0, data.length - 1);

        System.out.println("\nSorted array:");
        System.out.println(Arrays.toString(data));
    }
}
