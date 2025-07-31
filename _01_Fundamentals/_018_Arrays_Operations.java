// _018_Arrays_Operations.java
// Demonstrates common array operations like max, min, reverse, sorting, and copying

import java.util.Arrays;

public class _018_Arrays_Operations {
    public static void main(String[] args) {
        System.out.println("=== Array Operations ===");

        int[] arr = {5, 2, 9, 1, 7, 3};

        // 1. Finding Max and Min
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        // 2. Reversing an array
        System.out.println("\nOriginal array: " + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));

        // 3. Sorting the array
        Arrays.sort(arr);
        System.out.println("\nSorted array (asc): " + Arrays.toString(arr));

        // 4. Copying an array
        int[] copied = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied array: " + Arrays.toString(copied));

        // 5. Sum of all elements
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        System.out.println("Sum of elements: " + sum);

        // 6. Average
        double avg = (double) sum / arr.length;
        System.out.printf("Average: %.2f\n", avg);
    }

    // Method to reverse an array in-place
    public static void reverseArray(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            // swap
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
