import java.util.Scanner;

public class partice3 {
     public static void main(String[] args) {
        // Create a scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read string input
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read integer input
        
        // Output a personalized message
        System.out.println("Hello " + name + "! Next year, you will be " + (age + 1) + " years old.");
        
        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
