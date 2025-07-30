// _013_BinarySearchRecursive.java
// Recursive Binary Search implementation

import java.util.Arrays;

public class _013_BinarySearchRecursive {

    public static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) return -1;

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) return mid;
        else if (arr[mid] < target)
            return binarySearch(arr, target, mid + 1, end);
        else
            return binarySearch(arr, target, start, mid - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 9, 13, 18, 22};
        int target = 9;

        System.out.println("Array: " + Arrays.toString(arr));

        int result = binarySearch(arr, target, 0, arr.length - 1);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
