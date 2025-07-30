// _072_FunctionScope.java
public class _072_FunctionScope {

    static void scopeExample() {
        int localVar = 100;
        System.out.println("Inside function, localVar = " + localVar);
    }

    public static void main(String[] args) {
        int localVar = 50;
        System.out.println("In main, localVar = " + localVar);

        scopeExample();

        // Uncommenting this will cause an error: localVar cannot be resolved
        // System.out.println("Trying to access function variable: " + localVar);
    }
}
