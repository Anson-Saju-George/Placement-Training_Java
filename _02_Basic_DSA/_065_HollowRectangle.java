// _065_HollowRectangle.java
// Print a hollow rectangle pattern

public class _065_HollowRectangle {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 10;

        System.out.println("Hollow Rectangle Pattern:");

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                // Print * at borders, space otherwise
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
