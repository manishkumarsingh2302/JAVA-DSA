import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicate elements found.");
        } else {
            System.out.print("Duplicate elements: ");
            for (int dup : duplicates) {
                System.out.print(dup + " ");
            }
        }
    }
}
