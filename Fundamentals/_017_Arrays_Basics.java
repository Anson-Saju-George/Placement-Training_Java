// _017_Arrays_Basics.java
// Covers basic array creation, initialization, and traversal

public class _017_Arrays_Basics {
    public static void main(String[] args) {
        System.out.println("=== Arrays Basics ===");

        // Declaration and initialization
        int[] numbers = new int[5]; // default 0s
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Another way (inline)
        int[] marks = {85, 90, 78, 92, 88};

        // Accessing elements
        System.out.println("First number: " + numbers[0]);
        System.out.println("Last mark: " + marks[marks.length - 1]);

        // Length of array
        System.out.println("Length of marks array: " + marks.length);

        // Traversal with for loop
        System.out.println("\nMarks using for loop:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Index " + i + ": " + marks[i]);
        }

        // Traversal with for-each
        System.out.println("\nNumbers using for-each loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Sum and Average
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double avg = (double) sum / marks.length;
        System.out.println("\nTotal Marks: " + sum);
        System.out.println("Average Marks: " + avg);
    }
}
