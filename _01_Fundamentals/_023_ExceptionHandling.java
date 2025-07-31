// _023_ExceptionHandling.java
// Demonstrates basic exception handling in Java

public class _023_ExceptionHandling {
    public static void main(String[] args) {

        System.out.println("=== Exception Handling Demo ===");

        try {
            int a = 10;
            int b = 0;

            // Risky operation: division by zero
            int result = a / b;

            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("General Exception caught: " + e.getMessage());
        } 
        finally {
            System.out.println("This block always runs (finally block).");
        }

        System.out.println("\nProgram continues after exception handling.");

        // Array index example
        try {
            int[] nums = {1, 2, 3};
            System.out.println(nums[5]);  // Invalid index
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e);
        }

        // Null pointer example
        try {
            String str = null;
            System.out.println(str.length());  // NullPointerException
        } 
        catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
        }
    }
}
