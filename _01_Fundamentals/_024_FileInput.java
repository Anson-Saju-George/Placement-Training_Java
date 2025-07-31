// _024_FileInput.java
// Demonstrates reading from a file using Scanner and File classes

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _024_FileInput {
    public static void main(String[] args) {

        System.out.println("=== File Reading Example ===");

        try {
            // Make sure the file exists in your working directory
            File file = new File("sample.txt"); // sample.txt must be present

            Scanner sc = new Scanner(file);

            // Read and print each line from the file
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }

            sc.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
