// _026_CommandLineArgs.java
// Demonstrates usage of command-line arguments in Java

public class _026_CommandLineArgs {
    public static void main(String[] args) {

        System.out.println("=== Command Line Arguments Example ===");

        // Check if any arguments were passed
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
            System.out.println("Usage: java _026_CommandLineArgs arg1 arg2 ...");
            return;
        }

        // Print all arguments
        System.out.println("Number of arguments: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }

        // Optional: Sum if arguments are numbers
        try {
            int sum = 0;
            for (String arg : args) {
                sum += Integer.parseInt(arg);
            }
            System.out.println("Sum of numeric arguments: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Some arguments are not integers.");
        }
    }
}
