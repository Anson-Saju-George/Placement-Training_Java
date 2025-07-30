// _026_LowerBoundUpperBound.java
// Demonstrates lower bound and upper bound using binary search

import java.util.Arrays;
import java.util.Scanner;

public class _026_LowerBoundUpperBound {

    public static int lowerBound(int[] arr, int key) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < key)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }

    public static int upperBound(int[] arr, int key) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] <= key)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter value to find bounds: ");
        int key = sc.nextInt();

        int lb = lowerBound(arr, key);
        int ub = upperBound(arr, key);

        System.out.println("Lower Bound Index: " + lb);
        System.out.println("Upper Bound Index: " + ub);

        sc.close();
    }
}
