import java.util.*;

public class AddTwoNumbersUsingArrays {
    public static int[] addTwoNumbers(int[] a, int[] b) {
        int maxLength = Math.max(a.length, b.length);
        List<Integer> result = new ArrayList<>();
        int carry = 0;

        for (int i = 0; i < maxLength; i++) {
            int x = i < a.length ? a[i] : 0;
            int y = i < b.length ? b[i] : 0;

            int sum = x + y + carry;
            result.add(sum % 10);
            carry = sum / 10;
        }

        if (carry != 0) {
            result.add(carry);
        }

        // Convert List<Integer> to int[]
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 3};  // 342
        int[] b = {5, 6, 4};  // 465

        int[] result = addTwoNumbers(a, b);  // Output should be [7, 0, 8]

        System.out.println("Result: " + Arrays.toString(result));
    }
}