import java.util.*;

public class MinimumSwapsSort {
    public static int minSwaps(int[] arr) {
        int n = arr.length;
        int ans = 0;

        // Pair array values with their original indices
        int[][] arrPos = new int[n][2];
        for (int i = 0; i < n; i++) {
            arrPos[i][0] = arr[i];
            arrPos[i][1] = i;
        }

        // Sort the array by value
        Arrays.sort(arrPos, Comparator.comparingInt(a -> a[0]));

        // Track visited elements
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);

        // Traverse array elements
        for (int i = 0; i < n; i++) {
            // Skip already visited or correctly placed elements
            if (visited[i] || arrPos[i][1] == i) {
                continue;
            }

            // Find the cycle size
            int cycle_size = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = arrPos[j][1];
                cycle_size++;
            }

            // If cycle size is k, we need (k - 1) swaps
            if (cycle_size > 0) {
                ans += (cycle_size - 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        // Test Case
        int[] arr = {4, 3, 2, 1, 5};
        System.out.println("Output: " + minSwaps(arr)); // Expected: 2
