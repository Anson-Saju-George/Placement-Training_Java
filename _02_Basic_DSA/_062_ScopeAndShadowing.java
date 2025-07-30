// _062_ScopeAndShadowing.java
public class _062_ScopeAndShadowing {

    static int globalVar = 50;  // Global variable

    public static void main(String[] args) {
        System.out.println("=== Variable Scope and Shadowing ===");

        int x = 10;
        System.out.println("Outside block, x = " + x);

        {
            int y = 20;
            int xInner = 99;  // This x is local to this block
            System.out.println("Inside block, x = " + xInner);
            System.out.println("Inside block, y = " + y);
        }

        // y is not accessible here: would cause error if used
        System.out.println("Back outside block, x = " + x);

        shadowingExample();
    }

    public static void shadowingExample() {
        System.out.println("\n=== Shadowing Example ===");

        System.out.println("Global variable before shadowing: " + globalVar);

        int globalVar = 100;  // This local variable shadows the class-level globalVar

        System.out.println("Shadowed variable inside method: " + globalVar);
    }
}
