// _045_CycleSort.java
// Demonstrates Cycle Sort (Best for minimizing number of writes)

import java.util.Arrays;

public class _045_CycleSort {

    public static void cycleSort(int[] arr) {
        int n = arr.length;

        for (int cycleStart = 0; cycleStart < n - 1; cycleStart++) {
            int item = arr[cycleStart];
            int pos = cycleStart;

            // Find the correct position for the current item
            for (int i = cycleStart + 1; i < n; i++) {
                if (arr[i] < item) {
                    pos++;
                }
            }

            // If item is already in the correct position, continue
            if (pos == cycleStart) continue;

            // Skip duplicates
            while (item == arr[pos]) {
                pos++;
            }

            // Put item in correct position
            if (pos != cycleStart) {
                int temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }

            // Rotate the rest of the cycle
            while (pos != cycleStart) {
                pos = cycleStart;

                for (int i = cycleStart + 1; i < n; i++) {
                    if (arr[i] < item) {
                        pos++;
                    }
                }

                while (item == arr[pos]) {
                    pos++;
                }

                int temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));

        cycleSort(arr);

        System.out.println("\nSorted array:");
        System.out.println(Arrays.toString(arr));
    }
}
