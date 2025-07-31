//package Fundamentals;
import java.util.Scanner;

public class _017_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size, pos, data;

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        size = sc.nextInt();

        int[] a = new int[size];
        int[] b = new int[size + 1]; // New array with one extra element

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        // Input the position to insert (1-based index)
        System.out.print("Enter the position to insert (1 to " + (size + 1) + "): ");
        pos = sc.nextInt();

        // Validate position
        if (pos < 1 || pos > size + 1) {
            System.out.println("Invalid position!");
            return;
        }

        // Input the data to insert
        System.out.print("Enter the data to insert: ");
        data = sc.nextInt();

        // Insert logic
        int i, j;
        for (i = 0, j = 0; i < b.length; i++) {
            if (i == pos - 1) {
                b[i] = data;
            } else {
                b[i] = a[j];
                j++;
            }
        }

        // Output the new array
        System.out.println("Array after insertion:");
        for (int val : b) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}
