// _077_RecursionArrayProblems.java
public class _077_RecursionArrayProblems {

    static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) return true;
        return arr[index] <= arr[index + 1] && isSorted(arr, index + 1);
    }

    static int sum(int[] arr, int index) {
        if (index == arr.length) return 0;
        return arr[index] + sum(arr, index + 1);
    }

    static void printReverse(int[] arr, int index) {
        if (index < 0) return;
        System.out.print(arr[index] + " ");
        printReverse(arr, index - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("Is array sorted? " + isSorted(nums, 0));
        System.out.println("Sum of array: " + sum(nums, 0));
        System.out.print("Reversed array: ");
        printReverse(nums, nums.length - 1);
    }
}
