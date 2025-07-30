// _010_MinimumElement.java
// Find the minimum element in an array

public class _010_MinimumElement {

    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] values = {15, 22, 8, 19, 45, 6};

        System.out.println("Minimum element: " + findMin(values));  // 6
    }
}
