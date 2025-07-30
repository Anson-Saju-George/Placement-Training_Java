// _017_SwapAlternate.java
// Swaps alternate elements in an array (0↔1, 2↔3, ...)

import java.util.Arrays;
import java.util.Scanner;

public class _017_SwapAlternate {
    public static void swapAlternate(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            // Swap adjacent elements
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Original Array: " + Arrays.toString(arr));
        swapAlternate(arr);
        System.out.println("After Swapping Alternates: " + Arrays.toString(arr));

        sc.close();
    }
}
