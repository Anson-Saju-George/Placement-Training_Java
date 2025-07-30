// _053_SwitchExpression.java
// Demonstrates the enhanced switch expression in Java (Java 14+)

public class _053_SwitchExpression {
    public static void main(String[] args) {
        int day = 3;

        // Traditional switch statement
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }

        // Enhanced switch expression (Java 14+)
        String result = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Other day";
        };

        System.out.println("Day is: " + result);

        // Multiple labels with arrow
        String type = switch (day) {
            case 1, 7 -> "Weekend";
            case 2, 3, 4, 5, 6 -> "Weekday";
            default -> "Invalid";
        };

        System.out.println("Type: " + type);
    }
}
