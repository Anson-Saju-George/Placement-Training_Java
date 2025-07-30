// _037_BinarySearch.java
// Demonstrates Binary Search on a sorted array

public class _037_BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        int[] sortedArray = {3, 6, 8, 10, 14, 18, 21, 24, 30};
        int target = 18;

        int index = binarySearch(sortedArray, target);

        if (index != -1)
            System.out.println("Element " + target + " found at index " + index);
        else
            System.out.println("Element not found in the array.");
    }
}
