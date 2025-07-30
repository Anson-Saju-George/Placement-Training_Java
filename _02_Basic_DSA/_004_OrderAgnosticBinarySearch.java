// _004_OrderAgnosticBinarySearch.java
// Binary Search that works for both ascending and descending sorted arrays

public class _004_OrderAgnosticBinarySearch {

    public static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            if (isAscending) {
                if (target < arr[mid]) end = mid - 1;
                else start = mid + 1;
            } else {
                if (target > arr[mid]) end = mid - 1;
                else start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] ascArr = {1, 3, 5, 7, 9, 11};
        int[] descArr = {20, 15, 10, 5, 0, -5};

        int ascResult = orderAgnosticBS(ascArr, 7);
        int descResult = orderAgnosticBS(descArr, 5);

        System.out.println("Ascending Array Index: " + ascResult); // 3
        System.out.println("Descending Array Index: " + descResult); // 3
    }
}
