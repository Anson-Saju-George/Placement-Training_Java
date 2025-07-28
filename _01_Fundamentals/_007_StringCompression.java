//package Fundamentals;
import java.util.Scanner;

class _007_StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "aaabbcccdeeefffffffffffaaaa!!!!";
        String result = "";
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result += str.charAt(i - 1);
                if (count > 1) {
                    result += count;
                }
                count = 1;
            }
        }

        // Add last character and count
        result += str.charAt(str.length() - 1);
        if (count > 1) {
            result += count;
        }

        // Output
        System.out.println("Compressed string: " + result);
        sc.close();
    }
}
