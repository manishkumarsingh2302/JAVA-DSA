import java.util.Scanner;

public class LoopingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            // Input numbers
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            // Choose operation
            System.out.println("Choose operation: +, -, *, / ");
            char operator = scanner.next().charAt(0);

            double result;

            // Perform operation
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid operator!");
            }

            // Ask user if they want to continue
            System.out.print("Do you want to perform another calculation? (Y/N): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("Calculator closed.");
        scanner.close();
    }
}
