// _071_FunctionReturnTypes.java
public class _071_FunctionReturnTypes {

    static String greet(String name) {
        return "Hello, " + name + "!";
    }

    static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(greet("Alice"));
        System.out.println("Area of circle with radius 3: " + circleArea(3));
        System.out.println("Is 13 prime? " + isPrime(13));
    }
}
