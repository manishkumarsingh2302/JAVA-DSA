public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 21, 7, 33, 4};
        int max = arr[0];  // Assume first element is the max

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  // Update max if current element is greater
            }
        }

        System.out.println("Maximum element is: " + max);
    }
}
