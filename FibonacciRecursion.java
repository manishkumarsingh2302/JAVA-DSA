public class FibonacciRecursion {

    // Recursive function to calculate nth Fibonacci number
    static int fibonacci(int n) {
        if (n <= 1) {
            return n; // base case: fib(0)=0, fib(1)=1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // recursive case
        }
    }

    public static void main(String[] args) {
        int n = 6; // find 6th Fibonacci number
        int result = fibonacci(n);
        System.out.println("Fibonacci number at position " + n + " is " + result);
    }
}
