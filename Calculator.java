import java.util.Scanner;

public class Calculator {

    public void Addition(int a, int b) {
        System.out.println("Result is: " + (a + b));
    }

    public void Subtract(int a, int b) {
        System.out.println("Result is: " + (a - b));
    }

    public void Division(int a, int b) {
        if (b != 0) {
            System.out.println("Result is: " + ((double) a / b));
        } else {
            System.out.println("Error: cannot divide by zero");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        while (true) {
            System.out.println("Enter your choice:");
            System.out.println("1. Addition");
            System.out.println("2. Subtract");
            System.out.println("3. Division");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("Exiting!!!!");
                break;
            }
            if (choice < 1 || choice > 3) {
                System.out.println("Invalid Choice!!! Exiting....");
                break;
            }

            System.out.println("Enter 1st number:");
            int num1 = sc.nextInt();
            System.out.println("Enter 2nd number:");
            int num2 = sc.nextInt();

            if (choice == 1) {
                calc.Addition(num1, num2);
            } else if (choice == 2) {
                calc.Subtract(num1, num2);
            } else if (choice == 3) {
                calc.Division(num1, num2);
            } 
        }

        sc.close();
    }
}
