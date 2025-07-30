// _005_CeilingOfNumber.java
// Find the ceiling of a target number in a sorted array
// The ceiling is the smallest element greater than or equal to the target

public class _005_CeilingOfNumber {

    public static int findCeiling(int[] arr, int target) {
        if (target > arr[arr.length - 1]) return -1; // No ceiling possible

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return arr[mid];
            else if (arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }

        return arr[start]; // start will point to the ceiling
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};

        int target1 = 5;
        int target2 = 13;

        System.out.println("Ceiling of " + target1 + ": " + findCeiling(arr, target1)); // 6
        System.out.println("Ceiling of " + target2 + ": " + findCeiling(arr, target2)); // -1
    }
}
