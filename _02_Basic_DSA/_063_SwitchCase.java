// _063_SwitchCase.java
import java.util.Scanner;

public class _063_SwitchCase {
    public static void main(String[] args) {
        System.out.println("=== Switch Case Example ===");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1 to 5): ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("You entered One");
                break;
            case 2:
                System.out.println("You entered Two");
                break;
            case 3:
                System.out.println("You entered Three");
                break;
            case 4:
                System.out.println("You entered Four");
                break;
            case 5:
                System.out.println("You entered Five");
                break;
            default:
                System.out.println("Invalid input");
        }

        // Modern switch (Java 14+)
        System.out.print("Enter a character (a/b/c): ");
        char ch = sc.next().charAt(0);
        String result = switch (ch) {
            case 'a' -> "Apple";
            case 'b' -> "Banana";
            case 'c' -> "Cat";
            default -> "Unknown";
        };
        System.out.println("Result: " + result);

        sc.close();
    }
}
