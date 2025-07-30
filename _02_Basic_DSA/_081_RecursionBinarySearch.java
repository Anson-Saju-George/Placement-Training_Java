// _081_RecursionBinarySearch.java
public class _081_RecursionBinarySearch {

    static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == target) return mid;
        if (arr[mid] > target)
            return binarySearch(arr, target, low, mid - 1);
        else
            return binarySearch(arr, target, mid + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 12, 19, 23, 31};
        int target = 19;
        int index = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println("Element found at index: " + index);
    }
}
