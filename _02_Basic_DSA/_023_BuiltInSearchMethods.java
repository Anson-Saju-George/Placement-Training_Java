// _023_BuiltInSearchMethods.java
// Demonstrates binary search using built-in Arrays.binarySearch()

import java.util.Arrays;
import java.util.Scanner;

public class _023_BuiltInSearchMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        // Must be sorted for binary search
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, key);

        if (index >= 0) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}
