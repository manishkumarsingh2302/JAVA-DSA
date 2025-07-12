public class TowerOfHanoi {

    // Recursive function to solve Tower of Hanoi puzzle
    public static void solveHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            // Base case: Only one disk
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Step 1: Move n-1 disks from source to auxiliary
        solveHanoi(n - 1, source, destination, auxiliary);

        // Step 2: Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Step 3: Move n-1 disks from auxiliary to destination
        solveHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int numberOfDisks = 3;

        System.out.println("Tower of Hanoi solution for " + numberOfDisks + " disks:\n");
        solveHanoi(numberOfDisks, 'A', 'B', 'C'); // A=source, B=auxiliary, C=destination
    }
}
