import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Length
        System.out.println("Length: " + str.length());

        // Reverse
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println("Reversed: " + reverse);

        // Palindrome check
        if(str.equalsIgnoreCase(reverse)) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }

        // Uppercase
        System.out.pri
