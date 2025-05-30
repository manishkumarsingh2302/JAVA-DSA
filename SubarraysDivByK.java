import java.util.*;

public class SubarraysDivByK {
    public static int countSubarraysDivByK(int[] arr, int k) {
        Map<Integer, Integer> modCount = new HashMap<>();
        modCount.put(0, 1); // prefix sum % k == 0
        
        int prefixSum = 0, count = 0;

        for (int num : arr) {
            prefixSum += num;
            int mod = ((prefixSum % k) + k) % k;  // handle negative mods

            count += modCount.getOrDefault(mod, 0);
            modCount.put(mod, modCount.getOrDefault(mod, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        // Test Case
        int[] arr = {4, 5, 0, -2, -3};
        int k = 5;
        System.out.println("Output: " + countSubarraysDivByK(arr, k)); // Expected: 7
    }
}
