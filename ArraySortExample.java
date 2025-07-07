import java.util.Arrays;

public class ArraySortExample {
    public static void main(String[] args) {
        int[] numbers = {50, 20, 40, 10, 30};

        System.out.println("Original array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Sort the array in ascending order
        Arrays.sort(numbers);

        System.out.println("Sorted array in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
