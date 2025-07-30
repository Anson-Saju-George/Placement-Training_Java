// _078_RecursionBacktrackingIntro.java
public class _078_RecursionBacktrackingIntro {

    static void fill(int[] arr, int index, int value) {
        if (index == arr.length) {
            printArray(arr);
            return;
        }

        arr[index] = value;
        fill(arr, index + 1, value + 1);

        // Backtracking step
        arr[index] = 0;
    }

    static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[3];
        fill(arr, 0, 1);
    }
}
