// _006_FloorOfNumber.java
// Find the floor of a target number in a sorted array
// The floor is the greatest element smaller than or equal to the target

public class _006_FloorOfNumber {

    public static int findFloor(int[] arr, int target) {
        if (target < arr[0]) return -1; // No floor possible

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return arr[mid];
            else if (arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }

        return arr[end]; // end will point to the floor
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};

        int target1 = 9;
        int target2 = 1;

        System.out.println("Floor of " + target1 + ": " + findFloor(arr, target1)); // 8
        System.out.println("Floor of " + target2 + ": " + findFloor(arr, target2)); // -1
    }
}
