// _008_SearchInRange.java
// Linear search in a specific range of indices

public class _008_SearchInRange {

    public static int searchInRange(int[] arr, int target, int start, int end) {
        if (arr == null || start < 0 || end >= arr.length || start > end) return -1;

        for (int i = start; i <= end; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10, 12};
        int target1 = 10;
        int target2 = 5;

        System.out.println("Found at index: " + searchInRange(nums, target1, 2, 5)); // 4
        System.out.println("Found at index: " + searchInRange(nums, target2, 1, 3)); // -1
    }
}
