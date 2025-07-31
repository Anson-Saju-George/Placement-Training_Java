// 04_Comments.java
// Demonstrates different types of comments in Java

/**
 * This is a JavaDoc comment.
 * It is used to document the class or methods in detail.
 * JavaDoc comments are processed by the javadoc tool to generate documentation.
 */
public class _004_Comments {

    public static void main(String[] args) {

        // This is a single-line comment
        System.out.println("Single-line comments use //"); // This as well

        /*
         * This is a multi-line comment.
         * It can span across multiple lines.
         * Often used for explaining longer blocks of code.
         */
        System.out.println("Multi-line comments use /* ... */");

        // You can also comment out lines of code
        // System.out.println("This line is commented out and won't run");

        System.out.println("JavaDoc comments are for generating documentation");
    }

}
