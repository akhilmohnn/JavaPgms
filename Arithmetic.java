import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform addition and multiplication
        double sum = num1 + num2;
        double product = num1 * num2;

        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        // Close the scanner
        scanner.close();
    }
}
