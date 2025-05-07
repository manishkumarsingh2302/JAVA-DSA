//❓ Question 1: Reverse an Array
Problem Statement:
Write a Java program to reverse the elements of an array.

What it tests:

Array traversal

Understanding of indexing and swapping elements

Example Input:
int[] arr = {1, 2, 3, 4, 5};

Expected Output:
{5, 4, 3, 2, 1}


public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int start = 0;
        int end = arr.length - 1;

        // Swap elements from start and end
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // Print reversed array
        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
