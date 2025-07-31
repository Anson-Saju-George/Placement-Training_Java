// 07_Conditionals.java
// Demonstrates conditional statements in Java

import java.util.Scanner;

public class _007_Conditionals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Conditional Statements Example ===");

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Simple if
        if (num > 0) {
            System.out.println("It's a positive number.");
        }

        // if-else
        if (num % 2 == 0) {
            System.out.println("It's even.");
        } else {
            System.out.println("It's odd.");
        }

        // if-else-if ladder
        if (num < 0) {
            System.out.println("It's negative.");
        } else if (num == 0) {
            System.out.println("It's zero.");
        } else {
            System.out.println("It's positive.");
        }

        // Nested if
        if (num != 0) {
            if (num % 5 == 0) {
                System.out.println("It is divisible by 5.");
            } else {
                System.out.println("Not divisible by 5.");
            }
        }

        // Ternary operator (alternative to simple if-else)
        String status = (num >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println("Voting status: " + status);

        // Switch statement
        System.out.print("Enter a day number (1 to 7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day!");
        }

        sc.close();
    }
}
