// _012_BinarySearch.java
// Binary Search implementation (only works on sorted arrays)

import java.util.Arrays;

public class _012_BinarySearch {

    // Returns index of target, or -1 if not found
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 10, 14, 17, 21};
        int target = 10;

        System.out.println("Array: " + Arrays.toString(arr));

        int index = binarySearch(arr, target);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }
}
