// _014_LinearSearch.java
// Linear Search in an array

import java.util.Scanner;

public class _014_LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {5, 3, 7, 9, 1, 4};
        System.out.print("Enter number to search: ");
        int key = sc.nextInt();

        int index = linearSearch(numbers, key);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}
