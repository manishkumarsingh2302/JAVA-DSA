public class FibonacciRecursion3 {

    // Recursive method to get nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) return 0;       // base case
        if (n == 1) return 1;       // base case
        return fibonacci(n - 1) + fibonacci(n - 2); // recursive call
    }

    public static void main(String[] args) {
        int n = 10; // Number of terms

        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
