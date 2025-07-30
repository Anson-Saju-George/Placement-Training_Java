// _001_LinearSearch.java
// Basic implementation of Linear Search in Java

public class _001_LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i; // target found at index i
        }
        return -1; // target not found
    }

    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 1, 9, 3};
        int target = 9;

        int result = linearSearch(numbers, target);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}

