// _009_MaximumElement.java
// Find the maximum element in an array

public class _009_MaximumElement {

    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] values = {15, 22, 8, 19, 45, 6};

        System.out.println("Maximum element: " + findMax(values));  // 45
    }
}
