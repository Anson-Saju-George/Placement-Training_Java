// _043_MergeSort.java
// Demonstrates Merge Sort algorithm

import java.util.Arrays;

public class _043_MergeSort {

    // Merges two subarrays of arr[]
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;  // size of left subarray
        int n2 = right - mid;     // size of right subarray

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        // Merge the temp arrays back into arr[]
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    // MergeSort recursive function
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find middle
            int mid = (left + right) / 2;

            // Sort both halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge sorted halves
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array:");
        System.out.println(Arrays.toString(arr));
    }
}
