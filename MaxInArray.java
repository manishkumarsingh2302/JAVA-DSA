//Question 2: Find the Largest Element in an Array


public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {7, 2, 10, 4};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum value in array: " + max);
    }
}
