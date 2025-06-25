import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Operator
        System.out.println("Choose operation (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        // Result
        double result = 0;

        if (op == '+') {
            result = num1 + num2;
        } else if (op == '-') {
            result = num1 - num2;
        } else if (op == '*') {
            result = num1 * num2;
        } else if (op == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error! Division by zero.");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Invalid operator!");
            scanner.close();
            return;
        }

        // Output
        System.out.println("Result: " + result);

        scanner.close();
    }
}
